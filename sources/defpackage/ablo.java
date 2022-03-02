package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;

/* renamed from: ablo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablo implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ablp a;
    private final String b;
    private final abfp c;

    public ablo(ablp ablp, String str, abfp abfp) {
        this.a = ablp;
        this.b = str;
        this.c = abfp;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ablq(this.a.b, this.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amri amri = (amri) obj;
        abfp abfp = this.c;
        if (amri.a()) {
            abfp.a.a.setImageDrawable(new BitmapDrawable(abfp.b.b, (Bitmap) amri.b()));
            return;
        }
        ImageView imageView = abfp.a.a;
        Resources resources = abfp.b.b;
        imageView.setImageDrawable(iqw.a(resources, resources.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48)));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
