package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvh();
    public LatLng a;
    public String b;
    public String c;
    public ruv d;
    public float e = 0.5f;
    public float f = 1.0f;
    public boolean g;
    public boolean h = true;
    public boolean i = false;
    public float j = 0.0f;
    public float k = 0.5f;
    public float l = 0.0f;
    public float m = 1.0f;
    public float n;

    public MarkerOptions() {
    }

    public final void a() {
        this.e = 0.5f;
        this.f = 0.84375f;
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f2, float f3, boolean z, boolean z2, boolean z3, float f4, float f5, float f6, float f7, float f8) {
        mby mby;
        IBinder iBinder2 = iBinder;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof mby) {
                mby = (mby) queryLocalInterface;
            } else {
                mby = new mbw(iBinder);
            }
            this.d = new ruv(mby);
        } else {
            this.d = null;
        }
        this.e = f2;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.n = f8;
    }

    public final void a(LatLng latLng) {
        if (latLng != null) {
            this.a = latLng;
            return;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ruv ruv = this.d;
        if (ruv != null) {
            iBinder = ruv.a.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 5, iBinder);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k);
        ivx.a(parcel, 13, this.l);
        ivx.a(parcel, 14, this.m);
        ivx.a(parcel, 15, this.n);
        ivx.b(parcel, a2);
    }
}
