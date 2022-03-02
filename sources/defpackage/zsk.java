package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: zsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsk implements zsl {
    private static zsk a;
    private static ahhc b;
    private static ahhd c;
    private static ahgt d;
    private static ahgs e;
    private static ahgt f;

    private zsk() {
        ahhc ahhc = ahhc.d;
        b = ahhc;
        d = ahhc.a("/client_streamz/romanesco/opened_contacts_list_event", ahgx.a("contact_type"));
        ahhc ahhc2 = b;
        e = (ahgs) ahhc2.a((ahgz) new ahgs("/client_streamz/romanesco/contacts_list_time_spent_in_ms", ahhc2));
        f = b.a("/client_streamz/romanesco/get_backed_up_device_contacts_result", ahgx.c("result"));
    }

    public static synchronized zsk a(Context context, Application application) {
        zsk zsk;
        synchronized (zsk.class) {
            if (a == null) {
                a = new zsk();
                c = new ahgr(new hol(context, "STREAMZ_ROMANESCO", (String) null), "STREAMZ_ROMANESCO");
                ahhj.a(c, qvj.b.c(2), ahhc.d, application);
            }
            zsk = a;
        }
        return zsk;
    }

    public final void a(long j) {
        e.a(Long.valueOf(j), ahgo.b);
    }

    public final void a(String str) {
        d.a(str);
    }

    public final void a(boolean z) {
        f.a(Boolean.valueOf(z));
    }
}
