package com.emg.datamanage.dao.errorlog;

import com.emg.datamanage.pojo.ErrorRelatedModel;
import com.emg.datamanage.pojo.ErrorRelatedModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorRelatedModelDao {
    int countByExample(ErrorRelatedModelExample example);

    int deleteByExample(ErrorRelatedModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ErrorRelatedModel record);

    int insertSelective(ErrorRelatedModel record);

    List<ErrorRelatedModel> selectByExample(ErrorRelatedModelExample example);

    ErrorRelatedModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ErrorRelatedModel record, @Param("example") ErrorRelatedModelExample example);

    int updateByExample(@Param("record") ErrorRelatedModel record, @Param("example") ErrorRelatedModelExample example);

    int updateByPrimaryKeySelective(ErrorRelatedModel record);

    int updateByPrimaryKey(ErrorRelatedModel record);
}