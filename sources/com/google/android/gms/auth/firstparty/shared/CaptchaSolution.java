package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CaptchaSolution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdz();
    final int a;
    public String b;
    public String c;

    public CaptchaSolution(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public CaptchaSolution(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
