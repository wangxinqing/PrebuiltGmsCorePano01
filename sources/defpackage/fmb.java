package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fmb implements fcu {
    public static final iwd a = ehv.a("ListCredentialsOperation");
    public final fis b;
    public final String c;
    public final amzy d;
    public final boolean e;
    public final anax f;

    public fmb(Context context, String str, List list, boolean z, Set set) {
        this.b = fkm.a(context);
        this.c = str;
        this.d = amzy.a((Collection) list);
        this.e = z;
        this.f = anax.a((Collection) set);
    }

    public final aorr a(fde fde) {
        return aopr.a(aorl.a((aoqa) new flu(this, fde), (Executor) aoqm.a), flv.a, (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_LIST_CREDENTIALS;
    }
}
