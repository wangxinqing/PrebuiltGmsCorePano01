package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: adtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adtc extends adso {
    private final idg a;

    public final void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        if (!status.c()) {
            this.a.a((Object) new adsw(status, (UsageReportingOptInOptions) null));
        } else {
            this.a.a((Object) new adsw(Status.a, usageReportingOptInOptions));
        }
    }

    public adtc(idg idg) {
        this.a = idg;
    }
}
