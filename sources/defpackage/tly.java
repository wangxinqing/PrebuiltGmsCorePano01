package defpackage;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SignatureException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class tly implements tnm {
    protected final String a;
    private final DataInputStream b;
    private final DataOutputStream c;
    private volatile long d = -1;
    private tkx e;
    private String f;
    private final AtomicReference g = new AtomicReference();
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private byte[] j;

    protected tly(String str, InputStream inputStream, OutputStream outputStream) {
        this.a = str;
        this.b = new DataInputStream(new BufferedInputStream(inputStream));
        this.c = new DataOutputStream(new BufferedOutputStream(outputStream));
    }

    public final String a() {
        String str;
        if (this.g.get() != null) {
            str = "ENCRYPTED_";
        } else {
            str = "";
        }
        asoe asoe = asoe.UNKNOWN_MEDIUM;
        switch (l().ordinal()) {
            case 2:
                return str.concat("BLUETOOTH");
            case 3:
                return str.concat("WIFI_HOTSPOT");
            case 4:
                return str.concat("BLE");
            case 5:
                return str.concat("WIFI_LAN");
            case 6:
                return str.concat("WIFI_AWARE");
            case 7:
                return str.concat("NFC");
            case 8:
                return str.concat("WIFI_DIRECT");
            case 9:
                return str.concat("WEB_RTC");
            default:
                return "UNKNOWN";
        }
    }

    public final void a(tkx tkx, String str) {
        this.e = tkx;
        this.f = str;
    }

    public final String b() {
        return this.a;
    }

    public final void c() {
        this.g.set((Object) null);
    }

    public final long d() {
        return this.d;
    }

    public final byte[] e() {
        byte[] bArr;
        synchronized (this.b) {
            int readInt = this.b.readInt();
            if (readInt < 0) {
                throw new IOException(String.format("Failed to read. Invalid length %s", new Object[]{Integer.valueOf(readInt)}));
            } else if (((long) readInt) <= aymi.a.a().ah()) {
                byte[] bArr2 = this.j;
                if (bArr2 == null || bArr2.length != readInt) {
                    this.j = new byte[readInt];
                }
                bArr = this.j;
                try {
                    this.b.readFully(bArr);
                    aurx aurx = (aurx) this.g.get();
                    if (aurx != null) {
                        bArr = aurx.b(bArr);
                    }
                    this.d = SystemClock.elapsedRealtime();
                } catch (NullPointerException e2) {
                    throw new IOException("Read failed. Socket closed.", e2);
                } catch (SignatureException e3) {
                    if (!(e3.getCause() instanceof auda)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to decode message on channel ");
                        sb.append(a());
                        if (this.f != null) {
                            sb.append(" for endpoint ");
                            sb.append(this.f);
                        }
                        throw new IOException(sb.toString(), e3);
                    }
                    anih anih = (anih) tky.a.c();
                    anih.a((Throwable) e3);
                    anih.a("Read an unencrypted (or garbage) frame when we expected an encrypted frame.");
                    this.d = SystemClock.elapsedRealtime();
                    return bArr;
                }
            } else {
                throw new IOException(String.format("Failed to read. The remote side's length (%s) exceeds the allowed size for a single frame. This typically happens because of corrupt or garbage data on the stream.", new Object[]{Integer.valueOf(readInt)}));
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    public final void g() {
        a(0);
    }

    public final void h() {
        this.h.set(true);
    }

    public final boolean i() {
        return !this.i.get() && this.h.get();
    }

    public final void j() {
        this.h.set(false);
        synchronized (this.h) {
            this.h.notify();
        }
    }

    public int k() {
        return (int) aymi.G();
    }

    public final void a(int i2) {
        tkx tkx;
        String str;
        if (!this.i.get()) {
            this.i.set(true);
            try {
                this.b.close();
            } catch (IOException | NullPointerException e2) {
                ((anih) tky.a.d()).a("Failed to close read stream of %s EndpointChannel %s: %s", (Object) a(), (Object) this.a, (Object) e2.getMessage());
            }
            try {
                this.c.close();
            } catch (IOException | NullPointerException e3) {
                ((anih) tky.a.d()).a("Failed to close write stream of %s EndpointChannel %s: %s", (Object) a(), (Object) this.a, (Object) e3.getMessage());
            }
            f();
            j();
            if (!(i2 == 0 || (tkx = this.e) == null || (str = this.f) == null)) {
                tkx.a(str, l(), i2);
            }
            this.e = null;
            this.f = null;
            jjg jjg = tky.a;
            a();
        }
    }

    public final void a(aurx aurx) {
        AtomicReference atomicReference = this.g;
        iva.a((Object) aurx);
        atomicReference.set(aurx);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(byte[] r4) {
        /*
            r3 = this;
            java.io.DataOutputStream r0 = r3.c
            monitor-enter(r0)
            boolean r1 = r3.i()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x000a
            goto L_0x0024
        L_0x000a:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.h     // Catch:{ all -> 0x0048 }
            monitor-enter(r1)     // Catch:{ all -> 0x0048 }
        L_0x000d:
            boolean r2 = r3.i()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0023
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.h     // Catch:{ InterruptedException -> 0x0019 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x000d
        L_0x0019:
            r2 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0045 }
            r2.interrupt()     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0024
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference r1 = r3.g     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0048 }
            aurx r1 = (defpackage.aurx) r1     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            byte[] r4 = r1.a(r4)     // Catch:{ all -> 0x0048 }
        L_0x0033:
            java.io.DataOutputStream r1 = r3.c     // Catch:{ all -> 0x0048 }
            int r2 = r4.length     // Catch:{ all -> 0x0048 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0048 }
            java.io.DataOutputStream r1 = r3.c     // Catch:{ all -> 0x0048 }
            r1.write(r4)     // Catch:{ all -> 0x0048 }
            java.io.DataOutputStream r4 = r3.c     // Catch:{ all -> 0x0048 }
            r4.flush()     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0045:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r4     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x004b:
            throw r4
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tly.a(byte[]):void");
    }
}
