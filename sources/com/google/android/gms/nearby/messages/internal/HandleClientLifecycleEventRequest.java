package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vcb();
    public final int a;
    @Deprecated
    public final ClientAppContext b;
    public final int c;

    public HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.a = i;
        this.b = clientAppContext;
        this.c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
