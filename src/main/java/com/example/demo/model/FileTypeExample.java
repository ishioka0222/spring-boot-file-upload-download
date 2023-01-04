package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class FileTypeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table file_type
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table file_type
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table file_type
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public FileTypeExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_type
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table file_type
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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

		public Criteria andTYPE_IDIsNull() {
			addCriterion("TYPE_ID is null");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDIsNotNull() {
			addCriterion("TYPE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDEqualTo(Integer value) {
			addCriterion("TYPE_ID =", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDNotEqualTo(Integer value) {
			addCriterion("TYPE_ID <>", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDGreaterThan(Integer value) {
			addCriterion("TYPE_ID >", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDGreaterThanOrEqualTo(Integer value) {
			addCriterion("TYPE_ID >=", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDLessThan(Integer value) {
			addCriterion("TYPE_ID <", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDLessThanOrEqualTo(Integer value) {
			addCriterion("TYPE_ID <=", value, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDIn(List<Integer> values) {
			addCriterion("TYPE_ID in", values, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDNotIn(List<Integer> values) {
			addCriterion("TYPE_ID not in", values, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDBetween(Integer value1, Integer value2) {
			addCriterion("TYPE_ID between", value1, value2, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andTYPE_IDNotBetween(Integer value1, Integer value2) {
			addCriterion("TYPE_ID not between", value1, value2, "TYPE_ID");
			return (Criteria) this;
		}

		public Criteria andNAMEIsNull() {
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNAMEIsNotNull() {
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNAMEEqualTo(String value) {
			addCriterion("NAME =", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMENotEqualTo(String value) {
			addCriterion("NAME <>", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMEGreaterThan(String value) {
			addCriterion("NAME >", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMEGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMELessThan(String value) {
			addCriterion("NAME <", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMELessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMELike(String value) {
			addCriterion("NAME like", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMENotLike(String value) {
			addCriterion("NAME not like", value, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMEIn(List<String> values) {
			addCriterion("NAME in", values, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMENotIn(List<String> values) {
			addCriterion("NAME not in", values, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMEBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "NAME");
			return (Criteria) this;
		}

		public Criteria andNAMENotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "NAME");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table file_type
	 * @mbg.generated
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table file_type
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}