/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.TilesLeft;

/**
 * @author DungNV
 *
 */
public interface TilesLeftDao {

    void updateTilesLeft(TilesLeft tilesLeft);

    TilesLeft getDefaultTilesLeft();
}
