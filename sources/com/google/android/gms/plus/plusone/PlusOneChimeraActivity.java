package com.google.android.gms.plus.plusone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusOneChimeraActivity extends FragmentActivity implements DialogInterface.OnClickListener, View.OnClickListener {
    private zae a;
    private Bundle b;
    private String c;
    private boolean d;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            zae zae = this.a;
            Activity activity = zae.getActivity();
            if (activity != null) {
                zae.n = null;
                if (i2 != -1) {
                    activity.setResult(i2);
                    activity.finish();
                    return;
                }
                zae.f.t();
            }
        } else if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            setResult(i2);
            finish();
        } else {
            this.d = false;
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            zae zae = this.a;
            zae.m = (ProgressBar) findViewById(R.id.progress_spinner);
            zae.a(zae.m);
        }
    }

    public final void onBackPressed() {
        zae zae = this.a;
        if (zae != null) {
            zae.a();
        }
        super.onBackPressed();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        String a2 = jhg.a((Activity) this);
        String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.TOKEN");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.intent.extra.URL");
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.plus.intent.extra.EXTRA_SIGNED_UP", false);
        this.c = intent.getStringExtra("com.google.android.gms.plus.intent.extra.ACCOUNT");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(action) || TextUtils.isEmpty(a2)) {
            Log.e("PlusOneActivity", "Intent missing required arguments");
            setResult(0);
            finish();
            return;
        }
        if (this.c == null) {
            this.c = "<<default account>>";
        }
        Bundle bundle2 = new Bundle();
        this.b = bundle2;
        bundle2.putString("PlusOneFragment#mCallingPackage", a2);
        this.b.putString("PlusOneFragment#mAccount", this.c);
        this.b.putString("PlusOneFragment#mUrl", stringExtra2);
        this.b.putBoolean("PlusOneFragment#mApplyPlusOne", "com.google.android.gms.plus.action.PLUS_ONE".equals(action));
        this.b.putString("PlusOneFragment#mToken", stringExtra);
        PlusCommonExtras b2 = PlusCommonExtras.b(intent);
        ykr.a(this, b2, "gppo0");
        if (bundle == null) {
            setResult(0);
            z = !booleanExtra;
            this.d = z;
        } else {
            z = bundle.getBoolean("needs_sign_in");
            this.d = z;
        }
        if (!z) {
            a();
        } else if (bundle == null) {
            int myUid = Process.myUid();
            String str = this.c;
            ClientContext clientContext = new ClientContext(myUid, str, str, a2, getPackageName());
            b2.a(clientContext.i);
            for (String d2 : zae.a) {
                clientContext.d(d2);
            }
            yuf yuf = new yuf(this, clientContext);
            yuf.a = 2;
            startActivityForResult(yuf.a(), 2);
        }
    }

    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.plus_one_error).setNeutralButton(17039370, this).setCancelable(false);
        return builder.create();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        if (!this.d && this.a == null) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("needs_sign_in", this.d);
    }

    private final void a() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenLayout;
        int i2 = configuration.screenLayout & 3;
        int i3 = R.layout.plus_one_activity;
        if (i2 != 0 && (configuration.orientation & 1) == 0) {
            i3 = R.layout.plus_one_activity_constrained;
        }
        setContentView(i3);
        zae zae = (zae) getSupportFragmentManager().findFragmentByTag("PlusOneActivity#Fragment");
        this.a = zae;
        if (zae == null) {
            zae zae2 = new zae();
            this.a = zae2;
            zae2.setArguments(this.b);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.plus_one_container, this.a, "PlusOneActivity#Fragment");
            beginTransaction.commit();
        }
        findViewById(R.id.frame_container).setOnClickListener(this);
        findViewById(R.id.plus_one_container).setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.frame_container) {
            zae zae = this.a;
            if (zae != null) {
                zae.a();
            }
            finish();
        }
    }
}
