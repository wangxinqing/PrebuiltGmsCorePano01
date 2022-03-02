package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtj();
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final STSortSpec l;
    public final String m;
    public final int n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, int i5) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = z3;
        this.h = i4;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = sTSortSpec;
        this.m = str;
        this.n = i5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b, false);
        ivx.c(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, this.k, false);
        ivx.a(parcel, 12, this.l, i2, false);
        ivx.a(parcel, 13, this.m, false);
        ivx.b(parcel, 14, this.n);
        ivx.b(parcel, a2);
    }
}
