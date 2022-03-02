package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: boh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class boh extends bhv implements boj {
    public boh(IBinder iBinder) {
        super(iBinder, "com.google.android.chimera.container.internal.IUpdateProgressListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(1, aQ);
    }
}
