package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: obl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obl {
    public static final String[] a = {"data2"};
    public static final String[] b = {"vnd.android.cursor.item/name"};

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 != 6) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.avmt a(defpackage.avmt r2, boolean r3, com.google.android.gms.googlehelp.common.HelpConfig r4, android.content.Context r5) {
        /*
            avmt r0 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x0033
            r0 = 2
            if (r2 == r0) goto L_0x001c
            if (r2 == r1) goto L_0x0013
            r0 = 6
            if (r2 == r0) goto L_0x001c
        L_0x0012:
            goto L_0x003a
        L_0x0013:
            boolean r2 = r4.s()
            if (r2 == 0) goto L_0x003a
            avmt r2 = defpackage.avmt.EMAIL
            return r2
        L_0x001c:
            if (r3 != 0) goto L_0x0030
            boolean r2 = r4.j()
            if (r2 != 0) goto L_0x002d
            boolean r2 = r4.d(r5)
            if (r2 == 0) goto L_0x003a
            avmt r2 = defpackage.avmt.PHONE
            return r2
        L_0x002d:
            avmt r2 = defpackage.avmt.C2C
            return r2
        L_0x0030:
            avmt r2 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            return r2
        L_0x0033:
            int r2 = r4.l
            if (r2 != r1) goto L_0x0012
            avmt r2 = defpackage.avmt.CHAT
            return r2
        L_0x003a:
            avmt r2 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obl.a(avmt, boolean, com.google.android.gms.googlehelp.common.HelpConfig, android.content.Context):avmt");
    }

    public static avnm a(avmt avmt, HelpConfig helpConfig) {
        nz nzVar = new nz();
        avnq avnq = helpConfig.j;
        if (!(avnq == null || avnq.g.size() == 0)) {
            aucx aucx = helpConfig.j.g;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                avnm avnm = (avnm) aucx.get(i);
                avmt a2 = avmt.a(avnm.b);
                if (a2 == null) {
                    a2 = avmt.UNKNOWN_CONTACT_MODE;
                }
                nzVar.put(a2, avnm);
            }
        }
        avnm avnm2 = (avnm) nzVar.get(avmt);
        if (avnm2 != null) {
            return avnm2;
        }
        aucd o = avnm.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avnm avnm3 = (avnm) o.b;
        int i2 = avnm3.a | 4;
        avnm3.a = i2;
        avnm3.e = false;
        avnm3.b = avmt.i;
        avnm3.a = i2 | 1;
        return (avnm) o.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.avnq a(defpackage.nze r6) {
        /*
            java.lang.Class<obl> r0 = defpackage.obl.class
            monitor-enter(r0)
            java.lang.String r1 = "escalation_options"
            avnq r2 = defpackage.avnq.j     // Catch:{ all -> 0x007f }
            audx r1 = r6.a((java.lang.String) r1, (defpackage.audx) r2)     // Catch:{ all -> 0x007f }
            avnq r1 = (defpackage.avnq) r1     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x007d
            int r2 = r1.a     // Catch:{ all -> 0x007f }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = "ongoing_chat_request_pool_id"
            java.lang.String r3 = ""
            java.lang.String r6 = r6.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x007f }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x007d
            r2 = 5
            java.lang.Object r3 = r1.c(r2)     // Catch:{ all -> 0x007f }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ all -> 0x007f }
            r3.a((defpackage.aucj) r1)     // Catch:{ all -> 0x007f }
            avnn r1 = r1.d     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0033
            avnn r1 = defpackage.avnn.d     // Catch:{ all -> 0x007f }
        L_0x0033:
            java.lang.Object r2 = r1.c(r2)     // Catch:{ all -> 0x007f }
            aucd r2 = (defpackage.aucd) r2     // Catch:{ all -> 0x007f }
            r2.a((defpackage.aucj) r1)     // Catch:{ all -> 0x007f }
            boolean r1 = r2.c     // Catch:{ all -> 0x007f }
            r4 = 0
            if (r1 == 0) goto L_0x0047
            r2.c()     // Catch:{ all -> 0x007f }
            r2.c = r4     // Catch:{ all -> 0x007f }
        L_0x0047:
            aucj r1 = r2.b     // Catch:{ all -> 0x007f }
            avnn r1 = (defpackage.avnn) r1     // Catch:{ all -> 0x007f }
            r6.getClass()     // Catch:{ all -> 0x007f }
            int r5 = r1.a     // Catch:{ all -> 0x007f }
            r5 = r5 | 2
            r1.a = r5     // Catch:{ all -> 0x007f }
            r1.c = r6     // Catch:{ all -> 0x007f }
            boolean r6 = r3.c     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            r3.c()     // Catch:{ all -> 0x007f }
            r3.c = r4     // Catch:{ all -> 0x007f }
        L_0x0060:
            aucj r6 = r3.b     // Catch:{ all -> 0x007f }
            avnq r6 = (defpackage.avnq) r6     // Catch:{ all -> 0x007f }
            aucj r1 = r2.i()     // Catch:{ all -> 0x007f }
            avnn r1 = (defpackage.avnn) r1     // Catch:{ all -> 0x007f }
            r1.getClass()     // Catch:{ all -> 0x007f }
            r6.d = r1     // Catch:{ all -> 0x007f }
            int r1 = r6.a     // Catch:{ all -> 0x007f }
            r1 = r1 | 4
            r6.a = r1     // Catch:{ all -> 0x007f }
            aucj r6 = r3.i()     // Catch:{ all -> 0x007f }
            avnq r6 = (defpackage.avnq) r6     // Catch:{ all -> 0x007f }
            monitor-exit(r0)
            return r6
        L_0x007d:
            monitor-exit(r0)
            return r1
        L_0x007f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obl.a(nze):avnq");
    }

    public static ixk a(Context context) {
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.e = "com.google.android.gms";
        return ixk.a(context, clientContext);
    }

    public static synchronized void a(avnq avnq, nze nze) {
        synchronized (obl.class) {
            nze.a((audx) avnq, "escalation_options");
        }
    }

    public static boolean a(avnm avnm) {
        return avnm.d.size() > 0;
    }
}
