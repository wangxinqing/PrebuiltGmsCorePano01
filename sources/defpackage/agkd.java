package defpackage;

/* renamed from: agkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkd extends agkg {
    public static final agkd a = new agkd();

    public final /* bridge */ /* synthetic */ audx a(audx audx, audx audx2) {
        baqo baqo = (baqo) audx;
        baqo baqo2 = (baqo) audx2;
        if (baqo == null || baqo2 == null) {
            return baqo;
        }
        if ((baqo.a & 1) == 0) {
            return null;
        }
        aucd o = baqo.d.o();
        baqp baqp = baqo.c;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqo baqo3 = (baqo) o.b;
        baqp.getClass();
        baqo3.c = baqp;
        int i = baqo3.a | 2;
        baqo3.a = i;
        int i2 = baqo.b - baqo2.b;
        if (i2 == 0) {
            return null;
        }
        baqo3.a = i | 1;
        baqo3.b = i2;
        return (baqo) o.i();
    }

    private agkd() {
    }

    public final /* bridge */ /* synthetic */ audx a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        aucd o = baqo.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqo baqo = (baqo) o.b;
        baqo.a |= 1;
        baqo.b = intValue;
        if (str != null) {
            baqp a2 = agkj.a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqo baqo2 = (baqo) o.b;
            a2.getClass();
            baqo2.c = a2;
            baqo2.a |= 2;
        }
        return (baqo) o.i();
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        baqp baqp = ((baqo) audx).c;
        if (baqp == null) {
            baqp = baqp.d;
        }
        return baqp.c;
    }
}
