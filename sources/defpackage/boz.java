package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: boz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class boz extends apxg {
    public static final /* synthetic */ int a = 0;

    public static boz a(ByteBuffer byteBuffer) {
        boz boz = new boz();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        boz.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return boz;
    }

    public final int R() {
        int d = d(4);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final int b() {
        int d = d(6);
        if (d != 0) {
            return g(d);
        }
        return 0;
    }

    public final int c() {
        int d = d(8);
        if (d != 0) {
            return g(d);
        }
        return 0;
    }

    public final int d() {
        int d = d(16);
        if (d != 0) {
            return g(d);
        }
        return 0;
    }

    public final int e() {
        int d = d(20);
        if (d != 0) {
            return g(d);
        }
        return 0;
    }

    public final apxg f() {
        apxg apxg = new apxg();
        int d = d(10);
        if (d == 0) {
            return null;
        }
        apxg.b(e(d + this.c), this.d);
        return apxg;
    }

    public final bpa b(int i) {
        return a(new bpa(), i);
    }

    public final String c(int i) {
        int d = d(16);
        if (d != 0) {
            return f(h(d) + (i * 4));
        }
        return null;
    }

    public final boy a(int i) {
        return a(new boy(), i);
    }

    public final boy a(boy boy, int i) {
        int d = d(6);
        if (d == 0) {
            return null;
        }
        boy.b(e(h(d) + (i * 4)), this.d);
        return boy;
    }

    public final bpa a(bpa bpa, int i) {
        int d = d(8);
        if (d == 0) {
            return null;
        }
        bpa.b(e(h(d) + (i * 4)), this.d);
        return bpa;
    }

    public final bpa a(String str) {
        int d = d(8);
        if (d != 0) {
            return bpa.a((bpa) null, h(d), str, this.d);
        }
        return null;
    }

    public final bry a(bry bry, int i) {
        int d = d(22);
        if (d == 0) {
            return null;
        }
        bry.b(e(h(d) + (i * 4)), this.d);
        return bry;
    }

    public final void a(apxg apxg, int i) {
        int d = d(20);
        if (d != 0) {
            apxg.b(e(h(d) + (i * 4)), this.d);
        }
    }
}
