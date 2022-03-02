package com.google.android.gms.auth.login;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsernamePasswordChimeraActivity extends ggc implements View.OnFocusChangeListener, bdc {
    protected EditText a;
    protected EditText m;
    public boolean n;
    public boolean o;
    protected String p = "";
    protected String q = "";
    private View r;
    private View s;
    private boolean t;
    private long u;
    private String v;
    private String w;
    private boolean x;
    private boolean y;

    private final String b(String str) {
        String str2;
        Resources resources = getResources();
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else if (!str.contains("@")) {
            String valueOf = String.valueOf(str);
            String string = resources.getString(R.string.auth_gmail_host_name);
            if (fyj.a() && "de".equalsIgnoreCase(iqi.a(this, "device_country", (String) null))) {
                string = resources.getString(R.string.auth_googlemail_host_name);
            }
            if (string != null) {
                String valueOf2 = String.valueOf(string);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                throw new IllegalStateException("Couldn't find gmail_host_name");
            }
        }
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (!ggc.a(str)) {
                    String[] split = str.split("@");
                    if (split.length == 2 && ggc.a(split[1])) {
                        str2 = split[1];
                    }
                } else {
                    str2 = str;
                }
                if (str2.length() <= 0 || str.trim().indexOf(64) <= 0) {
                    return null;
                }
            }
            str2 = "";
            return null;
        }
        return str;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        if (this.x) {
            this.v = this.a.getText().toString();
        }
        this.w = this.m.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("account_name", this.v);
        intent.putExtra("password", this.w);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return true;
    }

    public final void f() {
        boolean z;
        boolean z2;
        Editable text = this.a.getText();
        Editable text2 = this.m.getText();
        boolean z3 = true;
        if (this.n || TextUtils.isEmpty(text) || b(text.toString()) == null) {
            z = false;
        } else {
            z = true;
        }
        if (!this.x) {
            z = true;
        }
        if (this.o || TextUtils.isEmpty(text2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            z3 = false;
        } else if (!z2) {
            z3 = false;
        }
        View view = this.r;
        if (view != null) {
            view.setEnabled(z3);
            this.r.setFocusable(z3);
        }
    }

    public final void i() {
        setResult(6);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.v = bundle.getString("account_name");
        this.w = bundle.getString("password");
        this.x = bundle.getBoolean("is_adding_account", false);
        this.y = bundle.getBoolean("is_confirming_credentials", false);
        if (!TextUtils.isEmpty(this.v)) {
            this.p = this.v;
        }
        int i = Build.VERSION.SDK_INT;
        alkg alkg = new alkg(this);
        setContentView((View) alkg);
        alkg.a((int) R.string.common_login_error_title, (int) R.layout.auth_login_activity_content);
        ((TextView) findViewById(R.id.browser_signin_button)).setOnClickListener(new ggy(this));
        this.a = (EditText) findViewById(R.id.username_edit);
        this.m = (EditText) findViewById(R.id.password_edit);
        if (this.x) {
            this.a.setFilters(new InputFilter[]{new ggz(this)});
            this.a.setOnFocusChangeListener(this);
            this.a.addTextChangedListener(this);
            String str = this.v;
            if (str != null) {
                this.a.setText(str);
                this.m.requestFocus();
                this.t = true;
            } else {
                this.a.requestFocus();
            }
        } else {
            if (!this.y) {
                ((TextView) findViewById(R.id.title)).setText(R.string.auth_relogin_activity_title);
            }
            this.a.setVisibility(8);
            TextView textView = (TextView) findViewById(R.id.username_fixed);
            textView.setText(this.v);
            textView.setVisibility(0);
            this.m.requestFocus();
        }
        this.m.setFilters(new InputFilter[]{new gha(this)});
        this.m.setOnFocusChangeListener(this);
        this.m.addTextChangedListener(this);
        a(this.m, false);
        if (TextUtils.isEmpty(this.a.getText())) {
            this.a.setText(this.p);
        }
        if (TextUtils.isEmpty(this.m.getText())) {
            this.m.setText(this.q);
        }
        f();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem add = menu.add(0, 1, 0, R.string.auth_sign_in_browser);
        add.setIcon(R.drawable.auth_ic_menu_account);
        if (fyj.c != null) {
            try {
                fyj.c.invoke(add, new Object[]{4});
            } catch (Exception e) {
            }
        }
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        EditText editText = this.a;
        if (view != editText || z || !this.x) {
            EditText editText2 = this.m;
            if (view == editText2 && !z) {
                if (this.o) {
                    editText2.setError(getText(R.string.auth_invalid_password_character));
                } else if (TextUtils.isEmpty(editText2.getText().toString())) {
                    this.m.setError(getText(R.string.auth_field_cant_be_blank));
                }
            }
        } else if (!this.n) {
            String obj = editText.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                this.a.setError(getText(R.string.auth_field_cant_be_blank));
                return;
            }
            String b = b(obj);
            if (b != null) {
                this.a.setText(b);
                this.a.setError((CharSequence) null);
                return;
            }
            this.a.setError(getString(R.string.auth_invalid_username));
        } else {
            editText.setError(getString(R.string.auth_invalid_login_character));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 1) {
            i();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.u = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getText().length() == 0) {
                this.a.setText(this.p);
            }
            EditText editText2 = this.a;
            editText2.setTextKeepState(editText2.getText());
            f();
            this.a.setError((CharSequence) null);
            if (System.currentTimeMillis() - this.u > 1000) {
                this.m.setTextKeepState(this.q);
                if (this.t) {
                    this.m.requestFocus();
                } else {
                    this.a.requestFocus();
                }
            }
            if (TextUtils.isEmpty(this.q)) {
                this.o = false;
                this.m.setError((CharSequence) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.v);
        bundle.putString("password", this.w);
        bundle.putBoolean("is_adding_account", this.x);
        bundle.putBoolean("is_confirming_credentials", this.y);
    }

    public final void a(SetupWizardNavBar setupWizardNavBar) {
        Button button = setupWizardNavBar.a;
        this.r = button;
        a(button, true);
        Button button2 = setupWizardNavBar.b;
        this.s = button2;
        if (button2 != null) {
            button2.setOnClickListener(this.k);
            this.h = true;
        }
        boolean z = this.e;
        setupWizardNavBar.a(z, z);
    }
}
