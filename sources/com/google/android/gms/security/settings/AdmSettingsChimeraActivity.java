package com.google.android.gms.security.settings;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdmSettingsChimeraActivity extends aaqd implements jmb, aapj, aapa, jmo {
    private static final IntentFilter o = new IntentFilter("com.google.android.gms.mdm.DEVICE_ADMIN_CHANGE_INTENT");
    aapt a;
    aapq b;
    aapw c;
    aapw d;
    aapn e;
    aape i;
    aape j;
    aape k;
    aaph l;
    boolean m;
    boolean n;
    private boolean p;
    private boolean q = false;
    private BroadcastReceiver r;

    public static Intent a(Context context) {
        return aann.a(context, AdmSettingsChimeraActivity.class);
    }

    public static boolean c(Context context) {
        return !jix.a(context) && jgu.f(context);
    }

    private final void j() {
        boolean a2 = jjm.a(this);
        if (this.q && a2) {
            this.a.setChecked(true);
            smo.e.a((Object) true);
        }
        boolean b2 = snb.b(this);
        boolean b3 = azfk.b();
        int i2 = R.string.common_disabled;
        if (b3) {
            boolean booleanValue = ((Boolean) smo.e.a()).booleanValue();
            this.b.a(booleanValue);
            if (!booleanValue && b2) {
                snb.a((Context) this);
            } else {
                this.b.setChecked(b2);
                aapq aapq = this.b;
                if (b2) {
                    i2 = R.string.security_status_remote_lock_enabled_summary;
                }
                aapq.c(i2);
            }
        } else {
            this.b.a(true);
            this.b.setChecked(b2);
            aapq aapq2 = this.b;
            if (b2) {
                i2 = R.string.security_status_remote_lock_enabled_summary;
            }
            aapq2.c(i2);
        }
        this.a.setChecked(((Boolean) smo.e.a()).booleanValue());
        e();
        alv.a((Context) this).a(this.r, o);
    }

    private final void k() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.adm");
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.adm")));
        } catch (ActivityNotFoundException e2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.adm")));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            jma r0 = r5.f
            jmz r0 = (defpackage.jmz) r0
            jmw r0 = r0.a
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.google"
            android.accounts.Account[] r3 = defpackage.eig.d(r5, r3)     // Catch:{ RemoteException -> 0x001b, hxw -> 0x0019, hxx -> 0x0017 }
            if (r3 == 0) goto L_0x001c
            int r3 = r3.length     // Catch:{ RemoteException -> 0x001b, hxw -> 0x0019, hxx -> 0x0017 }
            if (r3 > 0) goto L_0x0015
            r3 = 0
            goto L_0x001d
        L_0x0015:
            r3 = 1
            goto L_0x001d
        L_0x0017:
            r3 = move-exception
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            r3 = 0
        L_0x001d:
            boolean r4 = defpackage.snm.a(r5)
            if (r3 == 0) goto L_0x003c
            boolean r3 = r5.m
            if (r3 == 0) goto L_0x002e
            aapw r3 = r5.c
            r0.d(r3)
            r5.m = r2
        L_0x002e:
            if (r4 != 0) goto L_0x0047
            boolean r2 = r5.n
            if (r2 != 0) goto L_0x0053
            aapw r2 = r5.d
            r0.a((defpackage.jmc) r2)
            r5.n = r1
            return
        L_0x003c:
            boolean r3 = r5.m
            if (r3 != 0) goto L_0x0047
            aapw r3 = r5.c
            r0.a((defpackage.jmc) r3)
            r5.m = r1
        L_0x0047:
            boolean r1 = r5.n
            if (r1 == 0) goto L_0x0053
            aapw r1 = r5.d
            r0.d(r1)
            r5.n = r2
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.settings.AdmSettingsChimeraActivity.e():void");
    }

    public final void f() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        e();
    }

    public final void h() {
        startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS"));
        e();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE().b(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.security_apps_help) {
            a((Map) anaf.a("isMdmVisible", String.valueOf(this.p)), jbn.a(this));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        if (this.p) {
            alv.a((Context) this).a(this.r);
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.p) {
            j();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.p) {
            j();
        }
    }

    public final void a(View view, jmc jmc) {
        if (!jmc.equals(this.b)) {
            if (jmc.equals(this.c)) {
                new aapb().show(getSupportFragmentManager(), "fmd_add_account_confirmation_dialog");
            } else if (jmc.equals(this.d)) {
                new aapk().show(getSupportFragmentManager(), "fmd_enable_location_confirmation_dialog");
            } else if (jmc.equals(this.i)) {
                String valueOf = String.valueOf(URLEncoder.encode(getString(R.string.adm_settings_activity_title).toLowerCase()));
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(valueOf.length() == 0 ? new String("https://www.google.com/search?q=") : "https://www.google.com/search?q=".concat(valueOf))));
            } else if (jmc.equals(this.j)) {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.google.com/android/find")));
            } else if (jmc.equals(this.k)) {
                k();
            }
        } else if (this.b.i) {
            snb.a((Context) this);
        } else {
            snb.g(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
        boolean z;
        jmw jmw = ((jmz) jma).a;
        boolean c2 = c(this);
        this.p = c2;
        if (c2) {
            aapt aapt = new aapt(this);
            this.a = aapt;
            aapt.k = 0;
            jmw.a((jmc) aapt);
            aapq aapq = new aapq(this);
            aans.a(aapq, this, 2, R.string.mdm_settings_wipe_title);
            this.b = aapq;
            int i2 = Build.VERSION.SDK_INT;
            aaph aaph = new aaph(this);
            this.l = aaph;
            aaph.a(7);
            this.l.c(R.string.mdm_find_device_description);
            this.l.a(a(R.drawable.quantum_ic_info_outline_grey600_48));
            jmw.a((jmc) this.l);
            this.r = new nla("security") {
                public final void a(Context context, Intent intent) {
                    boolean booleanExtra = intent.getBooleanExtra("device_admin_enabled", false);
                    AdmSettingsChimeraActivity.this.b.setChecked(booleanExtra);
                    AdmSettingsChimeraActivity.this.b.c(!booleanExtra ? R.string.common_disabled : R.string.security_status_remote_lock_enabled_summary);
                }
            };
            aapn aapn = new aapn(this);
            aans.a(aapn, (jmb) null, 3, R.string.mdm_ways_to_locate);
            this.e = aapn;
            if (!jkr.e() || !getPackageManager().hasSystemFeature("android.hardware.type.featurephone")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                aape aape = new aape(this);
                aans.a(aape, this, 4, R.string.adm_settings_activity_title);
                this.k = aape;
                try {
                    getPackageManager().getPackageInfo("com.google.android.apps.adm", 0);
                    this.k.b((CharSequence) getString(R.string.mdm_open_app));
                } catch (PackageManager.NameNotFoundException e2) {
                    this.k.b((CharSequence) getString(R.string.mdm_get_app));
                }
                this.k.a(a(R.drawable.ic_launcher_fmd_icon));
            }
            aape aape2 = new aape(this);
            aans.a(aape2, this, 5, R.string.mdm_find_device_website);
            this.j = aape2;
            aape2.b((CharSequence) getString(R.string.mdm_visit_website));
            String a2 = snh.a(getPackageManager(), new Intent("android.intent.action.VIEW", Uri.parse("http://")));
            Drawable a3 = a(R.drawable.ic_launcher_fmd_icon);
            if (a2 != null) {
                try {
                    a3 = getPackageManager().getApplicationIcon(a2);
                } catch (PackageManager.NameNotFoundException e3) {
                }
            }
            this.j.a(a3);
            aape aape3 = new aape(this);
            aans.a(aape3, this, 6, R.string.common_google);
            this.i = aape3;
            aape3.b((CharSequence) getString(R.string.mdm_google_search));
            this.i.a(a(R.drawable.product_logo_googleg_color_24));
            aape aape4 = this.i;
            aape4.i = true;
            aape4.h();
            if (z) {
                jmw.a(this.e, this.j, this.i);
            } else {
                jmw.a(this.e, this.k, this.j, this.i);
            }
            aapw aapw = new aapw(this);
            aans.a(aapw, this, 1, R.string.security_status_find_device_not_working);
            this.c = aapw;
            aapw.c(R.string.security_status_no_google_account_summary);
            this.c.a(a(R.drawable.fmd_error_icon));
            aapw aapw2 = new aapw(this);
            aans.a(aapw2, this, 1, R.string.security_status_find_device_not_working);
            this.d = aapw2;
            aapw2.c(R.string.security_status_find_device_location_off_summary);
            this.d.a(a(R.drawable.fmd_error_icon));
            e();
            Intent intent = getIntent();
            if (intent.getBooleanExtra("show_device_admin", false)) {
                snb.g(this);
            }
            if (intent.getBooleanExtra("show_modal_request", false) && bundle == null) {
                new smj().show(getSupportFragmentManager(), "activate_device_admin_dialog");
            }
            if (bundle != null) {
                this.q = bundle.getBoolean("verify_google_location", false);
            }
        }
    }

    public final void a(boolean z) {
        if (jjm.a(this)) {
            this.a.setChecked(z);
            smo.e.a((Object) Boolean.valueOf(z));
        } else {
            startActivity(new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"));
            this.q = true;
        }
        if (azfk.b()) {
            this.b.a(z);
            if (!z && this.b.i) {
                snb.a((Context) this);
            }
        }
        e();
    }
}
