package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: arxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxx extends bhv implements arxz {
    public arxx(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDiscoveryService");
    }

    public final void a(aryc aryc) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) aryc);
        c(1, aQ);
    }

    public final void b(aryc aryc) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) aryc);
        c(2, aQ);
    }
}
