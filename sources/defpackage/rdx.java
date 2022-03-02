package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: rdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdx extends bhv implements rdz {
    public rdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    public final void a(DeviceOrientation deviceOrientation) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) deviceOrientation);
        c(1, aQ);
    }
}
