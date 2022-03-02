package defpackage;

import android.content.Context;
import android.util.EventLog;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: adlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adlc {
    public static final adqz a = new adlb();
    private static final iwd c = adnt.d("LogControl");
    private static final adrg d = new adrg("control.log.last_event_log_hash_code", 0);
    private static final adrk e = new adrk("control.log.last_event_log_timestamp", 0L);
    private static final adrk f = new adrk("control.log.current_heart_beat_min_delay", -1L);
    private static final adrk g = new adrk("control.log.current_heart_beat_max_delay", -1L);
    private static final adra h = new adra("control.log.heart_beat_task_scheduled", false);
    public final adns b;
    private final Context i;
    private final adrn j = ((adrn) adrn.a.b());
    private final int k;

    static {
        new adrg("control.log.zero_rated_apn_status", 0);
    }

    public adlc(Context context) {
        this.i = context;
        this.b = adns.a(context);
        this.k = adke.b(context);
    }

    private static boolean a(SystemUpdateStatus systemUpdateStatus) {
        return !systemUpdateStatus.a.isEmpty() || ayqf.a.a().c();
    }

    public static boolean e() {
        if (ayqf.a.a().b() && ((adla) adla.h.b()).d().a.isEmpty()) {
            if (ayqf.c() > 0 && ayqf.b() > 0 && ayqf.c() < ayqf.b()) {
                return true;
            }
            c.e("Tasks parameter min_delay: %d, max_delay: %d incorrect.", Long.valueOf(ayqf.c()), Long.valueOf(ayqf.b()));
        }
        return false;
    }

    public final void b() {
        Context context = this.i;
        ChimeraGcmTaskService.a.c("Scheduling task: LogHeartBeat.", new Object[0]);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        qxf.k = "LogHeartBeat";
        qxf.a(ayqf.c(), ayqf.b());
        qxf.n = true;
        qxf.a(2);
        qxf.a(0, axcc.b() ? 1 : 0);
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
    }

    public final void c() {
        SystemUpdateStatus d2 = ((adla) adla.h.b()).d();
        int hashCode = Arrays.hashCode(new Object[]{Integer.valueOf(d2.c), d2.a});
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(ayox.h());
        int intValue = ((Integer) this.j.b(d)).intValue();
        long longValue = currentTimeMillis - ((Long) this.j.b(e)).longValue();
        if (intValue != hashCode || (a(d2) && longValue >= millis)) {
            this.j.a(d.b(Integer.valueOf(hashCode)), e.b(Long.valueOf(currentTimeMillis)));
            adkt adkt = (adkt) adkt.e.b();
            SystemUpdateStatus d3 = ((adla) adla.h.b()).d();
            int i2 = d3.c & 31;
            if (d3.i) {
                i2 |= 32;
            }
            if (d3.j) {
                i2 |= 64;
            }
            if (adkt.c() > 0) {
                i2 |= 512;
            }
            EventLog.writeEvent(201001, new Object[]{Long.valueOf((long) ((((d3.c >> 8) & 15) << 19) | i2 | 262144 | (((char) this.k) << 23))), 0, 0, ((adla) adla.h.b()).d().a});
            aucd o = anqh.d.o();
            int i3 = d2.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anqh anqh = (anqh) o.b;
            int i4 = 1 | anqh.a;
            anqh.a = i4;
            anqh.b = i3;
            String str = d2.a;
            if (str != null) {
                str.getClass();
                anqh.a = i4 | 2;
                anqh.c = str;
            }
            adns adns = this.b;
            anqh anqh2 = (anqh) o.i();
            aucd a2 = adns.a(2);
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            anqb anqb = (anqb) a2.b;
            anqb anqb2 = anqb.l;
            anqh2.getClass();
            anqb.f = anqh2;
            anqb.a |= 16;
            adns.a((anqb) a2.i());
        }
    }

    public final void d() {
        if (!(((Boolean) this.j.b(h)).booleanValue() && ayqf.c() == ((Long) this.j.b(f)).longValue() && ayqf.b() == ((Long) this.j.b(g)).longValue()) && e()) {
            b();
            a(true);
            return;
        }
        a(false);
    }

    public final void a() {
        if (a(((adla) adla.h.b()).d())) {
            Context context = this.i;
            ChimeraGcmTaskService.a.c("Scheduling task: LogStatus.", new Object[0]);
            qxf qxf = new qxf();
            qxf.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
            qxf.k = "LogStatus";
            qxf.a(ayox.h(), ayox.a.a().F());
            qxf.n = true;
            qxf.a(2);
            qxf.a(0, axcc.b() ? 1 : 0);
            qxf.b(1);
            qwq.a(context).a((qxx) qxf.b());
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.j.a(g.b(Long.valueOf(ayqf.b())));
            this.j.a(f.b(Long.valueOf(ayqf.c())));
        }
        this.j.a(h.b(Boolean.valueOf(z)));
    }
}
