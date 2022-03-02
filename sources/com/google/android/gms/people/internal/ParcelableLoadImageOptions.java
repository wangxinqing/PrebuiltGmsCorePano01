package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xab();
    public final int a;
    public final int b;
    public final boolean c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("imageSize", Integer.valueOf(this.a));
        a2.a("avatarOptions", Integer.valueOf(this.b));
        a2.a("useLargePictureForCp2Images", Boolean.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
