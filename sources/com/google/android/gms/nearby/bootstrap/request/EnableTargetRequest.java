package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EnableTargetRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tfb();
    final int a;
    public final String b;
    public final String c;
    public final tdv d;
    public final tdy e;
    public final teb f;
    public final byte g;
    public final byte h;

    public EnableTargetRequest(int i, String str, String str2, byte b2, byte b3, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        tdv tdv;
        tdy tdy;
        this.a = i;
        iva.c(str);
        this.b = str;
        iva.a((Object) str2);
        this.c = str2;
        this.g = b2;
        this.h = b3;
        iva.a((Object) iBinder);
        teb teb = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            tdv = queryLocalInterface instanceof tdv ? (tdv) queryLocalInterface : new tdt(iBinder);
        } else {
            tdv = null;
        }
        this.d = tdv;
        iva.a((Object) iBinder2);
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            tdy = queryLocalInterface2 instanceof tdy ? (tdy) queryLocalInterface2 : new tdw(iBinder2);
        } else {
            tdy = null;
        }
        this.e = tdy;
        iva.a((Object) iBinder3);
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
            if (queryLocalInterface3 instanceof teb) {
                teb = (teb) queryLocalInterface3;
            } else {
                teb = new tdz(iBinder3);
            }
        }
        this.f = teb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        tdv tdv = this.d;
        IBinder iBinder3 = null;
        if (tdv != null) {
            iBinder = tdv.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        tdy tdy = this.e;
        if (tdy != null) {
            iBinder2 = tdy.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 4, iBinder2);
        teb teb = this.f;
        if (teb != null) {
            iBinder3 = teb.asBinder();
        }
        ivx.a(parcel, 5, iBinder3);
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
