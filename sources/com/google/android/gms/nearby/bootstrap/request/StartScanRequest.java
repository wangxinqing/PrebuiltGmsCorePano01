package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StartScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tfd();
    final int a;
    public final teh b;
    public final teb c;
    public final byte d;

    public StartScanRequest(int i, byte b2, IBinder iBinder, IBinder iBinder2) {
        teh teh;
        this.a = i;
        this.d = b2;
        iva.a((Object) iBinder);
        teb teb = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            teh = queryLocalInterface instanceof teh ? (teh) queryLocalInterface : new tef(iBinder);
        } else {
            teh = null;
        }
        this.b = teh;
        iva.a((Object) iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface2 instanceof teb) {
                teb = (teb) queryLocalInterface2;
            } else {
                teb = new tdz(iBinder2);
            }
        }
        this.c = teb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        teh teh = this.b;
        IBinder iBinder2 = null;
        if (teh != null) {
            iBinder = teh.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        teb teb = this.c;
        if (teb != null) {
            iBinder2 = teb.asBinder();
        }
        ivx.a(parcel, 2, iBinder2);
        ivx.a(parcel, 3, this.d);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public StartScanRequest(teh teh, teb teb) {
        this.a = 1;
        this.d = 1;
        iva.a((Object) teh);
        this.b = teh;
        iva.a((Object) teb);
        this.c = teb;
    }
}
