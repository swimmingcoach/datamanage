package com.emg.datamanage.dao.okresults;

import com.emg.datamanage.pojo.OKErrorSetsRelatedModel;
import com.emg.datamanage.pojo.OKErrorSetsRelatedModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OKErrorSetsRelatedModelDao {
    int countByExample(OKErrorSetsRelatedModelExample example);

    int deleteByExample(OKErrorSetsRelatedModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OKErrorSetsRelatedModel record);

    int insertSelective(OKErrorSetsRelatedModel record);

    List<OKErrorSetsRelatedModel> selectByExample(OKErrorSetsRelatedModelExample example);

    OKErrorSetsRelatedModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OKErrorSetsRelatedModel record, @Param("example") OKErrorSetsRelatedModelExample example);

    int updateByExample(@Param("record") OKErrorSetsRelatedModel record, @Param("example") OKErrorSetsRelatedModelExample example);

    int updateByPrimaryKeySelective(OKErrorSetsRelatedModel record);

    int updateByPrimaryKey(OKErrorSetsRelatedModel record);
}