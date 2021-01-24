# Future-Cashier
Exercise to make cashier machine with maven and spring framework. This Exercise is for Blibli Future Bootcamp

## API
```GET /orders```
: get all orders

```GET /orders/{id}```
: get order by id

```POST /orders/```
: submit order with json payload below
```
{
    "customer": {
        "name": "jovan",
        "email": "jovancahyadi@gmail.com"
    },
    "orders": [
        {
            "hargaProduk": 50000,
            "jumlahProduk": 5,
            "namaProduk": "buku tulis"
        },
        {
            "hargaProduk": 20000,
            "jumlahProduk": 5,
            "namaProduk": "telpon"
        }
    ]
}
```

## Author
Jovan Karuna Cahyadi