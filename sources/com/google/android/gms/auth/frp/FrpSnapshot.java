package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FrpSnapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gfk();
    final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PersistentDeviceOwnerState e;
    public final boolean f;

    public FrpSnapshot(int i, boolean z, boolean z2, boolean z3, PersistentDeviceOwnerState persistentDeviceOwnerState, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = persistentDeviceOwnerState;
        this.f = z4;
    }

    public static FrpSnapshot a() {
        return new FrpSnapshot(false, false, false);
    }

    public static FrpSnapshot b() {
        return new FrpSnapshot(true, false, false);
    }

    public FrpSnapshot(boolean z, boolean z2, boolean z3) {
        this(1, z, z2, z3, (PersistentDeviceOwnerState) null, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }
}
