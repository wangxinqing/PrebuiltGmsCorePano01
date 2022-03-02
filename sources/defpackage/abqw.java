package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: abqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqw implements abqg {
    public static final Strategy a = Strategy.c;
    public static final iwd b = acqa.a("D2D", "SourceDeviceConnectorNearbyConnections");
    public final tiq c;
    public final Handler d;
    public acau e;
    public abst f;
    public String g;
    public abwg h;
    public anxm i = anxm.DEFAULT;
    public final nz j = new nz();
    public abon k = abon.a;
    public final tiz l = new abqq(this);
    public final tim m = new abqr(this);
    public final tjd n = new abqs(this);
    private acel o;
    private final abpo p;
    private int q;

    public abqw(tiq tiq, abpo abpo) {
        this.c = tiq;
        this.d = abpo.b;
        this.p = abpo;
    }

    private final void b(String str) {
        this.c.g(str);
    }

    private final void c(String str) {
        try {
            abwg abwg = this.h;
            if (abwg != null) {
                tjc a2 = tjc.a(abwg.a());
                tiq tiq = this.c;
                if (tiq != null) {
                    tiq.a(str, a2);
                }
                b.a("Sent encrypted auth token", new Object[0]);
            }
        } catch (GeneralSecurityException e2) {
            b.e("Encryption error", e2, new Object[0]);
        }
    }

    private static final icf a(acwa acwa) {
        Status status = Status.a;
        try {
            acws.a(acwa);
        } catch (InterruptedException | ExecutionException e2) {
            Exception e3 = acwa.e();
            if (e3 instanceof ibr) {
                status = new Status(((ibr) e3).a());
            }
            b.a(e2);
        }
        iva.a((Object) status, (Object) "Result must not be null");
        igv igv = new igv(Looper.getMainLooper());
        igv.a((icl) status);
        return igv;
    }

    public final void b() {
        abom a2 = this.k.a();
        a2.c = false;
        this.k = a2.a();
        b.b("Stopping discovery.", new Object[0]);
        acel acel = this.o;
        if (acel != null) {
            acel.b();
        }
        this.c.p();
    }

    private final icf a(String str, tim tim) {
        acby acby = new acby();
        byte b2 = this.k.c;
        byte[] bArr = acby.a;
        bArr[1] = b2;
        bArr[2] = (byte) this.q;
        try {
            return a(this.c.a(new String(Base64.encode(bArr, 3), "UTF-8"), str, tim));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final acwa a() {
        if (!azjt.c() || !this.k.d) {
            String str = this.g;
            if (str == null) {
                b.e("No connection in progress to disconnect.", new Object[0]);
                return acws.a((Exception) new ibr(new Status(10567)));
            }
            if (this.k.b) {
                b.b(str.length() == 0 ? new String("Disconnecting from endpoint ") : "Disconnecting from endpoint ".concat(str), new Object[0]);
                b(str);
            } else {
                b.b("Rejecting endpoint %s", str);
                a(this.c.a(str)).a();
            }
            this.k = abon.a;
            this.g = null;
            return acws.a((Object) null);
        }
        b();
        this.k = abon.a;
        return acws.a((Object) null);
    }

    public final acwa a(ConnectionRequest connectionRequest, acau acau) {
        tiz tiz;
        int i2;
        String str = this.g;
        if (str != null) {
            iwd iwd = b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Already connected to another device ");
            sb.append(str);
            sb.append(". Refusing to connect.");
            iwd.a(sb.toString(), new Object[0]);
            return acws.a((Exception) new ibr(new Status(10566)));
        }
        if (azky.d()) {
            D2DDevice d2DDevice = connectionRequest.a;
            this.q = connectionRequest.f;
            if (d2DDevice != null) {
                return a(d2DDevice, acau, connectionRequest.b);
            }
        }
        String str2 = connectionRequest.e;
        String str3 = connectionRequest.c;
        byte[] bArr = connectionRequest.d;
        if (this.c == null) {
            return acws.a(new Exception("GoogleApiClient is not supported."));
        }
        this.e = acau;
        tiw tiw = new tiw();
        tiw.a(a);
        DiscoveryOptions discoveryOptions = tiw.a;
        if (bArr != null) {
            tiz = new abqt(this, bArr);
        } else if (str3 == null) {
            return acws.a((Exception) new ibr(new Status(10594)));
        } else {
            tiz = new abqu(this, str3, str2);
        }
        acbj acbj = new acbj(this.d, tiz);
        boolean isEmpty = TextUtils.isEmpty(str2);
        abom abom = new abom();
        abom.b = !isEmpty;
        abom.c = true;
        this.k = abom.a();
        if (!azjt.b()) {
            i2 = 15;
        } else {
            i2 = 10595;
        }
        acel acel = new acel(jfm.b(10), (Executor) null, azjt.a.a().f(), new abqp(this, acau, i2));
        this.o = acel;
        acel.a();
        return this.c.a(azlf.g(), (tiz) acbj, discoveryOptions);
    }

    public final acwa a(D2DDevice d2DDevice, acau acau, String str) {
        String str2 = this.g;
        if (str2 == null) {
            abom abom = new abom();
            abom.b = false;
            this.k = abom.a();
            iwd iwd = b;
            String str3 = d2DDevice.c;
            String str4 = d2DDevice.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36 + String.valueOf(str4).length());
            sb.append("Requesting connection to device: ");
            sb.append(str3);
            sb.append(" (");
            sb.append(str4);
            sb.append(")");
            iwd.a(sb.toString(), new Object[0]);
            this.e = acau;
            this.g = d2DDevice.d;
            this.i = anxm.a(d2DDevice.h);
            amrl.a((Object) this.g, (Object) "Connection endpoint ID is null.");
            return a(this.g, azky.c(), this.m);
        }
        iwd iwd2 = b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 58);
        sb2.append("Already connected to another device ");
        sb2.append(str2);
        sb2.append(". Refusing to connect.");
        iwd2.e(sb2.toString(), new Object[0]);
        return acws.a((Exception) new ibr(new Status(10566)));
    }

    public final acwa a(String str, long j2, tim tim) {
        acbg acbg = new acbg(this.d, tim);
        Status status = (Status) a(str, (tim) acbg).a();
        int i2 = status.i;
        int i3 = 0;
        while (!status.c() && ((long) i3) < j2) {
            status = (Status) a(str, (tim) acbg).a();
            i3++;
        }
        ((ahgz) this.p.f.f.a()).b(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(status.i));
        if (!status.c()) {
            this.g = null;
        }
        return status.c() ? acws.a((Object) null) : acws.a((Exception) new ibr(status));
    }

    public final void a(String str) {
        if (this.g != null) {
            iwd iwd = b;
            String valueOf = String.valueOf(str);
            iwd.a(valueOf.length() == 0 ? new String("Disconnected from device endpoint ") : "Disconnected from device endpoint ".concat(valueOf), new Object[0]);
            this.g = null;
            this.f = null;
            acau acau = this.e;
            if (acau != null) {
                acau.a();
            }
        }
    }

    public final void a(byte[] bArr, String str) {
        try {
            abom a2 = this.k.a();
            a2.d = false;
            this.k = a2.a();
            abwg abwg = this.h;
            if (abwg != null) {
                abwg.a(bArr);
                b.a("Verified auth token", new Object[0]);
            }
            acau acau = this.e;
            tiq tiq = this.c;
            amrl.a((Object) acau, (Object) "connectionCallbacks must not be null!");
            amrl.a((Object) tiq, (Object) "connectionsClient must not be null!");
            c(str);
            acau.a(new abvu(tiq, str), new TargetConnectionArgs());
            b.a("Connection complete.", new Object[0]);
        } catch (GeneralSecurityException e2) {
            b.e("Failed to validate authentication token", e2, new Object[0]);
            b(str);
            this.k = abon.a;
        }
    }
}
