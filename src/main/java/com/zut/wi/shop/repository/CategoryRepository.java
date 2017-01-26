package com.zut.wi.shop.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.zut.wi.shop.domian.Category;

@Component
public class CategoryRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Category save(Category category){
		String q;
		if(category.getSubcategory() == null){
			q = "insert into category(name) "
					+ "values('" + category.getName()
					+ "')";
		} else {
			q = "insert into category(name,subcategory_id) "
					+ "values('" + category.getName() + "','" + category.getSubcategory().getId()
					+ "')";
		}
		
		final String query = q;
		
		KeyHolder holder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
		    @Override
		    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		        PreparedStatement statement = con.prepareStatement(query.toString(), Statement.RETURN_GENERATED_KEYS);
		        return statement;
		    }
		}, holder);
		
		category.setId( (int) holder.getKey().longValue() );
		
		return category;
	}
	
	public List<Category> findAll() {
		String sql = "SELECT * FROM category";

		List<Category> category = jdbcTemplate.query(sql, new RowMapper<Category>() {
			public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
				Category category = new Category();
				category.setId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				//Category.setModel(rs.getString("model"));

				return category;
			}
		});

		return category;
	}
}
