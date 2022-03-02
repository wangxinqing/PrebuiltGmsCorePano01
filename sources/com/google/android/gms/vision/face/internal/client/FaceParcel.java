package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new advv();
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final LandmarkParcel[] j;
    public final float k;
    public final float l;
    public final float m;
    public final ContourParcel[] n;
    public final float o;

    public FaceParcel(int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, LandmarkParcel[] landmarkParcelArr, float f9, float f10, float f11, ContourParcel[] contourParcelArr, float f12) {
        this.a = i2;
        this.b = i3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = landmarkParcelArr;
        this.k = f9;
        this.l = f10;
        this.m = f11;
        this.n = contourParcelArr;
        this.o = f12;
    }

    public FaceParcel(int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10) {
        this(i2, i3, f2, f3, f4, f5, f6, f7, 0.0f, landmarkParcelArr, f8, f9, f10, new ContourParcel[0], -1.0f);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, (Parcelable[]) this.j, i2);
        ivx.a(parcel, 10, this.k);
        ivx.a(parcel, 11, this.l);
        ivx.a(parcel, 12, this.m);
        ivx.a(parcel, 13, (Parcelable[]) this.n, i2);
        ivx.a(parcel, 14, this.i);
        ivx.a(parcel, 15, this.o);
        ivx.b(parcel, a2);
    }
}
