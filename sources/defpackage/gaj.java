package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import java.util.List;

/* renamed from: gaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gaj extends iby {
    private static final ibq a = new ibq("Cryptauth.CryptauthServiceApi", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new gad();

    public gaj(Context context) {
        super(context, a, (ibm) null, (igu) new icz());
    }

    public final acwa a(int i, List list, String str, Account account) {
        return b((ihb) new gaf(i, list, str, account));
    }

    public final acwa a(String str, Account account) {
        return a((ihb) new gah(str, account));
    }

    public final acwa a(String str, String str2, Account account, Payload payload) {
        return a((ihb) new gai(str, str2, account, payload));
    }
}
