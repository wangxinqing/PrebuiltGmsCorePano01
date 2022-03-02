package defpackage;

import android.graphics.Bitmap;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: akia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akia extends ImageRequest implements NetworkCallbacks {
    public akia(String str, Response.Listener listener, int i, int i2, Response.ErrorListener errorListener) {
        super(str, listener, i, i2, (Bitmap.Config) null, errorListener);
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.b(10254);
    }
}
