package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hxt();
    public final String a;
    public final hxm b;
    public final boolean c;
    public final boolean d;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        its its;
        byte[] bArr;
        this.a = str;
        hxn hxn = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (!(queryLocalInterface instanceof its)) {
                    its = new itq(iBinder);
                } else {
                    its = (its) queryLocalInterface;
                }
                mby b2 = its.b();
                if (b2 != null) {
                    bArr = (byte[]) mbz.a(b2);
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                } else {
                    hxn = new hxn(bArr);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = hxn;
        this.c = z;
        this.d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        hxm hxm = this.b;
        if (hxm == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            hxm = null;
        }
        ivx.a(parcel, 2, (IBinder) hxm);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }

    public GoogleCertificatesQuery(String str, hxm hxm, boolean z, boolean z2) {
        this.a = str;
        this.b = hxm;
        this.c = z;
        this.d = z2;
    }
}
