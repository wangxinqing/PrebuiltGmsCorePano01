package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncSubPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryr();
    public boolean a;
    public int b;

    public SyncSubPolicy(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static ryq a() {
        return new ryq();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncSubPolicy syncSubPolicy = (SyncSubPolicy) obj;
            return this.a == syncSubPolicy.a && this.b == syncSubPolicy.b;
        }
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * true) + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
