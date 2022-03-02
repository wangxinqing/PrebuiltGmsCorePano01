package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: alxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxe extends alxd {
    private final String d = a("value").b();

    public alxe(amic amic) {
        super(amic);
    }

    public final List a() {
        if (this.d.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(aluv.a(this.a, 0, this.d));
    }
}
