package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tfa();
    final int a;
    public final Device b;
    public final teb c;

    public DisconnectRequest(int i, Device device, IBinder iBinder) {
        teb teb;
        this.a = i;
        iva.a((Object) device);
        this.b = device;
        iva.a((Object) iBinder);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            teb = queryLocalInterface instanceof teb ? (teb) queryLocalInterface : new tdz(iBinder);
        } else {
            teb = null;
        }
        this.c = teb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c.asBinder());
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public DisconnectRequest(Device device, teb teb) {
        this.a = 1;
        iva.a((Object) device);
        this.b = device;
        iva.a((Object) teb);
        this.c = teb;
    }
}
