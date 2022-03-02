package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;

/* renamed from: tvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvz implements acvv {
    private final MenuItem a;

    public tvz(MenuItem menuItem) {
        this.a = menuItem;
    }

    public final void a(Object obj) {
        this.a.setIcon(new BitmapDrawable((Bitmap) obj));
    }
}
