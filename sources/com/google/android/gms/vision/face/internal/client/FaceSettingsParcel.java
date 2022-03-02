package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new advw();
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    public FaceSettingsParcel() {
    }

    public FaceSettingsParcel(int i, int i2, int i3, boolean z, boolean z2, float f2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
