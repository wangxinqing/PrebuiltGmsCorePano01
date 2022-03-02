package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusSession extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywi();
    public final int a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final PlusCommonExtras j;

    public PlusSession(int i2, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.a = i2;
        this.b = str;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = plusCommonExtras;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.j.a(bundle);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusSession) {
            PlusSession plusSession = (PlusSession) obj;
            if (this.a != plusSession.a || !ius.a(this.b, plusSession.b) || !Arrays.equals(this.c, plusSession.c) || !Arrays.equals(this.d, plusSession.d) || !Arrays.equals(this.e, plusSession.e) || !ius.a(this.f, plusSession.f) || !ius.a(this.g, plusSession.g) || !ius.a(this.h, plusSession.h) || !ius.a(this.i, plusSession.i) || !ius.a(this.j, plusSession.j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("versionCode", Integer.valueOf(this.a));
        a2.a("accountName", this.b);
        a2.a("requestedScopes", this.c);
        a2.a("visibleActivities", this.d);
        a2.a("requiredFeatures", this.e);
        a2.a("packageNameForAuth", this.f);
        a2.a("callingPackageName", this.g);
        a2.a("applicationName", this.h);
        a2.a("extra", this.j.toString());
        return a2.toString();
    }

    public PlusSession(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.a = 1;
        this.b = str;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = null;
        this.j = plusCommonExtras;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i, false);
        ivx.a(parcel, 9, this.j, i2, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
