package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: wcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcx {
    public static final byte[] a = new byte[0];
    public final wdq b;
    public final String c;
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public boolean e = false;
    private wcw f;

    public wcx(wdq wdq, String str) {
        this.b = wdq;
        this.c = str;
        ((anih) ((anih) vvj.a.d()).a("wcx", "<init>", 56, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("A new NearbyConnection for %s has been created", (Object) str);
    }

    public final void a(wcw wcw) {
        synchronized (this.b) {
            this.f = wcw;
            if (this.e && wcw != null) {
                wcw.a();
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            if (!this.e) {
                this.b.b(this.c);
                this.d.add(a);
                wcw wcw = this.f;
                if (wcw != null) {
                    wcw.a();
                }
                this.e = true;
                ((anih) ((anih) vvj.a.d()).a("wcx", "b", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed NearbyConnection for %s", (Object) this.c);
            }
            this.b.notifyAll();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e;
        }
        return z;
    }

    public final void a(byte[] bArr) {
        synchronized (this.b) {
            if (!this.e) {
                this.b.b(this.c, tjc.a(bArr), wcv.a);
            } else {
                throw new IOException("Connection closed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(byte[] bArr) {
        synchronized (this.b) {
            if (!this.e) {
                ((anih) ((anih) vvj.a.d()).a("wcx", "b", 87, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wrote NearbyConnection message to queue for %s", (Object) this.c);
                this.d.add(bArr);
                this.b.notify();
                return;
            }
            ((anih) ((anih) vvj.a.d()).a("wcx", "b", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Dropping NearbyConnection message for %s because we're closed", (Object) this.c);
        }
    }

    public final byte[] a() {
        byte[] bArr;
        synchronized (this.b) {
            bArr = (byte[]) this.d.poll();
            while (bArr == null) {
                if (!this.e) {
                    try {
                        this.b.wait();
                        bArr = (byte[]) this.d.poll();
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading", e2);
                    }
                } else {
                    throw new IOException("Connection closed. Quit reading.");
                }
            }
            ((anih) ((anih) vvj.a.d()).a("wcx", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Read NearbyConnection message %s from %s", (Object) Arrays.toString(bArr), (Object) this.c);
            if (Arrays.equals(a, bArr)) {
                throw new IOException("Connection closed. Quit reading.");
            }
        }
        return bArr;
    }
}
