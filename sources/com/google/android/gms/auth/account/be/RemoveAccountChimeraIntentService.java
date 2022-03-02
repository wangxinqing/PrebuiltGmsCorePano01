package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoveAccountChimeraIntentService extends TracingIntentService {
    private static final iwd a = ehv.a("RemoveAccountChimeraIntentService");

    public RemoveAccountChimeraIntentService() {
        super("RemoveAccountIntentService");
    }

    public static Intent a(Context context, Account account) {
        Intent intent = new Intent();
        amrl.a((Object) context);
        Intent putExtra = intent.setClassName(context, "com.google.android.gms.auth.account.be.RemoveAccountIntentService").putExtra("account", account).putExtra("requires_notification", false);
        String valueOf = String.valueOf(account.name);
        return putExtra.setData(Uri.parse(valueOf.length() == 0 ? new String("intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=") : "intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=".concat(valueOf)));
    }

    /* access modifiers changed from: package-private */
    public final void a(AccountManagerFuture accountManagerFuture, iwq iwq, je jeVar, String str, String str2) {
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_google);
            PendingIntent activity = PendingIntent.getActivity(this, 0, (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 134217728);
            gqg.a(iwq, this, "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountRemoved");
            jeVar.e(str);
            jeVar.a(System.currentTimeMillis());
            jeVar.a(-1);
            jeVar.b((CharSequence) str2);
            jd jdVar = new jd();
            jdVar.a((CharSequence) str2);
            jeVar.a((jh) jdVar);
            jeVar.b(17301642);
            jeVar.a(decodeResource);
            jeVar.a(true);
            jeVar.f = activity;
            jeVar.z = "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountRemoved";
            iwq.a("account_removal_notification", 0, jeVar.b());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            a.e("Error getting AccountManagerFuture<Bundle> result bundle", e, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        Intent intent2 = intent;
        Account account = (Account) intent2.getParcelableExtra("account");
        if (account == null) {
            a.f("account was not provided.", new Object[0]);
            return;
        }
        eny eny = (eny) eny.a.b();
        eny.a();
        if (jkr.a()) {
            eny.b.e(account);
        } else {
            eny.b.c(account);
        }
        if (intent2.getBooleanExtra("requires_notification", false)) {
            a(qub.a((Context) this).a(account.type, (String) null, (String[]) null, new Bundle(), (Activity) null, (AccountManagerCallback) null), iwq.a((Context) this), new je(getApplicationContext()), getString(R.string.account_removed_notification_title), String.format(getResources().getString(R.string.account_removed_notification_text), new Object[]{account.name}));
            return;
        }
    }
}
