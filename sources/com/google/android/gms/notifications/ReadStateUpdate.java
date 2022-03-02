package com.google.android.gms.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReadStateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wjv();
    final int a;
    public final int b;
    public final Identifier c;

    public ReadStateUpdate(int i, int i2, Identifier identifier) {
        this.a = i;
        this.b = i2;
        this.c = identifier;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
