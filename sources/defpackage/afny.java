package defpackage;

import java.util.List;

/* renamed from: afny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afny implements aoqb {
    private final afpf a;
    private final anax b;

    public afny(afpf afpf, anax anax) {
        this.a = afpf;
        this.b = anax;
    }

    public final aorr a(Object obj) {
        afkr a2;
        afpf afpf = this.a;
        anax anax = this.b;
        for (aflf aflf : (List) obj) {
            if (!aflf.d.isEmpty() && !anax.contains(aflf.d) && (a2 = afpf.d.a(aflf)) != null) {
                Object[] objArr = {"FileGroupManager", aflf.b, aflf.c};
                afpf.b.a(1050, a2.c, a2.e);
                if (!afpf.d.b(aflf)) {
                    afpf.b.a(1036, a2.c, a2.e);
                }
            }
        }
        return aorl.a((Object) null);
    }
}
