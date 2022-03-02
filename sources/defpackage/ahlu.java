package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahlu {
    public final Map a = new HashMap();
    public String b = null;
    public long c = -1;
    final /* synthetic */ ahlw d;

    public ahlu(ahlw ahlw) {
        this.d = ahlw;
    }

    /* access modifiers changed from: package-private */
    public final void a(ahlr ahlr, long j) {
        String str = this.b;
        if (str != null) {
            ahls ahls = (ahls) this.a.get(str);
            ahls.a += j - this.c;
            ahls.b++;
        }
        if (!this.a.containsKey(ahlr.b())) {
            this.a.put(ahlr.b(), new ahls());
        }
        this.b = ahlr.b();
        this.c = j;
    }
}
