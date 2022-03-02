package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: ahfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahfj implements ahfw {
    public final String a;
    public final aorr b;
    public final ahek c;
    public final Executor d;
    public final agzs e;
    public final Object f = new Object();
    public aorr g = null;
    private final aoqu h = aoqu.a();

    public ahfj(String str, aorr aorr, ahek ahek, Executor executor, agzs agzs) {
        this.a = str;
        this.b = aorl.a(aorr);
        this.c = ahek;
        this.d = aosd.a(executor);
        this.e = agzs;
    }

    private final aorr d() {
        aorr aorr;
        synchronized (this.f) {
            aorr aorr2 = this.g;
            if (aorr2 != null && aorr2.isDone()) {
                try {
                    aorl.a((Future) this.g);
                } catch (ExecutionException e2) {
                    this.g = null;
                }
            }
            if (this.g == null) {
                this.g = aorl.a(this.h.a(amll.a((aoqa) new ahfd(this)), this.d));
            }
            aorr = this.g;
        }
        return aorr;
    }

    public final aoqa a() {
        return new ahfa(this);
    }

    public final String b() {
        return this.a;
    }

    public final aorr c() {
        return d();
    }

    public final aorr a(aoqb aoqb, Executor executor) {
        return this.h.a(amll.a((aoqa) new ahfb(this, d(), aoqb, executor)), aoqm.a);
    }

    public final Object a(Uri uri) {
        InputStream inputStream;
        try {
            String valueOf = String.valueOf(this.a);
            amkr a2 = amlv.a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), amlw.a);
            try {
                inputStream = (InputStream) this.e.a(uri, ahcj.a(), new agzk[0]);
                audx a3 = ((ahgj) this.c).a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (a2 != null) {
                    a2.close();
                }
                return a3;
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e2) {
            if (!this.e.c(uri)) {
                return ((ahgi) this.c).a;
            }
            throw e2;
        } catch (IOException e3) {
            throw ahfy.a(this.e, uri, e3);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
