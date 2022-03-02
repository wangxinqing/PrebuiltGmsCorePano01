package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcl();
    final int a;
    Bundle b;
    public boolean c;
    public boolean d;
    boolean e;
    public String f;
    public String g;
    public String h;
    String i;
    boolean j;
    boolean k;
    public boolean l;
    String m;
    public AppDescription n;
    public AccountCredentials o;
    public CaptchaSolution p;
    public String q;
    public String r;

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l);
        ivx.a(parcel, 13, this.m, false);
        ivx.a(parcel, 14, this.n, i2, false);
        ivx.a(parcel, 15, this.o, i2, false);
        ivx.a(parcel, 16, this.p, i2, false);
        ivx.a(parcel, 17, this.q, false);
        ivx.a(parcel, 18, this.r, false);
        ivx.b(parcel, a2);
    }

    public GoogleAccountSetupRequest(int i2, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.a = i2;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = appDescription;
        this.o = accountCredentials;
        this.p = captchaSolution;
        this.q = str6;
        this.r = str7;
    }
}
