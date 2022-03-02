package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gbp();
    public static final String a = ConsentResult.class.getName();
    public final int b;
    public final String c;
    public final String d;
    public final FACLConfig e;
    public final String f;
    public final String g;
    public final String h;

    public ConsentResult(int i, String str, String str2, FACLConfig fACLConfig, String str3, String str4, String str5) {
        this.b = i;
        iva.a((Object) str);
        this.c = str;
        this.d = str2;
        this.e = fACLConfig;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final gei a() {
        return gei.a(this.c);
    }

    public final gda b() {
        return gda.a(this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, i, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.b(parcel, a2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConsentResult(defpackage.gei r9, defpackage.gda r10, java.lang.String r11) {
        /*
            r8 = this;
            defpackage.iva.a((java.lang.Object) r9)
            java.lang.String r2 = r9.toString()
            defpackage.iva.a((java.lang.Object) r10)
            java.lang.String r5 = r10.toString()
            r1 = 3
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = r8
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(gei, gda, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConsentResult(defpackage.gei r9, java.lang.String r10, com.google.android.gms.auth.firstparty.shared.FACLConfig r11, defpackage.gda r12, java.lang.String r13) {
        /*
            r8 = this;
            defpackage.iva.a((java.lang.Object) r9)
            java.lang.String r2 = r9.toString()
            defpackage.iva.a((java.lang.Object) r12)
            java.lang.String r5 = r12.toString()
            r1 = 3
            r7 = 0
            r0 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(gei, java.lang.String, com.google.android.gms.auth.firstparty.shared.FACLConfig, gda, java.lang.String):void");
    }
}
