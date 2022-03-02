package defpackage;

/* renamed from: bzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzu {
    private static final atpn[] a = {atpn.UNKNOWN, atpn.NULL_PLACE_INFERENCE, atpn.PLACES_DID_CHANGE, atpn.NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD};
    private static final atpn[] b = {atpn.UNKNOWN, atpn.SCREEN_IS_OFF, atpn.EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD, atpn.SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS};

    public static atpl a() {
        aucd o = atpl.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpl atpl = (atpl) o.b;
        atpl.b = 2;
        atpl.a |= 1;
        return (atpl) o.i();
    }

    public static atpl b() {
        aucd o = atpl.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpl atpl = (atpl) o.b;
        atpl.b = 3;
        atpl.a |= 1;
        return (atpl) o.i();
    }

    public static atpl a(long j, double d) {
        aucd o = atpl.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpl atpl = (atpl) o.b;
        atpl.b = 1;
        int i = 1 | atpl.a;
        atpl.a = i;
        int i2 = i | 2;
        atpl.a = i2;
        atpl.c = j;
        atpl.a = i2 | 4;
        atpl.d = d;
        return (atpl) o.i();
    }

    public static atpo a(int i, atpn atpn) {
        if (i != 3) {
            if (!jhx.a((Object[]) b, (Object) atpn)) {
                return null;
            }
        } else if (!jhx.a((Object[]) a, (Object) atpn)) {
            return null;
        }
        aucd o = atpo.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpo atpo = (atpo) o.b;
        atpo.b = atpn.h;
        atpo.a |= 1;
        return (atpo) o.i();
    }
}
