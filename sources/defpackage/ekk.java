package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.account.be.AccountStatusChecker$InitializeIntentOperation;

/* renamed from: ekk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekk implements eio {
    public static final ekk a = new ekk();

    private ekk() {
    }

    public final void a(Context context) {
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, AccountStatusChecker$InitializeIntentOperation.class, "com.google.android.gms.auth.account.be.AccountStatusCheckerInitializeIntent");
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }
}
