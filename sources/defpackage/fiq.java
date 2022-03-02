package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fiq implements fcu {
    public final SignInPassword a;
    public final String b;
    public final fjw c;
    private final List d;

    public fiq(Context context, List list, SavePasswordRequest savePasswordRequest, String str) {
        this.d = list;
        this.a = savePasswordRequest.a;
        this.b = str;
        this.c = fjw.a(context);
    }

    public final aorr a(fde fde) {
        amzt j = amzy.j();
        for (Account a2 : this.d) {
            j.c(fcg.a(a2));
        }
        return aorl.c((Iterable) amzy.a(anbs.a((Iterable) j.a(), (amqy) new fio(this)))).a(fip.a, (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_SAVE_PASSWORD;
    }
}
