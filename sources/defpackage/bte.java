package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bte extends cbe implements ckq {
    final HashMap a = new HashMap();
    btd b;
    private final boolean c;
    private final btg d;

    public bte(btg btg) {
        this.d = btg;
        boolean z = false;
        if (!awuz.a.a().b() && awuz.a.a().a()) {
            z = true;
        }
        this.c = z;
        cbi.A().a(this, cbi.k());
    }

    public final btd a(bsz bsz) {
        btd btd = (btd) this.a.get(bsz);
        if (btd != null) {
            return btd;
        }
        if (this.c && !bsz.b()) {
            if (this.b == null) {
                btd btd2 = new btd(bsz);
                this.b = btd2;
                btd2.a();
            }
            btd btd3 = this.b;
            this.a.put(bsz, btd3);
            return btd3;
        }
        btd btd4 = new btd(bsz);
        this.a.put(bsz, btd4);
        btd4.a();
        return btd4;
    }

    public final void a() {
        for (btd a2 : this.a.values()) {
            a2.a();
        }
    }

    public final boolean a(int i, Collection collection, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            btd a2 = a(contextManagerClientInfo.a());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int a3 = a2.a(i, ((Integer) it.next()).intValue(), contextManagerClientInfo);
                if (a3 != 1 && (z || a3 != 6)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(ContextManagerClientInfo contextManagerClientInfo, atjv atjv) {
        int ordinal;
        btd a2 = a(contextManagerClientInfo.a());
        atqx atqx = (atqx) a2.b.get(btb.a(atjv));
        if (atqx == null || (ordinal = atqx.ordinal()) == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return a2.a.b();
        }
        if (ordinal != 4) {
            ((anih) ((anih) bxk.a.b()).a("btd", "a", 450, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AclManager] Unknown SyncType %s", (Object) atqx);
            return false;
        } else if (a2.a.b()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(Collection collection, ContextManagerClientInfo contextManagerClientInfo) {
        return a(collection, contextManagerClientInfo, false);
    }

    public final boolean a(Collection collection, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        return a(0, collection, contextManagerClientInfo, z);
    }
}
