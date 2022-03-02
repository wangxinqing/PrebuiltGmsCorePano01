package defpackage;

import android.content.Context;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;

/* renamed from: ajlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlo implements Runnable {
    final /* synthetic */ ReportingAndroidChimeraService a;

    public ajlo(ReportingAndroidChimeraService reportingAndroidChimeraService) {
        this.a = reportingAndroidChimeraService;
    }

    public final void run() {
        ajnw.a((Context) this.a);
        ReportingAndroidChimeraService reportingAndroidChimeraService = this.a;
        reportingAndroidChimeraService.a = ajmm.a((Context) reportingAndroidChimeraService);
        ReportingAndroidChimeraService reportingAndroidChimeraService2 = this.a;
        reportingAndroidChimeraService2.b = ajmo.a((Context) reportingAndroidChimeraService2);
    }
}
