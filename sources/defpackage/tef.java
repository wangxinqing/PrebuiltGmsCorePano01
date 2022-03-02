package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tef extends bhv implements teh {
    public tef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    }

    public final void a(Device device) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) device);
        c(1, aQ);
    }

    public final void b() {
        c(2, aQ());
    }
}
