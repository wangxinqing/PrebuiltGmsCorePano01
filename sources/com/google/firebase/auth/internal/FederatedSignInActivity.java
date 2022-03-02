package com.google.firebase.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FederatedSignInActivity extends gl {
    public static Runnable k;
    private static long l = 0;
    private static final apvv n = apvv.a;
    private static Handler o;
    private boolean m = false;

    private final void a(Status status) {
        l = 0;
        this.m = false;
        Intent intent = new Intent();
        apvy.a(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!alv.a((Context) this).a(intent)) {
            n.a(getApplicationContext(), status);
        } else {
            n.a(this);
        }
        finish();
    }

    private final void f() {
        Intent intent = new Intent("com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN");
        intent.setPackage("com.google.android.gms");
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("com.google.firebase.auth.internal.OPERATION", getIntent().getAction());
        try {
            startActivityForResult(intent, 40963);
        } catch (ActivityNotFoundException e) {
            Log.w("IdpSignInActivity", "Could not launch web sign-in Intent. Google Play service is unavailable");
            a(new Status(17499, "Could not launch web sign-in Intent. Google Play service is unavailable"));
        }
    }

    public final void e() {
        l = 0;
        this.m = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!alv.a((Context) this).a(intent)) {
            n.a(this, apvs.a("WEB_CONTEXT_CANCELED"));
        } else {
            n.a(this);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.SIGN_IN".equals(action) || "com.google.firebase.auth.internal.LINK".equals(action) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - l < 30000) {
                Log.e("IdpSignInActivity", "Could not start operation - already in progress");
                return;
            }
            l = currentTimeMillis;
            if (bundle != null) {
                this.m = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        Log.e("IdpSignInActivity", valueOf.length() == 0 ? new String("Could not do operation - unknown action: ") : "Could not do operation - unknown action: ".concat(valueOf));
        e();
    }

    public final void onNewIntent(Intent intent) {
        Runnable runnable;
        super.onNewIntent(intent);
        Handler handler = o;
        if (!(handler == null || (runnable = k) == null)) {
            handler.removeCallbacks(runnable);
            k = null;
        }
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if ("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED".equals(intent.getAction())) {
            Log.e("IdpSignInActivity", "Web sign-in failed, finishing");
            if (apvy.a(intent)) {
                a(apvy.b(intent));
            } else {
                e();
            }
        } else {
            if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION") && intent.hasExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST")) {
                String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                if ("com.google.firebase.auth.internal.SIGN_IN".equals(stringExtra) || "com.google.firebase.auth.internal.LINK".equals(stringExtra) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(stringExtra)) {
                    VerifyAssertionRequest verifyAssertionRequest = (VerifyAssertionRequest) ivy.a(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", VerifyAssertionRequest.CREATOR);
                    String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID");
                    verifyAssertionRequest.n = stringExtra2;
                    l = 0;
                    this.m = false;
                    Intent intent2 = new Intent();
                    ivy.a((SafeParcelable) verifyAssertionRequest, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", stringExtra);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!alv.a((Context) this).a(intent2)) {
                        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit.putString("verifyAssertionRequest", ivy.b(verifyAssertionRequest));
                        edit.putString("operation", stringExtra);
                        edit.putString("tenantId", stringExtra2);
                        edit.putLong("timestamp", System.currentTimeMillis());
                        edit.commit();
                    } else {
                        n.a(this);
                    }
                    finish();
                    return;
                }
            }
            if (this.m) {
                k = new apvu(this);
                if (o == null) {
                    o = new qvr();
                }
                o.postDelayed(k, 800);
                return;
            }
            f();
            this.m = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.m);
    }
}
