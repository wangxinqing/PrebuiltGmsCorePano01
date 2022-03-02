package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collection;
import java.util.Set;

/* renamed from: cbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbl extends cbe {
    public final Context a;
    public final cbs b = new cbs();
    public final SparseArray c = new SparseArray();

    public cbl(Context context) {
        this.a = context;
    }

    public static void a(cbm cbm, but but, bvp bvp) {
        if (cbm != null) {
            but.a(new cbk(cbm), bvp);
        }
    }

    public final void b(bsz bsz, Collection collection, cbm cbm, but but, bvp bvp) {
        bvp.f();
        new cbz(this.a, bsz, collection, cbm, but).a(bvp);
    }

    public final void c(bsz bsz, Collection collection, cbm cbm, but but, bvp bvp) {
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "c", 245, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for reportFenceResults RPC.");
            a(cbm, but, bvp);
            return;
        }
        bvp.f();
        new ccb(this.a, bsz, collection, cbm, but).a(bvp);
    }

    public final void a(bsz bsz, atxw atxw, cbm cbm, but but, bvp bvp) {
        bvp.f();
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "a", 214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for readFootprintsContext RPC.");
            a(cbm, but, bvp);
            return;
        }
        new cby(this.a, bsz, atxw, cbm, but).a(bvp);
    }

    public final void a(bsz bsz, Collection collection, cbm cbm, but but, bvp bvp) {
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for writeBatch RPC.");
            a(cbm, but, bvp);
            return;
        }
        bvp.f();
        new ccc(this.a, bsz, collection, cbm, but).a(bvp);
    }

    public final void a(bsz bsz, Set set, cbm cbm, but but, bvp bvp) {
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for writeInterestRecord RPC.");
            a(cbm, but, bvp);
            return;
        }
        bvp.f();
        new ccd(this.a, bsz, set, cbm, but).a(bvp);
    }

    public final void a(bsz bsz, jya jya, cbm cbm, but but, bvp bvp) {
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for registerDevice RPC.");
            a(cbm, but, bvp);
            return;
        }
        bvp.f();
        new cca(this.a, bsz, jya, cbm, but).a(bvp);
    }
}
