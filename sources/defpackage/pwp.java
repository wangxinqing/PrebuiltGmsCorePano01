package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.List;

/* renamed from: pwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwp {
    public static final Object a = new Object();

    private static String a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? "UNKNOWN" : "END" : "START";
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0207 A[Catch:{ auda -> 0x01ea, auda -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0215 A[Catch:{ auda -> 0x01ea, auda -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021f A[Catch:{ auda -> 0x01ea, auda -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0200 A[Catch:{ auda -> 0x01ea, auda -> 0x0226 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(android.content.Context r21, java.lang.String r22, java.util.List r23, com.google.android.gms.appdatasearch.UsageInfo[] r24) {
        /*
            r1 = r22
            r2 = r24
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x000c:
            if (r6 >= r4) goto L_0x03aa
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0016
            r17 = r4
            goto L_0x03a0
        L_0x0016:
            com.google.android.gms.appdatasearch.DocumentContents r0 = r7.e
            if (r0 == 0) goto L_0x039e
            long r8 = java.lang.System.currentTimeMillis()
            r10 = r23
            ovc r8 = defpackage.pxs.a(r7, r1, r8, r10)
            r9 = 64
            r12 = 1
            android.content.pm.PackageManager r0 = r21.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0038 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r9)     // Catch:{ NameNotFoundException -> 0x0038 }
            int r13 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0038 }
            java.lang.String r0 = defpackage.jhg.a((android.content.pm.PackageInfo) r0)     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x0044
        L_0x0036:
            r0 = move-exception
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            r13 = 0
        L_0x003a:
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r5] = r1
            java.lang.String r15 = "Information for package not found: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r15, (java.lang.Object[]) r14)
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            java.lang.String r0 = ""
        L_0x0049:
            oqo r14 = r8.i
            if (r14 != 0) goto L_0x004f
            oqo r14 = defpackage.oqo.g
        L_0x004f:
            osz r14 = defpackage.ozq.a((java.lang.String) r1, (defpackage.oqo) r14)
            oqo r15 = r8.i
            if (r15 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            oqo r15 = defpackage.oqo.g
        L_0x005a:
            otw r8 = defpackage.pxw.a(r14, r8)
            pqm r16 = defpackage.pqm.q
            aucd r11 = r16.o()
            long r9 = r15.f
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r11.c()
            r11.c = r5
        L_0x0070:
            aucj r12 = r11.b
            pqm r12 = (defpackage.pqm) r12
            int r5 = r12.a
            r17 = 1
            r5 = r5 | 1
            r12.a = r5
            r12.b = r9
            java.lang.String r9 = r14.e
            r9.getClass()
            r5 = r5 | 2
            r12.a = r5
            r12.c = r9
            r5 = r5 | 16
            r12.a = r5
            r12.e = r13
            r0.getClass()
            r9 = 4
            r5 = r5 | r9
            r12.a = r5
            r12.d = r0
            aucx r5 = r15.e
            int r10 = r5.size()
            r9 = 0
            r12 = 0
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x00a5:
            if (r9 >= r10) goto L_0x0246
            java.lang.Object r0 = r5.get(r9)
            oqn r0 = (defpackage.oqn) r0
            oqy r1 = r0.d
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            oqy r1 = defpackage.oqy.r
        L_0x00b4:
            java.lang.String r1 = r1.b
            oqy r2 = r0.d
            if (r2 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            oqy r2 = defpackage.oqy.r
        L_0x00bd:
            java.lang.String r2 = r2.m
            r17 = r4
            java.lang.String r4 = "name"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00ef
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x00da:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            r0.getClass()
            int r2 = r1.a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.a = r2
            r1.h = r0
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x00ef:
            java.lang.String r4 = "url"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x011e
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x0103
            goto L_0x0109
        L_0x0103:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x0109:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            r0.getClass()
            int r2 = r1.a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.a = r2
            r1.k = r0
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x011e:
            java.lang.String r4 = ".private:action"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0185
            java.lang.String r2 = "intent_action"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x013c
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            r12 = r0
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x013c:
            java.lang.String r2 = "intent_data"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0156
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r13 = r0
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x0156:
            java.lang.String r2 = "intent_activity"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x016d
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            r18 = r0
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x016d:
            java.lang.String r2 = "intent_extra_data"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0184
            auay r0 = r0.c
            java.lang.String r0 = r0.l()
            r19 = r0
        L_0x017e:
            r20 = r5
            r5 = 64
            goto L_0x023a
        L_0x0184:
            goto L_0x017e
        L_0x0185:
            auay r0 = r0.c     // Catch:{ auda -> 0x0230 }
            aubs r1 = defpackage.aubs.c()     // Catch:{ auda -> 0x0230 }
            bazc r2 = defpackage.bazc.d     // Catch:{ auda -> 0x0230 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0228 }
            r4 = 4
            java.lang.Object r2 = r2.c(r4)     // Catch:{ auda -> 0x0228 }
            aucj r2 = (defpackage.aucj) r2     // Catch:{ auda -> 0x0228 }
            aueh r4 = defpackage.aueh.a     // Catch:{ IOException -> 0x0208, RuntimeException -> 0x01f3 }
            aueq r4 = r4.a((java.lang.Object) r2)     // Catch:{ IOException -> 0x0208, RuntimeException -> 0x01f3 }
            r20 = r5
            aubd r5 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x01f1, RuntimeException -> 0x01ef }
            r4.a(r2, r5, r1)     // Catch:{ IOException -> 0x01f1, RuntimeException -> 0x01ef }
            r4.d(r2)     // Catch:{ IOException -> 0x01f1, RuntimeException -> 0x01ef }
            r1 = 0
            r0.a((int) r1)     // Catch:{ auda -> 0x01ea }
            defpackage.aucj.b((defpackage.aucj) r2)     // Catch:{ auda -> 0x01e8 }
            bazc r2 = (defpackage.bazc) r2     // Catch:{ auda -> 0x01e8 }
            java.lang.String r0 = r2.b     // Catch:{ auda -> 0x01e8 }
            boolean r1 = r11.c     // Catch:{ auda -> 0x01e8 }
            if (r1 != 0) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            r11.c()     // Catch:{ auda -> 0x01e8 }
            r1 = 0
            r11.c = r1     // Catch:{ auda -> 0x01e8 }
        L_0x01c0:
            aucj r1 = r11.b     // Catch:{ auda -> 0x01e8 }
            pqm r1 = (defpackage.pqm) r1     // Catch:{ auda -> 0x01e8 }
            r0.getClass()     // Catch:{ auda -> 0x01e8 }
            int r4 = r1.a     // Catch:{ auda -> 0x01e8 }
            r5 = 64
            r4 = r4 | r5
            r1.a = r4     // Catch:{ auda -> 0x022e }
            r1.g = r0     // Catch:{ auda -> 0x022e }
            aucx r0 = r2.c     // Catch:{ auda -> 0x022e }
            aucx r2 = r1.n     // Catch:{ auda -> 0x022e }
            boolean r2 = r2.a()     // Catch:{ auda -> 0x022e }
            if (r2 != 0) goto L_0x01e2
            aucx r2 = r1.n     // Catch:{ auda -> 0x022e }
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)     // Catch:{ auda -> 0x022e }
            r1.n = r2     // Catch:{ auda -> 0x022e }
        L_0x01e2:
            aucx r1 = r1.n     // Catch:{ auda -> 0x022e }
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)     // Catch:{ auda -> 0x022e }
            goto L_0x023a
        L_0x01e8:
            r0 = move-exception
            goto L_0x0233
        L_0x01ea:
            r0 = move-exception
            r5 = 64
            r1 = r0
            throw r1     // Catch:{ auda -> 0x0226 }
        L_0x01ef:
            r0 = move-exception
            goto L_0x01f6
        L_0x01f1:
            r0 = move-exception
            goto L_0x020b
        L_0x01f3:
            r0 = move-exception
            r20 = r5
        L_0x01f6:
            r5 = 64
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x0226 }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x0226 }
            if (r1 == 0) goto L_0x0207
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0226 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0226 }
            throw r0     // Catch:{ auda -> 0x0226 }
        L_0x0207:
            throw r0     // Catch:{ auda -> 0x0226 }
        L_0x0208:
            r0 = move-exception
            r20 = r5
        L_0x020b:
            r5 = 64
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x0226 }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x0226 }
            if (r1 != 0) goto L_0x021f
            auda r1 = new auda     // Catch:{ auda -> 0x0226 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0226 }
            r1.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0226 }
            throw r1     // Catch:{ auda -> 0x0226 }
        L_0x021f:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0226 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0226 }
            throw r0     // Catch:{ auda -> 0x0226 }
        L_0x0226:
            r0 = move-exception
            goto L_0x022d
        L_0x0228:
            r0 = move-exception
            r20 = r5
            r5 = 64
        L_0x022d:
            throw r0     // Catch:{ auda -> 0x022e }
        L_0x022e:
            r0 = move-exception
            goto L_0x0235
        L_0x0230:
            r0 = move-exception
            r20 = r5
        L_0x0233:
            r5 = 64
        L_0x0235:
            java.lang.String r0 = "Failed to parse schemaOrgAction proto."
            defpackage.oso.b(r0)
        L_0x023a:
            int r9 = r9 + 1
            r1 = r22
            r2 = r24
            r4 = r17
            r5 = r20
            goto L_0x00a5
        L_0x0246:
            r17 = r4
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r12, r13)
            r1 = r18
            if (r1 != 0) goto L_0x0257
            java.lang.String r1 = r14.e
            r0.setPackage(r1)
            goto L_0x025c
        L_0x0257:
            java.lang.String r2 = r14.e
            r0.setClassName(r2, r1)
        L_0x025c:
            r1 = r19
            if (r1 == 0) goto L_0x026d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "intent_extra_data_key"
            r2.putString(r4, r1)
            r0.putExtras(r2)
        L_0x026d:
            android.net.Uri r0 = defpackage.dvc.a((android.content.Intent) r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x027a
            goto L_0x0280
        L_0x027a:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x0280:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            r0.getClass()
            int r2 = r1.a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.a = r2
            r1.j = r0
            java.lang.String r0 = r15.c
            r0.getClass()
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.a = r2
            r1.l = r0
            java.lang.String r0 = r14.q
            r0.getClass()
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r1.a = r2
            r1.m = r0
            int r0 = r8.e
            ovg r0 = defpackage.ovg.a(r0)
            if (r0 == 0) goto L_0x02ae
            goto L_0x02b0
        L_0x02ae:
            ovg r0 = defpackage.ovg.GENERAL_USE
        L_0x02b0:
            int r0 = r0.g
            int r0 = defpackage.pqj.a(r0)
            if (r0 != 0) goto L_0x02b9
            goto L_0x02d2
        L_0x02b9:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x02be
            goto L_0x02c4
        L_0x02be:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x02c4:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            int r0 = r0 + -1
            r1.f = r0
            int r0 = r1.a
            r0 = r0 | 32
            r1.a = r0
        L_0x02d2:
            int r0 = r8.h
            otk r0 = defpackage.otk.a(r0)
            if (r0 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            otk r0 = defpackage.otk.UNKNOWN
        L_0x02dd:
            int r0 = r0.d
            int r0 = defpackage.pql.a(r0)
            if (r0 != 0) goto L_0x02e6
            goto L_0x0300
        L_0x02e6:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x02eb
            goto L_0x02f1
        L_0x02eb:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x02f1:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            int r0 = r0 + -1
            r1.p = r0
            int r0 = r1.a
            r2 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r2
            r1.a = r0
        L_0x0300:
            int r0 = r8.f
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x0307
            goto L_0x030d
        L_0x0307:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x030d:
            aucj r1 = r11.b
            pqm r1 = (defpackage.pqm) r1
            int r2 = r1.a
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r4
            r1.a = r2
            r1.o = r0
            aucj r0 = r11.i()
            pqm r0 = (defpackage.pqm) r0
            r1 = 5
            java.lang.Object r1 = r0.c(r1)
            aucd r1 = (defpackage.aucd) r1
            r1.a((defpackage.aucj) r0)
            java.lang.String r0 = "object"
            baza r0 = defpackage.dtv.a(r0, r7)
            if (r0 != 0) goto L_0x0335
            r5 = 0
            goto L_0x0394
        L_0x0335:
            bazd r0 = r0.c
            if (r0 == 0) goto L_0x033a
            goto L_0x033c
        L_0x033a:
            bazd r0 = defpackage.bazd.g
        L_0x033c:
            bazc r0 = r0.f
            if (r0 == 0) goto L_0x0341
            goto L_0x0343
        L_0x0341:
            bazc r0 = defpackage.bazc.d
        L_0x0343:
            aucx r0 = r0.c
            int r2 = r0.size()
            r4 = 0
        L_0x034a:
            if (r4 >= r2) goto L_0x0393
            java.lang.Object r5 = r0.get(r4)
            baza r5 = (defpackage.baza) r5
            int r7 = r5.a
            r8 = r7 & 1
            if (r8 != 0) goto L_0x035a
            r5 = 0
            goto L_0x0390
        L_0x035a:
            r7 = r7 & 2
            if (r7 == 0) goto L_0x038f
            java.lang.String r7 = r5.b
            java.lang.String r8 = "description"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x038d
            bazd r0 = r5.c
            if (r0 == 0) goto L_0x036d
            goto L_0x036f
        L_0x036d:
            bazd r0 = defpackage.bazd.g
        L_0x036f:
            java.lang.String r0 = r0.c
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0377
            r5 = 0
            goto L_0x037d
        L_0x0377:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x037d:
            aucj r2 = r1.b
            pqm r2 = (defpackage.pqm) r2
            r0.getClass()
            int r4 = r2.a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r2.a = r4
            r2.i = r0
            goto L_0x0394
        L_0x038d:
            r5 = 0
            goto L_0x0390
        L_0x038f:
            r5 = 0
        L_0x0390:
            int r4 = r4 + 1
            goto L_0x034a
        L_0x0393:
            r5 = 0
        L_0x0394:
            aucj r0 = r1.i()
            pqm r0 = (defpackage.pqm) r0
            r3.add(r0)
            goto L_0x03a0
        L_0x039e:
            r17 = r4
        L_0x03a0:
            int r6 = r6 + 1
            r1 = r22
            r2 = r24
            r4 = r17
            goto L_0x000c
        L_0x03aa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwp.a(android.content.Context, java.lang.String, java.util.List, com.google.android.gms.appdatasearch.UsageInfo[]):java.util.List");
    }

    public static void a(Context context, String str, UsageInfo[] usageInfoArr, String str2) {
        Intent intent;
        String str3 = str2;
        if (Log.isLoggable(str3, 3)) {
            List a2 = a(context, str, (List) null, usageInfoArr);
            int size = a2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                pqm pqm = (pqm) a2.get(i2);
                Log.d(str3, "Action:");
                int i3 = 1;
                if (str3.equals("AppIndexApi")) {
                    Object[] objArr = new Object[2];
                    objArr[i] = pqm.c;
                    objArr[1] = Long.valueOf(pqm.b);
                    Log.d(str3, String.format("  pkg: %s    ts: %d", objArr));
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = pqm.h;
                    Log.d(str3, String.format("  title: [%s]", objArr2));
                    Object[] objArr3 = new Object[1];
                    objArr3[i] = pqm.i;
                    Log.d(str3, String.format("  description: [%s]", objArr3));
                    Object[] objArr4 = new Object[1];
                    objArr4[i] = pqm.j;
                    Log.d(str3, String.format("  appUri: %s", objArr4));
                    Object[] objArr5 = new Object[1];
                    objArr5[i] = pqm.k;
                    Log.d(str3, String.format("  webUrl: %s", objArr5));
                    Object[] objArr6 = new Object[1];
                    objArr6[i] = pqm.g;
                    Log.d(str3, String.format("  actionType: %s", objArr6));
                    Object[] objArr7 = new Object[1];
                    int a3 = pql.a(pqm.p);
                    if (a3 != 0) {
                        i3 = a3;
                    }
                    objArr7[i] = a(i3);
                    Log.d(str3, String.format("  eventStatus: %s", objArr7));
                } else if (str3.equals("FirebaseUserActions")) {
                    try {
                        Object[] objArr8 = new Object[1];
                        objArr8[i] = pqm.g.substring(18);
                        Log.d(str3, String.format("  type: %s", objArr8));
                        Object[] objArr9 = new Object[1];
                        objArr9[i] = pqm.h;
                        Log.d(str3, String.format("  name: [%s]", objArr9));
                        String str4 = pqm.c;
                        Uri parse = Uri.parse(pqm.j);
                        if (dvc.a(parse)) {
                            if (parse.getHost().isEmpty()) {
                                String valueOf = String.valueOf(parse);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 98);
                                sb.append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else if (dvc.b(parse)) {
                            if (str4 != null) {
                                if (!str4.equals(parse.getHost())) {
                                    String valueOf2 = String.valueOf(parse);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 150);
                                    sb2.append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ");
                                    sb2.append(valueOf2);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                            }
                            List<String> pathSegments = parse.getPathSegments();
                            if (pathSegments.isEmpty() || pathSegments.get(i).isEmpty()) {
                                String valueOf3 = String.valueOf(parse);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 128);
                                sb3.append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ");
                                sb3.append(valueOf3);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        } else {
                            String valueOf4 = String.valueOf(parse);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 176);
                            sb4.append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ");
                            sb4.append(valueOf4);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        if (dvc.a(parse)) {
                            intent = new Intent("android.intent.action.VIEW", parse);
                        } else if (dvc.b(parse)) {
                            List<String> pathSegments2 = parse.getPathSegments();
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme(pathSegments2.get(i));
                            if (pathSegments2.size() <= 1) {
                                String str5 = dvc.a;
                                String valueOf5 = String.valueOf(parse);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 88);
                                sb5.append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ");
                                sb5.append(valueOf5);
                                Log.e(str5, sb5.toString());
                            } else {
                                builder.authority(pathSegments2.get(1));
                                for (int i4 = 2; i4 < pathSegments2.size(); i4++) {
                                    builder.appendPath(pathSegments2.get(i4));
                                }
                            }
                            builder.encodedQuery(parse.getEncodedQuery());
                            builder.encodedFragment(parse.getEncodedFragment());
                            intent = new Intent("android.intent.action.VIEW", builder.build());
                        } else {
                            String valueOf6 = String.valueOf(parse);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 70);
                            sb6.append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ");
                            sb6.append(valueOf6);
                            throw new RuntimeException(sb6.toString());
                        }
                        Log.d(str3, String.format("  url: %s", new Object[]{intent.getData()}));
                        if (!pqm.k.isEmpty()) {
                            Log.d(str3, String.format("  webUrl: %s", new Object[]{pqm.k}));
                        }
                        Log.d(str3, String.format("  pkg: %s", new Object[]{pqm.c}));
                        Object[] objArr10 = new Object[1];
                        int a4 = pql.a(pqm.p);
                        if (a4 != 0) {
                            i3 = a4;
                        }
                        try {
                            objArr10[0] = a(i3);
                            Log.d(str3, String.format("  eventStatus: %s", objArr10));
                        } catch (RuntimeException e) {
                            e = e;
                            oso.a((Throwable) e, "Exception in debug logging of the action.");
                            i2++;
                            i = 0;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        oso.a((Throwable) e, "Exception in debug logging of the action.");
                        i2++;
                        i = 0;
                    }
                } else {
                    oso.b("Unknown logging tag for the action.");
                }
                i2++;
                i = 0;
            }
        }
    }
}
