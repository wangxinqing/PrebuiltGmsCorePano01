package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lma extends bhv implements IInterface {
    public lma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IBooleanCallback");
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(1, aQ);
    }
}
