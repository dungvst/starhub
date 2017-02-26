/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.TilesRight;

/**
 * @author DungNV
 *
 */
public interface TilesRightDao {

    void updateTilesRight(TilesRight tilesRight);

    TilesRight getDefaultTilesRight();
}
