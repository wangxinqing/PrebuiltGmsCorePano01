package defpackage;

/* 'enum' modifier removed */
/* renamed from: amqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqa extends amqb {
    public final String a(amqb amqb, String str) {
        if (amqb == amqb.LOWER_HYPHEN) {
            return ampw.a(str.replace('_', '-'));
        }
        if (amqb == amqb.LOWER_UNDERSCORE) {
            return ampw.a(str);
        }
        return super.a(amqb, str);
    }

    public amqa(String str, amqm amqm, String str2) {
        super(str, 4, amqm, str2);
    }
}
