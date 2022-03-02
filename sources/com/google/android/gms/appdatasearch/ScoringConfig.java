package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtx();
    public final boolean a;

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    public static dtw a() {
        return new dtw();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ScoringConfig) && this.a == ((ScoringConfig) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, a2);
    }
}
