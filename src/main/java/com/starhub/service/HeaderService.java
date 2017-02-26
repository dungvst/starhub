
package com.starhub.service;

import com.starhub.model.HeaderSection;

/**
 * @author DungNV
 *
 */
public interface HeaderService {

    HeaderSection updateHeaderSection(HeaderSection headerSection);

    HeaderSection getDefaultHeaderSection();
}
