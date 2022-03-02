package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ehy();
    public String a;
    public String b;
    public String c;
    public String d = "/";
    public long e = -1;
    public boolean f;
    public boolean g;

    public BrowserResolutionCookie() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            return ius.a(this.a, browserResolutionCookie.a) && ius.a(this.b, browserResolutionCookie.b) && ius.a(this.c, browserResolutionCookie.c) && ius.a(this.d, browserResolutionCookie.d) && ius.a(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && ius.a(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        iva.c(str3);
        this.c = str3;
        iva.c(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }
}
