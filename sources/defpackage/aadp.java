package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;

/* renamed from: aadp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadp implements aadq {
    public final boolean a(Uri uri, int i) {
        try {
            return InetAddress.getByName(uri.getHost()).isReachable(i);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PingReachabilityChecker", String.format("Error checking if %s is reachable: %s", new Object[]{uri.getHost(), e}));
            return false;
        }
    }
}
