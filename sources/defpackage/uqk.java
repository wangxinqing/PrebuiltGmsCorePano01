package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: uqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uqk extends uqe {
    public final OutputStream c;
    private final byte[] d;
    private final InputStream e;
    private final OutputStream f;
    private final url g;

    public uqk(byte[] bArr, InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, url url) {
        super(ulu.a(bArr));
        this.d = bArr;
        this.e = inputStream;
        this.c = outputStream;
        this.f = outputStream2;
        this.g = url;
    }

    public final InputStream a() {
        return this.e;
    }

    public final OutputStream b() {
        return this.f;
    }

    public final void c() {
        this.g.a();
    }

    public final byte[] d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        jjt.a((Closeable) this.f);
        jjt.a((Closeable) this.c);
        jjt.a((Closeable) this.e);
    }
}
