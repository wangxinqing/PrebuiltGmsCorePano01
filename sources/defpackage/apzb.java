package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: apzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apzb implements apyr {
    private static final amre c = amre.a(" ");
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final aoru d = aosd.a();
    private final apzd e;

    public apzb(apzd apzd) {
        this.e = apzd;
    }

    private static final String a(Set set) {
        String valueOf = String.valueOf(c.a((Iterable) set));
        return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
    }

    public final apyt b(apyq apyq, Set set) {
        aors aors;
        aors aors2;
        apza a2 = apza.a(new Account(apyq.a(), "com.google"), a(set));
        synchronized (this.b) {
            aorr aorr = (aorr) this.b.get(a2);
            if (aorr == null) {
                aors2 = aors.a(new apyy(this, a2));
                aors2.a(new apyz(this, a2), this.d);
                this.b.put(a2, aors2);
                aors = aors2;
            } else {
                aorr aorr2 = aorr;
                aors2 = null;
                aors = aorr2;
            }
        }
        if (aors2 != null) {
            aors2.run();
        }
        try {
            return (apyt) aors.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof apys) {
                throw ((apys) cause);
            }
            throw new apys("Failed to refresh token", cause);
        }
    }

    public final apyt a(apyq apyq, Set set) {
        apyt a2;
        try {
            apza a3 = apza.a(new Account(apyq.a(), "com.google"), a(set));
            synchronized (this.a) {
                a2 = a(a3);
            }
            return a2;
        } catch (apys e2) {
            throw e2;
        } catch (Throwable th) {
            throw new apys("Failed to get auth token", th);
        }
    }

    public final apyt a(apza apza) {
        apyt apyt = (apyt) this.a.get(apza);
        if (apyt != null) {
            Long l = apyt.c;
            if (l == null || System.currentTimeMillis() < TimeUnit.SECONDS.toMillis(l.longValue())) {
                return apyt;
            }
            a(apyt);
        }
        return b(apza);
    }

    public final apyt b(apza apza) {
        apzd apzd = this.e;
        apzc apzc = (apzc) apza;
        try {
            TokenData c2 = eig.c(apzd.a, apzc.a, apzc.b);
            apyt apyt = new apyt(c2.b, System.currentTimeMillis(), c2.c);
            this.a.put(apza, apyt);
            return apyt;
        } catch (eif e2) {
            throw new apys(e2);
        }
    }

    public final void a(apyt apyt) {
        apzd apzd = this.e;
        try {
            eig.b(apzd.a, apyt.a);
        } catch (eif e2) {
            throw new apys(e2);
        }
    }
}
