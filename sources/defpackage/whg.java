package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: whg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whg implements Callable {
    private final Account a;
    private final iby b;

    public whg(iby iby, Account account) {
        this.b = iby;
        this.a = account;
    }

    public final Object call() {
        xfh b2;
        iby iby = this.b;
        Account account = this.a;
        wkz wkz = new wkz();
        wkz.b = false;
        wla wla = (wla) iby.a(wkz).a();
        if (wla != null) {
            try {
                b2 = wla.b();
                if (b2 != null) {
                    Iterator it = b2.iterator();
                    while (it.hasNext()) {
                        xaa xaa = (xaa) it.next();
                        if (TextUtils.equals(account.name, xaa.c())) {
                            whm whm = new whm();
                            String d = xaa.d();
                            if (d != null) {
                                whm.a = d;
                                String f = xaa.f();
                                if (f != null) {
                                    whm.b = f;
                                    String str = "";
                                    if (whm.a == null) {
                                        str = " displayName";
                                    }
                                    if (whm.b == null) {
                                        str = str.concat(" givenName");
                                    }
                                    if (!str.isEmpty()) {
                                        String valueOf = String.valueOf(str);
                                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                    }
                                    whq whq = new whq(whm.a, whm.b);
                                    b2.c();
                                    wla.c();
                                    return whq;
                                }
                                throw new NullPointerException("Null givenName");
                            }
                            throw new NullPointerException("Null displayName");
                        }
                    }
                    b2.c();
                    wla.c();
                    String str2 = account.name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 57);
                    sb.append("Failed to find account ");
                    sb.append(str2);
                    sb.append(" in the list of on device accounts");
                    throw new Exception(sb.toString());
                }
                throw new Exception("Failed to load owners from People.Graph API");
            } catch (Throwable th) {
                wla.c();
                throw th;
            }
        } else {
            throw new Exception("Failed to load owners from People.Graph API");
        }
    }
}
