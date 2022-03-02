package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ubt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ubt extends arwm {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ ubv c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubt(ubv ubv, String str, List list, int i) {
        super(str);
        this.c = ubv;
        this.a = list;
        this.b = i;
    }

    public final void run() {
        uao.a(this.a);
        this.c.a(this.b, (Collection) this.a);
    }
}
