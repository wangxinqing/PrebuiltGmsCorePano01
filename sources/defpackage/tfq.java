package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: tfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfq extends ted {
    public static final /* synthetic */ int f = 0;
    private static final anil g = anil.a("NearbyBootstrap");
    public final Handler a;
    public tdf b;
    public final Context c;
    public final CountDownLatch d;
    public final ServiceConnection e = new tfh(this, "nearby");

    public tfq(Context context, Handler handler) {
        this.c = context;
        this.a = handler;
        this.b = null;
        this.d = new CountDownLatch(1);
    }

    public final tdf a() {
        try {
            this.d.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            anih anih = (anih) g.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("tfq", "a", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get Nearby.Direct service");
        }
        return this.b;
    }

    public final String b() {
        tdf a2 = a();
        if (a2 == null) {
            return null;
        }
        if (a2.b()) {
            String str = a2.b.u;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Target device does not have token set yet.");
        }
        throw new IllegalStateException("The device is not in target mode.");
    }

    public final void a(ConnectRequest connectRequest) {
        this.a.post(new tfm(this, connectRequest));
    }

    public final void a(ContinueConnectRequest continueConnectRequest) {
        this.a.post(new tfn(this, continueConnectRequest));
    }

    public final void a(DisableTargetRequest disableTargetRequest) {
        this.a.post(new tfl(this, disableTargetRequest));
    }

    public final void a(DisconnectRequest disconnectRequest) {
        this.a.post(new tfp(this, disconnectRequest));
    }

    public final void a(EnableTargetRequest enableTargetRequest) {
        this.a.post(new tfk(this, enableTargetRequest));
    }

    public final void a(SendDataRequest sendDataRequest) {
        this.a.post(new tfg(this, sendDataRequest));
    }

    public final void a(StartScanRequest startScanRequest) {
        this.a.post(new tfi(this, startScanRequest));
    }

    public final void a(StopScanRequest stopScanRequest) {
        this.a.post(new tfj(this, stopScanRequest));
    }

    public final void a(teb teb) {
        this.a.post(new tfo(this, teb));
    }
}
