package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: anky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anky extends ByteArrayOutputStream {
    public anky(int i) {
        super(i);
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        return this.buf;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.count;
    }
}
