package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: jrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jrl implements jsw {
    private final jrq a;
    private final amri b;

    public jrl(jrq jrq, amri amri) {
        this.a = jrq;
        this.b = amri;
    }

    public final void a(amri amri) {
        jrq jrq = this.a;
        amri amri2 = this.b;
        if (amri.a()) {
            jrq.b.setImageDrawable(new BitmapDrawable(jrq.a.getResources(), (Bitmap) amri.b()));
            jrq.b.setVisibility(0);
            jrq.b.setOnClickListener(new jro(jrq, amri2));
        }
    }
}
