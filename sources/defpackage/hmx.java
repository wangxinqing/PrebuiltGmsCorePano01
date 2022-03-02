package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: hmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmx {
    public final hjo a;
    private final Context b;

    private hmx(Context context) {
        iva.a((Object) context);
        this.b = context;
        this.a = new hjo(new izd(context, (String) his.b.c(), ((Integer) his.c.c()).intValue()));
    }

    public static hmx a(Context context) {
        return new hmx(context);
    }

    public final ClientContext a(pyv pyv) {
        Account a2 = pyv.a();
        int i = this.b.getApplicationInfo().uid;
        String packageName = this.b.getPackageName();
        ClientContext clientContext = new ClientContext(i, a2, a2, packageName, packageName);
        clientContext.d((String) his.d.c());
        return clientContext;
    }
}
