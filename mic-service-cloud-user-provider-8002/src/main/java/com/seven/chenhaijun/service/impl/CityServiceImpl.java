package com.seven.chenhaijun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seven.chenhaijun.entity.City;
import com.seven.chenhaijun.mapper.CityMapper;
import com.seven.chenhaijun.service.ICityService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 市级信息 服务实现类
 * </p>
 *
 * @author chenhaijun
 * @since 2018-11-23
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
