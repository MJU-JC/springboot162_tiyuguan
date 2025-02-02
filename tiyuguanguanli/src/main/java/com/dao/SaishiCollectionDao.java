package com.dao;

import com.entity.SaishiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishiCollectionView;

/**
 * 赛事收藏 Dao 接口
 *
 * @author 
 */
public interface SaishiCollectionDao extends BaseMapper<SaishiCollectionEntity> {

   List<SaishiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
