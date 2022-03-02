package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CallStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apmd();
    public static final CallStatus a = new CallStatus(1);
    public static final CallStatus b = new CallStatus(2);
    public static final CallStatus c = new CallStatus(3);
    public final int d;

    public CallStatus(int i) {
        this.d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.d);
        ivx.b(parcel, a2);
    }
}
