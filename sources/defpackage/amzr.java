package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* renamed from: amzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzr implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public amzr(EnumSet enumSet) {
        this.a = enumSet;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new amzs(this.a.clone());
    }
}
