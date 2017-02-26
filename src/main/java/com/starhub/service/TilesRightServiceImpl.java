/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.TilesRightDao;
import com.starhub.model.TilesRight;

/**
 * @author DungNV
 *
 */
@Repository("tilesRightService")
@Transactional
public class TilesRightServiceImpl implements TilesRightService {

    @Autowired
    private TilesRightDao tilesRightDao;

    @Override
    public TilesRight updateTilesRight(TilesRight tilesRight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TilesRight getDefaultTilesRight() {
        return tilesRightDao.getDefaultTilesRight();
    }

}
