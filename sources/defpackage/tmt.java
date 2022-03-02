package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: tmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tmt {
    public final Map a = new nz();

    /* access modifiers changed from: package-private */
    public final int a(String str) {
        int i = 1;
        for (tms tms : b(str)) {
            int i2 = tms.f;
            if (i2 != 1 && (i == 1 || i2 < i)) {
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final List b(String str) {
        if (!this.a.containsKey(str)) {
            return new ArrayList();
        }
        return (List) this.a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str) {
        return !b(str).isEmpty();
    }
}
