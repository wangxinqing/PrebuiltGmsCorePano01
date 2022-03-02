package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.CreateBondException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aefe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aefe extends aegd {
    final /* synthetic */ aefi a;
    private boolean b = false;
    private boolean d = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aefe(aefi aefi) {
        super(aefi.a, aefi.b, aefi.d, "android.bluetooth.device.action.PAIRING_REQUEST", "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.UUID");
        this.a = aefi;
    }

    private final void a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!defaultAdapter.isDiscovering()) {
            HandlerThread handlerThread = new HandlerThread("TriggerDiscoverStateChangeThread");
            handlerThread.start();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aefi aefi = this.a;
            aefd aefd = new aefd(aefi.a, aefi.b, new Handler(handlerThread.getLooper()), new String[]{"android.bluetooth.adapter.action.DISCOVERY_STARTED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED"}, atomicBoolean);
            ((anih) ((anih) aehd.a.d()).a("aefe", "a", 569, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("triggerDiscoverStateChange call startDiscovery.");
            defaultAdapter.startDiscovery();
            defaultAdapter.cancelDiscovery();
            try {
                aefd.a(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                anih anih = (anih) aehd.a.c();
                anih.a(e);
                ((anih) anih.a("aefe", "a", 576, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("triggerDiscoverStateChange failed!");
            }
            handlerThread.quitSafely();
            try {
                handlerThread.join();
            } catch (InterruptedException e2) {
                anih anih2 = (anih) aehd.a.d();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("aefe", "a", 583, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("triggerDiscoverStateChange backgroundThread.join meet exception!");
            }
            if (atomicBoolean.get()) {
                ((anih) ((anih) aehd.a.d()).a("aefe", "a", 588, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("triggerDiscoverStateChange successful.");
            }
        }
    }

    private final void b(int i, int i2) {
        ((anih) ((anih) aehd.a.d()).a("aefe", "b", 595, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bond state changed to %d, reason=%d", i, i2);
        if (i == 10) {
            throw new CreateBondException(2, i2, "Bond broken, reason=%d", Integer.valueOf(i2));
        } else if (i == 12) {
            aefi aefi = this.a;
            if (aefi.e != null && !this.d) {
                aeih aeih = new aeih(aefi.f, "Close BondedReceiver: POSSIBLE_MITM");
                try {
                    a((Exception) new CreateBondException(3, i2, "Unexpectedly bonded without a passkey. It might be a MITM! Unbonding!", new Object[0]));
                    aeih.close();
                    this.a.b();
                    return;
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            } else if (!aefi.b.w() || (this.a.b.x() && this.b)) {
                aeih aeih2 = new aeih(this.a.f, "Close BondedReceiver");
                try {
                    close();
                    aeih2.close();
                    return;
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    private final void a(int i, int i2) {
        String str;
        anih anih = (anih) ((anih) aehd.a.d()).a("aefe", "a", 408, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (i2 != Integer.MIN_VALUE) {
            str = String.valueOf(i2);
        } else {
            str = "(none)";
        }
        anih.a("Pairing request, variant=%d, passkey=%s", i, (Object) str);
        if (!this.a.a("android.permission.BLUETOOTH_PRIVILEGED")) {
            return;
        }
        if (this.a.b.ac() && i == 4) {
            this.d = true;
            this.c = (long) (this.a.b.B() - this.a.b.A());
            a();
            return;
        }
        abortBroadcast();
        if (i == 3) {
            aefi aefi = this.a;
            if (aefi.e == null && aefi.b.ae()) {
                this.a.d.setPairingConfirmation(true);
                return;
            }
        }
        if (i == 2) {
            this.d = true;
            aefi aefi2 = this.a;
            if (aefi2.e != null) {
                Executors.newSingleThreadExecutor().execute(new aefc(this, i2));
            } else if (aefi2.b.K()) {
                this.a.d.setPairingConfirmation(true);
            }
        } else {
            this.a.d.setPairingConfirmation(false);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.getAction()
            int r1 = r0.hashCode()
            r2 = -377527494(0xffffffffe97f633a, float:-1.9296542E25)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x002f
            r2 = -223687943(0xfffffffff2aacaf9, float:-6.7658023E30)
            if (r1 == r2) goto L_0x0025
            r2 = 2116862345(0x7e2cc189, float:5.7408027E37)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "android.bluetooth.device.action.PAIRING_REQUEST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "android.bluetooth.device.action.UUID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            r1 = 3
            java.lang.String r2 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "aefe"
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x014b
            java.lang.String r9 = "Close BondedReceiver"
            if (r0 == r5) goto L_0x00aa
            if (r0 == r4) goto L_0x004c
            goto L_0x00a9
        L_0x004c:
            aefi r0 = r11.a
            aeia r0 = r0.b
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "android.bluetooth.device.extra.UUID"
            android.os.Parcelable[] r12 = r12.getParcelableArrayExtra(r0)
            anil r0 = defpackage.aehd.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r1 = 628(0x274, float:8.8E-43)
            anie r0 = r0.a((java.lang.String) r7, (java.lang.String) r2, (int) r1, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            aefi r1 = r11.a
            android.bluetooth.BluetoothDevice r1 = r1.d
            java.lang.String r12 = java.util.Arrays.toString(r12)
            java.lang.String r2 = "Got UUIDs for %s: %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1, (java.lang.Object) r12)
            r11.b = r5
            aefi r12 = r11.a
            aeia r12 = r12.b
            boolean r12 = r12.x()
            if (r12 == 0) goto L_0x008f
            aefi r12 = r11.a
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            return
        L_0x008f:
            aeih r12 = new aeih
            aefi r0 = r11.a
            aeij r0 = r0.f
            r12.<init>(r0, r9)
            r11.close()     // Catch:{ all -> 0x009f }
            r12.close()
            return
        L_0x009f:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r12 = move-exception
            defpackage.apev.a((java.lang.Throwable) r0, (java.lang.Throwable) r12)
        L_0x00a8:
            throw r0
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.String r0 = "android.bluetooth.device.extra.BOND_STATE"
            int r0 = r12.getIntExtra(r0, r8)
            java.lang.String r2 = "android.bluetooth.device.extra.REASON"
            int r12 = r12.getIntExtra(r2, r8)
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r8 = 595(0x253, float:8.34E-43)
            java.lang.String r10 = "b"
            anie r2 = r2.a((java.lang.String) r7, (java.lang.String) r10, (int) r8, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            java.lang.String r6 = "Bond state changed to %d, reason=%d"
            r2.a((java.lang.String) r6, (int) r0, (int) r12)
            r2 = 10
            if (r0 == r2) goto L_0x013b
            r2 = 12
            if (r0 == r2) goto L_0x00d6
            goto L_0x0120
        L_0x00d6:
            aefi r0 = r11.a
            aefg r2 = r0.e
            if (r2 != 0) goto L_0x00dd
            goto L_0x0109
        L_0x00dd:
            boolean r2 = r11.d
            if (r2 != 0) goto L_0x0109
            aeih r2 = new aeih
            aeij r0 = r0.f
            java.lang.String r4 = "Close BondedReceiver: POSSIBLE_MITM"
            r2.<init>(r0, r4)
            com.google.android.libraries.bluetooth.fastpair.CreateBondException r0 = new com.google.android.libraries.bluetooth.fastpair.CreateBondException     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = "Unexpectedly bonded without a passkey. It might be a MITM! Unbonding!"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ff }
            r0.<init>(r1, r12, r4, r3)     // Catch:{ all -> 0x00ff }
            r11.a((java.lang.Exception) r0)     // Catch:{ all -> 0x00ff }
            r2.close()
            aefi r12 = r11.a
            r12.b()
            return
        L_0x00ff:
            r12 = move-exception
            r2.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r12, (java.lang.Throwable) r0)
        L_0x0108:
            throw r12
        L_0x0109:
            aeia r12 = r0.b
            boolean r12 = r12.w()
            if (r12 == 0) goto L_0x0121
            aefi r12 = r11.a
            aeia r12 = r12.b
            boolean r12 = r12.x()
            if (r12 == 0) goto L_0x0120
            boolean r12 = r11.b
            if (r12 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            return
        L_0x0121:
            aeih r12 = new aeih
            aefi r0 = r11.a
            aeij r0 = r0.f
            r12.<init>(r0, r9)
            r11.close()     // Catch:{ all -> 0x0131 }
            r12.close()
            return
        L_0x0131:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0136 }
            goto L_0x013a
        L_0x0136:
            r12 = move-exception
            defpackage.apev.a((java.lang.Throwable) r0, (java.lang.Throwable) r12)
        L_0x013a:
            throw r0
        L_0x013b:
            com.google.android.libraries.bluetooth.fastpair.CreateBondException r0 = new com.google.android.libraries.bluetooth.fastpair.CreateBondException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r3] = r2
            java.lang.String r2 = "Bond broken, reason=%d"
            r0.<init>(r4, r12, r2, r1)
            throw r0
        L_0x014b:
            java.lang.String r0 = "android.bluetooth.device.extra.PAIRING_VARIANT"
            int r0 = r12.getIntExtra(r0, r8)
            java.lang.String r9 = "android.bluetooth.device.extra.PAIRING_KEY"
            int r12 = r12.getIntExtra(r9, r8)
            anil r9 = defpackage.aehd.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r10 = 408(0x198, float:5.72E-43)
            anie r2 = r9.a((java.lang.String) r7, (java.lang.String) r2, (int) r10, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            if (r12 == r8) goto L_0x016f
            java.lang.String r6 = java.lang.String.valueOf(r12)
            goto L_0x0171
        L_0x016f:
            java.lang.String r6 = "(none)"
        L_0x0171:
            java.lang.String r7 = "Pairing request, variant=%d, passkey=%s"
            r2.a((java.lang.String) r7, (int) r0, (java.lang.Object) r6)
            aefi r2 = r11.a
            java.lang.String r6 = "android.permission.BLUETOOTH_PRIVILEGED"
            boolean r2 = r2.a((java.lang.String) r6)
            if (r2 == 0) goto L_0x01f4
            aefi r2 = r11.a
            aeia r2 = r2.b
            boolean r2 = r2.ac()
            if (r2 == 0) goto L_0x01a9
            r2 = 4
            if (r0 == r2) goto L_0x018f
            goto L_0x01a9
        L_0x018f:
            r11.d = r5
            aefi r12 = r11.a
            aeia r12 = r12.b
            int r12 = r12.B()
            aefi r0 = r11.a
            aeia r0 = r0.b
            int r0 = r0.A()
            int r12 = r12 - r0
            long r0 = (long) r12
            r11.c = r0
            r11.a()
            return
        L_0x01a9:
            r11.abortBroadcast()
            if (r0 != r1) goto L_0x01c5
            aefi r1 = r11.a
            aefg r2 = r1.e
            if (r2 != 0) goto L_0x01c5
            aeia r1 = r1.b
            boolean r1 = r1.ae()
            if (r1 != 0) goto L_0x01bd
            goto L_0x01c5
        L_0x01bd:
            aefi r12 = r11.a
            android.bluetooth.BluetoothDevice r12 = r12.d
            r12.setPairingConfirmation(r5)
            return
        L_0x01c5:
            if (r0 != r4) goto L_0x01ec
            r11.d = r5
            aefi r0 = r11.a
            aefg r1 = r0.e
            if (r1 != 0) goto L_0x01df
            aeia r12 = r0.b
            boolean r12 = r12.K()
            if (r12 == 0) goto L_0x01de
            aefi r12 = r11.a
            android.bluetooth.BluetoothDevice r12 = r12.d
            r12.setPairingConfirmation(r5)
        L_0x01de:
            return
        L_0x01df:
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            aefc r1 = new aefc
            r1.<init>(r11, r12)
            r0.execute(r1)
            return
        L_0x01ec:
            aefi r12 = r11.a
            android.bluetooth.BluetoothDevice r12 = r12.d
            r12.setPairingConfirmation(r3)
            return
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefe.b(android.content.Intent):void");
    }

    private final void a(Parcelable[] parcelableArr) {
        ((anih) ((anih) aehd.a.d()).a("aefe", "a", 628, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Got UUIDs for %s: %s", (Object) this.a.d, (Object) Arrays.toString(parcelableArr));
        this.b = true;
        if (!this.a.b.x() || this.a.a()) {
            aeih aeih = new aeih(this.a.f, "Close BondedReceiver");
            try {
                close();
                aeih.close();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i) {
        aeih aeih;
        aeih aeih2;
        aeih aeih3;
        aeih aeih4;
        boolean z;
        aeih aeih5;
        try {
            aeih aeih6 = new aeih(this.a.f, "Exchange passkey");
            try {
                this.a.c.a(aspb.PASSKEY_EXCHANGE);
                amrl.a((Object) this.a.e);
                aeiy a2 = this.a.e.b.a();
                aeix c = a2.c(aeft.a, aefs.a);
                ((anih) ((anih) aehd.a.d()).a("aefe", "a", 476, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sending local passkey.");
                aeih = new aeih(this.a.f, "Encrypt passkey");
                byte[] a3 = aefs.a(aefr.SEEKER, this.a.e.a, i);
                aeih.close();
                aeih2 = new aeih(this.a.f, "Send passkey to remote");
                a2.a(aeft.a, aefs.a, a3);
                aeih2.close();
                ((anih) ((anih) aehd.a.d()).a("aefe", "a", 489, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Waiting for remote passkey.");
                aeih3 = new aeih(this.a.f, "Wait for remote passkey");
                byte[] a4 = c.a(TimeUnit.SECONDS.toMillis((long) this.a.b.a()));
                aeih3.close();
                aeih4 = new aeih(this.a.f, "Decrypt passkey");
                int a5 = aefs.a(aefr.PROVIDER, this.a.e.a, a4);
                aeih4.close();
                this.a.c.b();
                if (i == a5) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    ((anih) ((anih) aehd.a.b()).a("aefe", "a", 516, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passkey incorrect, local=%s, remote=%s", i, a5);
                } else {
                    ((anih) ((anih) aehd.a.d()).a("aefe", "a", 514, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passkey correct.");
                }
                aeij aeij = this.a.f;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Confirm the pairing: ");
                sb.append(z);
                aeih5 = new aeih(aeij, sb.toString());
                this.a.d.setPairingConfirmation(z);
                aeih5.close();
                aeih6.close();
                return;
                throw th;
                throw th;
                throw th;
                throw th;
                throw th;
            } catch (Throwable th) {
                aeih6.close();
                throw th;
            }
        } catch (BluetoothException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e) {
            this.a.c.a(e);
            a(e);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
