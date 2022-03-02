package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectionFragmentOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dyi();
    public final String a;
    public final int b;
    public final ArrayList c;
    public final boolean d;
    public final String[] e;
    public final int f;
    public final int g;
    public final String h;
    @Deprecated
    public final String i;
    public final boolean j;
    public final ArrayList k;
    public final boolean l;
    public final boolean m;
    public final Bundle n;

    public SelectionFragmentOptions(String str, int i2, ArrayList arrayList, boolean z, String[] strArr, int i3, int i4, String str2, String str3, boolean z2, ArrayList arrayList2, boolean z3, boolean z4, Bundle bundle) {
        this.a = str;
        this.b = i2;
        this.c = arrayList;
        this.d = z;
        this.e = strArr;
        this.f = i3;
        this.g = i4;
        this.h = str2;
        this.i = str3;
        this.j = z2;
        this.k = arrayList2;
        this.l = z3;
        this.m = z4;
        this.n = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.c(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h, false);
        ivx.a(parcel, 10, this.i, false);
        ivx.a(parcel, 11, this.j);
        ivx.c(parcel, 12, this.k, false);
        ivx.a(parcel, 13, this.l);
        ivx.a(parcel, 14, this.m);
        ivx.a(parcel, 15, this.n, false);
        ivx.b(parcel, a2);
    }
}
