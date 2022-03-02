package defpackage;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: rtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rtm extends bhw implements rtn {
    final /* synthetic */ rql a;

    public rtm() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        LatLng latLng = (LatLng) bhx.a(parcel, LatLng.CREATOR);
        this.a.b();
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtm(rql rql) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
        this.a = rql;
    }
}
