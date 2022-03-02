package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: arxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxb {
    public arxw a;
    public CountDownLatch b = new CountDownLatch(1);
    public boolean c;
    public final arxa d;
    final ServiceConnection e = new arwz(this);
    private final Context f;

    public arxb(Context context, arxa arxa) {
        this.f = context;
        this.d = arxa;
    }

    public final synchronized DeviceDetailsLinks a(String str) {
        arxw arxw = this.a;
        if (arxw == null) {
            ((anih) ((anih) aryq.a.c()).a("arxb", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getDeviceDetailsLinks failed due to no service connection.");
            return null;
        }
        return arxw.b(str);
    }

    public final synchronized TrueWirelessHeadset b(String str) {
        arxw arxw = this.a;
        if (arxw == null) {
            ((anih) ((anih) aryq.a.c()).a("arxb", "b", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getTrueWirelessHeadset failed due to no service connection.");
            return null;
        }
        return arxw.a(str);
    }

    public final synchronized String a(byte[] bArr) {
        arxw arxw = this.a;
        if (arxw == null) {
            ((anih) ((anih) aryq.a.c()).a("arxb", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getFastPairDeviceAddress failed due to no service connection.");
            return null;
        }
        return arxw.a(bArr);
    }

    public final synchronized void b() {
        ((anih) ((anih) aryq.a.d()).a("arxb", "b", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: DeviceStatusServiceConnUtil stopServiceConnection called, serviceStarted=%b", (Object) Boolean.valueOf(this.c));
        if (this.c) {
            this.c = false;
            this.f.unbindService(this.e);
            this.a = null;
            this.b = new CountDownLatch(1);
        }
    }

    public final synchronized void a() {
        ((anih) ((anih) aryq.a.d()).a("arxb", "a", 89, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: DeviceStatusServiceConnUtil startServiceConnection called, serviceStarted=%b", (Object) Boolean.valueOf(this.c));
        if (!this.c) {
            this.c = true;
            Intent b2 = arza.b(this.f);
            b2.setAction("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE");
            this.f.bindService(b2, this.e, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j, aosh aosh) {
        try {
            this.b.await(j, TimeUnit.MILLISECONDS);
            synchronized (this) {
                arxw arxw = this.a;
                if (arxw == null) {
                    ((anih) ((anih) aryq.a.c()).a("arxb", "a", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getFirmwareUpdatableItems fail because deviceStatusService is null!");
                    aosh.b((Object) null);
                } else {
                    aosh.b((Object) arxw.b());
                }
            }
        } catch (RemoteException | InterruptedException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxb", "a", 156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getFirmwareUpdatableItems meet exception!");
            aosh.b((Object) null);
        }
    }
}
