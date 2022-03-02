package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new dub();
    public final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    public final int m;
    public final long[] n;
    public final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;

    public SearchResults(int i2, int[] iArr, String[] strArr, int[] iArr2, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, byte[] bArr2, double[] dArr, Bundle bundle, int i3, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3) {
        this((String) null, iArr2, bArr, bundleArr, bundleArr2, bundleArr3, i2, iArr, strArr, bArr2, dArr, bundle, i3, jArr, jArr2, bundleArr4, iArr3, bArr3);
    }

    public final boolean a() {
        return this.a != null;
    }

    /* renamed from: b */
    public final dua iterator() {
        return new dua(this);
    }

    public SearchResults(String str) {
        this(str, (int[]) null, (byte[]) null, (Bundle[]) null, (Bundle[]) null, (Bundle[]) null, 0, (int[]) null, (String[]) null, (byte[]) null, (double[]) null, (Bundle) null, 0, (long[]) null, (long[]) null, (Bundle[]) null, (int[]) null, (byte[]) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, (Parcelable[]) this.d, i2);
        ivx.a(parcel, 5, (Parcelable[]) this.e, i2);
        ivx.a(parcel, 6, (Parcelable[]) this.f, i2);
        ivx.b(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, this.k, false);
        ivx.a(parcel, 12, this.l, false);
        ivx.b(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n, false);
        ivx.a(parcel, 15, this.o, false);
        ivx.a(parcel, 16, (Parcelable[]) this.p, i2);
        ivx.a(parcel, 17, this.q, false);
        ivx.a(parcel, 18, this.r, false);
        ivx.b(parcel, a2);
    }

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i2, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i3, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i2;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i3;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
    }
}
