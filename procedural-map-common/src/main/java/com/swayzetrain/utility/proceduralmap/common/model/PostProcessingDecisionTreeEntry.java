package com.swayzetrain.utility.proceduralmap.common.model;

import com.swayzetrain.utility.proceduralmap.common.enums.PostProcessedTileType;
import com.swayzetrain.utility.proceduralmap.common.enums.TileCategory;

public class PostProcessingDecisionTreeEntry {

	private TileCategory upperLeftTile;
	private TileCategory upperMiddleTile;
	private TileCategory upperRightTile;
	private TileCategory middleLeftTile;
	private TileCategory middleTile;
	private TileCategory middleRightTile;
	private TileCategory bottomLeftTile;
	private TileCategory bottomMiddleTile;
	private TileCategory bottomRightTile;
	private PostProcessedTileType resultTile;

	public PostProcessingDecisionTreeEntry(TileCategory upperLeftTile, TileCategory upperMiddleTile,
			TileCategory upperRightTile, TileCategory middleLeftTile, TileCategory middleTile,
			TileCategory middleRightTile, TileCategory bottomLeftTile, TileCategory bottomMiddleTile,
			TileCategory bottomRightTile, PostProcessedTileType resultTile) {
		super();
		this.upperLeftTile = upperLeftTile;
		this.upperMiddleTile = upperMiddleTile;
		this.upperRightTile = upperRightTile;
		this.middleLeftTile = middleLeftTile;
		this.middleTile = middleTile;
		this.middleRightTile = middleRightTile;
		this.bottomLeftTile = bottomLeftTile;
		this.bottomMiddleTile = bottomMiddleTile;
		this.bottomRightTile = bottomRightTile;
		this.resultTile = resultTile;
	}

	public TileCategory getUpperLeftTile() {
		return upperLeftTile;
	}

	public void setUpperLeftTile(TileCategory upperLeftTile) {
		this.upperLeftTile = upperLeftTile;
	}

	public TileCategory getUpperMiddleTile() {
		return upperMiddleTile;
	}

	public void setUpperMiddleTile(TileCategory upperMiddleTile) {
		this.upperMiddleTile = upperMiddleTile;
	}

	public TileCategory getUpperRightTile() {
		return upperRightTile;
	}

	public void setUpperRightTile(TileCategory upperRightTile) {
		this.upperRightTile = upperRightTile;
	}

	public TileCategory getMiddleLeftTile() {
		return middleLeftTile;
	}

	public void setMiddleLeftTile(TileCategory middleLeftTile) {
		this.middleLeftTile = middleLeftTile;
	}

	public TileCategory getMiddleTile() {
		return middleTile;
	}

	public void setMiddleTile(TileCategory middleTile) {
		this.middleTile = middleTile;
	}

	public TileCategory getMiddleRightTile() {
		return middleRightTile;
	}

	public void setMiddleRightTile(TileCategory middleRightTile) {
		this.middleRightTile = middleRightTile;
	}

	public TileCategory getBottomLeftTile() {
		return bottomLeftTile;
	}

	public void setBottomLeftTile(TileCategory bottomLeftTile) {
		this.bottomLeftTile = bottomLeftTile;
	}

	public TileCategory getBottomMiddleTile() {
		return bottomMiddleTile;
	}

	public void setBottomMiddleTile(TileCategory bottomMiddleTile) {
		this.bottomMiddleTile = bottomMiddleTile;
	}

	public TileCategory getBottomRightTile() {
		return bottomRightTile;
	}

	public void setBottomRightTile(TileCategory bottomRightTile) {
		this.bottomRightTile = bottomRightTile;
	}

	public PostProcessedTileType getResultTile() {
		return resultTile;
	}

	public void setResultTile(PostProcessedTileType resultTile) {
		this.resultTile = resultTile;
	}

}
