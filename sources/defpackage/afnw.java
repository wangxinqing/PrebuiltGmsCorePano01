package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnw implements aoqb {
    private final afpf a;

    public afnw(afpf afpf) {
        this.a = afpf;
    }

    public final aorr a(Object obj) {
        afkr a2;
        afpf afpf = this.a;
        ArrayList arrayList = new ArrayList();
        for (aflf aflf : (List) obj) {
            if (!aflf.e && (a2 = afpf.d.a(aflf)) != null) {
                arrayList.add(afpf.a(aflf, a2));
            }
        }
        return aorl.b((Iterable) arrayList).a(afoh.a, afpf.h);
    }
}
