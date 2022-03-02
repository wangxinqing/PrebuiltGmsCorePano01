package defpackage;

import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: chp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chp extends bwp {
    private static boolean c;

    public chp() {
        super("PruneStores");
        c = true;
    }

    public final void a() {
        bsx y = cbi.y();
        cjd p = cbi.p();
        for (bsz a : y.a()) {
            long aq = awuz.a.a().aq() - awuz.c();
            long a2 = cbi.i().a();
            long j = a2 - aq;
            StringBuilder sb = new StringBuilder(38);
            sb.append("maxKeepTimeMillis=");
            sb.append(aq);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("nowMillis=");
            sb2.append(a2);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("cutoffTimeMillis=");
            sb3.append(j);
            sb3.toString();
            ContextManagerClientInfo a3 = cbi.a(a, "PruneStores");
            jtm jtm = new jtm();
            juu juu = new juu();
            juu.a(j);
            jtm.a(-1, juu.a());
            ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) jtm.a();
            p.b.a(a3.a(), contextDataFilterImpl, true);
            p.a.a(contextDataFilterImpl, a3.a());
        }
        cbi.q().a();
        cbi.o().a.a();
        if (!c && awuz.a.a().M()) {
            Set a4 = cbi.y().a();
            if (!a4.isEmpty()) {
                jtm jtm2 = new jtm();
                jtm2.a(-1);
                jtm2.b(1);
                jtn a5 = jtm2.a();
                cjd p2 = cbi.p();
                Iterator it = a4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bsz bsz = (bsz) it.next();
                    cjb a6 = p2.a((ContextDataFilterImpl) a5, cbi.a(bsz, "AccountManager"));
                    if (a6.a == 0) {
                        ArrayList arrayList = a6.b;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        ((anih) ((anih) bxk.a.c()).a("bsx", "b", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AccountManager] Can't read store: %s, %s", (Object) bsz, a6.a);
                    }
                }
            }
            cap r = cbi.r();
            if (r.a.isEmpty() && r.b.e().isEmpty()) {
                ((anih) ((anih) bxk.a.c()).a("chp", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PruneStores] Stopping service!");
                for (bsz b : cbi.y().a()) {
                    cbi.o().b(b);
                }
                bwn k = cbi.k();
                EventHandler$AlarmSetter eventHandler$AlarmSetter = k.d;
                eventHandler$AlarmSetter.e = false;
                eventHandler$AlarmSetter.f.a.unregisterReceiver(eventHandler$AlarmSetter);
                if (!k.e) {
                    k.b.quit();
                } else {
                    k.g.lock();
                    try {
                        k.f = true;
                        k.b.quit();
                    } finally {
                        k.g.unlock();
                    }
                }
                cbi.e();
                return;
            }
        }
        c = false;
        a(awuz.c(), a((String) null));
    }
}
