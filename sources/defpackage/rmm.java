package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: rmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmm extends bhv implements rmo {
    public rmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
    }

    public final int a(OptInRequest optInRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) optInRequest);
        Parcel a = a(6, aQ);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final ReportingState a(Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        Parcel a = a(1, aQ);
        ReportingState reportingState = (ReportingState) bhx.a(a, ReportingState.CREATOR);
        a.recycle();
        return reportingState;
    }
}
