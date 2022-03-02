package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;

/* renamed from: dab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dab implements djj {
    private final dac a;
    private final MenuItem b;

    public dab(dac dac, MenuItem menuItem) {
        this.a = dac;
        this.b = menuItem;
    }

    public final void a(Bitmap bitmap, boolean z) {
        this.b.setIcon(new BitmapDrawable(this.a.d.getContext().getResources(), bitmap));
    }
}
