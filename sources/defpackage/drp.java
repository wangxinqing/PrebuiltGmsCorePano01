package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: drp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class drp extends hde {
    public static drp e = null;
    public boolean a = false;
    public final nz b = new nz();
    public final List c = Collections.synchronizedList(new ArrayList());
    public final ov d = new ov();

    public drp() {
        quj.a();
    }

    private final void a(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.show_hide_debug);
        if (!quj.a(this)) {
            findItem.setTitle(R.string.common_show_debug);
        } else {
            findItem.setTitle(R.string.common_hide_debug);
        }
        findItem.setVisible(awzr.b());
    }

    private final void e() {
        e = this;
        Bundle bundle = new Bundle();
        dpz.a(bundle, this.c);
        Intent intent = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage(getPackageName());
        bundle.putString("className", "GoogleSettingsActivity");
        intent.putExtras(bundle);
        startService(intent);
    }

    /* access modifiers changed from: protected */
    public abstract Intent a(int i, String str);

    /* access modifiers changed from: protected */
    public abstract jmw a(CharSequence charSequence, int i);

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public final void b(int i, int i2) {
        jmw jmw = (jmw) this.b.get(0);
        if (jmw != null) {
            List list = (List) this.d.a(i);
            if (list != null && !list.isEmpty()) {
                Intent a2 = a(i2, getResources().getString(i2));
                jmc b2 = hde.b((Context) this);
                b2.b(i2);
                ivy.a((Iterable) list, a2, "items");
                b2.a(a2);
                b2.a(true);
                if (!jmw.b(b2)) {
                    jmw.a(b2);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No SettingsCategory found for id 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void i() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jgu.e(this)) {
            Log.e("GoogleSettingsActivity", "Cannot run for restricted users.");
            Intent intent = getIntent();
            if (!(intent == null || intent.getComponent() == null)) {
                jhg.a((Context) this, intent.getComponent());
                String valueOf = String.valueOf(intent.getComponent());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
                sb.append("Disabling ");
                sb.append(valueOf);
                Log.w("GoogleSettingsActivity", sb.toString());
            }
            finish();
            return;
        }
        if (jkr.b() && aE() != null) {
            aE().b(true);
        }
        e();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.core_google_settings_menu, menu);
        if (jgu.b((Context) this)) {
            a(menu);
        }
        if (quj.e(this) && axdd.a.a().c()) {
            menu.findItem(R.id.usage_reporting).setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        if (e == this) {
            e = null;
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.settings_help) {
            quj.a(Uri.parse((String) ((amsz) iks.g).a), this);
            return true;
        } else if (itemId == R.id.usage_reporting) {
            quj.d(this);
            return true;
        } else if (itemId == R.id.settings_oss_licenses) {
            quj.c(this);
            return true;
        } else if (itemId == R.id.show_hide_debug) {
            SharedPreferences sharedPreferences = getSharedPreferences("googlesettings", 0);
            boolean z = sharedPreferences.getBoolean("ShowDebug", false);
            sharedPreferences.edit().putBoolean("ShowDebug", !z).commit();
            if (z) {
                this.f.a((jmw) this.b.remove(2));
                return true;
            }
            e();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (!this.a) {
            return true;
        }
        a(menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, int i2) {
        a(i, a(getText(i2), i));
        this.d.b(i, new ArrayList());
    }

    /* access modifiers changed from: protected */
    public final void a(int i, jmw jmw) {
        this.b.put(Integer.valueOf(i), jmw);
    }
}
