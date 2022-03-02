package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.lockbox.internal.LockboxSignedInStatus;

/* renamed from: rpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpr extends bhv implements rpt {
    public rpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.lockbox.internal.ILockboxService");
    }

    public final void a(String str, String str2) {
        Parcel aQ = aQ();
        aQ.writeString((String) null);
        aQ.writeString((String) null);
        b(7, aQ);
    }

    public final LockboxSignedInStatus b() {
        Parcel a = a(8, aQ());
        LockboxSignedInStatus lockboxSignedInStatus = (LockboxSignedInStatus) bhx.a(a, LockboxSignedInStatus.CREATOR);
        a.recycle();
        return lockboxSignedInStatus;
    }
}
