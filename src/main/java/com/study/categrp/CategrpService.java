package com.study.categrp;
 
import java.util.List;
import java.util.Map;
 
public interface CategrpService {
  int create(CategrpVO categrpVO);
 
  List<CategrpVO> list_seqno_asc();
 
  CategrpVO read(int categrpno);
 
  int update(CategrpVO categrpVO);
 
  int delete(int categrpno);
 
  int update_seqno_up(int categrpno);
 
  int update_seqno_down(int categrpno);
 
  int update_visible(Map map);
 
}