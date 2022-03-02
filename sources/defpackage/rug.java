package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: rug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rug extends bhv implements rui {
    public rug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    public final LatLng a(mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        Parcel a = a(1, aQ);
        LatLng latLng = (LatLng) bhx.a(a, LatLng.CREATOR);
        a.recycle();
        return latLng;
    }

    public final VisibleRegion b() {
        Parcel a = a(3, aQ());
        VisibleRegion visibleRegion = (VisibleRegion) bhx.a(a, VisibleRegion.CREATOR);
        a.recycle();
        return visibleRegion;
    }

    public final mby a(LatLng latLng) {
        mby mby;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLng);
        Parcel a = a(2, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby = null;
        }
        a.recycle();
        return mby;
    }
}
