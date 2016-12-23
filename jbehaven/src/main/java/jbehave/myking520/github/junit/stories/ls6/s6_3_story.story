Narrative:
In order to 试用BDD的开发方式
as a 开发人员
I want to 使用jbehave开发
so that 熟悉jbehave的使用

Scenario: 弄一个pineapple
GivenStories: jbehave/myking520/github/junit/stories/ls6/s6_3_1_story.story
Given a stock of <symbol> and a <threshold>

When the stock is traded at <price>





Examples:

|symbol|threshold|price|status|

|STK1|10.0|5.0|OFF|

|STK1|10.0|11.0|ON|
