package defpackage;

/* renamed from: dpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpi extends dnd {
    public dpi(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        qwq.a(d().getApplicationContext()).a("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.analytics.AnalyticsTaskService");
    }

    public final void s() {
        super.s();
        qwq.a(d()).a("Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.analytics.AnalyticsTaskService");
    }

    public final void a(long j) {
        a("Scheduling task with Gcm. Time", Long.valueOf(j));
        qwq a = qwq.a(d().getApplicationContext());
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.analytics.AnalyticsTaskService";
        qxf.a(j / 1000, ((j + j) / 1000) + 1);
        qxf.k = "Analytics.AnalyticsTaskService.UPLOAD_TASK_TAG";
        qxf.b(1);
        qxf.n = true;
        a.a((qxx) qxf.b());
    }
}
