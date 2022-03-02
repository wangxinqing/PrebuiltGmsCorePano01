package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: twf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class twf {
    private tts a;
    protected final Context c;
    protected final ttg d;
    protected final ttu e;

    protected twf(Context context, ttg ttg) {
        this.c = context;
        this.d = ttg;
        this.e = new ttu(ttg.G(), ttg.m(), context);
    }

    /* access modifiers changed from: protected */
    public abstract aspb a();

    public String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        String str2;
        ((anih) tsp.a.d()).a("PairingProgressHandler:onPairedCallbackCalled with address:%s", (Object) str);
        byte[] b = aeha.b();
        if (tvd.a(this.d, bArr) && b == null) {
            arxt.b();
        }
        Context context = this.c;
        ttg ttg = this.d;
        String a2 = aeha.a();
        if (arww.c(str) != null) {
            ((anih) tsp.a.d()).a("FastPair: No need to rename because device has alias name in Settings.");
            str2 = arww.c(str);
        } else if (!tvd.a(ttg, bArr)) {
            str2 = bArr == null ? ttg.k() : ttg.l();
        } else if (b != null) {
            try {
                Iterator it = ((List) arxt.a().get()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ((anih) tsp.a.c()).a("Fast Pair: Should never happen, can't find existing item with the existing account key.");
                        str2 = ttg.k();
                        break;
                    }
                    tzj tzj = (tzj) it.next();
                    if ((tzj.a & 1) != 0 && Arrays.equals(tzj.b.k(), b)) {
                        try {
                            str2 = ((uaj) aucj.a((aucj) uaj.K, tzj.c.k(), aubs.c())).h;
                            break;
                        } catch (auda e2) {
                            anih anih = (anih) tsp.a.c();
                            anih.a((Throwable) e2);
                            anih.a("FastPair: Fail to parse the matched discover item data.");
                            str2 = ttg.k();
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException e3) {
                anih anih2 = (anih) tsp.a.c();
                anih2.a(e3);
                anih2.a("FastPair: Failed to read devices from Footprints.");
                str2 = ttg.k();
            }
        } else {
            str2 = a2 == null ? tvk.a(context, ttg) : a2;
        }
        arww.a(str, str2);
        if (tvd.a(ttg, bArr) && a2 == null) {
            aeha.a(str2);
        }
        ((anih) tsp.a.d()).a("FastPairBattery: preemptively suppressing battery notification for %s", (Object) str);
        ((txd) thl.a(this.c, txd.class)).e.put(str, (Object) null);
        return str2;
    }

    /* access modifiers changed from: protected */
    public abstract aspb b();

    public void b(String str) {
        hph hph;
        hph hph2;
        ((anih) tsp.a.d()).a("PairingProgressHandler:onPairingSuccess with address:%s", (Object) str);
        this.e.a(this.a.a());
        ttu ttu = this.e;
        if (aymw.d() && (hph2 = ttu.a.b) != null) {
            hph2.c("FastPairImpressionCounter").a();
        }
        ttu ttu2 = this.e;
        if (aymw.d() && (hph = ttu2.a.b) != null) {
            hph.d();
        }
    }

    public void c() {
        ((anih) tsp.a.d()).a("PairingProgressHandler:onPairingSetupCompleted");
    }

    public void d() {
        ((anih) tsp.a.d()).a("PairingProgressHandler:onPairingStarted");
        this.e.a(a());
        tts f = ttt.f();
        f.a(b());
        this.a = f;
        this.e.b(aspb.WAIT_FOR_SCREEN_UNLOCK);
    }

    public void e() {
        ((anih) tsp.a.d()).a("PairingProgressHandler:onReadyToPair");
    }

    public void a(aehy aehy) {
        ((anih) tsp.a.d()).a("PairingProgressHandler:onSetupPreferencesBuilder");
    }

    public void a(String str) {
        ((anih) tsp.a.d()).a("PairingProgressHandler:onGetBluetoothAddress");
    }

    public void a(Throwable th) {
        anih anih = (anih) tsp.a.c();
        anih.a(th);
        anih.a("PairingProgressHandler:onPairingFailed");
        if (this.e.a()) {
            this.e.a(th);
        }
        ttu ttu = this.e;
        tts tts = this.a;
        tts.a = th;
        ttu.a(tts.a());
    }

    public byte[] a(byte[] bArr, aeha aeha, aegz aegz) {
        ((anih) tsp.a.d()).a("PairingProgressHandler:getKeyForLocalCache");
        return bArr == null ? aeha.b() : bArr;
    }
}
