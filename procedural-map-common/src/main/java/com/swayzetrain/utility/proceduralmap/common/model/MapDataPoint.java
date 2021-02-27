package com.swayzetrain.utility.proceduralmap.common.model;

import com.swayzetrain.utility.proceduralmap.common.enums.PostProcessedTileType;
import com.swayzetrain.utility.proceduralmap.common.enums.TileCategory;

public class MapDataPoint {
	
	TileCategory tileCategory;
	PostProcessedTileType postProcessedTileType;

	public TileCategory getTileCategory() {
		return tileCategory;
	}

	public void setTileCategory(TileCategory tileCategory) {
		this.tileCategory = tileCategory;
	}

	public PostProcessedTileType getPostProcessedTileType() {
		return postProcessedTileType;
	}

	public void setPostProcessedTileType(PostProcessedTileType postProcessedTileType) {
		this.postProcessedTileType = postProcessedTileType;
	}

}
