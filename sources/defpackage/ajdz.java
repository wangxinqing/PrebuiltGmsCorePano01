package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: ajdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdz extends izd implements ajdj {
    public static final /* synthetic */ int k = 0;
    public final rlv e;
    public final amri f;
    public final ajdw g;
    public final ajed h;
    public ajdx j;
    private final jfz l = new jfz(10, new LinkedBlockingQueue(4), ajdq.a);
    private final SecureRandom m = new SecureRandom();
    private long n;
    private long o;

    static {
        jjg.a("QuakeGrpcServer", iyc.LOCATION);
    }

    public ajdz(Context context, amri amri, ajdw ajdw, ajed ajed) {
        super(context, ayel.i(), 443, Process.myUid(), 1536);
        this.f = amri;
        this.g = ajdw;
        this.h = ajed;
        c();
        a("X-Android-Package", context.getPackageName());
        a("X-Android-Cert", jhg.h(context, context.getPackageName()));
        this.e = new rlv(this);
        ayel.i();
    }

    private final void a(ajdy ajdy) {
        this.l.execute(new ajdv(ajdy));
    }

    private final ClientContext d() {
        Context context = this.i;
        List d = jgu.d(context, context.getPackageName());
        if (d.isEmpty()) {
            return null;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.e = this.i.getPackageName();
        clientContext.f = this.i.getPackageName();
        clientContext.b = Process.myUid();
        clientContext.d = (Account) d.get(0);
        clientContext.c = (Account) d.get(0);
        clientContext.d(ayel.g());
        return clientContext;
    }

    public final aucd b(amri amri) {
        aucd o2 = aruy.i.o();
        long j2 = this.o;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((aruy) o2.b).a = j2;
        int h2 = (int) ayel.h();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((aruy) o2.b).b = h2;
        aubn a = augi.a(ayek.r());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a.getClass();
        ((aruy) o2.b).c = a;
        aubn a2 = augi.a(ayek.p());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a2.getClass();
        ((aruy) o2.b).d = a2;
        if (ayek.m()) {
            aubn a3 = augi.a(ajfr.a(this.i));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            a3.getClass();
            ((aruy) o2.b).h = a3;
        }
        if (amri.a()) {
            arup arup = (arup) amri.b();
            aucd o3 = arvf.e.o();
            double d = arup.d();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((arvf) o3.b).a = d;
            double e2 = arup.e();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((arvf) o3.b).b = e2;
            double f2 = arup.f();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((arvf) o3.b).c = f2;
            double g2 = arup.g();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((arvf) o3.b).d = g2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arvf arvf = (arvf) o3.i();
            arvf.getClass();
            ((aruy) o2.b).e = arvf;
            aucd o4 = arux.c.o();
            float f3 = (float) arup.h().k;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((arux) o4.b).a = f3;
            float f4 = (float) arup.h().l;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((arux) o4.b).b = f4;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arux arux = (arux) o4.i();
            arux.getClass();
            ((aruy) o2.b).f = arux;
        }
        return o2;
    }

    public final void c() {
        this.n = this.h.a();
        long nextLong = this.m.nextLong();
        this.o = nextLong != Long.MIN_VALUE ? Math.abs(nextLong) : 0;
    }

    public final void a() {
        jfz jfz = this.l;
        rlv rlv = this.e;
        rlv.getClass();
        jfz.execute(new ajdr(rlv));
        this.l.shutdown();
    }

    public final void a(long j2, amri amri) {
        ClientContext d;
        if (ayel.j() && (d = d()) != null) {
            if (ayel.a.a().quakeApiClientIdExpireMs() - (this.h.a() - this.n) <= 0) {
                c();
            }
            a((ajdy) new ajds(this, j2, amri, this.h.b(), d));
        }
    }

    public final void a(ajec ajec, aruv aruv, ajec ajec2, amri amri) {
        ClientContext d;
        if (ayel.k() && (d = d()) != null) {
            a((ajdy) new ajdt(this, amri, ajec2, this.h.b(), ajec, aruv, d));
        }
    }

    public final void a(amri amri) {
        ClientContext d;
        if (ayel.a.a().seismicSendQuakeApiNodeOffline() && (d = d()) != null) {
            a((ajdy) new ajdu(this, amri, this.h.b(), d));
        }
    }
}
