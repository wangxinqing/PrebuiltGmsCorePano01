package defpackage;

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: rsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsu extends bhw implements rsv {
    final /* synthetic */ rqk a;

    public rsu() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) bhx.a(parcel, CameraPosition.CREATOR);
        this.a.a();
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rsu(rqk rqk) {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        this.a = rqk;
    }
}
