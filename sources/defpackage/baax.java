package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baax {
    private static final Logger b = Logger.getLogger(baax.class.getName());
    private static baax c;
    public final baan a = new baav(this);
    private final LinkedHashSet d = new LinkedHashSet();
    private List e = Collections.emptyList();

    public static synchronized baax a() {
        baax baax;
        synchronized (baax.class) {
            if (c == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("bagb"));
                } catch (ClassNotFoundException e2) {
                    b.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", e2);
                }
                List<baat> a2 = babf.a(baat.class, Collections.unmodifiableList(arrayList), baat.class.getClassLoader(), new baaw());
                if (a2.isEmpty()) {
                    b.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                c = new baax();
                for (baat baat : a2) {
                    Logger logger = b;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(baat);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", sb.toString());
                    if (baat.b()) {
                        c.a(baat);
                    }
                }
                c.c();
            }
            baax = c;
        }
        return baax;
    }

    private final synchronized void c() {
        ArrayList arrayList = new ArrayList(this.d);
        Collections.sort(arrayList, Collections.reverseOrder(new baau()));
        this.e = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final synchronized List b() {
        return this.e;
    }

    private final synchronized void a(baat baat) {
        amrl.a(baat.b(), (Object) "isAvailable() returned false");
        this.d.add(baat);
    }
}
