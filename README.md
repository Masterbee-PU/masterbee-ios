# Group Projecr - *Masterbee-iOS* Part 2

**Masterbee** is an online catering service. Our innovative delivery technology ensures your food is kept at the state as it is just come out of the pot.

## DEMO

Profile | Setting | Poster
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/gif/profie.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/language.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/poster.gif' width='200' alt='Video Walkthrough'/>

Menu | Group Delivery | Checkout
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/gif/menu.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/groupD.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/checkout.gif' width='200' alt='Video Walkthrough'/> 

Card | Order
:-------------------------:|:-------------------------:
<img src='/gif/card.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/order.gif' width='200' alt='Video Walkthrough'/> 

## User Stories

Masterbee is an online catering service. Our innovative delivery technology ensures your food is kept at the state as it is just come out of the pot.

## User Stories

## Universal

- [x] User can order food to their desired location at a specific time

## Account
- [x] User can sign up, log in, log out.
- [x] User can edit their account information

### Login Type View Controller
- [ ] User can login/register with a Facebook account *
- [x] User can login with a phone number


### Login/Register View Controller (Pin under psw textfield)
- [x] User can login if having an account
- [x] User can sign up if not having an account

## Main

### Poster View Controller
- [x] User can view the posters in the collection view (Posters are different with different language setting)
- [x] User can view the notice at the top of the Poster vc
- [x] User can view the web page of a poster(if it has a link_url) by click on the poster
- [ ] User can view the zoomable image and save it to local photo library if no link_url in this poster *
- [x] User can segue to a application view controller if firebase config is “true” [optional]

- [x] Boss can change the posters(image_url, link_url) in the firebase, which client will be changed simultaneously
- [x] Boss can change notice in the firebase, which client will be changed simultaneously

### Order Type View Controller
- [x] User have three available types of order method
- [x] User can view Titles, Descriptions, icons of an order method

- [x] Boss can change the order method availability in firebase

### Menu View Controller
- [x] User can see the selected order method(pickup or (location & time)) at the top of the table
- [x] User can open Google Maps for navigation by tapping the button in the location image in the view header
- [x] User can see the section header(credits will earn when order now), the credit will count down.
- [x] User can see the stocks in the menu table with image and title and a plus button
- [x] User can tap plus button in a stock cell to add it to the cart. (a button with count in cart will show up in the center of the stock image)
- [x] User can tap button with count in cart to reduce the number of the stock added in cart
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
- [ ] The time table when view did load is the nearest available location of current location *
- [x] User can see the time of a certain location by click a marker in the map
- [x] User can change the data of order today and within 6 days after today
- [x] User can view the menu by tapping a cell 

### Cart View Controller
- [x] User can see the selected order method(pickup or (location & time)) at the top of the table
- [x] User can see the section header(credits will earn when order now), the credit will count down.
- [x] User view all selected stocks and count in the cart table
- [x] User can add or reduce the count of a selected item

### Checkout View Controller (Card List)
- [x] User can view the selected items in the cart
- [x] User can view the price of each item and the total price
- [x] User can pay for their items using bank cards
- [x] User can switch card
- [x] User can add a new card
- [x] User can scan to add a card

#### Add Card View Controller
- [x] User can add a debit card/credit card for checkout
- [x] User can delete a previous registered card
- [ ] User can change existing bank card information *

### Order History View Controller
- [x] User can see a list of ordered items
- [x] User can add or delete an item from the list
- [x] User can previous ordered items
- [x] User can see order status
- [x] User can view location image and do navigation through Google Maps

### Order Detail View Controller
- [x] User can see the item’s and price
- [x] User can see order status
- [x] User can view location image and do navigation through Google Maps

### Profile View Controller
- [x] User can see profile picture, name, email and some personal information
- [x] User can edit and save their information
- [x] User can click on the settings button to view more settings
- [x] User can change address

### Setting View Controller
- [x] User can change the language for use
- [x] User can change bank card information


## Mockup 

Here's a walkthrough of implemented user stories:

## Milestone

Milestone 1 | Milestone 2 
:-------------------------:|:-------------------------:|:-------------------------:
<img src='/gif/milestone1.gif' width='200' alt='Video Walkthrough'/> | <img src='/gif/milestone2.gif' width='200' alt='Video Walkthrough'/> 

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


