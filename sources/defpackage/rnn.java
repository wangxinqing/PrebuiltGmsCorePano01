package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: rnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rnn implements rnr {
    final nz a = new nz(1);
    public final rng b = new rnj(this);
    public final rnr c = new rnk(this);
    public final rnp d;
    final ob e;
    public boolean f;
    public boolean g;
    final /* synthetic */ rns h;

    public rnn(rns rns) {
        this.h = rns;
        this.d = new rnp(rns.a, rnl.a);
        this.e = new ob(2);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Set set;
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            set = new ob();
        } else {
            set = angm.a(rns.b.a((CharSequence) str));
        }
        synchronized (this.a) {
            HashSet hashSet = new HashSet(angm.d(this.e, set));
            hashSet.remove("network");
            if (!hashSet.isEmpty()) {
                set.remove("network");
                boolean a2 = a();
                this.e.clear();
                this.e.addAll(set);
                if (a2) {
                    this.e.add("network");
                }
                a((Set) hashSet);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f && this.g;
    }

    /* access modifiers changed from: package-private */
    public final void a(Set set) {
        int i = 0;
        while (true) {
            nz nzVar = this.a;
            if (i < nzVar.h) {
                Executor executor = (Executor) this.a.c(i);
                executor.execute(new rnm(this, (rni) nzVar.b(i), executor, set));
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        boolean a2 = a();
        this.f = z;
        this.g = z2;
        boolean a3 = a();
        if (a3 != a2) {
            if (!a3) {
                this.e.remove("network");
            } else {
                this.e.add("network");
            }
            a((Set) anax.a((Object) "network"));
        }
    }
}
