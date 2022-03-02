package defpackage;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.Executor;

/* renamed from: agsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsk {
    public final meh a;
    private final String b;

    public agsk(meh meh, String str) {
        amrl.a((Object) meh);
        this.a = meh;
        amrl.a((Object) str);
        this.b = str;
    }

    public static aorr a(acwa acwa) {
        aosh f = aosh.f();
        acwa.a((Executor) aoqm.a, (acvp) new agsj(f));
        return f;
    }

    public final FacsCacheCallOptions a() {
        return new FacsCacheCallOptions(this.b, 1);
    }
}
