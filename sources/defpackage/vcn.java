package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcn extends bhv implements IInterface {
    public vcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        c(1, aQ);
    }
}
