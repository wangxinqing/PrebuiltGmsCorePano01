package com.google.android.gms.security.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerifyAppsSettingsChimeraActivity extends aaqd implements jmb, aarc {
    public static final /* synthetic */ int r = 0;
    public aaal a;
    aaqc b;
    aaqm c;
    aaqm d;
    aaqm e;
    aare i;
    aany j;
    public int k = -1;
    public int l = -1;
    public long m;
    public boolean n;
    public boolean o;
    public aapx p = aaoy.b();
    public PackageManager q;
    private aare s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;
    private List x;
    private boolean y = false;
    private final ExecutorService z = new jfz(2, 9);

    private final int j() {
        int a2;
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("gpp_home_user_entry_point") || (a2 = aaoe.a(intent.getIntExtra("gpp_home_user_entry_point", 0))) == 0) {
            return 1;
        }
        return a2;
    }

    public final void b(int i2) {
        runOnUiThread(new aaqw(this, i2));
    }

    public final void e() {
        this.a.a(false);
        f();
    }

    public final void f() {
        boolean d2 = this.a.d();
        jmw jmw = ((jmz) this.f).a;
        boolean z2 = true;
        if (!d2) {
            aaqm aaqm = this.d;
            if (aaqm != null && !this.t) {
                jmw.a((jmc) aaqm);
                this.t = true;
            }
        } else if (this.t) {
            jmw.d(this.d);
            this.t = false;
        }
        if (!d2 || this.k != 0 || this.l != 0) {
            if (this.u) {
                jmw.d(this.c);
                this.u = false;
            }
            if (this.v) {
                jmw.d(this.e);
                this.v = false;
            }
        } else if (this.o) {
            aaqm aaqm2 = this.e;
            if (aaqm2 != null && !this.v) {
                jmw.a((jmc) aaqm2);
                this.v = true;
                if (this.u) {
                    jmw.d(this.c);
                    this.u = false;
                }
            }
        } else {
            aaqm aaqm3 = this.c;
            if (aaqm3 != null) {
                if (!this.u) {
                    jmw.a((jmc) aaqm3);
                    this.u = true;
                }
                if (this.v) {
                    jmw.d(this.e);
                    this.v = false;
                }
            }
        }
        this.s.setChecked(d2);
        this.s.a(this.a.c());
        aare aare = this.i;
        if (aare != null) {
            if (!d2 || !aaal.c(this)) {
                z2 = false;
            }
            aare.setChecked(z2);
            this.i.a(d2);
            this.i.c(!d2 ? R.string.upload_apps_disabled_summary : R.string.upload_apps_summary);
        }
    }

    public final Map h() {
        int i2;
        String str;
        PackageInfo packageInfo;
        List<ResolveInfo> queryIntentActivities = this.q.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), !jkr.b() ? 0 : 131072);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ResolveInfo next : queryIntentActivities) {
            if (!(next == null || next.activityInfo == null || next.activityInfo.applicationInfo == null || (str = next.activityInfo.packageName) == null || hashSet.contains(str))) {
                try {
                    packageInfo = this.q.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Long valueOf = Long.valueOf(packageInfo.lastUpdateTime);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, new HashMap());
                        arrayList.add(valueOf);
                    }
                    ((Map) hashMap.get(valueOf)).put(str, packageInfo);
                    hashSet.add(str);
                }
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            Long valueOf2 = Long.valueOf(longValue);
            linkedHashMap.put(valueOf2, new ArrayList());
            ArrayList arrayList2 = new ArrayList(((Map) hashMap.get(valueOf2)).keySet());
            Collections.sort(arrayList2);
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 >= size2) {
                    break;
                }
                Long valueOf3 = Long.valueOf(longValue);
                ((List) linkedHashMap.get(valueOf3)).add((PackageInfo) ((Map) hashMap.get(valueOf3)).get((String) arrayList2.get(i4)));
                i4++;
            }
            i3 = i2;
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = defpackage.aans.a((android.content.Context) r4, 3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            boolean r0 = defpackage.azfv.h()
            r1 = 1
            if (r0 == 0) goto L_0x002e
            r0 = 3
            android.content.Intent r0 = defpackage.aans.a((android.content.Context) r4, (int) r0)
            android.content.ComponentName r2 = r0.getComponent()
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r2.getClassName()
            java.lang.Class<com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity> r3 = com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity.class
            java.lang.String r3 = defpackage.aann.a((java.lang.Class) r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002e
        L_0x0022:
            r4.startActivity(r0)
            r4.y = r1
            super.onCreate(r5)
            r4.finish()
            return
        L_0x002e:
            aany r0 = r4.j
            if (r0 == 0) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            aany r0 = new aany
            r0.<init>(r4)
            r4.j = r0
        L_0x003a:
            aapx r0 = r4.p
            r0.a()
            super.onCreate(r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            r4.q = r5
            sg r5 = r4.aE()
            r5.b((boolean) r1)
            java.util.concurrent.ExecutorService r5 = r4.z
            aaqn r0 = new aaqn
            r0.<init>(r4)
            r5.execute(r0)
            boolean r5 = defpackage.azfv.k()
            if (r5 == 0) goto L_0x0068
            aapx r5 = r4.p
            int r0 = r4.j()
            r5.a(r0)
        L_0x0068:
            aapx r5 = r4.p
            r0 = 2
            r5.a(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        try {
            this.z.shutdownNow();
        } catch (Exception e2) {
        }
        this.p.a(3, 2);
        super.onDestroy();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (azfv.k()) {
            setIntent(intent);
            this.p.a(j());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.security_apps_help) {
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = 1;
            themeSettings.b = kf.b(this, R.color.material_blue_grey_700);
            a((Map) anaf.a("isVerifyAppsVisible", "true"), themeSettings);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        this.a = new aaal(this);
        this.m = System.currentTimeMillis();
        f();
        a(false);
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (z2) {
            f();
        }
    }

    public static void a(Context context) {
        new aaqr(context).start();
    }

    private final void a(jnd jnd) {
        new qvr().post(new aaqq(this, jnd));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r4, java.util.List r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r6 == 0) goto L_0x0076
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0076
            long r0 = r3.w     // Catch:{ all -> 0x007a }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x001a
            java.util.List r0 = r3.x     // Catch:{ all -> 0x007a }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            monitor-exit(r3)
            return
        L_0x001a:
            aaqc r0 = r3.b     // Catch:{ all -> 0x007a }
            r1 = 1
            if (r0 != 0) goto L_0x0042
            aaqc r0 = new aaqc     // Catch:{ all -> 0x007a }
            aapx r2 = r3.p     // Catch:{ all -> 0x007a }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x007a }
            r3.b = r0     // Catch:{ all -> 0x007a }
            r0.a((int) r1)     // Catch:{ all -> 0x007a }
            aaqc r0 = r3.b     // Catch:{ all -> 0x007a }
            r2 = 2131954359(0x7f130ab7, float:1.9545215E38)
            java.lang.CharSequence r2 = r3.getText(r2)     // Catch:{ all -> 0x007a }
            r0.a((java.lang.CharSequence) r2)     // Catch:{ all -> 0x007a }
            jma r0 = r3.f     // Catch:{ all -> 0x007a }
            jmz r0 = (defpackage.jmz) r0     // Catch:{ all -> 0x007a }
            jmw r0 = r0.a     // Catch:{ all -> 0x007a }
            aaqc r2 = r3.b     // Catch:{ all -> 0x007a }
            r0.a((defpackage.jmc) r2)     // Catch:{ all -> 0x007a }
        L_0x0042:
            java.lang.String r0 = defpackage.aany.a(r3, r4)     // Catch:{ all -> 0x007a }
            aaqc r2 = r3.b     // Catch:{ all -> 0x007a }
            r2.b((java.lang.CharSequence) r0)     // Catch:{ all -> 0x007a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x007a }
            r0.<init>(r6)     // Catch:{ all -> 0x007a }
            java.util.Random r2 = new java.util.Random     // Catch:{ all -> 0x007a }
            r2.<init>(r4)     // Catch:{ all -> 0x007a }
            java.util.Collections.shuffle(r0, r2)     // Catch:{ all -> 0x007a }
            java.util.List r2 = r3.x     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x0066
            aaqc r2 = r3.b     // Catch:{ all -> 0x007a }
            r2.m = r1     // Catch:{ all -> 0x007a }
            r2.l = r0     // Catch:{ all -> 0x007a }
            r2.h()     // Catch:{ all -> 0x007a }
            goto L_0x0070
        L_0x0066:
            aaqc r1 = r3.b     // Catch:{ all -> 0x007a }
            r2 = 0
            r1.m = r2     // Catch:{ all -> 0x007a }
            r1.l = r0     // Catch:{ all -> 0x007a }
            r1.h()     // Catch:{ all -> 0x007a }
        L_0x0070:
            r3.x = r6     // Catch:{ all -> 0x007a }
            r3.w = r4     // Catch:{ all -> 0x007a }
            monitor-exit(r3)
            return
        L_0x0076:
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x007a }
            goto L_0x0018
        L_0x007a:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x007e
        L_0x007d:
            throw r4
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity.a(long, java.util.List):void");
    }

    public final void a(View view, jmc jmc) {
        int i2;
        if (!jmc.equals(this.s)) {
            if (jmc.equals(this.i)) {
                boolean z2 = this.i.i;
                aaal.a(this, !z2);
                if (!z2) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
                this.p.a(4, i2);
                f();
                a((jnd) this.i);
            }
        } else if (!this.s.i || this.a.a((Context) this)) {
            if (!azfv.a.a().ab()) {
                this.a.a(true ^ this.s.i);
                this.p.a(4, 7);
                f();
            } else {
                boolean z3 = this.s.i;
                this.a.a(!z3);
                this.p.a(4, 7);
                f();
                if (!z3) {
                    this.o = true;
                    a(true);
                }
            }
            a((jnd) this.s);
        } else {
            aard aard = new aard();
            aard.a = this.p;
            aard.show(getSupportFragmentManager(), "disable_verify_apps_confirmation_dialog");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
        if (!this.y) {
            jmw jmw = ((jmz) jma).a;
            aare aare = new aare(this);
            aans.a(aare, this, 5, R.string.verify_apps_title);
            this.s = aare;
            aare.c(R.string.verify_apps_summary);
            jmw.a((jmc) this.s);
            aaqm aaqm = new aaqm(this);
            aaqm.a(0);
            aaqm.b((int) R.string.play_protect_banner);
            aaqm.j = a(R.drawable.play_protect_ic_logo_40dp);
            aaqm.h();
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://support.google.com/googleplay/answer/2812853"));
            if (b(data)) {
                aaqm.c(getText(R.string.common_learn_more));
                aaqm.i = new aaqo(this, data);
            }
            jmw.a((jmc) aaqm);
            aaqm aaqm2 = new aaqm(this);
            aans.a(aaqm2, (jmb) null, 2, R.string.play_protect_disabled_title);
            this.d = aaqm2;
            aaqm2.c(R.string.play_protect_disabled_summary);
            this.d.a(a((int) R.drawable.play_protect_ic_alert_black_24dp, (int) R.color.material_google_red_500));
            aaqm aaqm3 = new aaqm(this);
            aans.a(aaqm3, (jmb) null, 2, R.string.play_protect_all_clear_title);
            this.c = aaqm3;
            aaqm3.c(R.string.play_protect_all_clear_summary);
            this.c.a(a((int) R.drawable.play_protect_ic_check_black_24dp, (int) R.color.material_google_green_500));
            if (this.j.a >= 80832200) {
                aaqm aaqm4 = this.c;
                Drawable a2 = a((int) R.drawable.play_protect_ic_rescan_black_24dp, (int) R.color.material_google_green_500);
                aaqm4.s = new aaqp(this);
                aaqm4.k = a2;
                aaqm4.h();
            }
            aaqm aaqm5 = new aaqm(this);
            aans.a(aaqm5, (jmb) null, 2, R.string.play_protect_all_clear_title);
            this.e = aaqm5;
            aaqm5.c(R.string.play_protect_scan_in_progress_subtitle);
            this.e.a(a((int) R.drawable.play_protect_ic_check_black_24dp, (int) R.color.material_google_green_500));
            aaqm aaqm6 = this.e;
            aaqm6.r = true;
            aaqm6.h();
            aare aare2 = new aare(this);
            aans.a(aare2, this, 6, R.string.upload_apps_title);
            this.i = aare2;
            aare2.k = false;
            aare2.h();
            jmw.a((jmc) this.i);
        }
    }

    public final synchronized void a(boolean z2) {
        if (!this.n) {
            this.n = true;
            this.z.execute(new aaqs(this, z2));
        }
    }
}
