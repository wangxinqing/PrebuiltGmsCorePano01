package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;

/* renamed from: adfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adfd implements icm {
    private final adff a;
    private final Bitmap b;

    public adfd(adff adff, Bitmap bitmap) {
        this.a = adff;
        this.b = bitmap;
    }

    public final void a(icl icl) {
        Bitmap bitmap;
        adff adff = this.a;
        Bitmap bitmap2 = this.b;
        wlj wlj = (wlj) icl;
        try {
            Status aO = wlj.aO();
            if (aO.c()) {
                bitmap = iqw.a(wlu.a(wlj.b()));
            } else {
                ((anih) ((anih) adff.a.c()).a("adff", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error (%d) loading owner avatar: %s", aO.i, (Object) aO.j);
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap2 = bitmap;
            }
            adff.b.setImageBitmap(bitmap2);
        } finally {
            wlj.c();
        }
    }
}
