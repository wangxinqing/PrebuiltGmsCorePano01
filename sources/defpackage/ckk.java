package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: ckk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckk extends cbm implements bve {
    public final bzm a;
    private final bsz b;

    public ckk(bsz bsz, bzm bzm) {
        super("ReportServerFenceResultsOperation", "report fence %s", bzm.e);
        this.b = bsz;
        this.a = bzm;
    }

    public final Future a() {
        bzm bzm = this.a;
        int i = bzm.q;
        if (i == 2 || i == 3) {
            new Object[1][0] = bzm.e;
            return buk.a;
        }
        iva.a(!isDone());
        cbl w = cbi.w();
        bsz bsz = this.b;
        List singletonList = Collections.singletonList(this.a);
        bwn k = cbi.k();
        bvp a2 = bvq.a("ReportServerFenceResultsOperation");
        if (bsz.b()) {
            ((anih) ((anih) bxk.a.b()).a("cbl", "c", 245, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkManager] Cannot use an anonymous account for reportFenceResults RPC.");
            cbl.a(this, k, a2);
        } else {
            a2.f();
            new ccb(w.a, bsz, singletonList, this, k).a(a2);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ckk) {
            return this.a.equals(((ckk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void a(int i) {
        super.a(i);
        if (i == 11) {
            new Object[1][0] = this.a.e;
            bwg n = cbi.n();
            jwz a2 = jwz.a((idg) new ckj(this), (jwt) null);
            ContextManagerClientInfo a3 = byd.a(this.b);
            grd grd = new grd();
            grd.a(this.a.a);
            n.a(a2, a3, grd.a());
            return;
        }
        this.a.q = 1;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atqp atqp = (atqp) obj;
        bzm bzm = this.a;
        new Object[1][0] = bzm.e;
        bzm.q = 3;
    }
}
