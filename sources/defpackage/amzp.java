package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* renamed from: amzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzp implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public amzp(EnumMap enumMap) {
        this.a = enumMap;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new amzq(this.a);
    }
}
