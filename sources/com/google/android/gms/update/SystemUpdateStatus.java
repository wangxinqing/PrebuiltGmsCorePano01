package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemUpdateStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adjm();
    public final boolean A;
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final double f;
    public final DownloadOptions g;
    public final InstallationOptions h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final ActivityStatus r;
    public final long s;
    public final String t;
    public final boolean u;
    public final long v;
    public final String w;
    public final UpdateDescription x;
    public final boolean y;
    public final boolean z;

    public SystemUpdateStatus(String str, boolean z2, int i2, int i3, int i4, double d2, DownloadOptions downloadOptions, InstallationOptions installationOptions, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j2, long j3, long j4, long j5, ActivityStatus activityStatus, long j6, String str2, boolean z8, long j7, String str3, UpdateDescription updateDescription, boolean z9, boolean z10, boolean z11) {
        this.a = str;
        this.b = z2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = d2;
        this.g = downloadOptions;
        this.h = installationOptions;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = j2;
        this.o = j3;
        this.p = j4;
        this.q = j5;
        this.r = activityStatus;
        this.s = j6;
        this.t = str2;
        this.u = z8;
        this.v = j7;
        this.w = str3;
        this.x = updateDescription;
        this.y = z9;
        this.z = z10;
        this.A = z11;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, i2, false);
        ivx.a(parcel, 8, this.h, i2, false);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l);
        ivx.a(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n);
        ivx.a(parcel, 15, this.o);
        ivx.a(parcel, 16, this.p);
        ivx.a(parcel, 17, this.q);
        ivx.a(parcel, 18, this.r, i2, false);
        ivx.a(parcel, 19, this.s);
        ivx.a(parcel, 20, this.t, false);
        ivx.a(parcel, 21, this.u);
        ivx.a(parcel, 22, this.v);
        ivx.a(parcel, 23, this.w, false);
        ivx.a(parcel, 24, this.x, i2, false);
        ivx.a(parcel, 25, this.y);
        ivx.a(parcel, 26, this.z);
        ivx.a(parcel, 27, this.A);
        ivx.b(parcel, a2);
    }
}
