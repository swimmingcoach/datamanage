package com.emg.datamanage.dao.errorlog;

import com.emg.datamanage.pojo.ErrorStatisticsModel;
import com.emg.datamanage.pojo.ErrorStatisticsModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorStatisticsModelDao {
    int countByExample(ErrorStatisticsModelExample example);

    int deleteByExample(ErrorStatisticsModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ErrorStatisticsModel record);

    int insertSelective(ErrorStatisticsModel record);

    List<ErrorStatisticsModel> selectByExample(ErrorStatisticsModelExample example);

    ErrorStatisticsModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ErrorStatisticsModel record, @Param("example") ErrorStatisticsModelExample example);

    int updateByExample(@Param("record") ErrorStatisticsModel record, @Param("example") ErrorStatisticsModelExample example);

    int updateByPrimaryKeySelective(ErrorStatisticsModel record);

    int updateByPrimaryKey(ErrorStatisticsModel record);
}