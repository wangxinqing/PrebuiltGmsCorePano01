package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grm();
    public final int a;
    public final double b;

    public PowerStateImpl(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final String toString() {
        String num = Integer.toString(this.a);
        double d = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 69);
        sb.append("PowerConnectionState = ");
        sb.append(num);
        sb.append(" Battery Percentage = ");
        sb.append(d);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
