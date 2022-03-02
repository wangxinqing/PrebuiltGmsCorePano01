package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: erd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erd extends bhv implements erf {
    public erd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.internal.IBooleanResultCallback");
    }

    public final void a(int i, boolean z) {
        Parcel aQ = aQ();
        aQ.writeInt(0);
        bhx.a(aQ, z);
        c(2, aQ);
    }
}
