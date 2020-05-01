package e.david.weasleyclock.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;




public class LocationService {

    private Context myContext;
    private boolean network_enabled;
    private LocationManager locM;
    private Location loc;


    public LocationService(Context myContext) {
        this.myContext = myContext;
        locM = (LocationManager) myContext.getSystemService(Context.LOCATION_SERVICE);
        network_enabled = locM.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }


    @SuppressLint("MissingPermission")
    public Location getCoordinates() {

        if (network_enabled) {

            loc = locM.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

            System.out.println(loc);

            if(loc!=null){
                System.out.println("Longitude: " + loc.getLongitude());
                System.out.println("Latitude: " + loc.getLatitude());
            }
        }
        return loc;
    }





}
