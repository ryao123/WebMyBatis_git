package service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import commons.MybatisUtils;
import dao.FlowerMapper;
import entity.flower;
import service.FlowerService;

public class FlowerServiceImpl implements FlowerService {

	private FlowerMapper mapper;
	@Override
	public List<flower> getAll() {
		SqlSession sqlSession=MybatisUtils.createSqlSession();
		//获得Mapper对象
		mapper=sqlSession.getMapper(FlowerMapper.class);
		List<flower> list=mapper.getAll();
		MybatisUtils.closeSqlSession(sqlSession);
		return list;
	}



}
