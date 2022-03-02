package com.google.android.gms.auth.setup.d2d;

import android.accounts.Account;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceChimeraActivity extends Activity implements icb {
    public static final iwd a = new iwd("D2D", "SourceActivity");
    private static final long u = TimeUnit.MINUTES.toMillis(5);
    public Account[] b;
    public BluetoothAdapter c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public volatile boolean g = false;
    public boolean h = false;
    public final Object i = new Object();
    public boolean j = false;
    public gks k;
    public final aosh l = aosh.f();
    public AlertDialog m;
    public gkr n;
    public gkq o;
    public gaj p;
    public acrz q;
    public AsyncTask r;
    public gka s;
    public gjy t = gkb.b;

    public static Intent a(Context context, byte[] bArr) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SourceActivity").putExtra("payload", bArr);
    }

    public final void b() {
        this.d = true;
        if (this.c.enable()) {
            registerReceiver(new nla("auth_account") {
                public final void a(Context context, Intent intent) {
                    SourceChimeraActivity sourceChimeraActivity = SourceChimeraActivity.this;
                    iwd iwd = SourceChimeraActivity.a;
                    if (sourceChimeraActivity.c.isEnabled()) {
                        context.unregisterReceiver(this);
                        SourceChimeraActivity.this.c();
                    }
                }
            }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            return;
        }
        a.e("Could not enable Bluetooth.", new Object[0]);
        finish();
    }

    public final void c() {
        gkr gkr = new gkr(this, this.c, UUID.fromString(this.k.b), this.k.c);
        this.n = gkr;
        gkr.start();
    }

    public final void d() {
        this.g = true;
        if (this.s != null) {
            aucd o2 = gkt.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gkt.a((gkt) o2.b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gkt gkt = (gkt) o2.b;
            gkt.a |= 4;
            gkt.c = true;
            try {
                this.s.a((gkt) o2.i());
            } catch (IOException e2) {
                a.a((Throwable) e2);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            return;
        }
        if (i3 == -1) {
            this.f = true;
            a();
            return;
        }
        d();
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            boolean r0 = defpackage.ent.M()
            if (r0 != 0) goto L_0x000d
            r8.finish()
            return
        L_0x000d:
            boolean r0 = defpackage.jgu.e(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r9 = 2131951834(0x7f1300da, float:1.9540094E38)
            r8.a((int) r9)
            iwd r9 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Cannot clone restricted profile"
            r9.d(r1, r0)
            return
        L_0x0024:
            qub r0 = defpackage.qub.a((android.content.Context) r8)
            java.lang.String r2 = "com.google"
            android.accounts.Account[] r0 = r0.a((java.lang.String) r2)
            r8.b = r0
            int r0 = r0.length
            if (r0 > 0) goto L_0x0043
            r9 = 2131951829(0x7f1300d5, float:1.9540084E38)
            r8.a((int) r9)
            iwd r9 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "No accounts found!"
            r9.a(r1, r0)
            return
        L_0x0043:
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            r8.c = r0
            if (r0 != 0) goto L_0x005b
            r9 = 2131951830(0x7f1300d6, float:1.9540086E38)
            r8.a((int) r9)
            iwd r9 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Bluetooth not available."
            r9.c(r1, r0)
            return
        L_0x005b:
            android.view.View r0 = new android.view.View
            r0.<init>(r8)
            r8.setContentView((android.view.View) r0)
            android.view.Window r0 = r8.getWindow()
            r2 = 128(0x80, float:1.794E-43)
            r0.addFlags(r2)
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            r2 = 1
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.isKeyguardSecure()
            if (r0 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r8.e = r2
        L_0x0080:
            android.content.Intent r0 = r8.getIntent()
            gks r3 = defpackage.gks.e
            aucd r3 = r3.o()
            java.lang.String r4 = "payload"
            byte[] r4 = r0.getByteArrayExtra(r4)
            r5 = 0
            if (r4 == 0) goto L_0x00ad
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x00a2 }
            r3.b(r4, r0)     // Catch:{ auda -> 0x00a2 }
            aucj r0 = r3.i()     // Catch:{ auda -> 0x00a2 }
            gks r0 = (defpackage.gks) r0     // Catch:{ auda -> 0x00a2 }
            r5 = r0
            goto L_0x010f
        L_0x00a2:
            r0 = move-exception
            iwd r3 = a
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r6 = "Could not deserialize BootstrapInfo!"
            r3.e(r6, r0, r4)
            goto L_0x010f
        L_0x00ad:
            java.lang.String r4 = "btMacAddress"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            r3.c()
            r3.c = r1
        L_0x00be:
            aucj r6 = r3.b
            gks r6 = (defpackage.gks) r6
            r4.getClass()
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r4
            java.lang.String r4 = "initiatorHello"
            byte[] r0 = r0.getByteArrayExtra(r4)
            if (r0 == 0) goto L_0x00f2
            auay r0 = defpackage.auay.a((byte[]) r0)
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r3.c()
            r3.c = r1
        L_0x00e3:
            aucj r4 = r3.b
            gks r4 = (defpackage.gks) r4
            r0.getClass()
            int r6 = r4.a
            r6 = r6 | 4
            r4.a = r6
            r4.d = r0
        L_0x00f2:
            aucj r0 = r3.b
            gks r0 = (defpackage.gks) r0
            java.lang.String r0 = r0.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0108
            iwd r0 = a
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Bluetooth MAC address information missing."
            r0.e(r4, r3)
            goto L_0x010f
        L_0x0108:
            aucj r0 = r3.i()
            r5 = r0
            gks r5 = (defpackage.gks) r5
        L_0x010f:
            r8.k = r5
            if (r5 == 0) goto L_0x01c2
            android.bluetooth.BluetoothAdapter r0 = r8.c
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x011c
            goto L_0x011f
        L_0x011c:
            r8.c()
        L_0x011f:
            boolean r3 = r8.e
            if (r3 == 0) goto L_0x01be
            r3 = 2131951828(0x7f1300d4, float:1.9540082E38)
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r4 = "\n"
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r3 = 2131951827(0x7f1300d3, float:1.954008E38)
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + r2
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r0)
            r7.append(r4)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
            goto L_0x018d
        L_0x015e:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r3 = 2131951826(0x7f1300d2, float:1.9540077E38)
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + r2
            int r5 = r5 + r6
            r7.<init>(r5)
            r7.append(r0)
            r7.append(r4)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
        L_0x018d:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r8)
            r4 = 2131951837(0x7f1300dd, float:1.95401E38)
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r3.setMessage(r0)
            gki r3 = new gki
            r3.<init>(r8)
            r4 = 2131951824(0x7f1300d0, float:1.9540073E38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r4, r3)
            gkh r3 = new gkh
            r3.<init>(r8)
            android.app.AlertDialog$Builder r0 = r0.setOnCancelListener(r3)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r2)
            android.app.AlertDialog r0 = r0.create()
            r8.a((android.app.AlertDialog) r0)
            goto L_0x01c5
        L_0x01be:
            r8.a()
            goto L_0x01c5
        L_0x01c2:
            r8.finish()
        L_0x01c5:
            if (r9 == 0) goto L_0x01d1
            java.lang.String r0 = "resolving_error"
            boolean r9 = r9.getBoolean(r0, r1)
            if (r9 == 0) goto L_0x01d1
            r1 = 1
            goto L_0x01d2
        L_0x01d1:
        L_0x01d2:
            r8.h = r1
            gaj r9 = defpackage.gac.a(r8)
            r8.p = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.setup.d2d.SourceChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        AlertDialog alertDialog = this.m;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.m.dismiss();
            this.m = null;
        }
        gka gka = this.s;
        if (gka != null) {
            try {
                gka.a();
            } catch (IOException e2) {
                a.a((Throwable) e2);
            }
        }
        gkr gkr = this.n;
        if (gkr != null) {
            gkr.a();
        }
        if (this.d) {
            this.c.disable();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        AsyncTask asyncTask = this.r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.r = null;
        }
        if (this.q != null) {
            a.a("Acquiring WakeLock", new Object[0]);
            this.q.b();
        }
        synchronized (this.i) {
            if (!this.j) {
                d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        synchronized (this.i) {
            this.j = false;
        }
        if (this.q != null) {
            a.a("Releasing WakeLock", new Object[0]);
            this.f = true;
            this.q.c();
            this.q = null;
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.h);
    }

    public static Object a(acwa acwa) {
        acws.a(acwa, u, TimeUnit.MILLISECONDS);
        return acwa.d();
    }

    private final void a(AlertDialog alertDialog) {
        AlertDialog alertDialog2 = this.m;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.m.dismiss();
        }
        this.m = alertDialog;
        alertDialog.getWindow().addFlags(128);
        this.m.show();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v12, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqdi a(defpackage.aqdm r23, defpackage.erk r24, defpackage.erl r25) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r3 = "201216073"
            int r4 = r2.a
            if (r4 != 0) goto L_0x03b9
            java.lang.String r4 = r2.b
            r6 = 0
            auay r7 = r2.d     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r7 = r7.k()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqed r8 = defpackage.aqed.g     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucd r8 = r8.o()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r1.e     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10 = 2
            r11 = 1
            if (r9 != 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 2
        L_0x0022:
            boolean r12 = r8.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r12 != 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            r8.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r8.c = r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x002c:
            aucj r12 = r8.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqed r12 = (defpackage.aqed) r12     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r12.d = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r9 = r12.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = r9 | 4
            r12.a = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r13 = r1.e     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = r9 | r11
            r12.a = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r12.b = r13     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r14 = r1.f     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = r9 | r10
            r12.a = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r12.c = r14     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r14 = -1
            if (r13 == 0) goto L_0x00f9
            hwz r9 = new hwz     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.<init>()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            jca r12 = defpackage.jca.a()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            android.content.Intent r13 = new android.content.Intent     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r13.<init>()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            java.lang.String r5 = "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"
            android.content.Intent r5 = r13.setClassName(r1, r5)     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r12.a(r1, r5, r9, r11)     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            android.os.IBinder r5 = r9.a()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            if (r5 == 0) goto L_0x007c
            java.lang.String r12 = "com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService"
            android.os.IInterface r12 = r5.queryLocalInterface(r12)     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            boolean r13 = r12 instanceof defpackage.gdu     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            if (r13 != 0) goto L_0x0077
            gds r12 = new gds     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r12.<init>(r5)     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            goto L_0x007d
        L_0x0077:
            r5 = r12
            gdu r5 = (defpackage.gdu) r5     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r12 = r5
            goto L_0x007d
        L_0x007c:
            r12 = 0
        L_0x007d:
            long r16 = r12.b()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            long r12 = r12.c()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r18 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0096
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            long r20 = r20 - r16
            long r20 = r20 / r18
            r10 = r20
            goto L_0x0097
        L_0x0096:
            r10 = r14
        L_0x0097:
            boolean r5 = r8.c     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            if (r5 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r8.c()     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r8.c = r6     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
        L_0x00a1:
            aucj r5 = r8.b     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            aqed r5 = (defpackage.aqed) r5     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            int r6 = r5.a     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r5.e = r10     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x00b4
            long r12 = r12 / r18
            goto L_0x00b5
        L_0x00b4:
            r12 = r14
        L_0x00b5:
            r6 = r6 | 16
            r5.a = r6     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            r5.f = r12     // Catch:{ InterruptedException -> 0x00c5, RemoteException -> 0x00c3 }
            jca r5 = defpackage.jca.a()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            goto L_0x00ed
        L_0x00c0:
            r0 = move-exception
            r2 = r0
            goto L_0x00f1
        L_0x00c3:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            r5 = r0
            java.lang.String r6 = "Could not get device signals. Setting to insecure."
            android.util.Log.w(r6, r5)     // Catch:{ all -> 0x00c0 }
            boolean r5 = r8.c     // Catch:{ all -> 0x00c0 }
            if (r5 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            r8.c()     // Catch:{ all -> 0x00c0 }
            r5 = 0
            r8.c = r5     // Catch:{ all -> 0x00c0 }
        L_0x00d7:
            aucj r5 = r8.b     // Catch:{ all -> 0x00c0 }
            aqed r5 = (defpackage.aqed) r5     // Catch:{ all -> 0x00c0 }
            int r6 = r5.a     // Catch:{ all -> 0x00c0 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ all -> 0x00c0 }
            r5.e = r14     // Catch:{ all -> 0x00c0 }
            r6 = r6 | 16
            r5.a = r6     // Catch:{ all -> 0x00c0 }
            r5.f = r14     // Catch:{ all -> 0x00c0 }
            jca r5 = defpackage.jca.a()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x00ed:
            r5.a((android.content.Context) r1, (android.content.ServiceConnection) r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            goto L_0x0105
        L_0x00f1:
            jca r3 = defpackage.jca.a()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r3.a((android.content.Context) r1, (android.content.ServiceConnection) r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            throw r2     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x00f9:
            r5 = r9 | 8
            r12.a = r5     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r12.e = r14     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5 = r5 | 16
            r12.a = r5     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r12.f = r14     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x0105:
            iwd r5 = a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r6 = 3
            boolean r5 = r5.a((int) r6)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r5 == 0) goto L_0x0150
            iwd r5 = a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r6 = r8.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqed r6 = (defpackage.aqed) r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            long r9 = r6.e     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r11 = 43
            r6.<init>(r11)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r11 = "lastUnlockDurationInS: "
            r6.append(r11)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r6.append(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5.b(r6, r10)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            iwd r5 = a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r6 = r8.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqed r6 = (defpackage.aqed) r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            long r9 = r6.f     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r11 = 48
            r6.<init>(r11)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r11 = "lockScreenSetupDurationInS: "
            r6.append(r11)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r6.append(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5.b(r6, r10)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x0150:
            aqdq r5 = defpackage.aqdq.i     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucd r6 = r5.o()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            long r9 = defpackage.jhg.a((android.content.Context) r22)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r5 = java.lang.Long.toHexString(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r6.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r9 != 0) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            r6.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            r6.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x0169:
            aucj r9 = r6.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqdq r9 = (defpackage.aqdq) r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r11 = 1
            r10 = r10 | r11
            r9.a = r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.b = r5     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r6.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r9 != 0) goto L_0x017f
            goto L_0x0185
        L_0x017f:
            r6.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            r6.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x0185:
            aucj r9 = r6.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqdq r9 = (defpackage.aqdq) r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10 = r10 | 4
            r9.a = r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.d = r5     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r9 = android.os.Build.DEVICE     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r5 = r6.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r5 != 0) goto L_0x019b
            goto L_0x01a1
        L_0x019b:
            r6.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5 = 0
            r6.c = r5     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x01a1:
            aucj r5 = r6.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10 = r5
            aqdq r10 = (defpackage.aqdq) r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r5 = r10.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r11 = 2
            r12 = r5 | 2
            r10.a = r12     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r3.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = r12 | 16
            r10.a = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10.f = r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r6.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r9 != 0) goto L_0x01c6
            goto L_0x01cc
        L_0x01c6:
            r6.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            r6.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x01cc:
            aucj r9 = r6.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqdq r9 = (defpackage.aqdq) r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r3.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10 = r10 | 8
            r9.a = r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.e = r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r3 = r8.i()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqed r3 = (defpackage.aqed) r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r3.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.h = r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r3 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r3 = r3 | 64
            r9.a = r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r3 = r6.i()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqdq r3 = (defpackage.aqdq) r3     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r3 = r3.k()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            org.json.JSONStringer r6 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r6.<init>()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            org.json.JSONStringer r6 = r6.object()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "typ"
            org.json.JSONStringer r6 = r6.key(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "navigator.id.getAssertion"
            org.json.JSONStringer r6 = r6.value(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "challenge"
            org.json.JSONStringer r6 = r6.key(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r7 = defpackage.jhy.d(r7)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            org.json.JSONStringer r6 = r6.value(r7)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r7 = "source_device_signals"
            org.json.JSONStringer r6 = r6.key(r7)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r3 = defpackage.jhy.d(r3)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            org.json.JSONStringer r3 = r6.value(r3)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            org.json.JSONStringer r3 = r3.endObject()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.nio.charset.Charset r6 = defpackage.amqn.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r3 = r3.getBytes(r6)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r6 = "SHA-256"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r6 = r6.digest(r3)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r7 = r24
            ert r7 = r7.a((java.lang.String) r4)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r7 != 0) goto L_0x0267
            iwd r7 = a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "Could not get secret for account: "
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r10 != 0) goto L_0x025b
            java.lang.String r9 = new java.lang.String     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            goto L_0x025f
        L_0x025b:
            java.lang.String r9 = r8.concat(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x025f:
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r7.e(r9, r10)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r7 = 0
            goto L_0x028e
        L_0x0267:
            r8 = r25
            java.lang.Long r7 = r8.a(r7)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r7 != 0) goto L_0x028e
            iwd r7 = a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "Could not get counter for account: "
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r10 != 0) goto L_0x0283
            java.lang.String r9 = new java.lang.String     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            goto L_0x0287
        L_0x0283:
            java.lang.String r9 = r8.concat(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x0287:
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r7.e(r9, r10)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r7 = 0
        L_0x028e:
            if (r7 == 0) goto L_0x03a1
            ausr r8 = defpackage.ausr.d     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucd r8 = r8.o()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            auay r6 = defpackage.auay.a((byte[]) r6)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r8.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r9 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            r8.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            r8.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x02a5:
            aucj r9 = r8.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            ausr r9 = (defpackage.ausr) r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r6.getClass()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r11 = 1
            r10 = r10 | r11
            r9.a = r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.b = r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            long r6 = r7.longValue()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r9 = r8.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r9 != 0) goto L_0x02bd
            goto L_0x02c3
        L_0x02bd:
            r8.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 0
            r8.c = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x02c3:
            aucj r9 = r8.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            ausr r9 = (defpackage.ausr) r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r10 = r9.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r5 = 2
            r10 = r10 | r5
            r9.a = r10     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9.c = r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            defpackage.ausr.a(r9)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r6 = r8.i()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            ausr r6 = (defpackage.ausr) r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            android.accounts.Account r7 = new android.accounts.Account     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r8 = "com.google"
            r7.<init>(r4, r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r4 = r6.k()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            auss r6 = defpackage.auss.d     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucd r6 = r6.o()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            boolean r8 = r6.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            if (r8 != 0) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            r6.c()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r8 = 0
            r6.c = r8     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
        L_0x02f4:
            aucj r8 = r6.b     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            auss r8 = (defpackage.auss) r8     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r9 = 11
            r8.b = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            int r9 = r8.a     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r10 = 1
            r9 = r9 | r10
            r8.a = r9     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            defpackage.auss.a(r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aucj r6 = r6.i()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            auss r6 = (defpackage.auss) r6     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r6 = r6.k()     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            com.google.android.gms.auth.cryptauth.Payload r8 = new com.google.android.gms.auth.cryptauth.Payload     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            r8.<init>(r6, r4)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            gaj r4 = r1.p     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.String r6 = "PublicKey"
            java.lang.String r9 = "authzen"
            acwa r4 = r4.a((java.lang.String) r6, (java.lang.String) r9, (android.accounts.Account) r7, (com.google.android.gms.auth.cryptauth.Payload) r8)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            java.lang.Object r4 = a((defpackage.acwa) r4)     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            com.google.android.gms.auth.cryptauth.SignCryptedBlob r4 = (com.google.android.gms.auth.cryptauth.SignCryptedBlob) r4     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            byte[] r4 = r4.c     // Catch:{ JSONException -> 0x03ab, NoSuchAlgorithmException -> 0x03a9, InterruptedException -> 0x03a7, ExecutionException -> 0x03a5, TimeoutException -> 0x03a3 }
            aqdi r6 = defpackage.aqdi.h
            aucd r6 = r6.o()
            java.lang.String r7 = r2.b
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x0333
            goto L_0x0339
        L_0x0333:
            r6.c()
            r8 = 0
            r6.c = r8
        L_0x0339:
            aucj r8 = r6.b
            aqdi r8 = (defpackage.aqdi) r8
            r7.getClass()
            int r9 = r8.a
            r10 = 1
            r9 = r9 | r10
            r8.a = r9
            r8.b = r7
            auay r7 = r2.d
            r7.getClass()
            r9 = r9 | 16
            r8.a = r9
            r8.f = r7
            auay r2 = r2.e
            r2.getClass()
            r7 = r9 | 8
            r8.a = r7
            r8.e = r2
            auay r2 = defpackage.auay.a((byte[]) r3)
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x0367
            goto L_0x036d
        L_0x0367:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x036d:
            aucj r3 = r6.b
            aqdi r3 = (defpackage.aqdi) r3
            r2.getClass()
            int r7 = r3.a
            r5 = 2
            r5 = r5 | r7
            r3.a = r5
            r3.c = r2
            auay r2 = defpackage.auay.a((byte[]) r4)
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x0385
            goto L_0x038b
        L_0x0385:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x038b:
            aucj r3 = r6.b
            aqdi r3 = (defpackage.aqdi) r3
            r2.getClass()
            int r4 = r3.a
            r4 = r4 | 4
            r3.a = r4
            r3.d = r2
            aucj r2 = r6.i()
            aqdi r2 = (defpackage.aqdi) r2
            return r2
        L_0x03a1:
            r2 = 0
            return r2
        L_0x03a3:
            r0 = move-exception
            goto L_0x03ac
        L_0x03a5:
            r0 = move-exception
            goto L_0x03ac
        L_0x03a7:
            r0 = move-exception
            goto L_0x03ac
        L_0x03a9:
            r0 = move-exception
            goto L_0x03ac
        L_0x03ab:
            r0 = move-exception
        L_0x03ac:
            r2 = r0
            iwd r3 = a
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Unexpected error."
            r3.e(r5, r2, r4)
            r2 = 0
            return r2
        L_0x03b9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.setup.d2d.SourceChimeraActivity.a(aqdm, erk, erl):aqdi");
    }

    public final void a() {
        String string = getString(R.string.auth_d2d_source_copy_notice);
        if (!this.e) {
            if (this.c.isEnabled()) {
                String valueOf = String.valueOf(string);
                String string2 = getString(R.string.auth_d2d_source_no_lock_bt_on_notice);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string2).length());
                sb.append(valueOf);
                sb.append(" ");
                sb.append(string2);
                string = sb.toString();
            } else {
                String valueOf2 = String.valueOf(string);
                String string3 = getString(R.string.auth_d2d_source_no_lock_bt_off_notice);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(string3).length());
                sb2.append(valueOf2);
                sb2.append(" ");
                sb2.append(string3);
                string = sb2.toString();
            }
        }
        if (this.f && !this.c.isEnabled()) {
            b();
        }
        a(new AlertDialog.Builder(this).setTitle(R.string.auth_d2d_tap_and_go).setMessage(string).setCancelable(false).setPositiveButton(17039370, new gkg(this)).setNegativeButton(17039360, new gkf()).setOnCancelListener(new gke(this)).create());
    }

    public final void a(int i2) {
        d();
        runOnUiThread(new gkd(this, i2));
    }

    public final void a(ConnectionResult connectionResult) {
        if (!this.h) {
            int i2 = Build.VERSION.SDK_INT;
            this.h = true;
            int i3 = connectionResult.c;
            gkl gkl = new gkl();
            Bundle bundle = new Bundle();
            bundle.putInt("error_dialog_code", i3);
            gkl.setArguments(bundle);
            gkl.show(getContainerActivity().getFragmentManager(), "error_dialog");
        }
    }
}
