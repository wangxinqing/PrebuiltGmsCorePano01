package defpackage;

import com.android.volley.Response;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import java.util.List;

/* renamed from: oki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oki implements Response.Listener {
    final /* synthetic */ List a;
    final /* synthetic */ ReportBatchedMetricsChimeraGcmTaskService b;

    public oki(ReportBatchedMetricsChimeraGcmTaskService reportBatchedMetricsChimeraGcmTaskService, List list) {
        this.b = reportBatchedMetricsChimeraGcmTaskService;
        this.a = list;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Integer num = (Integer) obj;
        this.b.a.a(this.a);
    }
}
