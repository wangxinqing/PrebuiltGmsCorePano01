package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: arya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arya extends bhv implements aryc {
    public arya(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
    }

    public final void a(int i, List list) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeTypedList(list);
        c(1, aQ);
    }
}
