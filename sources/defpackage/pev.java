package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pev implements amqy {
    private final pez a;

    public pev(pez pez) {
        this.a = pez;
    }

    public final Object a(Object obj) {
        amsv amsv;
        pez pez = this.a;
        List<Account> list = (List) obj;
        if (list == null) {
            Log.e("AppsUpload", "Missing accounts list.");
            return null;
        }
        synchronized (pez.e) {
            HashSet hashSet = new HashSet(pez.e.keySet());
            for (Account account : list) {
                if (!pez.e.containsKey(account)) {
                    try {
                        Map map = pez.e;
                        pes pes = pez.d;
                        String b = aekm.b(account.name, (String) pez.a.a());
                        if (b != null) {
                            byte[] bytes = b.getBytes(amqn.c);
                            afif afif = pes.g;
                            awdn awdn = pes.b;
                            Executor executor = pes.c;
                            if (!((Boolean) pes.d.a()).booleanValue()) {
                                Context context = pes.a;
                                acyp acyp = new acyp();
                                acyp.a = account;
                                amsv = new pfx(new iby(context, acyp.a()));
                            } else {
                                amsv = new pfu(pes.c, pes.g, account, pes.e);
                            }
                            map.put(account, new per(bytes, account, afif, awdn, executor, amsv, pes.f));
                        } else {
                            throw new pex();
                        }
                    } catch (Exception e) {
                        throw new pex(e);
                    } catch (pex e2) {
                        ((aetj) pez.b.a()).a(12005);
                        Log.e("AppsUpload", "Failed to calculate instance ID", e2);
                    }
                } else {
                    hashSet.remove(account);
                }
            }
            pez.e.keySet().removeAll(hashSet);
        }
        return null;
    }
}
