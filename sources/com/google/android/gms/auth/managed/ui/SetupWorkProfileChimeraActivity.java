package com.google.android.gms.auth.managed.ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupWorkProfileChimeraActivity extends ijd implements aljq {
    private Uri a;
    private ijo b;

    private final void a(int i) {
        String string = getString(i);
        if (this.b.a() instanceof SetupWizardLayout) {
            ((SetupWizardLayout) this.b.a()).c().a.setText(string);
        } else {
            ((alhe) ((GlifLayout) this.b.a()).a(alhe.class)).c.a((CharSequence) string);
        }
    }

    private final void c() {
        ((TextView) findViewById(R.id.auth_managed_setup_work_profile_description)).setText(R.string.common_something_went_wrong);
        a(R.string.common_retry);
    }

    public final void aL() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        Intent intent2;
        if (i == 0) {
            if (i2 == -1) {
                gjh.a();
                Uri uri = this.a;
                if (uri == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (uri != null) {
                    str = uri.toString();
                } else {
                    str = null;
                }
                gje a2 = gjh.a(this, "com.google.android.apps.work.clouddpc", (avwi) null, (Account) null, (Bundle) null, (Boolean) null, z, str);
                if (a2.a.i != Status.a.i || (intent2 = a2.b) == null) {
                    c();
                } else {
                    startActivityForResult(intent2, 1);
                }
            } else {
                c();
            }
        } else if (i == 1 && i2 == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        if (!SetupWorkProfileSettingsIntentOperation.a(this)) {
            a(this, false);
            finish();
            return;
        }
        this.a = getIntent().getData();
        if (!ijm.a(i())) {
            i = R.layout.setup_work_profile_activity;
        } else {
            i = R.layout.setup_work_profile_activity_glif;
        }
        ijo a2 = ijo.a(this, i);
        this.b = a2;
        ijm.a(a2.a());
        this.b.a((CharSequence) getString(R.string.auth_device_management_setup_work_profile_settings_entry));
        setContentView((View) this.b.a());
        if (this.b.a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) this.b.a();
            setupWizardLayout.c().a((aljq) this);
            this.b.c(false);
            setupWizardLayout.b(false);
        } else {
            alhf alhf = new alhf(this);
            alhf.b = new gjb(this);
            alhf.c = 5;
            alhf.d = 2132018060;
            ((alhe) ((GlifLayout) this.b.a().findViewById(R.id.setup_wizard_layout)).a(alhe.class)).a(alhf.a());
            this.b.a(false);
        }
        Uri uri = this.a;
        if (uri != null && uri.getQueryParameterNames().contains("et")) {
            ((TextView) findViewById(R.id.auth_managed_setup_work_profile_description)).setText(R.string.auth_device_management_setup_work_profile_enrollment_link_description);
        }
        a(R.string.common_next);
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
    }

    public static void a(Context context, boolean z) {
        jhg.a(context, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity", z);
    }

    public final void a() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        startActivityForResult(PhoneskyDpcInstallChimeraActivity.a(this, "com.google.android.apps.work.clouddpc", false, extras), 0);
    }
}
