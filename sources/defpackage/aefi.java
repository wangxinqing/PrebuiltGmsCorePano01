package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.util.concurrent.TimeUnit;

/* renamed from: aefi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aefi {
    public final Context a;
    public final aeia b;
    public final aegn c;
    public final BluetoothDevice d;
    public final aefg e;
    public final aeij f;

    public aefi(Context context, BluetoothDevice bluetoothDevice, aeia aeia, aegn aegn, aefg aefg, aeij aeij) {
        this.a = context;
        this.d = bluetoothDevice;
        this.b = aeia;
        this.c = aegn;
        this.e = aefg;
        this.f = aeij;
        int i = Build.VERSION.SDK_INT;
        if (aeia.D()) {
            if (!((Boolean) aeic.a(bluetoothDevice).a("setPhonebookAccessPermission", Integer.TYPE).b(2)).booleanValue()) {
                throw new PairingException("Failed to deny contacts (phonebook) access.", new Object[0]);
            }
        }
        if (aeia.E()) {
            if (!((Boolean) aeic.a(bluetoothDevice).a("setMessageAccessPermission", Integer.TYPE).b(2)).booleanValue()) {
                throw new PairingException("Failed to deny message access.", new Object[0]);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && aeia.F()) {
            if (!((Boolean) aeic.a(bluetoothDevice).a("setSimAccessPermission", Integer.TYPE).b(2)).booleanValue()) {
                throw new PairingException("Failed to deny SIM access.", new Object[0]);
            }
        }
    }

    private final void a(aefu aefu) {
        aeih aeih;
        aefb aefb = new aefb(this, aefu);
        try {
            aeff aeff = new aeff(this, aefu);
            try {
                BluetoothProfile bluetoothProfile = aefb.a;
                anil anil = aehd.a;
                if (!((Boolean) aeic.a(bluetoothProfile).a("connect", BluetoothDevice.class).b(this.d)).booleanValue()) {
                    ((anih) ((anih) aehd.a.c()).a("aefi", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("connect returned false, expected if connecting, state=%d", bluetoothProfile.getConnectionState(this.d));
                }
                if (bluetoothProfile.getConnectionState(this.d) != 2) {
                    aeih = new aeih(this.f, "Wait connection");
                    aeff.a((long) this.b.A(), TimeUnit.SECONDS);
                    aeih.close();
                }
                aeff.close();
                aefb.close();
                return;
            } catch (Throwable th) {
                aeff.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                aefb.close();
            } catch (Throwable th3) {
                apev.a(th2, th3);
            }
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        aeih aeih;
        int bondState = this.d.getBondState();
        if (bondState == 11) {
            this.c.a(aspb.CANCEL_BOND);
            str = "cancelBondProcess";
        } else if (bondState == 12) {
            this.c.a(aspb.REMOVE_BOND);
            str = "removeBond";
        } else {
            return;
        }
        aefh aefh = new aefh(this);
        try {
            aeih = new aeih(this.f, str.length() == 0 ? new String("Unpair: ") : "Unpair: ".concat(str));
            ((anih) ((anih) aehd.a.d()).a("aefi", "b", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s with %s", (Object) str, (Object) this.d);
            if (!((Boolean) aeic.a(this.d).a(str, new Class[0]).b(new Object[0])).booleanValue()) {
                int bondState2 = this.d.getBondState();
                ((anih) ((anih) aehd.a.c()).a("aefi", "b", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s returned false, state=%s.", (Object) str, bondState2);
                if (bondState2 != 10) {
                    throw new PairingException("%s failed, returned false, state=%s", str, Integer.valueOf(bondState2));
                }
            } else {
                aefh.a((long) this.b.y(), TimeUnit.SECONDS);
            }
            aeih.close();
            aefh.close();
            SystemClock.sleep((long) this.b.z());
            this.c.b();
            return;
        } catch (Throwable th) {
            try {
                aefh.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2.c == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r10 = this;
            r10.b()
            aegn r0 = r10.c
            aspb r1 = defpackage.aspb.CREATE_BOND
            r0.a((defpackage.aspb) r1)
            aefe r0 = new aefe
            r0.<init>(r10)
            aeih r1 = new aeih     // Catch:{ all -> 0x00d8 }
            aeij r2 = r10.f     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "Create bond"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00d8 }
            aefg r2 = r10.e     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "c"
            java.lang.String r5 = "aefi"
            if (r2 != 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            boolean r2 = r2.c     // Catch:{ all -> 0x00ce }
            if (r2 != 0) goto L_0x0075
        L_0x0027:
            anil r2 = defpackage.aehd.a     // Catch:{ all -> 0x00ce }
            anie r2 = r2.d()     // Catch:{ all -> 0x00ce }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00ce }
            r6 = 210(0xd2, float:2.94E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r4, (int) r6, (java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = "createBond with %s, type=%s"
            android.bluetooth.BluetoothDevice r7 = r10.d     // Catch:{ all -> 0x00ce }
            int r8 = r7.getType()     // Catch:{ all -> 0x00ce }
            r2.a((java.lang.String) r6, (java.lang.Object) r7, (int) r8)     // Catch:{ all -> 0x00ce }
            aeia r2 = r10.b     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.R()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0070
            android.bluetooth.BluetoothDevice r2 = r10.d     // Catch:{ all -> 0x00ce }
            aeic r2 = defpackage.aeic.a(r2)     // Catch:{ all -> 0x00ce }
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00ce }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ce }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = "createBond"
            aeib r2 = r2.a(r8, r7)     // Catch:{ all -> 0x00ce }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ce }
            aeia r7 = r10.b     // Catch:{ all -> 0x00ce }
            int r7 = r7.S()     // Catch:{ all -> 0x00ce }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ce }
            r6[r9] = r7     // Catch:{ all -> 0x00ce }
            r2.a(r6)     // Catch:{ all -> 0x00ce }
            goto L_0x0075
        L_0x0070:
            android.bluetooth.BluetoothDevice r2 = r10.d     // Catch:{ all -> 0x00ce }
            r2.createBond()     // Catch:{ all -> 0x00ce }
        L_0x0075:
            aeia r2 = r10.b     // Catch:{ TimeoutException -> 0x0082 }
            int r2 = r2.A()     // Catch:{ TimeoutException -> 0x0082 }
            long r6 = (long) r2     // Catch:{ TimeoutException -> 0x0082 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x0082 }
            r0.a(r6, r2)     // Catch:{ TimeoutException -> 0x0082 }
            goto L_0x00c1
        L_0x0082:
            r2 = move-exception
            anil r6 = defpackage.aehd.a     // Catch:{ all -> 0x00ce }
            anie r6 = r6.c()     // Catch:{ all -> 0x00ce }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x00ce }
            r7 = 223(0xdf, float:3.12E-43)
            anie r6 = r6.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = "bondedReceiver time out after %s seconds"
            aeia r8 = r10.b     // Catch:{ all -> 0x00ce }
            int r8 = r8.A()     // Catch:{ all -> 0x00ce }
            r6.a((java.lang.String) r7, (int) r8)     // Catch:{ all -> 0x00ce }
            aeia r6 = r10.b     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.Q()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.a()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x00cd
            anil r2 = defpackage.aehd.a     // Catch:{ all -> 0x00ce }
            anie r2 = r2.c()     // Catch:{ all -> 0x00ce }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00ce }
            r6 = 226(0xe2, float:3.17E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r4, (int) r6, (java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Created bond but never received UUIDs, attempting to continue."
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x00ce }
        L_0x00c1:
            r1.close()     // Catch:{ all -> 0x00d8 }
            r0.close()
            aegn r0 = r10.c
            r0.b()
            return
        L_0x00cd:
            throw r2     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00d8 }
        L_0x00d7:
            throw r2     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r0)
        L_0x00e1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefi.c():void");
    }

    /* access modifiers changed from: package-private */
    public final void a(short s, boolean z) {
        aefe aefe;
        aeih aeih;
        if (this.b.a(s)) {
            aefu aefu = (aefu) aega.a.get(Short.valueOf(s));
            ((anih) ((anih) aehd.a.d()).a("aefi", "a", 255, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Connecting to profile=%s on device=%s", (Object) aefu, (Object) this.d);
            if (z) {
                aefe = new aefe(this);
            } else {
                aefe = null;
            }
            try {
                aeij aeij = this.f;
                String valueOf = String.valueOf(aefu);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb.append("Connect: ");
                sb.append(valueOf);
                aeih aeih2 = new aeih(aeij, sb.toString());
                try {
                    aefb aefb = new aefb(this, aefu);
                    try {
                        aeff aeff = new aeff(this, aefu);
                        try {
                            BluetoothProfile bluetoothProfile = aefb.a;
                            if (!((Boolean) aeic.a(bluetoothProfile).a("connect", BluetoothDevice.class).b(this.d)).booleanValue()) {
                                ((anih) ((anih) aehd.a.c()).a("aefi", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("connect returned false, expected if connecting, state=%d", bluetoothProfile.getConnectionState(this.d));
                            }
                            if (bluetoothProfile.getConnectionState(this.d) != 2) {
                                aeih = new aeih(this.f, "Wait connection");
                                aeff.a((long) this.b.A(), TimeUnit.SECONDS);
                                aeih.close();
                                aeff.close();
                            } else {
                                aeff.close();
                            }
                            aefb.close();
                            aeih2.close();
                            if (aefe != null) {
                                aefe.close();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            aeff.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        aefb.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    aeih2.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                if (aefe != null) {
                    try {
                        aefe.close();
                    } catch (Throwable th5) {
                        apev.a(th4, th5);
                    }
                }
                throw th4;
            }
        } else {
            throw new ConnectException(2, "Unsupported profile=%s", Short.valueOf(s));
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.d.getBondState() == 12;
    }

    public final boolean a(String str) {
        return kf.a(this.a, str) == 0;
    }
}
