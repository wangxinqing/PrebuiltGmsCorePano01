package defpackage;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.SubscribeDiscoverySession;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: uts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uts {
    private final Set a = new ob();
    private final ScheduledExecutorService b;
    private final Map c = new nz();
    private final Map d = new nz();
    private final Set e = new ob();
    private final Set f = new ob();
    private final Set g = new ob();
    private final Map h = new nz();
    private final Set i = new ob();
    private final Map j = new nz();

    public uts() {
        ScheduledExecutorService a2 = tid.a();
        this.b = a2;
    }

    private final void d() {
        if (!e()) {
            jjg jjg = ulh.a;
            aymi.W();
            SystemClock.sleep(aymi.W());
        }
    }

    private final boolean e() {
        return !this.e.isEmpty() || !this.f.isEmpty() || !this.g.isEmpty() || !this.h.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty();
    }

    private final void f() {
        for (Runnable run : this.a) {
            run.run();
        }
    }

    private final void h(DiscoverySession discoverySession) {
        if (this.f.contains(discoverySession)) {
            jjg jjg = ulh.a;
        } else if (this.h.containsKey(discoverySession) && !((Set) this.h.get(discoverySession)).isEmpty()) {
            jjg jjg2 = ulh.a;
        } else if (this.i.contains(discoverySession)) {
            jjg jjg3 = ulh.a;
        } else if (!this.j.containsKey(discoverySession) || ((Integer) this.j.get(discoverySession)).intValue() <= 0) {
            this.h.remove(discoverySession);
            this.j.remove(discoverySession);
            Iterator it = this.c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == discoverySession) {
                    this.c.remove(entry.getKey());
                    break;
                }
            }
            Iterator it2 = this.d.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (entry2.getValue() == discoverySession) {
                        this.d.remove(entry2.getKey());
                        break;
                    }
                }
            }
            try {
                discoverySession.close();
            } catch (SecurityException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("uts", "h", 364, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close DiscoverySession because the session has already been closed.");
            }
            jjg jjg4 = ulh.a;
            if (!e()) {
                f();
            }
        } else {
            jjg jjg5 = ulh.a;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        tid.a(this.b, "DiscoverySessionTracker.alarmExecutor");
        for (DiscoverySession close : this.c.values()) {
            close.close();
        }
        for (DiscoverySession close2 : this.d.values()) {
            close2.close();
        }
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.a.clear();
    }

    public final synchronized void b() {
        Iterator it = new ob((Collection) this.c.keySet()).iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
    }

    public final synchronized void c() {
        Iterator it = new ob((Collection) this.d.keySet()).iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }

    public final synchronized void g(DiscoverySession discoverySession) {
        this.h.remove(discoverySession);
        h(discoverySession);
        jjg jjg = ulh.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(DiscoverySession discoverySession) {
        this.i.remove(discoverySession);
        h(discoverySession);
        jjg jjg = ulh.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(DiscoverySession discoverySession) {
        if (!this.j.containsKey(discoverySession)) {
            this.j.put(discoverySession, 0);
        }
        Map map = this.j;
        map.put(discoverySession, Integer.valueOf(((Integer) map.get(discoverySession)).intValue() + 1));
        jjg jjg = ulh.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(DiscoverySession discoverySession) {
        this.e.remove(discoverySession);
        this.f.remove(discoverySession);
        this.g.remove(discoverySession);
        this.h.remove(discoverySession);
        this.i.remove(discoverySession);
        this.j.remove(discoverySession);
        if (!e()) {
            f();
        }
    }

    public final synchronized void f(DiscoverySession discoverySession) {
        this.g.remove(discoverySession);
        h(discoverySession);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(DiscoverySession discoverySession, uvy uvy) {
        if (this.h.containsKey(discoverySession)) {
            ((Set) this.h.get(discoverySession)).remove(uvy);
        }
        h(discoverySession);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d(DiscoverySession discoverySession) {
        Map map = this.j;
        map.put(discoverySession, Integer.valueOf(((Integer) map.get(discoverySession)).intValue() - 1));
        h(discoverySession);
        jjg jjg = ulh.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(DiscoverySession discoverySession) {
        this.i.add(discoverySession);
        jjg jjg = ulh.a;
    }

    public final synchronized void b(String str) {
        DiscoverySession discoverySession = (DiscoverySession) this.d.get(str);
        if (discoverySession != null) {
            g(discoverySession);
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(DiscoverySession discoverySession, uvy uvy) {
        if (!this.h.containsKey(discoverySession)) {
            this.h.put(discoverySession, new ob());
        }
        ((Set) this.h.get(discoverySession)).add(uvy);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(PublishDiscoverySession publishDiscoverySession) {
        this.f.remove(publishDiscoverySession);
        this.g.add(publishDiscoverySession);
        jjg jjg = ulh.a;
        aymi.V();
        tfu.b(new utq(this, publishDiscoverySession), aymi.V() * 1000, this.b);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.f.remove(subscribeDiscoverySession);
        h(subscribeDiscoverySession);
        if (this.h.containsKey(subscribeDiscoverySession)) {
            jjg jjg = ulh.a;
            aymi.U();
            tfu.b(new utr(this, subscribeDiscoverySession), aymi.U() * 1000, this.b);
        }
        jjg jjg2 = ulh.a;
    }

    public final synchronized void a(Runnable runnable) {
        this.a.add(runnable);
    }

    public final synchronized void a(String str) {
        DiscoverySession discoverySession = (DiscoverySession) this.c.get(str);
        if (discoverySession != null) {
            f(discoverySession);
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, PublishDiscoverySession publishDiscoverySession) {
        this.e.add(publishDiscoverySession);
        DiscoverySession discoverySession = (DiscoverySession) this.c.get(str);
        if (discoverySession != null) {
            f(discoverySession);
        }
        this.c.put(str, publishDiscoverySession);
        this.e.remove(publishDiscoverySession);
        this.f.add(publishDiscoverySession);
        jjg jjg = ulh.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, SubscribeDiscoverySession subscribeDiscoverySession) {
        this.e.add(subscribeDiscoverySession);
        DiscoverySession discoverySession = (DiscoverySession) this.d.get(str);
        if (discoverySession != null) {
            g(discoverySession);
        }
        this.d.put(str, subscribeDiscoverySession);
        this.e.remove(subscribeDiscoverySession);
        this.f.add(subscribeDiscoverySession);
        jjg jjg = ulh.a;
    }
}
