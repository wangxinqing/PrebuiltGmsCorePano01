package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ukf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukf extends urq {
    private final AdvertiseSettings a;
    private final AdvertiseData b;
    private final AdvertiseData c;
    private tgm d;
    private AdvertiseCallback e;

    public ukf(AdvertiseSettings advertiseSettings, AdvertiseData advertiseData, AdvertiseData advertiseData2) {
        super(31);
        this.a = advertiseSettings;
        this.b = advertiseData;
        this.c = advertiseData2;
    }

    public final void a() {
        AdvertiseCallback advertiseCallback;
        tgm tgm = this.d;
        if (tgm == null || (advertiseCallback = this.e) == null) {
            jjg jjg = ulh.a;
            return;
        }
        tgm.a(advertiseCallback);
        this.e = null;
        this.d = null;
    }

    public final int b() {
        tgm a2 = tgm.a();
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("ukf", "b", 2230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a BLE advertisement because Bluetooth is turned off or BLE advertising is not supported on this device.");
            return 4;
        }
        aosh f = aosh.f();
        uke uke = new uke(f);
        try {
            a2.a.startAdvertising(this.a, this.b, this.c, uke);
            try {
                f.get(aymi.n(), TimeUnit.SECONDS);
                this.d = a2;
                this.e = uke;
                jjg jjg = ulh.a;
                return 2;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((anih) ((anih) ulh.a.b()).a("ukf", "b", 2276, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to start BLE advertising.");
                return 3;
            } catch (ExecutionException e3) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e3);
                ((anih) anih.a("ukf", "b", 2279, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE advertising.");
                return 4;
            } catch (TimeoutException e4) {
                anih anih2 = (anih) ulh.a.b();
                anih2.a((Throwable) e4);
                ((anih) anih2.a("ukf", "b", 2281, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE advertising in %d seconds.", aymi.n());
                return 4;
            }
        } catch (IllegalStateException | NullPointerException e5) {
            ((anih) ((anih) ulh.a.b()).a("ukf", "b", 2258, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a BLE advertisement.");
            return 4;
        }
    }

    public final void a(PrintWriter printWriter) {
        super.a(printWriter);
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.d != null);
        printWriter.write(String.format("    Broadcasting: %s\n", objArr));
        printWriter.write(String.format("    Advertise Settings: %s\n", new Object[]{this.a}));
        printWriter.write(String.format("    Initial Advertisement Data: %s\n", new Object[]{this.b}));
        printWriter.write(String.format("    Scan Response: %s\n", new Object[]{this.c}));
        printWriter.flush();
    }
}
