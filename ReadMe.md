POST Method:

1.1 Status line missing - Response 200 
1.2 Status is null - Response 200 
1.2 Status small letters - Response 400 
1.3 Status empty value - Response 400 
1.4 Status numeric value 1-3 - Response 200
2.1 "courierId" maximum symbols (1000000000000000000) - Response 200
2.2 "courierId" above maximum symbols (10000000000000000000) - Response 400
2.3 "courierId" is null - Response 200
2.4 "courierId" missing value - Response 400
2.5 "courierId" non numeric value - Response 400
2.6 "courierId" line missing - Response 200
3.1 "customerName" 1000+ symbols - Response 200
3.2 "customerName" cyrillic symbols - Response 200 
3.3 "customerName" chines symbols - Response 200
3.4 "customerName" line missing - Response 200
3.5 "customerName" is null - Response 200
4.1 "customerPhone" non numeric value - Response 200
4.2 "customerPhone" 1000+ symbols - Response 200
4.3 "customerPhone" cyrillic symbols - Response 200
4.4 "customerPhone" chines symbols - Response 200
4.5 "customerPhone" line missing - Response 200
4.6 "customerPhone" is null - Response 200
5.1 "comment" 1000+ symbols - Response 200
5.2 "comment" cyrillic symbols - Response 200
5.3 "comment" chines symbols - Response 200
5.4 "comment" line missing - Response 200
5.5 "comment" is null - Response 200
6.1 "id" maximum symbols (1000000000000000000) - Response 200
6.2 "id" above maximum symbols (10000000000000000000) - Response 400
6.3 "id" is null - Response 200
6.4 "id" missing value - Response 400
6.5 "id" non-numeric value - Response 400
6.6 "id" line missing - Response 200

GET method (tested via Postman)

1.1 "id" is lesser than 1 - Response 400
1.2 "id" is larger than 10 - Response 400 
1.3 "id" is missing - Response 405
1.4 "id" non-numeric value - Response 400
1.5 "id" is correct (1-10) -Response 200












