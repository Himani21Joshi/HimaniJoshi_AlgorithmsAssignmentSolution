package com.greatlearning.stock;

class Stock extends stockmanage {
		
	    public Double price;
		public Boolean isPriceRose;

		public Stock(Double _price, Boolean _isPriceRose) {
			this.price = _price;
			this.isPriceRose = _isPriceRose;
		}
	}