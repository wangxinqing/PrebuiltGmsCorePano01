package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScopeData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new geg();
    public static final List a = Collections.emptyList();
    final int b;
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public final boolean g;
    public String h;
    public final String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public List p;
    public String q;

    public ScopeData(int i2, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = list;
        this.q = str7;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean b() {
        return !this.p.isEmpty();
    }

    public final String c() {
        return b() ? (String) this.p.get(0) : "";
    }

    public ScopeData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str7) {
        this(1, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, list, str7);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i, false);
        ivx.a(parcel, 9, this.j);
        ivx.a(parcel, 10, this.k);
        ivx.a(parcel, 11, this.l);
        ivx.a(parcel, 12, this.m);
        ivx.a(parcel, 13, this.n);
        ivx.a(parcel, 14, this.o);
        ivx.b(parcel, 15, this.p, false);
        ivx.a(parcel, 16, this.q, false);
        ivx.b(parcel, a2);
    }
}
