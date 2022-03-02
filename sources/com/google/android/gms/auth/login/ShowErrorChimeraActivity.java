package com.google.android.gms.auth.login;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShowErrorChimeraActivity extends ggc implements View.OnClickListener, bdc {
    int a = -1;
    private String m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;
    private gei r;
    private TextView s;
    private Button t;
    private TextView u;
    private SetupWizardNavBar v;

    public static Intent a(String str, String str2, gei gei, boolean z, boolean z2, boolean z3) {
        return new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.login.ShowErrorActivity").putExtra("isCreatingAccount", z).putExtra("detail", str2).putExtra("accountName", str).putExtra("status", gei.ac).putExtra("isAddingAccount", z2).putExtra("allowSkip", z3);
    }

    private final void i() {
        Intent intent;
        if (!this.d) {
            try {
                jni.b(this).b("com.google.android.apps.enterprise.dmagent", 32768);
                PackageManager packageManager = getPackageManager();
                if (packageManager.getApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent") == 4) {
                    packageManager.setApplicationEnabledSetting("com.google.android.apps.enterprise.dmagent", 0, 1);
                }
                intent = Intent.makeMainActivity(new ComponentName("com.google.android.apps.enterprise.dmagent", "com.google.android.apps.enterprise.dmagent.DMAgentActivity"));
                if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                    Log.w("GLSActivity", String.format("Couldn't find activity %s attempting to enable %s", new Object[]{"com.google.android.apps.enterprise.dmagent.DMAgentActivity", "com.google.android.apps.enterprise.dmagent"}));
                    intent = itg.b("com.google.android.apps.enterprise.dmagent");
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GLSActivity", "Couldn't find package com.google.android.apps.enterprise.dmagent");
                intent = itg.b("com.google.android.apps.enterprise.dmagent");
            }
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                Log.e("GLSActivity", "Market not found for dmagent");
            }
        }
        setResult(1);
        finish();
    }

    public final void a() {
    }

    public final void b() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1021) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        setResult(-1);
        finish();
    }

    public void onClick(View view) {
        gei gei = this.r;
        this.r = gei.SUCCESS;
        int ordinal = gei.ordinal();
        if (ordinal != 1) {
            if (ordinal != 5) {
                if (ordinal != 8) {
                    switch (ordinal) {
                        case 27:
                            break;
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                    }
                } else if (this.p && view == this.u) {
                    setResult(1);
                    finish();
                    return;
                }
                if (view != this.u) {
                    setResult(this.a);
                } else {
                    setResult(0);
                }
                finish();
                return;
            }
            setResult(0);
            finish();
            return;
        }
        i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f7, code lost:
        if (r0 == 1) goto L_0x0328;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            java.lang.String r0 = "com.google.android.apps.enterprise.dmagent"
            super.onCreate(r11)
            if (r11 != 0) goto L_0x0013
            android.content.Intent r11 = r10.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            r10.a((android.os.Bundle) r11)
            goto L_0x0016
        L_0x0013:
            r10.a((android.os.Bundle) r11)
        L_0x0016:
            r11 = 0
            r10.setResult(r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            alkg r1 = new alkg
            r1.<init>(r10)
            r10.setContentView((android.view.View) r1)
            r2 = 2131624115(0x7f0e00b3, float:1.88754E38)
            r3 = 2131952240(0x7f130270, float:1.9540917E38)
            r1.a((int) r3, (int) r2)
            com.android.setupwizard.navigationbar.SetupWizardNavBar r1 = r10.v
            android.widget.Button r1 = r1.a
            r10.t = r1
            r1.setOnClickListener(r10)
            boolean r1 = r10.q
            r2 = 4
            if (r1 == 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            android.widget.Button r1 = r10.t
            r1.setVisibility(r2)
        L_0x0042:
            com.android.setupwizard.navigationbar.SetupWizardNavBar r1 = r10.v
            android.widget.Button r1 = r1.b
            r10.u = r1
            r1.setOnClickListener(r10)
            android.widget.TextView r1 = r10.u
            r1.setVisibility(r2)
            r1 = 2131428137(0x7f0b0329, float:1.847791E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.s = r1
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r2 = "title"
            java.lang.String r2 = r1.getStringExtra(r2)
            if (r2 == 0) goto L_0x006a
            r10.setTitle((java.lang.CharSequence) r2)
        L_0x006a:
            java.lang.String r2 = "label"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 == 0) goto L_0x0078
            android.widget.Button r2 = r10.t
            r2.setText(r1)
        L_0x0078:
            gei r1 = r10.r
            fyo r1 = defpackage.fyo.a((defpackage.gei) r1)
            gei r2 = defpackage.gei.CLIENT_LOGIN_DISABLED
            gei r2 = r10.r
            int r2 = r2.ordinal()
            r4 = 1
            if (r2 == r4) goto L_0x02e1
            r5 = 2131951958(0x7f130156, float:1.9540345E38)
            r6 = 2131951957(0x7f130155, float:1.9540343E38)
            r7 = 5
            if (r2 == r7) goto L_0x0254
            r8 = 8
            if (r2 == r8) goto L_0x01ca
            r3 = 10
            r8 = 6
            r9 = 2131952129(0x7f130201, float:1.9540692E38)
            if (r2 == r3) goto L_0x01b5
            r3 = 12
            if (r2 == r3) goto L_0x0191
            r3 = 18
            if (r2 == r3) goto L_0x0147
            r3 = 41
            if (r2 == r3) goto L_0x011c
            r3 = 52
            if (r2 == r3) goto L_0x010e
            r3 = 37
            if (r2 == r3) goto L_0x00f1
            r3 = 38
            if (r2 == r3) goto L_0x0254
            r3 = 45
            if (r2 == r3) goto L_0x0254
            r3 = 46
            if (r2 == r3) goto L_0x0254
            switch(r2) {
                case 14: goto L_0x0147;
                case 15: goto L_0x0147;
                case 16: goto L_0x0147;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            switch(r2) {
                case 27: goto L_0x00c6;
                case 28: goto L_0x02e1;
                case 29: goto L_0x02e1;
                case 30: goto L_0x02e1;
                case 31: goto L_0x02e1;
                case 32: goto L_0x02e1;
                case 33: goto L_0x02e1;
                case 34: goto L_0x02e1;
                case 35: goto L_0x02e1;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            goto L_0x0149
        L_0x00c6:
            r0 = 2131952275(0x7f130293, float:1.9540988E38)
            java.lang.CharSequence r0 = r10.getText(r0)
            java.lang.String r0 = r0.toString()
            android.widget.Button r1 = r10.t
            r1.setText(r0)
            r0 = 2131951912(0x7f130128, float:1.9540252E38)
            java.lang.CharSequence r0 = r10.getText(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r4]
            java.lang.String r2 = r10.m
            r1[r11] = r2
            java.lang.CharSequence r11 = android.text.TextUtils.expandTemplate(r0, r1)
            java.lang.String r11 = r11.toString()
            android.widget.TextView r0 = r10.s
            r0.setText(r11)
            return
        L_0x00f1:
            android.widget.TextView r0 = r10.s
            r1 = 2131951872(0x7f130100, float:1.954017E38)
            java.lang.CharSequence r1 = r10.getText(r1)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r4]
            java.lang.String r3 = r10.m
            r2[r11] = r3
            java.lang.CharSequence r11 = android.text.TextUtils.expandTemplate(r1, r2)
            java.lang.String r11 = r11.toString()
            r0.setText(r11)
            r10.a = r7
            return
        L_0x010e:
            java.lang.String r11 = r10.getString(r6)
            r10.a((java.lang.CharSequence) r11)
            android.widget.TextView r11 = r10.s
            r11.setText(r5)
            return
        L_0x011c:
            android.widget.TextView r0 = r10.s
            r1 = 2131951881(0x7f130109, float:1.954019E38)
            java.lang.CharSequence r1 = r10.getText(r1)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r4]
            java.lang.String r3 = r10.m
            r2[r11] = r3
            java.lang.CharSequence r11 = android.text.TextUtils.expandTemplate(r1, r2)
            java.lang.String r11 = r11.toString()
            r0.setText(r11)
            r11 = 2131951882(0x7f13010a, float:1.9540191E38)
            java.lang.CharSequence r11 = r10.getText(r11)
            java.lang.String r11 = r11.toString()
            r10.a((java.lang.CharSequence) r11)
            r10.a = r7
            return
        L_0x0147:
            r10.a = r4
        L_0x0149:
            int r11 = r1.d
            if (r11 == 0) goto L_0x015b
            android.widget.TextView r0 = r10.s
            java.lang.CharSequence r11 = r10.getText(r11)
            java.lang.String r11 = r11.toString()
            r0.setText(r11)
            return
        L_0x015b:
            java.lang.String r11 = r10.n
            if (r11 != 0) goto L_0x018b
            android.widget.TextView r11 = r10.s
            r11.setText(r5)
            java.lang.String r11 = r10.getString(r6)
            r10.a((java.lang.CharSequence) r11)
            gei r11 = r10.r
            java.lang.String r11 = r11.ac
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "GAIA ERROR WITH NO RESOURCE STRING "
            int r1 = r11.length()
            if (r1 != 0) goto L_0x0181
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
            goto L_0x0185
        L_0x0181:
            java.lang.String r11 = r0.concat(r11)
        L_0x0185:
            java.lang.String r0 = "GLSActivity"
            android.util.Log.w(r0, r11)
            return
        L_0x018b:
            android.widget.TextView r0 = r10.s
            r0.setText(r11)
            return
        L_0x0191:
            android.widget.TextView r0 = r10.u
            r0.setVisibility(r11)
            android.widget.TextView r0 = r10.u
            r0.setText(r9)
            r10.a = r8
            java.lang.String r0 = r10.n
            if (r0 == 0) goto L_0x01b1
            android.widget.TextView r1 = r10.s
            r1.setText(r0)
            android.widget.TextView r0 = r10.u
            r0.setVisibility(r11)
            android.widget.TextView r11 = r10.u
            r11.setText(r9)
            return
        L_0x01b1:
            r10.finish()
            return
        L_0x01b5:
            android.widget.TextView r0 = r10.u
            r0.setVisibility(r11)
            android.widget.TextView r11 = r10.u
            r11.setText(r9)
            android.widget.TextView r11 = r10.s
            r0 = 2131951877(0x7f130105, float:1.954018E38)
            r11.setText(r0)
            r10.a = r8
            return
        L_0x01ca:
            java.lang.String r0 = r10.getString(r3)
            r10.setTitle((java.lang.CharSequence) r0)
            android.widget.TextView r0 = r10.u
            r0.setVisibility(r11)
            android.widget.Button r0 = r10.t
            r1 = 2131952334(0x7f1302ce, float:1.9541108E38)
            r0.setText(r1)
            boolean r0 = r10.p
            if (r0 == 0) goto L_0x01f8
            android.widget.TextView r11 = r10.s
            r0 = 2131951876(0x7f130104, float:1.9540179E38)
            java.lang.String r0 = r10.getString(r0)
            r11.setText(r0)
            android.widget.TextView r11 = r10.u
            r0 = 2131952319(0x7f1302bf, float:1.9541077E38)
            r11.setText(r0)
            goto L_0x0251
        L_0x01f8:
            android.widget.TextView r0 = r10.s
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2131951921(0x7f130131, float:1.954027E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getLanguage()
            r2[r11] = r3
            java.lang.String r3 = "https://www.google.com/accounts/recovery/?hl=%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            int r1 = r3.length()
            java.lang.Class<android.text.Annotation> r4 = android.text.Annotation.class
            java.lang.Object[] r1 = r3.getSpans(r11, r1, r4)
            android.text.Annotation[] r1 = (android.text.Annotation[]) r1
            r1 = r1[r11]
            int r4 = r3.getSpanStart(r1)
            int r5 = r3.getSpanEnd(r1)
            r3.removeSpan(r1)
            com.google.android.gms.common.ui.URLSpanNoUnderline r1 = new com.google.android.gms.common.ui.URLSpanNoUnderline
            r1.<init>(r2)
            r3.setSpan(r1, r4, r5, r11)
            r0.setText(r3)
            android.widget.TextView r11 = r10.s
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r0)
            android.widget.TextView r11 = r10.u
            r0 = 2131952134(0x7f130206, float:1.9540702E38)
            r11.setText(r0)
        L_0x0251:
            r10.a = r7
            return
        L_0x0254:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r1 = 2131951928(0x7f130138, float:1.9540284E38)
            r2 = 0
            if (r0 == 0) goto L_0x02a8
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L_0x026e
            goto L_0x02a8
        L_0x026e:
            gei r0 = r10.r
            gei r3 = defpackage.gei.NETWORK_ERROR
            if (r0 != r3) goto L_0x029b
            r0 = 205004(0x320cc, float:2.87272E-40)
            java.lang.String r2 = (java.lang.String) r2
            android.util.EventLog.writeEvent(r0, r2)
            android.widget.TextView r0 = r10.s
            boolean r2 = defpackage.fyj.a()
            if (r2 != 0) goto L_0x0288
            r1 = 2131951925(0x7f130135, float:1.9540278E38)
            goto L_0x0289
        L_0x0288:
        L_0x0289:
            java.lang.String r1 = r10.getString(r1)
            r0.setText(r1)
            r0 = 2131953603(0x7f1307c3, float:1.9543682E38)
            java.lang.String r0 = r10.getString(r0)
            r10.a((java.lang.CharSequence) r0)
            goto L_0x02ce
        L_0x029b:
            android.widget.TextView r0 = r10.s
            r0.setText(r5)
            java.lang.String r0 = r10.getString(r6)
            r10.a((java.lang.CharSequence) r0)
            goto L_0x02ce
        L_0x02a8:
            r0 = 205006(0x320ce, float:2.87275E-40)
            java.lang.String r2 = (java.lang.String) r2
            android.util.EventLog.writeEvent(r0, r2)
            android.widget.TextView r0 = r10.s
            boolean r2 = defpackage.fyj.a()
            if (r2 != 0) goto L_0x02bc
            r1 = 2131951927(0x7f130137, float:1.9540282E38)
            goto L_0x02bd
        L_0x02bc:
        L_0x02bd:
            java.lang.String r1 = r10.getString(r1)
            r0.setText(r1)
            r0 = 2131951926(0x7f130136, float:1.954028E38)
            java.lang.String r0 = r10.getString(r0)
            r10.a((java.lang.CharSequence) r0)
        L_0x02ce:
            boolean r0 = r10.d
            if (r0 == 0) goto L_0x02de
            com.android.setupwizard.navigationbar.SetupWizardNavBar r0 = r10.v
            if (r0 == 0) goto L_0x02de
            android.widget.TextView r0 = r10.u
            r0.setVisibility(r11)
            r10.a = r4
            return
        L_0x02de:
            r10.a = r11
            return
        L_0x02e1:
            boolean r1 = r10.d
            if (r1 != 0) goto L_0x0328
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02fc }
            r1.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x02fc }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x02fa }
            int r0 = r1.getApplicationEnabledSetting(r0)     // Catch:{ IllegalArgumentException -> 0x02fa }
            if (r0 != 0) goto L_0x02f7
            goto L_0x0328
        L_0x02f7:
            if (r0 == r4) goto L_0x0328
            goto L_0x02fd
        L_0x02fa:
            r0 = move-exception
            goto L_0x02fd
        L_0x02fc:
            r0 = move-exception
        L_0x02fd:
            r0 = 2131952169(0x7f130229, float:1.9540773E38)
            java.lang.CharSequence r0 = r10.getText(r0)
            java.lang.String r0 = r0.toString()
            android.widget.Button r1 = r10.t
            r1.setText(r0)
            r0 = 2131951905(0x7f130121, float:1.9540238E38)
            java.lang.CharSequence r0 = r10.getText(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r4]
            java.lang.String r2 = r10.m
            r1[r11] = r2
            java.lang.CharSequence r11 = android.text.TextUtils.expandTemplate(r0, r1)
            java.lang.String r11 = r11.toString()
            android.widget.TextView r0 = r10.s
            r0.setText(r11)
            return
        L_0x0328:
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.login.ShowErrorChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("accountName", this.m);
        bundle.putBoolean("isCreatingAccount", this.o);
        bundle.putBoolean("isAddingAccount", this.p);
        bundle.putBoolean("allowSkip", this.q);
        bundle.putString("detail", this.n);
        bundle.putString("status", this.r.ac);
    }

    public final void setTitle(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        ((TextView) findViewById(R.id.title)).setText(charSequence);
    }

    public final void a(Bundle bundle) {
        this.m = bundle.getString("accountName");
        this.o = bundle.getBoolean("isCreatingAccount");
        this.p = bundle.getBoolean("isAddingAccount");
        this.q = bundle.getBoolean("allowSkip");
        this.n = bundle.getString("detail");
        this.r = fyo.a(bundle.getString("status"));
    }

    public final void a(SetupWizardNavBar setupWizardNavBar) {
        this.v = setupWizardNavBar;
        boolean z = this.e;
        setupWizardNavBar.a(z, z);
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            TextView textView = (TextView) findViewById(R.id.submission_title);
            if (charSequence.equals(getString(R.string.auth_submission_title))) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
