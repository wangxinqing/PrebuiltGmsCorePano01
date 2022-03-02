package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

/* renamed from: drm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class drm extends hde implements jmb, ica, icb {
    public jzy a;
    public jmc b;
    private icc c;

    static {
        Scope scope = jzf.a;
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.app.settings.DataManagementActivity");
    }

    public final void e() {
        int i;
        int a2 = this.a.a();
        jmc jmc = this.b;
        if (a2 != 2) {
            i = R.string.core_drive_network_usage_all;
        } else {
            i = R.string.core_drive_network_usage_wifi;
        }
        jmc.c(i);
    }

    public final void f() {
        Toast.makeText(this, R.string.core_drive_settings_save_failed_toast, 0).show();
    }

    public final void g(Bundle bundle) {
        icc icc = this.c;
        icc.b((idf) new kuw(icc)).a((icm) new drl(this));
    }

    public final void i() {
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.core_drive_network_usage_all) {
            a(false);
        } else if (itemId != R.id.core_drive_network_usage_wifi) {
            return super.onContextItemSelected(menuItem);
        } else {
            a(true);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jkr.b() && aE() != null) {
            aE().b(true);
        }
        List d = jgu.d(this, getPackageName());
        if (d.size() > 0) {
            String str = ((Account) d.get(0)).name;
            ibz ibz = new ibz(this);
            ibq ibq = jzf.d;
            jzd jzd = new jzd();
            jzd.a.putBoolean("bypass_initial_sync", true);
            ibz.a(ibq, (ibj) jzd.a());
            ibz.a(jzf.a);
            ibz.a(jzf.b);
            ibz.a(str);
            ibz.a(this, 0, this);
            ibz.a((ica) this);
            this.c = ibz.b();
        }
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.core_network_drive, contextMenu);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.core_data_management_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.settings_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        GoogleHelp a2 = GoogleHelp.a("android_main");
        a2.a((Context) this);
        a2.s = jbn.a(this);
        new nyw(this).a(a2.a());
        return true;
    }

    private final void a(boolean z) {
        int i;
        jzy jzy = this.a;
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        if (jzy.a() != i) {
            kaa kaa = new kaa(this.a);
            kaa.b = i;
            this.a = kaa.a();
            e();
            icc icc = this.c;
            icc.b((idf) new kum(icc, this.a)).a((icm) new drk(this, jzy));
        }
    }

    public final void a(int i) {
        this.b.a(false);
    }

    public final void a(View view, jmc jmc) {
        if (!this.c.i()) {
            f();
            return;
        }
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
    }

    public final void a(ConnectionResult connectionResult) {
        this.b.a(false);
        hxj.a.a(getContainerActivity(), connectionResult.c, 0).show();
    }

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
        if (!this.g) {
            this.g = true;
            this.h = hde.a(this, getPackageName(), "com.google");
            hde.a(this, getPackageName(), "cn.google");
        }
        if (this.h) {
            jmc b2 = hde.b((Context) this);
            this.b = b2;
            b2.b((int) R.string.core_drive_network_usage);
            this.b.a(false);
            this.b.a((jmb) this);
            ((jmz) jma).a.a(this.b);
        }
    }
}
