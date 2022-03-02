package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Collection;

/* renamed from: bvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvw implements bvt {
    private static bvw a;

    public static synchronized bvw c() {
        bvw bvw;
        synchronized (bvw.class) {
            if (a == null) {
                a = new bvw();
            }
            bvw = a;
        }
        return bvw;
    }

    public final bsz a() {
        return null;
    }

    public final boolean b() {
        return true;
    }

    public final void a(bsz bsz, ContextData contextData) {
        ((anih) ((anih) bxk.a.b()).a("bvw", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerFEServerConsumer] Deliver is currently unsupported.");
    }

    public final void a(bsz bsz, Collection collection, bun bun, but but) {
        cbl w = cbi.w();
        bwn k = cbi.k();
        cbi.p().a(collection, 2, cbi.i().a(), cbi.a(bsz, "ContextManagerFEServerConsumer"));
        bvv bvv = new bvv(bsz, collection, bun, but, bvq.a("ContextManagerFEServer#writeBatch+callback"));
        bvp a2 = bvq.a("ContextManagerFEServer#writeBatch");
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for writeBatch RPC.");
            cbl.a(bvv, k, a2);
            return;
        }
        a2.f();
        new ccc(w.a, bsz, collection, bvv, k).a(a2);
    }
}
