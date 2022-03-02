package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: ild  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ild {
    public ild(Context context) {
        iva.a((Object) context);
        context.getContentResolver();
    }

    public static final void a(Account account, String str) {
        ContentResolver.setSyncAutomatically(account, str, true);
    }

    public static final void a(Account account, String str, Bundle bundle) {
        for (String str2 : bundle.keySet()) {
            iva.a(bundle.get(str2), (Object) "Null values are not allowed in extras");
        }
        ContentResolver.removePeriodicSync(account, str, bundle);
    }

    public static final void a(Account account, String str, Bundle bundle, long j) {
        for (String str2 : bundle.keySet()) {
            iva.a(bundle.get(str2), (Object) "Null values are not allowed in extras");
        }
        ContentResolver.addPeriodicSync(account, str, bundle, j);
    }
}
