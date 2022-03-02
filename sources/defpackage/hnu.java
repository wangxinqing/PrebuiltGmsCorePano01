package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnu {
    public static final fzi a = new hnt();
    private static final iwd b = hir.c("SyncManager");
    private final Context c;
    private final hnx d = new hnx();
    private final hns e;
    private final hlo f;
    private final hnn g;
    private final hkx h;
    private final Object i;
    private final hmv j;

    public hnu(Context context) {
        this.c = context;
        this.e = new hns(context);
        this.f = hlo.a();
        this.g = (hnn) hnn.a.b();
        this.h = (hkx) hkx.i.b();
        this.j = (hmv) hmv.a.b();
        this.i = new Object();
    }

    private final void a(pyv pyv, String str) {
        aosh aosh;
        pyv pyv2 = pyv;
        if (awsc.a.a().b() && !((Boolean) this.h.a(pyv2, hkx.a(str))).booleanValue()) {
            try {
                hmv hmv = this.j;
                String str2 = pyv2.b;
                try {
                    String a2 = qdc.a(hmv.b).a(awsi.b(), "GCM");
                    String b2 = awsi.b();
                    String a3 = awsi.a.a().a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 29 + String.valueOf(b2).length() + String.valueOf(a2).length());
                    sb.append(a3);
                    sb.append(b2);
                    sb.append("/rel/topics?subscriber_token=");
                    sb.append(a2);
                    String sb2 = sb.toString();
                    Account account = new Account(str2, "com.google");
                    try {
                        Context context = hmv.b;
                        String valueOf = String.valueOf(awsi.a.a().b());
                        String a4 = eig.a(context, account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("public_topic_name", str);
                            aosh f2 = aosh.f();
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-Type", "application/json");
                            hashMap.put("X-GFE-SSL", "yes");
                            String valueOf2 = String.valueOf(a4);
                            hashMap.put("Authorization", valueOf2.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf2));
                            hmu hmu = new hmu(sb2, hashMap, jSONObject, new hmr(f2), new hms(f2));
                            hmu.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 2, 1.0f));
                            Volley.newRequestQueue(hmv.b).add(hmu);
                            aosh = f2;
                        } catch (JSONException e2) {
                            aosh = aorl.a((Throwable) e2);
                        }
                    } catch (eif e3) {
                        e = e3;
                        String str3 = str;
                        aosh = aorl.a(e);
                        aosh.get();
                        this.h.a(pyv2, hkx.a(str), true);
                    } catch (IOException e4) {
                        e = e4;
                        String str32 = str;
                        aosh = aorl.a(e);
                        aosh.get();
                        this.h.a(pyv2, hkx.a(str), true);
                    }
                } catch (IOException e5) {
                    String str4 = str;
                    aosh = aorl.a((Throwable) e5);
                }
                aosh.get();
                this.h.a(pyv2, hkx.a(str), true);
            } catch (InterruptedException | ExecutionException e6) {
                throw new hjm(257, "Error in subscribing to topic.", e6);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v33, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v41, resolved type: baaj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v44, resolved type: baaj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v45, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v196, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v197, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v214, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v58, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v62, resolved type: hnw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v118, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v119, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v120, resolved type: aucd} */
    /* JADX WARNING: type inference failed for: r29v40, types: [aqon, audx] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:695:0x0ded A[Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0dee A[Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:699:0x0e00 A[Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x0e02 A[Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x0e11  */
    public final void b(defpackage.hnw r45) {
        /*
            r44 = this;
            r1 = r44
            r2 = r45
            long r3 = android.os.SystemClock.elapsedRealtime()
            anss r5 = defpackage.anss.g
            aucd r5 = r5.o()
            boolean r6 = r5.c
            r7 = 0
            if (r6 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r5.c()
            r5.c = r7
        L_0x0019:
            aucj r6 = r5.b
            anss r6 = (defpackage.anss) r6
            r8 = 1
            r6.d = r8
            int r9 = r6.a
            r10 = 2
            r9 = r9 | r10
            r6.a = r9
            r9 = r9 | r8
            r6.a = r9
            r6.b = r7
            r11 = 4
            r9 = r9 | r11
            r6.a = r9
            r6.e = r7
            r6 = -1
            pyv r9 = r2.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            int r12 = r2.b     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r13 = 301(0x12d, float:4.22E-43)
            if (r12 != r13) goto L_0x0068
            hnn r12 = r1.g     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Object r14 = r12.d     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            monitor-enter(r14)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hkx r12 = r12.b     // Catch:{ all -> 0x004c }
            hlv r15 = defpackage.hkx.c     // Catch:{ all -> 0x004c }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x004c }
            r12.a(r9, r15, r11)     // Catch:{ all -> 0x004c }
            monitor-exit(r14)     // Catch:{ all -> 0x004c }
            goto L_0x0081
        L_0x004c:
            r0 = move-exception
            r8 = r0
            monitor-exit(r14)     // Catch:{ all -> 0x004c }
            throw r8     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r26 = r3
            r3 = r0
            r4 = r2
        L_0x0055:
            r2 = r5
            goto L_0x0ecd
        L_0x0058:
            r0 = move-exception
            r26 = r3
            r3 = r0
            r4 = r2
        L_0x005d:
            r2 = r5
            goto L_0x0e57
        L_0x0060:
            r0 = move-exception
            r26 = r3
            r3 = r0
            r4 = r2
            r2 = r5
            goto L_0x0e97
        L_0x0068:
            switch(r12) {
                case 302: goto L_0x0071;
                case 303: goto L_0x006f;
                case 304: goto L_0x006d;
                default: goto L_0x006b;
            }     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
        L_0x006b:
            r11 = -1
            goto L_0x0072
        L_0x006d:
            r11 = 4
            goto L_0x0072
        L_0x006f:
            r11 = 2
            goto L_0x0072
        L_0x0071:
            r11 = 1
        L_0x0072:
            if (r11 == r6) goto L_0x0081
            hkx r12 = r1.h     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hlv r11 = defpackage.hkx.b(r11)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r12.a(r9, r11, r14)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
        L_0x0081:
            hnx r9 = r1.d     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            boolean r11 = r2.c     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r12 = 3
            if (r11 == 0) goto L_0x008a
            goto L_0x0104
        L_0x008a:
            pyv r11 = r2.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            int r14 = r2.b     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r15 = 101(0x65, float:1.42E-43)
            if (r14 != r15) goto L_0x00a5
            hkx r14 = r9.a     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hlv[] r15 = new defpackage.hlv[r12]     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hlv r16 = defpackage.hkx.f     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r15[r7] = r16     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hlv r16 = defpackage.hkx.h     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r15[r8] = r16     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            hlv r16 = defpackage.hkx.g     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r15[r10] = r16     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r14.a((defpackage.pyv) r11, (defpackage.hlv[]) r15)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
        L_0x00a5:
            hkx r14 = r9.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            hlv r15 = defpackage.hkx.f     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            java.lang.Object r11 = r14.a((defpackage.pyv) r11, (defpackage.hlv) r15)     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            long r14 = r11.longValue()     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            int r11 = r2.b     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r6 = 300(0x12c, float:4.2E-43)
            if (r11 >= r6) goto L_0x00ba
            goto L_0x00f1
        L_0x00ba:
            r6 = 400(0x190, float:5.6E-43)
            if (r11 >= r6) goto L_0x00f1
            if (r11 == r13) goto L_0x00f1
            r6 = 305(0x131, float:4.27E-43)
            if (r11 == r6) goto L_0x00f1
            r6 = 304(0x130, float:4.26E-43)
            if (r11 == r6) goto L_0x00f1
            java.lang.String r6 = r2.d     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            boolean r6 = defpackage.amrk.a((java.lang.String) r6)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            if (r6 == 0) goto L_0x00f1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            agvx r6 = defpackage.his.k     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Object r6 = r6.c()     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            long r17 = r6.longValue()     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            long r11 = r11 + r17
            long r11 = java.lang.Math.max(r14, r11)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r9.a((long) r11, (defpackage.hnw) r2)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r26 = r3
            r6 = 1
            r13 = 0
            r4 = r2
            r2 = r5
            goto L_0x0de9
        L_0x00f1:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x0104
            r9.a((long) r14, (defpackage.hnw) r2)     // Catch:{ hjm -> 0x0060, hmw -> 0x0058, all -> 0x0050 }
            r26 = r3
            r6 = 1
            r13 = 0
            r4 = r2
            r2 = r5
            goto L_0x0de9
        L_0x0104:
            pyv r6 = r2.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            java.lang.String r9 = "NIGORI"
            r1.a(r6, r9)     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            iwd r6 = b     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            java.lang.String r9 = "Pre-syncing metadata..."
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r6.a(r9, r11)     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            hnn r6 = r1.g     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            pyv r9 = r2.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r6.b(r9)     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            boolean r6 = r5.c     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            if (r6 != 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r5.c()     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r5.c = r7     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
        L_0x0125:
            aucj r6 = r5.b     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            anss r6 = (defpackage.anss) r6     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            int r9 = r6.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r9 = r9 | r8
            r6.a = r9     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r6.b = r8     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            anax r6 = defpackage.hln.a     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            anhj r6 = r6.iterator()     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            r11 = 0
            r13 = 0
        L_0x0138:
            boolean r14 = r6.hasNext()     // Catch:{ hjm -> 0x0e91, hmw -> 0x0e51, all -> 0x0e49 }
            if (r14 == 0) goto L_0x0dbf
            java.lang.Object r14 = r6.next()     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            int r14 = r14.intValue()     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            ansq r15 = defpackage.ansq.f     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            aucd r15 = r15.o()     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            boolean r9 = r15.c     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            if (r9 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            r15.c()     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            r15.c = r7     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
        L_0x0158:
            aucj r9 = r15.b     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            ansq r9 = (defpackage.ansq) r9     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            int r12 = r9.a     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            r12 = r12 | r8
            r9.a = r12     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            r9.b = r14     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hjm -> 0x0db5, hmw -> 0x0dab, all -> 0x0da1 }
            hns r9 = r1.e     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            pyv r12 = r2.a     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            boolean r8 = r2.c     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            if (r8 == 0) goto L_0x019a
            hkx r8 = r9.e     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            hlv r7 = defpackage.hkx.a((int) r14)     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Object r7 = r8.a((defpackage.pyv) r12, (defpackage.hlv) r7)     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            boolean r7 = r7.booleanValue()     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            if (r7 != 0) goto L_0x0182
            goto L_0x019a
        L_0x0182:
            r26 = r3
            r29 = r5
            r25 = r6
            r35 = r11
            r36 = r13
            goto L_0x0cb1
        L_0x018e:
            r0 = move-exception
            r1 = r0
            r26 = r3
            r29 = r5
            r25 = r6
            r36 = r13
            goto L_0x0d04
        L_0x019a:
            hkx r7 = r9.e     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            hlv r8 = defpackage.hkx.d(r14)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            java.lang.Object r7 = r7.a((defpackage.pyv) r12, (defpackage.hlv) r8)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            boolean r7 = r7.isEmpty()     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            if (r7 != 0) goto L_0x0ca7
            hkx r7 = r9.e     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            hlv r8 = defpackage.hkx.b(r14)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            java.lang.Object r7 = r7.a((defpackage.pyv) r12, (defpackage.hlv) r8)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            boolean r7 = r7.booleanValue()     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            if (r7 != 0) goto L_0x01e2
            hls r7 = r9.f     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            hle r7 = r7.g     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            android.database.sqlite.SQLiteDatabase r7 = r7.a()     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.String r8 = defpackage.hls.d     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.String r12 = r12.d     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            r22 = 0
            r9[r22] = r12     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            r21 = 1
            r9[r21] = r12     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            long r7 = android.database.DatabaseUtils.longForQuery(r7, r8, r9)     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            r23 = 0
            int r9 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r9 == 0) goto L_0x0182
        L_0x01e2:
            pyv r7 = r2.a     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            r8 = 1
            if (r14 == r8) goto L_0x01fa
            if (r14 == r10) goto L_0x01f7
            r8 = 4
            if (r14 != r8) goto L_0x01ef
            java.lang.String r8 = "AUTOFILL_WALLET"
            goto L_0x01fc
        L_0x01ef:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            java.lang.String r8 = "Unrecognized data type."
            r7.<init>(r8)     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
            throw r7     // Catch:{ hjm -> 0x018e, hmw -> 0x0058, all -> 0x0050 }
        L_0x01f7:
            java.lang.String r8 = "PASSWORD"
            goto L_0x01fc
        L_0x01fa:
            java.lang.String r8 = "PREFERENCE"
        L_0x01fc:
            r1.a(r7, r8)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            java.lang.Object r7 = r1.i     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            monitor-enter(r7)     // Catch:{ hjm -> 0x0cfa, hmw -> 0x0cf0, all -> 0x0ce6 }
            hns r8 = r1.e     // Catch:{ all -> 0x0c96 }
            pyv r9 = r2.a     // Catch:{ all -> 0x0c96 }
            hnn r12 = r8.c     // Catch:{ all -> 0x0c96 }
            amri r12 = r12.b(r9)     // Catch:{ all -> 0x0c96 }
            boolean r23 = r12.a()     // Catch:{ all -> 0x0c96 }
            if (r23 != 0) goto L_0x022d
            r8.a(r9, r14)     // Catch:{ all -> 0x0221 }
            r26 = r3
            r25 = r6
            r35 = r11
            r36 = r13
            r1 = 0
            r11 = 3
            goto L_0x06e5
        L_0x0221:
            r0 = move-exception
            r1 = r0
            r26 = r3
            r29 = r5
            r25 = r6
        L_0x0229:
            r36 = r13
            goto L_0x0ca0
        L_0x022d:
            r10 = 2
            if (r14 != r10) goto L_0x0367
            hmx r10 = r8.g     // Catch:{ all -> 0x035d }
            java.lang.Object r12 = r12.b()     // Catch:{ all -> 0x035d }
            aqpb r12 = (defpackage.aqpb) r12     // Catch:{ all -> 0x035d }
            java.lang.String r12 = r12.a     // Catch:{ all -> 0x035d }
            r25 = r6
            java.lang.String r6 = r2.d     // Catch:{ all -> 0x0359 }
            defpackage.iva.a((java.lang.Object) r9)     // Catch:{ all -> 0x0359 }
            defpackage.iva.c(r12)     // Catch:{ all -> 0x0359 }
            r26 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0357 }
            r3.<init>()     // Catch:{ all -> 0x0357 }
            com.google.android.gms.common.internal.ClientContext r4 = r10.a((defpackage.pyv) r9)     // Catch:{ all -> 0x0357 }
            r28 = 0
        L_0x0251:
            aqox r29 = defpackage.aqox.d     // Catch:{ all -> 0x0357 }
            aucd r1 = r29.o()     // Catch:{ all -> 0x0357 }
            r35 = r11
            boolean r11 = r1.c     // Catch:{ all -> 0x0357 }
            if (r11 != 0) goto L_0x025e
            goto L_0x0264
        L_0x025e:
            r1.c()     // Catch:{ all -> 0x0357 }
            r11 = 0
            r1.c = r11     // Catch:{ all -> 0x0357 }
        L_0x0264:
            aucj r11 = r1.b     // Catch:{ all -> 0x0357 }
            aqox r11 = (defpackage.aqox) r11     // Catch:{ all -> 0x0357 }
            r12.getClass()     // Catch:{ all -> 0x0357 }
            r11.a = r12     // Catch:{ all -> 0x0357 }
            boolean r11 = defpackage.amrk.a((java.lang.String) r6)     // Catch:{ all -> 0x0357 }
            if (r11 != 0) goto L_0x029d
            boolean r11 = r1.c     // Catch:{ all -> 0x0357 }
            if (r11 != 0) goto L_0x0278
            goto L_0x027e
        L_0x0278:
            r1.c()     // Catch:{ all -> 0x0357 }
            r11 = 0
            r1.c = r11     // Catch:{ all -> 0x0357 }
        L_0x027e:
            aucj r11 = r1.b     // Catch:{ all -> 0x0357 }
            aqox r11 = (defpackage.aqox) r11     // Catch:{ all -> 0x0357 }
            r6.getClass()     // Catch:{ all -> 0x0357 }
            r36 = r12
            aucx r12 = r11.c     // Catch:{ all -> 0x0357 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x0357 }
            if (r12 != 0) goto L_0x0297
            aucx r12 = r11.c     // Catch:{ all -> 0x0357 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x0357 }
            r11.c = r12     // Catch:{ all -> 0x0357 }
        L_0x0297:
            aucx r11 = r11.c     // Catch:{ all -> 0x0357 }
            r11.add(r6)     // Catch:{ all -> 0x0357 }
            goto L_0x029f
        L_0x029d:
            r36 = r12
        L_0x029f:
            if (r28 != 0) goto L_0x02a2
            goto L_0x02ba
        L_0x02a2:
            auay r11 = defpackage.auay.a((byte[]) r28)     // Catch:{ all -> 0x0357 }
            boolean r12 = r1.c     // Catch:{ all -> 0x0357 }
            if (r12 != 0) goto L_0x02ab
            goto L_0x02b1
        L_0x02ab:
            r1.c()     // Catch:{ all -> 0x0357 }
            r12 = 0
            r1.c = r12     // Catch:{ all -> 0x0357 }
        L_0x02b1:
            aucj r12 = r1.b     // Catch:{ all -> 0x0357 }
            aqox r12 = (defpackage.aqox) r12     // Catch:{ all -> 0x0357 }
            r11.getClass()     // Catch:{ all -> 0x0357 }
            r12.b = r11     // Catch:{ all -> 0x0357 }
        L_0x02ba:
            hjo r11 = r10.a     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            aucj r1 = r1.i()     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            r31 = r1
            aqox r31 = (defpackage.aqox) r31     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            baaj r1 = defpackage.hjo.b     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            if (r1 == 0) goto L_0x02cd
            r37 = r6
            r38 = r10
            goto L_0x02e7
        L_0x02cd:
            baai r1 = defpackage.baai.UNARY     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            java.lang.String r12 = "google.internal.chrome.sync.passwords.v1.Passwords/ListPasswords"
            aqox r28 = defpackage.aqox.d     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            r37 = r6
            baah r6 = defpackage.baoq.a(r28)     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            aqoy r28 = defpackage.aqoy.c     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            r38 = r10
            baah r10 = defpackage.baoq.a(r28)     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            baaj r1 = defpackage.baaj.a(r1, r12, r6, r10)     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            defpackage.hjo.b = r1     // Catch:{ babk -> 0x033b, eif -> 0x032f }
        L_0x02e7:
            izd r1 = r11.a     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            baaj r29 = defpackage.hjo.b     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            r32 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r34 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            r28 = r1
            r30 = r4
            java.lang.Object r1 = r28.a(r29, r30, r31, r32, r34)     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            aqoy r1 = (defpackage.aqoy) r1     // Catch:{ babk -> 0x033b, eif -> 0x032f }
            aucx r6 = r1.a     // Catch:{ all -> 0x0357 }
            r10 = 0
            aqpe[] r11 = new defpackage.aqpe[r10]     // Catch:{ all -> 0x0357 }
            java.lang.Object[] r6 = r6.toArray(r11)     // Catch:{ all -> 0x0357 }
            aqpe[] r6 = (defpackage.aqpe[]) r6     // Catch:{ all -> 0x0357 }
            java.util.Collections.addAll(r3, r6)     // Catch:{ all -> 0x0357 }
            auay r6 = r1.b     // Catch:{ all -> 0x0357 }
            boolean r6 = r6.j()     // Catch:{ all -> 0x0357 }
            if (r6 != 0) goto L_0x0321
            auay r1 = r1.b     // Catch:{ all -> 0x0357 }
            byte[] r28 = r1.k()     // Catch:{ all -> 0x0357 }
            r1 = r44
            r11 = r35
            r12 = r36
            r6 = r37
            r10 = r38
            goto L_0x0251
        L_0x0321:
            amqy r1 = defpackage.hnp.a     // Catch:{ all -> 0x0357 }
            java.lang.Iterable r1 = defpackage.anbs.a((java.lang.Iterable) r3, (defpackage.amqy) r1)     // Catch:{ all -> 0x0357 }
            amzy r1 = defpackage.amzy.a((java.lang.Iterable) r1)     // Catch:{ all -> 0x0357 }
            r36 = r13
            goto L_0x05cf
        L_0x032f:
            r0 = move-exception
            r1 = r0
            hjm r3 = new hjm     // Catch:{ all -> 0x0357 }
            int r4 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0357 }
            r3.<init>((int) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0357 }
            throw r3     // Catch:{ all -> 0x0357 }
        L_0x033b:
            r0 = move-exception
            r1 = r0
            babg r3 = defpackage.hmy.a(r1)     // Catch:{ all -> 0x0357 }
            babg r4 = defpackage.babg.NOT_FOUND     // Catch:{ all -> 0x0357 }
            if (r3 == r4) goto L_0x0351
            hjm r3 = new hjm     // Catch:{ all -> 0x0357 }
            java.lang.String r4 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0357 }
            r6 = 257(0x101, float:3.6E-43)
            r3.<init>(r6, r4, r1)     // Catch:{ all -> 0x0357 }
            throw r3     // Catch:{ all -> 0x0357 }
        L_0x0351:
            hmw r1 = new hmw     // Catch:{ all -> 0x0357 }
            r1.<init>()     // Catch:{ all -> 0x0357 }
            throw r1     // Catch:{ all -> 0x0357 }
        L_0x0357:
            r0 = move-exception
            goto L_0x0362
        L_0x0359:
            r0 = move-exception
            r26 = r3
            goto L_0x0362
        L_0x035d:
            r0 = move-exception
            r26 = r3
            r25 = r6
        L_0x0362:
            r1 = r0
            r29 = r5
            goto L_0x0229
        L_0x0367:
            r26 = r3
            r25 = r6
            r35 = r11
            r1 = 1
            if (r14 != r1) goto L_0x0487
            hmx r1 = r8.g     // Catch:{ all -> 0x047f }
            java.lang.Object r3 = r12.b()     // Catch:{ all -> 0x047f }
            aqpb r3 = (defpackage.aqpb) r3     // Catch:{ all -> 0x047f }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x047f }
            java.lang.String r4 = r2.d     // Catch:{ all -> 0x047f }
            defpackage.iva.a((java.lang.Object) r9)     // Catch:{ all -> 0x047f }
            defpackage.iva.c(r3)     // Catch:{ all -> 0x047f }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x047f }
            r6.<init>()     // Catch:{ all -> 0x047f }
            com.google.android.gms.common.internal.ClientContext r10 = r1.a((defpackage.pyv) r9)     // Catch:{ all -> 0x047f }
            r11 = 0
        L_0x038c:
            aqoz r12 = defpackage.aqoz.d     // Catch:{ all -> 0x047f }
            aucd r12 = r12.o()     // Catch:{ all -> 0x047f }
            r36 = r13
            boolean r13 = r12.c     // Catch:{ all -> 0x05c7 }
            if (r13 != 0) goto L_0x0399
            goto L_0x039f
        L_0x0399:
            r12.c()     // Catch:{ all -> 0x05c7 }
            r13 = 0
            r12.c = r13     // Catch:{ all -> 0x05c7 }
        L_0x039f:
            aucj r13 = r12.b     // Catch:{ all -> 0x05c7 }
            aqoz r13 = (defpackage.aqoz) r13     // Catch:{ all -> 0x05c7 }
            r3.getClass()     // Catch:{ all -> 0x05c7 }
            r13.a = r3     // Catch:{ all -> 0x05c7 }
            boolean r13 = defpackage.amrk.a((java.lang.String) r4)     // Catch:{ all -> 0x05c7 }
            if (r13 != 0) goto L_0x03d8
            boolean r13 = r12.c     // Catch:{ all -> 0x05c7 }
            if (r13 != 0) goto L_0x03b3
            goto L_0x03b9
        L_0x03b3:
            r12.c()     // Catch:{ all -> 0x05c7 }
            r13 = 0
            r12.c = r13     // Catch:{ all -> 0x05c7 }
        L_0x03b9:
            aucj r13 = r12.b     // Catch:{ all -> 0x05c7 }
            aqoz r13 = (defpackage.aqoz) r13     // Catch:{ all -> 0x05c7 }
            r4.getClass()     // Catch:{ all -> 0x05c7 }
            r37 = r3
            aucx r3 = r13.c     // Catch:{ all -> 0x05c7 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x05c7 }
            if (r3 != 0) goto L_0x03d2
            aucx r3 = r13.c     // Catch:{ all -> 0x05c7 }
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)     // Catch:{ all -> 0x05c7 }
            r13.c = r3     // Catch:{ all -> 0x05c7 }
        L_0x03d2:
            aucx r3 = r13.c     // Catch:{ all -> 0x05c7 }
            r3.add(r4)     // Catch:{ all -> 0x05c7 }
            goto L_0x03da
        L_0x03d8:
            r37 = r3
        L_0x03da:
            if (r11 != 0) goto L_0x03dd
            goto L_0x03f5
        L_0x03dd:
            auay r3 = defpackage.auay.a((byte[]) r11)     // Catch:{ all -> 0x05c7 }
            boolean r11 = r12.c     // Catch:{ all -> 0x05c7 }
            if (r11 != 0) goto L_0x03e6
            goto L_0x03ec
        L_0x03e6:
            r12.c()     // Catch:{ all -> 0x05c7 }
            r11 = 0
            r12.c = r11     // Catch:{ all -> 0x05c7 }
        L_0x03ec:
            aucj r11 = r12.b     // Catch:{ all -> 0x05c7 }
            aqoz r11 = (defpackage.aqoz) r11     // Catch:{ all -> 0x05c7 }
            r3.getClass()     // Catch:{ all -> 0x05c7 }
            r11.b = r3     // Catch:{ all -> 0x05c7 }
        L_0x03f5:
            hjo r3 = r1.a     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            aucj r11 = r12.i()     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            r31 = r11
            aqoz r31 = (defpackage.aqoz) r31     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            baaj r11 = defpackage.hjo.f     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            if (r11 == 0) goto L_0x0406
            r38 = r1
            goto L_0x041e
        L_0x0406:
            baai r11 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            java.lang.String r12 = "google.internal.chrome.sync.passwords.v1.Passwords/ListPriorityPreferences"
            aqoz r13 = defpackage.aqoz.d     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            baah r13 = defpackage.baoq.a(r13)     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            aqpa r28 = defpackage.aqpa.c     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            r38 = r1
            baah r1 = defpackage.baoq.a(r28)     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            baaj r1 = defpackage.baaj.a(r11, r12, r13, r1)     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            defpackage.hjo.f = r1     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
        L_0x041e:
            izd r1 = r3.a     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            baaj r29 = defpackage.hjo.f     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            r32 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r34 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            r28 = r1
            r30 = r10
            java.lang.Object r1 = r28.a(r29, r30, r31, r32, r34)     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            aqpa r1 = (defpackage.aqpa) r1     // Catch:{ babk -> 0x0463, eif -> 0x0457 }
            aucx r3 = r1.a     // Catch:{ all -> 0x05c7 }
            r6.addAll(r3)     // Catch:{ all -> 0x05c7 }
            auay r3 = r1.b     // Catch:{ all -> 0x05c7 }
            boolean r3 = r3.j()     // Catch:{ all -> 0x05c7 }
            if (r3 != 0) goto L_0x044b
            auay r1 = r1.b     // Catch:{ all -> 0x05c7 }
            byte[] r11 = r1.k()     // Catch:{ all -> 0x05c7 }
            r13 = r36
            r3 = r37
            r1 = r38
            goto L_0x038c
        L_0x044b:
            amqy r1 = defpackage.hnq.a     // Catch:{ all -> 0x05c7 }
            java.lang.Iterable r1 = defpackage.anbs.a((java.lang.Iterable) r6, (defpackage.amqy) r1)     // Catch:{ all -> 0x05c7 }
            amzy r1 = defpackage.amzy.a((java.lang.Iterable) r1)     // Catch:{ all -> 0x05c7 }
            goto L_0x05cf
        L_0x0457:
            r0 = move-exception
            r1 = r0
            hjm r3 = new hjm     // Catch:{ all -> 0x05c7 }
            int r4 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x05c7 }
            r3.<init>((int) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x05c7 }
            throw r3     // Catch:{ all -> 0x05c7 }
        L_0x0463:
            r0 = move-exception
            r1 = r0
            babg r3 = defpackage.hmy.a(r1)     // Catch:{ all -> 0x05c7 }
            babg r4 = defpackage.babg.NOT_FOUND     // Catch:{ all -> 0x05c7 }
            if (r3 == r4) goto L_0x0479
            hjm r3 = new hjm     // Catch:{ all -> 0x05c7 }
            java.lang.String r4 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x05c7 }
            r6 = 257(0x101, float:3.6E-43)
            r3.<init>(r6, r4, r1)     // Catch:{ all -> 0x05c7 }
            throw r3     // Catch:{ all -> 0x05c7 }
        L_0x0479:
            hmw r1 = new hmw     // Catch:{ all -> 0x05c7 }
            r1.<init>()     // Catch:{ all -> 0x05c7 }
            throw r1     // Catch:{ all -> 0x05c7 }
        L_0x047f:
            r0 = move-exception
            r36 = r13
        L_0x0482:
            r1 = r0
            r29 = r5
            goto L_0x0ca0
        L_0x0487:
            r36 = r13
            r1 = 4
            if (r14 != r1) goto L_0x05ca
            hmz r1 = r8.h     // Catch:{ all -> 0x05c7 }
            java.lang.Object r3 = r12.b()     // Catch:{ all -> 0x05c7 }
            aqpb r3 = (defpackage.aqpb) r3     // Catch:{ all -> 0x05c7 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x05c7 }
            java.lang.String r4 = r2.d     // Catch:{ all -> 0x05c7 }
            defpackage.iva.a((java.lang.Object) r9)     // Catch:{ all -> 0x05c7 }
            defpackage.iva.c(r3)     // Catch:{ all -> 0x05c7 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05c7 }
            r6.<init>()     // Catch:{ all -> 0x05c7 }
            android.accounts.Account r31 = r9.a()     // Catch:{ all -> 0x05c7 }
            com.google.android.gms.common.internal.ClientContext r10 = new com.google.android.gms.common.internal.ClientContext     // Catch:{ all -> 0x05c7 }
            android.content.Context r11 = r1.a     // Catch:{ all -> 0x05c7 }
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()     // Catch:{ all -> 0x05c7 }
            int r11 = r11.uid     // Catch:{ all -> 0x05c7 }
            android.content.Context r12 = r1.a     // Catch:{ all -> 0x05c7 }
            java.lang.String r33 = r12.getPackageName()     // Catch:{ all -> 0x05c7 }
            r28 = r10
            r29 = r11
            r30 = r31
            r32 = r33
            r28.<init>((int) r29, (android.accounts.Account) r30, (android.accounts.Account) r31, (java.lang.String) r32, (java.lang.String) r33)     // Catch:{ all -> 0x05c7 }
            agvx r11 = defpackage.his.g     // Catch:{ all -> 0x05c7 }
            java.lang.Object r11 = r11.c()     // Catch:{ all -> 0x05c7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x05c7 }
            r10.d(r11)     // Catch:{ all -> 0x05c7 }
            r11 = 0
        L_0x04ce:
            aqom r12 = defpackage.aqom.e     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aucd r12 = r12.o()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            boolean r13 = r12.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r13 != 0) goto L_0x04d9
            goto L_0x04df
        L_0x04d9:
            r12.c()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r13 = 0
            r12.c = r13     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x04df:
            aucj r13 = r12.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aqom r13 = (defpackage.aqom) r13     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r3.getClass()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r13.a = r3     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r28 = r3
            r3 = 306270(0x4ac5e, float:4.29176E-40)
            r13.d = r3     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            boolean r3 = defpackage.amrk.a((java.lang.String) r4)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r3 != 0) goto L_0x051c
            boolean r3 = r12.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r3 != 0) goto L_0x04fa
            goto L_0x0500
        L_0x04fa:
            r12.c()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r3 = 0
            r12.c = r3     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x0500:
            aucj r3 = r12.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aqom r3 = (defpackage.aqom) r3     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r4.getClass()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aucx r13 = r3.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            boolean r13 = r13.a()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r13 != 0) goto L_0x0517
            aucx r13 = r3.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r3.c = r13     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x0517:
            aucx r3 = r3.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r3.add(r4)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x051c:
            if (r11 != 0) goto L_0x051f
            goto L_0x0537
        L_0x051f:
            auay r3 = defpackage.auay.a((byte[]) r11)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            boolean r11 = r12.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r11 != 0) goto L_0x0528
            goto L_0x052e
        L_0x0528:
            r12.c()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r11 = 0
            r12.c = r11     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x052e:
            aucj r11 = r12.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aqom r11 = (defpackage.aqom) r11     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r3.getClass()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r11.b = r3     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x0537:
            hjp r3 = r1.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aucj r11 = r12.i()     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r40 = r11
            aqom r40 = (defpackage.aqom) r40     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            baaj r11 = defpackage.hjp.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            if (r11 == 0) goto L_0x0548
            r30 = r1
            goto L_0x0560
        L_0x0548:
            baai r11 = defpackage.baai.UNARY     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            java.lang.String r12 = "google.internal.chrome.sync.entities.v1.SyncEntities/ListEntities"
            aqom r13 = defpackage.aqom.e     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            baah r13 = defpackage.baoq.a(r13)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aqon r29 = defpackage.aqon.c     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r30 = r1
            baah r1 = defpackage.baoq.a(r29)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            baaj r1 = defpackage.baaj.a(r11, r12, r13, r1)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            defpackage.hjp.b = r1     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
        L_0x0560:
            izd r1 = r3.a     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            baaj r38 = defpackage.hjp.b     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            r37 = r1
            r39 = r10
            java.lang.Object r1 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aqon r1 = (defpackage.aqon) r1     // Catch:{ babk -> 0x05ab, eif -> 0x059f }
            aucx r3 = r1.a     // Catch:{ all -> 0x05c7 }
            r11 = 0
            aqol[] r12 = new defpackage.aqol[r11]     // Catch:{ all -> 0x05c7 }
            java.lang.Object[] r3 = r3.toArray(r12)     // Catch:{ all -> 0x05c7 }
            aqol[] r3 = (defpackage.aqol[]) r3     // Catch:{ all -> 0x05c7 }
            java.util.Collections.addAll(r6, r3)     // Catch:{ all -> 0x05c7 }
            auay r3 = r1.b     // Catch:{ all -> 0x05c7 }
            boolean r3 = r3.j()     // Catch:{ all -> 0x05c7 }
            if (r3 != 0) goto L_0x0594
            auay r1 = r1.b     // Catch:{ all -> 0x05c7 }
            byte[] r11 = r1.k()     // Catch:{ all -> 0x05c7 }
            r3 = r28
            r1 = r30
            goto L_0x04ce
        L_0x0594:
            amqy r1 = defpackage.hnr.a     // Catch:{ all -> 0x05c7 }
            java.lang.Iterable r1 = defpackage.anbs.a((java.lang.Iterable) r6, (defpackage.amqy) r1)     // Catch:{ all -> 0x05c7 }
            amzy r1 = defpackage.amzy.a((java.lang.Iterable) r1)     // Catch:{ all -> 0x05c7 }
            goto L_0x05cf
        L_0x059f:
            r0 = move-exception
            r1 = r0
            hjm r3 = new hjm     // Catch:{ all -> 0x05c7 }
            int r4 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x05c7 }
            r3.<init>((int) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x05c7 }
            throw r3     // Catch:{ all -> 0x05c7 }
        L_0x05ab:
            r0 = move-exception
            r1 = r0
            babg r3 = defpackage.hmy.a(r1)     // Catch:{ all -> 0x05c7 }
            babg r4 = defpackage.babg.NOT_FOUND     // Catch:{ all -> 0x05c7 }
            if (r3 == r4) goto L_0x05c1
            hjm r3 = new hjm     // Catch:{ all -> 0x05c7 }
            java.lang.String r4 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x05c7 }
            r6 = 257(0x101, float:3.6E-43)
            r3.<init>(r6, r4, r1)     // Catch:{ all -> 0x05c7 }
            throw r3     // Catch:{ all -> 0x05c7 }
        L_0x05c1:
            hmw r1 = new hmw     // Catch:{ all -> 0x05c7 }
            r1.<init>()     // Catch:{ all -> 0x05c7 }
            throw r1     // Catch:{ all -> 0x05c7 }
        L_0x05c7:
            r0 = move-exception
            goto L_0x0482
        L_0x05ca:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0c8a }
            r1.<init>()     // Catch:{ all -> 0x0c8a }
        L_0x05cf:
            iwd r3 = defpackage.hns.a     // Catch:{ all -> 0x0c8a }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0c8a }
            int r4 = r1.size()     // Catch:{ all -> 0x0c8a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0c8a }
            r10 = 0
            r6[r10] = r4     // Catch:{ all -> 0x0c8a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0c8a }
            r10 = 1
            r6[r10] = r4     // Catch:{ all -> 0x0c8a }
            java.lang.String r4 = "Received %d entries of type %d."
            r3.a(r4, r6)     // Catch:{ all -> 0x0c8a }
            hls r3 = r8.f     // Catch:{ all -> 0x0c8a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0c8a }
            r4.<init>()     // Catch:{ all -> 0x0c8a }
            java.util.List r6 = r3.a((defpackage.pyv) r9, (int) r14)     // Catch:{ all -> 0x0c8a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0c8a }
        L_0x05fa:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0c8a }
            if (r10 == 0) goto L_0x060c
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x05c7 }
            hln r10 = (defpackage.hln) r10     // Catch:{ all -> 0x05c7 }
            java.lang.String r11 = r10.c     // Catch:{ all -> 0x05c7 }
            r4.put(r11, r10)     // Catch:{ all -> 0x05c7 }
            goto L_0x05fa
        L_0x060c:
            hle r3 = r3.g     // Catch:{ all -> 0x0c8a }
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch:{ all -> 0x0c8a }
            r3.beginTransaction()     // Catch:{ all -> 0x0c8a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0c8e }
        L_0x0619:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0c8e }
            if (r6 == 0) goto L_0x0671
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x066b }
            hln r6 = (defpackage.hln) r6     // Catch:{ all -> 0x066b }
            java.lang.String r10 = r6.c     // Catch:{ all -> 0x066b }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x066b }
            hln r10 = (defpackage.hln) r10     // Catch:{ all -> 0x066b }
            if (r10 == 0) goto L_0x065c
            java.lang.String r11 = "sync_entities"
            boolean r12 = r10.f     // Catch:{ all -> 0x066b }
            if (r12 == 0) goto L_0x0652
            auay r12 = r10.e     // Catch:{ all -> 0x066b }
            auay r13 = r6.e     // Catch:{ all -> 0x066b }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x066b }
            if (r12 != 0) goto L_0x0654
            boolean r10 = r10.g     // Catch:{ all -> 0x066b }
            if (r10 == 0) goto L_0x0652
            hlm r10 = new hlm     // Catch:{ all -> 0x066b }
            r10.<init>(r6)     // Catch:{ all -> 0x066b }
            r12 = 1
            r10.e = r12     // Catch:{ all -> 0x066b }
            r10.d = r12     // Catch:{ all -> 0x066b }
            hln r10 = r10.a()     // Catch:{ all -> 0x066b }
            goto L_0x0654
        L_0x0652:
            r10 = r6
        L_0x0654:
            android.content.ContentValues r10 = defpackage.hls.a((defpackage.pyv) r9, (defpackage.hln) r10)     // Catch:{ all -> 0x066b }
            defpackage.hll.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r11, (android.content.ContentValues) r10)     // Catch:{ all -> 0x066b }
            goto L_0x0665
        L_0x065c:
            java.lang.String r10 = "sync_entities"
            android.content.ContentValues r11 = defpackage.hls.a((defpackage.pyv) r9, (defpackage.hln) r6)     // Catch:{ all -> 0x066b }
            defpackage.hll.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r10, (android.content.ContentValues) r11)     // Catch:{ all -> 0x066b }
        L_0x0665:
            java.lang.String r6 = r6.c     // Catch:{ all -> 0x066b }
            r4.remove(r6)     // Catch:{ all -> 0x066b }
            goto L_0x0619
        L_0x066b:
            r0 = move-exception
            r1 = r0
            r29 = r5
            goto L_0x0c92
        L_0x0671:
            java.util.Collection r1 = r4.values()     // Catch:{ all -> 0x0c8e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0c8e }
        L_0x0679:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0c8e }
            if (r4 == 0) goto L_0x06da
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x066b }
            hln r4 = (defpackage.hln) r4     // Catch:{ all -> 0x066b }
            boolean r6 = r4.f     // Catch:{ all -> 0x066b }
            if (r6 == 0) goto L_0x06a7
            boolean r6 = r4.g     // Catch:{ all -> 0x066b }
            if (r6 != 0) goto L_0x06a7
            hlm r6 = new hlm     // Catch:{ all -> 0x066b }
            r6.<init>(r4)     // Catch:{ all -> 0x066b }
            r4 = 1
            r6.d = r4     // Catch:{ all -> 0x066b }
            auay r4 = defpackage.auay.b     // Catch:{ all -> 0x066b }
            r6.c = r4     // Catch:{ all -> 0x066b }
            java.lang.String r4 = "sync_entities"
            hln r6 = r6.a()     // Catch:{ all -> 0x066b }
            android.content.ContentValues r6 = defpackage.hls.a((defpackage.pyv) r9, (defpackage.hln) r6)     // Catch:{ all -> 0x066b }
            defpackage.hll.a((android.database.sqlite.SQLiteDatabase) r3, (java.lang.String) r4, (android.content.ContentValues) r6)     // Catch:{ all -> 0x066b }
            goto L_0x0679
        L_0x06a7:
            java.lang.String r6 = "sync_entities"
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x066b }
            java.lang.String r10 = "account"
            r12 = 0
            r11[r12] = r10     // Catch:{ all -> 0x066b }
            java.lang.String r10 = "id"
            r12 = 1
            r11[r12] = r10     // Catch:{ all -> 0x066b }
            java.lang.String r10 = "type"
            r12 = 2
            r11[r12] = r10     // Catch:{ all -> 0x066b }
            java.lang.String r10 = "%s=? AND %s=? AND %s=?"
            java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch:{ all -> 0x066b }
            r11 = 3
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ all -> 0x066b }
            java.lang.String r13 = r9.d     // Catch:{ all -> 0x066b }
            r18 = 0
            r12[r18] = r13     // Catch:{ all -> 0x066b }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x066b }
            r13 = 1
            r12[r13] = r4     // Catch:{ all -> 0x066b }
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x066b }
            r13 = 2
            r12[r13] = r4     // Catch:{ all -> 0x066b }
            r3.delete(r6, r10, r12)     // Catch:{ all -> 0x066b }
            goto L_0x0679
        L_0x06da:
            r11 = 3
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0c8e }
            r3.endTransaction()     // Catch:{ all -> 0x0c8a }
            r8.a(r9, r14)     // Catch:{ all -> 0x0c8a }
            r1 = 1
        L_0x06e5:
            pyv r3 = r2.a     // Catch:{ all -> 0x0c8a }
            hls r4 = r8.f     // Catch:{ all -> 0x0c8a }
            java.lang.String r6 = defpackage.hls.c     // Catch:{ all -> 0x0c8a }
            java.util.List r4 = r4.a((defpackage.pyv) r3, (int) r14, (java.lang.String) r6)     // Catch:{ all -> 0x0c8a }
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0c8a }
            if (r6 != 0) goto L_0x0c4a
            hnn r6 = r8.c     // Catch:{ all -> 0x0c8a }
            aqpb r6 = r6.c(r3)     // Catch:{ all -> 0x0c8a }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0c8a }
            r10.<init>()     // Catch:{ all -> 0x0c8a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0c8a }
        L_0x0704:
            boolean r12 = r4.hasNext()     // Catch:{ all -> 0x0c8a }
            if (r12 == 0) goto L_0x0b41
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x0c8a }
            hln r12 = (defpackage.hln) r12     // Catch:{ all -> 0x0c8a }
            r13 = 2
            if (r14 != r13) goto L_0x0973
            auay r13 = r12.d     // Catch:{ auda -> 0x095b }
            aubs r11 = defpackage.aubs.c()     // Catch:{ auda -> 0x095b }
            r28 = r4
            aqpe r4 = defpackage.aqpe.f     // Catch:{ auda -> 0x0959 }
            aubc r13 = r13.h()     // Catch:{ auda -> 0x0952 }
            r2 = 4
            java.lang.Object r4 = r4.c(r2)     // Catch:{ auda -> 0x0952 }
            aucj r4 = (defpackage.aucj) r4     // Catch:{ auda -> 0x0952 }
            aueh r2 = defpackage.aueh.a     // Catch:{ IOException -> 0x0933, RuntimeException -> 0x091f }
            aueq r2 = r2.a((java.lang.Object) r4)     // Catch:{ IOException -> 0x0933, RuntimeException -> 0x091f }
            r29 = r5
            aubd r5 = defpackage.aubd.a((defpackage.aubc) r13)     // Catch:{ IOException -> 0x091d, RuntimeException -> 0x091b }
            r2.a(r4, r5, r11)     // Catch:{ IOException -> 0x091d, RuntimeException -> 0x091b }
            r2.d(r4)     // Catch:{ IOException -> 0x091d, RuntimeException -> 0x091b }
            r2 = 0
            r13.a((int) r2)     // Catch:{ auda -> 0x0918 }
            defpackage.aucj.b((defpackage.aucj) r4)     // Catch:{ auda -> 0x0957 }
            aqpe r4 = (defpackage.aqpe) r4     // Catch:{ auda -> 0x0957 }
            auay r2 = r12.e     // Catch:{ all -> 0x0ca5 }
            boolean r2 = r2.j()     // Catch:{ all -> 0x0ca5 }
            if (r2 == 0) goto L_0x07e5
            hmx r2 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r5 = r6.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ all -> 0x0ca5 }
            aqor r11 = defpackage.aqor.c     // Catch:{ all -> 0x0ca5 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0ca5 }
            boolean r12 = r11.c     // Catch:{ all -> 0x0ca5 }
            if (r12 != 0) goto L_0x0763
            goto L_0x0769
        L_0x0763:
            r11.c()     // Catch:{ all -> 0x0ca5 }
            r12 = 0
            r11.c = r12     // Catch:{ all -> 0x0ca5 }
        L_0x0769:
            aucj r12 = r11.b     // Catch:{ all -> 0x0ca5 }
            aqor r12 = (defpackage.aqor) r12     // Catch:{ all -> 0x0ca5 }
            r5.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.a = r5     // Catch:{ all -> 0x0ca5 }
            r4.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.b = r4     // Catch:{ all -> 0x0ca5 }
            hjo r4 = r2.a     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            com.google.android.gms.common.internal.ClientContext r39 = r2.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            aucj r2 = r11.i()     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            r40 = r2
            aqor r40 = (defpackage.aqor) r40     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            baaj r2 = defpackage.hjo.c     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            if (r2 == 0) goto L_0x078a
            goto L_0x07a0
        L_0x078a:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            java.lang.String r5 = "google.internal.chrome.sync.passwords.v1.Passwords/CreatePassword"
            aqor r11 = defpackage.aqor.c     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            aqpe r12 = defpackage.aqpe.f     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            baah r12 = defpackage.baoq.a(r12)     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            baaj r2 = defpackage.baaj.a(r2, r5, r11, r12)     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            defpackage.hjo.c = r2     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
        L_0x07a0:
            izd r2 = r4.a     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            baaj r38 = defpackage.hjo.c     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            r37 = r2
            java.lang.Object r2 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            aqpe r2 = (defpackage.aqpe) r2     // Catch:{ babk -> 0x07d4, eif -> 0x07c8 }
            hls r4 = r8.f     // Catch:{ all -> 0x0ca5 }
            r5 = 1
            hln[] r11 = new defpackage.hln[r5]     // Catch:{ all -> 0x0ca5 }
            hln r2 = defpackage.hns.a((defpackage.aqpe) r2)     // Catch:{ all -> 0x0ca5 }
            r5 = 0
            r11[r5] = r2     // Catch:{ all -> 0x0ca5 }
            r4.a((defpackage.pyv) r3, (defpackage.hln[]) r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x07c8:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x07d4:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r4 = 257(0x101, float:3.6E-43)
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x07e5:
            boolean r2 = r12.g     // Catch:{ all -> 0x0ca5 }
            if (r2 == 0) goto L_0x0871
            hmx r2 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r5 = r6.a     // Catch:{ all -> 0x0ca5 }
            java.lang.String r4 = r4.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x0ca5 }
            aqot r5 = defpackage.aqot.b     // Catch:{ all -> 0x0ca5 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0ca5 }
            boolean r11 = r5.c     // Catch:{ all -> 0x0ca5 }
            if (r11 != 0) goto L_0x0803
            goto L_0x0809
        L_0x0803:
            r5.c()     // Catch:{ all -> 0x0ca5 }
            r11 = 0
            r5.c = r11     // Catch:{ all -> 0x0ca5 }
        L_0x0809:
            aucj r11 = r5.b     // Catch:{ all -> 0x0ca5 }
            aqot r11 = (defpackage.aqot) r11     // Catch:{ all -> 0x0ca5 }
            r4.getClass()     // Catch:{ all -> 0x0ca5 }
            r11.a = r4     // Catch:{ all -> 0x0ca5 }
            aucj r4 = r5.i()     // Catch:{ all -> 0x0ca5 }
            r40 = r4
            aqot r40 = (defpackage.aqot) r40     // Catch:{ all -> 0x0ca5 }
            hjo r4 = r2.a     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            com.google.android.gms.common.internal.ClientContext r39 = r2.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            baaj r2 = defpackage.hjo.e     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            if (r2 == 0) goto L_0x0825
            goto L_0x083b
        L_0x0825:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            java.lang.String r5 = "google.internal.chrome.sync.passwords.v1.Passwords/DeletePassword"
            aqot r11 = defpackage.aqot.b     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            aqou r12 = defpackage.aqou.a     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            baah r12 = defpackage.baoq.a(r12)     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            baaj r2 = defpackage.baaj.a(r2, r5, r11, r12)     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            defpackage.hjo.e = r2     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
        L_0x083b:
            izd r2 = r4.a     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            baaj r38 = defpackage.hjo.e     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            r37 = r2
            java.lang.Object r2 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            aqou r2 = (defpackage.aqou) r2     // Catch:{ babk -> 0x0860, eif -> 0x0854 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0854:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0860:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r4 = 257(0x101, float:3.6E-43)
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0871:
            boolean r2 = defpackage.awrz.b()     // Catch:{ all -> 0x0ca5 }
            if (r2 != 0) goto L_0x0913
            hmx r2 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r5 = r6.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ all -> 0x0ca5 }
            aqpi r5 = defpackage.aqpi.c     // Catch:{ all -> 0x0ca5 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0ca5 }
            java.lang.String r11 = r4.a     // Catch:{ all -> 0x0ca5 }
            boolean r12 = r5.c     // Catch:{ all -> 0x0ca5 }
            if (r12 != 0) goto L_0x0891
            goto L_0x0897
        L_0x0891:
            r5.c()     // Catch:{ all -> 0x0ca5 }
            r12 = 0
            r5.c = r12     // Catch:{ all -> 0x0ca5 }
        L_0x0897:
            aucj r12 = r5.b     // Catch:{ all -> 0x0ca5 }
            aqpi r12 = (defpackage.aqpi) r12     // Catch:{ all -> 0x0ca5 }
            r11.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.a = r11     // Catch:{ all -> 0x0ca5 }
            r4.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.b = r4     // Catch:{ all -> 0x0ca5 }
            hjo r4 = r2.a     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            com.google.android.gms.common.internal.ClientContext r39 = r2.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            aucj r2 = r5.i()     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            r40 = r2
            aqpi r40 = (defpackage.aqpi) r40     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            baaj r2 = defpackage.hjo.d     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            if (r2 == 0) goto L_0x08b8
            goto L_0x08ce
        L_0x08b8:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            java.lang.String r5 = "google.internal.chrome.sync.passwords.v1.Passwords/UpdatePassword"
            aqpi r11 = defpackage.aqpi.c     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            aqpe r12 = defpackage.aqpe.f     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            baah r12 = defpackage.baoq.a(r12)     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            baaj r2 = defpackage.baaj.a(r2, r5, r11, r12)     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            defpackage.hjo.d = r2     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
        L_0x08ce:
            izd r2 = r4.a     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            baaj r38 = defpackage.hjo.d     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            r37 = r2
            java.lang.Object r2 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            aqpe r2 = (defpackage.aqpe) r2     // Catch:{ babk -> 0x0902, eif -> 0x08f6 }
            hls r4 = r8.f     // Catch:{ all -> 0x0ca5 }
            r5 = 1
            hln[] r11 = new defpackage.hln[r5]     // Catch:{ all -> 0x0ca5 }
            hln r2 = defpackage.hns.a((defpackage.aqpe) r2)     // Catch:{ all -> 0x0ca5 }
            r5 = 0
            r11[r5] = r2     // Catch:{ all -> 0x0ca5 }
            r4.a((defpackage.pyv) r3, (defpackage.hln[]) r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x08f6:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0902:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r4 = 257(0x101, float:3.6E-43)
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0913:
            r10.add(r4)     // Catch:{ all -> 0x0ca5 }
            goto L_0x0b38
        L_0x0918:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0950 }
        L_0x091b:
            r0 = move-exception
            goto L_0x0922
        L_0x091d:
            r0 = move-exception
            goto L_0x0936
        L_0x091f:
            r0 = move-exception
            r29 = r5
        L_0x0922:
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ auda -> 0x0950 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0950 }
            if (r4 == 0) goto L_0x0932
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0950 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0950 }
            throw r2     // Catch:{ auda -> 0x0950 }
        L_0x0932:
            throw r2     // Catch:{ auda -> 0x0950 }
        L_0x0933:
            r0 = move-exception
            r29 = r5
        L_0x0936:
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ auda -> 0x0950 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0950 }
            if (r4 != 0) goto L_0x0949
            auda r4 = new auda     // Catch:{ auda -> 0x0950 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ auda -> 0x0950 }
            r4.<init>((java.lang.String) r2)     // Catch:{ auda -> 0x0950 }
            throw r4     // Catch:{ auda -> 0x0950 }
        L_0x0949:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0950 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0950 }
            throw r2     // Catch:{ auda -> 0x0950 }
        L_0x0950:
            r0 = move-exception
            goto L_0x0955
        L_0x0952:
            r0 = move-exception
            r29 = r5
        L_0x0955:
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0957 }
        L_0x0957:
            r0 = move-exception
            goto L_0x0960
        L_0x0959:
            r0 = move-exception
            goto L_0x095e
        L_0x095b:
            r0 = move-exception
            r28 = r4
        L_0x095e:
            r29 = r5
        L_0x0960:
            iwd r2 = defpackage.hns.a     // Catch:{ all -> 0x0ca5 }
            java.lang.String r4 = "Invalid password data."
            r5 = 0
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0ca5 }
            r2.d(r4, r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0973:
            r28 = r4
            r29 = r5
            r2 = 1
            if (r14 != r2) goto L_0x0b38
            auay r2 = r12.d     // Catch:{ auda -> 0x0b24 }
            aubs r4 = defpackage.aubs.c()     // Catch:{ auda -> 0x0b24 }
            aqph r5 = defpackage.aqph.f     // Catch:{ auda -> 0x0b24 }
            aubc r2 = r2.h()     // Catch:{ auda -> 0x0b21 }
            r11 = 4
            java.lang.Object r5 = r5.c(r11)     // Catch:{ auda -> 0x0b21 }
            aucj r5 = (defpackage.aucj) r5     // Catch:{ auda -> 0x0b21 }
            aueh r11 = defpackage.aueh.a     // Catch:{ IOException -> 0x0b06, RuntimeException -> 0x0af4 }
            aueq r11 = r11.a((java.lang.Object) r5)     // Catch:{ IOException -> 0x0b06, RuntimeException -> 0x0af4 }
            aubd r13 = defpackage.aubd.a((defpackage.aubc) r2)     // Catch:{ IOException -> 0x0b06, RuntimeException -> 0x0af4 }
            r11.a(r5, r13, r4)     // Catch:{ IOException -> 0x0b06, RuntimeException -> 0x0af4 }
            r11.d(r5)     // Catch:{ IOException -> 0x0b06, RuntimeException -> 0x0af4 }
            r4 = 0
            r2.a((int) r4)     // Catch:{ auda -> 0x0af1 }
            defpackage.aucj.b((defpackage.aucj) r5)     // Catch:{ auda -> 0x0b24 }
            aqph r5 = (defpackage.aqph) r5     // Catch:{ auda -> 0x0b24 }
            auay r2 = r12.e     // Catch:{ all -> 0x0ca5 }
            boolean r2 = r2.j()     // Catch:{ all -> 0x0ca5 }
            if (r2 == 0) goto L_0x0a48
            hmx r2 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r4 = r6.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r5)     // Catch:{ all -> 0x0ca5 }
            aqos r11 = defpackage.aqos.c     // Catch:{ all -> 0x0ca5 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0ca5 }
            boolean r12 = r11.c     // Catch:{ all -> 0x0ca5 }
            if (r12 != 0) goto L_0x09c6
            goto L_0x09cc
        L_0x09c6:
            r11.c()     // Catch:{ all -> 0x0ca5 }
            r12 = 0
            r11.c = r12     // Catch:{ all -> 0x0ca5 }
        L_0x09cc:
            aucj r12 = r11.b     // Catch:{ all -> 0x0ca5 }
            aqos r12 = (defpackage.aqos) r12     // Catch:{ all -> 0x0ca5 }
            r4.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.a = r4     // Catch:{ all -> 0x0ca5 }
            r5.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.b = r5     // Catch:{ all -> 0x0ca5 }
            hjo r4 = r2.a     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            com.google.android.gms.common.internal.ClientContext r39 = r2.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            aucj r2 = r11.i()     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            r40 = r2
            aqos r40 = (defpackage.aqos) r40     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            baaj r2 = defpackage.hjo.g     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            if (r2 == 0) goto L_0x09ed
            goto L_0x0a03
        L_0x09ed:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            java.lang.String r5 = "google.internal.chrome.sync.passwords.v1.Passwords/CreatePriorityPreference"
            aqos r11 = defpackage.aqos.c     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            aqph r12 = defpackage.aqph.f     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            baah r12 = defpackage.baoq.a(r12)     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            baaj r2 = defpackage.baaj.a(r2, r5, r11, r12)     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            defpackage.hjo.g = r2     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
        L_0x0a03:
            izd r2 = r4.a     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            baaj r38 = defpackage.hjo.g     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            r37 = r2
            java.lang.Object r2 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            aqph r2 = (defpackage.aqph) r2     // Catch:{ babk -> 0x0a37, eif -> 0x0a2b }
            hls r4 = r8.f     // Catch:{ all -> 0x0ca5 }
            r5 = 1
            hln[] r11 = new defpackage.hln[r5]     // Catch:{ all -> 0x0ca5 }
            hln r2 = defpackage.hns.a((defpackage.aqph) r2)     // Catch:{ all -> 0x0ca5 }
            r5 = 0
            r11[r5] = r2     // Catch:{ all -> 0x0ca5 }
            r4.a((defpackage.pyv) r3, (defpackage.hln[]) r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0a2b:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0a37:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r4 = 257(0x101, float:3.6E-43)
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0a48:
            boolean r2 = r12.g     // Catch:{ all -> 0x0ca5 }
            if (r2 != 0) goto L_0x0ae8
            hmx r2 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r4 = r6.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r5)     // Catch:{ all -> 0x0ca5 }
            aqpj r4 = defpackage.aqpj.c     // Catch:{ all -> 0x0ca5 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0ca5 }
            java.lang.String r11 = r5.a     // Catch:{ all -> 0x0ca5 }
            boolean r12 = r4.c     // Catch:{ all -> 0x0ca5 }
            if (r12 != 0) goto L_0x0a66
            goto L_0x0a6c
        L_0x0a66:
            r4.c()     // Catch:{ all -> 0x0ca5 }
            r12 = 0
            r4.c = r12     // Catch:{ all -> 0x0ca5 }
        L_0x0a6c:
            aucj r12 = r4.b     // Catch:{ all -> 0x0ca5 }
            aqpj r12 = (defpackage.aqpj) r12     // Catch:{ all -> 0x0ca5 }
            r11.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.a = r11     // Catch:{ all -> 0x0ca5 }
            r5.getClass()     // Catch:{ all -> 0x0ca5 }
            r12.b = r5     // Catch:{ all -> 0x0ca5 }
            hjo r5 = r2.a     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            com.google.android.gms.common.internal.ClientContext r39 = r2.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            aucj r2 = r4.i()     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            r40 = r2
            aqpj r40 = (defpackage.aqpj) r40     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            baaj r2 = defpackage.hjo.h     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            if (r2 == 0) goto L_0x0a8d
            goto L_0x0aa3
        L_0x0a8d:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            java.lang.String r4 = "google.internal.chrome.sync.passwords.v1.Passwords/UpdatePriorityPreference"
            aqpj r11 = defpackage.aqpj.c     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            baah r11 = defpackage.baoq.a(r11)     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            aqph r12 = defpackage.aqph.f     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            baah r12 = defpackage.baoq.a(r12)     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            baaj r2 = defpackage.baaj.a(r2, r4, r11, r12)     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            defpackage.hjo.h = r2     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
        L_0x0aa3:
            izd r2 = r5.a     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            baaj r38 = defpackage.hjo.h     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            r41 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r43 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            r37 = r2
            java.lang.Object r2 = r37.a(r38, r39, r40, r41, r43)     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            aqph r2 = (defpackage.aqph) r2     // Catch:{ babk -> 0x0ad7, eif -> 0x0acb }
            hls r4 = r8.f     // Catch:{ all -> 0x0ca5 }
            r5 = 1
            hln[] r11 = new defpackage.hln[r5]     // Catch:{ all -> 0x0ca5 }
            hln r2 = defpackage.hns.a((defpackage.aqph) r2)     // Catch:{ all -> 0x0ca5 }
            r5 = 0
            r11[r5] = r2     // Catch:{ all -> 0x0ca5 }
            r4.a((defpackage.pyv) r3, (defpackage.hln[]) r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0acb:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0ad7:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r4 = 257(0x101, float:3.6E-43)
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0ae8:
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0af1:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0b21 }
        L_0x0af4:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ auda -> 0x0b21 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0b21 }
            if (r4 == 0) goto L_0x0b05
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0b21 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0b21 }
            throw r2     // Catch:{ auda -> 0x0b21 }
        L_0x0b05:
            throw r2     // Catch:{ auda -> 0x0b21 }
        L_0x0b06:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ auda -> 0x0b21 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x0b21 }
            if (r4 != 0) goto L_0x0b1a
            auda r4 = new auda     // Catch:{ auda -> 0x0b21 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ auda -> 0x0b21 }
            r4.<init>((java.lang.String) r2)     // Catch:{ auda -> 0x0b21 }
            throw r4     // Catch:{ auda -> 0x0b21 }
        L_0x0b1a:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0b21 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0b21 }
            throw r2     // Catch:{ auda -> 0x0b21 }
        L_0x0b21:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0b24 }
        L_0x0b24:
            r0 = move-exception
            iwd r2 = defpackage.hns.a     // Catch:{ all -> 0x0ca5 }
            java.lang.String r4 = "Invalid priority preference data."
            r5 = 0
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0ca5 }
            r2.d(r4, r11)     // Catch:{ all -> 0x0ca5 }
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0b38:
            r2 = r45
            r4 = r28
            r5 = r29
            r11 = 3
            goto L_0x0704
        L_0x0b41:
            r29 = r5
            boolean r2 = defpackage.awrz.b()     // Catch:{ all -> 0x0ca5 }
            if (r2 == 0) goto L_0x0c48
            r2 = 200(0xc8, float:2.8E-43)
            java.util.List r2 = defpackage.anda.a((java.util.List) r10, (int) r2)     // Catch:{ all -> 0x0ca5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ca5 }
        L_0x0b53:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ca5 }
            if (r4 == 0) goto L_0x0c46
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ca5 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0ca5 }
            hmx r5 = r8.g     // Catch:{ all -> 0x0ca5 }
            java.lang.String r10 = r6.a     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.c(r10)     // Catch:{ all -> 0x0ca5 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ all -> 0x0ca5 }
            aqoo r10 = defpackage.aqoo.b     // Catch:{ all -> 0x0ca5 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x0ca5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0ca5 }
        L_0x0b76:
            boolean r11 = r4.hasNext()     // Catch:{ all -> 0x0ca5 }
            if (r11 != 0) goto L_0x0bea
            hjo r4 = r5.a     // Catch:{ babk -> 0x0bd9, eif -> 0x0bcd }
            com.google.android.gms.common.internal.ClientContext r5 = r5.a((defpackage.pyv) r3)     // Catch:{ babk -> 0x0bd9, eif -> 0x0bcd }
            aucj r10 = r10.i()     // Catch:{ babk -> 0x0bd9, eif -> 0x0bcd }
            aqoo r10 = (defpackage.aqoo) r10     // Catch:{ babk -> 0x0bd9, eif -> 0x0bcd }
            aqop r4 = r4.a(r5, r10)     // Catch:{ babk -> 0x0bd9, eif -> 0x0bcd }
            aucx r5 = r4.b     // Catch:{ all -> 0x0ca5 }
            int r5 = r5.size()     // Catch:{ all -> 0x0ca5 }
            if (r5 <= 0) goto L_0x0bab
            iwd r5 = defpackage.hns.a     // Catch:{ all -> 0x0ca5 }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0ca5 }
            aucx r10 = r4.b     // Catch:{ all -> 0x0ca5 }
            int r10 = r10.size()     // Catch:{ all -> 0x0ca5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0ca5 }
            r12 = 0
            r11[r12] = r10     // Catch:{ all -> 0x0ca5 }
            java.lang.String r10 = "Failed to update: %d"
            r5.d(r10, r11)     // Catch:{ all -> 0x0ca5 }
        L_0x0bab:
            aucx r4 = r4.a     // Catch:{ all -> 0x0ca5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0ca5 }
        L_0x0bb1:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0ca5 }
            if (r5 == 0) goto L_0x0b53
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0ca5 }
            aqpe r5 = (defpackage.aqpe) r5     // Catch:{ all -> 0x0ca5 }
            hls r10 = r8.f     // Catch:{ all -> 0x0ca5 }
            r11 = 1
            hln[] r12 = new defpackage.hln[r11]     // Catch:{ all -> 0x0ca5 }
            hln r5 = defpackage.hns.a((defpackage.aqpe) r5)     // Catch:{ all -> 0x0ca5 }
            r11 = 0
            r12[r11] = r5     // Catch:{ all -> 0x0ca5 }
            r10.a((defpackage.pyv) r3, (defpackage.hln[]) r12)     // Catch:{ all -> 0x0ca5 }
            goto L_0x0bb1
        L_0x0bcd:
            r0 = move-exception
            r1 = r0
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            int r3 = defpackage.hjn.a((defpackage.eif) r1)     // Catch:{ all -> 0x0ca5 }
            r2.<init>((int) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0bd9:
            r0 = move-exception
            r1 = r0
            defpackage.hmy.a(r1)     // Catch:{ all -> 0x0ca5 }
            hjm r2 = new hjm     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = defpackage.hmy.b(r1)     // Catch:{ all -> 0x0ca5 }
            r11 = 257(0x101, float:3.6E-43)
            r2.<init>(r11, r3, r1)     // Catch:{ all -> 0x0ca5 }
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0bea:
            r11 = 257(0x101, float:3.6E-43)
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x0ca5 }
            aqpe r12 = (defpackage.aqpe) r12     // Catch:{ all -> 0x0ca5 }
            aqpi r13 = defpackage.aqpi.c     // Catch:{ all -> 0x0ca5 }
            aucd r13 = r13.o()     // Catch:{ all -> 0x0ca5 }
            java.lang.String r11 = r12.a     // Catch:{ all -> 0x0ca5 }
            r28 = r2
            boolean r2 = r13.c     // Catch:{ all -> 0x0ca5 }
            if (r2 != 0) goto L_0x0c01
            goto L_0x0c07
        L_0x0c01:
            r13.c()     // Catch:{ all -> 0x0ca5 }
            r2 = 0
            r13.c = r2     // Catch:{ all -> 0x0ca5 }
        L_0x0c07:
            aucj r2 = r13.b     // Catch:{ all -> 0x0ca5 }
            aqpi r2 = (defpackage.aqpi) r2     // Catch:{ all -> 0x0ca5 }
            r11.getClass()     // Catch:{ all -> 0x0ca5 }
            r2.a = r11     // Catch:{ all -> 0x0ca5 }
            r12.getClass()     // Catch:{ all -> 0x0ca5 }
            r2.b = r12     // Catch:{ all -> 0x0ca5 }
            aucj r2 = r13.i()     // Catch:{ all -> 0x0ca5 }
            aqpi r2 = (defpackage.aqpi) r2     // Catch:{ all -> 0x0ca5 }
            boolean r11 = r10.c     // Catch:{ all -> 0x0ca5 }
            if (r11 != 0) goto L_0x0c20
            goto L_0x0c26
        L_0x0c20:
            r10.c()     // Catch:{ all -> 0x0ca5 }
            r11 = 0
            r10.c = r11     // Catch:{ all -> 0x0ca5 }
        L_0x0c26:
            aucj r11 = r10.b     // Catch:{ all -> 0x0ca5 }
            aqoo r11 = (defpackage.aqoo) r11     // Catch:{ all -> 0x0ca5 }
            r2.getClass()     // Catch:{ all -> 0x0ca5 }
            aucx r12 = r11.a     // Catch:{ all -> 0x0ca5 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x0ca5 }
            if (r12 != 0) goto L_0x0c3d
            aucx r12 = r11.a     // Catch:{ all -> 0x0ca5 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x0ca5 }
            r11.a = r12     // Catch:{ all -> 0x0ca5 }
        L_0x0c3d:
            aucx r11 = r11.a     // Catch:{ all -> 0x0ca5 }
            r11.add(r2)     // Catch:{ all -> 0x0ca5 }
            r2 = r28
            goto L_0x0b76
        L_0x0c46:
            r2 = 1
            goto L_0x0c4d
        L_0x0c48:
            r2 = 1
            goto L_0x0c4d
        L_0x0c4a:
            r29 = r5
            r2 = 0
        L_0x0c4d:
            r1 = r1 | r2
            if (r1 == 0) goto L_0x0c6f
            hne r2 = r8.b     // Catch:{ all -> 0x0ca5 }
            r2.a(r9, r14)     // Catch:{ all -> 0x0ca5 }
            hnl r2 = r8.d     // Catch:{ all -> 0x0ca5 }
            java.lang.Object r3 = r2.f     // Catch:{ all -> 0x0ca5 }
            monitor-enter(r3)     // Catch:{ all -> 0x0ca5 }
            hkx r2 = r2.b     // Catch:{ all -> 0x0c6b }
            r4 = 1
            hlv[] r5 = new defpackage.hlv[r4]     // Catch:{ all -> 0x0c6b }
            hlv r4 = defpackage.hkx.c(r14)     // Catch:{ all -> 0x0c6b }
            r6 = 0
            r5[r6] = r4     // Catch:{ all -> 0x0c6b }
            r2.a((defpackage.pyv) r9, (defpackage.hlv[]) r5)     // Catch:{ all -> 0x0c6b }
            monitor-exit(r3)     // Catch:{ all -> 0x0c6b }
            goto L_0x0c6f
        L_0x0c6b:
            r0 = move-exception
            r1 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0c6b }
            throw r1     // Catch:{ all -> 0x0ca5 }
        L_0x0c6f:
            hnl r2 = r8.d     // Catch:{ hjm -> 0x0c75 }
            r2.a((defpackage.pyv) r9, (int) r14)     // Catch:{ hjm -> 0x0c75 }
            goto L_0x0c87
        L_0x0c75:
            r0 = move-exception
            r2 = r0
            int r3 = r2.a     // Catch:{ all -> 0x0ca5 }
            r4 = 1537(0x601, float:2.154E-42)
            if (r3 != r4) goto L_0x0c89
            iwd r2 = defpackage.hns.a     // Catch:{ all -> 0x0ca5 }
            java.lang.String r3 = "Passphrase not entered, skip indexing."
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0ca5 }
            r2.c(r3, r5)     // Catch:{ all -> 0x0ca5 }
        L_0x0c87:
            monitor-exit(r7)     // Catch:{ all -> 0x0ca5 }
            goto L_0x0cb2
        L_0x0c89:
            throw r2     // Catch:{ all -> 0x0ca5 }
        L_0x0c8a:
            r0 = move-exception
            r29 = r5
            goto L_0x0c9f
        L_0x0c8e:
            r0 = move-exception
            r29 = r5
            r1 = r0
        L_0x0c92:
            r3.endTransaction()     // Catch:{ all -> 0x0ca5 }
            throw r1     // Catch:{ all -> 0x0ca5 }
        L_0x0c96:
            r0 = move-exception
            r26 = r3
            r29 = r5
            r25 = r6
            r36 = r13
        L_0x0c9f:
            r1 = r0
        L_0x0ca0:
            monitor-exit(r7)     // Catch:{ all -> 0x0ca5 }
            throw r1     // Catch:{ hjm -> 0x0ca2, hmw -> 0x0cd8, all -> 0x0cce }
        L_0x0ca2:
            r0 = move-exception
            goto L_0x0d03
        L_0x0ca5:
            r0 = move-exception
            goto L_0x0c9f
        L_0x0ca7:
            r26 = r3
            r29 = r5
            r25 = r6
            r35 = r11
            r36 = r13
        L_0x0cb1:
            r1 = 0
        L_0x0cb2:
            boolean r2 = r15.c     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            if (r2 != 0) goto L_0x0cb7
            goto L_0x0cbd
        L_0x0cb7:
            r15.c()     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            r2 = 0
            r15.c = r2     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
        L_0x0cbd:
            aucj r2 = r15.b     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            ansq r2 = (defpackage.ansq) r2     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            r3 = 1
            r2.c = r3     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            int r3 = r2.a     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            r4 = 2
            r3 = r3 | r4
            r2.a = r3     // Catch:{ hjm -> 0x0ce2, hmw -> 0x0cd8, all -> 0x0cce }
            r11 = r35
            goto L_0x0d25
        L_0x0cce:
            r0 = move-exception
            r1 = r44
            r4 = r45
            r3 = r0
            r2 = r29
            goto L_0x0ecd
        L_0x0cd8:
            r0 = move-exception
            r1 = r44
            r4 = r45
            r3 = r0
            r2 = r29
            goto L_0x0e57
        L_0x0ce2:
            r0 = move-exception
            r2 = r0
            r11 = r2
            goto L_0x0d06
        L_0x0ce6:
            r0 = move-exception
            r26 = r3
            r1 = r44
            r4 = r45
            r3 = r0
            goto L_0x0055
        L_0x0cf0:
            r0 = move-exception
            r26 = r3
            r1 = r44
            r4 = r45
            r3 = r0
            goto L_0x005d
        L_0x0cfa:
            r0 = move-exception
            r26 = r3
            r29 = r5
            r25 = r6
            r36 = r13
        L_0x0d03:
            r1 = r0
        L_0x0d04:
            r11 = r1
            r1 = 0
        L_0x0d06:
            int r2 = r11.a     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            int r2 = defpackage.hjn.b(r2)     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            boolean r3 = r15.c     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            if (r3 != 0) goto L_0x0d11
            goto L_0x0d17
        L_0x0d11:
            r15.c()     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r3 = 0
            r15.c = r3     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
        L_0x0d17:
            aucj r3 = r15.b     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            ansq r3 = (defpackage.ansq) r3     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r4 = -1
            int r2 = r2 + r4
            r3.c = r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            int r2 = r3.a     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r4 = 2
            r2 = r2 | r4
            r3.a = r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
        L_0x0d25:
            aucj r2 = r15.b     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            ansq r2 = (defpackage.ansq) r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            int r3 = r2.a     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r4 = 4
            r3 = r3 | r4
            r2.a = r3     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r2.d = r1     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            long r2 = r2 - r19
            int r3 = (int) r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            boolean r2 = r15.c     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            if (r2 != 0) goto L_0x0d3d
            goto L_0x0d43
        L_0x0d3d:
            r15.c()     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r2 = 0
            r15.c = r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
        L_0x0d43:
            aucj r2 = r15.b     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            ansq r2 = (defpackage.ansq) r2     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            int r4 = r2.a     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r4 = r4 | 8
            r2.a = r4     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r2.e = r3     // Catch:{ hjm -> 0x0d9d, hmw -> 0x0d99, all -> 0x0d95 }
            r2 = r29
            boolean r3 = r2.c     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            if (r3 != 0) goto L_0x0d56
            goto L_0x0d5c
        L_0x0d56:
            r2.c()     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            r3 = 0
            r2.c = r3     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
        L_0x0d5c:
            aucj r3 = r2.b     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            anss r3 = (defpackage.anss) r3     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            aucj r4 = r15.i()     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            ansq r4 = (defpackage.ansq) r4     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            r4.getClass()     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            aucx r5 = r3.c     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            boolean r5 = r5.a()     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            if (r5 != 0) goto L_0x0d79
            aucx r5 = r3.c     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            r3.c = r5     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
        L_0x0d79:
            aucx r3 = r3.c     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            r3.add(r4)     // Catch:{ hjm -> 0x0d93, hmw -> 0x0d91, all -> 0x0d8f }
            r13 = r36 | r1
            r1 = r44
            r5 = r2
            r6 = r25
            r3 = r26
            r7 = 0
            r8 = 1
            r10 = 2
            r12 = 3
            r2 = r45
            goto L_0x0138
        L_0x0d8f:
            r0 = move-exception
            goto L_0x0da5
        L_0x0d91:
            r0 = move-exception
            goto L_0x0daf
        L_0x0d93:
            r0 = move-exception
            goto L_0x0db9
        L_0x0d95:
            r0 = move-exception
            r2 = r29
            goto L_0x0da5
        L_0x0d99:
            r0 = move-exception
            r2 = r29
            goto L_0x0daf
        L_0x0d9d:
            r0 = move-exception
            r2 = r29
            goto L_0x0db9
        L_0x0da1:
            r0 = move-exception
            r26 = r3
            r2 = r5
        L_0x0da5:
            r1 = r44
        L_0x0da7:
            r4 = r45
            goto L_0x0e4e
        L_0x0dab:
            r0 = move-exception
            r26 = r3
            r2 = r5
        L_0x0daf:
            r1 = r44
        L_0x0db1:
            r4 = r45
            goto L_0x0e56
        L_0x0db5:
            r0 = move-exception
            r26 = r3
            r2 = r5
        L_0x0db9:
            r1 = r44
        L_0x0dbb:
            r4 = r45
            goto L_0x0e96
        L_0x0dbf:
            r26 = r3
            r2 = r5
            r35 = r11
            r36 = r13
            if (r35 != 0) goto L_0x0e44
            r1 = r44
            hnx r3 = r1.d     // Catch:{ hjm -> 0x0e41, hmw -> 0x0e3e, all -> 0x0e3b }
            r4 = r45
            pyv r5 = r4.a     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            if (r36 != 0) goto L_0x0dd3
            goto L_0x0dda
        L_0x0dd3:
            long r6 = r3.a((defpackage.pyv) r5)     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r3.a((defpackage.pyv) r5, (long) r6)     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
        L_0x0dda:
            hkx r3 = r3.a     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r6 = 1
            hlv[] r7 = new defpackage.hlv[r6]     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            hlv r8 = defpackage.hkx.g     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r9 = 0
            r7[r9] = r8     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r3.a((defpackage.pyv) r5, (defpackage.hlv[]) r7)     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r13 = r36
        L_0x0de9:
            boolean r3 = r2.c     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            if (r3 != 0) goto L_0x0dee
            goto L_0x0df4
        L_0x0dee:
            r2.c()     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r3 = 0
            r2.c = r3     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
        L_0x0df4:
            aucj r3 = r2.b     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            anss r3 = (defpackage.anss) r3     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            int r5 = r3.a     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            r7 = 4
            r5 = r5 | r7
            r3.a = r5     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            if (r13 != 0) goto L_0x0e02
            r8 = 0
            goto L_0x0e03
        L_0x0e02:
            r8 = 1
        L_0x0e03:
            r3.e = r8     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r26
            int r3 = (int) r5
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x0e11
            goto L_0x0e17
        L_0x0e11:
            r2.c()
            r5 = 0
            r2.c = r5
        L_0x0e17:
            aucj r5 = r2.b
            anss r5 = (defpackage.anss) r5
            int r6 = r5.a
            r6 = r6 | 8
            r5.a = r6
            r5.f = r3
            android.content.Context r3 = r1.c
            pyv r4 = r4.a
            java.lang.String r4 = r4.b
            hke r3 = defpackage.hke.a(r3, r4)
            aucj r2 = r2.i()
            anss r2 = (defpackage.anss) r2
            r3.a((defpackage.anss) r2)
            return
        L_0x0e37:
            r0 = move-exception
            goto L_0x0e56
        L_0x0e39:
            r0 = move-exception
            goto L_0x0e96
        L_0x0e3b:
            r0 = move-exception
            goto L_0x0da7
        L_0x0e3e:
            r0 = move-exception
            goto L_0x0db1
        L_0x0e41:
            r0 = move-exception
            goto L_0x0dbb
        L_0x0e44:
            r1 = r44
            r4 = r45
            throw r35     // Catch:{ hjm -> 0x0e39, hmw -> 0x0e37 }
        L_0x0e49:
            r0 = move-exception
            r26 = r3
            r4 = r2
            r2 = r5
        L_0x0e4e:
            r3 = r0
            goto L_0x0ecd
        L_0x0e51:
            r0 = move-exception
            r26 = r3
            r4 = r2
            r2 = r5
        L_0x0e56:
            r3 = r0
        L_0x0e57:
            hnn r5 = r1.g     // Catch:{ all -> 0x0ecb }
            pyv r6 = r4.a     // Catch:{ all -> 0x0ecb }
            r5.a(r6)     // Catch:{ all -> 0x0ecb }
            hlo r5 = r1.f     // Catch:{ all -> 0x0ecb }
            pyv r6 = r4.a     // Catch:{ all -> 0x0ecb }
            r5.a(r6)     // Catch:{ all -> 0x0ecb }
            r5 = 1025(0x401, float:1.436E-42)
            int r6 = defpackage.hjn.b(r5)     // Catch:{ all -> 0x0ecb }
            boolean r7 = r2.c     // Catch:{ all -> 0x0ecb }
            if (r7 != 0) goto L_0x0e70
            goto L_0x0e76
        L_0x0e70:
            r2.c()     // Catch:{ all -> 0x0ecb }
            r7 = 0
            r2.c = r7     // Catch:{ all -> 0x0ecb }
        L_0x0e76:
            aucj r7 = r2.b     // Catch:{ all -> 0x0ecb }
            anss r7 = (defpackage.anss) r7     // Catch:{ all -> 0x0ecb }
            r8 = -1
            int r6 = r6 + r8
            r7.d = r6     // Catch:{ all -> 0x0ecb }
            int r6 = r7.a     // Catch:{ all -> 0x0ecb }
            r8 = 2
            r6 = r6 | r8
            r7.a = r6     // Catch:{ all -> 0x0ecb }
            hnx r6 = r1.d     // Catch:{ all -> 0x0ecb }
            r6.a((defpackage.hnw) r4, (int) r5)     // Catch:{ all -> 0x0ecb }
            hjm r6 = new hjm     // Catch:{ all -> 0x0ecb }
            java.lang.String r7 = "The current user is not a sync user."
            r6.<init>(r5, r7, r3)     // Catch:{ all -> 0x0ecb }
            throw r6     // Catch:{ all -> 0x0ecb }
        L_0x0e91:
            r0 = move-exception
            r26 = r3
            r4 = r2
            r2 = r5
        L_0x0e96:
            r3 = r0
        L_0x0e97:
            int r5 = r3.a     // Catch:{ all -> 0x0ecb }
            int r5 = defpackage.hjn.b(r5)     // Catch:{ all -> 0x0ecb }
            boolean r6 = r2.c     // Catch:{ all -> 0x0ecb }
            if (r6 != 0) goto L_0x0ea2
            goto L_0x0ea8
        L_0x0ea2:
            r2.c()     // Catch:{ all -> 0x0ecb }
            r6 = 0
            r2.c = r6     // Catch:{ all -> 0x0ecb }
        L_0x0ea8:
            aucj r6 = r2.b     // Catch:{ all -> 0x0ecb }
            anss r6 = (defpackage.anss) r6     // Catch:{ all -> 0x0ecb }
            r7 = -1
            int r5 = r5 + r7
            r6.d = r5     // Catch:{ all -> 0x0ecb }
            int r5 = r6.a     // Catch:{ all -> 0x0ecb }
            r7 = 2
            r5 = r5 | r7
            r6.a = r5     // Catch:{ all -> 0x0ecb }
            hnx r5 = r1.d     // Catch:{ all -> 0x0ecb }
            int r6 = r3.a     // Catch:{ all -> 0x0ecb }
            r5.a((defpackage.hnw) r4, (int) r6)     // Catch:{ all -> 0x0ecb }
            int r5 = r3.a     // Catch:{ all -> 0x0ecb }
            r6 = 1282(0x502, float:1.796E-42)
            if (r5 != r6) goto L_0x0eca
            hlo r5 = r1.f     // Catch:{ all -> 0x0ecb }
            pyv r6 = r4.a     // Catch:{ all -> 0x0ecb }
            r5.a(r6)     // Catch:{ all -> 0x0ecb }
        L_0x0eca:
            throw r3     // Catch:{ all -> 0x0ecb }
        L_0x0ecb:
            r0 = move-exception
            goto L_0x0e4e
        L_0x0ecd:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r26
            int r6 = (int) r5
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x0ede
            r2.c()
            r5 = 0
            r2.c = r5
        L_0x0ede:
            aucj r5 = r2.b
            anss r5 = (defpackage.anss) r5
            int r7 = r5.a
            r7 = r7 | 8
            r5.a = r7
            r5.f = r6
            android.content.Context r5 = r1.c
            pyv r4 = r4.a
            java.lang.String r4 = r4.b
            hke r4 = defpackage.hke.a(r5, r4)
            aucj r2 = r2.i()
            anss r2 = (defpackage.anss) r2
            r4.a((defpackage.anss) r2)
            goto L_0x0eff
        L_0x0efe:
            throw r3
        L_0x0eff:
            goto L_0x0efe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnu.b(hnw):void");
    }

    public final void a(hnw hnw) {
        String string = this.c.getString(R.string.chromesync_sync_authority);
        Account a2 = hnw.a.a();
        ContentResolver.setIsSyncable(a2, string, 1);
        ContentResolver.setSyncAutomatically(a2, string, true);
        ContentResolver.requestSync(a2, string, hno.a(hnw));
    }
}
