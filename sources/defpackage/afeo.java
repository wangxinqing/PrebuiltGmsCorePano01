package defpackage;

import android.accounts.Account;
import java.util.Map;

/* renamed from: afeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afeo implements affs {
    private static final afde a;
    private final afci b;
    private final Map c;

    static {
        afdd a2 = afde.a();
        a2.a(':');
        a = a2.a();
    }

    public afeo(afci afci, Map map) {
        this.b = afci;
        this.c = map;
    }

    public final afft a(Account account, aukh aukh) {
        afci afci = this.b;
        String a2 = a.a(account.type);
        String a3 = a.a(account.name);
        String a4 = a.a(((aerh) this.c.get(aukg.a(aukh.a))).a(aukh));
        int length = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(a3).length() + String.valueOf(a4).length());
        sb.append(a2);
        sb.append(':');
        sb.append(a3);
        sb.append(':');
        sb.append(a4);
        return new afep(afci.a(sb.toString()));
    }
}
