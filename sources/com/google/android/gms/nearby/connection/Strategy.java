package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tjg();
    public static final Strategy a = new Strategy(1, 3);
    public static final Strategy b = new Strategy(1, 2);
    public static final Strategy c = new Strategy(1, 1);
    public final int d;
    public final int e;

    public Strategy(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final String a() {
        if (a.equals(this)) {
            return "P2P_CLUSTER";
        }
        if (!b.equals(this)) {
            return !c.equals(this) ? "UNKNOWN" : "P2P_POINT_TO_POINT";
        }
        return "P2P_STAR";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Strategy) {
            Strategy strategy = (Strategy) obj;
            return this.d == strategy.d && this.e == strategy.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "Strategy(%s){connectionType=%d, topology=%d}", new Object[]{a(), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 3, this.d);
        ivx.b(parcel, 4, this.e);
        ivx.b(parcel, a2);
    }
}
