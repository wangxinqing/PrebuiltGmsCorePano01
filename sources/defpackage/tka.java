package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: tka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tka extends ugt {
    public final tku a;
    public final tlh b;
    private final IBinder.DeathRecipient c = new tjx(this);
    private final ScheduledExecutorService d;
    private tfu e;
    private tfu f;
    private tjv g;
    private final tkc h;

    public tka(Context context, String str, String str2, Long l, tlj tlj, tku tku, tgj tgj, tkc tkc) {
        ScheduledExecutorService a2 = tid.a();
        this.a = tku;
        this.b = new tlh(context, str, str2, l, tlj, tgj, this.c);
        this.h = tkc;
        this.d = a2;
    }

    private static void a(Object obj, String str) {
        iva.a(obj, (Object) str.concat(" requires a non-null callback object"));
    }

    private static void h(long j) {
        boolean z = true;
        if (j != 0 && j <= 0) {
            z = false;
        }
        iva.b(z, "durationMillis must be positive or Connections.DURATION_INDEFINITE");
    }

    private final void i(long j) {
        this.b.a(j);
    }

    public final void b(long j) {
        i(j);
        a(new uiz().a);
    }

    public final void c(long j) {
        i(j);
        a(new udt().a);
    }

    public final String d(long j) {
        i(j);
        tlh tlh = this.b;
        String a2 = ths.a();
        long b2 = tlh.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 21);
        sb.append(a2);
        sb.append(":");
        sb.append(b2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        this.b.a(printWriter);
        printWriter.flush();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(long j) {
        ((anih) ((anih) tky.a.d()).a("tka", "e", 325, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timing out discovery for client %s after %d ms", this.b.b(), j);
        tku tku = this.a;
        tlh tlh = this.b;
        new ujb();
        tku.d(tlh, true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(long j) {
        ((anih) ((anih) tky.a.d()).a("tka", "f", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timing out advertising for client %s after %d ms", this.b.b(), j);
        tku tku = this.a;
        tlh tlh = this.b;
        new uix();
        tku.c(tlh, true);
    }

    public final void g(long j) {
        i(j);
        a(new ujb().a);
    }

    private static void a(tfu tfu) {
        if (tfu != null) {
            tfu.b();
        }
    }

    public final void b(ugr ugr, String str, long j, long j2) {
        i(j2);
        uit uit = new uit();
        uit.a((uhd) new tjq(ugr));
        uit.a((ugb) new tjp(ugr));
        uit.a(str);
        uit.b("__LEGACY_SERVICE_ID__");
        uit.a.e = j;
        tif tif = new tif();
        tif.a(Strategy.a);
        uit.a(tif.a);
        a(uit.a);
    }

    private static void a(byte[] bArr, int i) {
        boolean z = true;
        if (bArr != null && bArr.length > i) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Payload cannot be longer than ");
        sb.append(i);
        sb.append(" bytes");
        iva.b(z, sb.toString());
    }

    public final String a() {
        return ths.a();
    }

    public final void a(long j) {
        i(j);
        a(new uix().a);
    }

    public final void a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
        if (acceptConnectionRequestParams.e == null) {
            iva.a((Object) acceptConnectionRequestParams.b, (Object) "AcceptConnection requires either a ConnectionEventListener or PayloadListener but neither was found.");
            uha uha = acceptConnectionRequestParams.a;
            tjv tjv = this.g;
            if (tjv != null) {
                tjv.b = uha;
                tjv.a = acceptConnectionRequestParams.b;
                uha = new tju(tjv, acceptConnectionRequestParams);
            }
            udp udp = new udp(acceptConnectionRequestParams);
            udp.a(uha);
            udp.a((uge) null);
            udp.a((ugx) new tjo(acceptConnectionRequestParams.b));
            acceptConnectionRequestParams = udp.a;
        }
        a((Object) acceptConnectionRequestParams.a, "acceptConnectionRequest()");
        a((Object) acceptConnectionRequestParams.e, "acceptConnectionRequest()");
        iva.a(acceptConnectionRequestParams.c, (Object) "remoteEndpointId cannot be empty");
        a(acceptConnectionRequestParams.d, 32768);
        tku tku = this.a;
        tku.a(acceptConnectionRequestParams.a, (Callable) new tkq(tku, acceptConnectionRequestParams, this.b));
    }

    public final void b(String[] strArr, byte[] bArr, long j) {
        i(j);
        a(bArr, 1168);
        uir uir = new uir();
        uir.a(tjw.a());
        uir.a(strArr);
        uir.a(tla.a(bArr));
        uir.a(false);
        a(uir.a);
    }

    public final void a(CancelPayloadParams cancelPayloadParams) {
        a((Object) cancelPayloadParams.a, "cancelPayload()");
        iva.a((Object) Long.valueOf(cancelPayloadParams.b), (Object) "Must specify a Payload to cancel.");
        tku tku = this.a;
        tku.a(cancelPayloadParams.a, (Callable) new tkf(tku, this.b, cancelPayloadParams));
    }

    public final void a(ClientDisconnectingParams clientDisconnectingParams) {
        a(false);
    }

    public final void a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
        iva.a(disconnectFromEndpointParams.a, (Object) "remoteEndpointId cannot be empty");
        tku tku = this.a;
        tlh tlh = this.b;
        tlh.r(disconnectFromEndpointParams.a);
        tku.a((Runnable) new tkg(tku, disconnectFromEndpointParams, tlh));
    }

    public final void a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        tlh tlh = this.b;
        iva.a(tlb.a(tlh.c, tlh.d, tlh.e));
        tku tku = this.a;
        tku.a(initiateBandwidthUpgradeParams.a, (Callable) new tks(tku, this.b, initiateBandwidthUpgradeParams));
    }

    public final void a(RejectConnectionRequestParams rejectConnectionRequestParams) {
        a((Object) rejectConnectionRequestParams.a, "rejectConnectionRequest()");
        iva.a(rejectConnectionRequestParams.b, (Object) "remoteEndpointId cannot be empty");
        tku tku = this.a;
        tlh tlh = this.b;
        tlh.r(rejectConnectionRequestParams.b);
        tku.a(rejectConnectionRequestParams.a, (Callable) new tkr(tku, rejectConnectionRequestParams, tlh));
    }

    public final void a(SendConnectionRequestParams sendConnectionRequestParams) {
        if (sendConnectionRequestParams.g == null) {
            iva.a((Object) sendConnectionRequestParams.b, (Object) "SendConnectionRequest requires either a ConnectionEventListener or ConnectionLifecycleListener but neither was found.");
            iva.a((Object) sendConnectionRequestParams.c, (Object) "SendConnectionRequest requires either a ConnectionResponseListener or ConnectionLifecycleListener but neither was found.");
            uip uip = new uip(sendConnectionRequestParams);
            uip.a((uge) null);
            uip.a((ugk) null);
            uip.a((ugh) new tjn(this, sendConnectionRequestParams.b, sendConnectionRequestParams.c));
            sendConnectionRequestParams = uip.a;
        }
        a((Object) sendConnectionRequestParams.a, "sendConnectionRequest()");
        a((Object) sendConnectionRequestParams.g, "sendConnectionRequest()");
        iva.a(sendConnectionRequestParams.e, (Object) "remoteEndpointId cannot be empty");
        ConnectionOptions connectionOptions = sendConnectionRequestParams.i;
        if (connectionOptions != null) {
            byte[] bArr = connectionOptions.i;
            boolean z = false;
            if (!connectionOptions.b || !connectionOptions.c || !connectionOptions.d || !connectionOptions.g || !connectionOptions.h || !connectionOptions.f || bArr != null || connectionOptions.j) {
                tlh tlh = this.b;
                iva.a(tlb.a(tlh.c, tlh.d, tlh.e), (Object) String.format("Invalid connection options for non-exempt client %s: %s", new Object[]{this.b.d, connectionOptions}));
            }
            if (bArr == null || bArr.length == 6) {
                z = true;
            }
            iva.b(z, "sendConnectionRequest() requires either empty or valid Bluetooth MAC address.");
        }
        a(sendConnectionRequestParams.f, 32768);
        tku tku = this.a;
        tlh tlh2 = this.b;
        tlh2.p(sendConnectionRequestParams.e);
        tku.a(sendConnectionRequestParams.a, (Callable) new tkp(tku, sendConnectionRequestParams, tlh2));
    }

    public final void a(SendPayloadParams sendPayloadParams) {
        boolean z;
        a((Object) sendPayloadParams.a, "sendPayload()");
        if (sendPayloadParams.b.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "remoteEndpointIds cannot be empty");
        ParcelablePayload parcelablePayload = sendPayloadParams.c;
        iva.a((Object) parcelablePayload, (Object) "Payload cannot be null");
        if (parcelablePayload.b == 1) {
            iva.a((Object) parcelablePayload.c, (Object) "Payload bytes cannot be null");
            a(parcelablePayload.c, 32768);
        }
        tku tku = this.a;
        tku.a(sendPayloadParams.a, (Callable) new tkt(tku, this.b, sendPayloadParams));
    }

    public final void a(StartAdvertisingParams startAdvertisingParams) {
        boolean z;
        if ("__LEGACY_SERVICE_ID__".equals(startAdvertisingParams.d)) {
            iva.a(this.b.b, (Object) "You must provide a service ID in the application tag of your manifest with a metadata tag with the name com.google.android.gms.nearby.connection.SERVICE_ID");
            uit uit = new uit(startAdvertisingParams);
            uit.b(this.b.b);
            startAdvertisingParams = uit.a;
        } else {
            iva.a(startAdvertisingParams.d, (Object) "You must provide a non-empty service ID for advertising");
        }
        if (startAdvertisingParams.g == null) {
            iva.a((Object) startAdvertisingParams.b, (Object) "StartAdvertising requires either an AdvertisingCallback or ConnectionLifecycleListener but neither was found.");
            this.g = new tjv(startAdvertisingParams.b);
            uit uit2 = new uit(startAdvertisingParams);
            uit2.a((ugb) null);
            uit2.a((ugh) this.g);
            startAdvertisingParams = uit2.a;
        }
        AdvertisingOptions advertisingOptions = startAdvertisingParams.f;
        if (advertisingOptions != null) {
            Strategy strategy = advertisingOptions.a;
            if (!Strategy.a.equals(strategy) && !Strategy.b.equals(strategy) && !Strategy.c.equals(strategy)) {
                jjg jjg = tky.a;
                uit uit3 = new uit(startAdvertisingParams);
                tif tif = new tif(advertisingOptions);
                tif.a(Strategy.a);
                uit3.a(tif.a);
                startAdvertisingParams = uit3.a;
            }
        }
        if (startAdvertisingParams.f.h != null) {
            String str = startAdvertisingParams.c;
            byte[] bArr = startAdvertisingParams.h;
            if (str != null) {
                bArr = str.getBytes();
            }
            iva.a((Object) bArr, (Object) "Either endpoint name or info must not be null");
            int length = bArr.length;
            if (length <= 17) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z, String.format(Locale.US, "Invalid endpoint name or info length: %d", new Object[]{Integer.valueOf(length)}));
        }
        AdvertisingOptions advertisingOptions2 = startAdvertisingParams.f;
        if (advertisingOptions2 != null && (!advertisingOptions2.b || !advertisingOptions2.c || !advertisingOptions2.d || !advertisingOptions2.e || advertisingOptions2.f != null || advertisingOptions2.h != null || !advertisingOptions2.i || !advertisingOptions2.j || !advertisingOptions2.k || advertisingOptions2.l || advertisingOptions2.m)) {
            tlh tlh = this.b;
            iva.a(tlb.a(tlh.c, tlh.d, tlh.e), (Object) String.format("Invalid advertising options for non-exempt client %s: %s", new Object[]{this.b.d, advertisingOptions2}));
        }
        a((Object) startAdvertisingParams.a, "startAdvertising()");
        a((Object) startAdvertisingParams.g, "startAdvertising()");
        long j = startAdvertisingParams.e;
        h(j);
        a(this.e);
        tku tku = this.a;
        tlh tlh2 = this.b;
        uhd uhd = startAdvertisingParams.a;
        tku.b.execute(new tkk(new tkl(tku, tlh2, startAdvertisingParams), uhd));
        if (j != 0) {
            jjg jjg2 = tky.a;
            this.e = tfu.b(new tjy(this, j), j, this.d);
        }
    }

    public final void a(StartDiscoveryParams startDiscoveryParams) {
        if (startDiscoveryParams.f == null) {
            iva.a((Object) startDiscoveryParams.b, (Object) "StartDiscovery requires either an DiscoveryCallback or DiscoveryListener but neither was found.");
            uiv uiv = new uiv(startDiscoveryParams);
            uiv.a((ugn) null);
            uiv.a((ugq) new tjl(startDiscoveryParams.b));
            startDiscoveryParams = uiv.a;
        }
        DiscoveryOptions discoveryOptions = startDiscoveryParams.e;
        if (discoveryOptions != null) {
            Strategy strategy = discoveryOptions.a;
            if (!Strategy.a.equals(strategy) && !Strategy.b.equals(strategy) && !Strategy.c.equals(strategy)) {
                jjg jjg = tky.a;
                uiv uiv2 = new uiv(startDiscoveryParams);
                tiw tiw = new tiw(discoveryOptions);
                tiw.a(Strategy.a);
                uiv2.a(tiw.a);
                startDiscoveryParams = uiv2.a;
            }
        }
        DiscoveryOptions discoveryOptions2 = startDiscoveryParams.e;
        if (discoveryOptions2 != null && (discoveryOptions2.b || !discoveryOptions2.c || !discoveryOptions2.d || discoveryOptions2.f != null || !discoveryOptions2.g || !discoveryOptions2.h || !discoveryOptions2.i)) {
            tlh tlh = this.b;
            iva.a(tlb.a(tlh.c, tlh.d, tlh.e), (Object) String.format("Invalid discovery options for non-exempt client %s: %s", new Object[]{this.b.d, discoveryOptions2}));
        }
        a((Object) startDiscoveryParams.a, "startDiscovery()");
        a((Object) startDiscoveryParams.f, "startDiscovery()");
        iva.a(startDiscoveryParams.c, (Object) "serviceId must not be empty");
        long j = startDiscoveryParams.d;
        h(j);
        a(this.f);
        tku tku = this.a;
        tku.a(startDiscoveryParams.a, (Callable) new tkn(tku, this.b, startDiscoveryParams));
        if (j != 0) {
            jjg jjg2 = tky.a;
            this.f = tfu.b(new tjz(this, j), j, this.d);
        }
    }

    public final void a(StopAdvertisingParams stopAdvertisingParams) {
        a(this.e);
        this.a.c(this.b, false);
    }

    public final void a(StopAllEndpointsParams stopAllEndpointsParams) {
        tku tku = this.a;
        tlh tlh = this.b;
        tlh.u();
        tku.a((Runnable) new tkh(tku, tlh));
    }

    public final void a(StopDiscoveryParams stopDiscoveryParams) {
        a(this.f);
        this.a.d(this.b, false);
    }

    public final void a(String str, long j) {
        i(j);
        ufx ufx = new ufx();
        ufx.a(str);
        a(ufx.a);
    }

    public final void a(ugr ugr, String str, long j) {
        i(j);
        uin uin = new uin();
        uin.a((uha) new tjj(ugr));
        uin.a(str);
        a(uin.a);
    }

    public final void a(ugr ugr, String str, long j, long j2) {
        i(j2);
        uiv uiv = new uiv();
        uiv.a((uha) new tjt(ugr));
        uiv.a((ugn) new tjr(ugr));
        uiv.a(str);
        uiv.a.d = j;
        tiw tiw = new tiw();
        tiw.a(Strategy.a);
        uiv.a(tiw.a);
        a(uiv.a);
    }

    public final void a(ugr ugr, String str, String str2, byte[] bArr, long j) {
        i(j);
        uip uip = new uip();
        uip.a((uha) new tjh(ugr));
        uip.a(tjw.a(ugr));
        uip.a((ugk) new ugj(ugr));
        uip.a(str);
        uip.b(str2);
        SendConnectionRequestParams sendConnectionRequestParams = uip.a;
        sendConnectionRequestParams.f = bArr;
        a(sendConnectionRequestParams);
    }

    public final void a(ugr ugr, String str, byte[] bArr, long j) {
        i(j);
        udp udp = new udp();
        udp.a((uha) new tji(ugr));
        udp.a(tjw.a(ugr));
        udp.a(str);
        AcceptConnectionRequestParams acceptConnectionRequestParams = udp.a;
        acceptConnectionRequestParams.d = bArr;
        a(acceptConnectionRequestParams);
    }

    public final void a(boolean z) {
        jjg jjg = tky.a;
        String str = this.b.d;
        a(this.e);
        a(this.f);
        tid.a(this.d, "ClientBridge.alarmExecutor");
        tku tku = this.a;
        tlh tlh = this.b;
        tlh.u();
        tku.a((Runnable) new tki(tku, tlh));
        tkc tkc = this.h;
        tkd tkd = tkc.a;
        tkd.h.remove(tkc.b);
    }

    public final void a(String[] strArr, byte[] bArr, long j) {
        i(j);
        a(bArr, (int) FragmentTransaction.TRANSIT_ENTER_MASK);
        uir uir = new uir();
        uir.a(tjw.a());
        uir.a(strArr);
        uir.a(tla.a(bArr));
        uir.a(true);
        a(uir.a);
    }
}
