package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvc();
    public LatLng a;
    public float b;
    public float c;
    public LatLngBounds d;
    public float e;
    public float f;
    public boolean g = true;
    public float h = 0.0f;
    public float i = 0.5f;
    public float j = 0.5f;
    public boolean k = false;
    private ruv l;

    public GroundOverlayOptions() {
    }

    public final void a(float f2) {
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z = true;
        }
        iva.b(z, "Transparency must be in the range [0..1]");
        this.h = f2;
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean z, float f6, float f7, float f8, boolean z2) {
        mby mby;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(iBinder);
        } else {
            mby = null;
        }
        this.l = new ruv(mby);
        this.a = latLng;
        this.b = f2;
        this.c = f3;
        this.d = latLngBounds;
        this.e = f4;
        this.f = f5;
        this.g = z;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = z2;
    }

    public final void a(LatLng latLng, float f2, float f3) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Position has already been set using positionFromBounds");
        if (latLng != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "Location must be specified");
        iva.b(f2 >= 0.0f, "Width must be non-negative");
        if (f3 < 0.0f) {
            z3 = false;
        }
        iva.b(z3, "Height must be non-negative");
        this.a = latLng;
        this.b = f2;
        this.c = f3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.l.a.asBinder());
        ivx.a(parcel, 3, this.a, i2, false);
        ivx.a(parcel, 4, this.b);
        ivx.a(parcel, 5, this.c);
        ivx.a(parcel, 6, this.d, i2, false);
        ivx.a(parcel, 7, this.e);
        ivx.a(parcel, 8, this.f);
        ivx.a(parcel, 9, this.g);
        ivx.a(parcel, 10, this.h);
        ivx.a(parcel, 11, this.i);
        ivx.a(parcel, 12, this.j);
        ivx.a(parcel, 13, this.k);
        ivx.b(parcel, a2);
    }

    public final void a(ruv ruv) {
        iva.a((Object) ruv, (Object) "imageDescriptor must not be null");
        this.l = ruv;
    }
}
