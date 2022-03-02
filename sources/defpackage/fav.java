package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;

/* renamed from: fav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fav implements amqy {
    private final fbk a;
    private final String b;

    public fav(fbk fbk, String str) {
        this.a = fbk;
        this.b = str;
    }

    public final Object a(Object obj) {
        fbk fbk = this.a;
        String str = this.b;
        Account account = ((GetDefaultAccountResult) obj).a;
        if (account != null && fbk.a(account, str)) {
            fbk.l = account;
        }
        return amri.b(qcr.EXTERNAL_ACCOUNT_CHOOSER);
    }
}
