package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adij extends bhv implements adil {
    public adij(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.ISystemUpdateStatusCallback");
    }

    public final void a(SystemUpdateStatus systemUpdateStatus) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) systemUpdateStatus);
        c(1, aQ);
    }
}
