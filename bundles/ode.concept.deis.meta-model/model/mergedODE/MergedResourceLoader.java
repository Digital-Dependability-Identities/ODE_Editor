/*******************************************************************************
 * Copyright (c) 2018 DEIS Project
 * Copyright (c) 2020 PANORAMA Project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the MIT License, available at: 
 * https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 *******************************************************************************/
package mergedODE;

import java.net.URI;
import java.net.URISyntaxException;

public class MergedResourceLoader {

	public static URI getEcoreUri(String ecoreFileName) throws URISyntaxException{
		
		URI ecoreUri = MergedResourceLoader.class.getResource(ecoreFileName).toURI();
		return ecoreUri;
	}
	
	public static String getEcorePath(String ecoreFileName) throws URISyntaxException{
		
		URI ecoreUri = getEcoreUri(ecoreFileName);
		return ecoreUri.getPath();
	}
	
}
