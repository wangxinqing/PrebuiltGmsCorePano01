package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreFactoryResetChimeraActivity extends gmz implements AccountManagerCallback {
    private static final iwd e = new iwd("Auth", "PreFactoryResetChimeraActivity");
    Account a = null;
    boolean b = true;
    jfp c;
    qub d;

    public static Intent d() {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.backup.ACTION_BACKUP_SETTINGS");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsActivity");
        intent.putExtra("hide_reset", true);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        String a2 = jli.a("setupwizard.theme", "glif_v3_light");
        aljk aljk = new aljk(aljl.a());
        aljk.a = 2132018095;
        aljk.b = false;
        int a3 = aljk.a().a(a2);
        aljk aljk2 = new aljk(aljl.a());
        aljk2.a = a3;
        aljk2.b = false;
        setTheme(aljk2.a().a(getIntent()));
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "PreFactoryResetChimeraActivity";
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        setResult(-1, new Intent());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            c();
        }
    }

    public void onCheckCredClicked(View view) {
        this.b = ((CheckBox) view).isChecked();
    }

    public void onContinue(View view) {
        if (this.b) {
            this.d.a(this.a, new Bundle(), (Activity) null, (AccountManagerCallback) this, (Handler) new jfo(this.c));
            return;
        }
        c();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (ent.e()) {
            qub a2 = qub.a((Context) this);
            this.d = a2;
            Account[] a3 = a2.a("com.google");
            if (a3 == null || a3.length == 0) {
                c();
                return;
            }
            this.a = a3[0];
            this.c = new jfp("PreFactoryResetChimerActivityHandler", 9);
            setContentView((int) R.layout.pre_factory_reset_activity);
            TextView textView = (TextView) findViewById(R.id.pre_frp_text);
            if (this.a.name != null) {
                str = this.a.name;
            } else {
                str = "";
            }
            String string = getString(R.string.auth_pre_wipe_credential_desc_text_filler);
            String string2 = getString(R.string.auth_pre_wipe_credential_desc_text, new Object[]{str, string});
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            gfr gfr = new gfr(this);
            spannableStringBuilder.setSpan(new gfs(), string2.indexOf(str), string2.indexOf(str) + str.length(), 33);
            spannableStringBuilder.setSpan(gfr, string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            CheckBox checkBox = (CheckBox) findViewById(R.id.check_cred);
            this.b = checkBox.isChecked();
            checkBox.setText(getString(R.string.auth_pre_wipe_credential_check_text, new Object[]{this.a.name}));
            return;
        }
        c();
    }

    public final void onDestroy() {
        super.onDestroy();
        jfp jfp = this.c;
        if (jfp != null) {
            jfp.quitSafely();
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 3);
        } catch (Exception e2) {
            e.d("Canceled account confirmation, do nothing", e2, new Object[0]);
        }
    }
}
