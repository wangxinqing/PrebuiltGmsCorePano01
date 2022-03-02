package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProxyGrpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fve();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final String f;

    public ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
