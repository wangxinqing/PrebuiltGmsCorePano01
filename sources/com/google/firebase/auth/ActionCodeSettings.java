package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apne();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public String h;
    public int i;
    public String j;

    public ActionCodeSettings() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = false;
        this.j = null;
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i2, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = z2;
        this.h = str6;
        this.i = i2;
        this.j = str7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.b(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j, false);
        ivx.b(parcel, a2);
    }
}
