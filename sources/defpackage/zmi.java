package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: zmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmi implements icm {
    final /* synthetic */ zmr a;

    public zmi(zmr zmr) {
        this.a = zmr;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlj wlj = (wlj) icl;
        ParcelFileDescriptor b = wlj.b();
        if (wlj.aO().c() && b != null) {
            try {
                this.a.r = jju.a(wlu.a(b));
                zmr zmr = this.a;
                zmq zmq = zmr.f;
                if (zmq != null) {
                    zmq.a(zmr.r);
                }
            } finally {
                jjt.a(b);
            }
        }
    }
}
