package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: apzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apzm implements aqay {
    static final azxg a = azxg.a("com.google.frameworks.client.data.android.impl.AuthAsyncInterceptor", false);
    private static final baab c = baab.a("Authorization", baaf.a);
    private static final baab d = baab.a("X-Auth-Time", baaf.a);
    public final apyr b;
    private final Executor e;
    private aorr f;

    public apzm(apyr apyr, Executor executor) {
        this.b = apyr;
        this.e = executor;
    }

    public final aqcb a(aqau aqau) {
        boolean z;
        azxh azxh = aqau.b;
        if (azxh.a(apyv.a) != null) {
            return aqcb.a;
        }
        if (azxh.a(apxu.a) != null) {
            if (azxh.a(apyq.a) == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z, (Object) "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
            return aqcb.a;
        }
        aors a2 = aors.a(new apzl(this, azxh, (apyq) azxh.a(apyq.a), ((apyg) azxh.a(apyg.a)).c()));
        this.e.execute(a2);
        this.f = a2;
        return aqcb.a((aorr) a2);
    }

    public final aqcc c() {
        return aqcc.a;
    }

    public final aqcb b() {
        return aqcb.a;
    }

    public final aqcb b(aqau aqau) {
        try {
            apyt apyt = (apyt) aorl.a((Future) this.f);
            baaf baaf = aqau.a;
            baab baab = c;
            String valueOf = String.valueOf(apyt.a);
            baaf.a(baab, (Object) valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            aqau.a.a(d, (Object) Long.toString(apyt.b));
            return aqcb.a;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof apys) {
                return aqcb.a(babj.a(babg.UNAUTHENTICATED).b(cause.getCause()), new baaf());
            }
            return aqcb.a(babj.a(cause), new baaf());
        }
    }

    public final aqcb a(aqav aqav) {
        return aqcb.a;
    }

    public final aqcc a(aqat aqat) {
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
