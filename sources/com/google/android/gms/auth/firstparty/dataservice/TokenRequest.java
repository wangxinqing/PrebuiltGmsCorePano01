package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdb();
    final int a;
    public String b;
    public String c;
    Bundle d;
    public FACLConfig e;
    public PACLConfig f;
    public boolean g;
    public boolean h;
    String i;
    public AppDescription j;
    public CaptchaSolution k;
    public boolean l;
    public boolean m;
    public String n;
    public int o;
    public String p;
    public String q;
    public String r;

    public TokenRequest(int i2, String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, boolean z2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, boolean z3, boolean z4, String str4, int i3, String str5, String str6, String str7) {
        this.d = new Bundle();
        gda.UNKNOWN.toString();
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = bundle;
        this.e = fACLConfig;
        this.f = pACLConfig;
        this.g = z;
        this.h = z2;
        this.i = str3;
        this.j = appDescription;
        this.k = captchaSolution;
        this.l = z3;
        this.m = z4;
        this.n = str4;
        this.o = i3;
        this.p = str5;
        this.q = str6;
        this.r = str7;
    }

    public final Account a() {
        if (!TextUtils.isEmpty(this.c)) {
            return new Account(this.c, this.n);
        }
        return null;
    }

    public final Bundle b() {
        return new Bundle(this.d);
    }

    public final gda c() {
        return gda.a(this.i);
    }

    public final void a(Bundle bundle) {
        this.d.clear();
        if (bundle != null) {
            this.d.putAll(bundle);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, i2, false);
        ivx.a(parcel, 11, this.k, i2, false);
        ivx.a(parcel, 13, this.l);
        ivx.a(parcel, 14, this.m);
        ivx.a(parcel, 15, this.n, false);
        ivx.b(parcel, 16, this.o);
        ivx.a(parcel, 17, this.p, false);
        ivx.a(parcel, 18, this.q, false);
        ivx.a(parcel, 19, this.r, false);
        ivx.b(parcel, a2);
    }

    public TokenRequest(Account account, String str) {
        this(account.name, account.type, str);
    }

    public final void a(gda gda) {
        iva.a((Object) gda, (Object) " Consent cannot be null");
        this.i = gda.toString();
    }

    @Deprecated
    public TokenRequest(String str, String str2, String str3) {
        this.d = new Bundle();
        this.i = gda.UNKNOWN.toString();
        this.l = false;
        this.m = true;
        this.o = 0;
        this.a = 5;
        this.c = str;
        this.n = str2;
        this.b = str3;
    }
}
