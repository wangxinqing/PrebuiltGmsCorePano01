package defpackage;

import java.util.Objects;

/* renamed from: awey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awey {
    private final Class a;
    private final String b = null;

    private awey(Class cls) {
        this.a = cls;
    }

    public static awey a(Class cls) {
        amrl.a((Object) cls);
        return new awey(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awey) {
            awey awey = (awey) obj;
            if (Objects.equals(this.a, awey.a)) {
                String str = awey.b;
                if (Objects.equals((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.a) ^ 1000003) * 1000003) ^ Objects.hashCode((Object) null);
    }

    public final String toString() {
        return this.a.getCanonicalName();
    }
}
