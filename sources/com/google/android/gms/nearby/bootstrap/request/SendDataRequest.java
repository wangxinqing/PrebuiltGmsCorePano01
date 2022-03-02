package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tfc();
    final int a;
    public final Device b;
    public final byte[] c;
    public final teb d;

    public SendDataRequest(int i, Device device, byte[] bArr, IBinder iBinder) {
        teb teb;
        this.a = i;
        iva.a((Object) device);
        this.b = device;
        this.c = (byte[]) iva.a((Object) bArr);
        iva.a((Object) iBinder);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            teb = queryLocalInterface instanceof teb ? (teb) queryLocalInterface : new tdz(iBinder);
        } else {
            teb = null;
        }
        this.d = teb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c, false);
        teb teb = this.d;
        if (teb != null) {
            iBinder = teb.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public SendDataRequest(Device device, byte[] bArr, teb teb) {
        this.a = 1;
        iva.a((Object) device);
        this.b = device;
        this.c = (byte[]) iva.a((Object) bArr);
        iva.a((Object) teb);
        this.d = teb;
    }
}
