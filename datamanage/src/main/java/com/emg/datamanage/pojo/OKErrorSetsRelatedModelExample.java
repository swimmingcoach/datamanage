package com.emg.datamanage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OKErrorSetsRelatedModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OKErrorSetsRelatedModelExample() {
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

        public Criteria andErroridIsNull() {
            addCriterion("errorid is null");
            return (Criteria) this;
        }

        public Criteria andErroridIsNotNull() {
            addCriterion("errorid is not null");
            return (Criteria) this;
        }

        public Criteria andErroridEqualTo(Long value) {
            addCriterion("errorid =", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotEqualTo(Long value) {
            addCriterion("errorid <>", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThan(Long value) {
            addCriterion("errorid >", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThanOrEqualTo(Long value) {
            addCriterion("errorid >=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThan(Long value) {
            addCriterion("errorid <", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThanOrEqualTo(Long value) {
            addCriterion("errorid <=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridIn(List<Long> values) {
            addCriterion("errorid in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotIn(List<Long> values) {
            addCriterion("errorid not in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridBetween(Long value1, Long value2) {
            addCriterion("errorid between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotBetween(Long value1, Long value2) {
            addCriterion("errorid not between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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