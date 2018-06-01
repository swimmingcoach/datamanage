package com.emg.datamanage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorModelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Long value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Long value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Long value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Long value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Long value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Long> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Long> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Long value1, Long value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Long value1, Long value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andBlockidIsNull() {
            addCriterion("blockid is null");
            return (Criteria) this;
        }

        public Criteria andBlockidIsNotNull() {
            addCriterion("blockid is not null");
            return (Criteria) this;
        }

        public Criteria andBlockidEqualTo(Long value) {
            addCriterion("blockid =", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotEqualTo(Long value) {
            addCriterion("blockid <>", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidGreaterThan(Long value) {
            addCriterion("blockid >", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidGreaterThanOrEqualTo(Long value) {
            addCriterion("blockid >=", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidLessThan(Long value) {
            addCriterion("blockid <", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidLessThanOrEqualTo(Long value) {
            addCriterion("blockid <=", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidIn(List<Long> values) {
            addCriterion("blockid in", values, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotIn(List<Long> values) {
            addCriterion("blockid not in", values, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidBetween(Long value1, Long value2) {
            addCriterion("blockid between", value1, value2, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotBetween(Long value1, Long value2) {
            addCriterion("blockid not between", value1, value2, "blockid");
            return (Criteria) this;
        }

        public Criteria andFeatureidIsNull() {
            addCriterion("featureid is null");
            return (Criteria) this;
        }

        public Criteria andFeatureidIsNotNull() {
            addCriterion("featureid is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureidEqualTo(Long value) {
            addCriterion("featureid =", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidNotEqualTo(Long value) {
            addCriterion("featureid <>", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidGreaterThan(Long value) {
            addCriterion("featureid >", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidGreaterThanOrEqualTo(Long value) {
            addCriterion("featureid >=", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidLessThan(Long value) {
            addCriterion("featureid <", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidLessThanOrEqualTo(Long value) {
            addCriterion("featureid <=", value, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidIn(List<Long> values) {
            addCriterion("featureid in", values, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidNotIn(List<Long> values) {
            addCriterion("featureid not in", values, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidBetween(Long value1, Long value2) {
            addCriterion("featureid between", value1, value2, "featureid");
            return (Criteria) this;
        }

        public Criteria andFeatureidNotBetween(Long value1, Long value2) {
            addCriterion("featureid not between", value1, value2, "featureid");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNull() {
            addCriterion("layerid is null");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNotNull() {
            addCriterion("layerid is not null");
            return (Criteria) this;
        }

        public Criteria andLayeridEqualTo(Integer value) {
            addCriterion("layerid =", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotEqualTo(Integer value) {
            addCriterion("layerid <>", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThan(Integer value) {
            addCriterion("layerid >", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("layerid >=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThan(Integer value) {
            addCriterion("layerid <", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThanOrEqualTo(Integer value) {
            addCriterion("layerid <=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridIn(List<Integer> values) {
            addCriterion("layerid in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotIn(List<Integer> values) {
            addCriterion("layerid not in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridBetween(Integer value1, Integer value2) {
            addCriterion("layerid between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotBetween(Integer value1, Integer value2) {
            addCriterion("layerid not between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andEditverIsNull() {
            addCriterion("editver is null");
            return (Criteria) this;
        }

        public Criteria andEditverIsNotNull() {
            addCriterion("editver is not null");
            return (Criteria) this;
        }

        public Criteria andEditverEqualTo(Long value) {
            addCriterion("editver =", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverNotEqualTo(Long value) {
            addCriterion("editver <>", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverGreaterThan(Long value) {
            addCriterion("editver >", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverGreaterThanOrEqualTo(Long value) {
            addCriterion("editver >=", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverLessThan(Long value) {
            addCriterion("editver <", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverLessThanOrEqualTo(Long value) {
            addCriterion("editver <=", value, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverIn(List<Long> values) {
            addCriterion("editver in", values, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverNotIn(List<Long> values) {
            addCriterion("editver not in", values, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverBetween(Long value1, Long value2) {
            addCriterion("editver between", value1, value2, "editver");
            return (Criteria) this;
        }

        public Criteria andEditverNotBetween(Long value1, Long value2) {
            addCriterion("editver not between", value1, value2, "editver");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andEditvalueIsNull() {
            addCriterion("editvalue is null");
            return (Criteria) this;
        }

        public Criteria andEditvalueIsNotNull() {
            addCriterion("editvalue is not null");
            return (Criteria) this;
        }

        public Criteria andEditvalueEqualTo(String value) {
            addCriterion("editvalue =", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueNotEqualTo(String value) {
            addCriterion("editvalue <>", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueGreaterThan(String value) {
            addCriterion("editvalue >", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueGreaterThanOrEqualTo(String value) {
            addCriterion("editvalue >=", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueLessThan(String value) {
            addCriterion("editvalue <", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueLessThanOrEqualTo(String value) {
            addCriterion("editvalue <=", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueLike(String value) {
            addCriterion("editvalue like", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueNotLike(String value) {
            addCriterion("editvalue not like", value, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueIn(List<String> values) {
            addCriterion("editvalue in", values, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueNotIn(List<String> values) {
            addCriterion("editvalue not in", values, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueBetween(String value1, String value2) {
            addCriterion("editvalue between", value1, value2, "editvalue");
            return (Criteria) this;
        }

        public Criteria andEditvalueNotBetween(String value1, String value2) {
            addCriterion("editvalue not between", value1, value2, "editvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueIsNull() {
            addCriterion("checkvalue is null");
            return (Criteria) this;
        }

        public Criteria andCheckvalueIsNotNull() {
            addCriterion("checkvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCheckvalueEqualTo(String value) {
            addCriterion("checkvalue =", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueNotEqualTo(String value) {
            addCriterion("checkvalue <>", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueGreaterThan(String value) {
            addCriterion("checkvalue >", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueGreaterThanOrEqualTo(String value) {
            addCriterion("checkvalue >=", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueLessThan(String value) {
            addCriterion("checkvalue <", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueLessThanOrEqualTo(String value) {
            addCriterion("checkvalue <=", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueLike(String value) {
            addCriterion("checkvalue like", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueNotLike(String value) {
            addCriterion("checkvalue not like", value, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueIn(List<String> values) {
            addCriterion("checkvalue in", values, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueNotIn(List<String> values) {
            addCriterion("checkvalue not in", values, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueBetween(String value1, String value2) {
            addCriterion("checkvalue between", value1, value2, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andCheckvalueNotBetween(String value1, String value2) {
            addCriterion("checkvalue not between", value1, value2, "checkvalue");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(String value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(String value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(String value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(String value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(String value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(String value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLike(String value) {
            addCriterion("qid like", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotLike(String value) {
            addCriterion("qid not like", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<String> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<String> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(String value1, String value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(String value1, String value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andErrortypeIsNull() {
            addCriterion("errortype is null");
            return (Criteria) this;
        }

        public Criteria andErrortypeIsNotNull() {
            addCriterion("errortype is not null");
            return (Criteria) this;
        }

        public Criteria andErrortypeEqualTo(Long value) {
            addCriterion("errortype =", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotEqualTo(Long value) {
            addCriterion("errortype <>", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeGreaterThan(Long value) {
            addCriterion("errortype >", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeGreaterThanOrEqualTo(Long value) {
            addCriterion("errortype >=", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeLessThan(Long value) {
            addCriterion("errortype <", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeLessThanOrEqualTo(Long value) {
            addCriterion("errortype <=", value, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeIn(List<Long> values) {
            addCriterion("errortype in", values, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotIn(List<Long> values) {
            addCriterion("errortype not in", values, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeBetween(Long value1, Long value2) {
            addCriterion("errortype between", value1, value2, "errortype");
            return (Criteria) this;
        }

        public Criteria andErrortypeNotBetween(Long value1, Long value2) {
            addCriterion("errortype not between", value1, value2, "errortype");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andModifystateIsNull() {
            addCriterion("modifystate is null");
            return (Criteria) this;
        }

        public Criteria andModifystateIsNotNull() {
            addCriterion("modifystate is not null");
            return (Criteria) this;
        }

        public Criteria andModifystateEqualTo(Integer value) {
            addCriterion("modifystate =", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateNotEqualTo(Integer value) {
            addCriterion("modifystate <>", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateGreaterThan(Integer value) {
            addCriterion("modifystate >", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifystate >=", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateLessThan(Integer value) {
            addCriterion("modifystate <", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateLessThanOrEqualTo(Integer value) {
            addCriterion("modifystate <=", value, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateIn(List<Integer> values) {
            addCriterion("modifystate in", values, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateNotIn(List<Integer> values) {
            addCriterion("modifystate not in", values, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateBetween(Integer value1, Integer value2) {
            addCriterion("modifystate between", value1, value2, "modifystate");
            return (Criteria) this;
        }

        public Criteria andModifystateNotBetween(Integer value1, Integer value2) {
            addCriterion("modifystate not between", value1, value2, "modifystate");
            return (Criteria) this;
        }

        public Criteria andErrorstateIsNull() {
            addCriterion("errorstate is null");
            return (Criteria) this;
        }

        public Criteria andErrorstateIsNotNull() {
            addCriterion("errorstate is not null");
            return (Criteria) this;
        }

        public Criteria andErrorstateEqualTo(Integer value) {
            addCriterion("errorstate =", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateNotEqualTo(Integer value) {
            addCriterion("errorstate <>", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateGreaterThan(Integer value) {
            addCriterion("errorstate >", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("errorstate >=", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateLessThan(Integer value) {
            addCriterion("errorstate <", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateLessThanOrEqualTo(Integer value) {
            addCriterion("errorstate <=", value, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateIn(List<Integer> values) {
            addCriterion("errorstate in", values, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateNotIn(List<Integer> values) {
            addCriterion("errorstate not in", values, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateBetween(Integer value1, Integer value2) {
            addCriterion("errorstate between", value1, value2, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorstateNotBetween(Integer value1, Integer value2) {
            addCriterion("errorstate not between", value1, value2, "errorstate");
            return (Criteria) this;
        }

        public Criteria andErrorremarkIsNull() {
            addCriterion("errorremark is null");
            return (Criteria) this;
        }

        public Criteria andErrorremarkIsNotNull() {
            addCriterion("errorremark is not null");
            return (Criteria) this;
        }

        public Criteria andErrorremarkEqualTo(String value) {
            addCriterion("errorremark =", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkNotEqualTo(String value) {
            addCriterion("errorremark <>", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkGreaterThan(String value) {
            addCriterion("errorremark >", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkGreaterThanOrEqualTo(String value) {
            addCriterion("errorremark >=", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkLessThan(String value) {
            addCriterion("errorremark <", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkLessThanOrEqualTo(String value) {
            addCriterion("errorremark <=", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkLike(String value) {
            addCriterion("errorremark like", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkNotLike(String value) {
            addCriterion("errorremark not like", value, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkIn(List<String> values) {
            addCriterion("errorremark in", values, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkNotIn(List<String> values) {
            addCriterion("errorremark not in", values, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkBetween(String value1, String value2) {
            addCriterion("errorremark between", value1, value2, "errorremark");
            return (Criteria) this;
        }

        public Criteria andErrorremarkNotBetween(String value1, String value2) {
            addCriterion("errorremark not between", value1, value2, "errorremark");
            return (Criteria) this;
        }

        public Criteria andCheckroleidIsNull() {
            addCriterion("checkroleid is null");
            return (Criteria) this;
        }

        public Criteria andCheckroleidIsNotNull() {
            addCriterion("checkroleid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckroleidEqualTo(Integer value) {
            addCriterion("checkroleid =", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidNotEqualTo(Integer value) {
            addCriterion("checkroleid <>", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidGreaterThan(Integer value) {
            addCriterion("checkroleid >", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkroleid >=", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidLessThan(Integer value) {
            addCriterion("checkroleid <", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidLessThanOrEqualTo(Integer value) {
            addCriterion("checkroleid <=", value, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidIn(List<Integer> values) {
            addCriterion("checkroleid in", values, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidNotIn(List<Integer> values) {
            addCriterion("checkroleid not in", values, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidBetween(Integer value1, Integer value2) {
            addCriterion("checkroleid between", value1, value2, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andCheckroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkroleid not between", value1, value2, "checkroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidIsNull() {
            addCriterion("changeroleid is null");
            return (Criteria) this;
        }

        public Criteria andChangeroleidIsNotNull() {
            addCriterion("changeroleid is not null");
            return (Criteria) this;
        }

        public Criteria andChangeroleidEqualTo(Integer value) {
            addCriterion("changeroleid =", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidNotEqualTo(Integer value) {
            addCriterion("changeroleid <>", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidGreaterThan(Integer value) {
            addCriterion("changeroleid >", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeroleid >=", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidLessThan(Integer value) {
            addCriterion("changeroleid <", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidLessThanOrEqualTo(Integer value) {
            addCriterion("changeroleid <=", value, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidIn(List<Integer> values) {
            addCriterion("changeroleid in", values, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidNotIn(List<Integer> values) {
            addCriterion("changeroleid not in", values, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidBetween(Integer value1, Integer value2) {
            addCriterion("changeroleid between", value1, value2, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andChangeroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("changeroleid not between", value1, value2, "changeroleid");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("batchid is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("batchid is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(Long value) {
            addCriterion("batchid =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(Long value) {
            addCriterion("batchid <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(Long value) {
            addCriterion("batchid >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(Long value) {
            addCriterion("batchid >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(Long value) {
            addCriterion("batchid <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(Long value) {
            addCriterion("batchid <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<Long> values) {
            addCriterion("batchid in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<Long> values) {
            addCriterion("batchid not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(Long value1, Long value2) {
            addCriterion("batchid between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(Long value1, Long value2) {
            addCriterion("batchid not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andIsrelatedIsNull() {
            addCriterion("isrelated is null");
            return (Criteria) this;
        }

        public Criteria andIsrelatedIsNotNull() {
            addCriterion("isrelated is not null");
            return (Criteria) this;
        }

        public Criteria andIsrelatedEqualTo(Integer value) {
            addCriterion("isrelated =", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedNotEqualTo(Integer value) {
            addCriterion("isrelated <>", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedGreaterThan(Integer value) {
            addCriterion("isrelated >", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isrelated >=", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedLessThan(Integer value) {
            addCriterion("isrelated <", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedLessThanOrEqualTo(Integer value) {
            addCriterion("isrelated <=", value, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedIn(List<Integer> values) {
            addCriterion("isrelated in", values, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedNotIn(List<Integer> values) {
            addCriterion("isrelated not in", values, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedBetween(Integer value1, Integer value2) {
            addCriterion("isrelated between", value1, value2, "isrelated");
            return (Criteria) this;
        }

        public Criteria andIsrelatedNotBetween(Integer value1, Integer value2) {
            addCriterion("isrelated not between", value1, value2, "isrelated");
            return (Criteria) this;
        }

        public Criteria andSboundIsNull() {
            addCriterion("sbound is null");
            return (Criteria) this;
        }

        public Criteria andSboundIsNotNull() {
            addCriterion("sbound is not null");
            return (Criteria) this;
        }

        public Criteria andSboundEqualTo(String value) {
            addCriterion("sbound =", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundNotEqualTo(String value) {
            addCriterion("sbound <>", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundGreaterThan(String value) {
            addCriterion("sbound >", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundGreaterThanOrEqualTo(String value) {
            addCriterion("sbound >=", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundLessThan(String value) {
            addCriterion("sbound <", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundLessThanOrEqualTo(String value) {
            addCriterion("sbound <=", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundLike(String value) {
            addCriterion("sbound like", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundNotLike(String value) {
            addCriterion("sbound not like", value, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundIn(List<String> values) {
            addCriterion("sbound in", values, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundNotIn(List<String> values) {
            addCriterion("sbound not in", values, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundBetween(String value1, String value2) {
            addCriterion("sbound between", value1, value2, "sbound");
            return (Criteria) this;
        }

        public Criteria andSboundNotBetween(String value1, String value2) {
            addCriterion("sbound not between", value1, value2, "sbound");
            return (Criteria) this;
        }

        public Criteria andBoundIsNull() {
            addCriterion("bound is null");
            return (Criteria) this;
        }

        public Criteria andBoundIsNotNull() {
            addCriterion("bound is not null");
            return (Criteria) this;
        }

        public Criteria andBoundEqualTo(Object value) {
            addCriterion("bound =", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotEqualTo(Object value) {
            addCriterion("bound <>", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundGreaterThan(Object value) {
            addCriterion("bound >", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundGreaterThanOrEqualTo(Object value) {
            addCriterion("bound >=", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundLessThan(Object value) {
            addCriterion("bound <", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundLessThanOrEqualTo(Object value) {
            addCriterion("bound <=", value, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundIn(List<Object> values) {
            addCriterion("bound in", values, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotIn(List<Object> values) {
            addCriterion("bound not in", values, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundBetween(Object value1, Object value2) {
            addCriterion("bound between", value1, value2, "bound");
            return (Criteria) this;
        }

        public Criteria andBoundNotBetween(Object value1, Object value2) {
            addCriterion("bound not between", value1, value2, "bound");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}