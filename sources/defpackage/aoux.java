package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: aoux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoux implements aova {
    final /* synthetic */ aoui a;

    public aoux(aoui aoui) {
        this.a = aoui;
    }

    public final aoud a() {
        aoui aoui = this.a;
        return new aouf(aoui, aoui.b);
    }

    public final Class b() {
        return this.a.getClass();
    }

    public final Set c() {
        return this.a.b();
    }

    public final Class d() {
        return null;
    }

    public final aoud a(Class cls) {
        try {
            return new aouf(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
