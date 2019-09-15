package com.yasser.itblocktask.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yasser.itblocktask.entity.StatisticsData;

@RestController
@RequestMapping("/statics")
public class StatisticsController {

	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/allEmpDept")
	public List<StatisticsData> allEmpDept() {
		return jdbc.query("select d.id ,d.name , count(e.name)  from department as d left join employee as e "
				+ "on e.dept_id = d.id group by d.id;", new ResultSetExtractor<List<StatisticsData>>() {
					@Override
					public List<StatisticsData> extractData(ResultSet rs) throws SQLException, DataAccessException {

						List<StatisticsData> list = new ArrayList<StatisticsData>();
						while (rs.next()) {
							StatisticsData e = new StatisticsData();
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setCount(rs.getInt(3));
							list.add(e);
						}
						return list;
					}
				});
	}

	@RequestMapping("/empOnlyDept")
	public List<StatisticsData> empOnlyDept() {
		return jdbc.query("select d.id ,d.name , count(e.name) from department as d  inner join employee as e "
				+ "on e.dept_id = d.id group by d.id;", new ResultSetExtractor<List<StatisticsData>>() {
					@Override
					public List<StatisticsData> extractData(ResultSet rs) throws SQLException, DataAccessException {

						List<StatisticsData> list = new ArrayList<StatisticsData>();
						while (rs.next()) {
							StatisticsData e = new StatisticsData();
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setCount(rs.getInt(3));
							list.add(e);
						}
						return list;
					}
				});
	}

	@RequestMapping("/deptNoneEmp")
	public List<StatisticsData> deptNoneEmp() {
		return jdbc.query(
				"select d.id ,d.name , count(e.name) from department as d left join employee as e "
						+ "on e.dept_id = d.id where e.dept_id is  null group by d.id",
				new ResultSetExtractor<List<StatisticsData>>() {
					@Override
					public List<StatisticsData> extractData(ResultSet rs) throws SQLException, DataAccessException {

						List<StatisticsData> list = new ArrayList<StatisticsData>();
						while (rs.next()) {
							StatisticsData e = new StatisticsData();
							e.setId(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setCount(rs.getInt(3));
							list.add(e);
						}
						return list;
					}
				});
	}

}
