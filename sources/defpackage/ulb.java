package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothRadio$1;
import com.google.android.gms.nearby.mediums.BluetoothRadio$2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ulb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ulb {
    public final aoru a;
    private final Context b;
    private final uru c;
    private final BluetoothAdapter d;
    private final AtomicBoolean e;
    private urq f;
    private final BroadcastReceiver g = new BluetoothRadio$1(this, "nearby");

    public ulb(Context context, uru uru) {
        aoru b2 = tid.b();
        this.b = context.getApplicationContext();
        this.c = uru;
        this.a = b2;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.d = defaultAdapter;
        if (defaultAdapter != null) {
            if (!b(false)) {
                e();
            } else if (!d()) {
                ((anih) ((anih) ulh.a.c()).a("ulb", "<init>", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to take register radio state upon initialization.", (Object) "[BLUETOOTH_RADIO]");
                this.e = null;
                return;
            }
            this.e = new AtomicBoolean(this.d.isEnabled());
            jjg jjg = ulh.a;
            this.d.isEnabled();
            f();
            return;
        }
        ((anih) ((anih) ulh.a.b()).a("ulb", "<init>", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve default BluetoothAdapter, Bluetooth is unsupported.");
        this.e = null;
    }

    private final boolean a(boolean z) {
        String str;
        boolean z2;
        Context context;
        if (b(z)) {
            return true;
        }
        if (!z) {
            str = "disable";
        } else {
            str = "enable";
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BluetoothRadio$2 bluetoothRadio$2 = new BluetoothRadio$2("nearby", z, countDownLatch);
        this.b.registerReceiver(bluetoothRadio$2, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        g();
        if (!z) {
            try {
                z2 = this.d.disable();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("ulb", "a", 475, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to %s Bluetooth, bailing.", (Object) str);
                context = this.b;
            } catch (Throwable th) {
                thp.a(this.b, (BroadcastReceiver) bluetoothRadio$2);
                f();
                throw th;
            }
        } else {
            z2 = this.d.enable();
        }
        if (z2) {
            if (!countDownLatch.await(aymi.r(), TimeUnit.SECONDS)) {
                ((anih) ((anih) ulh.a.c()).a("ulb", "a", 462, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s timed out while waiting for latch to signal Bluetooth state change completion.", (Object) "[BLUETOOTH_RADIO]");
            } else {
                jjg jjg = ulh.a;
            }
            if (z) {
                Thread.sleep(aymi.a.a().L());
            }
            thp.a(this.b, (BroadcastReceiver) bluetoothRadio$2);
            f();
            if (b(z)) {
                return true;
            }
            ((anih) ((anih) ulh.a.b()).a("ulb", "a", 489, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to %s Bluetooth after waiting %d seconds, bailing.", (Object) str, aymi.r());
            return false;
        }
        ((anih) ((anih) ulh.a.b()).a("ulb", "a", 442, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to begin transition to %s Bluetooth.", (Object) str);
        context = this.b;
        thp.a(context, (BroadcastReceiver) bluetoothRadio$2);
        f();
        return false;
    }

    private final boolean b(boolean z) {
        return !z ? !this.d.isEnabled() : this.d.isEnabled();
    }

    private final boolean c() {
        return (this.d == null || this.e == null) ? false : true;
    }

    private final boolean d() {
        if (h()) {
            jjg jjg = ulh.a;
            return true;
        }
        urq urq = new urq(1);
        if (urt.SUCCESS != this.c.b(urq)) {
            ((anih) ((anih) ulh.a.c()).a("ulb", "d", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to mark Bluetooth as disabled because we were unable to register the MediumOperation.", (Object) "[BLUETOOTH_RADIO]");
            return false;
        }
        this.f = urq;
        jjg jjg2 = ulh.a;
        return true;
    }

    private final void e() {
        if (!h()) {
            jjg jjg = ulh.a;
            return;
        }
        this.c.c(this.f);
        this.f = null;
        jjg jjg2 = ulh.a;
    }

    private final void f() {
        this.b.registerReceiver(this.g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    private final void g() {
        thp.a(this.b, this.g);
    }

    private final boolean h() {
        return this.f != null;
    }

    public final synchronized void b() {
        String str;
        if (!c()) {
            ((anih) ((anih) ulh.a.c()).a("ulb", "b", 279, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to revert Bluetooth Radio since it was never initialized.", (Object) "[BLUETOOTH_RADIO]");
            return;
        }
        jjg jjg = ulh.a;
        this.e.get();
        try {
            if (!a(this.e.get())) {
                ((anih) ((anih) ulh.a.c()).a("ulb", "b", 292, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to revert Bluetooth back to its most recent manually-set state.", (Object) "[BLUETOOTH_RADIO]");
            }
        } finally {
            g();
            str = "BluetoothRadio.singleThreadOffloader";
            tid.a(this.a, str);
        }
    }

    ulb(Context context, uru uru, aoru aoru) {
        this.b = context.getApplicationContext();
        this.c = uru;
        this.a = aoru;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.d = defaultAdapter;
        if (defaultAdapter != null) {
            if (!b(false)) {
                e();
            } else if (!d()) {
                ((anih) ((anih) ulh.a.c()).a("ulb", "<init>", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to take register radio state upon initialization.", (Object) "[BLUETOOTH_RADIO]");
                this.e = null;
                return;
            }
            this.e = new AtomicBoolean(this.d.isEnabled());
            jjg jjg = ulh.a;
            this.d.isEnabled();
            f();
            return;
        }
        ((anih) ((anih) ulh.a.b()).a("ulb", "<init>", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve default BluetoothAdapter, Bluetooth is unsupported.");
        this.e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Intent r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "ulb"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r7.c()     // Catch:{ all -> 0x0092 }
            if (r3 != 0) goto L_0x0026
            jjg r8 = defpackage.ulh.a     // Catch:{ all -> 0x0092 }
            anie r8 = r8.c()     // Catch:{ all -> 0x0092 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0092 }
            r3 = 313(0x139, float:4.39E-43)
            anie r8 = r8.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0092 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "%s Unable to process manual radio state change since Bluetooth Radio was never initialized."
            java.lang.String r1 = "[BLUETOOTH_RADIO]"
            r8.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0092 }
            monitor-exit(r7)
            return
        L_0x0026:
            java.lang.String r3 = "android.bluetooth.adapter.action.STATE_CHANGED"
            java.lang.String r4 = r8.getAction()     // Catch:{ all -> 0x0092 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = "android.bluetooth.adapter.extra.STATE"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r8.getIntExtra(r3, r4)     // Catch:{ all -> 0x0092 }
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0092 }
            switch(r8) {
                case 10: goto L_0x004b;
                case 11: goto L_0x0048;
                case 12: goto L_0x0045;
                case 13: goto L_0x0042;
                default: goto L_0x003f;
            }     // Catch:{ all -> 0x0092 }
        L_0x003f:
            java.lang.String r3 = "STATE_UNKNOWN"
            goto L_0x004d
        L_0x0042:
            java.lang.String r3 = "STATE_TURNING_OFF"
            goto L_0x004d
        L_0x0045:
            java.lang.String r3 = "STATE_ON"
            goto L_0x004d
        L_0x0048:
            java.lang.String r3 = "STATE_TURNING_ON"
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = "STATE_OFF"
        L_0x004d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0092 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0092 }
            r4[r5] = r6     // Catch:{ all -> 0x0092 }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0092 }
            r3 = 12
            if (r8 == r3) goto L_0x006a
            r3 = 10
            if (r8 != r3) goto L_0x0068
            r7.d()     // Catch:{ all -> 0x0092 }
            goto L_0x006d
        L_0x0068:
            monitor-exit(r7)
            return
        L_0x006a:
            r7.e()     // Catch:{ all -> 0x0092 }
        L_0x006d:
            jjg r8 = defpackage.ulh.a     // Catch:{ all -> 0x0092 }
            anie r8 = r8.c()     // Catch:{ all -> 0x0092 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0092 }
            r3 = 338(0x152, float:4.74E-43)
            anie r8 = r8.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0092 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "%s State was changed outside of our control. Updating the snapshot to match current radio state."
            java.lang.String r1 = "[BLUETOOTH_RADIO]"
            r8.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0092 }
            android.bluetooth.BluetoothAdapter r8 = r7.d     // Catch:{ all -> 0x0092 }
            boolean r8 = r8.isEnabled()     // Catch:{ all -> 0x0092 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.e     // Catch:{ all -> 0x0092 }
            r0.getAndSet(r8)     // Catch:{ all -> 0x0092 }
            goto L_0x0068
        L_0x0090:
            monitor-exit(r7)
            return
        L_0x0092:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0096
        L_0x0095:
            throw r8
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulb.a(android.content.Intent):void");
    }

    public final synchronized boolean a() {
        if (!c()) {
            ((anih) ((anih) ulh.a.c()).a("ulb", "a", 156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to enable Bluetooth Radio since it was never initialized.", (Object) "[BLUETOOTH_RADIO]");
            return false;
        } else if (b(true)) {
            jjg jjg = ulh.a;
            e();
            return true;
        } else if (!a(true)) {
            jjg jjg2 = ulh.a;
            e();
            return false;
        } else {
            e();
            jjg jjg3 = ulh.a;
            return true;
        }
    }
}
