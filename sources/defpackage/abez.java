package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: abez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abez {
    public static final abez a = new abez();
    public final Map b = new HashMap();

    private abez() {
    }

    public final Set a(String str, Account account) {
        Set set = (Set) this.b.get(new abey(str, account));
        if (set != null) {
            return amym.a((Iterable) set).a(abex.a).c();
        }
        return null;
    }

    public final boolean b(String str, Account account) {
        return this.b.containsKey(new abey(str, account));
    }

    public final void c(String str, Account account) {
        this.b.remove(new abey(str, account));
    }
}
