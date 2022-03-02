package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenReceiver$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eeu();
    public final Encoding[] a;

    public TokenReceiver$Params(Encoding[] encodingArr) {
        this.a = encodingArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, (Parcelable[]) this.a, i);
        ivx.b(parcel, a2);
    }
}
