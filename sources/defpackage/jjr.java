package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: jjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jjr extends ByteArrayOutputStream {
    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i) {
        System.arraycopy(this.buf, 0, bArr, i, this.count);
    }
}
