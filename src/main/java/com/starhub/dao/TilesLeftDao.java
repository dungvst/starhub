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

    TilesLeft updateTilesLeft(TilesLeft tilesLeft);

    TilesLeft getDefaultTilesLeft();
}
