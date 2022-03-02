package defpackage;

import android.view.Menu;

/* renamed from: te  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class te implements vq {
    final /* synthetic */ tn a;
    private final vq b;

    public te(tn tnVar, vq vqVar) {
        this.a = tnVar;
        this.b = vqVar;
    }

    public final void a(vr vrVar) {
        vv vvVar = (vv) this.b;
        vvVar.a.onDestroyActionMode(vvVar.b(vrVar));
        tn tnVar = this.a;
        if (tnVar.m != null) {
            tnVar.f.getDecorView().removeCallbacks(this.a.n);
        }
        tn tnVar2 = this.a;
        if (tnVar2.l != null) {
            tnVar2.u();
            tn tnVar3 = this.a;
            qg m = qb.m(tnVar3.l);
            m.a(0.0f);
            tnVar3.o = m;
            this.a.o.a((qh) new td(this));
        }
        tn tnVar4 = this.a;
        tnVar4.k = null;
        qb.r(tnVar4.q);
    }

    public final void b(vr vrVar, Menu menu) {
        qb.r(this.a.q);
        vv vvVar = (vv) this.b;
        vvVar.a.onPrepareActionMode(vvVar.b(vrVar), vvVar.a(menu));
    }

    public final boolean a(vr vrVar, Menu menu) {
        vv vvVar = (vv) this.b;
        return vvVar.a.onCreateActionMode(vvVar.b(vrVar), vvVar.a(menu));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [mi, android.view.MenuItem] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.vr r4, android.view.MenuItem r5) {
        /*
            r3 = this;
            vq r0 = r3.b
            vv r0 = (defpackage.vv) r0
            android.view.ActionMode$Callback r1 = r0.a
            android.view.ActionMode r4 = r0.b(r4)
            xc r2 = new xc
            android.content.Context r0 = r0.b
            r2.<init>(r0, r5)
            boolean r4 = r1.onActionItemClicked(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.a(vr, android.view.MenuItem):boolean");
    }
}
