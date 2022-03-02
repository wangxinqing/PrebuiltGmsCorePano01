package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootstrapProgressResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abof();
    public final int a;
    public final Bundle b;

    public BootstrapProgressResult(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
