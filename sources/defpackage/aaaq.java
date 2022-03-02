package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aaaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaaq extends bhv implements aaas {
    public aaaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.scheduler.IGmsTaskScheduler");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(2, aQ);
    }

    public final void a(Intent intent, aaav aaav) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) intent);
        bhx.a(aQ, (IInterface) aaav);
        c(1, aQ);
    }
}
