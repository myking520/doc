Narrative:
In order to 试用BDD的开发方式
as a 开发人员
I want to 使用jbehave开发
so that 熟悉jbehave的使用

GivenStories: jbehave/myking520/github/junit/stories/ls6/s6_3_1_story.story

Scenario: 弄一个pineapple

GivenStories: jbehave/myking520/github/junit/stories/ls6/s6_3_1_story.story



Given a stock of symbol <symbol> and a threshold of <threshold>
 
Examples:    
|stockExchange|symbol|threshold|price|status|
|NASDAQ|STK1|10.0|5.0|OFF|
|FTSE|STK2|10.0|11.0|ON|
