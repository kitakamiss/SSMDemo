package com.dmm.base.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dmm.utils.StringUtils;

/**
  * <p>Title 		 : QueryVo</p>
  * <p>Description	 : 数据库查询包装类</p>
  * <p>DevelopTools	 : Eclipse_x64_v4.6.1</p>
  * <p>DevelopSystem : win10</p>
  * <p>Company 		 : com。diaocha</p>
  * @author			 : Liangzl
  * @date 			 : 2017年7月26日 下午2:15:34
  * @version 		 : 5.0.0
 */
@Component
public class QueryVo implements Serializable {
	
	/** SerialVersionUID **/
	private static final long serialVersionUID = 1L;
	
	/**
	 * 查询字段列表(为空则查询所有)
	 */
	private List<String> columnNameList = null;
	
	/**
	 * and查询条件列表
	 */
	private List<WhereClause> andWhereClauseList;
	
	/**
	 * or查询条件列表
	 */
	private List<WhereClause> orWhereClauseList;
	
	/**
	 * 排序字段列表
	 */
	private List<String> orderByList = null;
	
	/**
	 * 分页信息
	 */
	private Limit limit = null;
	
	/**
	 * 初始化
	 */
	public QueryVo() {
		andWhereClauseList = new ArrayList<>();
		orWhereClauseList = new ArrayList<>();
	}
	
	/**
	 * 清除QueryVo所有查询条件
	 * @return QueryVo
	 */
	public QueryVo clean() {
		columnNameList = null;
		andWhereClauseList = new ArrayList<>();
		orWhereClauseList = new ArrayList<>();
		orderByList = null;
		limit = null;
		return this;
	}
	
