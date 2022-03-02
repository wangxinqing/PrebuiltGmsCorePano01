package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;

/* renamed from: ruz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        mby mby;
        int b = ivw.b(parcel);
        ruv ruv = null;
        int i = 0;
        IBinder iBinder = null;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                f = ivw.m(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof mby) {
                mby = (mby) queryLocalInterface;
            } else {
                mby = new mbw(iBinder);
            }
            ruv = new ruv(mby);
        }
        return new Cap(i, ruv, f);
    }
}
