package com.yz.sophia.ucenter.model;

public class SysRoleUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_user.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_user.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_user.role_id
     *
     * @return the value of sys_role_user.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_user.role_id
     *
     * @param roleId the value for sys_role_user.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_user.user_id
     *
     * @return the value of sys_role_user.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_user.user_id
     *
     * @param userId the value for sys_role_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}