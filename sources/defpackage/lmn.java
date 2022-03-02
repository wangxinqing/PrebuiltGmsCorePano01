package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmn extends bhv implements IInterface {
    public lmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IStringCallback");
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(1, aQ);
    }
}
