package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: zsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsj implements zsl {
    public static zsa a;
    private static zsj b;
    private static ahhd c;

    private zsj() {
    }

    public static synchronized zsj a(Context context, Application application) {
        zsj zsj;
        synchronized (zsj.class) {
            if (a == null) {
                c = new ahgr(new hol(context, "STREAMZ_ROMANESCO", (String) null), "STREAMZ_ROMANESCO");
                a = new zsa(qvj.b.c(2), c, application, "gmscore_romanesco");
                b = new zsj();
            }
            zsj = b;
        }
        return zsj;
    }

    public final void a(long j) {
        ((ahgv) a.c.a()).a((double) j, new Object[0]);
    }

    public final void a(String str) {
        ((ahgz) a.b.a()).b(str);
    }

    public final void a(boolean z) {
        ((ahgz) a.d.a()).b(Boolean.valueOf(z));
    }
}
