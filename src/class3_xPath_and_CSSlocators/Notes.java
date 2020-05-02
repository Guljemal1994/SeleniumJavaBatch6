package class3_xPath_and_CSSlocators;

public class Notes {
	/*
	 * Recap HTML Element in the DOM. <input type="email"
	 * class="inputtext login_form_input_box" name="email" id="email" ,
	 * "royal_email">
	 *
	 * TagName = input
	 * 
	 * What is attribute?? It is a key value pair which provides additinal
	 * information about the HTML element;
	 * 
	 * Who do we need Xpath or CSS: 1. Not every elemen will have ID ,name or
	 * className; 2. Alpha numeric IDs may orvary; 3. Using xpath and CSS e can
	 * locate element usingany attribute;
	 * 
	 * What is Xpath: What is XPath? XPath is defined as XML path. It is a syntax or
	 * language for finding any element on the web page using XML path expression.
	 * XPath is used to find the location of any element on a webpage using HTML DOM
	 * structure. The basic format of XPath is explained below with screen shot.
	 * 
	 * What is Xpath: What is XPath? It is Locator. It's lile a query language that
	 * allows us to locate an element or group of elements in the DOM;
	 * 
	 * 
	 * There are Two types of Xpath:
	 * 1.Absolute Xpath:
	 * Absolute xpath starts with one slash and you have start from the root node;
	 * Example------/html/body/div/div/div/img;
	 * 
	 * 
	 * 
	 * 2. Relative Xpath:
	 * <input type="email" class="inputtext login_form_input_box" name="email" id="email" ,"royal_email">
	 * 
	 *  //tagName[@attributeName = 'value']
	 *  //input[@type = 'email']
	 *  
	 *  
	 *  How to identify an element using tect/linktect:
	 *  //a[text() = 'Welcome Admin']
	 *  
	 *  Functions in Xpath:
	 *  //input[contains(@type, 'email')]
	 *  //span[contains(@id,'span')]
	 *  
	 *  
	 *  contains with text:
	 *  //a[contains(text() , 'Welcome')]
	 *  
	 *  Strats with 
	 *  //input[starts-with(@id , 'textusername']
	 *  //a[starts-with(text(), 'log')]
	 *  
	 *  
	 *  Note:xpath 1 does not suppert "ends - with" function;
	 *  
	 *  Creating xpath with two attributes(and):
	 *  //input[@class = 'formatInputText' and @id = 'firstName']
	 *
	 *  ------------------------------------------------------------------------------
	 *  
	 *   if we want to use two attributes Teacher suggested to use and for example:
	 * //input[@class = 'formatInputText' and @id = 'firstName']
	 *  
	 *  
	 *  Creating xpath with two attributes(or):
	 *  //input[@class = 'formatInputText' or  @id = 'firstName']
	 *  
	 *  -------------------------------------------------------------------------------
	 *  
	 *  Difference Between Relative and Absolute:
	 *  Absolute Xpath:
	 *  1. Absolute starts with one slash (/);
	 *  2.it always starts from the root node/html
	 *  3. It can move only in forword direction;
	 *  4.not recomanded to use . Because if the middle tag is removedthe xpath with not work;
	 *  
	 *  
	 *  
	 *  Relative Xpath.
	 *  1. starts with to slash(//);
	 *  2.you can go forword and backword;
	 *  
	 *  
	 *  
	 *  CSS Selector-----> (Cascading sheet style);
	 *  
	 *  tagName[attributeName = 'attributeValue']
	 *  input[id = 'txtUsername']
	 *  
	 *   CSS --does not have text we cannot use text operator;
	 *   
	 *   
	 *   Functions in Css:
	 *   
	 *   contains:
	 *   tagName[type* = 'value']
	 *   button[name* ='loginBtn']
	 *   
	 *  
	 *  Difference Beetwen CSS and Xpath:
	 *  
	 *  CSS is native to the browser(faster);
	 *  Xpath is outsider and is slower;
	 *  Good to use css with IE;
	 *  
	 *  
	 *  1. '^' symbol, represents the starting text in a string.
	 *  2. '$' symbol represents the ending text in a string.
	 *  3. '*' symbol represents contains text in a string.
	 *
	 *
	 *
	 *
	 *
	 *
	 */
}
