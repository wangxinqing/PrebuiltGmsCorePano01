package defpackage;

import android.accounts.Account;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agri implements agqu {
    public final agny a;
    private final Object b = new Object();
    private final Map c = new HashMap();
    private final agrh d;

    public agri(agrh agrh) {
        amrl.a((Object) agrh);
        this.d = agrh;
        agqy agqy = (agqy) agrh;
        this.a = agny.a(agqy.a, agqy.b);
    }

    public final agqt a(Account account) {
        agqt agqt;
        synchronized (this.b) {
            if (!this.c.containsKey(account)) {
                Map map = this.c;
                agsc agsc = new agsc(new agsd(), new agsk(mdu.a(((agqy) this.d).a, mdt.a(account)), ((agqy) this.d).b));
                agop agop = ((agqy) this.d).d;
                afts afts = new afts();
                agny agny = this.a;
                agop.getClass();
                agse agse = new agse(agop);
                aucd o = atws.d.o();
                String d2 = agny.d();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atws atws = (atws) o.b;
                d2.getClass();
                int i = atws.a | 1;
                atws.a = i;
                atws.b = d2;
                atws.a = i | 2;
                atws.c = 1;
                agsf agsf = new agsf(agse, afts, (atws) o.i());
                agny agny2 = this.a;
                agrh agrh = this.d;
                agos a2 = agos.a(agny2, 3011, ((agqy) agrh).d, account, afjn.b(((agqy) agrh).c, account.toString(), (int) azre.a.a().b()), true);
                agrh agrh2 = this.d;
                ((agqy) agrh2).a.registerReceiver(new agsh(agsc, agsf, ((agqy) agrh2).c), new IntentFilter("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
                map.put(account, new agrc(agsc, agsf, a2, ((agqy) this.d).c));
            }
            agqt = (agqt) this.c.get(account);
        }
        return agqt;
    }
}
