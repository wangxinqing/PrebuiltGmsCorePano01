package defpackage;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: aouk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aouk {
    private final aoyy a;

    private aouk(aoyy aoyy) {
        this.a = aoyy;
    }

    public static aouk a() {
        return new aouk((aoyy) aoza.c.o());
    }

    private final synchronized int c() {
        int d;
        d = d();
        while (a(d)) {
            d = d();
        }
        return d;
    }

    private static int d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    public final synchronized aouj b() {
        return aouj.a((aoza) this.a.i());
    }

    private final synchronized aoyz c(aoyw aoyw) {
        aucd o;
        aoyu a2 = aovb.a(aoyw);
        int c = c();
        int b = aozh.b(aoyw.c);
        if (b == 0) {
            b = 1;
        }
        if (b == 2) {
            b = 3;
        }
        o = aoyz.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoyz aoyz = (aoyz) o.b;
        a2.getClass();
        aoyz.a = a2;
        aoyz.c = c;
        aoyz.b = aoyv.a(3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoyz) o.b).d = aozh.a(b);
        return (aoyz) o.i();
    }

    public final synchronized void b(aoyw aoyw) {
        a(aoyw);
    }

    public static aouk a(aouj aouj) {
        aoza aoza = aouj.a;
        aucd aucd = (aucd) aoza.c(5);
        aucd.a((aucj) aoza);
        return new aouk((aoyy) aucd);
    }

    private final synchronized boolean a(int i) {
        boolean z;
        Iterator it = Collections.unmodifiableList(((aoza) this.a.b).b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((aoyz) it.next()).c == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    public final synchronized void a(aoyw aoyw) {
        aoyz c = c(aoyw);
        this.a.a(c);
        aoyy aoyy = this.a;
        int i = c.c;
        if (aoyy.c) {
            aoyy.c();
            aoyy.c = false;
        }
        aoza aoza = aoza.c;
        ((aoza) aoyy.b).a = i;
    }
}
