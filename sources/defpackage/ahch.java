package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahch implements agzr {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    private ahch() {
    }

    public static ahch a() {
        return new ahch();
    }

    public final void b() {
        this.a = true;
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        if (!this.a) {
            ahbm a2 = ahbm.a(ahcj.b(agzq));
            try {
                Closeable closeable = a2.a;
                if (closeable instanceof ahaw) {
                    File c = ((ahaw) closeable).c();
                    a2.close();
                    return c;
                }
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else if (!agzq.a()) {
            return agzq.b.k(agzq.f);
        } else {
            throw new ahbp("Short circuit would skip transforms.");
        }
        throw th;
    }
}
