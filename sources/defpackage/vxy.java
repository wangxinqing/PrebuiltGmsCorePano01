package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: vxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vxy extends bhv implements vya {
    public vxy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        c(1, aQ);
    }
}
