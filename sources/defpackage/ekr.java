package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: ekr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekr {
    private static final iwd c = ehv.a("ReauthNotificationManager");
    public final Context a;
    public final fzp b;
    private final iwq d;
    private final qub e;
    private final eka f;
    private final fys g = ((fys) fys.d.b());

    public ekr(Context context) {
        iwq a2 = iwq.a(context);
        qub a3 = qub.a(context);
        fzp fzp = new fzp(context);
        eka eka = new eka(context);
        this.a = context;
        this.d = a2;
        this.e = a3;
        this.b = fzp;
        this.f = eka;
    }

    public static String d(Account account) {
        return String.format("%s:%s:%s", new Object[]{"com.google.android.gms.auth.TokenNotificationManager", account.name, account.type});
    }

    public final void a(Account account) {
        if (c(account)) {
            try {
                AppDescription appDescription = new AppDescription(this.a.getPackageName(), this.a.getApplicationInfo().uid, (String) null, (String) null);
                eka eka = this.f;
                TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
                tokenWorkflowRequest.a(account);
                tokenWorkflowRequest.b = "oauth2:https://www.googleapis.com/auth/accounts.reauth";
                tokenWorkflowRequest.h = appDescription;
                a(d(account), eka.a(tokenWorkflowRequest), account, this.a.getString(R.string.account_level_title), BitmapFactory.decodeResource(this.a.getResources(), R.drawable.ic_google), true);
            } catch (ekd e2) {
                iwd iwd = c;
                String valueOf = String.valueOf(e2.getMessage());
                iwd.e(valueOf.length() == 0 ? new String("Unable to get a valid intent to display the notification: ") : "Unable to get a valid intent to display the notification: ".concat(valueOf), new Object[0]);
            }
        }
    }

    public final void b(Account account) {
        this.d.a(d(account), 0);
    }

    public final boolean c(Account account) {
        if (account != null) {
            Account[] a2 = this.e.a(account.type);
            int length = a2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!a2[i].equals(account)) {
                    i++;
                } else if (!this.g.a(account)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(String str, PendingIntent pendingIntent, Account account, CharSequence charSequence, Bitmap bitmap, boolean z) {
        gqg.a(this.d, this.a, "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        je jeVar = new je(this.a);
        jeVar.e(charSequence);
        jeVar.b((CharSequence) account.name);
        jeVar.b(17301642);
        jeVar.a(bitmap);
        jeVar.f = pendingIntent;
        jeVar.b(z);
        jeVar.c(true);
        jeVar.d(this.a.getString(R.string.notification_ticker));
        jeVar.a(System.currentTimeMillis());
        jeVar.z = "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth";
        gqh.a(jeVar);
        this.d.a(str, 0, jeVar.b());
    }
}
