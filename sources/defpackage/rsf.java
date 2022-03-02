package defpackage;

import android.os.IInterface;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: rsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface rsf extends IInterface {
    void init(mby mby);

    void initV2(mby mby, int i);

    rvu newBitmapDescriptorFactoryDelegate();

    rsb newCameraUpdateFactoryDelegate();

    rsp newMapFragmentDelegate(mby mby);

    rss newMapViewDelegate(mby mby, GoogleMapOptions googleMapOptions);

    rum newStreetViewPanoramaFragmentDelegate(mby mby);

    rup newStreetViewPanoramaViewDelegate(mby mby, StreetViewPanoramaOptions streetViewPanoramaOptions);
}
