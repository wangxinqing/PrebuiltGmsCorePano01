package defpackage;

/* 'enum' modifier removed */
/* renamed from: ampy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampy extends amqb {
    public final String a(amqb amqb, String str) {
        if (amqb == amqb.LOWER_UNDERSCORE) {
            return str.replace('-', '_');
        }
        if (amqb == amqb.UPPER_UNDERSCORE) {
            return ampw.b(str.replace('-', '_'));
        }
        return super.a(amqb, str);
    }

    public ampy(String str, amqm amqm, String str2) {
        super(str, 0, amqm, str2);
    }
}
