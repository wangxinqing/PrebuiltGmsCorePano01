package defpackage;

import android.content.Intent;
import java.util.concurrent.Executor;

/* renamed from: agrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agrc implements agqs, agqt {
    final agrm a;
    final agsf b;
    final aekn c;
    private final agos d;

    public agrc(agrm agrm, agsf agsf, agos agos, aekn aekn) {
        this.a = agrm;
        this.b = agsf;
        this.d = agos;
        this.c = aekn;
    }

    private final aorr a(aorr aorr, int i, long j, int i2) {
        return aooz.a(aorr, Exception.class, (aoqb) new agrb(this, i, j, i2), (Executor) aoqm.a);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (azre.a.a().a()) {
            this.d.a();
        }
    }

    public final aorr a() {
        b();
        long b2 = this.c.b();
        return aopr.a(a(this.a.a(), 3012, b2), (amqy) new agre(this, b2), (Executor) aoqm.a);
    }

    public final aorr a(int i) {
        aorr aorr;
        b();
        long b2 = this.c.b();
        agrm agrm = this.a;
        agsc agsc = (agsc) agrm;
        if (agsc.b()) {
            synchronized (agsc.a) {
                if (!((agsc) agrm).b()) {
                    aorr = aorl.a((Object) atvr.IN_MEMORY_CACHE);
                } else {
                    aorr = ((agsc) agrm).a((aoqa) new agrn((agsc) agrm));
                }
            }
        } else {
            aorr = aorl.a((Object) atvr.IN_MEMORY_CACHE);
        }
        return aopr.a(a(aopr.a(aorr, (amqy) new agrt(agsc), (Executor) aoqm.a), 3003, b2, i), (amqy) new agqz(this, i, b2), (Executor) aoqm.a);
    }

    public final aorr a(Intent intent) {
        long b2 = this.c.b();
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(intent.getAction())) {
            return aorl.a((Object) null);
        }
        return aopr.a(a(this.a.a(), 3010, b2), (amqy) new agrd(this, b2), (Executor) aoqm.a);
    }

    /* access modifiers changed from: package-private */
    public final aorr a(aorr aorr, int i, long j) {
        return a(aorr, i, j, 0);
    }

    public final aorr a(atxi atxi) {
        aorr a2;
        b();
        long b2 = this.c.b();
        agrm agrm = this.a;
        aucd aucd = (aucd) atxi.c(5);
        aucd.a((aucj) atxi);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atxi atxi2 = (atxi) aucd.b;
        atxi atxi3 = atxi.f;
        atxi2.c = null;
        atxi2.a &= -5;
        atxi atxi4 = (atxi) aucd.i();
        synchronized (((agsc) agrm).a) {
            a2 = ((agsc) agrm).a((aoqa) new agrv((agsc) agrm, atxi4));
        }
        return aopr.a(a(a2, 3007, b2), (amqy) new agra(this, b2), (Executor) aoqm.a);
    }
}
