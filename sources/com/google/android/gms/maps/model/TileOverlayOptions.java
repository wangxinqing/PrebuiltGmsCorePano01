package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvq();
    public boolean a = true;
    public float b;
    public boolean c = true;
    public float d = 0.0f;
    public rwq e;

    public TileOverlayOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.e.a);
        ivx.a(parcel, 3, this.a);
        ivx.a(parcel, 4, this.b);
        ivx.a(parcel, 5, this.c);
        ivx.a(parcel, 6, this.d);
        ivx.b(parcel, a2);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        rwq rwq;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            rwq = queryLocalInterface instanceof rwq ? (rwq) queryLocalInterface : new rwq(iBinder);
        } else {
            rwq = null;
        }
        this.e = rwq;
        if (rwq != null) {
            new rvp(this);
        }
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
