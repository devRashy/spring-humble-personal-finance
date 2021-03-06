package com.pmz.humble.interfaces.impl.categories;

import com.pmz.humble.constants.HumbleConstants;
import com.pmz.humble.interfaces.Category;

public class MerchandiseCategory implements Category {

	public static final int CATEGORY_ID = 3;
	
	@Override
	public int getId() {
		return CATEGORY_ID;
	}
	
	@Override
	public boolean isIncome() {
		return false;
	}

	@Override
	public String getName() {
		return HumbleConstants.MERCHANDISE_CATEGORY_NAME;
	}

}
