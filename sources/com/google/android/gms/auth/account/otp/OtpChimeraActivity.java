package com.google.android.gms.auth.account.otp;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OtpChimeraActivity extends bjs implements erx {
    public jmf a;
    public erq b;
    public String c;
    public boolean d;
    private View e;
    private View f;
    private View g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private boolean l;

    private final void a(View view) {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        view.setVisibility(0);
    }

    private static String b(String str) {
        iva.b(str.length() == 10);
        String substring = str.substring(0, 4);
        String substring2 = str.substring(4, 7);
        String substring3 = str.substring(7);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 2 + String.valueOf(substring2).length() + String.valueOf(substring3).length());
        sb.append(substring);
        sb.append(" ");
        sb.append(substring2);
        sb.append(" ");
        sb.append(substring3);
        return sb.toString();
    }

    private final void h() {
        err err;
        this.l = true;
        setTheme(R.style.IdentityWhiteAppTheme);
        aE().b(true);
        if (ent.an()) {
            setContentView((int) R.layout.ten_digit_otp_dialog);
            this.j = (TextView) findViewById(R.id.otp_code1);
            this.k = (TextView) findViewById(R.id.otp_code2);
        } else {
            setContentView((int) R.layout.eight_digit_otp_dialog);
            this.i = (TextView) findViewById(R.id.otp_code);
        }
        this.e = findViewById(R.id.otp_wheel);
        this.f = findViewById(R.id.otp_results);
        this.h = findViewById(R.id.otp_error);
        this.g = findViewById(R.id.otp_no_accounts_available);
        if (!ent.an()) {
            err = erm.a(this);
        } else {
            err = new erw(new erk(this), new erv(this));
        }
        this.b = new erq(this, err);
        jmf a2 = new jme(aE(), getTitle()).a();
        this.a = a2;
        a2.a = new ern(this);
        if (this.a.getCount() != 0) {
            this.c = this.a.a();
            this.b.a(this.a.a(), this.d);
            return;
        }
        a(this.g);
    }

    public final void e() {
        a(this.e);
    }

    public final void f() {
        a(this.h);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i2, intent);
        if (i2 == 0 && i3 == -1) {
            this.d = true;
            h();
            return;
        }
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.d = false;
        this.l = false;
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (jkr.b()) {
            z = keyguardManager.isDeviceSecure();
        } else {
            z = keyguardManager.isKeyguardSecure();
        }
        if (ent.an() && z) {
            int i2 = Build.VERSION.SDK_INT;
            startActivityForResult(keyguardManager.createConfirmDeviceCredentialIntent((CharSequence) null, (CharSequence) null), 0);
            return;
        }
        h();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.otp_dialog, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.auth_otp_help_item) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            GoogleHelp a2 = GoogleHelp.a("android_security");
            a2.a((Context) this);
            a2.s = jbn.a(this);
            a2.q = Uri.parse((String) ((amsz) iks.g).a);
            new nyw(this).a(a2.a());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.l) {
            onBackPressed();
        }
        super.onPause();
    }

    public final void a(String str) {
        if (str.length() == 8) {
            String substring = str.substring(0, 4);
            String substring2 = str.substring(4);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 2 + String.valueOf(substring2).length());
            sb.append("‭");
            sb.append(substring);
            sb.append(" ");
            sb.append(substring2);
            str = sb.toString();
        }
        this.i.setText(str);
        a(this.f);
    }

    public final void a(String str, String str2) {
        if (str.length() == 10 && str2.length() == 10) {
            TextView textView = this.j;
            String valueOf = String.valueOf(b(str));
            textView.setText(valueOf.length() == 0 ? new String("‭") : "‭".concat(valueOf));
            TextView textView2 = this.k;
            String valueOf2 = String.valueOf(b(str2));
            textView2.setText(valueOf2.length() == 0 ? new String("‭") : "‭".concat(valueOf2));
            a(this.f);
            return;
        }
        f();
    }
}
