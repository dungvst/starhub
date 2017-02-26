/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.TilesLeftDao;
import com.starhub.model.TilesLeft;

/**
 * @author DungNV
 *
 */
@Repository("tilesLeftService")
@Transactional
public class TilesLeftServiceImpl implements TilesLeftService {

    @Autowired
    private TilesLeftDao tilesLeftDao;

    @Override
    public void updateTilesLeft(TilesLeft tilesLeft) {
        tilesLeftDao.updateTilesLeft(tilesLeft);
    }

    @Override
    public TilesLeft getDefaultTilesLeft() {
        return tilesLeftDao.getDefaultTilesLeft();
    }

}
