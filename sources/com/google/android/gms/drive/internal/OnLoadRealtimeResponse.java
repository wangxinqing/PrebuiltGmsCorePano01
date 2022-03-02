package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnLoadRealtimeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxa();
    final boolean a;

    public OnLoadRealtimeResponse(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
