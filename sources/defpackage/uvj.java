package defpackage;

import java.io.IOException;

/* renamed from: uvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uvj implements Runnable {
    private final uvp a;
    private final uvy b;
    private final byte[] c;

    public uvj(uvp uvp, uvy uvy, byte[] bArr) {
        this.a = uvp;
        this.b = uvy;
        this.c = bArr;
    }

    public final void run() {
        try {
            this.a.b(this.b, this.c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
