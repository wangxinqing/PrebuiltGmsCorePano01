package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: rtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rtz extends bhw implements rua {
    final /* synthetic */ akyw a;

    public rtz() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        mby mby;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            mby = queryLocalInterface instanceof mby ? (mby) queryLocalInterface : new mbw(readStrongBinder);
        } else {
            mby = null;
        }
        akyw akyw = this.a;
        Location location = (Location) mbz.a(mby);
        if (akyw.a.b.isAdded()) {
            akzj akzj = akyw.a.b;
            if (!akzj.b) {
                akzj.b = true;
                akzh akzh = akzj.t;
                if (akzh != null) {
                    akzh.a(new LatLng(location.getLatitude(), location.getLongitude()));
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtz(akyw akyw) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        this.a = akyw;
    }
}
