package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: uvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uvx implements uvo {
    public final uvp a;
    public final uui b;
    public final uru c;
    private final Map d = new nz();
    private final aoru e = tid.b();

    public uvx(uvf uvf, uts uts, uvp uvp, uru uru) {
        this.a = uvp;
        this.b = new uui(uvf, uts);
        this.c = uru;
        uvp.a((uvo) this);
    }

    public final uvz a(uvy uvy, String str, tfw tfw) {
        if (uvy != null) {
            uvw uvw = new uvw(this.a, this.b, uvy, str, tfw);
            if (urt.SUCCESS != this.c.b(uvw)) {
                ((anih) ((anih) ulh.a.b()).a("uvx", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect WiFi Aware socket because the MediumOperation failed to register.");
                return null;
            }
            uvz uvz = uvw.a;
            uvz.a(new uvs(this, uvw));
            return uvz;
        }
        ((anih) ((anih) ulh.a.b()).a("uvx", "a", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to WiFi Aware network because wifiAwarePeer is null.");
        return null;
    }

    public final synchronized void b(String str) {
        if (!a(str)) {
            ((anih) ((anih) ulh.a.d()).a("uvx", "b", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting WiFi connections because it was never started.");
            return;
        }
        this.d.remove(str);
        ((anih) ((anih) ulh.a.d()).a("uvx", "b", 127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped accepting incoming WiFi Aware connections.");
    }

    public final synchronized void a() {
        tid.a(this.e, "WifiAwareNetworkManager.singleThreadOffloader");
        Iterator it = new ob((Collection) this.d.keySet()).iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
        uui uui = this.b;
        tid.a(uui.e, "L2ProtocolRunner.alarmExecutor");
        tid.a(uui.c, "L2ProtocolRunner.requestExecutor");
        tid.a(uui.d, "L2ProtocolRunner.acceptExecutor");
    }

    public final void a(Runnable runnable) {
        this.e.execute(runnable);
    }

    public final synchronized void a(String str, uvz uvz) {
        if (!a(str)) {
            ((anih) ((anih) ulh.a.d()).a("uvx", "a", 152, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring incoming WiFi Aware connection because we are no longer accepting incoming connections for %s.", (Object) str);
            ulu.a((ull) uvz, "WifiAware", "IncomingL2Socket");
            return;
        }
        urq urq = new urq(54);
        if (urt.SUCCESS != this.c.b(urq)) {
            ((anih) ((anih) ulh.a.d()).a("uvx", "a", 163, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring incoming WiFi Aware connection because the MediumOperation failed to register.");
            ulu.a((ull) uvz, "WifiAware", "IncomingL2Socket");
            return;
        }
        uvz.a(new uvr(this, urq));
        ((uvv) this.d.get(str)).b().a.a.a(uvz);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.uvi r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            uvy r0 = r7.a     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x004a }
            boolean r1 = r6.a((java.lang.String) r0)     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x002d
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x004a }
            anie r1 = r1.d()     // Catch:{ all -> 0x004a }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "uvx"
            java.lang.String r3 = "a"
            r4 = 134(0x86, float:1.88E-43)
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5)     // Catch:{ all -> 0x004a }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "Ignoring incoming WiFi Aware connection because we are no longer accepting incoming connections for %s."
            r1.a((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x002b
            r7.close()     // Catch:{ all -> 0x004a }
        L_0x002b:
            monitor-exit(r6)
            return
        L_0x002d:
            uui r1 = r6.b     // Catch:{ all -> 0x004a }
            java.util.Map r2 = r6.d     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x004a }
            uvv r2 = (defpackage.uvv) r2     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x004a }
            uvq r3 = new uvq     // Catch:{ all -> 0x004a }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x004a }
            utt r0 = new utt     // Catch:{ all -> 0x004a }
            r0.<init>(r1, r7, r2, r3)     // Catch:{ all -> 0x004a }
            r1.a((java.lang.Runnable) r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r6)
            return
        L_0x004a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvx.a(uvi):void");
    }

    public final synchronized boolean a(String str) {
        return this.d.containsKey(str);
    }

    public final synchronized boolean a(String str, String str2, umn umn) {
        if (str == null || umn == null) {
            ((anih) ((anih) ulh.a.b()).a("uvx", "a", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting WiFi Aware connections because serviceId and/or acceptedConnectionCallback is null.");
            return false;
        } else if (a(str)) {
            ((anih) ((anih) ulh.a.b()).a("uvx", "a", 106, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting WiFi Aware connections for %s because we're already accepting connections.", (Object) str);
            return false;
        } else {
            this.d.put(str, new utp(umn, str2));
            return true;
        }
    }
}
