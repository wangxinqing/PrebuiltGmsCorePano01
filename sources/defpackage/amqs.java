package defpackage;

import java.io.Serializable;

/* renamed from: amqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqs extends amqt implements Serializable {
    private static final long serialVersionUID = 0;
    final amqt a;

    public amqs(amqt amqt) {
        this.a = amqt;
    }

    public final amqt a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Object b(Object obj) {
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final Object c(Object obj) {
        throw new AssertionError();
    }

    public final Object d(Object obj) {
        return this.a.e(obj);
    }

    public final Object e(Object obj) {
        return this.a.d(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amqs) {
            return this.a.equals(((amqs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
