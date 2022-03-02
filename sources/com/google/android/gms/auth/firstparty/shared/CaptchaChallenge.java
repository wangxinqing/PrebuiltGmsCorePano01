package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdy();
    final int a;
    String b;
    public String c;
    public Bitmap d;

    public CaptchaChallenge(int i, String str, String str2, Bitmap bitmap) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bitmap;
    }

    public CaptchaChallenge(gei gei, String str, Bitmap bitmap) {
        this.a = 1;
        iva.a((Object) gei);
        this.b = gei.ac;
        this.c = str;
        this.d = bitmap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
