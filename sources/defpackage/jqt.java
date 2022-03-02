package defpackage;

import android.graphics.Bitmap;

/* renamed from: jqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqt implements jsw {
    private final jqv a;

    public jqt(jqv jqv) {
        this.a = jqv;
    }

    public final void a(amri amri) {
        jqv jqv = this.a;
        if (amri.a()) {
            jqv.b.setImageBitmap((Bitmap) amri.b());
            jqv.b.setVisibility(0);
        }
    }
}
