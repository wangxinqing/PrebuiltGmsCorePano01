package defpackage;

import java.util.List;

/* renamed from: amzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzx extends amzy {
    final transient int a;
    final transient int b;
    final /* synthetic */ amzy c;

    public amzx(amzy amzy, int i, int i2) {
        this.c = amzy;
        this.a = i;
        this.b = i2;
    }

    public final amzy a(int i, int i2) {
        amrl.a(i, i2, this.b);
        amzy amzy = this.c;
        int i3 = this.a;
        return amzy.subList(i + i3, i2 + i3);
    }

    public final Object[] b() {
        return this.c.b();
    }

    public final int c() {
        return this.c.c() + this.a;
    }

    public final int d() {
        return this.c.c() + this.a + this.b;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        amrl.a(i, this.b);
        return this.c.get(i + this.a);
    }

    public final int size() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
