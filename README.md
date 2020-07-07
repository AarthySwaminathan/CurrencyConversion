# CurrencyConversion

## /api/convert
* Request
```JSON
{
	"fromCcy": "GBP",
	"fromAmt": 30,
	"toCcy": "AED"
}
```
* Response
```JSON
{
    "fromCcy": "GBP",
    "fromAmt": 30.0,
    "toCcy": "AED",
    "toAmt": 137.7
}
```


## /api/save
* Request
```JSON
{
	"fromCcy": "GBP",
	"toAmt": 4.59,
	"toCcy": "AED"
}
```
* Response
```JSON
{
    "fromCcy": "GBP",
    "fromAmt": 1.0,
    "toCcy": "AED",
    "toAmt": 4.59
}
```
