package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/* renamed from: bfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfn implements ImageLoader.ImageListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ NetworkImageView b;

    public bfn(NetworkImageView networkImageView, boolean z) {
        this.b = networkImageView;
        this.a = z;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkImageView networkImageView = this.b;
        int i = networkImageView.d;
        if (i == 0) {
            Drawable drawable = networkImageView.e;
            if (drawable == null) {
                Bitmap bitmap = networkImageView.f;
                if (bitmap != null) {
                    networkImageView.setImageBitmap(bitmap);
                    return;
                }
                return;
            }
            networkImageView.setImageDrawable(drawable);
            return;
        }
        networkImageView.setImageResource(i);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (z && this.a) {
            this.b.post(new bfm(this, imageContainer));
        } else if (imageContainer.getBitmap() == null) {
            NetworkImageView networkImageView = this.b;
            int i = networkImageView.a;
            if (i == 0) {
                Drawable drawable = networkImageView.b;
                if (drawable == null) {
                    Bitmap bitmap = networkImageView.c;
                    if (bitmap != null) {
                        networkImageView.setImageBitmap(bitmap);
                        return;
                    }
                    return;
                }
                networkImageView.setImageDrawable(drawable);
                return;
            }
            networkImageView.setImageResource(i);
        } else {
            this.b.setImageBitmap(imageContainer.getBitmap());
        }
    }
}
