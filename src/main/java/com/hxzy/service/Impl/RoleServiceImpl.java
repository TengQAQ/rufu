package com.hxzy.service.Impl;

import com.hxzy.Dto.UserLoginDto;
import com.hxzy.entity.Role;
import com.hxzy.mapper.Impl.RoleMapperImpl;
import com.hxzy.mapper.RoleMapper;
import com.hxzy.service.RoleService;
import com.hxzy.vo.CodeEnum;
import com.hxzy.vo.Result;

public class RoleServiceImpl implements RoleService {
	private RoleMapper mapper = new RoleMapperImpl();
	@Override
	public Result deleteByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public Result insert(RoleMapper record) {
		return null;
	}

	@Override
	public Result insertSelective(RoleMapper record) {
		return null;
	}

	@Override
	public Result selectByPrimaryKey(Integer id) {
		Result result;
		Role role = mapper.selectByPrimaryKey(id);
		if (role == null){
			result = Result.of(CodeEnum.FAILURE);
		}else {
			result = Result.of(CodeEnum.SUCCESS);
			result.setData(role);
		}
		return result;
	}

	@Override
	public Result updateByPrimaryKeySelective(RoleMapper record) {
		return null;
	}

	@Override
	public Result updateByPrimaryKey(RoleMapper record) {
		return null;
	}

	public Result login(String dto){
		Result result;
		Role role = mapper.selectByNumber(dto);
		if (role == null){
			result = Result.of(CodeEnum.UID_PWD_WRONG);
		}else {
			result = Result.of(CodeEnum.SUCCESS);
			result.setData(role);
		}
		return result;
	}
}
