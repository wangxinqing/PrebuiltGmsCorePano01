package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: agwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwd implements agww {
    private final agwj a;

    public agwd(agwj agwj) {
        this.a = agwj;
    }

    public final void a() {
        String str;
        agwj agwj = this.a;
        if (agwj.h.a != null) {
            Map map = agwj.h.a;
            if (map != null) {
                str = (String) map.get("__phenotype_snapshot_token");
            } else {
                str = null;
            }
            yef.a(agwj.e.d).a(agwj.f, "", str).a((Executor) agwj.e.a(), agwu.a((acvp) new agwi(agwj, map)));
        }
    }
}
