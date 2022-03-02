package defpackage;

import com.google.android.places.service.PlaceDetectionAsyncChimeraService;

/* renamed from: akvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvb implements Runnable {
    final /* synthetic */ PlaceDetectionAsyncChimeraService a;

    public akvb(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService) {
        this.a = placeDetectionAsyncChimeraService;
    }

    public final void run() {
        akvl akvl = this.a.a;
        akyn akyn = akvl.h;
        akyn.k.e();
        akyn.g.a();
        akyn.f.n = akyn.y;
        akxr akxr = akyn.i;
        if (!akxr.d) {
            akxr.d = true;
            akxr.a.e();
        }
        akyn.b();
        akhm akhm = akvl.f.b;
        akpb akpb = akhm.a;
        akpt akpt = akpb.b;
        akpt.h = true;
        akpt.j.a.a();
        akpb.d = true;
        akup akup = akhm.b;
        akup.c.a((akyl) akup);
    }
}
