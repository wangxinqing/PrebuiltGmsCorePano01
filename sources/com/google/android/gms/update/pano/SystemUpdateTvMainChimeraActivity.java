package com.google.android.gms.update.pano;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemUpdateTvMainChimeraActivity extends Activity implements LoaderManager.LoaderCallbacks, adpq, acvv, adoj, ador {
    public static final iwd a = adnt.i("SystemUpdateTvMainChimeraActivity");
    private static final anax d = anax.a(3, 4, 8, 14, 5, 6, 19);
    private static final long e = TimeUnit.SECONDS.toMillis(2);
    private static final long f = TimeUnit.MINUTES.toMillis(1);
    public SystemUpdateStatus b;
    public boolean c;
    private adjg g;
    private adoq h = ados.a;
    private SystemUpdateStatus i;
    private adol j;
    private boolean k;
    private long l = 0;
    private CountDownTimer m;
    private int n;
    private final adik o = new adik(this);

    private final void a(int i2) {
        if (d.contains(Integer.valueOf(i2))) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            adol adol = this.j;
            iva.a("enqueue() is supposed to run in the main thread.");
            adol.b.add(obtain);
            if (SystemClock.uptimeMillis() > adol.d) {
                adol.a.a("Enqueued and flushing.", new Object[0]);
                adol.a();
            } else if (!adol.c.hasMessages(1)) {
                adol.a.a("Enqueued in waiting queue.", new Object[0]);
                Handler handler = adol.c;
                handler.sendMessageAtTime(Message.obtain(handler, 1), adol.d);
            }
        } else {
            this.h.a(i2, this);
        }
    }

    private final boolean r() {
        return getIntent() != null && getIntent().getBooleanExtra("support_user_back", false);
    }

    public final void b() {
        a(14);
    }

    public final adjg c() {
        adjg adjg = this.g;
        if (adjg != null) {
            return adjg;
        }
        adjg a2 = adiq.a(this);
        this.g = a2;
        return a2;
    }

    public final amri d() {
        return amri.c((adpo) getSupportFragmentManager().findFragmentByTag("layout_fragment"));
    }

    public final amri e() {
        return amri.c(this.i);
    }

    public final amri f() {
        return amri.c(this.b);
    }

    public final long g() {
        return this.l;
    }

    public final void h() {
        getSupportLoaderManager().restartLoader(1, new Bundle(), this);
    }

    public final void i() {
        getSupportLoaderManager().restartLoader(2, new Bundle(), this);
    }

    public final boolean j() {
        return getSupportLoaderManager().getLoader(2) != null;
    }

    public final void k() {
        c().a(new ConfigUpdateOptions(true));
    }

    public final boolean l() {
        return getIntent().getBooleanExtra("firstRun", false) && !TextUtils.isEmpty((CharSequence) adke.g.a());
    }

    public final void m() {
        startActivity(new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE"));
    }

    public final void n() {
        int i2;
        if (!l() || !r()) {
            Intent intent = new Intent("com.android.net.wifi.CANVAS_SETUP_WIFI_NETWORK");
            intent.putExtra("firstRun", true);
            intent.putExtra("extra_prefs_show_button_bar", true);
            intent.putExtra("extra_show_summary", 0);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent();
        Intent putExtra = intent2.putExtra("network_error_occurred", true);
        if (f().a()) {
            i2 = ((SystemUpdateStatus) f().b()).c;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        putExtra.putExtra("status_when_finishing", i2).putExtra("verbose_finish_reason", "try to resolve network");
        setResult(0, intent2);
        if (!isFinishing()) {
            finish();
        }
    }

    public final void o() {
        Object obj;
        iwd iwd = a;
        if (f().a()) {
            obj = Integer.valueOf(((SystemUpdateStatus) f().b()).c);
        } else {
            obj = "null";
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Severe error. Current status = ");
        sb.append(valueOf);
        iwd.d(sb.toString(), new Object[0]);
        this.n++;
        if (l() && this.n >= 2) {
            p();
        }
    }

    public final void onBackPressed() {
        if (!l() || r()) {
            Intent intent = new Intent();
            intent.putExtra("user_initiated", true).putExtra("verbose_finish_reason", "user pressed back");
            if (f().a()) {
                intent.putExtra("status_when_finishing", ((SystemUpdateStatus) f().b()).c);
                if (((SystemUpdateStatus) f().b()).c == 262) {
                    intent.putExtra("network_error_occurred", true);
                }
            } else {
                intent.putExtra("status_when_finishing", Integer.MIN_VALUE);
            }
            setResult(0, intent);
            a.d("onBackPressed. Finishing.", new Object[0]);
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        a.d("Consuming onBackPressed during Setup OTA. BACK is not supported.", new Object[0]);
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        int i3;
        super.onCreate(bundle);
        iwd iwd = a;
        boolean l2 = l();
        StringBuilder sb = new StringBuilder(30);
        sb.append("onCreate isSetupWraith = ");
        sb.append(l2);
        iwd.a(sb.toString(), new Object[0]);
        if (!aypd.b()) {
            a.d("Falling back to legacy flow.", new Object[0]);
            startActivity(new Intent().setClassName(this, !l() ? "com.google.android.gms.update.LegacySystemUpdatePanoActivity" : "com.google.android.gms.update.LegacyOtaPanoSetupActivity").addFlags(65536).addFlags(33554432).putExtras(getIntent()));
            this.k = true;
            finish();
        }
        if (!l()) {
            i2 = R.style.SystemUpdateTvSettingsMainTheme;
        } else {
            i2 = R.style.SystemUpdateTvSetupMainTheme;
        }
        setTheme(i2);
        setContentView((int) R.layout.system_update_fragment_container_activity);
        if (!l()) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.content, adpp.a(i3), "layout_fragment").commitNowAllowingStateLoss();
        if (getSupportLoaderManager().getLoader(1) != null) {
            getSupportLoaderManager().initLoader(1, new Bundle(), this);
        }
        if (j() || !l()) {
            getSupportLoaderManager().initLoader(2, new Bundle(), this);
        }
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        if (i2 == 1) {
            return new adrp(getApplicationContext());
        }
        if (i2 == 2) {
            return new adrq(getApplicationContext());
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Long l2 = (Long) obj;
        if (l2 == null) {
            a.d("onLoadFinished() lastConfigUpdateTime is null.", new Object[0]);
            return;
        }
        if (l2.longValue() >= 0) {
            this.l = l2.longValue();
        }
        if (loader.getId() == 1) {
            a(5);
            getLoaderManager().destroyLoader(1);
        } else if (loader.getId() == 2) {
            if (l2.longValue() >= 0) {
                a(6);
            } else {
                a(19);
            }
            getLoaderManager().destroyLoader(2);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        if (!this.k) {
            a(2);
            c().a((adil) this.o);
            CountDownTimer countDownTimer = this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.m = null;
            }
            c().a(new ActivityStatus(false, l()));
        }
        a.a("onPause", new Object[0]);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        a.a("onResume", new Object[0]);
        if (l() || adke.a(this)) {
            if (d().a()) {
                ((adpo) d().b()).a();
            }
            this.c = false;
            this.j = new adol(SystemClock.uptimeMillis() + e, this);
            this.i = null;
            this.b = null;
            c().a(new ActivityStatus(true, l()));
            c().b((adil) this.o);
            c().a().a((acvv) this);
            adon adon = new adon(this, f);
            this.m = adon;
            adon.start();
            a(1);
            return;
        }
        a.d("Attempting to manage OTA on non-owner profile. Finish.", new Object[0]);
        Toast.makeText(this, R.string.system_update_not_owner_text, 1).show();
        Intent intent = new Intent();
        intent.putExtra("unrecoverable_finish", true).putExtra("verbose_finish_reason", "non-owner profile");
        setResult(0, intent);
        finish();
    }

    public final void p() {
        int i2;
        a.d("Bailing out.", new Object[0]);
        Intent intent = new Intent();
        Intent putExtra = intent.putExtra("unrecoverable_finish", true);
        if (f().a()) {
            i2 = ((SystemUpdateStatus) f().b()).c;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        putExtra.putExtra("status_when_finishing", i2).putExtra("verbose_finish_reason", "unrecoverable status");
        setResult(0, intent);
        if (!isFinishing()) {
            finish();
        }
    }

    public final void q() {
    }

    public final void a() {
        a(8);
    }

    public final void a(amzy amzy) {
        ArrayList arrayList = new ArrayList(amzy);
        if (anbs.b((Iterable) arrayList, adom.a)) {
            this.h.a(3, this);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Message message = (Message) arrayList.get(i2);
            if (message.what != 3) {
                this.h.a(message.what, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r1 = new defpackage.adot();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        r1 = new defpackage.adpa();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0177, code lost:
        r1 = new defpackage.adpc();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.update.SystemUpdateStatus r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "refreshStatus() is supposed to run in the main thread."
            defpackage.iva.a((java.lang.String) r2)
            amri r2 = r16.d()
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x01a9
            amri r2 = r16.f()
            boolean r2 = r2.a()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0020
            goto L_0x0069
        L_0x0020:
            amri r2 = r16.f()
            java.lang.Object r2 = r2.b()
            com.google.android.gms.update.SystemUpdateStatus r2 = (com.google.android.gms.update.SystemUpdateStatus) r2
            int r2 = r2.c
            int r5 = r1.c
            if (r2 != r5) goto L_0x0069
            amri r2 = r16.f()
            java.lang.Object r2 = r2.b()
            com.google.android.gms.update.SystemUpdateStatus r2 = (com.google.android.gms.update.SystemUpdateStatus) r2
            double r5 = r2.f
            double r7 = r1.f
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            iwd r2 = a
            java.lang.Object[] r4 = new java.lang.Object[r4]
            double r5 = r1.f
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r4[r3] = r5
            java.lang.String r3 = "Progress update: progress = %f."
            r2.c(r3, r4)
            amri r2 = r16.f()
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            com.google.android.gms.update.SystemUpdateStatus r2 = r0.b
            r0.i = r2
        L_0x0062:
            r0.b = r1
            r1 = 4
            r0.a((int) r1)
        L_0x0068:
            return
        L_0x0069:
            iwd r2 = a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r6 = r1.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "Status change: status = 0x%03X."
            r2.c(r6, r5)
            adoq r2 = r0.h
            r5 = -3
            r2.a(r5, r0)
            amri r2 = r16.f()
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            com.google.android.gms.update.SystemUpdateStatus r2 = r0.b
            r0.i = r2
        L_0x008f:
            r0.b = r1
            boolean r2 = r16.l()
            java.lang.String r5 = "Unable to create OtaUiController for status: 0x%03X"
            r7 = 1042(0x412, float:1.46E-42)
            r8 = 787(0x313, float:1.103E-42)
            r9 = 786(0x312, float:1.101E-42)
            r10 = 775(0x307, float:1.086E-42)
            r11 = 774(0x306, float:1.085E-42)
            r12 = 519(0x207, float:7.27E-43)
            r13 = 518(0x206, float:7.26E-43)
            r14 = 263(0x107, float:3.69E-43)
            r15 = 262(0x106, float:3.67E-43)
            r3 = 2
            r4 = -1
            r6 = 3
            if (r2 != 0) goto L_0x012e
            int r1 = r1.c
            if (r1 == r4) goto L_0x012a
            if (r1 == 0) goto L_0x0123
            if (r1 == r3) goto L_0x011c
            if (r1 == r6) goto L_0x0115
            if (r1 == r15) goto L_0x010e
            if (r1 == r14) goto L_0x0107
            if (r1 == r13) goto L_0x010e
            if (r1 == r12) goto L_0x0107
            if (r1 == r11) goto L_0x010e
            if (r1 == r10) goto L_0x0107
            if (r1 == r9) goto L_0x0107
            if (r1 == r8) goto L_0x0100
            if (r1 == r7) goto L_0x0107
            r2 = 1043(0x413, float:1.462E-42)
            if (r1 == r2) goto L_0x0100
            switch(r1) {
                case 5: goto L_0x0123;
                case 15: goto L_0x0115;
                case 267: goto L_0x010e;
                case 272: goto L_0x00f9;
                case 273: goto L_0x00f2;
                case 274: goto L_0x0107;
                case 275: goto L_0x00eb;
                case 278: goto L_0x0107;
                case 779: goto L_0x00eb;
                case 784: goto L_0x012a;
                case 1031: goto L_0x0107;
                case 1035: goto L_0x00eb;
                case 1040: goto L_0x00eb;
                case 1291: goto L_0x00eb;
                case 1296: goto L_0x00f9;
                case 1298: goto L_0x0107;
                case 1547: goto L_0x010e;
                case 1555: goto L_0x012a;
                case 1803: goto L_0x010e;
                case 1811: goto L_0x012a;
                case 2059: goto L_0x010e;
                case 2067: goto L_0x012a;
                case 2315: goto L_0x00eb;
                case 2323: goto L_0x012a;
                case 2571: goto L_0x00eb;
                case 2579: goto L_0x012a;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            switch(r1) {
                case 22: goto L_0x0107;
                case 23: goto L_0x0115;
                case 24: goto L_0x012a;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            switch(r1) {
                case 528: goto L_0x00f9;
                case 529: goto L_0x00f2;
                case 530: goto L_0x0107;
                case 531: goto L_0x0100;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = java.lang.String.format(r5, r3)
            r2.<init>(r1)
            throw r2
        L_0x00eb:
            adox r1 = new adox
            r1.<init>()
            goto L_0x01a3
        L_0x00f2:
            adot r1 = new adot
            r1.<init>()
            goto L_0x01a3
        L_0x00f9:
            adpa r1 = new adpa
            r1.<init>()
            goto L_0x01a3
        L_0x0100:
            adoy r1 = new adoy
            r1.<init>()
            goto L_0x01a3
        L_0x0107:
            adov r1 = new adov
            r1.<init>()
            goto L_0x01a3
        L_0x010e:
            adoz r1 = new adoz
            r1.<init>()
            goto L_0x01a3
        L_0x0115:
            adpb r1 = new adpb
            r1.<init>()
            goto L_0x01a3
        L_0x011c:
            adou r1 = new adou
            r1.<init>()
            goto L_0x01a3
        L_0x0123:
            adow r1 = new adow
            r1.<init>()
            goto L_0x01a3
        L_0x012a:
            ados r1 = defpackage.ados.a
            goto L_0x01a3
        L_0x012e:
            int r1 = r1.c
            if (r1 == r4) goto L_0x01a1
            if (r1 == 0) goto L_0x019b
            if (r1 == r3) goto L_0x0195
            if (r1 == r6) goto L_0x018f
            if (r1 == r15) goto L_0x0195
            if (r1 == r14) goto L_0x0189
            if (r1 == r13) goto L_0x0183
            if (r1 == r12) goto L_0x0189
            if (r1 == r11) goto L_0x0189
            if (r1 == r10) goto L_0x0183
            if (r1 == r9) goto L_0x0189
            if (r1 == r8) goto L_0x017d
            if (r1 == r7) goto L_0x0183
            r2 = 1043(0x413, float:1.462E-42)
            if (r1 == r2) goto L_0x017d
            switch(r1) {
                case 5: goto L_0x019b;
                case 15: goto L_0x018f;
                case 267: goto L_0x0195;
                case 272: goto L_0x017d;
                case 273: goto L_0x0177;
                case 274: goto L_0x0189;
                case 275: goto L_0x0171;
                case 278: goto L_0x0189;
                case 779: goto L_0x0171;
                case 784: goto L_0x01a1;
                case 1031: goto L_0x0189;
                case 1035: goto L_0x0171;
                case 1040: goto L_0x0171;
                case 1291: goto L_0x016b;
                case 1296: goto L_0x017d;
                case 1298: goto L_0x0183;
                case 1547: goto L_0x016b;
                case 1555: goto L_0x01a1;
                case 1803: goto L_0x016b;
                case 1811: goto L_0x01a1;
                case 2059: goto L_0x0195;
                case 2067: goto L_0x01a1;
                case 2315: goto L_0x0171;
                case 2323: goto L_0x01a1;
                case 2571: goto L_0x0171;
                case 2579: goto L_0x01a1;
                default: goto L_0x0151;
            }
        L_0x0151:
            switch(r1) {
                case 22: goto L_0x0189;
                case 23: goto L_0x018f;
                case 24: goto L_0x01a1;
                default: goto L_0x0154;
            }
        L_0x0154:
            switch(r1) {
                case 528: goto L_0x017d;
                case 529: goto L_0x0177;
                case 530: goto L_0x0189;
                case 531: goto L_0x017d;
                default: goto L_0x0157;
            }
        L_0x0157:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = java.lang.String.format(r5, r3)
            r2.<init>(r1)
            throw r2
        L_0x016b:
            adph r1 = new adph
            r1.<init>()
            goto L_0x01a3
        L_0x0171:
            adpk r1 = new adpk
            r1.<init>()
            goto L_0x01a3
        L_0x0177:
            adpc r1 = new adpc
            r1.<init>()
            goto L_0x01a3
        L_0x017d:
            adpg r1 = new adpg
            r1.<init>()
            goto L_0x01a3
        L_0x0183:
            adpe r1 = new adpe
            r1.<init>()
            goto L_0x01a3
        L_0x0189:
            adpm r1 = new adpm
            r1.<init>()
            goto L_0x01a3
        L_0x018f:
            adpn r1 = new adpn
            r1.<init>()
            goto L_0x01a3
        L_0x0195:
            adpd r1 = new adpd
            r1.<init>()
            goto L_0x01a3
        L_0x019b:
            adpj r1 = new adpj
            r1.<init>()
            goto L_0x01a3
        L_0x01a1:
            ados r1 = defpackage.ados.a
        L_0x01a3:
            r0.h = r1
            r0.a((int) r6)
            return
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.pano.SystemUpdateTvMainChimeraActivity.a(com.google.android.gms.update.SystemUpdateStatus):void");
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) obj;
        a.a("onSuccess", new Object[0]);
        if (!this.c) {
            a(systemUpdateStatus);
        }
    }
}
