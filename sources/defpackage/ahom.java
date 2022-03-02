package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.List;

/* renamed from: ahom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahom {
    public static final Object a = new Object();
    public static ahom b;
    public final hol c;

    public ahom(Context context) {
        Account d = jgu.d(context);
        if (d == null) {
            List d2 = jgu.d(context, context.getPackageName());
            if (!d2.isEmpty()) {
                d = (Account) d2.get(0);
            }
        }
        this.c = new hol(context, "ACTIVITY_RECOGNITION", d != null ? d.name : null);
    }
}
