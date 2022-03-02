package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.CheckInResponse;

/* renamed from: adve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adve extends bhw implements advf {
    private final ifu a;

    public adve() {
        super("com.google.android.gms.userlocation.internal.IReportCheckInCallback");
    }

    public final void a(Status status, CheckInResponse checkInResponse) {
        this.a.a(status);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (CheckInResponse) bhx.a(parcel, CheckInResponse.CREATOR));
        return true;
    }

    public adve(ifu ifu) {
        super("com.google.android.gms.userlocation.internal.IReportCheckInCallback");
        this.a = ifu;
    }
}
