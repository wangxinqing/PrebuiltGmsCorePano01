package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: aouw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aouw implements aova {
    final /* synthetic */ aoud a;

    public aouw(aoud aoud) {
        this.a = aoud;
    }

    public final aoud a() {
        return this.a;
    }

    public final Class b() {
        return this.a.getClass();
    }

    public final Set c() {
        return Collections.singleton(this.a.b());
    }

    public final Class d() {
        return null;
    }

    public final aoud a(Class cls) {
        if (this.a.b().equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }
}
