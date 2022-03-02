package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: zmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmj implements icm {
    final /* synthetic */ zmr a;

    public zmj(zmr zmr) {
        this.a = zmr;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void a(icl icl) {
        zmq zmq;
        wky wky = (wky) icl;
        if (wky.aO().c() && wky.b() != null) {
            ArrayList arrayList = new ArrayList();
            try {
                int a2 = wky.b().a();
                for (int i = 0; i < a2; i++) {
                    wzs b = wky.b().a(i);
                    arrayList.add(new Circle(1, b.c(), b.d(), b.g()));
                }
                wky.c();
                if (!arrayList.isEmpty() && (zmq = this.a.f) != null) {
                    zmq.f().f = arrayList;
                    if (this.a.f.f().a()) {
                        this.a.f.a(Status.a, this.a.f.f());
                    }
                }
            } catch (Throwable th) {
                wky.c();
                throw th;
            }
        } else {
            zmq zmq2 = this.a.f;
            if (zmq2 != null) {
                zmq2.a(zmr.a, (AddToCircleData) null);
            }
        }
    }
}
