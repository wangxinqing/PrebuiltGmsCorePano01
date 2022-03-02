package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableTransferPreferences extends AbstractSafeParcelable implements jzy {
    public static final Parcelable.Creator CREATOR = new kxg();
    final int a;
    final int b;
    final boolean c;

    public ParcelableTransferPreferences(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public ParcelableTransferPreferences(jzy jzy) {
        this(jzy.a(), jzy.c(), jzy.b());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
