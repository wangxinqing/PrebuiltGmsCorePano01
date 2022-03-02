package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: apzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apzh implements aqay {
    public static final anil a = anil.a("xRPC");
    static final baab b = aqcq.a(apxs.b);
    static final byte[] c = apxs.a.k();
    public static final azxg d = azxg.a("ClientInterceptorCacheDirective", apxt.DEFAULT_CACHE_OK_IF_VALID);
    private static final baab l = aqcq.a(apxr.e);
    public final apzj e;
    public baaf f;
    public baaf g;
    public aqcl h;
    public apxt i;
    public long j = -1;
    public List k = amzy.h();
    private final Executor m;
    private aors n;

    public apzh(apzg apzg) {
        this.e = apzg.a;
        this.m = apzg.b;
    }

    public static apzg a() {
        return new apzg();
    }

    public final aqcb b() {
        aors a2 = aors.a(new apze(this));
        this.n = a2;
        this.m.execute(a2);
        return aqcb.a((aorr) this.n);
    }

    public final aqcc c() {
        if (this.j == -1) {
            return aqcc.a;
        }
        this.m.execute(new apzf(this));
        return aqcc.a;
    }

    public final aqcb a(aqau aqau) {
        amrl.b(aqau.c.a.equals(baai.UNARY), (Object) "Caching interceptor only supports unary RPCs");
        aqcl aqcl = (aqcl) aqau.b.a(aqcl.b);
        amrl.a((Object) aqcl, (Object) "Using CachingClientInterceptor without MutableMetricsContext");
        this.h = aqcl;
        apxt apxt = (apxt) aqau.b.a(d);
        amrl.a((Object) apxt, (Object) "Using CachingClientInterceptor without CacheDirective");
        this.i = apxt;
        baaf baaf = new baaf();
        this.f = baaf;
        baaf.a(aqau.a);
        return aqcb.b;
    }

    public final aqcb b(aqau aqau) {
        return aqcb.a;
    }

    public final aqcb a(aqav aqav) {
        try {
            amri amri = (amri) aorl.a((Future) this.n);
            if (amri == null) {
                ((anih) ((anih) a.b()).a("apzh", "a", 182, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("RpcCache returned null instead of Optional#absent()");
                return aqcb.a;
            } else if (!amri.a()) {
                if (!this.i.equals(apxt.CACHE_ONLY)) {
                    if (!this.i.equals(apxt.VALID_CACHE_ONLY)) {
                        return aqcb.a;
                    }
                }
                babj a2 = babj.a(babg.FAILED_PRECONDITION).a("Required value come from cache, but no cached value was found");
                baaf baaf = new baaf();
                baaf.a(b, (Object) c);
                return aqcb.a(a2, baaf);
            } else {
                apzi apzi = (apzi) amri.b();
                throw null;
            }
        } catch (ExecutionException e2) {
            anih anih = (anih) a.b();
            anih.a(e2.getCause());
            ((anih) anih.a("apzh", "a", 204, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read from cache");
            if (e2.getCause() instanceof ClassCastException) {
                return aqcb.a(babj.n, new baaf());
            }
            return aqcb.a;
        }
    }

    public final aqcc a(aqat aqat) {
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        baaa baaa;
        baaf baaf = new baaf();
        this.g = baaf;
        baaf.a(aqaw.a);
        if (this.g.a(l)) {
            baaf baaf2 = this.g;
            baab baab = l;
            int i2 = 0;
            while (true) {
                if (i2 >= baaf2.d) {
                    baaa = null;
                    break;
                } else if (Arrays.equals(baab.b, baaf2.a(i2))) {
                    baaa = new baaa(baaf2, baab, i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (baaa != null) {
                amzy a2 = amzy.a((Iterable) baaa);
                if (a2.size() == 1) {
                    try {
                        aucd o = apxr.d.o();
                        o.b((byte[]) a2.get(0), aubs.c());
                        apxr apxr = (apxr) o.i();
                        if ((apxr.a & 1) != 0) {
                            long j2 = apxr.b;
                            if (j2 > 0) {
                                this.j = TimeUnit.SECONDS.toMillis(j2);
                                aucx<String> aucx = apxr.c;
                                amzt j3 = amzy.j();
                                for (String lowerCase : aucx) {
                                    j3.c(lowerCase.toLowerCase(Locale.ROOT));
                                }
                                this.k = j3.a();
                                return aqcc.a;
                            }
                        }
                    } catch (auda e2) {
                        anih anih = (anih) a.b();
                        anih.a((Throwable) e2);
                        ((anih) anih.a("apzh", "a", 293, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not parse server ttl");
                    }
                } else {
                    ((anih) ((anih) a.b()).a("apzh", "a", 296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Expected a single value for extension, got: %d", a2.size());
                }
            }
        }
        return aqcc.a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(aqax aqax) {
        try {
            for (String str : this.f.b()) {
                if (!this.k.contains(str)) {
                    if (str.endsWith("-bin")) {
                        this.f.d(baab.a(str, baaf.e));
                    } else {
                        this.f.d(baab.a(str, baaf.a));
                    }
                }
            }
            apzj apzj = this.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            apzj.c();
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("apzh", "a", 334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not write to cache");
        }
    }
}
