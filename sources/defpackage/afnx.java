package defpackage;

import java.util.List;

/* renamed from: afnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnx implements aoqb {
    private final afpf a;

    public afnx(afpf afpf) {
        this.a = afpf;
    }

    public final aorr a(Object obj) {
        afpf afpf = this.a;
        for (aflf aflf : (List) obj) {
            if (!afpf.a(aflf.c) && afpf.d.a(aflf) != null) {
                Object[] objArr = {"FileGroupManager", aflf.b, aflf.c};
                afpf.b.b(1049);
                if (!afpf.d.b(aflf)) {
                    afpf.b.b(1036);
                }
            }
        }
        return aorl.a((Object) null);
    }
}
