package com.google.android.places.ui.autocomplete;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SessionLogger extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new alcu();
    int a;
    int b;
    boolean c;
    public boolean d;
    boolean e;
    boolean f;
    public int g;
    int h;
    public int i;
    public int j;
    public String k;
    public int l;
    public int m;
    public boolean n;
    int o;
    long p;

    public SessionLogger() {
        this.a = 0;
        this.b = -1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = 0;
        this.p = -1;
    }

    public final aoec a() {
        return (aoec) amri.c(aoec.a(this.a)).a((Object) aoec.UNKNOWN_ORIGIN);
    }

    public final boolean b() {
        return this.p != -1;
    }

    public SessionLogger(int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4, int i5, int i6, int i7, String str, int i8, int i9, boolean z5, int i10, long j2) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = str;
        this.l = i8;
        this.m = i9;
        this.n = z5;
        this.o = i10;
        this.p = j2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, 7, this.g);
        ivx.b(parcel, 8, this.h);
        ivx.b(parcel, 9, this.i);
        ivx.b(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k, false);
        ivx.b(parcel, 12, this.l);
        ivx.b(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n);
        ivx.b(parcel, 15, this.o);
        ivx.a(parcel, 16, this.p);
        ivx.b(parcel, a2);
    }
}
