package defpackage;

/* renamed from: sva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sva extends syv {
    public sva(sze sze) {
        super(sze);
    }

    public final void a(long j) {
        if (!ayjn.b() || !v().a(sud.aJ)) {
            E().k.a("Scheduling task with Gcm. time", Long.valueOf(j));
        }
        qwq a = qwq.a(z());
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.measurement.PackageMeasurementTaskService";
        qxf.a(j / 1000, ((j + j) / 1000) + 1);
        qxf.k = "Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG";
        qxf.b(1);
        qxf.n = true;
        a.a((qxx) qxf.b());
    }

    public final void b() {
        super.b();
        qwq.a(z()).a("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        qwq.a(z()).a("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG", "com.google.android.gms.measurement.PackageMeasurementTaskService");
        return super.a();
    }
}
