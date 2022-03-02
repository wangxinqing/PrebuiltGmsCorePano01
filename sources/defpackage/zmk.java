package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: zmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmk implements icm {
    final /* synthetic */ zmr a;

    public zmk(zmr zmr) {
        this.a = zmr;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wld wld = (wld) icl;
        Status aO = wld.aO();
        String b = wld.b();
        String c = wld.c();
        this.a.s = false;
        Circle circle = null;
        this.a.t = null;
        if (aO.c()) {
            circle = new Circle(1, b, c, Circle.a);
        }
        zmq zmq = this.a.f;
        if (zmq != null) {
            zmq.a(aO, circle);
        }
    }
}
