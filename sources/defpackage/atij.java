package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* renamed from: atij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class atij extends atih {
    private String f;
    private int g;
    private byte[] h;

    protected atij(String str) {
        a(str);
    }

    public static final synchronized int m() {
        synchronized (atij.class) {
        }
        return 0;
    }

    public final synchronized int a() {
        l();
        return this.h.length + f();
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(String str) {
        this.f = str;
    }

    public final synchronized InputStream b() {
        l();
        return new SequenceInputStream(new ByteArrayInputStream(this.h), e());
    }

    public synchronized void d() {
        this.h = null;
    }

    /* access modifiers changed from: protected */
    public abstract InputStream e();

    /* access modifiers changed from: protected */
    public abstract int f();

    public final synchronized String k() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(7);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(f());
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(this.g);
        dataOutputStream.close();
        byteArrayOutputStream.close();
        this.h = byteArrayOutputStream.toByteArray();
    }

    public final synchronized void n() {
        this.g = 257;
    }
}
