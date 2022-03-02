package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: asjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjs {
    public final int a;
    public final arwg b;
    public final LinkedList c;
    public int d = 0;
    public long e = 0;
    public long f;
    public boolean g = true;
    public final arwm h = new asjq(this, "STQueue");
    public final asjr i;
    final /* synthetic */ asda j;

    public asjs(asda asda, arwg arwg, asjr asjr) {
        this.j = asda;
        iva.a(true, (Object) null);
        iva.a((Object) arwg);
        this.b = arwg;
        iva.a((Object) asjr);
        this.i = asjr;
        this.c = new LinkedList();
        this.a = 3;
        this.f = SystemClock.elapsedRealtime();
    }

    private final void c() {
        this.b.c(this.h);
    }

    public final void a() {
        this.g = true;
        this.d = 0;
        this.e = 0;
        this.f = SystemClock.elapsedRealtime();
        c();
    }

    public final long b() {
        asda asda = this.j;
        UUID uuid = asda.a;
        auyo auyo = asda.j.b.g;
        if (auyo == null) {
            auyo = auyo.j;
        }
        return auyo.h;
    }

    public final void a(asjt... asjtArr) {
        Collections.addAll(this.c, asjtArr);
        c();
    }

    public final void b(asjt... asjtArr) {
        asjt asjt = (asjt) this.c.peek();
        this.c.removeAll(Arrays.asList(asjtArr));
        if (asjt == this.c.peek()) {
            c();
        } else {
            a();
        }
    }
}
