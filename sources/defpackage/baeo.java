package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: baeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baeo extends badd {
    public int a;
    private final Queue b = new ArrayDeque();

    private final void a(baen baen, int i) {
        a(i);
        if (!this.b.isEmpty()) {
            c();
        }
        while (i > 0 && !this.b.isEmpty()) {
            bakl bakl = (bakl) this.b.peek();
            int min = Math.min(i, bakl.a());
            try {
                baen.d = baen.a(bakl, min);
            } catch (IOException e) {
                baen.e = e;
            }
            if (baen.e == null) {
                i -= min;
                this.a -= min;
                c();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    private final void c() {
        if (((bakl) this.b.peek()).a() == 0) {
            ((bakl) this.b.remove()).close();
        }
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        bael bael = new bael();
        a(bael, 1);
        return bael.d;
    }

    public final void close() {
        while (!this.b.isEmpty()) {
            ((bakl) this.b.remove()).close();
        }
    }

    /* renamed from: b */
    public final baeo c(int i) {
        a(i);
        this.a -= i;
        baeo baeo = new baeo();
        while (i > 0) {
            bakl bakl = (bakl) this.b.peek();
            if (bakl.a() > i) {
                baeo.a(bakl.c(i));
                i = 0;
            } else {
                baeo.a((bakl) this.b.poll());
                i -= bakl.a();
            }
        }
        return baeo;
    }

    public final void a(bakl bakl) {
        if (!(bakl instanceof baeo)) {
            this.b.add(bakl);
            this.a += bakl.a();
            return;
        }
        baeo baeo = (baeo) bakl;
        while (!baeo.b.isEmpty()) {
            this.b.add((bakl) baeo.b.remove());
        }
        this.a += baeo.a;
        baeo.a = 0;
        baeo.close();
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(new baem(i, bArr), i2);
    }
}
