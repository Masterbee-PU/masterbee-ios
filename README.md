# Group Projecr - *Masterbee-iOS* Part 2

**Masterbee** is a movies app using the [The Movie Database API](http://dev-r1.mbee.me/v1/docs/).

Masterbee is an online catering service. Our innovative delivery technology ensures your food is kept at the state as it is just come out of the pot.

## User Stories

The following **required** functionality is completed:

- [ ] User can register through phone number
- [ ] User can view the menu without login
- [ ] User can view food detail for a dish

## Mockup 

Here's a walkthrough of implemented user stories:


order type view controller | poster view controller | map view controller
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/mockup/ordertype.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/poster.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/map.jpeg' width='200' alt='Video Walkthrough'/>

menu view controller | catagory | search
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/mockup/menu.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/catagory.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/search.jpeg' width='200' alt='Video Walkthrough'/>

## Data Model

```
// Stock Model
{
	"name": "",
	"product_id": 3,
	"left_quantity": 4,
	"price": Float,
	"menus": [
	],
	"images": [
	],
	"temperature": "hot"
}

// Order Model
{
  "id": 1,
  "order_number": "",
  "status": "pending",
  "created_at": "",
  "location": {
    "id": 3,
    "name": ""
  }
}

// location Model
{
  "id": 1,
  "name": "Earhart Hall",
  "updated_at": "2015-07-09T04:34:08.567-04:00",
  "latitude": "0.0",
  "longitude": "0.0",
  "description": "",
  "location_group_id": 1,
  "location_group_name": "Purdue Dorm",
  "regions": [
    {
      "id": 1,
      "name": "West Lafayette, IN",
      "zip_code": 47906
    }
  ],
  "location_images": {
  }
}

// User Model
{
	"id": 3,
	"name": "Nathaniel Cole",
	"email": "nathaniel.cole91@example.com",
	"phone": "+41441112233",
	"gender": null,
	"address": "2160 E Pecan St",
	"city": "Texas",
	"state": null,
	"zip_code": null,
	"country": "US",
	"avatar_url_xxl": "https://masterbee.co/images/image_missing_xxl.png",
	"avatar_url_xl": "https://masterbee.co/images/image_missing_xl.png",
	"avatar_url_l": "https://masterbee.co/images/image_missing_l.png",
	"avatar_url_m": "https://masterbee.co/images/image_missing_m.png",
	"avatar_url_s": "https://masterbee.co/images/image_missing_s.png",
	"locale": "en"
}
```


