package defpackage;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: ruh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ruh extends bhw implements rui {
    public ruh() {
        super("com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    public final LatLng a(mby mby) {
        return new LatLng(0.0d, 0.0d);
    }

    public final VisibleRegion b() {
        return new VisibleRegion(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)));
    }

    public final mby a(LatLng latLng) {
        return mbz.a((Object) new Point(0, 0));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        mby mby;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
            } else {
                mby = null;
            }
            LatLng a = a(mby);
            parcel2.writeNoException();
            bhx.b(parcel2, a);
        } else if (i == 2) {
            mby a2 = a((LatLng) bhx.a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            bhx.a(parcel2, (IInterface) a2);
        } else if (i != 3) {
            return false;
        } else {
            VisibleRegion b = b();
            parcel2.writeNoException();
            bhx.b(parcel2, b);
        }
        return true;
    }
}
