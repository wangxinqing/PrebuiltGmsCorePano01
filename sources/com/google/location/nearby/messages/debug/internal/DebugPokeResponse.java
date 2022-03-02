package com.google.location.nearby.messages.debug.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DebugPokeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asna();
    final int a;
    public final int b;
    public final byte[] c;

    public DebugPokeResponse(int i) {
        this(1, i, (byte[]) null);
    }

    public final String toString() {
        Integer num;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.b);
        byte[] bArr = this.c;
        if (bArr != null) {
            num = Integer.valueOf(bArr.length);
        } else {
            num = null;
        }
        objArr[1] = num;
        return String.format("DebugPokeResponse{statusCode=%s, protoData.length=%s}", objArr);
    }

    public DebugPokeResponse(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
