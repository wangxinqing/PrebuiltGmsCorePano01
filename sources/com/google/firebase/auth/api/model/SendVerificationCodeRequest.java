package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendVerificationCodeRequest extends AbstractSafeParcelable implements aptv {
    public static final Parcelable.Creator CREATOR = new apuv();
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public SendVerificationCodeRequest(String str, long j, boolean z, String str2, String str3) {
        this(str, j, z, str2, str3, (String) null);
    }

    public SendVerificationCodeRequest(String str, long j, boolean z, String str2, String str3, String str4) {
        iva.c(str);
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = almn.e.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        almn almn = (almn) o.b;
        str.getClass();
        int i = almn.a | 1;
        almn.a = i;
        almn.b = str;
        String str2 = this.e;
        if (str2 != null) {
            str2.getClass();
            i |= 16;
            almn.a = i;
            almn.d = str2;
        }
        String str3 = this.f;
        if (str3 != null) {
            str3.getClass();
            almn.a = i | 8;
            almn.c = str3;
        }
        return (almn) o.i();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, a2);
    }
}
