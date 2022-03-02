package defpackage;

/* renamed from: alqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqo {
    public final alqs a;

    public alqo(alqs alqs) {
        this.a = alqs;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && (obj instanceof alqo) && this.a.equals(((alqo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + 31;
    }
}
