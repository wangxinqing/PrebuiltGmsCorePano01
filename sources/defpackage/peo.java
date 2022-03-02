package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;

/* renamed from: peo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class peo implements aora {
    final /* synthetic */ per a;

    public peo(per per) {
        this.a = per;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        anuc anuc;
        boolean z;
        if (!((Boolean) obj).booleanValue()) {
            per per = this.a;
            Log.e("AppsUpload", "Privacy bit setting explicitly disabled");
            synchronized (per.f) {
                per.g = false;
                per.h = null;
                per.i.b((Object) false);
                per.i = null;
            }
            return;
        }
        per per2 = this.a;
        synchronized (per2.f) {
            try {
                anuc = per2.h;
                per2.h = null;
                z = per2.j;
            } catch (Throwable th) {
                per2.h = null;
                throw th;
            }
        }
        if (axti.c()) {
            per2.b();
        }
        if (!z || !((Boolean) per2.c.a()).booleanValue()) {
            per2.a(anuc);
            return;
        }
        Executor executor = per2.a;
        afhs afhs = per2.d;
        afhq b = afhr.b();
        b.a(per2.e, 1);
        aorl.a(aopr.a(afje.a(executor, afhs.a(b.a()), per2.e), (amqy) new pen(per2, anuc), per2.a), new pep(per2, anuc), per2.a);
    }

    public final void a(Throwable th) {
        this.a.a("Failed to read privacy bit", th);
    }
}
