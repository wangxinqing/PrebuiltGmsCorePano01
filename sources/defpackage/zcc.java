package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.List;

/* renamed from: zcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcc extends zax {
    private final String a;
    private final ytk b;

    public zcc(String str, ytk ytk) {
        this.a = str;
        this.b = ytk;
    }

    public final void a(Context context, yrr yrr) {
        String a2 = jgu.a(context, this.a);
        if (a2 == null) {
            List d = jgu.d(context, this.a);
            if (d.size() == 1) {
                a2 = ((Account) d.get(0)).name;
            }
        }
        this.b.a(a2);
    }
}
