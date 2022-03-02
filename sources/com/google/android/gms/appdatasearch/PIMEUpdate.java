package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PIMEUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtd();
    final byte[] a;
    final byte[] b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    final Bundle g;
    public final long h;
    public final long i;
    public final Account j;

    public PIMEUpdate(byte[] bArr, byte[] bArr2, int i2, String str, String str2, boolean z, Bundle bundle, long j2, long j3, Account account) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = bundle;
        this.h = j2;
        this.i = j3;
        this.j = account;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j, i2, false);
        ivx.b(parcel, a2);
    }
}
