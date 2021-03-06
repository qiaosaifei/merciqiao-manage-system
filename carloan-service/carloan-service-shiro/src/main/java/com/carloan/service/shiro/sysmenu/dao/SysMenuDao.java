package com.carloan.service.shiro.sysmenu.dao;

import java.util.List;
import java.util.Map;

import com.carloan.service.shiro.sysmenu.dto.SysMenuDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuDao {
    public List<SysMenuDTO> searchSysMenuByPaging(Map<String, Object> searchParams) ;
    
    public List<SysMenuDTO> searchSysMenu(Map<String, Object> searchParams);

    public SysMenuDTO findSysMenuByPrimaryKey(String id);
    
    public int insertSysMenu(Map<String, Object> paramMap);
    
    public void updateSysMenu(Map<String, Object> paramMap);

    public void deleteSysMenu(Map<String, Object> paramMap);
    public SysMenuDTO queryLikeSysMenu(Map<String, Object> paramMap);

    public List<SysMenuDTO> querySysMenuByUserId(String userId);
}
