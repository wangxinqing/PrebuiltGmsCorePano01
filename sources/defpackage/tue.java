package defpackage;

import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: tue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tue {
    private final ttu a;

    public tue(ttu ttu) {
        this.a = ttu;
    }

    private final void b(Event event) {
        ttu ttu = this.a;
        tts f = ttt.f();
        f.a(event.a());
        f.a(event.b());
        f.a = event.e();
        aucd b = ttu.b(f.a());
        if (event.a() == aspb.CONNECT_PROFILE && event.c() != null) {
            aucd o = asks.d.o();
            short shortValue = event.c().shortValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asks asks = (asks) o.b;
            asks.a |= 2;
            asks.c = shortValue;
            if (b.c) {
                b.c();
                b.c = false;
            }
            askx askx = (askx) b.b;
            asks asks2 = (asks) o.i();
            askx askx2 = askx.m;
            asks2.getClass();
            askx.h = asks2;
            askx.a |= 64;
        }
        if (event.d() != null) {
            this.a.b = event.d();
        }
    }

    public final void a(Event event) {
        b(event);
        this.a.b();
    }

    public final void a(Event event, Exception exc) {
        b(event);
        this.a.a((Throwable) exc);
    }
}
