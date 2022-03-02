package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerifyAssertionRequest extends AbstractSafeParcelable implements aptv {
    public static final Parcelable.Creator CREATOR = new apvg();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;

    public VerifyAssertionRequest() {
        this.i = true;
        this.j = true;
    }

    public final void b() {
        this.o = true;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o2 = almx.k.o();
        boolean z = this.i;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        almx almx = (almx) o2.b;
        int i2 = almx.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        almx.a = i2;
        almx.f = z;
        boolean z2 = this.j;
        int i3 = i2 | 1024;
        almx.a = i3;
        almx.h = z2;
        String str = this.b;
        if (str != null) {
            str.getClass();
            i3 |= 128;
            almx.a = i3;
            almx.e = str;
        }
        String str2 = this.a;
        if (str2 != null) {
            str2.getClass();
            i3 |= 1;
            almx.a = i3;
            almx.b = str2;
        }
        String str3 = this.g;
        if (str3 != null) {
            str3.getClass();
            i3 |= 2;
            almx.a = i3;
            almx.c = str3;
        }
        String str4 = this.n;
        if (str4 != null) {
            str4.getClass();
            i3 |= 2048;
            almx.a = i3;
            almx.i = str4;
        }
        String str5 = this.p;
        if (str5 != null) {
            str5.getClass();
            almx.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
            almx.j = str5;
        }
        if (!TextUtils.isEmpty(this.l)) {
            String str6 = this.l;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            almx almx2 = (almx) o2.b;
            str6.getClass();
            almx2.a |= 16;
            almx2.d = str6;
        }
        if (!TextUtils.isEmpty(this.m)) {
            String str7 = this.m;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            almx almx3 = (almx) o2.b;
            str7.getClass();
            almx3.a |= 1;
            almx3.b = str7;
        }
        boolean z3 = this.o;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        almx almx4 = (almx) o2.b;
        almx4.a |= 512;
        almx4.g = z3;
        return (almx) o2.i();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h, false);
        ivx.a(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k, false);
        ivx.a(parcel, 13, this.l, false);
        ivx.a(parcel, 14, this.m, false);
        ivx.a(parcel, 15, this.n, false);
        ivx.a(parcel, 16, this.o);
        ivx.a(parcel, 17, this.p, false);
        ivx.b(parcel, a2);
    }

    public VerifyAssertionRequest(apvq apvq, String str) {
        iva.a((Object) apvq);
        String str2 = apvq.a;
        iva.c(str2);
        this.l = str2;
        iva.c(str);
        this.m = str;
        String str3 = apvq.c;
        iva.c(str3);
        this.e = str3;
        this.i = true;
        this.g = "providerId=" + this.e;
    }

    public VerifyAssertionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = z;
        this.j = z2;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = z3;
        this.p = str13;
    }
}
