package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: eny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eny {
    public static final fzi a = new env();
    public final qub b;
    private final boolean c;
    private final enu[] d;

    public eny(qub qub, boolean z, enu... enuArr) {
        this.b = qub;
        this.c = z;
        this.d = enuArr;
    }

    public final Object a(Account account, enx enx) {
        return enx.a(this.b, account);
    }

    public final void b(Account account, enw enw) {
        for (Pair pair : Collections.unmodifiableCollection(enw.a)) {
            b(account, (enx) pair.first, pair.second);
        }
    }

    public final Object a(Account account, enx enx, Object obj) {
        iva.a(obj);
        Object a2 = a(account, enx);
        return a2 != null ? a2 : obj;
    }

    public final void a() {
        if (!this.c) {
            throw new UnsupportedOperationException("This AccountDataManager cannot write");
        }
    }

    public final void a(Account account, enw enw) {
        a();
        Bundle b2 = enw.b();
        enx enx = eqb.a;
        String string = b2.getString("password");
        b2.remove("password");
        if (ese.b()) {
            ese ese = (ese) ese.d.b();
            List a2 = ((esj) esj.a.b()).a();
            iwd iwd = ese.a;
            int size = a2.size();
            StringBuilder sb = new StringBuilder(60);
            sb.append("Add account explicitly with whitelisted packages ");
            sb.append(size);
            String sb2 = sb.toString();
            iwd.c(sb2, new Object[0]);
            HashMap hashMap = new HashMap();
            int size2 = a2.size();
            for (int i = 0; i < size2; i++) {
                hashMap.put((String) a2.get(i), 2);
            }
            qub qub = ese.b;
            amkr a3 = amlv.a("AccountManager.addAccountExplicitlyO+");
            try {
                qub.a.addAccountExplicitly(account, string, b2, hashMap);
                if (a3 != null) {
                    a3.close();
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            this.b.a(account, string, b2);
        }
        b(account, enw);
        return;
        throw th;
    }

    public final void b(Account account, enx enx, Object obj) {
        a();
        enx.a(this.b, account, obj);
        enu[] enuArr = this.d;
        for (int i = 0; i < 2; i++) {
            enuArr[i].a(this, account, enx, obj);
        }
    }
}
