package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chf {
    private static chf c;
    public final List a = new ArrayList();
    public boolean b;
    private final ContextHubManager d = ((ContextHubManager) cbi.f().getSystemService("contexthub"));
    private ContextHubClient e;

    private chf() {
    }

    public static final NanoAppMessage a(int i, byte[] bArr) {
        return NanoAppMessage.createMessageToNanoApp(5147455389092024337L, i, bArr);
    }

    private final boolean f() {
        ContextHubManager contextHubManager = this.d;
        if (contextHubManager == null) {
            return false;
        }
        if (this.e != null) {
            return true;
        }
        List contextHubs = contextHubManager.getContextHubs();
        if (contextHubs.isEmpty()) {
            ((anih) ((anih) bxk.a.b()).a("chf", "f", 166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ShushGestureSensor] Context hub handle not found");
            return false;
        }
        ContextHubClient createClient = this.d.createClient((ContextHubInfo) contextHubs.get(0), new che(this));
        this.e = createClient;
        return createClient != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.acwa b() {
        /*
            r6 = this;
            android.hardware.location.ContextHubManager r0 = r6.d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0071
        L_0x0006:
            android.hardware.location.ContextHubClient r2 = r6.e
            if (r2 == 0) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            java.util.List r0 = r0.getContextHubs()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0031
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r2 = 166(0xa6, float:2.33E-43)
            java.lang.String r3 = "chf"
            java.lang.String r4 = "f"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[ShushGestureSensor] Context hub handle not found"
            r0.a((java.lang.String) r2)
            goto L_0x0071
        L_0x0031:
            java.lang.Object r0 = r0.get(r1)
            android.hardware.location.ContextHubInfo r0 = (android.hardware.location.ContextHubInfo) r0
            android.hardware.location.ContextHubManager r2 = r6.d
            che r3 = new che
            r3.<init>(r6)
            android.hardware.location.ContextHubClient r0 = r2.createClient(r0, r3)
            r6.e = r0
            if (r0 == 0) goto L_0x0071
        L_0x0047:
            acwd r0 = new acwd
            r0.<init>()
            android.hardware.location.ContextHubManager r1 = r6.d
            android.hardware.location.ContextHubClient r2 = r6.e
            android.hardware.location.ContextHubInfo r2 = r2.getAttachedHub()
            android.hardware.location.ContextHubTransaction r1 = r1.queryNanoApps(r2)
            chc r2 = new chc
            r2.<init>(r0)
            bwn r3 = defpackage.cbi.k()
            java.lang.String r4 = "ShushGestureSensor_check_gesture_availability"
            bvp r4 = defpackage.bvq.a(r4)
            java.util.concurrent.Executor r3 = r3.a((defpackage.bvp) r4)
            r1.setOnCompleteListener(r2, r3)
            acwi r0 = r0.a
            return r0
        L_0x0071:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            acwa r0 = defpackage.acws.a((java.lang.Object) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chf.b():acwa");
    }

    public final void c() {
        ContextHubClient contextHubClient = this.e;
        if (contextHubClient != null) {
            contextHubClient.close();
            this.e = null;
        }
    }

    public final void d() {
        if (!this.b) {
            b().a((acvp) new chd(this));
            this.b = true;
        }
    }

    public final void e() {
        if (this.b) {
            this.b = false;
            d();
        }
    }

    public static chf a() {
        if (c == null) {
            c = new chf();
        }
        return c;
    }

    public final void a(NanoAppMessage nanoAppMessage) {
        ContextHubClient contextHubClient = this.e;
        if (contextHubClient != null) {
            int sendMessageToNanoApp = contextHubClient.sendMessageToNanoApp(nanoAppMessage);
        }
    }

    public final void a(cdb cdb) {
        this.a.remove(cdb);
        if (this.a.isEmpty() && this.b && this.e != null) {
            a(a(2, new byte[0]));
            c();
            this.b = false;
        }
    }
}
