package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: bme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bme {
    public final bmh a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    public long d = 0;
    public boolean e = false;
    final /* synthetic */ bmf f;

    public bme(bmf bmf, bmh bmh) {
        this.f = bmf;
        this.a = bmh;
    }

    public final bmd a() {
        return (bmd) this.b.peek();
    }
}
