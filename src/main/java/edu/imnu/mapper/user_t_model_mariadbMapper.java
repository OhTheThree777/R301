package edu.imnu.mapper;

import edu.imnu.model.user_t_model_mariadb;
import edu.imnu.model.user_t_model_mariadbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface user_t_model_mariadbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int countByExample(user_t_model_mariadbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int deleteByExample(user_t_model_mariadbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int insert(user_t_model_mariadb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int insertSelective(user_t_model_mariadb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    List<user_t_model_mariadb> selectByExample(user_t_model_mariadbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    user_t_model_mariadb selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") user_t_model_mariadb record, @Param("example") user_t_model_mariadbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") user_t_model_mariadb record, @Param("example") user_t_model_mariadbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(user_t_model_mariadb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(user_t_model_mariadb record);
}