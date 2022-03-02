package com.google.android.gms.security.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecuritySettingsChimeraActivity extends aaqd {
    public static final /* synthetic */ int b = 0;
    public jmc a;
    private boolean c;

    /* access modifiers changed from: protected */
    public final void a(jma jma, Bundle bundle) {
        jmw e = jma.e(R.string.common_mdm_feature_name);
        boolean c2 = AdmSettingsChimeraActivity.c(this);
        this.c = c2;
        if (c2) {
            jnb jnb = new jnb(this);
            jnb.b((int) R.string.common_mdm_feature_name);
            jnb.c(R.string.mdm_settings_locate_title);
            jnb.a(AdmSettingsChimeraActivity.a((Context) this));
            e.a((jmc) jnb);
        }
        jmw e2 = jma.e(R.string.security_status_section_title);
        VerifyAppsSettingsChimeraActivity.a((Context) this);
        jnb jnb2 = new jnb(this);
        this.a = jnb2;
        jnb2.b((int) R.string.google_play_protect_title);
        this.a.a(aans.a((Context) this, 2));
        e2.a(this.a);
    }

    public final void onCreate(Bundle bundle) {
        aE().b(true);
        super.onCreate(bundle);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.security_apps_help) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            a((Map) anaf.a("isMdmVisible", String.valueOf(this.c), "isVerifyAppsVisible", "true"), jbn.a(this));
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            new aaqf(this).start();
        }
    }
}
