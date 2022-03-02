package defpackage;

import java.util.List;

/* renamed from: afod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afod implements aoqb {
    private final afpf a;

    public afod(afpf afpf) {
        this.a = afpf;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        for (aflf aflf : (List) obj) {
            afkr a2 = afpf.d.a(aflf);
            if (a2 != null) {
                aucx aucx = a2.j;
                int size = aucx.size();
                int i = 0;
                while (i < size) {
                    afkn afkn = (afkn) aucx.get(i);
                    int a3 = afkq.a(a2.f);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    try {
                        afpf.e.a(afqu.a(afkn, a3));
                        i++;
                    } catch (afqs e) {
                        afsh.a("Found missing file. Logging and deleting file group.");
                        afpf.b.a(1062, a2.c, a2.e);
                        if (axsv.a.a().d()) {
                            afpf.d.b(aflf);
                        }
                    }
                }
            }
        }
        return aorl.a((Object) null);
    }
}
