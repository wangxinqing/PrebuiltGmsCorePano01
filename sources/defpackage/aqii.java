package defpackage;

import java.io.Serializable;

/* renamed from: aqii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aqii implements Serializable {
    public static aqih f() {
        aqih aqih = new aqih();
        aqih.b(5.0d);
        aqih.a(100.0d);
        aqih.e(2.5d);
        aqih.c(0.5d);
        aqih.d(0.5d);
        return aqih;
    }

    public static aqih g() {
        aqih aqih = new aqih();
        aqih.b(1.0d);
        aqih.a(200.0d);
        aqih.e(1.0d);
        aqih.c(0.5d);
        aqih.d(2.5d);
        return aqih;
    }

    public abstract double a();

    public abstract double b();

    public abstract double c();

    public abstract double d();

    public abstract double e();
}
