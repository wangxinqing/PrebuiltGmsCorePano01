package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdo();
    public final int a;
    public boolean b;
    public boolean c;
    public List d;
    public Bundle e;
    public final AppDescription f;
    public boolean g;
    public final String h;
    public AccountAuthenticatorResponse i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ManagedAuthOptions t;

    public SetupAccountWorkflowRequest(int i2, boolean z, boolean z2, List list, Bundle bundle, AppDescription appDescription, boolean z3, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, boolean z7, boolean z8, boolean z9, ManagedAuthOptions managedAuthOptions) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = bundle;
        iva.a((Object) appDescription);
        this.f = appDescription;
        this.g = z3;
        this.h = str;
        this.i = accountAuthenticatorResponse;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = managedAuthOptions;
    }

    public final List a() {
        List list = this.d;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final Bundle b() {
        return new Bundle(this.e);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l, false);
        ivx.a(parcel, 13, this.m, false);
        ivx.a(parcel, 14, this.n, false);
        ivx.a(parcel, 15, this.o, false);
        ivx.a(parcel, 16, this.p);
        ivx.a(parcel, 17, this.q);
        ivx.a(parcel, 18, this.r);
        ivx.a(parcel, 19, this.s);
        ivx.a(parcel, 20, this.t, i2, false);
        ivx.b(parcel, a2);
    }

    public SetupAccountWorkflowRequest(AppDescription appDescription, String str) {
        this.a = 10;
        this.e = new Bundle();
        this.t = new ManagedAuthOptions();
        this.f = appDescription;
        this.h = str;
    }
}
