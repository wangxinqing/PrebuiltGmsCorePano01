package defpackage;

import android.content.Context;
import android.net.wifi.RttManager;
import android.net.wifi.WifiManager;
import java.util.concurrent.Executor;

/* renamed from: aixp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixp implements ajbl {
    public final Context a;
    public final aicn b;
    public final aixt c;
    public final WifiManager d;
    public final arnf e;
    public final Executor f;
    public aizg g;
    private final aixt h;

    public aixp(Context context, arnf arnf, aicn aicn, aixt aixt, aixt aixt2, WifiManager wifiManager, Executor executor) {
        this.a = context;
        this.e = arnf;
        this.b = aicn;
        this.c = aixt;
        this.h = aixt2;
        this.d = wifiManager;
        this.f = executor;
    }

    public final void a(ajbe ajbe, boolean z, aizx aizx) {
        aixr aixr;
        ajbe ajbe2 = ajbe;
        aicn aicn = this.b;
        aicn.a(new aicl(aico.WIFI_REQUEST_SCAN, aicn.b(), "%2$d", ajbe.ordinal()));
        aiyk aiyk = aiyk.g;
        aixt aixt = this.h;
        if (ajbe2 == ajbe.LOCATOR && ((aydu.c() || ayfi.a.a().addRttToWifiScan()) && aiyk.a(this.a))) {
            aixr = new aixr(this.a, this.h, this.b, this.f);
        } else {
            aixr = aixt;
        }
        aiyk.a(this.a, aixr, z, aizx, ajbe2 != ajbe.LOCATOR, this.b, this.f);
    }

    public final void b() {
        aiyk.g.b();
    }

    public final boolean c() {
        return this.d.reconnect();
    }

    public final void a(boolean z, long j, int i, boolean z2) {
        aizg aizg;
        StringBuilder sb = new StringBuilder(91);
        sb.append("setupWifiBatching: enable is ");
        sb.append(z);
        sb.append(", period is ");
        sb.append(j);
        sb.append(", maxScans is ");
        sb.append(i);
        sb.toString();
        if (!axzd.b() || (aizg = this.g) == null || !aizg.a()) {
            aizg aizg2 = this.g;
            if (aizg2 != null && aizg2.b()) {
                amrl.a((Object) this.g);
                this.g.d();
            }
            aiyk.g.a(this.a, z, j, i, this.c, z2);
        } else if (z) {
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("setting batch nanoapp period ");
            sb2.append(j);
            sb2.append(", maxScans is ");
            sb2.append(i);
            sb2.toString();
            amrl.a((Object) this.g);
            this.g.a(j, ((long) i) * j);
        } else {
            amrl.a((Object) this.g);
            this.g.a(0, 0);
        }
    }

    public final void a(aibp[] aibpArr, aisi aisi) {
        aibp[] aibpArr2 = aibpArr;
        aiyk.g.a(this.a, aibpArr2, (RttManager.RttListener) new aixo(this, aisi), this.b, this.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r0 = r4.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r4 = this;
            aiyk r0 = defpackage.aiyk.g
            android.content.Context r1 = r4.a
            r2 = 8
            boolean r0 = r0.a((android.content.Context) r1, (int) r2)
            boolean r1 = defpackage.axzd.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 75
            r2.<init>(r3)
            java.lang.String r3 = "wifiBatchScanSupported: hardwareCapable is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", isNanoAppAllowed is "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0040
            boolean r0 = defpackage.axzd.b()
            if (r0 == 0) goto L_0x003e
            aizg r0 = r4.g
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            return r2
        L_0x003e:
            r1 = 0
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixp.a():boolean");
    }
}
