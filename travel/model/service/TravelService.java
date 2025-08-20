package com.multi.travel.model.service;

import com.multi.travel.model.dao.TravelDao;
import com.multi.travel.model.dao.TravelVO;

import java.util.List;

public class TravelService {
    private TravelDao dao = new TravelDao();

    public void addTravel(TravelVO vo) {
        dao.insert(vo);
    }

    public List<TravelVO> getAll(int page, int size) {
        return dao.findAll(page, size);
    }

    public List<TravelVO> getByDistrict(String district) {
        return dao.findByDistrict(district);
    }

    public List<TravelVO> search(String keyword) {
        return dao.search(keyword);
    }
}
