Feature: Login

Scenario Outline: Successful Login with Valid Credentials
     Given User is on Home Page
     When User navigates to Login Page
     And Enters "<username>" and "<password>"
     Then User account page opens
     Examples:
     |username | password|
     |111552411 | dgagsfgfyjdfshy|
     |45006263 | ydudshfkdflk|

