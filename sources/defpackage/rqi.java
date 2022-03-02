package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqi {
    public static rsb a;

    public static rqh a(LatLng latLng) {
        try {
            return new rqh(a().a(latLng, 17.0f));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public static rqh a(LatLngBounds latLngBounds, int i, int i2) {
        try {
            return new rqh(a().a(latLngBounds, i, i2, 0));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public static rsb a() {
        rsb rsb = a;
        iva.a((Object) rsb, (Object) "CameraUpdateFactory is not initialized");
        return rsb;
    }
}
