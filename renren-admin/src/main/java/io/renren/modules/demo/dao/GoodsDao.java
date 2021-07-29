package io.renren.modules.demo.dao;

import io.renren.modules.demo.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 15:09:45
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
