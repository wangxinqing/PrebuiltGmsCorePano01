package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ImageLoader {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public Runnable c;
    private final RequestQueue d;
    private int e = 100;
    private final ImageCache f;
    private final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ImageContainer {
        public Bitmap a;
        public final ImageListener b;
        private final String d;
        private final String e;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.a = bitmap;
            this.e = str;
            this.d = str2;
            this.b = imageListener;
        }

        public void cancelRequest() {
            bfo.a();
            if (this.b != null) {
                bfl bfl = (bfl) ImageLoader.this.a.get(this.d);
                if (bfl == null) {
                    bfl bfl2 = (bfl) ImageLoader.this.b.get(this.d);
                    if (bfl2 != null) {
                        bfl2.a(this);
                        if (bfl2.c.size() == 0) {
                            ImageLoader.this.b.remove(this.d);
                        }
                    }
                } else if (bfl.a(this)) {
                    ImageLoader.this.a.remove(this.d);
                }
            }
        }

        public Bitmap getBitmap() {
            return this.a;
        }

        public String getRequestUrl() {
            return this.e;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z);
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) {
        this.d = requestQueue;
        this.f = imageCache;
    }

    private static String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static ImageListener getImageListener(ImageView imageView, int i, int i2) {
        return new bfh(i2, imageView, i);
    }

    public ImageContainer get(String str, ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public boolean isCached(String str, int i, int i2) {
        return isCached(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* access modifiers changed from: protected */
    public Request makeImageRequest(String str, int i, int i2, ImageView.ScaleType scaleType, String str2) {
        return new ImageRequest(str, new bfi(this, str2), i, i2, scaleType, Bitmap.Config.RGB_565, new bfj(this, str2));
    }

    public void onGetImageError(String str, VolleyError volleyError) {
        bfl bfl = (bfl) this.a.remove(str);
        if (bfl != null) {
            bfl.b = volleyError;
            a(str, bfl);
        }
    }

    public void onGetImageSuccess(String str, Bitmap bitmap) {
        this.f.putBitmap(str, bitmap);
        bfl bfl = (bfl) this.a.remove(str);
        if (bfl != null) {
            bfl.a = bitmap;
            a(str, bfl);
        }
    }

    public void setBatchedResponseDelay(int i) {
        this.e = i;
    }

    private final void a(String str, bfl bfl) {
        this.b.put(str, bfl);
        if (this.c == null) {
            bfk bfk = new bfk(this);
            this.c = bfk;
            this.g.postDelayed(bfk, (long) this.e);
        }
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2) {
        return get(str, imageListener, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(String str, int i, int i2, ImageView.ScaleType scaleType) {
        bfo.a();
        return this.f.getBitmap(a(str, i, i2, scaleType)) != null;
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2, ImageView.ScaleType scaleType) {
        ImageListener imageListener2 = imageListener;
        bfo.a();
        String a2 = a(str, i, i2, scaleType);
        Bitmap bitmap = this.f.getBitmap(a2);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, (String) null, (ImageListener) null);
            imageListener2.onResponse(imageContainer, true);
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer((Bitmap) null, str, a2, imageListener);
        imageListener2.onResponse(imageContainer2, true);
        bfl bfl = (bfl) this.a.get(a2);
        if (bfl == null) {
            bfl = (bfl) this.b.get(a2);
        }
        if (bfl == null) {
            Request makeImageRequest = makeImageRequest(str, i, i2, scaleType, a2);
            this.d.add(makeImageRequest);
            this.a.put(a2, new bfl(makeImageRequest, imageContainer2));
            return imageContainer2;
        }
        bfl.c.add(imageContainer2);
        return imageContainer2;
    }
}
