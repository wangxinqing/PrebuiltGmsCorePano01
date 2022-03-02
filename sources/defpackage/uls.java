package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: uls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uls {
    private final Context a;
    private final Set b = new ob();
    private BroadcastReceiver c;
    private final Map d = new nz();
    private final Map e = new nz();
    private final Map f = new nz();
    private final ScheduledExecutorService g = tid.a();
    private final Map h = new nz();
    private final Map i = new nz();
    private final aoru j = tid.b();

    public uls(Context context) {
        this.a = context.getApplicationContext();
    }

    private final boolean e(String str) {
        return this.b.contains(str);
    }

    private final boolean f(String str) {
        return this.d.containsKey(str);
    }

    private final boolean g(String str) {
        return this.i.containsKey(str);
    }

    public final synchronized usa a(String str, usd usd, tfw tfw) {
        usa usa;
        usa = null;
        if (tfw.b()) {
            jjg jjg = ulh.a;
            return null;
        }
        try {
            usd.a("F00000FE2C");
            usa usa2 = new usa(usd);
            try {
                if (!usa2.c.a(new urv(Byte.MIN_VALUE, (byte) 2, (byte) 0, (byte) 0, str.getBytes(), 0)).c()) {
                    usa = usa2;
                } else {
                    throw new IOException("Failed to connect to remote NFC device");
                }
            } catch (IOException e2) {
            }
        } catch (IOException e3) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e3);
            ((anih) anih.a("uls", "a", 453, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to NFC device %s.", (Object) usd);
            jjt.a((Closeable) usd);
            return null;
        }
        return usa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f(r6)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x000b
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return
        L_0x000b:
            ob r0 = new ob     // Catch:{ all -> 0x0071 }
            java.util.Map r1 = r5.d     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0071 }
            ulr r1 = (defpackage.ulr) r1     // Catch:{ all -> 0x0071 }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x0071 }
            r0.<init>((java.util.Collection) r1)     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
        L_0x001e:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0071 }
            usd r1 = (defpackage.usd) r1     // Catch:{ all -> 0x0071 }
            boolean r2 = r1.c()     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x001e
            java.util.Map r2 = r5.d     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0071 }
            ulr r2 = (defpackage.ulr) r2     // Catch:{ all -> 0x0071 }
            java.util.Set r2 = r2.a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0071 }
            java.util.Map r2 = r5.e     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0071 }
            toy r2 = (defpackage.toy) r2     // Catch:{ all -> 0x0071 }
            tpv r2 = r2.a     // Catch:{ all -> 0x0071 }
            tql r3 = r2.f     // Catch:{ all -> 0x0071 }
            tpu r4 = new tpu     // Catch:{ all -> 0x0071 }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x0071 }
            r3.a((java.lang.Runnable) r4)     // Catch:{ all -> 0x0071 }
            goto L_0x001e
        L_0x0054:
            java.util.Map r0 = r5.d     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0071 }
            ulr r0 = (defpackage.ulr) r0     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
            java.util.Map r0 = r5.h     // Catch:{ all -> 0x0071 }
            java.lang.Object r6 = r0.remove(r6)     // Catch:{ all -> 0x0071 }
            tfu r6 = (defpackage.tfu) r6     // Catch:{ all -> 0x0071 }
            r6.b()     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)
            return
        L_0x0071:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0075
        L_0x0074:
            throw r6
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uls.b(java.lang.String):void");
    }

    public final synchronized void c(String str) {
        if (!f(str)) {
            ((anih) ((anih) ulh.a.d()).a("uls", "c", 393, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop NFC discovery because it was never started.");
            return;
        }
        tfu tfu = (tfu) this.h.remove(str);
        if (tfu != null) {
            tfu.b();
        }
        this.d.remove(str);
        this.e.remove(str);
        this.f.remove(str);
        if (this.d.keySet().isEmpty()) {
            thp.a(this.a, this.c);
            this.c = null;
        }
        ((anih) ((anih) ulh.a.d()).a("uls", "c", 410, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC discovery successfully stopped.");
    }

    public final synchronized void d(String str) {
        if (g(str)) {
            this.i.remove(str);
        }
    }

    public final synchronized void a() {
        tid.a(this.g, "NearFieldCommunication.onLostExecutor");
        tid.a(this.j, "NearFieldCommunication.singleThreadOffloader");
        Iterator it = new ob((Collection) this.b).iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
        Iterator it2 = new ob((Collection) this.i.keySet()).iterator();
        while (it2.hasNext()) {
            d((String) it2.next());
        }
        Iterator it3 = new ob((Collection) this.d.keySet()).iterator();
        while (it3.hasNext()) {
            c((String) it3.next());
        }
    }

    public final boolean b() {
        if (!aymi.L()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return this.a.getPackageManager().hasSystemFeature("android.hardware.nfc") && this.a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        if (r6 != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.nfc.Tag r17) {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            android.nfc.tech.IsoDep r0 = android.nfc.tech.IsoDep.get(r17)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "uls"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 != 0) goto L_0x0026
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0162 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            r5 = 275(0x113, float:3.85E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "Ignoring discovered NFC tag because it's not of type IsoDep."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0162 }
            monitor-exit(r16)
            return
        L_0x0026:
            ury r5 = new ury     // Catch:{ all -> 0x0162 }
            r5.<init>(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "F00000FE2C"
            r5.a((java.lang.String) r0)     // Catch:{ IOException -> 0x00f8 }
            java.util.Map r0 = r1.d     // Catch:{ IOException -> 0x00f8 }
            java.util.Set r0 = r0.keySet()     // Catch:{ IOException -> 0x00f8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00f8 }
            r6 = 0
        L_0x003b:
            boolean r7 = r0.hasNext()     // Catch:{ IOException -> 0x00f8 }
            if (r7 == 0) goto L_0x00ee
            java.lang.Object r7 = r0.next()     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00f8 }
            java.util.Map r8 = r1.d     // Catch:{ IOException -> 0x00f8 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ IOException -> 0x00f8 }
            ulr r8 = (defpackage.ulr) r8     // Catch:{ IOException -> 0x00f8 }
            java.util.Set r8 = r8.a     // Catch:{ IOException -> 0x00f8 }
            boolean r8 = r8.contains(r5)     // Catch:{ IOException -> 0x00f8 }
            if (r8 != 0) goto L_0x00ea
            java.util.Map r8 = r1.f     // Catch:{ IOException -> 0x00f8 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ IOException -> 0x00f8 }
            asml r8 = (defpackage.asml) r8     // Catch:{ IOException -> 0x00f8 }
            if (r8 == 0) goto L_0x003b
            byte[] r14 = r8.k()     // Catch:{ IOException -> 0x00f8 }
            urv r8 = new urv     // Catch:{ IOException -> 0x00f8 }
            r10 = -128(0xffffffffffffff80, float:NaN)
            r11 = 1
            r12 = 0
            r13 = 0
            r15 = 255(0xff, float:3.57E-43)
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x00f8 }
            urw r8 = r5.a((defpackage.urv) r8)     // Catch:{ IOException -> 0x00f8 }
            boolean r9 = r8.c()     // Catch:{ IOException -> 0x00f8 }
            if (r9 != 0) goto L_0x00e5
            byte[] r8 = r8.a     // Catch:{ IOException -> 0x00f8 }
            aubs r9 = defpackage.aubs.c()     // Catch:{ IOException -> 0x00f8 }
            asmk r10 = defpackage.asmk.d     // Catch:{ IOException -> 0x00f8 }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r10, (byte[]) r8, (defpackage.aubs) r9)     // Catch:{ IOException -> 0x00f8 }
            asmk r8 = (defpackage.asmk) r8     // Catch:{ IOException -> 0x00f8 }
            jjg r9 = defpackage.ulh.a     // Catch:{ IOException -> 0x00f8 }
            java.util.Map r9 = r1.d     // Catch:{ IOException -> 0x00f8 }
            java.lang.Object r9 = r9.get(r7)     // Catch:{ IOException -> 0x00f8 }
            ulr r9 = (defpackage.ulr) r9     // Catch:{ IOException -> 0x00f8 }
            java.util.Set r9 = r9.a     // Catch:{ IOException -> 0x00f8 }
            r9.add(r5)     // Catch:{ IOException -> 0x00f8 }
            java.util.Map r9 = r1.e     // Catch:{ IOException -> 0x00f8 }
            java.lang.Object r9 = r9.get(r7)     // Catch:{ IOException -> 0x00f8 }
            toy r9 = (defpackage.toy) r9     // Catch:{ IOException -> 0x00f8 }
            auay r10 = r8.b     // Catch:{ IOException -> 0x00f8 }
            byte[] r10 = r10.k()     // Catch:{ IOException -> 0x00f8 }
            int r11 = r8.a     // Catch:{ IOException -> 0x00f8 }
            r11 = r11 & 2
            if (r11 == 0) goto L_0x00b4
            auay r8 = r8.c     // Catch:{ IOException -> 0x00f8 }
            byte[] r8 = r8.k()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            tpv r9 = r9.a     // Catch:{ IOException -> 0x00f8 }
            tql r11 = r9.f     // Catch:{ IOException -> 0x00f8 }
            tpt r12 = new tpt     // Catch:{ IOException -> 0x00f8 }
            r12.<init>(r9, r5, r10, r8)     // Catch:{ IOException -> 0x00f8 }
            r11.a((java.lang.Runnable) r12)     // Catch:{ IOException -> 0x00f8 }
            java.util.Map r8 = r1.h     // Catch:{ IOException -> 0x00f8 }
            boolean r8 = r8.containsKey(r7)     // Catch:{ IOException -> 0x00f8 }
            if (r8 != 0) goto L_0x003b
            java.util.Map r8 = r1.h     // Catch:{ IOException -> 0x00f8 }
            ulo r9 = new ulo     // Catch:{ IOException -> 0x00f8 }
            r9.<init>(r1, r7)     // Catch:{ IOException -> 0x00f8 }
            aymi r10 = defpackage.aymi.a     // Catch:{ IOException -> 0x00f8 }
            aymj r10 = r10.a()     // Catch:{ IOException -> 0x00f8 }
            long r10 = r10.ar()     // Catch:{ IOException -> 0x00f8 }
            java.util.concurrent.ScheduledExecutorService r12 = r1.g     // Catch:{ IOException -> 0x00f8 }
            tfu r9 = defpackage.tfu.a(r9, r10, r12)     // Catch:{ IOException -> 0x00f8 }
            r8.put(r7, r9)     // Catch:{ IOException -> 0x00f8 }
            goto L_0x003b
        L_0x00e5:
            jjg r6 = defpackage.ulh.a     // Catch:{ IOException -> 0x00f8 }
            r6 = 1
            goto L_0x003b
        L_0x00ea:
            jjg r7 = defpackage.ulh.a     // Catch:{ IOException -> 0x00f8 }
            goto L_0x003b
        L_0x00ee:
            defpackage.jjt.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0162 }
            if (r6 == 0) goto L_0x00f4
        L_0x00f3:
            goto L_0x0115
        L_0x00f4:
            monitor-exit(r16)
            return
        L_0x00f6:
            r0 = move-exception
            goto L_0x015e
        L_0x00f8:
            r0 = move-exception
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x00f6 }
            anie r6 = r6.c()     // Catch:{ all -> 0x00f6 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x00f6 }
            r6.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00f6 }
            r0 = 286(0x11e, float:4.01E-43)
            anie r0 = r6.a((java.lang.String) r2, (java.lang.String) r3, (int) r0, (java.lang.String) r4)     // Catch:{ all -> 0x00f6 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "Failed to connect to discovered NFC tag."
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x00f6 }
            defpackage.jjt.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0162 }
            goto L_0x00f3
        L_0x0115:
            boolean r0 = r5.c()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0148
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0162 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            r5 = 295(0x127, float:4.13E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "Will try to read the NFC tag again in %d millis."
            long r3 = defpackage.aymi.H()     // Catch:{ all -> 0x0162 }
            r0.a((java.lang.String) r2, (long) r3)     // Catch:{ all -> 0x0162 }
            java.util.concurrent.ScheduledExecutorService r0 = r1.g     // Catch:{ all -> 0x0162 }
            uln r2 = new uln     // Catch:{ all -> 0x0162 }
            r3 = r17
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0162 }
            long r3 = defpackage.aymi.H()     // Catch:{ all -> 0x0162 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0162 }
            r0.schedule(r2, r3, r5)     // Catch:{ all -> 0x0162 }
            monitor-exit(r16)
            return
        L_0x0148:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0162 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            r5 = 303(0x12f, float:4.25E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0162 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "NFC tag is lost. Discarding."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0162 }
            goto L_0x00f4
        L_0x015e:
            defpackage.jjt.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x0166
        L_0x0165:
            throw r0
        L_0x0166:
            goto L_0x0165
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uls.a(android.nfc.Tag):void");
    }

    public final void a(Runnable runnable) {
        this.j.execute(runnable);
    }

    public final synchronized void a(String str) {
        if (!e(str)) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 202, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop NFC advertising because it was never started.");
            return;
        }
        usb.a().b(str);
        this.b.remove(str);
        ((anih) ((anih) ulh.a.d()).a("uls", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC advertising successfully stopped.");
    }

    public final synchronized void a(String str, usa usa) {
        if (!g(str)) {
            jjt.a((Closeable) usa);
            return;
        }
        tqe tqe = ((tos) this.i.get(str)).a;
        tqe.c.a((Runnable) new tqd(tqe, usa));
    }

    public final synchronized boolean a(String str, String str2, toy toy, byte[] bArr) {
        if (str == null || toy == null) {
            ((anih) ((anih) ulh.a.b()).a("uls", "a", 222, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start NFC discovery because a null serviceId or discoveredDeviceCallback was passed in.");
            return false;
        } else if (f(str)) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 229, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start NFC discovery because we're already discovering.");
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 234, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start NFC discovery because NFC is not available.");
            return false;
        } else {
            if (this.c == null) {
                NearFieldCommunication$1 nearFieldCommunication$1 = new NearFieldCommunication$1(this, "nearby");
                this.c = nearFieldCommunication$1;
                this.a.registerReceiver(nearFieldCommunication$1, new IntentFilter("android.nfc.action.TAG_DISCOVERED"));
            }
            aucd o = asml.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asml asml = (asml) o.b;
            str.getClass();
            int i2 = asml.a | 1;
            asml.a = i2;
            asml.b = str;
            str2.getClass();
            asml.a = i2 | 2;
            asml.c = str2;
            if (bArr != null) {
                if (bArr.length > 0) {
                    auay a2 = auay.a(bArr);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asml asml2 = (asml) o.b;
                    a2.getClass();
                    asml2.a |= 4;
                    asml2.d = a2;
                }
            }
            this.f.put(str, (asml) o.i());
            this.d.put(str, new ulr());
            this.e.put(str, toy);
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC discovery successfully started.");
            return true;
        }
    }

    public final synchronized boolean a(String str, tos tos) {
        if (g(str)) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 421, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting NFC connections because we're already accepting connections for service id %s.", (Object) str);
            return false;
        }
        this.i.put(str, tos);
        return true;
    }

    public final synchronized boolean a(String str, byte[] bArr, byte[] bArr2, tqk tqk) {
        if (str == null || bArr == null) {
            ((anih) ((anih) ulh.a.b()).a("uls", "a", 158, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start NFC advertising because a null serviceId or tag was passed in.");
            return false;
        } else if (e(str)) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 164, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start NFC advertising because we're already advertising.");
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 169, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start NFC advertising because NFC is not available.");
            return false;
        } else {
            aucd o = asmk.d.o();
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmk asmk = (asmk) o.b;
            a2.getClass();
            asmk.a |= 1;
            asmk.b = a2;
            if (bArr2 != null) {
                if (bArr2.length > 0) {
                    auay a3 = auay.a(bArr2);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asmk asmk2 = (asmk) o.b;
                    a3.getClass();
                    asmk2.a |= 2;
                    asmk2.c = a3;
                }
            }
            usb.a().a(str, tqk, (asmk) o.i(), new ulm(this, str));
            this.b.add(str);
            ((anih) ((anih) ulh.a.d()).a("uls", "a", 186, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC advertising successfully started.");
            return true;
        }
    }
}
