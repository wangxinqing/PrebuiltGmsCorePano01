package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ParcelableListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wxz();
    final boolean a;
    final boolean b;
    public final String c;
    final boolean d;
    public final Bundle e;

    public ParcelableListOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("useOfflineDatabase", Boolean.valueOf(this.a));
        a2.a("useWebData", Boolean.valueOf(this.b));
        a2.a("useCP2", Boolean.valueOf(this.d));
        a2.a("endpoint", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
