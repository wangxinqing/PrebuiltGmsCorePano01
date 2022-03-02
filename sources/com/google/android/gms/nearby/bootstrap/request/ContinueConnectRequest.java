package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContinueConnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tey();
    final int a;
    public final String b;
    public final teb c;

    public ContinueConnectRequest(int i, String str, IBinder iBinder) {
        teb teb;
        this.a = i;
        iva.a((Object) str);
        this.b = str;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            teb = queryLocalInterface instanceof teb ? (teb) queryLocalInterface : new tdz(iBinder);
        } else {
            teb = null;
        }
        this.c = teb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        teb teb = this.c;
        if (teb != null) {
            iBinder = teb.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 2, iBinder);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public ContinueConnectRequest(String str, teb teb) {
        this.a = 1;
        iva.a((Object) str);
        this.b = str;
        iva.a((Object) teb);
        this.c = teb;
    }
}
