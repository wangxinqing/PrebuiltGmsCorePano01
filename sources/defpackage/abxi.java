package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxi extends bhv implements abxk {
    public abxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(3, aQ);
    }

    public final void b() {
        c(2, aQ());
    }

    public final void a(D2DDevice d2DDevice) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) d2DDevice);
        c(1, aQ);
    }

    public final void b(D2DDevice d2DDevice) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) d2DDevice);
        c(4, aQ);
    }
}
