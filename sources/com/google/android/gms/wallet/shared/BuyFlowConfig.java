package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adxu();
    public String a;
    public ApplicationParameters b;
    public String c;
    public String d;
    String e;

    public BuyFlowConfig() {
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, a2);
    }
}
