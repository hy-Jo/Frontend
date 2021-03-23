package com.study.categrp;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
 
@Service
public class CategrpServiceImpl implements CategrpService {
  @Autowired  
  private CategrpMapper mapper;
  
  @Override
  public int create(CategrpVO categrpVO) {
    int cnt = 0;
    cnt = this.mapper.create(categrpVO);
    return cnt;
  }
 
  @Override
  public List<CategrpVO> list_seqno_asc() {
    List<CategrpVO> list = null;
    list = this.mapper.list_seqno_asc();
    return list;
  }
  
  @Override
  public CategrpVO read(int categrpno) {
    CategrpVO categrpVO = null;
    categrpVO = this.mapper.read(categrpno);
    
    return categrpVO;
  }
 
  @Override
  public int update(CategrpVO categrpVO) {
    int cnt = 0;
    cnt = this.mapper.update(categrpVO);
    
    return cnt;
  }
 
  @Override
  public int delete(int categrpno) {
    int cnt = 0;
    cnt = this.mapper.delete(categrpno);
    
    return cnt;
  }
 
  @Override
  public int update_seqno_up(int categrpno) {
    int cnt = 0;
    cnt = this.mapper.update_seqno_up(categrpno);
    
    return cnt;
  }
 
  @Override
  public int update_seqno_down(int categrpno) {
    int cnt = 0;
    cnt = this.mapper.update_seqno_down(categrpno);    
    return cnt;
  }
 
	@Override
	public int update_visible(Map map) {
		String visible = (String)map.get("visible");
		if(visible.toUpperCase().equals("Y")) {
			map.put("visible", "N");
		}else {
			map.put("visible", "Y");
		}
		return mapper.update_visible(map);
	}
  
}

