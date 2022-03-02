package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.Map;

/* renamed from: agzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agzu {
    static Integer a(auik auik, Account account) {
        String str = account.name;
        String str2 = account.type;
        for (Map.Entry entry : Collections.unmodifiableMap(auik.c).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            auii auii = (auii) entry.getValue();
            if (auii.b.equals(str) && auii.c.equals(str2)) {
                return Integer.valueOf(intValue);
            }
        }
        return null;
    }
}
