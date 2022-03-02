package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: efj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efj extends bhv implements efl {
    public efj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(1, aQ);
    }
}
