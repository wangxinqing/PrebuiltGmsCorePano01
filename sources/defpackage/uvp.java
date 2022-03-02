package defpackage;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uvp implements uvh {
    private final aoru a = tid.b();
    private final Map b = new nz();
    private final Map c = new nz();
    private final Random d = new SecureRandom();
    private uvo e;

    private final uvi c(uvy uvy) {
        ulu.a();
        uvn uvn = new uvn(this, uvy, this, uvy);
        this.b.put(uvy, uvn);
        return uvn;
    }

    public final synchronized uvi a(uvy uvy) {
        uvi uvi = (uvi) this.b.get(uvy);
        if (uvi != null) {
            return uvi;
        }
        return c(uvy);
    }

    public final synchronized void a(uvo uvo) {
        this.e = uvo;
    }

    public final synchronized void b(int i) {
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            ((anih) ((anih) ulh.a.c()).a("uvp", "b", 158, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware received onMessageSendFailed for unknown messageId %d", i);
            return;
        }
        ((aosh) this.c.remove(valueOf)).a((Throwable) new IOException(String.format(Locale.US, "Message %d failed to send", new Object[]{valueOf})));
    }

    public final synchronized void a() {
        tid.a(this.a, "WifiAwareL2SocketManager.singleThreadOffloader");
        Iterator it = new ob(this.b.values()).iterator();
        while (it.hasNext()) {
            ((uvi) it.next()).close();
        }
        this.e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(defpackage.uvy r5, byte[] r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            defpackage.ulu.a((byte[]) r6)     // Catch:{ all -> 0x0069 }
            java.util.Map r0 = r4.b     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0069 }
            uvi r0 = (defpackage.uvi) r0     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x001b
            uvi r0 = r4.c(r5)     // Catch:{ all -> 0x0069 }
            uvo r5 = r4.e     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x001b
            r5.a(r0)     // Catch:{ all -> 0x0069 }
        L_0x001b:
            java.io.PipedOutputStream r5 = r0.d     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "uvi"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r5 == 0) goto L_0x0052
            r5.write(r6)     // Catch:{ IOException -> 0x0035 }
            boolean r5 = defpackage.aymi.A()     // Catch:{ IOException -> 0x0035 }
            if (r5 == 0) goto L_0x0033
            java.io.PipedOutputStream r5 = r0.d     // Catch:{ IOException -> 0x0035 }
            r5.flush()     // Catch:{ IOException -> 0x0035 }
        L_0x0033:
            monitor-exit(r4)
            return
        L_0x0035:
            r5 = move-exception
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            anie r6 = r6.c()     // Catch:{ all -> 0x0069 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0069 }
            r6.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0069 }
            r5 = 97
            anie r5 = r6.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x0069 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = "WifiAwareL2Socket connected to %s encountered an error when receiving incoming data."
            uvy r0 = r0.a     // Catch:{ all -> 0x0069 }
            r5.a((java.lang.String) r6, (java.lang.Object) r0)     // Catch:{ all -> 0x0069 }
            monitor-exit(r4)
            return
        L_0x0052:
            jjg r5 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            anie r5 = r5.b()     // Catch:{ all -> 0x0069 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0069 }
            r6 = 87
            anie r5 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r3)     // Catch:{ all -> 0x0069 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = "WifiAwareL2Socket failed to process incoming bytes."
            r5.a((java.lang.String) r6)     // Catch:{ all -> 0x0069 }
            monitor-exit(r4)
            return
        L_0x0069:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvp.c(uvy, byte[]):void");
    }

    public final synchronized void a(int i) {
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            ((anih) ((anih) ulh.a.c()).a("uvp", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware received onMessageSendSucceeded for unknown messageId %d", i);
        } else {
            ((aosh) this.c.remove(valueOf)).b((Object) null);
        }
    }

    public final synchronized void b(uvy uvy) {
        this.b.remove(uvy);
    }

    public final void b(uvy uvy, byte[] bArr) {
        int nextInt;
        aosh f = aosh.f();
        synchronized (this) {
            nextInt = this.d.nextInt();
            this.c.put(Integer.valueOf(nextInt), f);
            uvy.c.sendMessage(uvy.a, nextInt, bArr);
        }
        try {
            f.get(aymi.a.a().be(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            synchronized (this) {
                this.c.remove(Integer.valueOf(nextInt));
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException(String.format("Failed to write to %s", new Object[]{uvy}), e2);
            }
        }
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final void a(uvy uvy, byte[] bArr) {
        jjg jjg = ulh.a;
        ulu.a(bArr);
        if (!arzk.a((Runnable) new uvj(this, uvy, bArr), "WriteToPeerHandle", new arzi(0).a())) {
            throw new IOException("Failed to write");
        }
    }
}
