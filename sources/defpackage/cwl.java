package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cwl implements djj {
    private final cwn a;

    public cwl(cwn cwn) {
        this.a = cwn;
    }

    public final void a(Bitmap bitmap, boolean z) {
        cwn cwn = this.a;
        cwn.s.a((Drawable) new BitmapDrawable(cwn.t.j.getResources(), bitmap));
    }
}
