package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fnf implements fcu {
    private final Context a;
    private final String b;
    private final amzy c;

    public fnf(Context context, String str, List list) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        this.c = amzy.a((Collection) list);
    }

    public final aorr a(fde fde) {
        amri a2 = hiq.a(this.a, this.b);
        if (a2.a()) {
            amzt j = amzy.j();
            anhk i = this.c.listIterator();
            while (i.hasNext()) {
                try {
                    j.c(fcg.a((Account) i.next()));
                } catch (qbf e) {
                }
            }
            return aopr.a(new fmb(this.a, (String) a2.b(), j.a(), true, anfv.a).a(fde), fnc.a, (Executor) aoqm.a);
        }
        throw qbf.a(28442);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_LIST_PASSWORD_SIGN_IN_CREDENTIALS;
    }
}
