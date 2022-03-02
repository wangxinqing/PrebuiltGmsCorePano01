package defpackage;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.Executor;

/* renamed from: agrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agrv implements aoqa {
    private final agsc a;
    private final atxi b;

    public agrv(agsc agsc, atxi atxi) {
        this.a = agsc;
        this.b = atxi;
    }

    public final aorr a() {
        agsc agsc = this.a;
        atxi atxi = this.b;
        agsk agsk = agsc.c;
        meh meh = agsk.a;
        FacsCacheCallOptions a2 = agsk.a();
        iha b2 = ihb.b();
        b2.a = new mdx(atxi, a2);
        return aopr.a(agsk.a(meh.a(b2.a())), (aoqb) new agrp(agsc), (Executor) aoqm.a);
    }
}
