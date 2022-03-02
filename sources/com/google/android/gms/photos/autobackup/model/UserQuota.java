package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserQuota extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ykc();
    public final int a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;

    public UserQuota() {
        this.a = 1;
    }

    public UserQuota(int i, long j, long j2, boolean z, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
