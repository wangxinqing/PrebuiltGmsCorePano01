package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.CheckInResponse;

/* renamed from: advd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advd extends bhv implements advf {
    public advd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.IReportCheckInCallback");
    }

    public final void a(Status status, CheckInResponse checkInResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) checkInResponse);
        c(1, aQ);
    }
}
