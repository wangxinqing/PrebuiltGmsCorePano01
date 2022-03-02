package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: azzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azzr {
    private static final Logger a = Logger.getLogger(azzr.class.getName());
    private static azzr b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("bakg"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e3) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", e3);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static synchronized azzr a() {
        azzr azzr;
        synchronized (azzr.class) {
            if (b == null) {
                List<azzp> a2 = babf.a(azzp.class, c, azzp.class.getClassLoader(), new azzq());
                b = new azzr();
                for (azzp azzp : a2) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(azzp);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", sb.toString());
                    if (azzp.a()) {
                        b.a(azzp);
                    }
                }
                b.b();
            }
            azzr = b;
        }
        return azzr;
    }

    private final synchronized void b() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            azzp azzp = (azzp) it.next();
            String c2 = azzp.c();
            azzp azzp2 = (azzp) this.e.get(c2);
            if (azzp2 == null || azzp2.b() < azzp.b()) {
                this.e.put(c2, azzp);
            }
        }
    }

    private final synchronized void a(azzp azzp) {
        amrl.a(azzp.a(), (Object) "isAvailable() returned false");
        this.d.add(azzp);
    }

    public final synchronized azzp a(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.e;
        amrl.a((Object) str, (Object) "policy");
        return (azzp) linkedHashMap.get(str);
    }
}
