package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: elb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elb {
    private static final iwd d = ehv.a("Change", "AccountsChange");
    private static final String[] e = {"com.google", "com.google.work", "cn.google"};
    public final Set a;
    public final Set b;
    public final Set c;

    private elb(Set set, Set set2, Set set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    public static elb a(Context context) {
        Map map;
        boolean z;
        eku eku;
        byte[] a2;
        ekv ekv = new ekv(qub.a(context));
        ekx ekx = (ekx) ekx.b.b();
        elv a3 = elv.a(context.getApplicationContext());
        String[] strArr = e;
        try {
            synchronized (ekx.c) {
                FileInputStream openFileInput = ekx.d.openFileInput(ekx.e);
                try {
                    a2 = jlf.a(openFileInput);
                    openFileInput.close();
                } catch (IOException e2) {
                    ekx.a.a((Throwable) e2);
                } catch (Throwable th) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                        ekx.a.a((Throwable) e3);
                    }
                    throw th;
                }
            }
            fyv fyv = (fyv) aucj.a((aucj) fyv.b, a2, aubs.c());
            map = new nz(fyv.a.size());
            for (fyu fyu : fyv.a) {
                fyt fyt = fyu.b;
                if (fyt == null) {
                    fyt = fyt.d;
                }
                String str = fyt.b;
                fyt fyt2 = fyu.b;
                if (fyt2 == null) {
                    fyt2 = fyt.d;
                }
                eku eku2 = new eku(new Account(str, fyt2.c), fyu.c, fyu.d);
                map.put(eku2.a, eku2);
            }
        } catch (FileNotFoundException e4) {
            d.c("First snapshot", new Object[0]);
            map = Collections.emptyMap();
            ekx.a(map);
        }
        iva.a((Object) strArr, (Object) "accountTypes null");
        int length = strArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "accountTypes empty");
        ob<Account> obVar = new ob();
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (str2 != null) {
                for (Account add : ekv.b.a(str2)) {
                    obVar.add(add);
                }
                i++;
            } else {
                throw new IllegalArgumentException("accountTypes has null element");
            }
        }
        nz nzVar = new nz(obVar.b);
        for (Account account : obVar) {
            String a4 = ekv.b.a(account);
            try {
                eku = new eku(account, a4, eig.c(context, account.name));
            } catch (eif | IOException e5) {
                ekv.a.d("Error while trying to get accountId", e5, new Object[0]);
                eku = new eku(account, a4, "");
            }
            nzVar.put(account, eku);
        }
        if (d.a(3)) {
            d.b("old accounts: %s", new ArrayList(map.keySet()));
            d.b("new accounts: %s", new ArrayList(nzVar.keySet()));
        }
        Set keySet = map.keySet();
        Set keySet2 = nzVar.keySet();
        Set<Account> a5 = a(keySet2, keySet);
        ob obVar2 = new ob(((ob) a5).b);
        for (Account account2 : a5) {
            obVar2.add((eku) nzVar.get(account2));
        }
        Set<Account> a6 = a(keySet, keySet2);
        ob obVar3 = new ob(((ob) a6).b);
        for (Account account3 : a6) {
            obVar3.add((eku) map.get(account3));
        }
        for (Account account4 : a6) {
            if (account4.name != null) {
                String a7 = a3.a();
                try {
                    List a8 = a3.a(account4.name, 0);
                    if (a8.isEmpty() || ((AccountChangeEvent) a8.get(0)).d != 4) {
                        a3.a(account4.name, 2, (String) null);
                    }
                } finally {
                    a3.a(a7);
                }
            }
        }
        ob<Account> obVar4 = new ob((Collection) keySet);
        obVar4.retainAll(keySet2);
        ob obVar5 = new ob(obVar4.b);
        for (Account account5 : obVar4) {
            if (!ius.a(map.get(account5), nzVar.get(account5))) {
                obVar5.add((eku) nzVar.get(account5));
            }
        }
        elb elb = new elb(Collections.unmodifiableSet(obVar2), Collections.unmodifiableSet(obVar3), Collections.unmodifiableSet(obVar5));
        if (!elb.a.isEmpty() || !elb.b.isEmpty() || !elb.c.isEmpty()) {
            ekx.a(nzVar);
        }
        return elb;
    }

    private static Set a(Set set, Set set2) {
        ob obVar = new ob((Collection) set);
        obVar.removeAll(set2);
        return obVar;
    }
}
