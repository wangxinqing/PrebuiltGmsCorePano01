package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zpu();
    public final String a;
    public final String b;
    public final List c;

    public RecaptchaHandle(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
