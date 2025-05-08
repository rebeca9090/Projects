let weather = {
  paris: {
    temp: 19.7,
    humidity: 80,
  },
  tokyo: {
    temp: 17.3,
    humidity: 50,
  },
  lisbon: {
    temp: 30.2,
    humidity: 20,
  },
  "san francisco": {
    temp: 20.9,
    humidity: 100,
  },
  oslo: {
    temp: -5,
    humidity: 20,
  },
};

// write your code here

let city = prompt("Enter a city").toLowerCase().trim();
function capitalizeFirstLetter(city) {
  return city.charAt(0).toUpperCase() + city.slice(1);
}

if (city === "paris") {
  alert(
    `It is currently ${Math.round(weather.paris.temp)}°C (${Math.round(
      (9 / 5) * weather.paris.temp + 32
    )}°F) in ${capitalizeFirstLetter(city)} with a humidity of ${
      weather.paris.humidity
    }%`
  );
}
if (city === "tokyo") {
  alert(
    `It is currently ${Math.round(weather.tokyo.temp)}°C (${Math.round(
      (9 / 5) * weather.tokyo.temp + 32
    )}°F) in ${capitalizeFirstLetter(city)} with a humidity of ${
      weather.tokyo.humidity
    }%`
  );
}
if (city === "lisbon") {
  alert(
    `It is currently ${Math.round(weather.lisbon.temp)}°C (${Math.round(
      (9 / 5) * weather.lisbon.temp + 32
    )}°F) in ${capitalizeFirstLetter(city)} with a humidity of ${
      weather.lisbon.humidity
    }%`
  );
}
if (city === "san francisco") {
  alert(
    `It is currently ${Math.round(weather.sanFrancisco.temp)}°C (${Math.round(
      (9 / 5) * weather.sanFrancisco.temp + 32
    )}°F) in ${capitalizeFirstLetter(city)} with a humidity of ${
      weather.sanFrancisco.humidity
    }%`
  );
}
if (city === "oslo") {
  alert(
    `It is currently ${Math.round(weather.oslo.temp)}°C (${Math.round(
      (9 / 5) * weather.oslo.temp + 32
    )}°F) in ${capitalizeFirstLetter(city)} with a humidity of ${
      weather.oslo.humidity
    }%`
  );
} else {
  alert(
    `Sorry, we don't know the weather for this city, try going to https://www.google.com/search?q=weather+${city}`
  );
}
