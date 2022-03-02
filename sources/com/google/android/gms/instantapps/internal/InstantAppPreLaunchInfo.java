package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppPreLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qgd();
    public final int a;
    public final String b;
    public final boolean c;
    public final Intent d;
    public final Intent e;
    public final AppInfo f;
    public final Route g;
    public final boolean h;
    public final byte[] i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final byte[] n;
    public final Bundle o;

    public InstantAppPreLaunchInfo(int i2, String str, boolean z, Intent intent, Intent intent2, AppInfo appInfo, Route route, boolean z2, byte[] bArr, String str2, int i3, int i4, String str3, byte[] bArr2, Bundle bundle) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = intent;
        this.e = intent2;
        this.f = appInfo;
        this.g = route;
        this.h = z2;
        this.i = bArr;
        this.j = str2;
        this.k = i3;
        this.m = str3;
        this.l = i4;
        this.n = bArr2;
        this.o = bundle;
    }

    public static InstantAppPreLaunchInfo a(Intent intent, boolean z, byte[] bArr) {
        iva.a((Object) intent);
        return new InstantAppPreLaunchInfo(0, (String) null, z, (Intent) null, intent, (AppInfo) null, (Route) null, false, bArr, (String) null, 0, 0, (String) null, (byte[]) null, (Bundle) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.a(parcel, 6, this.e, i2, false);
        ivx.a(parcel, 8, this.f, i2, false);
        ivx.a(parcel, 9, this.g, i2, false);
        ivx.a(parcel, 10, this.h);
        ivx.a(parcel, 11, this.i, false);
        ivx.a(parcel, 12, this.j, false);
        ivx.b(parcel, 13, this.k);
        ivx.a(parcel, 14, this.m, false);
        ivx.a(parcel, 15, this.o, false);
        ivx.b(parcel, 16, this.l);
        ivx.a(parcel, 17, this.n, false);
        ivx.b(parcel, a2);
    }
}
