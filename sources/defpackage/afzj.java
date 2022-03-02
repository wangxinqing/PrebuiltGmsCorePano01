package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.chromium.net.CronetEngine;

/* renamed from: afzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzj implements agac {
    private final CronetEngine a;

    public afzj(CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    public final HttpURLConnection a(String str) {
        URLConnection openConnection = this.a.openConnection(new URL(str));
        if (openConnection instanceof HttpURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }
}
