package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmj extends bhv implements IInterface {
    public lmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IIntCallback");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(1, aQ);
    }
}
