package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MigrationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yka();
    public final int a;
    public boolean b;

    public MigrationStatus(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
