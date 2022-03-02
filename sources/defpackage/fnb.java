package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: fnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fnb implements fcu {
    public final gck a;
    public final aoru b = jfb.a(4, 9);
    public final String c;
    private final Context d;
    private final amzy e;
    private final iby f;

    public fnb(Context context, iby iby, String str, List list) {
        iva.a((Object) context);
        this.d = context;
        iva.a((Object) iby);
        this.f = iby;
        iva.c(str);
        this.c = str;
        this.e = amzy.a((Collection) list);
        this.a = pzx.a(context);
    }

    public final aorr a(fde fde) {
        int i = jhg.i(this.d, this.c);
        if (i != -1) {
            aorr a2 = qay.a(anbs.a((Iterable) this.e, (amqy) new fmr(this, i)), fms.a);
            aorr a3 = new flt(this.f, this.e).a(fde);
            return aorl.c(a2, a3).a((Callable) new fmt(a3, a2), (Executor) aoqm.a);
        }
        throw qbf.a(28442);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ID_TOKEN_SIGN_IN_CREDENTIALS;
    }
}
