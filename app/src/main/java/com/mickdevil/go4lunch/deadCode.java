package com.mickdevil.go4lunch;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class deadCode {


    //RIP dear code, I will remember you




    //THIS CODE WILL BE MAYBE USED

//    public List<String> getPlaceLikeHoo2d() {
//// Use fields to define the data types to return.
//
//        List<String> getPlacesID = new ArrayList<>();
//        List<Place.Field> placeFields = Collections.singletonList(Place.Field.NAME);
//
//// Use the builder to create a FindCurrentPlaceRequest.
//        FindCurrentPlaceRequest request = FindCurrentPlaceRequest.newInstance(placeFields);
//
//// Call findCurrentPlace and handle the response (first check that the user has granted permission).
//        if (ContextCompat.checkSelfPermission(context, ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//
//            List<PlaceLikelihood> response = (List<PlaceLikelihood>) placesClient.findCurrentPlace(request).getResult();
//
//            if (response.size() != 0) {
//
//                for (PlaceLikelihood placeLikelihood : response) {
//                    Log.i(TAG, String.format("Place '%s' has likelihood: %f",
//                            placeLikelihood.getPlace().getName(),
//                            placeLikelihood.getLikelihood()));
//
//                    getPlacesID.add(placeLikelihood.getPlace().getId());
//                    Log.i(TAG, "and my list is: " + getPlacesID.size());
//
//                }
//
//            }
//            // else {
//            //     Exception exception = placeResponse.getException();
//            //     if (exception instanceof ApiException) {
//            //         ApiException apiException = (ApiException) exception;
//            //         Log.e(TAG, "Place not found: " + apiException.getStatusCode());
//            //     }
//            // }
//
//        }
//        return getPlacesID;
//
//    }





    // public void getPlaces() {
    //     String placeTypesList[] = {"restaurant", "cafe", "bar"};

    //     if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
    //             != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,
    //             Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

    //     }
    //      locationProviderClient.getLastLocation()
    //     .addOnSuccessListener(new OnSuccessListener<Location>() {
    //         @Override
    //         public void onSuccess(Location location) {
    //             curentLat = location.getLatitude();
    //             curentLng = location.getLongitude();


    //     String urlAsString = "https://maps.googleapis.com/maps/api/place/details/output" + "?location=" + curentLat + "," + curentLng +
    //             "&radius=5000" + "&type=" + placeTypesList[0] + "&sensor=true" + "&key=" + "AIzaSyBZ1yf43MqKZwPmDvEkUx5CBufQpf01yDI";
    //     Log.d(TAG, "getPlaces: " + curentLat + " " + curentLng);

    //     URL url = null;
    //     try {
    //         url = new URL(urlAsString);
    //     } catch (MalformedURLException e) {
    //         e.printStackTrace();
    //     }

    //     FetchPlacesData fetchPlacesData = new FetchPlacesData(url);
    //     new Thread(fetchPlacesData).start();
    //     //call my runable here
    //    // new PlaceTask().execute(url);
    //         }
    //     });
    // }

    //  class FetchPlacesData implements Runnable {
//      URL url;
//      String line = "";
//      String data = "";
//      String parsed = "";
//      int i = 0;

//      public FetchPlacesData(URL url) {
//          this.url = url;
//      }


//      @Override
//      public void run() {


//          try {
//              HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
//              InputStream inputStream = urlConnection.getInputStream();
//              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

//ile (bufferedReader.readLine() != null){
//  data += bufferedReader.readLine();
//

//ONArray jsonArray = new JSONArray(data);

//              Log.d(TAG, "Jason Array: " + jsonArray.toString());


//          }
//          catch (IOException | JSONException e) {
//              e.printStackTrace();
//              Log.d(TAG, "error: " + e.getMessage(), e);
//          }



//      }

//  }


//
//  private class PlaceTask extends AsyncTask<String, Integer, String> {

//      @Override
//      protected String doInBackground(String... strings) {
//          //Initialyze data
//          String data = null;
//          try {
//              data = downloadUrl(strings[0]);
//          } catch (IOException e) {
//              e.printStackTrace();
//          }
//          return data;
//      }

//      @Override
//      protected void onPostExecute(String s) {
//          new ParserTask().execute(s);
//      }

//      private String downloadUrl(String string) throws IOException {
//          //init URL
//          URL url = new URL(string);
//          //init conection
//          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//          connection.connect();

//          InputStream stream = connection.getInputStream();

//          BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

//          StringBuilder builder = new StringBuilder();

//          String line = "";

//          while ((line = reader.readLine()) != null) {
//              builder.append(line);

//          }

//          String data = builder.toString();

//          reader.close();

//          return data;
//      }


//      private class ParserTask extends AsyncTask<String, Integer, List<HashMap<String, String>>> {

//          List<Double> TheLatList = new ArrayList<>();
//          List<Double> TheLngList = new ArrayList<>();

//          @Override
//          protected List<HashMap<String, String>> doInBackground(String... strings) {
//              //createJson
//              OtherJsonParser otherJsonParser = new OtherJsonParser();

//              List<HashMap<String, String>> mapList = null;
//              JSONObject object = null;
//              try {
//                  object = new JSONObject(strings[0]);

//                  mapList = otherJsonParser.parseResult(object);

//              } catch (JSONException e) {
//                  e.printStackTrace();
//              }

//              return mapList;
//          }

//          @Override
//          protected void onPostExecute(List<HashMap<String, String>> hashMaps) {
//              for (int i = 0; i < hashMaps.size(); i++) {
//                  HashMap<String, String> hashMapList = hashMaps.get(i);
//                  double lat = Double.parseDouble(hashMapList.get("lat"));
//                  double lng = Double.parseDouble(hashMapList.get("lng"));
//                  String name = hashMapList.get("name");
//                  LatLng latLng = new LatLng(lat, lng);

//                  TheLatList.add(lat);
//                  TheLngList.add(lng);
//                  if (i == hashMaps.size()){

//                  }

//              }

//          }
//      }

//}
//package com.mickdevil.go4lunch.UI;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class OtherJsonParser {
//
//    private HashMap<String, String> parseJsonObject(JSONObject object) {
//
//        HashMap<String, String> dataList = new HashMap<>();
//        try {
//            String name = object.getString("name");
//
//            String latitude = object.getJSONObject("geometry").
//        getJSONObject("location").getString("lat");
//
//            String longitude = object.getJSONObject("geometry").
//                    getJSONObject("location").getString("lng");
//
//            dataList.put("name", name);
//            dataList.put("lat", latitude);
//            dataList.put("lng", longitude);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//return dataList;
//    }
//
//private List<HashMap<String,String>> parseJsonArray(JSONArray jsonArray){
//    List<HashMap<String,String>> dataList = new ArrayList<>();
//
//    for (int i=0; i<jsonArray.length(); i++ ){
//        try {
//        HashMap<String, String> data = parseJsonObject((JSONObject) jsonArray.get(i));
//
//dataList.add(data);
//
//    } catch (JSONException e) {
//        e.printStackTrace();
//    }
//    }
//
//    return dataList;
//    }
//
//public List<HashMap<String,String>> parseResult(JSONObject object){
//      JSONArray jsonArray = null;
//try {
//        jsonArray = object.getJSONArray("results");
//
//} catch (JSONException e) {
//        e.printStackTrace();
//    }
//
//return parseJsonArray(jsonArray);
//    }
//
//
//}
//
// //method to geet curent Location
// public static LatLng getCurentLocation(Context context, Activity activity, FusedLocationProviderClient locationProviderClient) {
//     LatLng latLng;

//     if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
//             != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context,
//             Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

//     }

//     locationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
//         @Override
//         public void onSuccess(Location location) {

//             latLng = new LatLng(location.getLatitude(), location.getLongitude());

//         }
//     }).addOnFailureListener(activity, new OnFailureListener() {
//         @Override
//         public void onFailure(@NonNull Exception e) {
//             Toast.makeText(context, "god damn", Toast.LENGTH_SHORT).show();
//         }
//     });

//     return latLng;

// }




//some stuf from mapFragment

// public boolean isGPSenabled() {
//     locationManager = (LocationManager) getActivity().getSystemService(LOCATION_SERVICE);
//
//     boolean providerEnable = locationManager.isProviderEnabled(locationManager.GPS_PROVIDER);
//
//     if (providerEnable) {
//         return true;
//     } else {
//         AlertDialog alertDialog = new AlertDialog.Builder(getActivity().getApplicationContext())
//                 .setTitle("GPS ask").setMessage("the GPS is requierd for this app").setPositiveButton("ya man", new
//                         DialogInterface.OnClickListener() {
//                             @Override
//                             public void onClick(DialogInterface dialog, int which) {
//                                 Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//                                 startActivityForResult(intent, GPS_REQUEST_CODE);
//                             }
//                         }).show();
//     }
//     return false;
// }

//the set elevation method to make view above others in "steck"
// searchOnMap.setElevation(1000);


//  public void searchMdoe(Boolean barMode) {

//      if (barMode) {
//          setSupportActionBar(toolbar);

//          NavigationView navigationView = findViewById(R.id.nav_view);
//          toolbar.setNavigationIcon(R.drawable.ic_open_drawer);

//          toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                  drawer.openDrawer(Gravity.LEFT);
//              }
//          });

//      } else {
//          AppBarLayout.setVisibility(View.INVISIBLE);
//          toolbar.setVisibility(View.INVISIBLE);
//          searchOnMap.setVisibility(View.VISIBLE);
//          searchOnMap.setFocusable(false);
//          searchOnMap.bringToFront();

//          searchOnMap.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                  Intent intent = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY,
//                          getPlaces.getPlacesList() ).build(G4LunchMain.this);
//              startActivityForResult(intent, REQUESTAUTOCOMPLITION);

//              }
//          });
//      }

//  }


// public void getLoc() {
//     if (ActivityCompat.checkSelfPermission(G4LunchMain.this, Manifest.permission.ACCESS_FINE_LOCATION)
//             != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(G4LunchMain.this,
//             Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//
//     }
//
//     locationProviderClient.getLastLocation().addOnSuccessListener(G4LunchMain.this, new OnSuccessListener<Location>() {
//         @Override
//         public void onSuccess(Location location) {
//
//             if (location != null) {
//                 LatLng me = new LatLng(location.getLatitude(), location.getLongitude());
//
//
//             }
//         }
//
//     }).addOnFailureListener(G4LunchMain.this, new OnFailureListener() {
//         @Override
//         public void onFailure(@NonNull Exception e) {
//
//         }
//     });
// }

}