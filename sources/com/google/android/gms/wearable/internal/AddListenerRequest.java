package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adzf();
    public final aeay a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public AddListenerRequest(aebu aebu) {
        this.a = aebu;
        throw null;
    }

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        aeay aeay;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof aeay) {
                aeay = (aeay) queryLocalInterface;
            } else {
                aeay = new aeaw(iBinder);
            }
            this.a = aeay;
        } else {
            this.a = null;
        }
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        aeay aeay = this.a;
        if (aeay != null) {
            iBinder = aeay.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 2, iBinder);
        ivx.a(parcel, 3, (Parcelable[]) this.b, i);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, a2);
    }
}
