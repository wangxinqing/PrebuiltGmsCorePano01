package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: tpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tpm implements tlk {
    private final tph a;
    private final tnq b = new tnq(this.a);
    private final tob c = new tob(this.b);
    private final trm d;
    private final tlt e;
    private final tqv f;

    public tpm(Context context) {
        this.a = new tph(context);
        this.d = new trm(context, this.c);
        this.e = new tlt(this.a, this.c, this.b);
        this.f = new tqv(this.a, this.c, this.b, this.e);
    }

    public final int a(tlh tlh, long j) {
        ((anih) tky.a.d()).a("Client %d cancelled payload %d.", tlh.b(), j);
        trk a2 = this.d.d.a(j);
        if (a2 == null) {
            ((anih) tky.a.d()).a("Client requested cancel for unknown payload %d, ignoring.", j);
            return 8014;
        }
        a2.c.set(true);
        return 0;
    }

    public final void b() {
    }

    public final void c(tlh tlh, String str) {
        ((anih) tky.a.d()).a("Client %d requested a disconnection from endpoint %s.", tlh.b(), (Object) str);
        tob tob = this.c;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        tob.a(new tnv(tob, tlh, str, countDownLatch));
        thr.a(String.format("unregisterEndpoint(%s)", new Object[]{str}), countDownLatch);
    }

    public final void b(tlh tlh, int i) {
        ((anih) tky.a.d()).a("Client %d requested discovery to stop.", tlh.b());
        tqu a2 = this.f.a(tlh);
        if (a2 != null) {
            a2.i(tlh);
        }
    }

    public final int a(tlh tlh, String str) {
        ((anih) tky.a.d()).a("Client %d rejected the connection with endpoint %s.", tlh.b(), (Object) str);
        tqu a2 = this.f.a(tlh);
        if (a2 == null) {
            return 8009;
        }
        return a2.a(tlh, str);
    }

    public final void b(tlh tlh, String str) {
        ((anih) tky.a.d()).a("Client %d initiated a manual bandwidth upgrade with endpoint %s.", tlh.b(), (Object) str);
        this.e.a(tlh, str);
    }

    public final int a(tlh tlh, String str, DiscoveryOptions discoveryOptions, ugq ugq) {
        ((anih) tky.a.d()).a("Client %d requested discovery to start.", tlh.b());
        tqv tqv = this.f;
        int a2 = tqv.a(tlh, discoveryOptions.a);
        if (a2 != 0) {
            return a2;
        }
        tqu a3 = tqv.a(tlh);
        if (a3 == null) {
            return 13;
        }
        return a3.a(tlh, str, discoveryOptions, ugq);
    }

    public final int a(tlh tlh, String str, byte[] bArr, ugx ugx) {
        ((anih) tky.a.d()).a("Client %d accepted the connection with endpoint %s.", tlh.b(), (Object) str);
        tqu a2 = this.f.a(tlh);
        if (a2 == null) {
            return 8009;
        }
        return a2.a(tlh, str, bArr, ugx);
    }

    public final int a(tlh tlh, byte[] bArr, String str, AdvertisingOptions advertisingOptions, ugh ugh) {
        ((anih) tky.a.d()).a("Client %d requested advertising to start.", tlh.b());
        tqv tqv = this.f;
        int a2 = tqv.a(tlh, advertisingOptions.a);
        if (a2 != 0) {
            return a2;
        }
        tqu a3 = tqv.a(tlh);
        if (a3 == null) {
            return 13;
        }
        return a3.a(tlh, str, bArr, advertisingOptions, ugh);
    }

    public final int a(tlh tlh, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, ugh ugh) {
        ((anih) tky.a.d()).a("Client %d requested a connection to endpoint %s.", tlh.b(), (Object) str);
        tqu a2 = this.f.a(tlh);
        if (a2 == null) {
            return 8009;
        }
        return a2.a(tlh, bArr, str, bArr2, connectionOptions, ugh);
    }

    public final void a() {
        tpm tpm = this;
        ((anih) tky.a.d()).a("Initiating shutdown of OfflineServiceController.");
        tqv tqv = tpm.f;
        ((anih) tky.a.d()).a("Initiating shutdown of PCPManager.");
        for (int i = 0; i < tqv.a.size(); i++) {
            ((tqu) tqv.a.valueAt(i)).a();
        }
        tqv.a.clear();
        ((anih) tky.a.d()).a("PCPManager has shut down.");
        tlt tlt = tpm.e;
        ((anih) tky.a.d()).a("Initiating shutdown of BandwidthUpgradeManager.");
        tlt.a.b(asav.BANDWIDTH_UPGRADE_NEGOTIATION, tlt);
        tid.a(tlt.c, "BandwidthUpgradeManager.alarmExecutor");
        tid.a(tlt.d, "BandwidthUpgradeManager.serialExecutor");
        for (tnm a2 : tlt.f.values()) {
            a2.a(6);
        }
        tlt.f.clear();
        tlt.g.clear();
        tlt.a();
        tlt.i = asoe.UNKNOWN_MEDIUM;
        for (tlx a3 : tlt.e.values()) {
            a3.a();
        }
        tlt.e.clear();
        ((anih) tky.a.d()).a("BandwidthUpgradeManager has shut down.");
        trm trm = tpm.d;
        ((anih) tky.a.d()).a("Initiating shutdown of PayloadManager.");
        trm.a.b(asav.PAYLOAD_TRANSFER, trm);
        tid.a(trm.b, "PayloadManager.readStatusExecutor");
        tid.a(trm.c, "PayloadManager.payloadStatusUpdateExecutor");
        List a4 = trm.d.a();
        int size = a4.size();
        int i2 = 0;
        while (i2 < size) {
            trk trk = (trk) a4.get(i2);
            trm.d.b(trk.a());
            trk.d();
            i2++;
            tpm = this;
        }
        tob tob = tpm.c;
        ((anih) tky.a.d()).a("Initiating shutdown of EndpointManager.");
        tid.a(tob.b, "EndpointManager.serialExecutor");
        tid.a(tob.d, "EndpointManager.endpointReadersThreadPool");
        tid.a(tob.e, "EndpointManager.endpointKeepAliveManagerThreadPool");
        tob.c.clear();
        ((anih) tky.a.d()).a("EndpointManager has shut down.");
        tpm.b.a();
        tph tph = tpm.a;
        ((anih) tky.a.d()).a("Initiating shutdown of MediumManager.");
        synchronized (tph.d) {
            synchronized (tph.e) {
                synchronized (tph.f) {
                    synchronized (tph.g) {
                        synchronized (tph.h) {
                            synchronized (tph.i) {
                                synchronized (tph.j) {
                                    synchronized (tph.k) {
                                        if (tph.c.get()) {
                                            ulj ulj = tph.b;
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 62, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of Bluetooth.");
                                            ulj.f.a();
                                            ulj.e.a();
                                            ulj.b.b();
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bluetooth has shut down.");
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 69, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of WiFi.");
                                            une une = ulj.j;
                                            tid.a(une.c, "WifiDirect.singleThreadOffloader");
                                            une.c();
                                            une.f();
                                            une.a.a();
                                            ulj.i.a();
                                            ulj.h.a();
                                            uoh uoh = ulj.g;
                                            uoh.j();
                                            synchronized (uoh) {
                                                tid.a(uoh.l, "WifiHotspot.singleThreadOffloader");
                                                uoh.g();
                                                uoh.e();
                                                uoh.h();
                                            }
                                            ulj.c.d();
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi has shut down.");
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of NFC.");
                                            ulj.l.a();
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NFC has shut down.");
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Initiating shutdown of WebRTC.");
                                            ulj.k.b();
                                            ((anih) ((anih) ulh.a.d()).a("ulj", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WebRTC has shut down.");
                                            uru uru = ulj.a;
                                            String str = "uru";
                                            String str2 = "a";
                                            if (uru.f.compareAndSet(false, true)) {
                                                synchronized (uru) {
                                                    for (urs urs : uru.c.values()) {
                                                        String str3 = str;
                                                        String str4 = str2;
                                                        urs.b.b();
                                                        str = str3;
                                                        str2 = str4;
                                                    }
                                                    tid.a(uru.e, "MultiMediumDependencyManager.needsRetryExecutor");
                                                    Iterator it = uru.b().iterator();
                                                    while (it.hasNext()) {
                                                        urq urq = (urq) it.next();
                                                        ((anih) ((anih) ulh.a.d()).a(str, str2, 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", (Object) "[MMD]:", (Object) urq.d());
                                                        uru.c(urq);
                                                        it = it;
                                                        str = str;
                                                        str2 = str2;
                                                    }
                                                }
                                            }
                                            tph.c.set(false);
                                            tph.a.b(tph);
                                            ((anih) tky.a.d()).a("MediumManager has shut down.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ((anih) tky.a.d()).a("OfflineServiceController has shut down.");
    }

    public final void a(PrintWriter printWriter) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ulj ulj = this.a.b;
        uru uru = ulj.a;
        printWriter.write(String.format("%s\n", new Object[]{"[MMD]:"}));
        urq urq = uru.g;
        if (urq != null) {
            printWriter.write(String.format("  Currently Registering: %s\n", new Object[]{urq.d()}));
        }
        printWriter.write(String.format("  Ready To Run: %s\n", new Object[]{uru.a((Collection) uru.a)}));
        printWriter.write(String.format("  Running: %s\n", new Object[]{uru.a((Collection) uru.b)}));
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (urq urq2 : uru.c.keySet()) {
            sb.append(urq2.d());
            sb.append(" (attempts: ");
            sb.append(((urs) uru.c.get(urq2)).a);
            sb.append(")");
        }
        sb.append("]");
        objArr[0] = sb.toString();
        printWriter.write(String.format("  Awaiting Retry: %s\n", objArr));
        printWriter.write(String.format("  Paused: %s\n", new Object[]{uru.a((Collection) uru.d.keySet())}));
        printWriter.flush();
        ujq ujq = ulj.e;
        urq urq3 = ujq.c;
        urq urq4 = ujq.d;
        printWriter.write("[BluetoothClassic]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(ujq.b())}));
        Object[] objArr2 = new Object[1];
        if (urq3 != null) {
            z = true;
        } else {
            z = false;
        }
        objArr2[0] = Boolean.valueOf(z);
        printWriter.write(String.format("  Scanning: %s\n", objArr2));
        Object[] objArr3 = new Object[1];
        if (urq4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr3[0] = Boolean.valueOf(z2);
        printWriter.write(String.format("  Advertising: %s\n", objArr3));
        if (urq3 != null) {
            urq3.a(printWriter);
        }
        if (urq4 != null) {
            urq4.a(printWriter);
        }
        printWriter.flush();
        ukz ukz = ulj.f;
        ukc ukc = ukz.b;
        uky uky = ukz.c;
        ukf ukf = ukz.d;
        ukf ukf2 = ukz.e;
        printWriter.write("[BluetoothLowEnergy]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(ukz.b())}));
        Object[] objArr4 = new Object[1];
        if (ukc != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        objArr4[0] = Boolean.valueOf(z3);
        printWriter.write(String.format("  GATT Server Opened: %s\n", objArr4));
        Object[] objArr5 = new Object[1];
        if (uky != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        objArr5[0] = Boolean.valueOf(z4);
        printWriter.write(String.format("  Socket Opened: %s\n", objArr5));
        Object[] objArr6 = new Object[1];
        if (ukf != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        objArr6[0] = Boolean.valueOf(z5);
        printWriter.write(String.format("  Advertising: %s\n", objArr6));
        Object[] objArr7 = new Object[1];
        if (ukf2 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        objArr7[0] = Boolean.valueOf(z6);
        printWriter.write(String.format("  Fast Advertising: %s\n", objArr7));
        if (ukf != null) {
            ukf.a(printWriter);
        }
        if (ukf2 != null) {
            ukf2.a(printWriter);
        }
        printWriter.flush();
        uoh uoh = ulj.g;
        printWriter.write("[WifiHotspot]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(uoh.a())}));
        printWriter.flush();
        uoz uoz = ulj.h;
        printWriter.write("[WifiLan]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(uoz.b())}));
        printWriter.flush();
        ump ump = ulj.i;
        printWriter.write("[WifiAware]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(ump.b())}));
        printWriter.flush();
        une une = ulj.j;
        unc unc = une.b;
        printWriter.write("[WifiDirect]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(une.a())}));
        Object[] objArr8 = new Object[1];
        if (unc != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        objArr8[0] = Boolean.valueOf(z7);
        printWriter.write(String.format("  Hosting a Group: %s\n", objArr8));
        if (unc != null) {
            unc.a(printWriter);
        }
        printWriter.flush();
        uls uls = ulj.l;
        printWriter.write("[NearFieldCommunication]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(uls.b())}));
        printWriter.flush();
        umm umm = ulj.k;
        printWriter.write("[WebRTC]:\n");
        printWriter.write(String.format("  Is Available: %s\n", new Object[]{Boolean.valueOf(umm.a())}));
        printWriter.flush();
    }

    public final void a(tlh tlh, int i) {
        ((anih) tky.a.d()).a("Client %d requested advertising to stop.", tlh.b());
        tqu a2 = this.f.a(tlh);
        if (a2 != null) {
            a2.h(tlh);
        }
    }

    public final void a(tlh tlh, String[] strArr, ParcelablePayload parcelablePayload) {
        aoru aoru;
        ((anih) tky.a.d()).a("Client %d is sending payload %d to endpoints %s.", (Object) Long.valueOf(tlh.b()), (Object) Long.valueOf(parcelablePayload.a), (Object) Arrays.toString(strArr));
        trm trm = this.d;
        int i = parcelablePayload.b;
        if (i != 1) {
            aoru = i != 2 ? i != 3 ? null : tlh.i : tlh.j;
        } else {
            aoru = tlh.k;
        }
        if (aoru == null) {
            trm.b(tlh, strArr, parcelablePayload);
            ((anih) tky.a.d()).a("PayloadManager failed to determine the right executor for outgoing payload (ID: %d, type: %d), aborting sendPayload().", parcelablePayload.a, parcelablePayload.b);
            return;
        }
        aoru.execute(new trh(trm, parcelablePayload, strArr, tlh));
    }
}
