package com.eeit45.champion.vegetarian.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import com.eeit45.champion.vegetarian.model.Forum;

public class ForumRowMapper implements RowMapper<Forum> {

	@Override
	public Forum mapRow(ResultSet rs, int rowNum) throws SQLException {
		Forum forum = new Forum();
		
		forum.setForumId(rs.getInt("forumId"));
		
		Timestamp forumCreateTime = rs.getTimestamp("forumCreateTime");
		forum.setForumCreateTime(forumCreateTime);
		
		Timestamp forumUpdateTime = rs.getTimestamp("forumUpdateTime");
		forum.setForumUpdateTime(forumUpdateTime);
		
		forum.setForumTitle(rs.getString("forumTitle"));
		forum.setForumContent(rs.getString("forumContent"));

		
		return forum;
	}

}
