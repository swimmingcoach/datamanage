package com.emg.datamanage.dao.errorlog;

import com.emg.datamanage.pojo.ErrorModel;
import com.emg.datamanage.pojo.ErrorModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorModelDao {
    int countByExample(ErrorModelExample example);

    int deleteByExample(ErrorModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ErrorModel record);

    int insertSelective(ErrorModel record);

    List<ErrorModel> selectByExample(ErrorModelExample example);

    ErrorModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ErrorModel record, @Param("example") ErrorModelExample example);

    int updateByExample(@Param("record") ErrorModel record, @Param("example") ErrorModelExample example);

    int updateByPrimaryKeySelective(ErrorModel record);

    int updateByPrimaryKey(ErrorModel record);
}