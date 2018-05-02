# Video Game Rental App
Code challenge for position at Gravie

It was meant to call out to the api at [giantbomb.com](https://giantbomb.com), to retrieve game information and allow users 
to "rent" games. I ran into CORS problems and got stuck early on.

Going forward the API call needs jsonp and json_callback from the URL and add the user-agent header instead. That will solve the 403 error.
