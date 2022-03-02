package defpackage;

import java.util.concurrent.Future;

/* renamed from: abop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abop extends abos {
    final /* synthetic */ avov a;
    final /* synthetic */ abot b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abop(abot abot, int i, int i2, float f, avov avov) {
        super(i, i2, f);
        this.b = abot;
        this.a = avov;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(int i) {
        iwd iwd = abot.b;
        aucd o = avow.d.o();
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
        avow avow = (avow) o.b;
        avoy avoy2 = (avoy) o2.i();
        avoy2.getClass();
        avow.c = avoy2;
        avow.a |= 2;
        return (avow) o.i();
    }

    /* access modifiers changed from: protected */
    public final Future a() {
        return this.b.a().a("post", awjm.a.a().e(), this.a.k(), avow.d);
    }
}
