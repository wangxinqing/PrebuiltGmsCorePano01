package defpackage;

import java.util.Set;

/* renamed from: hgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hgk extends hgm {
    final /* synthetic */ Set a;
    final /* synthetic */ anax b;
    final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hgk(hfk hfk, boolean z, Set set, anax anax, boolean z2) {
        super(hfk, z);
        this.a = set;
        this.b = anax;
        this.c = z2;
    }

    public final boolean a() {
        return !this.b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final boolean a(bob bob, hfg hfg) {
        if (this.d.contains(bob.b)) {
            return false;
        }
        Set set = this.a;
        ansk ansk = (ansk) hfg.a.get(0);
        if ((this.c && hgi.a(ansk, false) && !hgi.a(ansk, 128) && !hgm.a(bob, hfg.b, set)) || !this.e.contains(bob.b)) {
            return false;
        }
        if (this.b.isEmpty() || this.b.contains(bob.b)) {
            return true;
        }
        return false;
    }
}
