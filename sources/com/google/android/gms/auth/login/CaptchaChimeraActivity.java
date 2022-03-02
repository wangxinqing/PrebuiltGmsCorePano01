package com.google.android.gms.auth.login;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CaptchaChimeraActivity extends ggc implements View.OnClickListener, bdc {
    private EditText a;
    private Button m;
    private Button n;
    private ImageView o;
    private Bitmap p;

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        String obj = this.a.getText().toString();
        setResult(-1, new Intent().putExtra("answer", obj).setAction(obj));
        finish();
    }

    public final void f() {
        boolean z = !TextUtils.isEmpty(this.a.getText());
        this.m.setEnabled(z);
        this.m.setFocusable(z);
    }

    public void onClick(View view) {
        if (view == this.n) {
            setResult(1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.p = (Bitmap) getIntent().getExtras().getParcelable("bitmap");
        } else {
            this.p = (Bitmap) bundle.getParcelable("bitmap");
        }
        int i = Build.VERSION.SDK_INT;
        alkg alkg = new alkg(this);
        setContentView((View) alkg);
        alkg.a((int) R.string.auth_ui_activity_authenticating, (int) R.layout.auth_captcha_activity_content);
        ImageView imageView = (ImageView) findViewById(R.id.captcha_image_view);
        this.o = imageView;
        imageView.setImageBitmap(this.p);
        EditText editText = (EditText) findViewById(R.id.captcha_answer_edit);
        this.a = editText;
        editText.addTextChangedListener(this);
        a(this.a, false);
        f();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("bitmap", this.p);
    }

    public final void a(SetupWizardNavBar setupWizardNavBar) {
        this.m = setupWizardNavBar.a;
        this.n = setupWizardNavBar.b;
        boolean z = this.e;
        setupWizardNavBar.a(z, z);
        this.n.setOnClickListener(this);
        a(this.m, true);
    }
}
