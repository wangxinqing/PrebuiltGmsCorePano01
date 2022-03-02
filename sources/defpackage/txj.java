package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: txj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txj {
    public static final Bitmap a(String str, int i, int i2) {
        String str2;
        RequestFuture newFuture = RequestFuture.newFuture();
        if (!aymw.o()) {
            jjg jjg = tsp.a;
        } else if (str.contains("=")) {
            jjg jjg2 = tsp.a;
        } else if (i == 0 || i2 == 0) {
            jjg jjg3 = tsp.a;
        } else {
            str2 = String.format(String.valueOf(str).concat("=w%s-h%s"), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ihs.b().getRequestQueue().add(new ImageRequest(str2, newFuture, i, i2, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.ARGB_8888, newFuture));
            jjg jjg4 = tsp.a;
            return (Bitmap) newFuture.get(5, TimeUnit.SECONDS);
        }
        str2 = str;
        ihs.b().getRequestQueue().add(new ImageRequest(str2, newFuture, i, i2, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.ARGB_8888, newFuture));
        try {
            jjg jjg42 = tsp.a;
            return (Bitmap) newFuture.get(5, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            anih anih = (anih) tsp.a.b();
            anih.a(e);
            anih.a("FastPair: Unable to download image: %s", (Object) str);
            return null;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            anih anih2 = (anih) tsp.a.b();
            anih2.a((Throwable) e2);
            anih2.a("FastPair: Unable to download image: %s", (Object) str);
            return null;
        }
    }
}
