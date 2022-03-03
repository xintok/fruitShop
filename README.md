# fruitShop

## Technical test by Jacinto Calderon

###### Introduction

This java project has been created with spring boot without any other dependencies due to its simplicity.

###### Execution

`java -jar shop.jar OPTION [file1] [file2]`

###### Options

1. Purchase
   - It is the main feature. The program reads the files by parameters and calculates the final receipt.
   - Required parameters are 'purchase' as OPTION, productFile and purchaseFile in csv format.
   - The file format is like the example format. Example files in repo.
   - Ex: `java -jar shop.jar purchase product.csv purchase.csv`

2. Offers
   - Not implemented. 
   - Show all offers.
   - Ex: `java -jar shop.jar offers`
3. AddOffer
   - Not implemented.
   - Add a new offer.
   - Ex: `java -jar shop.jar addOffer offer.csv`
5. RemoveOffer
   - Not implemented.
   - Remove a offer.
   - Ex: `java -jar shop.jar removeOffer offerId`

###### Future work

Due to the short time I had, there are several features that have not been implemented:
- To complete checkOffer feature.
- To complete offers related features.
- Complete test suite.
- Correct exception handling.
- Better output results.
