package com.zeus.baseddata.entity.person;

import java.util.List;

/**
 * 
 * 部门树 结构 dto
 * <p>
 * <详情描述>
 * 
 * @author caojie 2017年10月27日
 * @see
 * @since 1.0
 */
public class BasicDeptTreeDTO{
    
    private Long id;
    
    private String text;
    
    private boolean state;
    
    private boolean click;
    
    private boolean checked;
    
    private String attributes;
    
    private Long pid;
    
    private Integer level;
    
    private List<BasicDeptTreeDTO> children;
    
    public Long getId(){
    
        return id;
    }
    
    public void setId(Long id){
    
        this.id= id;
    }
    
    public String getText(){
    
        return text;
    }
    
    public void setText(String text){
    
        this.text= text;
    }
    
    public boolean isState(){
    
        return state;
    }
    
    public void setState(boolean state){
    
        this.state= state;
    }
    
    public boolean isChecked(){
    
        return checked;
    }
    
    public void setChecked(boolean checked){
    
        this.checked= checked;
    }
    
    public String getAttributes(){
    
        return attributes;
    }
    
    public void setAttributes(String attributes){
    
        this.attributes= attributes;
    }
    
    public Long getPid(){
    
        return pid;
    }
    
    public void setPid(Long pid){
    
        this.pid= pid;
    }
    
    public Integer getLevel(){
    
        return level;
    }
    
    public void setLevel(Integer level){
    
        this.level= level;
    }
    
    public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public List<BasicDeptTreeDTO> getChildren(){
    
        return children;
    }
    
    public void setChildren(List<BasicDeptTreeDTO> children){
    
        this.children= children;
    }
    
}
