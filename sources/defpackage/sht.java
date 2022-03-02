package defpackage;

import android.accounts.Account;
import java.util.Map;

/* renamed from: sht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sht {
    private static final Object a = new Object();
    private static volatile sht b;

    public static sht f() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new shs();
                }
            }
        }
        return b;
    }

    public final shj a(Account account) {
        shj shj;
        shk a2 = a();
        synchronized (a2.a) {
            if (!a2.c.containsKey(account)) {
                Map map = a2.c;
                shn b2 = ((shm) a2.b).a();
                awdx.a(account);
                b2.a = account;
                awdx.a((Object) b2.a, Account.class);
                map.put(account, new shq(b2.b, b2.a));
            }
            shj = (shj) a2.c.get(account);
            amrl.a((Object) shj);
        }
        return shj;
    }

    public abstract shk a();

    public abstract ski b();

    public abstract skq c();

    public abstract skk d();

    public abstract skn e();
}
