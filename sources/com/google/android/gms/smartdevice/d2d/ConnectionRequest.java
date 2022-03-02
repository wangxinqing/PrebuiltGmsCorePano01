package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abol();
    public final D2DDevice a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final String e;
    public final int f;

    public ConnectionRequest(D2DDevice d2DDevice, String str, String str2, byte[] bArr, String str3, int i) {
        this.a = d2DDevice;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionRequest) {
            ConnectionRequest connectionRequest = (ConnectionRequest) obj;
            return ius.a(connectionRequest.a, this.a) && ius.a(connectionRequest.b, this.b) && ius.a(connectionRequest.c, this.c) && Arrays.equals(connectionRequest.d, this.d) && ius.a(connectionRequest.e, this.e) && connectionRequest.f == this.f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.d)), this.c, this.e, Integer.valueOf(this.f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }
}
