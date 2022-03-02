package com.google.android.gms.auth.frp;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PersistentDeviceOwnerState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gfq();
    public final ComponentName a;
    public final String b;

    public PersistentDeviceOwnerState(ComponentName componentName, String str) {
        this.a = componentName;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
