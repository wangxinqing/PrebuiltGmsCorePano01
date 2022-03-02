package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cwh implements djj {
    private final cwj a;
    private final int b;

    public cwh(cwj cwj, int i) {
        this.a = cwj;
        this.b = i;
    }

    public final void a(Bitmap bitmap, boolean z) {
        cwj cwj = this.a;
        int i = this.b;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(cwj.t.j.getResources(), bitmap);
        ma.a((Drawable) bitmapDrawable, i);
        cwj.s.a((Drawable) bitmapDrawable);
    }
}
