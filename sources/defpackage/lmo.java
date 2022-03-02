package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: lmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmo extends bhv implements IInterface {
    public lmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.ISuccessCallback");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(2, aQ);
    }

    public final void b() {
        b(1, aQ());
    }
}
