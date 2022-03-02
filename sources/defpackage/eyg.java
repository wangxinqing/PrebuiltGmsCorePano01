package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* renamed from: eyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyg implements amqy {
    private final eyh a;

    public eyg(eyh eyh) {
        this.a = eyh;
    }

    /* JADX INFO: finally extract failed */
    public final Object a(Object obj) {
        eyh eyh = this.a;
        wlj wlj = (wlj) obj;
        ParcelFileDescriptor b = wlj.b();
        try {
            Bitmap a2 = wlu.a(b);
            if (a2 != null) {
                if (a2.getWidth() == a2.getHeight()) {
                    if (a2.getWidth() != eyh.a) {
                    }
                }
                a2 = jmd.a(a2, eyh.a);
            }
            jjt.a(b);
            wlj.c();
            return amri.c(a2);
        } catch (Throwable th) {
            jjt.a(b);
            wlj.c();
            throw th;
        }
    }
}
