# Selenium_Java
"Selenium WebDriver with Java -Basics to Advanced+Frameworks" - training on UDEMY

topics:

	selectors
		By
			.partialLinkText - "Assignment3ExplicitWait.java"
			.className - "Calendar.java"
		parent to child traversing by css  - "Assignment3ExplicitWait.java"
		parent-child relatioship xpath - "DynamicDropDown.java", "e2e.java"
	enter data - .send.Keys
	grab element text - .getText
	compare - .equalsIgnoreCase
	variables
		string
	assertions:
		Assert.assertFalse, Assert.assertTrue - "Checkbox.java" 
		Assert.assertEquals - "StaticDropDown.java", "e2e.java"
	calendar 
		current date - "DynamicDropDown.java", "e2e.java"
		other dates - "Calendar.java"
	elements enabled/disabled - .isEnabled - "Checkbox.java"
	elements looks enabled/disabled - .getAttribute("style") - "Checkbox.java", "e2e.java"
	checkbox - "Checkbox.java", "e2e.java"
	drop-down - "StaticDropDown.java", "DynamicDropDown.java", "e2e.java"
	radiobutton - "e2e.java"
	window - "WindowActivities.java", "WindowHandling.java", "Scope.java"
		.getWindowHandles
		.getTitle
		windows.iterator:
		.next
		.hasNext
	shopping card - "ShopingCard.java"
		Arrays.asList
		.contains
	wait
		implicit - "FluentWaitTest.java", "Locators", "Locators2"
			.withTimeout
			.implicitlyWait + Thread.sleep
			.until
		explicit 
			.visibilityOfElementLocated - "ShopingCard"
	iteration/loop (while) - "Scope.java", "CoreJava1.java", "CoreJava2.java", "CoreJava3.java", "e2e.java", "ShopingCard.java", "AutoSuggestive.java", "StaticDropDown.java", "Calendar.java"
		iterator.next 
		! - negace podminky
	actions 
		- "ActionsDemo.java":
			.moveToElement
			.doubleClick
			.contextClick (right click)
			.tick (pro mobilni app)
		- "FrameTest.java"
			.dragAndDrop 
	keyboard keys
		.keyDown(Keys.SHIFT) - "ActionsDemo.java"
		Keys.chord(Keys.CONTROL, Keys.ENTER) - "Scope.java"
	frames - tagName: "iframe" (container, independent element; old tagName: "frame" not supported in HTML5) - "FrameTest.java"
		.switchTo().frame()
		1. normal (no levels)
		2. nested frames
	limiting webdriver scope (footer, column) - "Scope.java"
	
