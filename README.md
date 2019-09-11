 SOP-JapaneseRestaurant
 ===
The best sashimi restaurant in the world.

## Requirement
```
Java 8 (JDK 1.8)
Maven 3.5
```

## Clone the repository
```
git clone https://github.com/zelotype/SOP-JapaneseRestaurant.git
```

## Feature
#### <i>1. Get all menu</i> <br>
<b>URL:</b> localhost:8080/sashimi/menu <br>
<b>Method:</b> GET <br>
<b>Request:</b> 
```
Nothing
```
<b>Response:</b> 
```
[
    {
        "name": "uni",
        "price": 9.8989898E7,
        "amount": 1500,
        "type": "mollesca",
        "id": 1
    },
    {
        "name": "Salmon",
        "price": 108.0,
        "amount": 2500,
        "type": "Fish",
        "id": 2
    }
]
```
#### <i>2. Create menu</i> <br>
<b>URL:</b> localhost:8080/sashimi/menu/{sashimiType} <br>
<b>Method:</b> POST <br>
<b>Request:</b> 
```
    {
        "name": "uni",
        "price": 9.8989898E7,
        "amount": 1500,
        "type": "mollesca"
    },
```
<b>Response:</b> 
```
[
    {
        "name": "uni",
        "price": 9.8989898E7,
        "amount": 1500,
        "type": "mollesca",
        "id": 1
    }
]
```
#### <i>3. Get menu from ID</i> <br>
<b>URL:</b> localhost:8080/sashimi/menu/{id} <br>
<b>Method:</b> GET <br>
<b>Request:</b> 
```
Nothing
```
<b>Response:</b> 
```
[
    {
        "name": "uni",
        "price": 9.8989898E7,
        "amount": 1500,
        "type": "mollesca",
        "id": 1
    }
]
```
#### <i>4. Delete menu from ID</i> <br>
<b>URL:</b> localhost:8080/sashimi/delete/{id} <br>
<b>Method:</b> DELETE <br>
<b>Request:</b> 
```
Nothing
```
<b>Response:</b> 
```
[
    {
        "name": "Salmon",
        "price": 108.0,
        "amount": 2500,
        "type": "Fish",
        "id": 2
    }
]
```
#### <i>5. Buy food from ID</i> <br>
<b>URL:</b> localhost:8080/sashimi/buy/{id} <br>
<b>Method:</b> GET <br>
<b>Request:</b> How many that you want to buy 
```
   {
       "amount": 5
   }
```
<b>Response:</b> 
```
[
    {
        "name": "uni",
        "price": 9.8989898E7,
        "amount": 1495,
        "type": "mollesca",
        "id": 1
    }
]
```


