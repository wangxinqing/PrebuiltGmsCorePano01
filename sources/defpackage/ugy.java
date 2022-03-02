package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ugy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugy extends bhv implements uha {
    public ugy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(2, aQ);
    }
}
