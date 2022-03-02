package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: amsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsr {
    final Set a = new HashSet();

    /* access modifiers changed from: package-private */
    public final amss a() {
        return new amss(this.a);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        while (i <= i2) {
            this.a.add(Integer.valueOf(i));
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(amss amss) {
        for (Integer intValue : amss.b) {
            this.a.add(Integer.valueOf(intValue.intValue()));
        }
    }
}
