package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: efm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efm extends bhv implements efo {
    public efm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(2, aQ);
    }

    public final void a(List list) {
        Parcel aQ = aQ();
        aQ.writeTypedList(list);
        b(1, aQ);
    }
}
