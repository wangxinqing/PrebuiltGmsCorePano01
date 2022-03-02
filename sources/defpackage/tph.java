package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tph {
    public static final tpf a = new tpf();
    public final ulj b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final Object d = new Object();
    public final Object e = new Object();
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();
    public final Object k = new Object();

    public tph(Context context) {
        ulj ulj = new ulj(context);
        this.b = ulj;
        this.c.set(true);
    }

    /* access modifiers changed from: package-private */
    public final List a(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asoe asoe = (asoe) it.next();
            asoe asoe2 = asoe.UNKNOWN_MEDIUM;
            switch (asoe.ordinal()) {
                case 2:
                    z = this.b.e.b();
                    break;
                case 3:
                    z = this.b.g.a();
                    break;
                case 4:
                    z = this.b.f.b();
                    break;
                case 5:
                    z = this.b.h.b();
                    break;
                case 6:
                    z = this.b.i.b();
                    break;
                case 7:
                    z = this.b.l.b();
                    break;
                case 8:
                    z = this.b.j.a();
                    break;
                case 9:
                    z = this.b.k.a();
                    break;
            }
            if (z) {
                arrayList.add(asoe);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            boolean r1 = r4.a()     // Catch:{ all -> 0x0029 }
            r2 = 0
            if (r1 == 0) goto L_0x0027
            ulj r1 = r4.b     // Catch:{ all -> 0x0029 }
            ujq r1 = r1.e     // Catch:{ all -> 0x0029 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0029 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "bluetooth_address"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r3)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0024
            boolean r3 = android.bluetooth.BluetoothAdapter.checkBluetoothAddress(r1)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0024
            r2 = r1
            goto L_0x0025
        L_0x0024:
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return r2
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return r2
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.b():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final BluetoothDevice c(String str) {
        synchronized (this.d) {
            if (!a()) {
                return null;
            }
            if (!this.b.b.a()) {
                return null;
            }
            BluetoothDevice e2 = this.b.e.e(str);
            return e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        synchronized (this.f) {
            if (a()) {
                this.b.g.h();
            }
        }
    }

    public final boolean e() {
        uoh uoh = this.b.g;
        int i2 = Build.VERSION.SDK_INT;
        WifiManager wifiManager = uoh.c;
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.is5GHzBandSupported();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        synchronized (this.h) {
            if (a()) {
                this.b.i.a.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        synchronized (this.i) {
            if (a()) {
                this.b.j.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        synchronized (this.i) {
            if (a()) {
                this.b.j.f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(String str) {
        synchronized (this.h) {
            if (a()) {
                this.b.i.a.d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(String str) {
        synchronized (this.h) {
            if (a()) {
                this.b.i.a.e(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(String str) {
        synchronized (this.j) {
            if (a()) {
                this.b.l.d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        synchronized (this.e) {
            if (a()) {
                this.b.f.f(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        boolean b2;
        synchronized (this.g) {
            b2 = this.b.h.b(str);
        }
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final void g(String str) {
        synchronized (this.h) {
            if (a()) {
                this.b.i.b.b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(String str) {
        synchronized (this.h) {
            if (a()) {
                this.b.i.a.b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(String str) {
        synchronized (this.g) {
            if (a()) {
                this.b.h.a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        synchronized (this.d) {
            if (a()) {
                this.b.e.d(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.f) {
            if (a()) {
                this.b.g.e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final upc a(BluetoothDevice bluetoothDevice, String str, tfw tfw) {
        synchronized (this.d) {
            if (!a()) {
                return null;
            }
            if (!this.b.b.a()) {
                return null;
            }
            upc a2 = this.b.e.a(bluetoothDevice, str, tfw);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uvz a(defpackage.uvy r15, java.lang.String r16, defpackage.tfw r17) {
        /*
            r14 = this;
            r1 = r14
            java.lang.Object r2 = r1.h
            monitor-enter(r2)
            boolean r0 = r14.a()     // Catch:{ all -> 0x0078 }
            r3 = 0
            if (r0 == 0) goto L_0x0076
            ulj r0 = r1.b     // Catch:{ all -> 0x0078 }
            upb r0 = r0.c     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0074
            ulj r0 = r1.b     // Catch:{ all -> 0x0078 }
            ump r0 = r0.i     // Catch:{ all -> 0x0078 }
            uvx r0 = r0.b     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "uvx"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r15 != 0) goto L_0x0039
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0078 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0078 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0078 }
            r7 = 185(0xb9, float:2.59E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0078 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Refusing to connect to WiFi Aware network because wifiAwarePeer is null."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0078 }
            goto L_0x0072
        L_0x0039:
            uvw r13 = new uvw     // Catch:{ all -> 0x0078 }
            uvp r8 = r0.a     // Catch:{ all -> 0x0078 }
            uui r9 = r0.b     // Catch:{ all -> 0x0078 }
            r7 = r13
            r10 = r15
            r11 = r16
            r12 = r17
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0078 }
            urt r7 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0078 }
            uru r8 = r0.c     // Catch:{ all -> 0x0078 }
            urt r8 = r8.b(r13)     // Catch:{ all -> 0x0078 }
            if (r7 == r8) goto L_0x0068
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0078 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0078 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0078 }
            r7 = 195(0xc3, float:2.73E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0078 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Failed to connect WiFi Aware socket because the MediumOperation failed to register."
            r0.a((java.lang.String) r4)     // Catch:{ all -> 0x0078 }
            goto L_0x0072
        L_0x0068:
            uvz r3 = r13.a     // Catch:{ all -> 0x0078 }
            uvs r4 = new uvs     // Catch:{ all -> 0x0078 }
            r4.<init>(r0, r13)     // Catch:{ all -> 0x0078 }
            r3.a(r4)     // Catch:{ all -> 0x0078 }
        L_0x0072:
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            return r3
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            return r3
        L_0x0076:
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            return r3
        L_0x0078:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(uvy, java.lang.String, tfw):uvz");
    }

    public final boolean a() {
        if (!this.c.get()) {
            return false;
        }
        try {
            a.a(this);
            return true;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        synchronized (this.d) {
            if (!a()) {
                return false;
            }
            boolean c2 = this.b.e.c(str);
            return c2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, java.lang.String r6, defpackage.tpb r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.h
            monitor-enter(r0)
            boolean r1 = r4.a()     // Catch:{ all -> 0x0037 }
            r2 = 0
            if (r1 == 0) goto L_0x0035
            ulj r1 = r4.b     // Catch:{ all -> 0x0037 }
            upb r1 = r1.c     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0032
            ulj r1 = r4.b     // Catch:{ all -> 0x0037 }
            ump r1 = r1.i     // Catch:{ all -> 0x0037 }
            r7.getClass()     // Catch:{ all -> 0x0037 }
            toq r3 = new toq     // Catch:{ all -> 0x0037 }
            r3.<init>(r7)     // Catch:{ all -> 0x0037 }
            uvx r7 = r1.b     // Catch:{ all -> 0x0037 }
            r3.getClass()     // Catch:{ all -> 0x0037 }
            umn r1 = new umn     // Catch:{ all -> 0x0037 }
            r1.<init>(r3)     // Catch:{ all -> 0x0037 }
            boolean r5 = r7.a((java.lang.String) r5, (java.lang.String) r6, (defpackage.umn) r1)     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0032
            r2 = 1
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x0037:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(java.lang.String, java.lang.String, tpb):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, defpackage.toz r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.h
            monitor-enter(r0)
            boolean r1 = r4.a()     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 == 0) goto L_0x002f
            ulj r1 = r4.b     // Catch:{ all -> 0x0031 }
            upb r1 = r1.c     // Catch:{ all -> 0x0031 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002c
            ulj r1 = r4.b     // Catch:{ all -> 0x0031 }
            ump r1 = r1.i     // Catch:{ all -> 0x0031 }
            tox r3 = new tox     // Catch:{ all -> 0x0031 }
            r3.<init>(r6)     // Catch:{ all -> 0x0031 }
            uvf r6 = r1.a     // Catch:{ all -> 0x0031 }
            umo r1 = new umo     // Catch:{ all -> 0x0031 }
            r1.<init>(r3)     // Catch:{ all -> 0x0031 }
            boolean r5 = r6.a((java.lang.String) r5, (defpackage.umo) r1)     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r2
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r2
        L_0x0031:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(java.lang.String, toz):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, defpackage.tpa r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            boolean r1 = r4.a()     // Catch:{ all -> 0x002d }
            r2 = 0
            if (r1 == 0) goto L_0x002b
            ulj r1 = r4.b     // Catch:{ all -> 0x002d }
            ulb r1 = r1.b     // Catch:{ all -> 0x002d }
            boolean r1 = r1.a()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0028
            ulj r1 = r4.b     // Catch:{ all -> 0x002d }
            ujq r1 = r1.e     // Catch:{ all -> 0x002d }
            r6.getClass()     // Catch:{ all -> 0x002d }
            tom r3 = new tom     // Catch:{ all -> 0x002d }
            r3.<init>(r6)     // Catch:{ all -> 0x002d }
            boolean r5 = r1.a(r5, r3)     // Catch:{ all -> 0x002d }
            if (r5 == 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x002d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(java.lang.String, tpa):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, defpackage.tpe r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            boolean r1 = r4.a()     // Catch:{ all -> 0x002d }
            r2 = 0
            if (r1 == 0) goto L_0x002b
            ulj r1 = r4.b     // Catch:{ all -> 0x002d }
            upb r1 = r1.c     // Catch:{ all -> 0x002d }
            boolean r1 = r1.a()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0028
            ulj r1 = r4.b     // Catch:{ all -> 0x002d }
            uoz r1 = r1.h     // Catch:{ all -> 0x002d }
            r6.getClass()     // Catch:{ all -> 0x002d }
            top r3 = new top     // Catch:{ all -> 0x002d }
            r3.<init>(r6)     // Catch:{ all -> 0x002d }
            boolean r5 = r1.a((java.lang.String) r5, (defpackage.top) r3)     // Catch:{ all -> 0x002d }
            if (r5 == 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x002d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(java.lang.String, tpe):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.h
            monitor-enter(r0)
            boolean r1 = r3.a()     // Catch:{ all -> 0x0027 }
            r2 = 0
            if (r1 == 0) goto L_0x0025
            ulj r1 = r3.b     // Catch:{ all -> 0x0027 }
            upb r1 = r1.c     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0022
            ulj r1 = r3.b     // Catch:{ all -> 0x0027 }
            ump r1 = r1.i     // Catch:{ all -> 0x0027 }
            uvf r1 = r1.a     // Catch:{ all -> 0x0027 }
            boolean r4 = r1.a((java.lang.String) r4, (byte[]) r5)     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tph.a(java.lang.String, byte[]):boolean");
    }
}
