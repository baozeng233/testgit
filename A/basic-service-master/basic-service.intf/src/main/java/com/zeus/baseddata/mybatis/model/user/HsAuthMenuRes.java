package com.zeus.baseddata.mybatis.model.user;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;

public class HsAuthMenuRes extends BaseModel implements Serializable {
    /**  */
    private Long id;

    /** 菜单ID */
    private Integer menuId;

    /** 资源ID */
    private Long resId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }
}