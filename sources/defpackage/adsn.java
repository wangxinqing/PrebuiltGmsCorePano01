package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: adsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsn extends bhv implements adsp {
    public adsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(3, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void c(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(5, aQ);
    }

    public final void d(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(7, aQ);
    }

    public final void a(Status status, ConsentInformation consentInformation) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) consentInformation);
        c(9, aQ);
    }

    public final void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) usageReportingOptInOptions);
        c(2, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeStringList(list);
        c(6, aQ);
    }

    public final void a(Status status, boolean z, ConsentInformation consentInformation) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        bhx.a(aQ, (Parcelable) consentInformation);
        c(8, aQ);
    }
}
