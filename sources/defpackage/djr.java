package defpackage;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.ImageLoader;
import java.io.File;
import org.chromium.net.CronetEngine;

/* renamed from: djr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class djr implements djk {
    public final oi a;
    public final RequestQueue b;
    private final ImageLoader c;

    public final void a() {
        this.b.getCache().clear();
        this.a.a();
    }

    public djr(Context context) {
        amri b2 = div.b();
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(context.getApplicationContext().getCacheDir(), "mg_volley"), 10485760), new djq(b2.a() ? new djo((CronetEngine) b2.b(), context.getApplicationInfo().uid) : new djp(), context.getApplicationInfo().uid));
        this.b = requestQueue;
        requestQueue.start();
        this.a = new oi(4194304);
        this.c = new ImageLoader(requestQueue, new djm(this));
    }

    public final void a(String str, djj djj) {
        this.c.get(str, new djn(djj));
    }
}
