package defpackage;

import android.accounts.Account;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afva implements afvj {
    public final aflk a;

    public afva(aflk aflk) {
        this.a = aflk;
    }

    public static aorr a(aorr aorr, String str) {
        return aooz.a(aorr, Throwable.class, (aoqb) new afuv(str), (Executor) aoqm.a);
    }

    public static afmg b(afjh afjh) {
        Account account = null;
        afmf afmf = new afmf((byte[]) null);
        String str = afjh.d;
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            afsh.a("%s: Unable to parse Account with string = '%s'", (Object) "AccountUtil", (Object) str);
        } else {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (!afmj.a(substring2) || !afmj.a(substring)) {
                afsh.b("%s: Unable to create Account with name = '%s', type = '%s'", "AccountUtil", substring2, substring);
            } else {
                account = new Account(substring2, substring);
            }
        }
        amri c = amri.c(account);
        if (c != null) {
            afmf.b = c;
            String str2 = afjh.b;
            if (str2 != null) {
                afmf.a = str2;
                String str3 = afmf.a == null ? " groupName" : "";
                if (str3.isEmpty()) {
                    return new afju(afmf.a, afmf.b);
                }
                throw new IllegalStateException(str3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str3));
            }
            throw new NullPointerException("Null groupName");
        }
        throw new NullPointerException("Null accountOptional");
    }

    public static boolean a(afjh afjh) {
        return (afjh.a & 1) != 0 && afjh.b.startsWith("photos_filegroup_");
    }

    public static boolean a(afjh afjh, Account account) {
        return afjh.d.equals(afmj.a(account));
    }

    public final aorr a(List list) {
        aflk aflk = this.a;
        afki e = afkj.e();
        e.a(true);
        return aopr.a(a(aflk.a(e.a()), "File group search failed"), (aoqb) new afuu(this, list), (Executor) aoqm.a);
    }
}
