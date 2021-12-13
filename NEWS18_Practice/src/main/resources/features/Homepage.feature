Feature: Verify and automate the scenario for NEWS18 Homepage Web Application
			
	Scenario Outline: Verify the article of last section in  News18 Homepage
			Given Read the News18 web application URL from the property file
			When  Open the Chrome Browser
			And Navigate to News18 homepage
			Then Verify the article of last section in News18 Homepage