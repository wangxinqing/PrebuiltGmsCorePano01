package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abaw implements amqy {
    private final ConsentChimeraActivity a;
    private final Account b;
    private final String c;

    public abaw(ConsentChimeraActivity consentChimeraActivity, Account account, String str) {
        this.a = consentChimeraActivity;
        this.b = account;
        this.c = str;
    }

    public final Object a(Object obj) {
        return amri.c(ijk.a(this.a, this.b, false, false, Bundle.EMPTY, false, (String) null, true, this.c, ((Boolean) obj).booleanValue(), 1, Bundle.EMPTY));
    }
}
