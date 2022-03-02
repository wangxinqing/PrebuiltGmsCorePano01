package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hss extends bhv implements hsu {
    public hss(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountService");
    }

    public final void a(hsr hsr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) hsr);
        c(1, aQ);
    }
}
