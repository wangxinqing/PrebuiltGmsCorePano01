package defpackage;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baiz implements Runnable {
    final /* synthetic */ baaq a;
    final /* synthetic */ baao b;

    public baiz(baao baao, baaq baaq) {
        this.b = baao;
        this.a = baaq;
    }

    public final void run() {
        bajm bajm;
        babj babj;
        babj babj2;
        String str;
        Object obj;
        baaq baaq = this.a;
        List list = baaq.a;
        this.b.c.E.a(1, "Resolved address: {0}, config={1}", list, baaq.b);
        baji baji = this.b.c;
        int i = baji.L;
        if (i != 2) {
            baji.E.a(2, "Address resolved: {0}", list);
            this.b.c.L = 2;
        }
        baji baji2 = this.b.c;
        baji2.M = null;
        baam baam = this.a.c;
        if (baam == null || (obj = baam.b) == null) {
            bajm = null;
        } else {
            bajm = (bajm) obj;
        }
        if (baam != null) {
            babj = baam.a;
        } else {
            babj = null;
        }
        if (baji2.I) {
            if (bajm == null) {
                if (babj == null) {
                    bajm = baji.f;
                } else if (!baji2.H) {
                    baji2.E.a(2, "Fallback to error due to invalid first service config without default config");
                    this.b.a(baam.a);
                    return;
                } else {
                    bajm = baji2.G;
                }
            }
            if (!bajm.equals(this.b.c.G)) {
                azxj azxj = this.b.c.E;
                Object[] objArr = new Object[1];
                if (bajm != baji.f) {
                    str = "";
                } else {
                    str = " to empty";
                }
                objArr[0] = str;
                azxj.a(2, "Service config changed{0}", objArr);
                this.b.c.G = bajm;
            }
            try {
                this.b.c.m();
            } catch (RuntimeException e) {
                RuntimeException runtimeException = e;
                Logger logger = baji.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.b.c.g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), runtimeException);
            }
        } else {
            if (bajm != null) {
                baji2.E.a(2, "Service config from name resolver discarded by channel settings");
            }
            bajm = baji.f;
        }
        azxa azxa = this.a.b;
        baao baao = this.b;
        if (baao.a == baao.c.r) {
            Map map = bajm.d;
            if (map != null) {
                azwy b2 = azxa.b();
                b2.a(azzn.b, map);
                azxa = b2.a();
            }
            badk badk = this.b.a.a;
            azzj a2 = azzk.a();
            a2.a = list;
            a2.b = azxa;
            a2.c = bajm.c;
            azzk a3 = a2.a();
            List list2 = a3.a;
            azxa azxa2 = a3.b;
            if (azxa2.a(azzn.a) == null) {
                balf balf = (balf) a3.c;
                if (balf == null) {
                    try {
                        badp badp = badk.d;
                        String str2 = badp.b;
                        azzp a4 = badp.a.a(str2);
                        if (a4 != null) {
                            balf = new balf(a4, (Map) null, (Object) null);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str2.length() + 68);
                            sb2.append("Trying to load '");
                            sb2.append(str2);
                            sb2.append("' because ");
                            sb2.append("using default policy");
                            sb2.append(", but it's unavailable");
                            throw new bado(sb2.toString());
                        }
                    } catch (bado e2) {
                        badk.a.a(azxz.TRANSIENT_FAILURE, new badm(babj.n.a(e2.getMessage())));
                        badk.b.a();
                        badk.c = null;
                        badk.b = new badn();
                        babj2 = babj.b;
                    }
                }
                if (badk.c == null || !balf.a.c().equals(badk.c.c())) {
                    badk.a.a(azxz.CONNECTING, new badl());
                    badk.b.a();
                    badk.c = balf.a;
                    azzn azzn = badk.b;
                    badk.b = badk.c.a(badk.a);
                    badk.a.a().a(2, "Load balancer changed from {0} to {1}", azzn.getClass().getSimpleName(), badk.b.getClass().getSimpleName());
                }
                Object obj2 = balf.c;
                if (obj2 != null) {
                    badk.a.a().a(1, "Load-balancing config: {0}", balf.c);
                    azwy b3 = azxa2.b();
                    b3.a(azzn.a, balf.b);
                    azxa2 = b3.a();
                }
                azzn azzn2 = badk.b;
                if (a3.a.isEmpty()) {
                    babj babj3 = babj.o;
                    String valueOf2 = String.valueOf(list2);
                    String valueOf3 = String.valueOf(azxa2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 55 + String.valueOf(valueOf3).length());
                    sb3.append("NameResolver returned no usable address. addrs=");
                    sb3.append(valueOf2);
                    sb3.append(", attrs=");
                    sb3.append(valueOf3);
                    babj2 = babj3.a(sb3.toString());
                } else {
                    azzj a5 = azzk.a();
                    a5.a = a3.a;
                    a5.b = azxa2;
                    a5.c = obj2;
                    azzn2.a(a5.a());
                    babj2 = babj.b;
                }
                if (babj2.a()) {
                    return;
                }
                if (list.isEmpty() && i == 2) {
                    this.b.a();
                    return;
                }
                baao baao2 = this.b;
                String valueOf4 = String.valueOf(baao2.b);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
                sb4.append(valueOf4);
                sb4.append(" was used");
                baao2.b(babj2.b(sb4.toString()));
                return;
            }
            String valueOf5 = String.valueOf(azxa2.a(azzn.a));
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 53);
            sb5.append("Unexpected ATTR_LOAD_BALANCING_CONFIG from upstream: ");
            sb5.append(valueOf5);
            throw new IllegalArgumentException(sb5.toString());
        }
    }
}
