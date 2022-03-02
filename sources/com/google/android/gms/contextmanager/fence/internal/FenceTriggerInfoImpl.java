package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jvi();
    public final boolean a;
    public final String b;

    public FenceTriggerInfoImpl(boolean z, String str) {
        this.a = z;
        iva.c(str);
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
