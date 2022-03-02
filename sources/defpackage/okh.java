package defpackage;

import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import java.util.List;

/* renamed from: okh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okh implements aora {
    final /* synthetic */ List a;
    final /* synthetic */ ReportBatchedMetricsChimeraGcmTaskService b;

    public okh(ReportBatchedMetricsChimeraGcmTaskService reportBatchedMetricsChimeraGcmTaskService, List list) {
        this.b = reportBatchedMetricsChimeraGcmTaskService;
        this.a = list;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (ReportBatchedMetricsChimeraGcmTaskService.a(((ogi) obj).a)) {
            this.b.a.a(this.a);
        }
    }

    public final void a(Throwable th) {
    }
}
