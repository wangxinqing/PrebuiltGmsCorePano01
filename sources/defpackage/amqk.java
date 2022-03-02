package defpackage;

/* renamed from: amqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqk extends amqm {
    final amqm a;
    final amqm b;

    public amqk(amqm amqm, amqm amqm2) {
        amrl.a((Object) amqm);
        this.a = amqm;
        amrl.a((Object) amqm2);
        this.b = amqm2;
    }

    public final boolean a(char c) {
        return this.a.a(c) || this.b.a(c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("CharMatcher.or(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