	/**
	 * 添加查询字段
	 * @param columnName 	需要查询的字段
	 * @return 				QueryVo
	 */
	public QueryVo addSelectColumnName(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			if (columnNameList == null) {
				columnNameList = new ArrayList<>();
			}
			columnNameList.add(columnName);
		}
		return this;
	}
	
	/**
	 * 添加[columnName IS NULL]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addIsNull(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setIsNull(true);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName IS NOT NULL]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addIsNotNull(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setIsNotNull(true);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName = value](不区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName != value](不区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addNotEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName = value](区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addAllEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setAllEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName != value](区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addAllNotEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotAllEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName 大于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addGreaterThan(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setGreaterThan(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName 大等于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addGreaterThanOrEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setGreaterThanOrEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName 小于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addLessThan(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLessThan(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName 小等于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addLessThanOrEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLessThanOrEqualTo(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName LIKE value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addLike(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLike(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName NOT LIKE value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addNotlike(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotlike(value);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName IN list]
	 * @param columnName 		数据库字段名
	 * @param list 				值列表
	 * @return 					QueryVo
	 */
	public QueryVo addInList(String columnName, List<Object> list) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setInList(list);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName NOT IN list]
	 * @param columnName 		数据库字段名
	 * @param list				值列表
	 * @return 					QueryVo
	 */
	public QueryVo addNotInList(String columnName, List<Object> list) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotInList(list);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName BETWEEN value1 AND value2]
	 * @param columnName 		数据库字段名
	 * @param value1 			值1
	 * @param value2 			值2
	 * @return 					QueryVo
	 */
	public QueryVo addBetween(String columnName, Object value1, Object value2) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setBetweenAnd(value1, value2);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName NOT BETWEEN value1 AND value2]
	 * @param columnName 		数据库字段名
	 * @param value1 			值1
	 * @param value2 			值2
	 * @return 					QueryVo
	 */
	public QueryVo addNotBetween(String columnName, Object value1, Object value2) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotBetweenAnd(value1, value2);
			getAndWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName IS NULL]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addOrIsNull(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setIsNull(true);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName IS NOT NULL]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addOrIsNotNull(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setIsNotNull(true);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName = value](不区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName != value](不区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrNotEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName = value](区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrAllEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setAllEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName != value](区分大小写)
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrAllNotEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotAllEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName 大于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrGreaterThan(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setGreaterThan(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName 大等于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrGreaterThanOrEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setGreaterThanOrEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName 小于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrLessThan(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLessThan(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName 小等于 value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrLessThanOrEqualTo(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLessThanOrEqualTo(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName LIKE value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrLike(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setLike(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName NOT LIKE value]
	 * @param columnName 		数据库字段名
	 * @param value 			值
	 * @return 					QueryVo
	 */
	public QueryVo addOrNotlike(String columnName, Object value) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotlike(value);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName IN list]
	 * @param columnName 		数据库字段名
	 * @param list 				值列表
	 * @return 					QueryVo
	 */
	public QueryVo addOrInList(String columnName, List<Object> list) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setInList(list);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName NOT IN list]
	 * @param columnName 		数据库字段名
	 * @param list				值列表
	 * @return 					QueryVo
	 */
	public QueryVo addOrNotInList(String columnName, List<Object> list) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotInList(list);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName BETWEEN value1 AND value2]
	 * @param columnName 		数据库字段名
	 * @param value1 			值1
	 * @param value2 			值2
	 * @return 					QueryVo
	 */
	public QueryVo addOrBetween(String columnName, Object value1, Object value2) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setBetweenAnd(value1, value2);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加或者[columnName NOT BETWEEN value1 AND value2]
	 * @param columnName 		数据库字段名
	 * @param value1 			值1
	 * @param value2 			值2
	 * @return 					QueryVo
	 */
	public QueryVo addOrNotBetween(String columnName, Object value1, Object value2) {
		if (!StringUtils.isEmpty(columnName)) {
			WhereClause whereClause = new WhereClause();
			whereClause.setColumnName(columnName);
			whereClause.setNotBetweenAnd(value1, value2);
			getOrWhereClauseList().add(whereClause);
		}
		return this;
	}
	
	/**
	 * 添加[columnName DESC]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addDesc(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			if (orderByList == null) {
				orderByList = new ArrayList<>();
			}
			orderByList.add(columnName + " DESC");
		}
		return this;
	}
	
	/**
	 * 添加[columnName ACS]
	 * @param columnName 		数据库字段名
	 * @return 					QueryVo
	 */
	public QueryVo addAcs(String columnName) {
		if (!StringUtils.isEmpty(columnName)) {
			if (orderByList == null) {
				orderByList = new ArrayList<>();
			}
			orderByList.add(columnName + " ASC");
		}
		return this;
	}
	
	/**
	 * 添加分页信息
	 * @param offset	偏移(跳过多少行数据)
	 * @param limit		限制(取出多少行数据)
	 * @return 					QueryVo
	 */
	public QueryVo addLimit(long offset, long limit) {
		this.limit = new Limit(offset, limit);
		return this;
	}
	
	/**
	 * 添加分页信息
	 * @param offset	偏移(跳过多少行数据)
	 * @param limit		限制(取出多少行数据)
	 * @return 					QueryVo
	 */
	public QueryVo addLimit(int offset, int limit) {
		this.limit = new Limit(offset, limit);
		return this;
	}

	public List<String> getColumnNameList() {
		return columnNameList;
	}

	public void setColumnNameList(List<String> columnNameList) {
		this.columnNameList = columnNameList;
	}
	
	public List<WhereClause> getAndWhereClauseList() {
		return andWhereClauseList;
	}
	
	public void setAndWhereClauseList(List<WhereClause> andWhereClauseList) {
		this.andWhereClauseList = andWhereClauseList;
	}
	
	public List<WhereClause> getOrWhereClauseList() {
		return orWhereClauseList;
	}
	
	public void setOrWhereClauseList(List<WhereClause> orWhereClauseList) {
		this.orWhereClauseList = orWhereClauseList;
	}

	public List<String> getOrderByList() {
		return orderByList;
	}

	public void setOrderByList(List<String> orderByList) {
		this.orderByList = orderByList;
	}

	public Limit getLimit() {
		return limit;
	}

	public void setLimit(Limit limit) {
		this.limit = limit;
	}

}