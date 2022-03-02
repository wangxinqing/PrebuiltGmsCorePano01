package defpackage;

import android.content.Context;

/* renamed from: ehr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehr {
    private static ehr a;
    private final qwq b;

    private ehr(qwq qwq) {
        this.b = qwq;
    }

    public static synchronized ehr a() {
        ehr ehr;
        synchronized (ehr.class) {
            if (a == null) {
                ehr ehr2 = new ehr(qwq.a((Context) ihs.b()));
                a = ehr2;
                ehr2.b();
            }
            ehr = a;
        }
        return ehr;
    }

    public final void b() {
        qwq qwq = this.b;
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.audit.upload.AuditGcmTaskService";
        qxf.a(awin.a.a().f(), awin.a.a().e());
        qxf.k = "audit_task";
        qxf.b(1);
        qxf.n = true;
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        qwq.a((qxx) qxf.b());
    }
}
