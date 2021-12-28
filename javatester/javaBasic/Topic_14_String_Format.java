package javaBasic;

public class Topic_14_String_Format {
	public static String ADRESS_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static String CUSTOMER_INFO_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Customer info']";
	public static String REWARD_POINT_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Reward points']";
	public static String CHANGE_PASSWORD_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Change password']";
	public static String MY_PRODUCT_REVIEW_LINK = "//div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	
	// tạo 1 biến cho cả 5 page hoặc n page(format giống nhau chỉ khác nhau bởi tên page)
	// tên page sẽ được điền vào '%s'(đại diện cho String)
	public static String DYNAMIC_LINK_BY_PAGENAME = "//div[contains(@class,'account-navigation')]//a[text()='%s']";
	public static String DYNAMIC_AREA_LINK_BY_PAGENAME = "//div[contains(@class,'%s')]//a[text()='%s']";
	
	public static void main(String[] args) {
		clickToSideBarLink(DYNAMIC_LINK_BY_PAGENAME, "Addresses");
		clickToSideBarLink(DYNAMIC_LINK_BY_PAGENAME, "Customer info");
		clickToSideBarLink(DYNAMIC_AREA_LINK_BY_PAGENAME, "footer-upper", "Sitemap");
		clickToSideBarLink(DYNAMIC_AREA_LINK_BY_PAGENAME, "footer-upper", "Search");
		clickToSideBarLink(DYNAMIC_AREA_LINK_BY_PAGENAME, "header-menu" , "Computers ");
	}
	// 1 tham số động
	public static void clickToSideBarLink(String dynamicLocator, String pageName) {
		String.format(dynamicLocator, pageName);
		System.out.println(String.format(dynamicLocator, pageName));
	}
	// 2 tham số động
	public static void clickToSideBarLink(String dynamicLocator,String areaName, String pageName) {
		String.format(dynamicLocator,areaName, pageName);
		System.out.println(String.format(dynamicLocator,areaName, pageName));
	}
	// n tham số động
	public static void clickToSideBarLink(String dynamicLocator,String... params) {
		String locator =String.format(dynamicLocator, (Object[])params);
		System.out.println(locator);
	}
	



}
