package com.google.android.gms.update.pano.legacy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraOtaPanoSetupActivity extends adhy implements adqm {
    public static final iwd a = adnt.i("ChimeraOtaPanoSetupActivity");
    static volatile boolean o = false;
    public final Object b = new Object();
    public boolean c = false;
    public final Object d = new Object();
    public boolean e = false;
    public adqh f;
    adqp g;
    adqo h;
    adqn i;
    public adqi j;
    public int k = 0;
    public Handler l;
    public long m;
    public long n;
    private boolean p = false;
    private int q = -1;
    private long r;
    private adjg s;
    private Handler t;
    private String u = null;
    private boolean v = false;
    private final BroadcastReceiver w = new nla("ota") {
        public final void a(Context context, Intent intent) {
            ChimeraOtaPanoSetupActivity chimeraOtaPanoSetupActivity = ChimeraOtaPanoSetupActivity.this;
            iwd iwd = ChimeraOtaPanoSetupActivity.a;
            if (chimeraOtaPanoSetupActivity.m > 0 || System.currentTimeMillis() - ChimeraOtaPanoSetupActivity.this.n < 1000) {
                ChimeraOtaPanoSetupActivity.a.b("screen turned off during countdown; installing immediately", new Object[0]);
                ChimeraOtaPanoSetupActivity.this.b();
            }
        }
    };
    private final BroadcastReceiver x = new nla("ota") {
        public final void a(Context context, Intent intent) {
            ChimeraOtaPanoSetupActivity.a.b("Received a status changed notification, refreshing.", new Object[0]);
            ChimeraOtaPanoSetupActivity.this.e();
        }
    };
    private final Runnable y = new adpv(this);
    private final Runnable z = new adpw(this);

    private final void a(int i2) {
        int i3 = this.k;
        if (i3 != i2) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(56);
            sb.append("About to replace fragment: ");
            sb.append(i3);
            sb.append(" with: ");
            sb.append(i2);
            iwd.b(sb.toString(), new Object[0]);
            f();
            this.k = i2;
            if (i2 == 1) {
                iwd iwd2 = adqo.a;
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("newInstance(). countdownTotalSeconds = 10");
                iwd2.b(sb2.toString(), new Object[0]);
                adqo adqo = new adqo();
                Bundle bundle = new Bundle();
                bundle.putInt("countdown_total_seconds", 10);
                adqo.setArguments(bundle);
                this.h = adqo;
                a((Fragment) adqo);
            } else if (i2 == 2) {
                adqh adqh = new adqh();
                this.f = adqh;
                a((Fragment) adqh);
            } else if (i2 == 3) {
                adqp adqp = new adqp();
                this.g = adqp;
                a((Fragment) adqp);
            } else if (i2 != 4) {
                adqi adqi = new adqi();
                this.j = adqi;
                a((Fragment) adqi);
            } else {
                adqn adqn = new adqn();
                this.i = adqn;
                a((Fragment) adqn);
            }
        } else {
            iwd iwd3 = a;
            StringBuilder sb3 = new StringBuilder(54);
            sb3.append("Already showing: ");
            sb3.append(i2);
            sb3.append(". Skipping showFragment().");
            iwd3.b(sb3.toString(), new Object[0]);
        }
    }

    private final void f() {
        a.b("resetting UI.", new Object[0]);
        if (this.k != 0) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            int i2 = this.k;
            if (i2 == 1) {
                adqo adqo = this.h;
                if (adqo != null) {
                    beginTransaction.remove(adqo);
                }
                this.h = null;
            } else if (i2 == 2) {
                adqh adqh = this.f;
                if (adqh != null) {
                    beginTransaction.remove(adqh);
                }
                this.f = null;
            } else if (i2 == 3) {
                adqp adqp = this.g;
                if (adqp != null) {
                    beginTransaction.remove(adqp);
                }
                this.g = null;
            } else if (i2 == 4) {
                adqn adqn = this.i;
                if (adqn != null) {
                    beginTransaction.remove(adqn);
                }
                this.i = null;
            } else if (i2 != 5) {
                a.d("mFragmentShowing is unrecognized in resetUi().", new Object[0]);
            } else {
                adqi adqi = this.j;
                if (adqi != null) {
                    beginTransaction.remove(adqi);
                }
                this.j = null;
            }
            beginTransaction.commitAllowingStateLoss();
            this.k = 0;
        }
    }

    private final void g() {
        a(this.m, true);
    }

    private final void h() {
        if (this.m > 0) {
            this.m = 0;
            this.n = System.currentTimeMillis();
        }
        this.u = null;
    }

    private final void i() {
        a(2);
        adjn.a(this);
        try {
            adjk.m();
        } catch (RemoteException e2) {
            a.d("Not connected to service; cannot approve download.", new Object[0]);
        }
    }

    private final void j() {
        a.b("Stop polling progress.", new Object[0]);
        this.l.removeCallbacks(this.y);
        this.l.removeCallbacks(this.z);
        synchronized (this.b) {
            this.c = false;
        }
        synchronized (this.d) {
            this.e = false;
        }
    }

    private final adjg k() {
        adjg adjg = this.s;
        if (adjg != null) {
            return adjg;
        }
        adjg a2 = adiq.a(this);
        this.s = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ RemoteException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            defpackage.adjn.a(r4)
            r0 = 0
            int r1 = r4.q     // Catch:{ RemoteException -> 0x0039 }
            r2 = 528(0x210, float:7.4E-43)
            r3 = 1
            if (r1 != r2) goto L_0x000c
            goto L_0x0018
        L_0x000c:
            r2 = 272(0x110, float:3.81E-43)
            if (r1 == r2) goto L_0x0018
            r2 = 1296(0x510, float:1.816E-42)
            if (r1 == r2) goto L_0x0018
            defpackage.adjk.b((boolean) r3)     // Catch:{ RemoteException -> 0x0039 }
            goto L_0x0024
        L_0x0018:
            adjg r1 = r4.k()     // Catch:{ RemoteException -> 0x0039 }
            com.google.android.gms.update.InstallationOptions r2 = new com.google.android.gms.update.InstallationOptions     // Catch:{ RemoteException -> 0x0039 }
            r2.<init>(r3, r3, r3, r0)     // Catch:{ RemoteException -> 0x0039 }
            r1.a((com.google.android.gms.update.InstallationOptions) r2)     // Catch:{ RemoteException -> 0x0039 }
        L_0x0024:
            r4.v = r3     // Catch:{ RemoteException -> 0x0039 }
            int r1 = r4.k     // Catch:{ RemoteException -> 0x0039 }
            if (r1 != r3) goto L_0x0038
            adqo r1 = r4.h     // Catch:{ RemoteException -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            android.widget.TextView r1 = r1.b     // Catch:{ RemoteException -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            r2 = 2131954159(0x7f1309ef, float:1.954481E38)
            r1.setText(r2)     // Catch:{ RemoteException -> 0x0039 }
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            iwd r1 = a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Not connected to service; cannot approve install."
            r1.d(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.b():void");
    }

    public final void c() {
        if (this.k == 4) {
            i();
        }
    }

    public final void d() {
        if (this.k != 4) {
            return;
        }
        if (jkr.g()) {
            setResult(0, new Intent().putExtra("network_error_occurred", true));
            finish();
            return;
        }
        Intent intent = new Intent("com.android.net.wifi.CANVAS_SETUP_WIFI_NETWORK");
        intent.putExtra("firstRun", true);
        intent.putExtra("extra_prefs_show_button_bar", true);
        intent.putExtra("extra_show_summary", false);
        startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        int i2;
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(19);
        sb.append("refreshStatus true");
        iwd.b(sb.toString(), new Object[0]);
        if (!isFinishing()) {
            if (!adjk.a()) {
                a.b("SystemUpdateClient not connected, reconnecting", new Object[0]);
                adjk.a((Context) this);
            }
            try {
                i2 = adjk.d();
            } catch (RemoteException e2) {
                iwd iwd2 = a;
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb2.append("Not connected to service; unable to get status.");
                sb2.append(valueOf);
                iwd2.d(sb2.toString(), new Object[0]);
                i2 = -1;
            }
            if (i2 == -1) {
                if (this.q != -1) {
                    a.d("Not refreshing status, as the current status is unknown.", new Object[0]);
                    i2 = this.q;
                } else {
                    a.d("Status unavailable...... and no known last status.", new Object[0]);
                }
            }
            a.d("About to call refreshOnLastCheckinSuccessTime()", new Object[0]);
            adhx adhx = new adhx(i2);
            synchronized (adjk.j) {
                adjk.h = adhx.a;
                adjk.i = true;
                if (adjk.g != null) {
                    if (adjk.g.getStatus() != AsyncTask.Status.FINISHED) {
                        Log.i("SystemUpdateClient", "Another refreshOnLastCheckinSuccessTime in progress.");
                        return;
                    }
                }
                adjk.g = new adjj(this);
                adjk.g.execute(new Void[0]);
            }
        }
    }

    public final void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        a.b("onCreate", new Object[0]);
        setTheme(R.style.SystemUpdatePanoSetupTheme);
        setContentView((int) R.layout.system_update_fragment_container_activity);
        a.b("Attempting to connect to the ChimeraSystemUpdateService.", new Object[0]);
        adjk.a(this, "onCreate(...)");
        this.t = new qvr();
        this.l = new qvr();
        registerReceiver(this.w, new IntentFilter("android.intent.action.SCREEN_OFF"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.update.STATUS_CHANGED");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        registerReceiver(this.x, intentFilter);
        if (bundle != null) {
            this.m = bundle.getLong("countdown_end", 0);
            this.n = 0;
            str = bundle.getString("countdown_url");
        } else {
            this.m = 0;
            this.n = 0;
            str = null;
        }
        this.u = str;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (wkg.a().b() <= 0) {
            unregisterReceiver(this.w);
            unregisterReceiver(this.x);
            adjk.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("countdown_end", this.m);
        bundle.putString("countdown_url", this.u);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        a.b("onStart", new Object[0]);
        adjk.b(this, adjk.l, "onStart(...)");
        e();
        if (this.m > 0) {
            g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        h();
        adjk.a(false);
        j();
        adjk.f();
        adjn.a(this);
    }

    private final void a(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.content, fragment).commitAllowingStateLoss();
    }

    public final void a() {
        if (!adjk.a()) {
            a.b("SystemUpdateClient not connected, reconnecting", new Object[0]);
            adjk.a((Context) this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        a(5);
        r9 = r7.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r9 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r0 = getText(com.google.android.gms.R.string.system_update_install_steps_text);
        r2 = new java.lang.CharSequence[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        if (r8 == 273) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        r8 = "2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        r8 = "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ce, code lost:
        r2[0] = r8;
        r8 = android.text.TextUtils.expandTemplate(r0, r2).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        if (r9.a == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        if (defpackage.amrk.a(r8) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e2, code lost:
        r9.a.setText(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        r8 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        if (r7.e != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r7.e = true;
        r7.l.postDelayed(r7.z, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        j();
        r8 = r7.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
        if (r8 <= 0) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        a(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010e, code lost:
        a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0116, code lost:
        if (r7.m <= 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0118, code lost:
        a.b("skipping, as a countdown is already in progress.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
        defpackage.adjk.c(r7);
        r7.m = java.lang.System.currentTimeMillis() + 9999;
        r7.u = defpackage.adjk.j();
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013d, code lost:
        a(2);
        r8 = r7.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0143, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0146, code lost:
        if (r7.c != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0148, code lost:
        r7.c = true;
        r7.l.postDelayed(r7.y, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0151, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0152, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0156, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0159, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, boolean r9, long r10) {
        /*
            r7 = this;
            iwd r0 = a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r2[r4] = r3
            java.lang.String r5 = "0x%03X"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 44
            r6.<init>(r5)
            java.lang.String r5 = "status="
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = " lastCheckinTime="
            r6.append(r2)
            r6.append(r10)
            java.lang.String r2 = r6.toString()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r0.b(r2, r5)
            if (r9 == 0) goto L_0x003d
            goto L_0x0048
        L_0x003d:
            int r9 = r7.q
            if (r8 != r9) goto L_0x0048
            long r5 = r7.r
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0048
            return
        L_0x0048:
            r7.q = r8
            r7.r = r10
            r9 = 5
            if (r8 == r9) goto L_0x0050
            goto L_0x005e
        L_0x0050:
            boolean r10 = r7.v
            if (r10 == 0) goto L_0x005e
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "skipping refresh; about to reboot"
            r8.a(r10, r9)
            return
        L_0x005e:
            r10 = 262(0x106, float:3.67E-43)
            if (r8 == r10) goto L_0x01a2
            r10 = 263(0x107, float:3.69E-43)
            if (r8 == r10) goto L_0x0186
            r10 = 518(0x206, float:7.26E-43)
            if (r8 == r10) goto L_0x01a2
            r10 = 519(0x207, float:7.27E-43)
            if (r8 == r10) goto L_0x0186
            r10 = 774(0x306, float:1.085E-42)
            if (r8 == r10) goto L_0x0186
            r10 = 775(0x307, float:1.086E-42)
            if (r8 == r10) goto L_0x0186
            r10 = 1042(0x412, float:1.46E-42)
            if (r8 == r10) goto L_0x0182
            r10 = 1043(0x413, float:1.462E-42)
            if (r8 == r10) goto L_0x0175
            r10 = 0
            switch(r8) {
                case -1: goto L_0x0171;
                case 0: goto L_0x015a;
                case 1: goto L_0x0156;
                case 2: goto L_0x013d;
                case 3: goto L_0x0138;
                case 4: goto L_0x0101;
                case 5: goto L_0x015a;
                case 6: goto L_0x01a2;
                case 7: goto L_0x0186;
                default: goto L_0x0083;
            }
        L_0x0083:
            switch(r8) {
                case 9: goto L_0x01a2;
                case 11: goto L_0x013d;
                case 15: goto L_0x0100;
                case 267: goto L_0x013d;
                case 523: goto L_0x013d;
                case 779: goto L_0x013d;
                case 784: goto L_0x00fc;
                case 786: goto L_0x0182;
                case 1031: goto L_0x0186;
                case 1035: goto L_0x013d;
                case 1040: goto L_0x01a2;
                case 1291: goto L_0x013d;
                case 1296: goto L_0x0101;
                case 1298: goto L_0x0182;
                case 1803: goto L_0x0156;
                case 2059: goto L_0x013d;
                case 2315: goto L_0x013d;
                case 2571: goto L_0x0156;
                default: goto L_0x0086;
            }
        L_0x0086:
            switch(r8) {
                case 272: goto L_0x0101;
                case 273: goto L_0x00b4;
                case 274: goto L_0x0182;
                case 275: goto L_0x0175;
                default: goto L_0x0089;
            }
        L_0x0089:
            switch(r8) {
                case 528: goto L_0x0101;
                case 529: goto L_0x00b4;
                case 530: goto L_0x0182;
                case 531: goto L_0x0175;
                default: goto L_0x008c;
            }
        L_0x008c:
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r9[r4] = r3
            java.lang.String r10 = "0x%03X"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Unknown status: "
            int r11 = r9.length()
            if (r11 != 0) goto L_0x00aa
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r9 = r10.concat(r9)
        L_0x00ae:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r8.e(r9, r10)
            return
        L_0x00b4:
            r7.a((int) r9)
            adqi r9 = r7.j
            if (r9 == 0) goto L_0x00e7
            r0 = 2131954195(0x7f130a13, float:1.9544882E38)
            java.lang.CharSequence r0 = r7.getText(r0)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r1]
            r3 = 273(0x111, float:3.83E-43)
            if (r8 == r3) goto L_0x00cc
            java.lang.String r8 = "2"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r8 = "1"
        L_0x00ce:
            r2[r4] = r8
            java.lang.CharSequence r8 = android.text.TextUtils.expandTemplate(r0, r2)
            java.lang.String r8 = r8.toString()
            android.widget.TextView r0 = r9.a
            if (r0 == 0) goto L_0x00e7
            boolean r0 = defpackage.amrk.a((java.lang.String) r8)
            if (r0 != 0) goto L_0x00e7
            android.widget.TextView r9 = r9.a
            r9.setText(r8)
        L_0x00e7:
            java.lang.Object r8 = r7.d
            monitor-enter(r8)
            boolean r9 = r7.e     // Catch:{ all -> 0x00f9 }
            if (r9 != 0) goto L_0x00f7
            r7.e = r1     // Catch:{ all -> 0x00f9 }
            android.os.Handler r9 = r7.l     // Catch:{ all -> 0x00f9 }
            java.lang.Runnable r0 = r7.z     // Catch:{ all -> 0x00f9 }
            r9.postDelayed(r0, r10)     // Catch:{ all -> 0x00f9 }
        L_0x00f7:
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            return
        L_0x00f9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            throw r9
        L_0x00fc:
            r7.j()
            return
        L_0x0100:
            return
        L_0x0101:
            r7.j()
            long r8 = r7.m
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            r7.a(r8, r4)
            return
        L_0x010e:
            r7.a((int) r1)
            long r8 = r7.m
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0122
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "skipping, as a countdown is already in progress."
            r8.b(r10, r9)
            return
        L_0x0122:
            defpackage.adjk.c(r7)
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 9999(0x270f, double:4.94E-320)
            long r8 = r8 + r10
            r7.m = r8
            java.lang.String r8 = defpackage.adjk.j()
            r7.u = r8
            r7.g()
            return
        L_0x0138:
            r8 = 3
            r7.a((int) r8)
            return
        L_0x013d:
            r8 = 2
            r7.a((int) r8)
            java.lang.Object r8 = r7.b
            monitor-enter(r8)
            boolean r9 = r7.c     // Catch:{ all -> 0x0153 }
            if (r9 != 0) goto L_0x0151
            r7.c = r1     // Catch:{ all -> 0x0153 }
            android.os.Handler r9 = r7.l     // Catch:{ all -> 0x0153 }
            java.lang.Runnable r0 = r7.y     // Catch:{ all -> 0x0153 }
            r9.postDelayed(r0, r10)     // Catch:{ all -> 0x0153 }
        L_0x0151:
            monitor-exit(r8)     // Catch:{ all -> 0x0153 }
            return
        L_0x0153:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0153 }
            throw r9
        L_0x0156:
            r7.i()
            return
        L_0x015a:
            r7.f()
            boolean r8 = r7.p
            if (r8 != 0) goto L_0x016e
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "No update or update installed. Finishing."
            r8.d(r10, r9)
            r7.finish()
            return
        L_0x016e:
            r7.p = r4
            return
        L_0x0171:
            r7.f()
            return
        L_0x0175:
            adjg r8 = r7.k()
            com.google.android.gms.update.InstallationOptions r9 = new com.google.android.gms.update.InstallationOptions
            r9.<init>(r1, r1, r1, r4)
            r8.b((com.google.android.gms.update.InstallationOptions) r9)
            return
        L_0x0182:
            r7.finish()
            return
        L_0x0186:
            iwd r8 = a
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "Error occurred. Resetting update."
            r8.d(r10, r9)
            r7.p = r1
            r8 = 2131954242(0x7f130a42, float:1.9544978E38)
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)
            r8.show()
            defpackage.adjk.l()
            r7.i()
            return
        L_0x01a2:
            r8 = 4
            r7.a((int) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.a(int, boolean, long):void");
    }

    public final void a(long j2, boolean z2) {
        if (j2 == this.m) {
            a.b("updateCountdownMessage", new Object[0]);
            String j3 = adjk.j();
            if (j3 == null || !j3.equals(this.u)) {
                a.d("URL changed during countdown; aborting", new Object[0]);
                h();
                e();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.m;
            if (currentTimeMillis < j4) {
                int i2 = ((int) ((j4 - currentTimeMillis) / 1000)) + 1;
                adqo adqo = this.h;
                if (adqo != null) {
                    adqo.a(i2);
                }
                int i3 = (int) ((this.m - ((long) ((i2 - 1) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))) - currentTimeMillis);
                if (z2) {
                    this.t.postDelayed(new adpx(this, j2), (long) i3);
                    return;
                }
                return;
            }
            b();
        }
    }
}
