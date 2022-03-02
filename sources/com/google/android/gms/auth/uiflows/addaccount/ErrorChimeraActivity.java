package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ErrorChimeraActivity extends gnx implements fyz {
    public static final fzk a = fzk.a("title_res_id");
    public static final fzk b = fzk.a("message");
    public static final fzk c = fzk.a("back_visibility");
    public static final fzk d = fzk.a("back_label_res_id");
    public static final fzk e = fzk.a("is_setup_wizard");
    private fza f;

    public static Intent a(Context context, int i, int i2) {
        return a(context, "com.google.android.gms.auth.uiflows.addaccount.ErrorActivity", i, context.getString(i2));
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "ErrorActivity";
    }

    public final void onBackPressed() {
        a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        boolean z = true;
        if (!ekh.a.b(this)) {
            boolean a2 = ijm.a(g().a);
            LayoutInflater from = LayoutInflater.from(this);
            if (!a2) {
                i = R.layout.auth_generic_suw_activity;
            } else {
                i = R.layout.auth_generic_suw_glif_activity;
            }
            fza fza = (fza) from.inflate(i, (ViewGroup) null, false);
            this.f = fza;
            ijm.a((ViewGroup) fza);
            if (awku.c()) {
                this.m = (fzd) this.f;
            }
            this.f.a(getText(((Integer) f().a(a)).intValue()));
            this.f.b((CharSequence) f().a(b));
            Integer num = (Integer) f().a(c);
            if (num != null) {
                fza fza2 = this.f;
                if (num.intValue() != 0) {
                    z = false;
                }
                fza2.a(z);
            }
            Integer num2 = (Integer) f().a(d);
            if (num2 != null) {
                this.f.c(getText(num2.intValue()));
            }
            this.f.a((fyz) this);
            setContentView((View) this.f);
        } else if (!((Boolean) f().a(e, false)).booleanValue() || !jkr.g()) {
            setTheme(R.style.TvMinuteMaidOpaque);
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_glif_error_activity, (ViewGroup) null));
            ((TextView) findViewById(R.id.title)).setText(getText(((Integer) f().a(a)).intValue()));
            ((TextView) findViewById(R.id.message)).setText((CharSequence) f().a(b));
            TextView textView = (TextView) findViewById(R.id.button);
            textView.setText(R.string.auth_device_management_go_back);
            textView.setOnClickListener(new glv(this));
        } else {
            a(0, new Intent().putExtra("ERROR_OCCURRED", true));
        }
    }

    public static Intent a(Context context, CharSequence charSequence) {
        return a(context, "com.google.android.gms.auth.uiflows.addaccount.ErrorActivity", R.string.common_login_error_title, charSequence);
    }

    protected static Intent a(Context context, String str, int i, CharSequence charSequence) {
        Intent className = new Intent().setClassName(context, str);
        fzl fzl = new fzl();
        fzl.b(a, Integer.valueOf(i));
        fzl.b(b, charSequence);
        fzl.b(c, 0);
        return className.putExtras(fzl.a);
    }

    public final void a() {
        a(-1, (Intent) null);
    }
}
