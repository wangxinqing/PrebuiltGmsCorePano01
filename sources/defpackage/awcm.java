package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.logging.Logger;

/* renamed from: awcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awcm implements awcu {
    public final awde a;
    public final batf b;
    public final bate c;
    public int d = 0;
    private awcs e;

    public awcm(awde awde, batf batf, bate bate) {
        this.a = awde;
        this.b = batf;
        this.c = bate;
    }

    public static final void a(batk batk) {
        bauc bauc = batk.a;
        batk.a = bauc.f;
        bauc.i();
        bauc.h();
    }

    public final void a(awcs awcs) {
        this.e = awcs;
    }

    public final avzl b() {
        return d();
    }

    public final void c() {
        this.c.flush();
    }

    public final avzl d() {
        awdd a2;
        avzl avzl;
        int i = this.d;
        if (i == 1 || i == 3) {
            do {
                try {
                    a2 = awdd.a(this.b.l());
                    avzl = new avzl();
                    avzl.b = a2.a;
                    avzl.c = a2.b;
                    avzl.d = a2.c;
                    avzl.a(e());
                } catch (EOFException e2) {
                    String valueOf = String.valueOf(this.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb.append("unexpected end of stream on ");
                    sb.append(valueOf);
                    IOException iOException = new IOException(sb.toString());
                    iOException.initCause(e2);
                    throw iOException;
                }
            } while (a2.b == 100);
            this.d = 4;
            return avzl;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("state: ");
        sb2.append(i);
        throw new IllegalStateException(sb2.toString());
    }

    public final avzb e() {
        avza avza = new avza();
        while (true) {
            String l = this.b.l();
            if (l.length() == 0) {
                return avza.a();
            }
            Logger logger = awaa.a;
            int indexOf = l.indexOf(":", 1);
            if (indexOf != -1) {
                avza.a(l.substring(0, indexOf), l.substring(indexOf + 1));
            } else if (l.startsWith(":")) {
                avza.a("", l.substring(1));
            } else {
                avza.a("", l);
            }
        }
    }

    public final avzn a(avzm avzm) {
        baua baua;
        if (!awcs.c(avzm)) {
            baua = a(0);
        } else if (!"chunked".equalsIgnoreCase(avzm.a("Transfer-Encoding"))) {
            long a2 = awcw.a(avzm);
            if (a2 != -1) {
                baua = a(a2);
            } else {
                int i = this.d;
                if (i == 4) {
                    awde awde = this.a;
                    if (awde != null) {
                        this.d = 5;
                        awde.d();
                        baua = new awcl(this);
                    } else {
                        throw new IllegalStateException("streamAllocation == null");
                    }
                } else {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("state: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
        } else {
            awcs awcs = this.e;
            int i2 = this.d;
            if (i2 == 4) {
                this.d = 5;
                baua = new awci(this, awcs);
            } else {
                StringBuilder sb2 = new StringBuilder(18);
                sb2.append("state: ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return new awcx(batq.a(baua));
    }

    public final batz a(avzj avzj, long j) {
        if ("chunked".equalsIgnoreCase(avzj.a("Transfer-Encoding"))) {
            int i = this.d;
            if (i == 1) {
                this.d = 2;
                return new awch(this);
            }
            StringBuilder sb = new StringBuilder(18);
            sb.append("state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (j != -1) {
            int i2 = this.d;
            if (i2 == 1) {
                this.d = 2;
                return new awcj(this, j);
            }
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("state: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final baua a(long j) {
        int i = this.d;
        if (i == 4) {
            this.d = 5;
            return new awck(this, j);
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a() {
        awdk b2 = this.a.b();
        if (b2 != null) {
            b2.a();
        }
    }

    public final void a(avzb avzb, String str) {
        int i = this.d;
        if (i == 0) {
            bate bate = this.c;
            bate.b(str);
            bate.b("\r\n");
            int a2 = avzb.a();
            for (int i2 = 0; i2 < a2; i2++) {
                bate bate2 = this.c;
                bate2.b(avzb.a(i2));
                bate2.b(": ");
                bate2.b(avzb.b(i2));
                bate2.b("\r\n");
            }
            this.c.b("\r\n");
            this.d = 1;
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(avzj avzj) {
        this.e.a();
        Proxy.Type type = ((awdk) this.e.e()).a.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(avzj.b);
        sb.append(' ');
        if (!avzj.c() && type == Proxy.Type.HTTP) {
            sb.append(avzj.a);
        } else {
            sb.append(awcz.a(avzj.a));
        }
        sb.append(" HTTP/1.1");
        a(avzj.c, sb.toString());
    }

    public final void a(awda awda) {
        int i = this.d;
        if (i == 1) {
            this.d = 3;
            awda.a(this.c);
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
