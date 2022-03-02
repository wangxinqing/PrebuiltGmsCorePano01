package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* renamed from: uql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uql extends uqe {
    public final byte[] c;
    public final OutputStream d;
    public final uqj e;
    private final InputStream f;
    private final url g;
    private final int h;

    private uql(byte[] bArr, InputStream inputStream, OutputStream outputStream, uqj uqj, url url, int i) {
        super(ulu.a(bArr));
        this.c = bArr;
        this.f = inputStream;
        this.d = outputStream;
        this.e = uqj;
        this.g = url;
        this.h = i;
    }

    public static uql a(int i, byte[] bArr, url url, uqj uqj, int i2) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        try {
            return new uql(bArr, pipedInputStream, new PipedOutputStream(pipedInputStream), uqj, url, i2);
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uql", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketV2 failed to create a new BLE socket for service ID hash %s because the piped output stream failed to initialize.", (Object) ulu.a(bArr));
            jjt.a((Closeable) pipedInputStream);
            return null;
        }
    }

    private final void h() {
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 2;
        asmh.a |= 1;
        aucd o2 = asmd.c.o();
        auay a = auay.a(this.c);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmd asmd = (asmd) o2.b;
        a.getClass();
        asmd.a |= 1;
        asmd.b = a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asmd asmd2 = (asmd) o2.i();
        asmd2.getClass();
        asmh2.d = asmd2;
        asmh2.a |= 4;
        byte[] k = ((asmh) o.i()).k();
        try {
            amoo b = this.e.b(k);
            if (b != null) {
                b.a(new uqi(k));
            }
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uql", "h", 202, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketV2 failed to send a disconnection packet to disconnect for service ID hash %s.", (Object) ulu.a(this.c));
        }
    }

    public final InputStream a() {
        return this.f;
    }

    public final OutputStream b() {
        return this.e;
    }

    public final byte[] d() {
        return this.c;
    }

    public final int e() {
        return this.h;
    }

    public final boolean f() {
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 1;
        asmh.a |= 1;
        aucd o2 = asme.d.o();
        auay a = auay.a(this.c);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asme asme = (asme) o2.b;
        a.getClass();
        int i = asme.a | 1;
        asme.a = i;
        asme.b = a;
        asme.c = 2;
        asme.a = i | 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asme asme2 = (asme) o2.i();
        asme2.getClass();
        asmh2.c = asme2;
        asmh2.a |= 2;
        try {
            this.e.a(((asmh) o.i()).k());
            return true;
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uql", "f", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketV2 failed to send a introduction packet to connect for service ID hash %s.", (Object) ulu.a(this.c));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        jjt.a((Closeable) this.e);
        jjt.a((Closeable) this.d);
        jjt.a((Closeable) this.f);
    }

    public final void c() {
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 2;
        asmh.a |= 1;
        aucd o2 = asmd.c.o();
        auay a = auay.a(this.c);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmd asmd = (asmd) o2.b;
        a.getClass();
        asmd.a |= 1;
        asmd.b = a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asmd asmd2 = (asmd) o2.i();
        asmd2.getClass();
        asmh2.d = asmd2;
        asmh2.a |= 4;
        byte[] k = ((asmh) o.i()).k();
        try {
            amoo b = this.e.b(k);
            if (b != null) {
                b.a(new uqi(k));
            }
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uql", "h", 202, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketV2 failed to send a disconnection packet to disconnect for service ID hash %s.", (Object) ulu.a(this.c));
        }
        this.g.a();
    }
}
