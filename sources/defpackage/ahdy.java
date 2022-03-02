package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: ahdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahdy implements ahfw {
    public final String a;
    public final aorr b;
    public final Executor c;
    public final agzs d;
    private final audx e;
    private final aubs f;
    private final aoqu g = aoqu.a();

    public ahdy(String str, aorr aorr, audx audx, Executor executor, agzs agzs, aubs aubs) {
        this.a = str;
        this.b = aorl.a(aorr);
        this.e = audx;
        this.c = executor;
        this.d = agzs;
        this.f = aubs;
    }

    public final aoqa a() {
        return new ahdq(this);
    }

    public final aorr b(Uri uri) {
        try {
            return aorl.a((Object) a(uri));
        } catch (IOException e2) {
            if (e2.getCause() instanceof ahax) {
                return aorl.a((Throwable) e2);
            }
            return aopr.a(aorl.a((Throwable) e2), amll.a((aoqb) new ahdv(this)), this.c);
        }
    }

    public final String b() {
        return this.a;
    }

    public final aorr c() {
        return aorl.a(aorl.a(amll.a((aoqa) new ahds(this)), this.c));
    }

    public final aorr a(aoqb aoqb, Executor executor) {
        return this.g.a(amll.a((aoqa) new ahdr(this, aoqb, executor)), this.c);
    }

    public final audx a(Uri uri) {
        amkr a2;
        try {
            String valueOf = String.valueOf(this.a);
            a2 = amlv.a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), amlw.a);
            agzs agzs = this.d;
            ahci ahci = new ahci(this.e.n());
            ahci.a = this.f;
            audx audx = (audx) agzs.a(uri, ahci, new agzk[0]);
            if (a2 != null) {
                a2.close();
            }
            return audx;
        } catch (FileNotFoundException e2) {
            if (!this.d.c(uri)) {
                return this.e;
            }
            throw e2;
        } catch (IOException e3) {
            throw ahfy.a(this.d, uri, e3);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
