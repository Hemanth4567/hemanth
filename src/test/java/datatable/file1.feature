Feature: Eating fruits
This feature explains about fruits

Scenario Outline: Eating

Given There are <start> fruits

| type  | with |
| Apple | me   |
| Mango |john  |
| Banana|Gourav|

When I eat <eat> fruits
Then I have <left> fruits

Examples:

| start | eat | left |
| 12    | 5   | 7    |
| 10    | 4   | 6    |
