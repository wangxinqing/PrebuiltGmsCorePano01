package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: fkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkp implements fit {
    private final qub a;

    public fkp(Context context) {
        this.a = qub.a(context);
    }

    public final aorr a(pyv pyv, HintRequest hintRequest) {
        Credential credential;
        boolean contains = angm.a((Object[]) hintRequest.e).contains("https://accounts.google.com");
        boolean z = hintRequest.c;
        if (!z && !contains) {
            return aorl.a((Object) amzy.h());
        }
        amzt j = amzy.j();
        for (Account account : this.a.b()) {
            if (!contains || !"com.google".equals(account.type)) {
                if (z && Patterns.EMAIL_ADDRESS.matcher(account.name).matches()) {
                    credential = new eug(account.name).a();
                }
            } else {
                eug eug = new eug(account.name);
                eug.e = "https://accounts.google.com";
                credential = eug.a();
            }
            j.c(credential);
        }
        return aorl.a((Object) j.a());
    }
}
