package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gkz();
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final Intent f;
    public final String g;
    public final boolean h;

    public AccountDetail(String str, String str2, boolean z, String str3, boolean z2, Intent intent, String str4, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = intent;
        this.g = str4;
        this.h = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }
}
