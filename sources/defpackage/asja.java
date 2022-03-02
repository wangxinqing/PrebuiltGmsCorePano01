package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: asja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asja implements asiv {
    public volatile boolean a;
    private final boolean b;
    private final InputStream c;
    private final OutputStream d;
    private final ashr e = ashr.d;
    private final byte[] f;
    private final byte[] g;
    private final ByteBuffer h;
    private final ByteBuffer i;
    private final Object j;
    private ashr k = ashr.d;

    public asja(boolean z, InputStream inputStream, OutputStream outputStream) {
        this.b = z;
        iva.a((Object) inputStream);
        this.c = inputStream;
        iva.a((Object) outputStream);
        this.d = outputStream;
        byte[] bArr = new byte[4];
        this.f = bArr;
        this.g = new byte[4];
        this.h = ByteBuffer.wrap(bArr);
        this.i = ByteBuffer.wrap(this.g);
        this.a = false;
        this.j = new Object();
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
        }
    }

    public final byte[] b() {
        byte[] bArr;
        byte[] k2;
        if (this.a) {
            jjg jjg = asil.a;
            synchronized (this.c) {
                int i2 = 0;
                this.c.read(this.g, 0, 4);
                this.i.rewind();
                int i3 = this.i.getInt();
                if (i3 <= 56320) {
                    bArr = new byte[i3];
                    while (i2 < i3) {
                        i2 += this.c.read(bArr, i2, i3 - i2);
                    }
                } else {
                    throw new IOException("Packet is greater than max allowed data size: 51200");
                }
            }
            synchronized (this.j) {
                ashr ashr = this.k;
                aucd aucd = (aucd) ashr.c(5);
                aucd.a((aucj) ashr);
                aucd.b = (aucj) aucd.b.c(4);
                this.k = (ashr) aucd.i();
                ashr ashr2 = (ashr) aucj.a((aucj) ashr.d, bArr, aubs.c());
                int i4 = ashr2.b;
                if ((ashr2.a & 2) != 0) {
                    if (ashr2.c.a() > 51200) {
                        int a2 = ashr2.c.a();
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Data packet greater than allowed max size: ");
                        sb.append(a2);
                        throw new IOException(sb.toString());
                    }
                }
                k2 = ashr2.c.k();
            }
            return k2;
        }
        throw new IOException("Not connected.");
    }

    public final synchronized void c() {
        int i2;
        if (!this.a) {
            jjg jjg = asil.a;
            if (this.b) {
                this.d.write(1);
                this.d.flush();
                i2 = this.c.read();
            } else {
                i2 = this.c.read();
                this.d.write(1);
                this.d.flush();
            }
            int min = Math.min(i2, 1);
            if (min > 0) {
                this.a = true;
                return;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Cannot connect, version is not supported: ");
            sb.append(min);
            throw new IOException(sb.toString());
        }
        jjg jjg2 = asil.a;
    }

    public final void close() {
        a((Closeable) this.c);
        a((Closeable) this.d);
        synchronized (this) {
            this.a = false;
        }
    }

    public final boolean d() {
        throw null;
    }

    public final boolean f() {
        throw null;
    }

    public final void a(byte[] bArr) {
        byte[] k2;
        if (this.a) {
            int length = bArr.length;
            if (length <= 51200) {
                jjg jjg = asil.a;
                synchronized (this.e) {
                    ashr ashr = this.e;
                    aucd aucd = (aucd) ashr.c(5);
                    aucd.a((aucj) ashr);
                    aucd.b = (aucj) aucd.b.c(4);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    ashr ashr2 = (ashr) aucd.b;
                    ashr ashr3 = ashr.d;
                    ashr2.b = 0;
                    ashr2.a |= 1;
                    auay a2 = auay.a(bArr);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    ashr ashr4 = (ashr) aucd.b;
                    a2.getClass();
                    ashr4.a |= 2;
                    ashr4.c = a2;
                    k2 = ((ashr) aucd.i()).k();
                }
                if (k2 != null) {
                    synchronized (this.d) {
                        this.h.rewind();
                        this.h.putInt(k2.length);
                        this.d.write(this.f);
                        this.d.write(k2);
                        this.d.flush();
                    }
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(35);
            sb.append("Data size out of range: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException("Not connected.");
    }
}
