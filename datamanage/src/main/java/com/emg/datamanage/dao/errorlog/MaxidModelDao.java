package com.emg.datamanage.dao.errorlog;

import com.emg.datamanage.pojo.MaxidModel;
import com.emg.datamanage.pojo.MaxidModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaxidModelDao {
    int countByExample(MaxidModelExample example);

    int deleteByExample(MaxidModelExample example);

    int deleteByPrimaryKey(Long maxid);

    int insert(MaxidModel record);

    int insertSelective(MaxidModel record);

    List<MaxidModel> selectByExample(MaxidModelExample example);

    int updateByExampleSelective(@Param("record") MaxidModel record, @Param("example") MaxidModelExample example);

    int updateByExample(@Param("record") MaxidModel record, @Param("example") MaxidModelExample example);
}