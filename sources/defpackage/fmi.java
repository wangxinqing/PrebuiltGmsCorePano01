package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: fmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fmi implements fcu {
    public final String a;
    public final fjh b;
    private final Context c;

    public fmi(Context context, String str) {
        this.c = context;
        this.a = str;
        this.b = fjh.a(context);
    }

    public final aorr a(fde fde) {
        return aopr.a(new fmo(this.c).a(fde), (aoqb) new fmc(this, fde), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_LIST_ELIGIBLE_ACCOUNTS_FOR_PASSWORD_SAVE;
    }
}
