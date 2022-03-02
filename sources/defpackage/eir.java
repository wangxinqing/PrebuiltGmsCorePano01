package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: eir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eir extends AsyncTask {
    private final Activity a;
    private final String b;
    private final String c;
    private final String d;
    private final Bundle e;
    private final AppDescription f;

    public eir(Activity activity, String str, String str2, String str3, Bundle bundle, AppDescription appDescription) {
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bundle;
        this.f = appDescription;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(PendingIntent pendingIntent) {
        super.onPostExecute(pendingIntent);
        Object[] objArr = {fyk.a(pendingIntent), this.c, this.d, this.f.toString()};
        try {
            this.a.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, (Intent) null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e2) {
            Log.e("GLSActivity", "[TokenActivity] Unable to initiate auth delegate workflow!", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        PACLConfig pACLConfig;
        eka eka = new eka(this.a);
        String str = this.b;
        Account account = null;
        if (str != null) {
            pACLConfig = new PACLConfig(str, (String) null);
        } else {
            pACLConfig = null;
        }
        TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
        String str2 = this.c;
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        }
        tokenWorkflowRequest.i = account;
        tokenWorkflowRequest.c = str2;
        tokenWorkflowRequest.b = this.d;
        tokenWorkflowRequest.a(this.e);
        tokenWorkflowRequest.f = pACLConfig;
        tokenWorkflowRequest.g = this.e.getBoolean("suppressProgressScreen", false);
        tokenWorkflowRequest.h = this.f;
        return eka.a(tokenWorkflowRequest);
    }
}
