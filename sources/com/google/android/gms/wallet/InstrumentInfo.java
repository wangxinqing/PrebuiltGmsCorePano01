package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adwh();
    public String a;
    public String b;
    private int c;

    private InstrumentInfo() {
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        int i2 = 0;
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        int i3 = this.c;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i2 = i3;
        }
        ivx.b(parcel, 4, i2);
        ivx.b(parcel, a2);
    }
}
