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
 * Script Name   : <b>Main</b><br>
 * Generated     : <b>2018/07/20 12:15:29 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  July 20, 2018
 * @author Jhansi.m
 */
public abstract class MainHelper extends RationalTestScript
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
	 * Google: with default state.
	 *		.title : Google
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.google.co.in/
	 */
	protected DocumentTestObject document_google() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_google"));
	}
	/**
	 * Google: with specific test context and state.
	 *		.title : Google
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://www.google.co.in/
	 */
	protected DocumentTestObject document_google(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_google"), anchor, flags);
	}
	
	/**
	 * Cleartrip: with default state.
	 *		.text : Cleartrip
	 * 		.id : 
	 * 		.href : https://www.cleartrip.com/
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_cleartrip() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_cleartrip"));
	}
	/**
	 * Cleartrip: with specific test context and state.
	 *		.text : Cleartrip
	 * 		.id : 
	 * 		.href : https://www.cleartrip.com/
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_cleartrip(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_cleartrip"), anchor, flags);
	}
	
	/**
	 * Search: with default state.
	 *		.id : lst-ib
	 * 		.type : text
	 * 		.title : Search
	 * 		.class : Html.INPUT.text
	 * 		.name : q
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_search() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_search"));
	}
	/**
	 * Search: with specific test context and state.
	 *		.id : lst-ib
	 * 		.type : text
	 * 		.title : Search
	 * 		.class : Html.INPUT.text
	 * 		.name : q
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_search(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_search"), anchor, flags);
	}
	
	

	protected MainHelper()
	{
		setScriptName("Main");
	}
	
}

