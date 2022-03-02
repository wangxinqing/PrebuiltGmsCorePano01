package defpackage;

import android.net.NetworkRequest;
import com.android.volley.toolbox.ImageRequest;
import java.util.concurrent.ExecutionException;

/* renamed from: uum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uum implements Runnable {
    private final uvf a;
    private final uvy b;
    private final NetworkRequest c;

    public uum(uvf uvf, uvy uvy, NetworkRequest networkRequest) {
        this.a = uvf;
        this.b = uvy;
        this.c = networkRequest;
    }

    public final void run() {
        uvf uvf = this.a;
        uvy uvy = this.b;
        NetworkRequest networkRequest = this.c;
        try {
            aosh f = aosh.f();
            uuu uuu = new uuu(f, uvy);
            uvf.a.requestNetwork(networkRequest, uuu, ((int) aymi.a.a().bc()) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            uuz uuz = (uuz) f.get();
            uvf.d.put(uvy, uuu);
            uvf.e.put(uvy, uuz.a());
            uvf.f.put(uvy, uuz);
            uvf.c.c(uvy.c);
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 746, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully joined a WiFi Aware network.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }
}
