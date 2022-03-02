package defpackage;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: rqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqt {
    public final rui a;

    public rqt(rui rui) {
        this.a = rui;
    }

    public final Point a(LatLng latLng) {
        try {
            return (Point) mbz.a(this.a.a(latLng));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }

    public final LatLng a(Point point) {
        try {
            return this.a.a(mbz.a((Object) point));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
