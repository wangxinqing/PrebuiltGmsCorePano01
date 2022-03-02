package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: cjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjz extends cbe implements cja, cao {
    public final bvk a;
    public final ckb b = new ckb();
    private final ckn c;
    private final cke d;
    private final cki e;
    private final cjy f;

    public cjz() {
        cjy cjy;
        if (!awvv.a.a().a()) {
            this.a = new bvk();
            this.c = new ckn();
            this.d = new cke();
            this.e = new cki();
            cjy = new cjy();
        } else {
            cjy = null;
            this.a = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.f = cjy;
    }

    public final void a() {
        new Object[1][0] = 0L;
        a(this.d, 0, 0, "DownloadSyncOperation", (String) null);
    }

    public final void a(bsz bsz, atjv atjv) {
    }

    public final void b(long j) {
        new Object[1][0] = Long.valueOf(j);
        a(this.c, 0, j, "SyncServerInterestRecordsOperation", (String) null);
    }

    public final void b(bsz bsz, atjv atjv) {
    }

    public final void c(long j) {
        long j2 = j + 86400000;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2)};
        a(this.e, j, j2, "RefreshStateOperation", (String) null);
    }

    public final void d(long j) {
        long p = j + awuz.a.a().p();
        Object[] objArr = {Long.valueOf(j), Long.valueOf(p)};
        a(this.f, j, p, "DailyCheckinOperation", (String) null);
    }

    public final void a(long j) {
        new Object[1][0] = Long.valueOf(j);
        a(this.b, 0, j, "SyncOperation", (String) null);
    }

    public final void a(bsz bsz, cas cas) {
        this.b.a(bsz, cas);
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
        if (cas2 != null) {
            this.b.a(bsz, cas2);
        }
        ckb ckb = this.b;
        ckc ckc = (ckc) ckb.a.get(bsz);
        if (ckc == null) {
            ckc = new ckc();
            ckb.a.put(bsz, ckc);
        }
        ckc.a(cas);
    }

    public final void a(bve bve, long j, long j2, String str, String str2) {
        boolean z;
        String str3;
        String str4 = str2;
        boolean z2 = true;
        if (this.a == null) {
            long j3 = j / 1000;
            long max = Math.max(1 + j3, j2 / 1000);
            Context f2 = cbi.f();
            qxf qxf = new qxf();
            qxf.i = "com.google.android.contextmanager.sync.ContextManagerTaskService";
            qxf.a(j3, max);
            qxf.a(0);
            if (str4 != null) {
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(":");
                sb.append(str4);
                str3 = sb.toString();
            } else {
                str3 = str;
            }
            qxf.k = str3;
            qwq.a(f2).a((qxx) qxf.b());
            return;
        }
        Object[] objArr = {bve, Long.valueOf(j), Long.valueOf(j2)};
        bvk bvk = this.a;
        iva.a((Object) bve);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (j2 < j) {
            z2 = false;
        }
        iva.b(z2);
        if (bvk.b.a()) {
            bvk.b.a(new bvh(bvk, bve, j, j2), bvq.a("TaskConsolidator#ScheduleOperation"));
            return;
        }
        throw new IllegalStateException("Background thread is not running.  Call start()");
    }

    public final void a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        ckc ckc;
        Object[] objArr = {contextData, contextManagerClientInfo};
        int g = contextData.g();
        ckb ckb = this.b;
        bsz a2 = contextManagerClientInfo.a();
        if (a2.b() || (ckc = (ckc) ckb.a.get(a2)) == null || ckc.a.get(g) == null) {
            Object[] objArr2 = {contextManagerClientInfo.a(), Integer.valueOf(g)};
            return;
        }
        ckb ckb2 = this.b;
        ckc ckc2 = (ckc) ckb2.a.get(contextManagerClientInfo.a());
        long j = Long.MAX_VALUE;
        if (ckc2 != null) {
            j = ((Long) ckc2.b.get(g, Long.MAX_VALUE)).longValue();
        }
        Object[] objArr3 = {contextManagerClientInfo.a(), Integer.valueOf(g), Long.valueOf(j)};
        a(j);
    }
}
