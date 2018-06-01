package com.emg.datamanage.dao.okresults;

import com.emg.datamanage.pojo.OKErrorIteminfoModel;
import com.emg.datamanage.pojo.OKErrorIteminfoModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OKErrorIteminfoModelDao {
    int countByExample(OKErrorIteminfoModelExample example);

    int deleteByExample(OKErrorIteminfoModelExample example);

    int insert(OKErrorIteminfoModel record);

    int insertSelective(OKErrorIteminfoModel record);

    List<OKErrorIteminfoModel> selectByExample(OKErrorIteminfoModelExample example);

    int updateByExampleSelective(@Param("record") OKErrorIteminfoModel record, @Param("example") OKErrorIteminfoModelExample example);

    int updateByExample(@Param("record") OKErrorIteminfoModel record, @Param("example") OKErrorIteminfoModelExample example);
}