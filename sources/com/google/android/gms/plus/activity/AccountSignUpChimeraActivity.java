package com.google.android.gms.plus.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountSignUpChimeraActivity extends FragmentActivity implements ica, icb {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public String e;
    public PendingIntent f;
    public String g;
    public String h;
    public yli i;
    public PlusCommonExtras j;
    private String[] k;
    private final ylc[] l = {new yky(this), new ykx(this), new ykw(this), new yku(this), new ykv(this), new ylb(this), new yla(this)};

    private static void a(Context context, String str, String str2) {
        if (str != null && str2 != null) {
            izr.a(context, str, (String) null, iba.a, ibb.a, str2);
            izr.a(context, str, ibb.a, ibb.b, str2);
        }
    }

    private final void b() {
        if (this.g == null && Log.isLoggable("AccountSignUpActivity", 6)) {
            Log.e("AccountSignUpActivity", "Resolution intents must be called with startIntentSenderForResult");
        }
        a(this, this.a, this.g, iba.c);
        setResult(0);
        finish();
    }

    private final int c() {
        int i2 = 0;
        while (true) {
            ylc[] ylcArr = this.l;
            int length = ylcArr.length;
            if (i2 >= 7) {
                return 7;
            }
            if (!ylcArr[i2].c()) {
                return i2;
            }
            i2++;
        }
    }

    public final void g(Bundle bundle) {
        a();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 == 2) {
                izr.a((Context) this, this.a, i3 != -1 ? iba.c : iba.b, iar.b, ibb.b, this.g);
                if (i3 == -1) {
                    this.d = 0;
                    a();
                    return;
                }
                b();
            } else if (i2 == 3) {
                String str = this.a;
                if (str != null) {
                    izr.a((Context) this, str, i3 != -1 ? iba.c : iba.b, ibb.d, ibb.b, this.g);
                }
                if (i3 == -1) {
                    this.f = null;
                    this.e = null;
                    this.c = true;
                    a();
                    return;
                }
                b();
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("invalid request code: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        } else if (i3 == -1) {
            String stringExtra = intent.getStringExtra("authAccount");
            this.a = stringExtra;
            a(this, stringExtra, this.g);
            izr.a((Context) this, this.a, iba.b, ibb.c, ibb.b, this.g);
            this.c = true;
            a();
        } else {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (jgu.e(this)) {
            Log.w("AccountSignUpActivity", "This activity is not available for restricted profile.");
            b();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (bundle != null) {
            int i2 = bundle.getInt("stateIndex");
            ylc[] ylcArr = this.l;
            int length = ylcArr.length;
            if (i2 < 7 && !ylcArr[i2].b()) {
                this.l[i2].c = true;
            }
            this.c = bundle.getBoolean("shouldSetDefaultAccount", false);
            extras = bundle;
        } else {
            if (extras == null) {
                extras = new Bundle();
            }
            String a2 = jhg.a((Activity) this);
            this.g = a2;
            if (a2 == null) {
                b();
                return;
            } else if (!getPackageName().equals(this.g)) {
                String string = extras.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
                String string2 = extras.getString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME");
                if ((string != null && !string.equals(this.g)) || (string2 != null && !string2.equals(this.g))) {
                    hya.a((Context) this).a(this.g);
                }
            }
        }
        if ("com.google.android.gms.common.oob.OOB_SIGN_UP".equals(getIntent().getAction())) {
            this.g = jhg.a((Activity) this);
            if (hya.a((Context) this).b(this.g)) {
                this.b = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME");
                this.a = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME");
                this.h = this.g;
            } else {
                throw new SecurityException("com.google.android.gms.common.oob.OOB_SIGN_UP is only available to first-party clients");
            }
        } else {
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                this.g = extras.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            }
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME")) {
                this.h = extras.getString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME");
            } else {
                this.h = this.g;
            }
            this.a = extras.getString("authAccount");
        }
        PlusCommonExtras b2 = PlusCommonExtras.b(getIntent());
        this.j = b2;
        ykr.a(this, b2, "gpsi0");
        if (this.h == null) {
            b();
        } else {
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE")) {
                this.d = extras.getInt("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE");
            } else {
                this.d = 2;
            }
            this.k = null;
            if (extras.containsKey("request_visible_actions")) {
                this.k = extras.getStringArray("request_visible_actions");
            }
            this.e = extras.getString("com.google.android.gms.plus.intent.extra.AUTH_SCOPE_STRING");
            this.f = (PendingIntent) extras.getParcelable("com.google.android.gms.plus.intent.extra.AUTH_TOKEN_INTENT");
        }
        if (bundle == null && (str = this.a) != null) {
            a(this, str, this.g);
        }
        this.i = new yli(this, this, this, this.k);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        znf znf = (znf) supportFragmentManager.findFragmentByTag("progress_dialog");
        if (znf != null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.detach(znf);
            beginTransaction.commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        String string = getString(R.string.plus_loading);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((znf) supportFragmentManager.findFragmentByTag("progress_dialog")) == null) {
            znf a2 = znf.a((CharSequence) string);
            a2.setStyle(1, 2132019132);
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add((Fragment) a2, "progress_dialog");
            beginTransaction.commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        yue.a(bundle, this.a, this.g, this.h, this.d, this.e, this.k, this.f);
        int c2 = c();
        bundle.putInt("stateIndex", c2);
        ylc[] ylcArr = this.l;
        int length = ylcArr.length;
        boolean z = true;
        if (c2 < 7 && !ylcArr[c2].c) {
            z = false;
        }
        iva.a(z);
        bundle.putBoolean("shouldSetDefaultAccount", this.c);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        yli yli = this.i;
        if (yli != null) {
            yli.t();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        yli yli = this.i;
        if (yli != null) {
            yli.j();
        }
    }

    private static void a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        if (str != null && str2 != null) {
            izr.a(context, str, (String) null, favaDiagnosticsEntity, ibb.b, str2);
            izr.a(context, str, ibb.b, ibb.a, str2);
        }
    }

    public final void a() {
        int c2 = c();
        ylc[] ylcArr = this.l;
        int length = ylcArr.length;
        if (c2 < 7) {
            ylc ylc = ylcArr[c2];
            if (!ylc.c) {
                ylc.a();
                return;
            }
            return;
        }
        a(this, this.a, this.g, iba.b);
        setResult(-1);
        finish();
    }

    public final void a(int i2) {
        int c2 = c();
        ylc[] ylcArr = this.l;
        int length = ylcArr.length;
        if (c2 < 7 && ylcArr[c2].b()) {
            this.l[c2].c = false;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        b();
    }

    public final void a(String str) {
        Toast.makeText(this, str, 1).show();
        b();
    }
}
