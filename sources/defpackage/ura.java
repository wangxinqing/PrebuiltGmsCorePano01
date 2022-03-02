package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ura  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ura implements uqr {
    public static final byte[] a = {0, 0, 0};
    public final String b;
    public final CountDownLatch c = new CountDownLatch(1);
    public final url d;
    public final amoq e;
    public final uqo f;
    public final Map g = new nz();
    private final ExecutorService h = tid.b();
    private final amog i;

    public ura(String str, amog amog, url url, uqo uqo) {
        this.b = str;
        this.i = amog;
        this.d = url;
        this.f = uqo;
        if (!(amog instanceof ampi)) {
            this.e = new ampo(amog, new uqz(this));
        } else {
            this.e = new ampq(amog, new uqz(this));
        }
    }

    static ura a(ampi ampi, url url, uqo uqo) {
        String c2 = ampi.c();
        ura ura = new ura(c2, ampi, url, uqo);
        try {
            ura.b();
            return ura;
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("ura", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to connect to client %s.", (Object) c2);
            ura.a();
            return null;
        }
    }

    private final void b(byte[] bArr) {
        byte[] bArr2 = a;
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 2;
        asmh.a |= 1;
        aucd o2 = asmd.c.o();
        auay a2 = auay.a(bArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmd asmd = (asmd) o2.b;
        a2.getClass();
        asmd.a |= 1;
        asmd.b = a2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asmd asmd2 = (asmd) o2.i();
        asmd2.getClass();
        asmh2.d = asmd2;
        asmh2.a |= 4;
        byte[] a3 = upu.a(bArr2, ((asmh) o.i()).k());
        if (a3 != null) {
            this.e.b(a3).a(new uqt(this, bArr));
        } else {
            ((anih) ((anih) ulh.a.b()).a("ura", "b", 341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a disconnection packet for service ID hash %s.", (Object) ulu.a(bArr));
        }
    }

    public static ura a(Context context, String str, url url) {
        try {
            ura ura = new ura(str, (amog) new ampb(context, new uqu(), urm.a, urm.c, urm.d, 512).a(str).get(aymi.i(), TimeUnit.MILLISECONDS), url, (uqo) null);
            try {
                ura.b();
                return ura;
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("ura", "a", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to connect to server %s.", (Object) str);
                ura.a();
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            if (e3 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            anih anih2 = (anih) ulh.a.c();
            anih2.a(e3);
            ((anih) anih2.a("ura", "a", 130, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to establish a GATT connection to server %s.", (Object) str);
            return null;
        }
    }

    private final void a(String str) {
        byte[] bArr = a;
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 1;
        asmh.a |= 1;
        aucd o2 = asme.d.o();
        auay a2 = auay.a(b(str));
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asme asme = (asme) o2.b;
        a2.getClass();
        int i2 = asme.a | 1;
        asme.a = i2;
        asme.b = a2;
        asme.c = 2;
        asme.a = i2 | 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asme asme2 = (asme) o2.i();
        asme2.getClass();
        asmh2.c = asme2;
        asmh2.a |= 2;
        byte[] a3 = upu.a(bArr, ((asmh) o.i()).k());
        if (a3 != null) {
            try {
                this.e.b(a3).get(aymi.j(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException(String.format("MultiplexBleSocketV1 failed to send the introduction packet to %s for service ID %s", new Object[]{this.b, str}));
            }
        } else {
            throw new IOException(String.format("MultiplexBleSocketV1 failed to create the introduction packet for service ID %s", new Object[]{str}));
        }
    }

    private static byte[] b(String str) {
        return ulu.a(str.getBytes(), 3);
    }

    /* renamed from: b */
    public final synchronized uqk a(int i2, String str) {
        uqk a2 = a(i2, b(str));
        if (a2 == null) {
            ((anih) ((anih) ulh.a.c()).a("ura", "b", 228, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a new outgoing BLE socket for service ID %s because the BLE socket failed to initialize.", (Object) str);
            return null;
        }
        try {
            a(str);
            return a2;
        } catch (IOException e2) {
            ((anih) ((anih) ulh.a.c()).a("ura", "b", 239, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a new outgoing BLE socket for service ID %s because it failed to send an intro packet.", (Object) str);
            jjt.a((Closeable) a2);
            return null;
        }
    }

    public final void b() {
        amoq amoq = this.e;
        if (amoq instanceof ampo) {
            amoq.f();
        }
        try {
            if (!this.c.await(aymi.i(), TimeUnit.MILLISECONDS)) {
                throw new IOException(String.format("MultiplexBleSocketV1 failed to initialize Weave protocol with %s because it never received a connection callback", new Object[]{this.b}));
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IOException(String.format("MultiplexBleSocketV1 failed to initialize Weave protocol with %s because it was interrupted while waiting for connection establishment", new Object[]{this.b}));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized uqk a(int i2, byte[] bArr) {
        String d2 = jhy.d(bArr);
        if (this.g.containsKey(d2)) {
            ((anih) ((anih) ulh.a.b()).a("ura", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a new BLE socket for service ID hash %s because there is already an active BLE socket under the same service ID.", (Object) ulu.a(bArr));
            return null;
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        try {
            uqk uqk = new uqk(bArr, pipedInputStream, new PipedOutputStream(pipedInputStream), new uqg(bArr, this.e), new uqs(this, bArr));
            this.g.put(d2, uqk);
            return uqk;
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("ura", "a", 272, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to create a new BLE socket for service ID hash %s because the piped output stream failed to initialize.", (Object) ulu.a(bArr));
            jjt.a((Closeable) pipedInputStream);
            return null;
        }
    }

    public final synchronized void a() {
        for (uqk f2 : this.g.values()) {
            f2.f();
        }
        this.g.clear();
        this.e.a();
        this.i.b();
    }

    public final void a(Runnable runnable) {
        this.h.execute(runnable);
    }

    public final synchronized void a(byte[] bArr) {
        uqk uqk = (uqk) this.g.remove(jhy.d(bArr));
        if (uqk != null) {
            uqk.f();
            if (this.g.isEmpty()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(byte[] bArr, amon amon) {
        if (!amon.b()) {
            ((anih) ((anih) ulh.a.b()).a("ura", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 failed to send a disconnection packet to %s for service ID hash %s.", (Object) this.b, (Object) ulu.a(bArr));
        }
    }
}
