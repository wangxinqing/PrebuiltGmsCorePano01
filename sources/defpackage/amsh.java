package defpackage;

import java.util.Iterator;

/* renamed from: amsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsh implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ amsk b;

    public amsh(amsk amsk, CharSequence charSequence) {
        this.b = amsk;
        this.a = charSequence;
    }

    public final Iterator iterator() {
        return this.b.b(this.a);
    }

    public final String toString() {
        amre a2 = amre.a(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        a2.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
