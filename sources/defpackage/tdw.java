package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: tdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdw extends bhv implements tdy {
    public tdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IDataListener");
    }

    public final void a(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        c(1, aQ);
    }
}
