package com.google.android.gms.ads.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.ads.settings.ui.b;
import com.google.android.gms.ads.settings.ui.c;
import com.google.android.gms.ads.settings.ui.e;
import com.google.android.gms.ads.settings.ui.f;
import com.google.android.gms.ads.settings.ui.h;
import com.google.android.gms.ads.settings.ui.i;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdsSettingsChimeraActivity extends hde implements DialogInterface.OnCancelListener, jmb, b, h, e {
    public static final /* synthetic */ int e = 0;
    jmc a;
    jnd b;
    jnd c;
    public SharedPreferences d;

    private final void a(jnb jnb, int i, int i2) {
        jnb.d(i2);
        jnb.b(i2);
        jnb.a(i);
        jnb.a((jmb) this);
    }

    private final void b(boolean z) {
        if (k()) {
            new c(this).execute(new Boolean[]{Boolean.valueOf(z)});
        }
    }

    private final void j() {
        this.b.toggle();
        boolean z = this.b.i;
        new d(this).execute(new Boolean[]{Boolean.valueOf(z)});
        if (awhh.b()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_lat_change");
            bundle.putString("lat", Boolean.toString(z));
            com.google.android.gms.ads.internal.b.a().a(this, (String) null, "gmob-apps", bundle);
        }
    }

    private final boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) com.google.android.gms.ads.internal.flag.b.a.a()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            Log.w("AdsSettingsActivity", "Fail to determine debug setting.", e2);
            return false;
        }
    }

    public final void e() {
        j();
    }

    public final void f() {
        this.c.toggle();
        b(this.c.i);
    }

    public final void i() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.d = getSharedPreferences("ad_settings_cache", 0);
        n.a(getApplicationContext());
        super.onCreate(bundle);
        sg aE = aE();
        if (jgu.e(this)) {
            aE.b(false);
            aE.p();
        } else {
            aE.b(true);
        }
        if (awhh.b()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action", "ads_settings_page_view");
            com.google.android.gms.ads.internal.b.a().a(this, (String) null, "gmob-apps", bundle2);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ads_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.help_and_feedback) {
            Uri parse = Uri.parse(awhh.a.a().b());
            GoogleHelp a2 = GoogleHelp.a("android_ads");
            a2.q = parse;
            new nyw(this).a(a2.a());
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        new b(this).execute(new Void[0]);
    }

    public final void a(View view, jmc jmc) {
        int a2 = jmc.a();
        if (a2 == R.string.ads_prefs_ads_personalization) {
            if (!this.b.i) {
                try {
                    new i().show(getSupportFragmentManager(), "toggle_lat_dialog");
                } catch (IllegalStateException e2) {
                    Log.w("AdsSettingsActivity", "Cannot show Toggle Limit Ad Tracking Dialog.", e2);
                }
            } else {
                j();
            }
        } else if (a2 == R.string.ads_prefs_reset_adid) {
            try {
                new c().show(getSupportFragmentManager(), "reset_dialog");
            } catch (IllegalStateException e3) {
                Log.w("AdsSettingsActivity", "Cannot show Reset Advertising Id Dialog.", e3);
            }
        } else if (a2 == R.string.ads_prefs_ads_by_google) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(awhh.a.a().q()));
            if (!jhg.a((Context) this, intent)) {
                iah.a(this, intent, 0);
            } else {
                startActivity(intent);
            }
        } else if (a2 == R.string.debug_logging_enable) {
            jnd jnd = this.c;
            if (!jnd.i) {
                try {
                    new f().show(getSupportFragmentManager(), "toggle_debug_logging_dialog");
                } catch (IllegalStateException e4) {
                    Log.w("AdsSettingsActivity", "Cannot show Toggle Debug Logging Dialog.", e4);
                }
            } else {
                jnd.toggle();
                b(this.c.i);
            }
        }
    }

    public final void h() {
        new a(this).execute(new Void[0]);
        if (awhh.b()) {
            Bundle bundle = new Bundle();
            bundle.putString("action", "ads_settings_reset_adid");
            com.google.android.gms.ads.internal.b.a().a(this, (String) null, "gmob-apps", bundle);
        }
    }

    public final void a(hxx hxx) {
        Dialog a2 = hxy.a(hxx.a, getContainerActivity(), 1, (DialogInterface.OnCancelListener) null);
        a2.setCanceledOnTouchOutside(false);
        hxa hxa = new hxa();
        iva.a((Object) a2, (Object) "Cannot display null dialog");
        a2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        a2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        hxa.a = a2;
        hxa.b = this;
        try {
            hxa.show(getSupportFragmentManager(), "error_dialog");
        } catch (IllegalStateException e2) {
            Log.w("AdsSettingsActivity", "Cannot show Chimera Error Dialog.", e2);
        }
    }

    public final void a(String str) {
        jmc jmc = this.a;
        jmc.b((CharSequence) getText(R.string.ads_prefs_your_adid) + "\n" + str);
    }

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
        jmw jmw = ((jmz) jma).a;
        jnb jnb = new jnb(this);
        a(jnb, 0, R.string.ads_prefs_reset_adid);
        jmw.a((jmc) jnb);
        jnd jnd = new jnd(this, false);
        a(jnd, 1, R.string.ads_prefs_ads_personalization);
        this.b = jnd;
        jnd.c(R.string.ads_prefs_ads_personalization_summary);
        this.b.setChecked(this.d.getBoolean("ad_settings_cache_lat", false));
        jmw.a((jmc) this.b);
        jnb jnb2 = new jnb(this);
        a(jnb2, 2, R.string.ads_prefs_ads_by_google);
        jmw.a((jmc) jnb2);
        int i = 3;
        if (k()) {
            jnd jnd2 = new jnd(this, false);
            a(jnd2, 3, R.string.debug_logging_enable);
            this.c = jnd2;
            jnd2.c(R.string.debug_logging_enable_summary);
            this.c.setChecked(this.d.getBoolean("ad_settings_cache_enable_debug_logging", false));
            jmw.a((jmc) this.c);
            i = 4;
        }
        jnb jnb3 = new jnb(this);
        this.a = jnb3;
        jnb3.a(i);
        this.a.c(R.string.ads_prefs_your_adid);
        jmw.a(this.a);
    }

    public final void a(boolean z) {
        this.d.edit().putBoolean("ad_settings_cache_lat", z).apply();
    }
}
