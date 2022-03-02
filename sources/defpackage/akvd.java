package defpackage;

import android.content.Intent;
import com.google.android.places.Subscription;
import com.google.android.places.service.PlaceDetectionAsyncChimeraService;
import java.util.List;

/* renamed from: akvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvd implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ PlaceDetectionAsyncChimeraService b;

    public akvd(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService, Intent intent) {
        this.b = placeDetectionAsyncChimeraService;
        this.a = intent;
    }

    public final void run() {
        boolean z;
        akvl akvl = this.b.a;
        Intent intent = this.a;
        akiy akiy = akvl.f;
        int b2 = ikh.b(intent);
        if (b2 == 4) {
            akis akis = akiy.h;
            if (ikh.a(intent)) {
                z = ikh.b(intent) == 4;
            } else {
                z = false;
            }
            iva.b(z);
            akis akis2 = akiy.h;
            if (!akis2.b) {
                akis2.a.c(intent);
                akis2.b = true;
                for (Subscription b3 : akiy.h.a()) {
                    akiy.b(b3);
                }
                List list = akiy.i;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) list.get(i)).run();
                }
                akiy.i.clear();
                akiy.g.a(akiy.h.b());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown cache type: ");
        sb.append(b2);
        alfy.d("Places", sb.toString());
    }
}
