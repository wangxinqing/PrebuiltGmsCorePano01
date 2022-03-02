package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: apzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apzt extends azxl {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public azxl c = this.d.a(this.e, this.f);
    final /* synthetic */ azxi d;
    final /* synthetic */ baaj e;
    final /* synthetic */ azxh f;

    public apzt(azxi azxi, baaj baaj, azxh azxh) {
        this.d = azxi;
        this.e = baaj;
        this.f = azxh;
    }

    public final azxl a() {
        azxl azxl;
        synchronized (this.a) {
            azxl = this.c;
        }
        return azxl;
    }

    public final void b() {
        synchronized (this.a) {
            this.b.add(new apzq(this));
            a().b();
        }
    }

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(new apzo(this, i));
            a().a(i);
        }
    }

    public final void a(azxk azxk, baaf baaf) {
        synchronized (this.a) {
            baaf baaf2 = new baaf();
            baaf2.a(baaf);
            this.b.add(new apzn(this, azxk, baaf2));
            a().a((azxk) new apzs(this, azxk), baaf);
        }
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            this.b.add(new apzr(this, obj));
            a().a(obj);
        }
    }

    public final void a(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new apzp(this, str, th));
            a().a(str, th);
        }
    }
}
