package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tex();
    final int a;
    public final Device b;
    public final String c;
    public final String d;
    public final tdv e;
    public final tdy f;
    public final teb g;
    public final byte h;
    public final long i;
    public final String j;
    public final byte k;
    public final byte l;

    public ConnectRequest(int i2, Device device, String str, String str2, byte b2, long j2, String str3, byte b3, byte b4, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        tdv tdv;
        tdy tdy;
        this.a = i2;
        iva.a((Object) device);
        this.b = device;
        iva.c(str);
        this.c = str;
        iva.a((Object) str2);
        this.d = str2;
        this.h = b2;
        this.i = j2;
        this.k = b3;
        this.l = b4;
        this.j = str3;
        iva.a((Object) iBinder);
        teb teb = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            tdv = queryLocalInterface instanceof tdv ? (tdv) queryLocalInterface : new tdt(iBinder);
        } else {
            tdv = null;
        }
        this.e = tdv;
        iva.a((Object) iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            tdy = queryLocalInterface2 instanceof tdy ? (tdy) queryLocalInterface2 : new tdw(iBinder2);
        } else {
            tdy = null;
        }
        this.f = tdy;
        iva.a((Object) iBinder3);
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface3 instanceof teb) {
                teb = (teb) queryLocalInterface3;
            } else {
                teb = new tdz(iBinder3);
            }
        }
        this.g = teb;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i2, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        tdv tdv = this.e;
        IBinder iBinder3 = null;
        if (tdv != null) {
            iBinder = tdv.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 4, iBinder);
        tdy tdy = this.f;
        if (tdy != null) {
            iBinder2 = tdy.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 5, iBinder2);
        teb teb = this.g;
        if (teb != null) {
            iBinder3 = teb.asBinder();
        }
        ivx.a(parcel, 6, iBinder3);
        ivx.a(parcel, 7, this.h);
        ivx.a(parcel, 8, this.i);
        ivx.a(parcel, 9, this.j, false);
        ivx.a(parcel, 10, this.k);
        ivx.a(parcel, 11, this.l);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public ConnectRequest(Device device, String str, String str2, byte b2, String str3, byte b3, tdv tdv, tdy tdy, teb teb) {
        this.a = 1;
        iva.a((Object) device);
        this.b = device;
        iva.c(str);
        this.c = str;
        iva.a((Object) str2);
        this.d = str2;
        this.h = b2;
        this.i = 10000;
        this.j = str3;
        this.k = b3;
        this.l = 1;
        iva.a((Object) tdv);
        this.e = tdv;
        iva.a((Object) tdy);
        this.f = tdy;
        iva.a((Object) teb);
        this.g = teb;
    }
}
