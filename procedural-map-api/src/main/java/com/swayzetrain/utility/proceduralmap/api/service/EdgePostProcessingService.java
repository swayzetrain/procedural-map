package com.swayzetrain.utility.proceduralmap.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swayzetrain.utility.proceduralmap.common.component.PostProcessingDecisionTreeComponent;
import com.swayzetrain.utility.proceduralmap.common.enums.PostProcessedTileType;
import com.swayzetrain.utility.proceduralmap.common.enums.TileCategory;
import com.swayzetrain.utility.proceduralmap.common.model.MapDataPoint;

@Service
public class EdgePostProcessingService {

	@Autowired
	private PostProcessingDecisionTreeComponent postProcessingDecisionTreeComponent;

	public void postProcessMapEdges(MapDataPoint[][] mapData) {

		for (int y = 0; y < mapData.length; y++) {
			for (int x = 0; x < mapData[y].length; x++) {
					
				TileCategory upperLeft = (y == 0 || x == 0) ? TileCategory.WALL
						: mapData[y - 1][x - 1].getTileCategory();
				TileCategory upperMid = (y == 0) ? TileCategory.WALL : mapData[y - 1][x].getTileCategory();
				TileCategory upperRight = (y == 0 || x == (mapData[y].length - 1)) ? TileCategory.WALL
						: mapData[y - 1][x + 1].getTileCategory();
				TileCategory middleLeft = (x == 0) ? TileCategory.WALL : mapData[y][x - 1].getTileCategory();
				TileCategory middleMiddle = mapData[y][x].getTileCategory();
				TileCategory middleRight = (x == (mapData[y].length - 1)) ? TileCategory.WALL
						: mapData[y][x + 1].getTileCategory();
				TileCategory bottomLeft = (y == (mapData.length - 1) || x == 0) ? TileCategory.WALL
						: mapData[y + 1][x - 1].getTileCategory();
				TileCategory bottomMid = (y == (mapData.length - 1)) ? TileCategory.WALL
						: mapData[y + 1][x].getTileCategory();
				TileCategory bottomRight = (y == (mapData.length - 1) || x == (mapData[y].length - 1)) ? TileCategory.WALL
						: mapData[y + 1][x + 1].getTileCategory();
				
					
				PostProcessedTileType postProcessedTileType;
				
				switch (middleMiddle) {
					case PATH:
						postProcessedTileType = postProcessingDecisionTreeComponent
						.getPostProcessingDecisionTreePathCollection().stream()
						.filter(z -> z.getUpperLeftTile() == upperLeft)
						.filter(z -> z.getUpperMiddleTile() == upperMid)
						.filter(z -> z.getUpperRightTile() == upperRight)
						.filter(z -> z.getMiddleLeftTile() == middleLeft)
						.filter(z -> z.getMiddleTile() == middleMiddle)
						.filter(z -> z.getMiddleRightTile() == middleRight)
						.filter(z -> z.getBottomLeftTile() == bottomLeft)
						.filter(z -> z.getBottomMiddleTile() == bottomMid)
						.filter(z -> z.getBottomRightTile() == bottomRight).findFirst().get().getResultTile();

				mapData[y][x].setPostProcessedTileType(postProcessedTileType);
						break;
					case WALL:
							postProcessedTileType = postProcessingDecisionTreeComponent
									.getPostProcessingDecisionTreeWallCollection().stream()
									.filter(z -> z.getUpperLeftTile() == upperLeft)
									.filter(z -> z.getUpperMiddleTile() == upperMid)
									.filter(z -> z.getUpperRightTile() == upperRight)
									.filter(z -> z.getMiddleLeftTile() == middleLeft)
									.filter(z -> z.getMiddleTile() == middleMiddle)
									.filter(z -> z.getMiddleRightTile() == middleRight)
									.filter(z -> z.getBottomLeftTile() == bottomLeft)
									.filter(z -> z.getBottomMiddleTile() == bottomMid)
									.filter(z -> z.getBottomRightTile() == bottomRight).findFirst().get().getResultTile();
	
							mapData[y][x].setPostProcessedTileType(postProcessedTileType);
						break;
				}

			}
		}

	}

}
