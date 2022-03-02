package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: aouy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aouy implements aova {
    final /* synthetic */ aout a;
    final /* synthetic */ aoui b;

    public aouy(aout aout, aoui aoui) {
        this.a = aout;
        this.b = aoui;
    }

    public final aoud a() {
        aout aout = this.a;
        return new aous(aout, this.b, aout.b);
    }

    public final Class b() {
        return this.a.getClass();
    }

    public final Set c() {
        return this.a.b();
    }

    public final Class d() {
        return this.b.getClass();
    }

    public final aoud a(Class cls) {
        try {
            return new aous(this.a, this.b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
