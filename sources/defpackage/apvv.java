package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;

/* renamed from: apvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvv {
    public static final apvv a = new apvv();

    private apvv() {
        amzy amzy = apvx.a;
        if (apvt.a == null) {
            apvt.a = new apvt();
        }
    }

    public final void a(Context context) {
        iva.a((Object) context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        anhk i = apvx.a.listIterator();
        while (i.hasNext()) {
            edit.remove((String) i.next());
        }
        edit.commit();
    }

    public final void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.i);
        edit.putString("statusMessage", status.j);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }
}
