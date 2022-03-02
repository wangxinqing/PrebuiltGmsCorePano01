package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdc();
    public AuthzenBeginTxData A;
    final int a;
    @Deprecated
    String b;
    String c;
    @Deprecated
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public CaptchaChallenge n;
    public List o;
    public String p;
    public String q;
    public boolean r;
    public int s;
    PostSignInData t;
    public Account u;
    public String v;
    public TokenData w;
    public Bundle x;
    public String y;
    public ResolutionData z;

    public TokenResponse() {
        this.x = new Bundle();
        this.a = 8;
        this.o = new ArrayList();
    }

    @Deprecated
    public final String a() {
        Account account = this.u;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final void a(TokenData tokenData) {
        if (tokenData != null) {
            this.d = tokenData.b;
        } else {
            tokenData = null;
            this.d = null;
        }
        this.w = tokenData;
    }

    public final gei b() {
        return gei.c(this.c);
    }

    public final List c() {
        return Collections.unmodifiableList(this.o);
    }

    public final void a(Account account) {
        iva.a((Object) account, (Object) "Account can't be null.");
        this.u = account;
        this.b = account.name;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l);
        ivx.a(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n, i2, false);
        ivx.c(parcel, 15, this.o, false);
        ivx.a(parcel, 16, this.p, false);
        ivx.a(parcel, 17, this.q, false);
        ivx.a(parcel, 19, this.r);
        ivx.b(parcel, 20, this.s);
        ivx.a(parcel, 21, this.t, i2, false);
        ivx.a(parcel, 22, this.u, i2, false);
        ivx.a(parcel, 26, this.v, false);
        ivx.a(parcel, 27, this.w, i2, false);
        ivx.a(parcel, 28, this.x, false);
        ivx.a(parcel, 29, this.y, false);
        ivx.a(parcel, 30, this.z, i2, false);
        ivx.a(parcel, 31, this.A, i2, false);
        ivx.b(parcel, a2);
    }

    public TokenResponse(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, CaptchaChallenge captchaChallenge, List list, String str9, String str10, boolean z6, int i3, PostSignInData postSignInData, Account account, String str11, TokenData tokenData, Bundle bundle, String str12, ResolutionData resolutionData, AuthzenBeginTxData authzenBeginTxData) {
        List list2;
        String str13 = str3;
        Account account2 = account;
        TokenData tokenData2 = tokenData;
        this.x = new Bundle();
        this.a = i2;
        this.c = str2;
        this.d = str13;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = captchaChallenge;
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        this.o = list2;
        this.p = str9;
        this.q = str10;
        this.r = z6;
        this.s = i3;
        this.t = postSignInData;
        this.v = str11;
        this.x = bundle;
        this.y = str12;
        this.z = resolutionData;
        this.A = authzenBeginTxData;
        if (account2 != null) {
            a(account2);
        } else if (!TextUtils.isEmpty(str)) {
            String str14 = str;
            a(new Account(str, "com.google"));
        } else {
            this.b = null;
            this.u = null;
        }
        if (str13 != null && tokenData2 == null) {
            eis eis = new eis();
            eis.a = str13;
            a(eis.a());
            return;
        }
        a(tokenData2);
    }

    public final void a(gei gei) {
        iva.a((Object) gei);
        this.c = gei.ac;
    }
}
