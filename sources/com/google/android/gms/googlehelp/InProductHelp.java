package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nyz();
    public GoogleHelp a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
    }

    public final void a() {
        this.f = 0;
    }

    public final void b() {
        this.d = 0;
    }

    public final void c() {
        this.e = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }
}
