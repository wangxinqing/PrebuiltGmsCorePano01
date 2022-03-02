package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aryh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryh extends bhv implements IInterface {
    public aryh(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.autotest.IAutoTestService");
    }

    public final void a(aryj aryj) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) aryj);
        c(1, aQ);
    }
}
