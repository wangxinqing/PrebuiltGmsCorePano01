package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aebl();
    public final int a;
    public final int b;

    public SendMessageResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
