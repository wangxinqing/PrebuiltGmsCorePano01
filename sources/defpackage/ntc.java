package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ntc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntc extends bhv implements nte {
    public ntc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(2, aQ);
    }
}
