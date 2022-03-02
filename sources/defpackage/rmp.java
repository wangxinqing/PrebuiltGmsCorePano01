package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: rmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmp {
    public static String a(Account account) {
        if (account == null) {
            return "null";
        }
        int hashCode = account.name.hashCode();
        StringBuilder sb = new StringBuilder(20);
        sb.append("account#");
        sb.append(hashCode % 20);
        sb.append("#");
        return sb.toString();
    }

    public static String a(Integer num) {
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder(15);
        sb.append("tag#");
        sb.append(intValue % 20);
        return sb.toString();
    }

    public static String a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Account) it.next()));
        }
        return arrayList.toString();
    }

    public static String a(Account... accountArr) {
        return a((Iterable) Arrays.asList(accountArr));
    }
}
