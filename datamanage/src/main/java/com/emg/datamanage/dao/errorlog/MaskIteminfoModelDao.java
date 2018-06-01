package com.emg.datamanage.dao.errorlog;

import com.emg.datamanage.pojo.MaskIteminfoModel;
import com.emg.datamanage.pojo.MaskIteminfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaskIteminfoModelDao {
    int countByExample(MaskIteminfoModelExample example);

    int deleteByExample(MaskIteminfoModelExample example);

    int insert(MaskIteminfoModel record);

    int insertSelective(MaskIteminfoModel record);

    List<MaskIteminfoModel> selectByExample(MaskIteminfoModelExample example);

    int updateByExampleSelective(@Param("record") MaskIteminfoModel record, @Param("example") MaskIteminfoModelExample example);

    int updateByExample(@Param("record") MaskIteminfoModel record, @Param("example") MaskIteminfoModelExample example);
}