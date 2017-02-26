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

    TilesRight updateTilesRight(TilesRight tilesRight);

    TilesRight getDefaultTilesRight();
}
