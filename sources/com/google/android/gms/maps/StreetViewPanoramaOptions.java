package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rqv();
    public StreetViewPanoramaCamera a;
    public String b;
    public LatLng c;
    public Integer d;
    public StreetViewSource e = StreetViewSource.a;
    private Boolean f = true;
    private Boolean g = true;
    private Boolean h = true;
    private Boolean i = true;
    private Boolean j;

    public StreetViewPanoramaOptions() {
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("PanoramaId", this.b);
        a2.a("Position", this.c);
        a2.a("Radius", this.d);
        a2.a("Source", this.e);
        a2.a("StreetViewPanoramaCamera", this.a);
        a2.a("UserNavigationEnabled", this.f);
        a2.a("ZoomGesturesEnabled", this.g);
        a2.a("PanningGesturesEnabled", this.h);
        a2.a("StreetNamesEnabled", this.i);
        a2.a("UseViewLifecycleInFragment", this.j);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, rrc.a(this.f));
        ivx.a(parcel, 7, rrc.a(this.g));
        ivx.a(parcel, 8, rrc.a(this.h));
        ivx.a(parcel, 9, rrc.a(this.i));
        ivx.a(parcel, 10, rrc.a(this.j));
        ivx.a(parcel, 11, this.e, i2, false);
        ivx.b(parcel, a2);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b2, byte b3, byte b4, byte b5, byte b6, StreetViewSource streetViewSource) {
        this.a = streetViewPanoramaCamera;
        this.c = latLng;
        this.d = num;
        this.b = str;
        this.f = rrc.a(b2);
        this.g = rrc.a(b3);
        this.h = rrc.a(b4);
        this.i = rrc.a(b5);
        this.j = rrc.a(b6);
        this.e = streetViewSource;
    }
}
