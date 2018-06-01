package com.emg.datamanage.dao.okresults;

import com.emg.datamanage.pojo.OKErrorSetsModel;
import com.emg.datamanage.pojo.OKErrorSetsModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OKErrorSetsModelDao {
    int countByExample(OKErrorSetsModelExample example);

    int deleteByExample(OKErrorSetsModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OKErrorSetsModel record);

    int insertSelective(OKErrorSetsModel record);

    List<OKErrorSetsModel> selectByExample(OKErrorSetsModelExample example);

    OKErrorSetsModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OKErrorSetsModel record, @Param("example") OKErrorSetsModelExample example);

    int updateByExample(@Param("record") OKErrorSetsModel record, @Param("example") OKErrorSetsModelExample example);

    int updateByPrimaryKeySelective(OKErrorSetsModel record);

    int updateByPrimaryKey(OKErrorSetsModel record);
}