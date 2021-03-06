package com.gildedrose;

public class BackstageItem extends GildedRoseItem {

	public BackstageItem(Item item) {
		super(item);
	}

	@Override
	void updateQuality() {
		if (item.quality < GildedRoseItem.MAX_QUALITY) {
			item.quality = item.quality + 1;

			if (item.sellIn < 11) {
				if (item.quality < GildedRoseItem.MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}

			if (item.sellIn < 6) {
				if (item.quality < GildedRoseItem.MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
		}
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}

	@Override
	void updateSellIn() {
		item.sellIn = item.sellIn - 1;
	}

}
