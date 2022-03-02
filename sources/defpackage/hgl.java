package defpackage;

import java.util.Set;

/* renamed from: hgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hgl extends hgm {
    final /* synthetic */ Set a;
    final /* synthetic */ bpw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hgl(hfk hfk, boolean z, Set set, bpw bpw) {
        super(hfk, z);
        this.a = set;
        this.b = bpw;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean a(bob bob, hfg hfg) {
        if (this.d.contains(bob.b) || !this.e.contains(bob.b)) {
            return false;
        }
        if (hgm.a(bob, hfg.b, this.a)) {
            return true;
        }
        if ((hgi.a((ansk) hfg.a.get(0), false) && hgi.a(hfg, 64)) || !this.b.contains(bob.b)) {
            return false;
        }
        return true;
    }
}
