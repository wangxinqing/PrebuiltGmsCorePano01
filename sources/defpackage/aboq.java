package defpackage;

import java.util.concurrent.Future;

/* renamed from: aboq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aboq extends abos {
    final /* synthetic */ avoz a;
    final /* synthetic */ abot b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aboq(abot abot, int i, int i2, float f, avoz avoz) {
        super(i, i2, f);
        this.b = abot;
        this.a = avoz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(int i) {
        iwd iwd = abot.b;
        aucd o = avpa.g.o();
        aucd o2 = avoy.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avoy avoy = (avoy) o2.b;
        avoy.b = i;
        avoy.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avpa avpa = (avpa) o.b;
        avoy avoy2 = (avoy) o2.i();
        avoy2.getClass();
        avpa.c = avoy2;
        avpa.a |= 2;
        return (avpa) o.i();
    }

    /* access modifiers changed from: protected */
    public final Future a() {
        return this.b.a().a("post", awjm.a.a().c(), this.a.k(), avpa.g);
    }
}
