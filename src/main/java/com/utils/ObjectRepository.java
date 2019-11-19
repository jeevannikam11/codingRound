package com.utils;

/**
 * @author Jeevan.Nikam
 *
 */
public class ObjectRepository {
	
	protected static class HomeScreen {
		
		public static final String yourTrips_Id = "userAccountLink";
		public static final String signInButton_Id = "SignIn";
		
		public static class SearchFlights {
			
			public static final String searchFlightsOneWay_Id = "OneWay";
			public static final String searchFlightsFromTag_Id = "FromTag";
			public static final String selectFromCity_Id = "ui-id-1";
			public static final String selectFromCityFromList_TagName = "li";
			public static final String searchFlightsToTag_Id = "ToTag";
			public static final String selectToCity_Id = "ui-id-2";
			public static final String selectToCityFromList_TagName = "li";
			public static final String departOn_Id = "DepartDate";
			public static final String searchFlightsDepartDate_Xpath = "//*[@id='ui-datepicker-div']/div[2]//table/tbody/tr[3]/td[7]/a";
			public static final String searchFlightsSearchButton_Id = "SearchBtn";
			public static final String searchFlightsSearchSummary_ClaasName = "searchSummary";
		}
		
		public static class SearchForHotels {
			
			public static final String hotelsLink_LinkText = "Hotels";
			public static final String enterLocality_Id = "Tags";
			public static final String selectCity_LinkText = "Indiranagar, Bangalore, Karnataka, India";
			public static final String checkInDate_Id = "CheckInDate";
			public static final String calenderCheckInDate_Xpath = "//*[@id='ui-datepicker-div']/div[2]//table/tbody/tr[3]/td[7]/a";
			public static final String checkOutDate_Id = "CheckOutDate";
			public static final String calenderCheckOutDate_Xpath = "//*[@id='ui-datepicker-div']/div[1]//table/tbody/tr[4]/td[7]/a";
			public static final String selectTravellers_Id = "travellersOnhome";
			public static final String searchButton_Id = "SearchHotelsButton";
			public static final String modifySearchLink_Xpath = "//div[@id='ResultContainer_1_1']//a[@id='modifySearchLink']";
		}
		
		public static class SignInScreen {
			
			public static final String userName_Id = "email";
			public static final String password_Id = "password";
			public static final String signInButton_Id = "signInButton";
			public static final String errorMessage_Id = "errors1";
			public static final String closeButton_Id = "close";
		}
	}

}
