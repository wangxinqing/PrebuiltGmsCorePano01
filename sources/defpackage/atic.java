package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: atic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atic implements athh {
    private byte[] a;
    private byte[] b = null;

    public atic(byte[] bArr) {
        this.a = bArr;
    }

    private final synchronized void c() {
        if (this.b == null) {
            byte[] bArr = this.a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            this.a = null;
            this.b = byteArrayOutputStream.toByteArray();
            this.a = null;
        }
    }

    public final synchronized int a() {
        c();
        return this.b.length;
    }

    public final synchronized InputStream b() {
        c();
        return new ByteArrayInputStream(this.b);
    }
}
