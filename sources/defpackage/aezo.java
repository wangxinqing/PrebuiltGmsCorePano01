package defpackage;

/* renamed from: aezo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezo implements amqy {
    static final amqy a = new aezo();

    private aezo() {
    }

    public final Object a(Object obj) {
        aumi aumi = (aumi) obj;
        aucd o = aumb.d.o();
        auay auay = aumi.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumb aumb = (aumb) o.b;
        auay.getClass();
        int i = 1;
        aumb.a |= 1;
        aumb.b = auay;
        int a2 = aumh.a(aumi.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i = 3;
            } else {
                i = 2;
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumb aumb2 = (aumb) o.b;
        aumb2.c = i - 1;
        aumb2.a = 2 | aumb2.a;
        return (aumb) o.i();
    }
}
