package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsl {
    static final anaf b;
    public static final /* synthetic */ int e = 0;
    private static acsl f = null;
    public final List a;
    final jfo c = new acsk(this, new jfp(10));
    public final hph d;

    static {
        anab h = anaf.h();
        h.a("android.intent.action.SCREEN_OFF", avvh.SCREEN_OFF);
        h.a("android.intent.action.SCREEN_ON", avvh.SCREEN_ON);
        h.a("android.intent.action.ACTION_POWER_CONNECTED", avvh.CHARGING);
        h.a("android.intent.action.ACTION_POWER_DISCONNECTED", avvh.DISCHARGING);
        h.a("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM", avvh.ALARM);
        b = h.a();
    }

    private acsl() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (acsq.a == null) {
            acsq.a = new acsq();
        }
        arrayList.add(acsq.a);
        List list = this.a;
        if (acsp.a == null) {
            acsp.a = new acsp();
        }
        list.add(acsp.a);
        List list2 = this.a;
        if (acss.a == null) {
            acss.a = new acss();
        }
        list2.add(acss.a);
        List list3 = this.a;
        if (acst.g == null) {
            acst.g = new acst();
        }
        list3.add(acst.g);
        this.d = new hph(new hol(ihs.b(), (String) null, (String) null), "PLATFORM_STATS_COUNTERS", 1024);
    }

    public static synchronized acsl a() {
        acsl acsl;
        synchronized (acsl.class) {
            if (f == null) {
                f = new acsl();
            }
            acsl = f;
        }
        return acsl;
    }

    public final void a(Intent intent) {
        if (!b.containsKey(intent.getAction())) {
            this.d.c("EastworldExecutorInvalidEvent").a();
            this.d.d();
            return;
        }
        this.c.sendEmptyMessage(((avvh) b.get(intent.getAction())).i);
    }
}
