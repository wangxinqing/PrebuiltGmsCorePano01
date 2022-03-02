package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rqo();
    public int a = -1;
    public CameraPosition b;
    public Float c = null;
    public Float d = null;
    public LatLngBounds e = null;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;

    public GoogleMapOptions() {
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        float f6;
        float f7;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, rqu.a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.a = obtainAttributes.getInt(13, -1);
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.f = Boolean.valueOf(obtainAttributes.getBoolean(23, false));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.g = Boolean.valueOf(obtainAttributes.getBoolean(22, false));
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.i = Boolean.valueOf(obtainAttributes.getBoolean(14, true));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.m = Boolean.valueOf(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.q = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.j = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.l = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.k = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.h = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.n = Boolean.valueOf(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.o = Boolean.valueOf(obtainAttributes.getBoolean(15, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.p = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.c = Float.valueOf(obtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.d = Float.valueOf(obtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, rqu.a);
        if (obtainAttributes2.hasValue(10)) {
            f2 = Float.valueOf(obtainAttributes2.getFloat(10, 0.0f));
        } else {
            f2 = null;
        }
        if (obtainAttributes2.hasValue(11)) {
            f3 = Float.valueOf(obtainAttributes2.getFloat(11, 0.0f));
        } else {
            f3 = null;
        }
        if (obtainAttributes2.hasValue(8)) {
            f4 = Float.valueOf(obtainAttributes2.getFloat(8, 0.0f));
        } else {
            f4 = null;
        }
        if (obtainAttributes2.hasValue(9)) {
            f5 = Float.valueOf(obtainAttributes2.getFloat(9, 0.0f));
        } else {
            f5 = null;
        }
        obtainAttributes2.recycle();
        if (!(f2 == null || f3 == null || f4 == null || f5 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) f2.floatValue(), (double) f3.floatValue()), new LatLng((double) f4.floatValue(), (double) f5.floatValue()));
        }
        googleMapOptions.e = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, rqu.a);
        if (obtainAttributes3.hasValue(4)) {
            f6 = obtainAttributes3.getFloat(4, 0.0f);
        } else {
            f6 = 0.0f;
        }
        if (obtainAttributes3.hasValue(5)) {
            f7 = obtainAttributes3.getFloat(5, 0.0f);
        } else {
            f7 = 0.0f;
        }
        LatLng latLng = new LatLng((double) f6, (double) f7);
        rux a2 = CameraPosition.a();
        a2.a = latLng;
        if (obtainAttributes3.hasValue(7)) {
            a2.b = obtainAttributes3.getFloat(7, 0.0f);
        }
        if (obtainAttributes3.hasValue(1)) {
            a2.d = obtainAttributes3.getFloat(1, 0.0f);
        }
        if (obtainAttributes3.hasValue(6)) {
            a2.c = obtainAttributes3.getFloat(6, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.b = a2.a();
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("MapType", Integer.valueOf(this.a));
        a2.a("LiteMode", this.n);
        a2.a("Camera", this.b);
        a2.a("CompassEnabled", this.i);
        a2.a("ZoomControlsEnabled", this.h);
        a2.a("ScrollGesturesEnabled", this.j);
        a2.a("ZoomGesturesEnabled", this.k);
        a2.a("TiltGesturesEnabled", this.l);
        a2.a("RotateGesturesEnabled", this.m);
        a2.a("ScrollGesturesEnabledDuringRotateOrZoom", this.q);
        a2.a("MapToolbarEnabled", this.o);
        a2.a("AmbientEnabled", this.p);
        a2.a("MinZoomPreference", this.c);
        a2.a("MaxZoomPreference", this.d);
        a2.a("LatLngBoundsForCameraTarget", this.e);
        a2.a("ZOrderOnTop", this.f);
        a2.a("UseViewLifecycleInFragment", this.g);
        return a2.toString();
    }

    public GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f2, Float f3, LatLngBounds latLngBounds, byte b13) {
        this.f = rrc.a(b2);
        this.g = rrc.a(b3);
        this.a = i2;
        this.b = cameraPosition;
        this.h = rrc.a(b4);
        this.i = rrc.a(b5);
        this.j = rrc.a(b6);
        this.k = rrc.a(b7);
        this.l = rrc.a(b8);
        this.m = rrc.a(b9);
        this.n = rrc.a(b10);
        this.o = rrc.a(b11);
        this.p = rrc.a(b12);
        this.c = f2;
        this.d = f3;
        this.e = latLngBounds;
        this.q = rrc.a(b13);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, rrc.a(this.f));
        ivx.a(parcel, 3, rrc.a(this.g));
        ivx.b(parcel, 4, this.a);
        ivx.a(parcel, 5, this.b, i2, false);
        ivx.a(parcel, 6, rrc.a(this.h));
        ivx.a(parcel, 7, rrc.a(this.i));
        ivx.a(parcel, 8, rrc.a(this.j));
        ivx.a(parcel, 9, rrc.a(this.k));
        ivx.a(parcel, 10, rrc.a(this.l));
        ivx.a(parcel, 11, rrc.a(this.m));
        ivx.a(parcel, 12, rrc.a(this.n));
        ivx.a(parcel, 14, rrc.a(this.o));
        ivx.a(parcel, 15, rrc.a(this.p));
        ivx.a(parcel, 16, this.c);
        ivx.a(parcel, 17, this.d);
        ivx.a(parcel, 18, this.e, i2, false);
        ivx.a(parcel, 19, rrc.a(this.q));
        ivx.b(parcel, a2);
    }
}
