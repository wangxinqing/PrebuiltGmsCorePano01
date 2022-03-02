package defpackage;

/* 'enum' modifier removed */
/* renamed from: ampz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampz extends amqb {
    public final String a(amqb amqb, String str) {
        if (amqb == amqb.LOWER_HYPHEN) {
            return str.replace('_', '-');
        }
        if (amqb == amqb.UPPER_UNDERSCORE) {
            return ampw.b(str);
        }
        return super.a(amqb, str);
    }

    public ampz(String str, amqm amqm, String str2) {
        super(str, 1, amqm, str2);
    }
}
