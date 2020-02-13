package com.yz.sophia.ucenter.dao;

import com.yz.sophia.ucenter.model.SysRoleMenuExample;
import com.yz.sophia.ucenter.model.SysRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int countByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(SysRoleMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insert(SysRoleMenuKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insertSelective(SysRoleMenuKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    List<SysRoleMenuKey> selectByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);
}