package com.android.volley.toolbox;

import android.content.Context;
import android.os.Build;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Volley {
    private static RequestQueue a(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache((DiskBasedCache.FileSupplier) new bfp(context.getApplicationContext())), network);
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, (BaseHttpStack) null);
    }

    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        BasicNetwork basicNetwork;
        if (baseHttpStack == null) {
            int i = Build.VERSION.SDK_INT;
            basicNetwork = new BasicNetwork((BaseHttpStack) new HurlStack());
        } else {
            basicNetwork = new BasicNetwork(baseHttpStack);
        }
        return a(context, basicNetwork);
    }

    @Deprecated
    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        if (httpStack != null) {
            return a(context, new BasicNetwork(httpStack));
        }
        return newRequestQueue(context, (BaseHttpStack) null);
    }
}
