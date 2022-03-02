package defpackage;

import java.util.List;

/* renamed from: apdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apdi extends apeh {
    private final List a;

    public apdi(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null spans");
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apeh) {
            return this.a.equals(((apeh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
