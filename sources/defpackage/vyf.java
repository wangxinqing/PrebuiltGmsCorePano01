package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: vyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyf extends bhv implements vyh {
    public vyf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IIntResultListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(1, aQ);
    }
}
