package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.checkin.internal.FirstAccountReadySender$1;

/* renamed from: gyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyc {
    public static void a(Context context) {
        jnl a = jnl.a();
        String e = a.e(context);
        if (e == null) {
            e = a.d(context);
        }
        if (e != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("android.for.work.preferences", 0);
            if (!sharedPreferences.getBoolean("first.account.ready.received", false)) {
                Intent intent = new Intent("com.google.android.work.action.FIRST_ACCOUNT_READY");
                jnl.a().a(intent);
                intent.setPackage(e);
                intent.putExtra("deviceHint", gwd.g(context));
                context.sendOrderedBroadcast(intent, (String) null, new FirstAccountReadySender$1("checkin", sharedPreferences), (Handler) null, 0, (String) null, (Bundle) null);
            }
        }
    }
}
