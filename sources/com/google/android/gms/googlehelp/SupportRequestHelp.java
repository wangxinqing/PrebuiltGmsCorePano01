package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SupportRequestHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzb();
    public GoogleHelp a;
    public String b;
    public String c;
    public String d;
    public String e;

    public SupportRequestHelp(GoogleHelp googleHelp, String str, String str2, String str3, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public static SupportRequestHelp a(GoogleHelp googleHelp) {
        return new SupportRequestHelp(googleHelp, (String) null, (String) null, (String) null, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
