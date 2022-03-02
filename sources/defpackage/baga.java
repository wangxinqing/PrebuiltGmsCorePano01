package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baga extends baas {
    public static final Logger a;
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));
    static final boolean c = Boolean.parseBoolean(s);
    static final boolean d = Boolean.parseBoolean(t);
    protected static final boolean e = Boolean.parseBoolean(u);
    public static final bafz f;
    private static final String s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
    private static final String t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
    private static final String u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
    private static String v;
    private final boolean A;
    private baao B;
    final babb g;
    public final Random h = new Random();
    protected volatile baft i = bafv.a;
    public final AtomicReference j = new AtomicReference();
    public final String k;
    public final int l;
    public final long m;
    public final babq n;
    public final amsn o;
    protected boolean p;
    public final baar q;
    public boolean r;
    private final String w;
    private final balj x;
    private boolean y;
    private Executor z;

    static {
        Class<baga> cls = baga.class;
        a = Logger.getLogger(cls.getName());
        bafz bafz = null;
        try {
            try {
                try {
                    bafz bafz2 = (bafz) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, cls.getClassLoader()).asSubclass(bafz.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (bafz2.b() != null) {
                        a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", bafz2.b());
                    } else {
                        bafz = bafz2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", e3);
            }
        } catch (ClassNotFoundException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", e4);
        } catch (ClassCastException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", e5);
        }
        f = bafz;
    }

    protected baga(String str, baal baal, balj balj, amsn amsn, boolean z2) {
        boolean z3;
        String str2 = str;
        baal baal2 = baal;
        amsn amsn2 = amsn;
        amrl.a((Object) baal2, (Object) "args");
        this.x = balj;
        amrl.a((Object) str2, (Object) "name");
        URI create = URI.create(str.length() == 0 ? new String("//") : "//".concat(str2));
        boolean z4 = true;
        if (create.getHost() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        amrl.a(z3, "Invalid DNS name: %s", (Object) str2);
        String authority = create.getAuthority();
        amrl.a((Object) authority, "nameUri (%s) doesn't have an authority", (Object) create);
        this.w = authority;
        this.k = create.getHost();
        if (create.getPort() != -1) {
            this.l = create.getPort();
        } else {
            this.l = baal2.a;
        }
        babb babb = baal2.b;
        amrl.a((Object) babb, (Object) "proxyDetector");
        this.g = babb;
        long j2 = 0;
        if (!z2) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j3 = 30;
            if (property != null) {
                try {
                    j3 = Long.parseLong(property);
                } catch (NumberFormatException e2) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j2 = j3 > 0 ? TimeUnit.SECONDS.toNanos(j3) : j3;
        }
        this.m = j2;
        amrl.a((Object) amsn2, (Object) "stopwatch");
        this.o = amsn2;
        babq babq = baal2.c;
        amrl.a((Object) babq, (Object) "syncContext");
        this.n = babq;
        Executor executor = baal2.e;
        this.z = executor;
        this.A = executor != null ? false : z4;
        baar baar = baal2.d;
        amrl.a((Object) baar, (Object) "serviceConfigParser");
        this.q = baar;
    }

    public static String d() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void e() {
        if (!this.r && !this.y) {
            if (this.p) {
                long j2 = this.m;
                if (j2 != 0 && (j2 <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= this.m)) {
                    return;
                }
            }
            this.r = true;
            this.z.execute(new bafx(this, this.B));
        }
    }

    public final String a() {
        return this.w;
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            Executor executor = this.z;
            if (executor != null && this.A) {
                balk.b(this.x, executor);
                this.z = null;
            }
        }
    }

    public final void c() {
        amrl.b(this.B != null, (Object) "not started");
        e();
    }

    public final void a(baao baao) {
        boolean z2;
        if (this.B == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, (Object) "already started");
        if (this.A) {
            this.z = (Executor) balk.a(this.x);
        }
        amrl.a((Object) baao, (Object) "listener");
        this.B = baao;
        e();
    }
}
