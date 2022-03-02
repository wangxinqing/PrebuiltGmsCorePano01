package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vbd();
    final int a;
    public final int b;
    public final byte[] c;
    public final boolean d;

    public NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
