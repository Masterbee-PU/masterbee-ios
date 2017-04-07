# Group Projecr - *Masterbee-iOS* Part 2

**Masterbee** is an online catering service. Our innovative delivery technology ensures your food is kept at the state as it is just come out of the pot.

## User Stories

Masterbee is an online catering service. Our innovative delivery technology ensures your food is kept at the state as it is just come out of the pot.

## User Stories


## Universal

- [ ] User can order food to their desired location at a specific time

## Account
- [ ] User can sign up, log in, log out.
- [ ] User can edit their account information

### Login Type View Controller
- [ ] User can login/register with a Facebook account
- [ ] User can login with a phone number


### Login/Register View Controller (Pin under psw textfield)
- [ ] User can login if having an account
- [ ] User can sign up if not having an account

## Main

### Poster View Controller
- [x] User can view the posters in the collection view (Posters are different with different language setting)
- [x] User can view the notice at the top of the Poster vc
- [x] User can view the web page of a poster(if it has a link_url) by click on the poster
- [ ] User can view the zoomable image and save it to local photo library if no link_url in this poster
- [ ] User can segue to a application view controller if firebase config is “true” [optional]

- [x] Boss can change the posters(image_url, link_url) in the firebase, which client will be changed simultaneously
- [ ] Boss can change notice in the firebase, which client will be changed simultaneously

### Order Type View Controller
- [x] User have three available types of order method
- [x] User can view Titles, Descriptions, icons of an order method

- [x] Boss can change the order method availability in firebase

### Menu View Controller
- [x] User can see the selected order method(pickup or (location & time)) at the top of the table
- [x] User can open Google Maps for navigation by tapping the button in the location image in the view header
- [x] User can see the section header(credits will earn when order now), the credit will count down.
- [x] User can see the stocks in the menu table with image and title and a plus button
- [ ] User can tap plus button in a stock cell to add it to the cart. (a button with count in cart will show up in the center of the stock image)
- [ ] User can tap button with count in cart to reduce the number of the stock added in cart
- [x] User can see three navigation bar button items (search, cart, category) 
- [x] User can search a stock with keywords
- [x] User can view the cart view controller by tapping the cart button
- [x] User can view the category by tapping the category button. Menu table will scroll to certain index when stock in the category table tapped  
- [x] User can view stock detail by tapping on a cell

### Map View Controller
- [x] User can see the google maps in the first half of the view 
- [x] User can see the current location in the map 
- [x] The visible region when view did load is the region around the current location
- [x] User can see the markers of all available locations in the map
- [x] User can see the time table in the second half of the view
- [ ] The time table when view did load is the nearest available location of current location
- [x] User can see the time of a certain location by click a marker in the map
- [x] User can change the data of order today and within 6 days after today
- [x] User can view the menu by tapping a cell 

### Cart View Controller
- [ ] User can see the selected order method(pickup or (location & time)) at the top of the table
- [ ] User can see the section header(credits will earn when order now), the credit will count down.
- [ ] User view all selected stocks and count in the cart table
- [ ] User can add or reduce the count of a selected item
- [ ]  

### Checkout View Controller (Card List)
- [ ] User can view the selected items in the cart
- [ ] User can view the price of each item and the total price
- [ ] User can pay for their items using bank cards

#### Add Cart View Controller
- [ ] User can add a debit card/credit card for checkout
- [ ] User can delete a previous registered card
- [ ] User can change existing bank card information

### Order History View Controller
- [ ] User can see a list of ordered items
- [ ] User can add or delete an item from the list
- [ ] User can previous ordered items

### Order Detail View Controller
- [ ] User can see the item’s avatar photo and price
- [ ] User can add or reduce of the selected item
- [ ] User can click on the item’s photo and go to the detailed page of the item

### Profile View Controller
- [ ] User can see profile picture, name, email and some personal information
- [ ] User can edit and save their information
- [ ] User can click on the settings button to view more settings

### Setting View Controller
- [ ] User can change the language for use
- [ ] User can change bank card information
- [ ] User can change location

## Mockup 

Here's a walkthrough of implemented user stories:


order type view controller | poster view controller | map view controller
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/mockup/ordertype.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/poster.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/map.jpeg' width='200' alt='Video Walkthrough'/>

menu view controller | catagory | search
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/mockup/menu.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/catagory.jpeg' width='200' alt='Video Walkthrough'/> | <img src='/mockup/search.jpeg' width='200' alt='Video Walkthrough'/>

## Milestone

Milestone 1 | Milestone 2 | Milestone 3
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/gif/milestone1.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/milestone2.gif' width='200' alt='Video Walkthrough'/> | <>


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


