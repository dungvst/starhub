/**
 * 
 */
package com.starhub.service;

import com.starhub.model.TilesLeft;

/**
 * @author DungNV
 *
 */
public interface TilesLeftService {

    void updateTilesLeft(TilesLeft tilesLeft);

    TilesLeft getDefaultTilesLeft();
}
