package com.gildedrose;

public class GildedRoseItemFactory {
	
	private static GildedRoseItemFactory instance;

	private GildedRoseItemFactory() {
		
	}
	
	public static synchronized GildedRoseItemFactory getInstance() {
		if(instance == null) {
			instance = new GildedRoseItemFactory();
		}
		return instance;
	}
	
	GildedRoseItem createGildedRoseItem(Item item) {
		GildedRoseItem gildedRoseItem;
		if (item.name.equals(GildedRoseItem.AGED_BRIE)) {
			gildedRoseItem = new AgedBrieItem(item);
		} else if (item.name.equals(GildedRoseItem.BACKSTAGE_PASSES)) {
			gildedRoseItem = new BackstageItem(item);
		} else if (item.name.equals(GildedRoseItem.SULFURAS)) {
			gildedRoseItem = new SulfurasItem(item);
		} else {
			gildedRoseItem = new NormalItem(item);
		}
		return gildedRoseItem;
	}

}
