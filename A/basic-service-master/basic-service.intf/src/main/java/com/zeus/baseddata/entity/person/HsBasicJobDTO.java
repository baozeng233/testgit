package com.zeus.baseddata.entity.person;

import java.util.List;

import com.zeus.baseddata.mybatis.model.person.HsBasicJob;

public class HsBasicJobDTO extends HsBasicJob{
    
    /**
     * @Fields
     */
    private static final long serialVersionUID= 1L;
    
    private List<Long> depts;
    
    private List<BasicDeptTreeDTO> trees;
    
    public List<Long> getDepts(){
        
        return depts;
    }
    
    public void setDepts(List<Long> depts){
        
        this.depts= depts;
    }
    
    public List<BasicDeptTreeDTO> getTrees(){
        
        return trees;
    }
    
    public void setTrees(List<BasicDeptTreeDTO> trees){
        
        this.trees= trees;
    }
    
}
