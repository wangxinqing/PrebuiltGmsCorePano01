package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: adst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adst extends bhv implements adsv {
    public adst(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void a(adsp adsp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adsp);
        b(2, aQ);
    }

    public final void b(adss adss, adsp adsp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adss);
        bhx.a(aQ, (IInterface) adsp);
        b(5, aQ);
    }

    public final void c(adss adss, adsp adsp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adss);
        bhx.a(aQ, (IInterface) adsp);
        b(10, aQ);
    }

    public final void a(adss adss, adsp adsp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adss);
        bhx.a(aQ, (IInterface) adsp);
        b(4, aQ);
    }

    public final void a(UsageReportingOptInOptions usageReportingOptInOptions, adsp adsp) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) usageReportingOptInOptions);
        bhx.a(aQ, (IInterface) adsp);
        b(3, aQ);
    }

    public final void a(String str, adsp adsp) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (IInterface) adsp);
        b(8, aQ);
    }

    public final void a(String str, ConsentInformation consentInformation, adsp adsp) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) consentInformation);
        bhx.a(aQ, (IInterface) adsp);
        b(9, aQ);
    }
}
