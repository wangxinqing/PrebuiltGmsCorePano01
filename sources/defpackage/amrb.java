package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: amrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amrb extends amqp implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public amrb(Pattern pattern) {
        amrl.a((Object) pattern);
        this.a = pattern;
    }

    public final amqo a(CharSequence charSequence) {
        return new amqo(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
