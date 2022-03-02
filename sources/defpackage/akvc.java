package defpackage;

import com.google.android.places.service.PlaceDetectionAsyncChimeraService;

/* renamed from: akvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvc implements Runnable {
    final /* synthetic */ PlaceDetectionAsyncChimeraService a;

    public akvc(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService) {
        this.a = placeDetectionAsyncChimeraService;
    }

    public final void run() {
        akjy akjy = (akjy) this.a.a.f.b.b.d;
        if (akjy.d) {
            int i = akjy.i;
            if (i == -1 || i == 0) {
                aklz.a();
                return;
            }
            for (akje c : akjy.c.values()) {
                c.c();
            }
            return;
        }
        aklz.a();
    }
}
