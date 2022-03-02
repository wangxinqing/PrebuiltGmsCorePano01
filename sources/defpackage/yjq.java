package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: yjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjq extends bhv implements yjs {
    public yjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
    }

    public final void a(yjp yjp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) yjp);
        b(4, aQ);
    }
}
