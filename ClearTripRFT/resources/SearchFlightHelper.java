// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>SearchFlight</b><br>
 * Generated     : <b>2018/07/19 3:05:57 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  July 19, 2018
 * @author Jhansi.m
 */
public abstract class SearchFlightHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * BookSubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_bookSubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_bookSubmit"));
	}
	/**
	 * BookSubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_bookSubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_bookSubmit"), anchor, flags);
	}
	
	/**
	 * ContinueBookingbutton: with default state.
	 *		.id : itineraryBtn
	 * 		.type : button
	 * 		.value : Continue booking
	 * 		.title : 
	 * 		.class : Html.INPUT.button
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continueBookingbutton() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continueBookingbutton"));
	}
	/**
	 * ContinueBookingbutton: with specific test context and state.
	 *		.id : itineraryBtn
	 * 		.type : button
	 * 		.value : Continue booking
	 * 		.title : 
	 * 		.class : Html.INPUT.button
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continueBookingbutton(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continueBookingbutton"), anchor, flags);
	}
	
	/**
	 * Continuebutton: with default state.
	 *		.id : travellerBtn
	 * 		.type : button
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.INPUT.button
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continuebutton() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuebutton"));
	}
	/**
	 * Continuebutton: with specific test context and state.
	 *		.id : travellerBtn
	 * 		.type : button
	 * 		.value : Continue
	 * 		.title : 
	 * 		.class : Html.INPUT.button
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_continuebutton(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_continuebutton"), anchor, flags);
	}
	
	/**
	 * SearchFlightssubmit: with default state.
	 *		.id : SearchBtn
	 * 		.type : submit
	 * 		.value : Search flights
	 * 		.title : Search flights
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_searchFlightssubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_searchFlightssubmit"));
	}
	/**
	 * SearchFlightssubmit: with specific test context and state.
	 *		.id : SearchBtn
	 * 		.type : submit
	 * 		.value : Search flights
	 * 		.title : Search flights
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_searchFlightssubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_searchFlightssubmit"), anchor, flags);
	}
	
	/**
	 * insuranceConfirmon: with default state.
	 *		.id : insurance_confirm
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : insuranceConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_insuranceConfirmon() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_insuranceConfirmon"));
	}
	/**
	 * insuranceConfirmon: with specific test context and state.
	 *		.id : insurance_confirm
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : insuranceConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_insuranceConfirmon(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_insuranceConfirmon"), anchor, flags);
	}
	
	/**
	 * insuranceConfirmon: with default state.
	 *		.id : insurance_confirm
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : insuranceConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_insuranceConfirmon2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_insuranceConfirmon2"));
	}
	/**
	 * insuranceConfirmon: with specific test context and state.
	 *		.id : insurance_confirm
	 * 		.type : checkbox
	 * 		.value : on
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : insuranceConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_insuranceConfirmon2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_insuranceConfirmon2"), anchor, flags);
	}
	
	/**
	 * _1SiteForBookingFlightsHotelsPackagesTrainsLocalAc: with default state.
	 *		.title : #1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/
	 */
	protected DocumentTestObject document__1SiteForBookingFligh() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document__1SiteForBookingFligh"));
	}
	/**
	 * _1SiteForBookingFlightsHotelsPackagesTrainsLocalAc: with specific test context and state.
	 *		.title : #1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/
	 */
	protected DocumentTestObject document__1SiteForBookingFligh(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document__1SiteForBookingFligh"), anchor, flags);
	}
	
	/**
	 * CleartripBookYourFlightSecurelyInSimpleSteps: with default state.
	 *		.title : Cleartrip | Book your flight securely in simple steps
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/flights/itinerary/68e123c400-e016-4469-969b-97b8620bb5 ...
	 */
	protected DocumentTestObject document_cleartripBookYourFlig() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_cleartripBookYourFlig"));
	}
	/**
	 * CleartripBookYourFlightSecurelyInSimpleSteps: with specific test context and state.
	 *		.title : Cleartrip | Book your flight securely in simple steps
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/flights/itinerary/68e123c400-e016-4469-969b-97b8620bb5 ...
	 */
	protected DocumentTestObject document_cleartripBookYourFlig(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_cleartripBookYourFlig"), anchor, flags);
	}
	
	/**
	 * CleartripBookYourFlightSecurelyInSimpleSteps: with default state.
	 *		.title : Cleartrip | Book your flight securely in simple steps
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/flights/itinerary/689a95dfab-82b4-410c-aaec-0b90cf6a3e ...
	 */
	protected DocumentTestObject document_cleartripBookYourFlig2() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_cleartripBookYourFlig2"));
	}
	/**
	 * CleartripBookYourFlightSecurelyInSimpleSteps: with specific test context and state.
	 *		.title : Cleartrip | Book your flight securely in simple steps
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.cleartrip.com/flights/itinerary/689a95dfab-82b4-410c-aaec-0b90cf6a3e ...
	 */
	protected DocumentTestObject document_cleartripBookYourFlig2(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_cleartripBookYourFlig2"), anchor, flags);
	}
	
	/**
	 * ccTitle: with default state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle"));
	}
	/**
	 * ccTitle: with specific test context and state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle"), anchor, flags);
	}
	
	/**
	 * ccTitle: with default state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle2"));
	}
	/**
	 * ccTitle: with specific test context and state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle2"), anchor, flags);
	}
	
	/**
	 * ccTitle: with default state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle3() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle3"));
	}
	/**
	 * ccTitle: with specific test context and state.
	 *		.id : ccTitle
	 * 		.title : 
	 * 		.class : Html.H6
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_ccTitle3(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_ccTitle3"), anchor, flags);
	}
	
	/**
	 * paymentBlock: with default state.
	 *		.id : paymentBlock
	 * 		.title : 
	 * 		.class : Html.SECTION
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_paymentBlock() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_paymentBlock"));
	}
	/**
	 * paymentBlock: with specific test context and state.
	 *		.id : paymentBlock
	 * 		.title : 
	 * 		.class : Html.SECTION
	 * 		.classIndex : 2
	 */
	protected GuiTestObject html_paymentBlock(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_paymentBlock"), anchor, flags);
	}
	
	/**
	 * paymentOpen: with default state.
	 *		.id : paymentOpen
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_paymentOpen() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_paymentOpen"));
	}
	/**
	 * paymentOpen: with specific test context and state.
	 *		.id : paymentOpen
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_paymentOpen(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_paymentOpen"), anchor, flags);
	}
	
	/**
	 * CleartripIndiaSFavouriteFlightsAndHotelsBookingAgency: with default state.
	 *		.alt : Cleartrip: India's Favourite Flights and Hotels Booking Agency
	 * 		.id : 
	 * 		.src : https://www.cleartrip.com/images/brand/cleartrip_logo_book.png
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_cleartripIndiaSFavourite() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_cleartripIndiaSFavourite"));
	}
	/**
	 * CleartripIndiaSFavouriteFlightsAndHotelsBookingAgency: with specific test context and state.
	 *		.alt : Cleartrip: India's Favourite Flights and Hotels Booking Agency
	 * 		.id : 
	 * 		.src : https://www.cleartrip.com/images/brand/cleartrip_logo_book.png
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_cleartripIndiaSFavourite(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_cleartripIndiaSFavourite"), anchor, flags);
	}
	
	/**
	 * _YesIAcceptTheTermsAndConditionsOfThePolicyOnlyFor: with default state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label__YesIAcceptTheTermsAndCo() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label__YesIAcceptTheTermsAndCo"));
	}
	/**
	 * _YesIAcceptTheTermsAndConditionsOfThePolicyOnlyFor: with specific test context and state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label__YesIAcceptTheTermsAndCo(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label__YesIAcceptTheTermsAndCo"), anchor, flags);
	}
	
	/**
	 * _31: with default state.
	 *		.text : 31
	 * 		.id : 
	 * 		.href : javascript:void(0);
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 30
	 */
	protected GuiTestObject link__31() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link__31"));
	}
	/**
	 * _31: with specific test context and state.
	 *		.text : 31
	 * 		.id : 
	 * 		.href : javascript:void(0);
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 30
	 */
	protected GuiTestObject link__31(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link__31"), anchor, flags);
	}
	
	/**
	 * Clear: with default state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : javascript:void(0)
	 * 		.title : Clear
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_clear() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clear"));
	}
	/**
	 * Clear: with specific test context and state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : javascript:void(0)
	 * 		.title : Clear
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_clear(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clear"), anchor, flags);
	}
	
	/**
	 * Clear: with default state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : javascript:void(0)
	 * 		.title : Clear
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject link_clear2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clear2"));
	}
	/**
	 * Clear: with specific test context and state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : javascript:void(0)
	 * 		.title : Clear
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject link_clear2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_clear2"), anchor, flags);
	}
	
	/**
	 * HtmlA: with default state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : https://www.cleartrip.com/flights/results?from=BLR&to=DEL&depart_date=31/08/2018 ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_htmlA() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_htmlA"));
	}
	/**
	 * HtmlA: with specific test context and state.
	 *		.text : 
	 * 		.id : 
	 * 		.href : https://www.cleartrip.com/flights/results?from=BLR&to=DEL&depart_date=31/08/2018 ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_htmlA(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_htmlA"), anchor, flags);
	}
	
	/**
	 * HtmlA: with default state.
	 *		.text : 
	 * 		.href : https://www.cleartrip.com/flights/results?from=BLR&to=DEL&depart_date=31/08/2018 ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_htmlA2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_htmlA2"));
	}
	/**
	 * HtmlA: with specific test context and state.
	 *		.text : 
	 * 		.href : https://www.cleartrip.com/flights/results?from=BLR&to=DEL&depart_date=31/08/2018 ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_htmlA2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_htmlA2"), anchor, flags);
	}
	
	/**
	 * MoreSearchOptions: with default state.
	 *		.text :         More options: Class of travel, Airline preference
	 * 		.id : MoreOptionsLink
	 * 		.href : javascript:void(0);
	 * 		.title : More search options
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_moreSearchOptions() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_moreSearchOptions"));
	}
	/**
	 * MoreSearchOptions: with specific test context and state.
	 *		.text :         More options: Class of travel, Airline preference
	 * 		.id : MoreOptionsLink
	 * 		.href : javascript:void(0);
	 * 		.title : More search options
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_moreSearchOptions(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_moreSearchOptions"), anchor, flags);
	}
	
	/**
	 * uiId10: with default state.
	 *		.text : Bangalore, IN - Kempegowda International Airport (BLR)
	 * 		.id : ui-id-10
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId10() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId10"));
	}
	/**
	 * uiId10: with specific test context and state.
	 *		.text : Bangalore, IN - Kempegowda International Airport (BLR)
	 * 		.id : ui-id-10
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId10(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId10"), anchor, flags);
	}
	
	/**
	 * uiId22: with default state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-22
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId22() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId22"));
	}
	/**
	 * uiId22: with specific test context and state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-22
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId22(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId22"), anchor, flags);
	}
	
	/**
	 * uiId27: with default state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-27
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId27() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId27"));
	}
	/**
	 * uiId27: with specific test context and state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-27
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId27(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId27"), anchor, flags);
	}
	
	/**
	 * uiId28: with default state.
	 *		.text : Bangalore, IN - Kempegowda International Airport (BLR)
	 * 		.id : ui-id-28
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId28() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId28"));
	}
	/**
	 * uiId28: with specific test context and state.
	 *		.text : Bangalore, IN - Kempegowda International Airport (BLR)
	 * 		.id : ui-id-28
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId28(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId28"), anchor, flags);
	}
	
	/**
	 * uiId54: with default state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-54
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId54() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId54"));
	}
	/**
	 * uiId54: with specific test context and state.
	 *		.text : New Delhi, IN - Indira Gandhi Airport (DEL)
	 * 		.id : ui-id-54
	 * 		.href : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_uiId54(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_uiId54"), anchor, flags);
	}
	
	/**
	 * Adult1STitle: with default state.
	 *		.text : Title Mr Ms Mrs
	 * 		.id : AdultTitle1
	 * 		.title : Adult 1's title
	 * 		.class : Html.SELECT
	 * 		.name : AdultTitle1
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_adult1STitle() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_adult1STitle"));
	}
	/**
	 * Adult1STitle: with specific test context and state.
	 *		.text : Title Mr Ms Mrs
	 * 		.id : AdultTitle1
	 * 		.title : Adult 1's title
	 * 		.class : Html.SELECT
	 * 		.name : AdultTitle1
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_adult1STitle(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_adult1STitle"), anchor, flags);
	}
	
	/**
	 * Adult1STitle: with default state.
	 *		.text : Title Mr Ms Mrs
	 * 		.id : AdultTitle1
	 * 		.title : Adult 1's title
	 * 		.class : Html.SELECT
	 * 		.name : AdultTitle1
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_adult1STitle2() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_adult1STitle2"));
	}
	/**
	 * Adult1STitle: with specific test context and state.
	 *		.text : Title Mr Ms Mrs
	 * 		.id : AdultTitle1
	 * 		.title : Adult 1's title
	 * 		.class : Html.SELECT
	 * 		.name : AdultTitle1
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_adult1STitle2(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_adult1STitle2"), anchor, flags);
	}
	
	/**
	 * class: with default state.
	 *		.text : Economy Business First Premium Economy
	 * 		.id : Class
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : class
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_class() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_class"));
	}
	/**
	 * class: with specific test context and state.
	 *		.text : Economy Business First Premium Economy
	 * 		.id : Class
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : class
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_class(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_class"), anchor, flags);
	}
	
	/**
	 * Adult1SFirstName: with default state.
	 *		.id : AdultFname1
	 * 		.type : text
	 * 		.title : Adult 1's first name
	 * 		.class : Html.INPUT.text
	 * 		.name : AdultFname1
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_adult1SFirstName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_adult1SFirstName"));
	}
	/**
	 * Adult1SFirstName: with specific test context and state.
	 *		.id : AdultFname1
	 * 		.type : text
	 * 		.title : Adult 1's first name
	 * 		.class : Html.INPUT.text
	 * 		.name : AdultFname1
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_adult1SFirstName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_adult1SFirstName"), anchor, flags);
	}
	
	/**
	 * Adult1SLastName: with default state.
	 *		.id : AdultLname1
	 * 		.type : text
	 * 		.title : Adult 1's last name
	 * 		.class : Html.INPUT.text
	 * 		.name : AdultLname1
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_adult1SLastName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_adult1SLastName"));
	}
	/**
	 * Adult1SLastName: with specific test context and state.
	 *		.id : AdultLname1
	 * 		.type : text
	 * 		.title : Adult 1's last name
	 * 		.class : Html.INPUT.text
	 * 		.name : AdultLname1
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_adult1SLastName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_adult1SLastName"), anchor, flags);
	}
	
	/**
	 * AnyWorldwideCityOrAirport: with default state.
	 *		.id : FromTag
	 * 		.type : text
	 * 		.title : Any worldwide city or airport
	 * 		.class : Html.INPUT.text
	 * 		.name : origin
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_anyWorldwideCityOrAirport() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_anyWorldwideCityOrAirport"));
	}
	/**
	 * AnyWorldwideCityOrAirport: with specific test context and state.
	 *		.id : FromTag
	 * 		.type : text
	 * 		.title : Any worldwide city or airport
	 * 		.class : Html.INPUT.text
	 * 		.name : origin
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_anyWorldwideCityOrAirport(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_anyWorldwideCityOrAirport"), anchor, flags);
	}
	
	/**
	 * creditCardNumberDisp: with default state.
	 *		.id : creditCardNumberDisp
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_creditCardNumberDisp() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_creditCardNumberDisp"));
	}
	/**
	 * creditCardNumberDisp: with specific test context and state.
	 *		.id : creditCardNumberDisp
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_creditCardNumberDisp(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_creditCardNumberDisp"), anchor, flags);
	}
	
	/**
	 * DepartDate: with default state.
	 *		.id : DepartDate
	 * 		.type : text
	 * 		.title : Depart date
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_departDate() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_departDate"));
	}
	/**
	 * DepartDate: with specific test context and state.
	 *		.id : DepartDate
	 * 		.type : text
	 * 		.title : Depart date
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_departDate(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_departDate"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point ccTitle_text object in the SUT.
	 */
	protected IFtVerificationPoint ccTitle_textVP() 
	{
		return vp("ccTitle_text");
	}
	protected IFtVerificationPoint ccTitle_textVP(TestObject anchor)
	{
		return vp("ccTitle_text", anchor);
	}
	
	/**
	 * Locate and return the verification point HtmlA_standard object in the SUT.
	 */
	protected IFtVerificationPoint HtmlA_standardVP() 
	{
		return vp("HtmlA_standard");
	}
	protected IFtVerificationPoint HtmlA_standardVP(TestObject anchor)
	{
		return vp("HtmlA_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point insuranceConfirmon_state object in the SUT.
	 */
	protected IFtVerificationPoint insuranceConfirmon_stateVP() 
	{
		return vp("insuranceConfirmon_state");
	}
	protected IFtVerificationPoint insuranceConfirmon_stateVP(TestObject anchor)
	{
		return vp("insuranceConfirmon_state", anchor);
	}
	
	/**
	 * Locate and return the verification point _YesIAcceptTheTermsAndConditio_text object in the SUT.
	 */
	protected IFtVerificationPoint _YesIAcceptTheTermsAndConditio_textVP() 
	{
		return vp("_YesIAcceptTheTermsAndConditio_text");
	}
	protected IFtVerificationPoint _YesIAcceptTheTermsAndConditio_textVP(TestObject anchor)
	{
		return vp("_YesIAcceptTheTermsAndConditio_text", anchor);
	}
	
	

	protected SearchFlightHelper()
	{
		setScriptName("SearchFlight");
	}
	
}

