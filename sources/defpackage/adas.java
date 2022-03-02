package defpackage;

import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: adas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adas implements acvz {
    private final adat a;
    private final String b;

    public adas(adat adat, String str) {
        this.a = adat;
        this.b = str;
    }

    public final acwa a(Object obj) {
        OptInRequest optInRequest;
        adat adat = this.a;
        String str = this.b;
        ReportingState reportingState = (ReportingState) obj;
        if (reportingState == null) {
            return acws.a((Exception) new IllegalStateException("Reporting API returned no state"));
        }
        if (rma.a(reportingState.b()) && rma.a(reportingState.a())) {
            return acws.a((Object) null);
        }
        if (!reportingState.a || !reportingState.e()) {
            return acws.a((Exception) new IllegalStateException("The user is not eligible for enabling LH / LR"));
        }
        if (azro.a.a().a()) {
            rlx a2 = OptInRequest.a(adat.a);
            a2.c = str;
            optInRequest = a2.a();
        } else {
            optInRequest = OptInRequest.a(adat.a).a();
        }
        iby iby = adat.b;
        iha b2 = ihb.b();
        b2.a = new rmc(optInRequest);
        return iby.b(b2.a());
    }
}
