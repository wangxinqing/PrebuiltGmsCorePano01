package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TimeIntervalsImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grt();
    public final int[] a;

    public TimeIntervalsImpl(int[] iArr) {
        this.a = iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeIntervals=");
        if (this.a == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.a;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
