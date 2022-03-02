package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxw();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    @Deprecated
    String h;
    int i;
    ArrayList j;
    TimeInterval k;
    ArrayList l;
    @Deprecated
    String m;
    @Deprecated
    String n;
    ArrayList o;
    boolean p;
    ArrayList q;
    ArrayList r;
    ArrayList s;

    public CommonWalletObject() {
        this.j = jhx.a();
        this.l = jhx.a();
        this.o = jhx.a();
        this.q = jhx.a();
        this.r = jhx.a();
        this.s = jhx.a();
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i2;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h, false);
        ivx.b(parcel, 10, this.i);
        ivx.c(parcel, 11, this.j, false);
        ivx.a(parcel, 12, this.k, i2, false);
        ivx.c(parcel, 13, this.l, false);
        ivx.a(parcel, 14, this.m, false);
        ivx.a(parcel, 15, this.n, false);
        ivx.c(parcel, 16, this.o, false);
        ivx.a(parcel, 17, this.p);
        ivx.c(parcel, 18, this.q, false);
        ivx.c(parcel, 19, this.r, false);
        ivx.c(parcel, 20, this.s, false);
        ivx.b(parcel, a2);
    }
}
