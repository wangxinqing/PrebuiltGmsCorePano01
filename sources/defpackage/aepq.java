package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aepq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepq implements aepp {
    private static final auay a = auay.a(new byte[]{58});
    private static final afdc b;
    private final afci c;
    private final Map d;
    private final Context e;
    private afch f;

    static {
        afdb a2 = afdc.a();
        a2.a((byte) 58);
        b = a2.a();
    }

    public aepq(afci afci, Map map, Context context) {
        this.c = afci;
        this.d = map;
        this.e = context;
    }

    private final afch a() {
        afch afch;
        synchronized (this.c) {
            if (this.f == null) {
                this.f = this.c.a("broadcastlistenerstorage");
            }
            afch = this.f;
        }
        return afch;
    }

    private final auay b(aeps aeps) {
        if (this.d.get(aukg.a(aeps.c().a)) != null) {
            return b.a(auay.a(((aerh) this.d.get(aukg.a(aeps.c().a))).a(aeps.c()))).a(a).a(b.a(auay.a(aeps.b().type))).a(a).a(b.a(auay.a(aeps.b().name))).a(a).a(b.a(auay.a(aeps.a()))).a(a).a(b.a(auay.a(aeps.d())));
        }
        throw new UnsupportedOperationException("Operation not supported for the specified ChannelId.");
    }

    public final Collection a(aukh aukh, Account account) {
        afch a2 = a();
        HashSet hashSet = new HashSet();
        if (this.d.get(aukg.a(aukh.a)) != null) {
            byte[] k = b.a(auay.a(((aerh) this.d.get(aukg.a(aukh.a))).a(aukh))).a(a).a(b.a(auay.a(account.type))).a(a).a(b.a(auay.a(account.name))).k();
            byte[] a3 = afgi.a(k);
            afdo a4 = a2.a().a();
            try {
                for (Pair pair : a2.a(a4, k, a3)) {
                    aujz aujz = (aujz) aucj.a((aucj) aujz.e, (byte[]) pair.second);
                    aeps a5 = aeps.a(aujz.c, account, aukh, aujz.d);
                    aukf aukf = aujz.b;
                    if (aukf == null) {
                        aukf = aukf.c;
                    }
                    hashSet.add(Pair.create(a5, aept.a(aukf)));
                }
                a4.close();
                return hashSet;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new UnsupportedOperationException("Operation not supported for the specified ChannelId.");
        }
        throw th;
    }

    public final void a(aeps aeps) {
        afch a2 = a();
        afdp b2 = a2.a().b();
        try {
            a2.a(b2, b(aeps));
            b2.b();
            b2.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(aeps aeps, aept aept) {
        afch a2 = a();
        afdp b2 = a2.a().b();
        try {
            auay b3 = b(aeps);
            aucd o = aujz.e.o();
            String a3 = aeps.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aujz aujz = (aujz) o.b;
            a3.getClass();
            aujz.a |= 2;
            aujz.c = a3;
            String d2 = aeps.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aujz aujz2 = (aujz) o.b;
            d2.getClass();
            int i = aujz2.a | 4;
            aujz2.a = i;
            aujz2.d = d2;
            aukf aukf = ((aepo) aept).a;
            aukf.getClass();
            aujz2.b = aukf;
            aujz2.a = i | 1;
            a2.a(b2, b3, ((aujz) o.i()).au());
            b2.b();
            b2.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Collection collection) {
        afch a2 = a();
        afdp b2 = a2.a().b();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                auay b3 = b((aeps) it.next());
                aujz aujz = (aujz) aucj.a((aucj) aujz.e, a2.a((afdo) b2, b3));
                Intent intent = new Intent();
                intent.setPackage(aujz.c);
                intent.setAction(aujz.d);
                this.e.sendBroadcast(intent);
                a2.a(b2, b3);
            }
            b2.b();
            b2.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
