package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grk();
    public final int a;
    public final int b;

    public NetworkStateImpl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        String num = Integer.toString(this.a);
        String num2 = Integer.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 41 + String.valueOf(num2).length());
        sb.append("ConnectionState = ");
        sb.append(num);
        sb.append(" NetworkMeteredState = ");
        sb.append(num2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
