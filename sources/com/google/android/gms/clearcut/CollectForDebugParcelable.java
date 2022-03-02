package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CollectForDebugParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hop();
    public final boolean a;
    public final long b;
    public final long c;

    public CollectForDebugParcelable(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollectForDebugParcelable) {
            CollectForDebugParcelable collectForDebugParcelable = (CollectForDebugParcelable) obj;
            return this.a == collectForDebugParcelable.a && this.b == collectForDebugParcelable.b && this.c == collectForDebugParcelable.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[" + "skipPersistentStorage: " + this.a + ",collectForDebugStartTimeMillis: " + this.b + ",collectForDebugExpiryTimeMillis: " + this.c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
