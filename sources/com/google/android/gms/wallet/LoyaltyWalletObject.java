package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwi();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    @Deprecated
    String i;
    String j;
    int k;
    ArrayList l;
    TimeInterval m;
    ArrayList n;
    @Deprecated
    String o;
    @Deprecated
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    LoyaltyPoints v;

    LoyaltyWalletObject() {
        this.l = jhx.a();
        this.n = jhx.a();
        this.q = jhx.a();
        this.s = jhx.a();
        this.t = jhx.a();
        this.u = jhx.a();
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i2;
        this.l = arrayList;
        this.m = timeInterval;
        this.n = arrayList2;
        this.o = str11;
        this.p = str12;
        this.q = arrayList3;
        this.r = z;
        this.s = arrayList4;
        this.t = arrayList5;
        this.u = arrayList6;
        this.v = loyaltyPoints;
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
        ivx.a(parcel, 10, this.i, false);
        ivx.a(parcel, 11, this.j, false);
        ivx.b(parcel, 12, this.k);
        ivx.c(parcel, 13, this.l, false);
        ivx.a(parcel, 14, this.m, i2, false);
        ivx.c(parcel, 15, this.n, false);
        ivx.a(parcel, 16, this.o, false);
        ivx.a(parcel, 17, this.p, false);
        ivx.c(parcel, 18, this.q, false);
        ivx.a(parcel, 19, this.r);
        ivx.c(parcel, 20, this.s, false);
        ivx.c(parcel, 21, this.t, false);
        ivx.c(parcel, 22, this.u, false);
        ivx.a(parcel, 23, this.v, i2, false);
        ivx.b(parcel, a2);
    }
}
