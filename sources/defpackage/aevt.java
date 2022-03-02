package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aevt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aevt {
    public static auli a(Account account, aukh aukh, aumr aumr, afeb afeb, boolean z, aeri aeri) {
        auln auln;
        aucd o = auli.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auli auli = (auli) o.b;
        aukh.getClass();
        auli.b = aukh;
        int i = auli.a | 1;
        auli.a = i;
        aumr.getClass();
        auli.d = aumr;
        auli.a = i | 4;
        if (z) {
            aucd o2 = aulh.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aulh aulh = (aulh) o2.b;
            aulh.a |= 1;
            aulh.b = true;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auli auli2 = (auli) o.b;
            aulh aulh2 = (aulh) o2.i();
            aulh2.getClass();
            auli2.e = aulh2;
            auli2.a |= 8;
        }
        if (aeri.G()) {
            aucd o3 = aukm.c.o();
            ArrayList arrayList = new ArrayList();
            for (afdx e : afeb.a(account, aukh)) {
                aukf e2 = e.e();
                if (e2 != null && e2.a == 1) {
                    aucd o4 = aulz.b.o();
                    if (e2.a != 1) {
                        auln = auln.b;
                    } else {
                        auln = (auln) e2.b;
                    }
                    aucx aucx = auln.a;
                    int size = aucx.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aumi aumi = (aumi) aucx.get(i2);
                        aucd o5 = aumb.d.o();
                        int a = aumh.a(aumi.c);
                        if (a == 0) {
                            a = 1;
                        }
                        int i3 = a - 1;
                        if (i3 == 0) {
                            if (o5.c) {
                                o5.c();
                                o5.c = false;
                            }
                            aumb aumb = (aumb) o5.b;
                            aumb.c = 0;
                            aumb.a |= 2;
                        } else if (i3 != 1) {
                            if (o5.c) {
                                o5.c();
                                o5.c = false;
                            }
                            aumb aumb2 = (aumb) o5.b;
                            aumb2.c = 2;
                            aumb2.a |= 2;
                        } else {
                            if (o5.c) {
                                o5.c();
                                o5.c = false;
                            }
                            aumb aumb3 = (aumb) o5.b;
                            aumb3.c = 1;
                            aumb3.a |= 2;
                        }
                        if ((aumi.a & 1) != 0) {
                            auay auay = aumi.b;
                            aumb aumb4 = (aumb) o5.b;
                            auay.getClass();
                            aumb4.a |= 1;
                            aumb4.b = auay;
                        }
                        aumb aumb5 = (aumb) o5.i();
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        aulz aulz = (aulz) o4.b;
                        aumb5.getClass();
                        aulz.c();
                        aulz.a.add(aumb5);
                    }
                    arrayList.add((aulz) o4.i());
                }
            }
            aucd o6 = aulo.b.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aulo aulo = (aulo) o6.b;
            if (!aulo.a.a()) {
                aulo.a = aucj.a(aulo.a);
            }
            auab.a((Iterable) arrayList, (List) aulo.a);
            aulo aulo2 = (aulo) o6.i();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aukm aukm = (aukm) o3.b;
            aulo2.getClass();
            aukm.b = aulo2;
            aukm.a = 3;
            aukm aukm2 = (aukm) o3.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auli auli3 = (auli) o.b;
            aukm2.getClass();
            auli3.c = aukm2;
            auli3.a |= 2;
        }
        return (auli) o.i();
    }

    private static void a(aevc aevc, afdp afdp, aukq aukq) {
        aevc.a(afdp, aevc.a(aukq.c), aukq.d, aukq.b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: aukq} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cf, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        if (r0.a != 2) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d6, code lost:
        r0 = (defpackage.aukv) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02db, code lost:
        r0 = defpackage.aukv.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02dd, code lost:
        ((defpackage.pia) r26.a()).a("Downloaded %d changes to the local %s/%s InternalFootprintsLatestOnlySyncVariant.", java.lang.Integer.valueOf(r23.size()), java.lang.Integer.valueOf(r0.b), java.lang.Integer.valueOf(r0.c));
        r2 = r33;
        r2.b((long) r1.a.size());
        r2.a(r21, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0319, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0324, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0298, code lost:
        r23 = r13;
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r3 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a1, code lost:
        if (r3 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r3 = defpackage.aumr.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r2.a(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ba, code lost:
        r24 = r8;
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r29.a(r10, defpackage.aeta.b, r30.longValue(), r32.intValue(), r31.longValue(), r1.d);
        r15.b();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.awdn r26, defpackage.aukh r27, defpackage.aull r28, defpackage.aevc r29, java.lang.Long r30, java.lang.Long r31, java.lang.Integer r32, defpackage.afgr r33) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r12 = r33
            aucx r13 = r1.a
            int r3 = r1.U
            r4 = -1
            if (r3 != r4) goto L_0x001b
            aueh r3 = defpackage.aueh.a
            aueq r3 = r3.a((java.lang.Object) r1)
            int r3 = r3.b(r1)
            r1.U = r3
        L_0x001b:
            long r14 = (long) r3
            afcv r3 = r29.c()
            afdp r10 = r3.b()
            afcw r3 = r29.b()     // Catch:{ all -> 0x0326 }
            boolean r3 = r3.a(r10)     // Catch:{ all -> 0x0326 }
            if (r3 == 0) goto L_0x031a
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x0326 }
            r8 = r14
        L_0x0033:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0326 }
            r7 = 2
            r6 = 1
            if (r5 == 0) goto L_0x0298
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0293 }
            aukc r5 = (defpackage.aukc) r5     // Catch:{ all -> 0x0293 }
            int r11 = r5.d     // Catch:{ all -> 0x0293 }
            int r11 = defpackage.aukb.a(r11)     // Catch:{ all -> 0x0293 }
            if (r11 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r11 = 1
        L_0x004b:
            int r11 = r11 + r4
            if (r11 == r6) goto L_0x027a
            r4 = 4
            if (r11 == r7) goto L_0x0262
            r7 = 3
            if (r11 == r7) goto L_0x023d
            r7 = 5
            if (r11 == r4) goto L_0x00c7
            if (r11 == r7) goto L_0x00a2
            afer r1 = new afer     // Catch:{ all -> 0x0293 }
            int r2 = r5.d     // Catch:{ all -> 0x0293 }
            int r2 = defpackage.aukb.a(r2)     // Catch:{ all -> 0x0293 }
            if (r2 == 0) goto L_0x0065
            r6 = r2
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            java.lang.String r2 = defpackage.aukb.b(r6)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0293 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0293 }
            int r3 = r3.length()     // Catch:{ all -> 0x0293 }
            int r3 = r3 + 47
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0293 }
            int r4 = r4.length()     // Catch:{ all -> 0x0293 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r4.<init>(r3)     // Catch:{ all -> 0x0293 }
            java.lang.String r3 = "Got unknown change type "
            r4.append(r3)     // Catch:{ all -> 0x0293 }
            r4.append(r2)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = " while syncing channel "
            r4.append(r2)     // Catch:{ all -> 0x0293 }
            r4.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0293 }
            r1.<init>(r0)     // Catch:{ all -> 0x0293 }
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x00a2:
            afer r1 = new afer     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0293 }
            int r2 = r2.length()     // Catch:{ all -> 0x0293 }
            int r2 = r2 + 59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r3.<init>(r2)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = "Unsupported change type DELETE_RANGE while syncing channel "
            r3.append(r2)     // Catch:{ all -> 0x0293 }
            r3.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0293 }
            r1.<init>(r0)     // Catch:{ all -> 0x0293 }
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x00c7:
            int r11 = r5.b     // Catch:{ all -> 0x0293 }
            r7 = 6
            if (r11 != r7) goto L_0x01f6
            java.lang.Object r11 = r5.c     // Catch:{ all -> 0x0293 }
            aukr r11 = (defpackage.aukr) r11     // Catch:{ all -> 0x0293 }
            auay r7 = r11.d     // Catch:{ all -> 0x0293 }
            aesz r4 = defpackage.aeta.b()     // Catch:{ all -> 0x0293 }
            byte[] r6 = r7.k()     // Catch:{ all -> 0x0293 }
            r20 = r3
            r3 = 1
            r4.a(r6, r3)     // Catch:{ all -> 0x0293 }
            aeta r3 = r4.a()     // Catch:{ all -> 0x0293 }
            r4 = 0
            java.util.List r3 = r2.a(r10, r3, r4)     // Catch:{ all -> 0x0293 }
            int r4 = r3.size()     // Catch:{ all -> 0x0293 }
            r6 = 1
            if (r4 != r6) goto L_0x01de
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0293 }
            aetb r3 = (defpackage.aetb) r3     // Catch:{ all -> 0x0293 }
            byte[] r3 = r3.a()     // Catch:{ all -> 0x0293 }
            auay r4 = r11.e     // Catch:{ all -> 0x0293 }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x0293 }
            byte[] r4 = com.google.android.gms.libs.vcdiff.VcDiffEncoderDecoder.a(r3, r4)     // Catch:{ rbp -> 0x01a8 }
            aukq r6 = defpackage.aukq.f     // Catch:{ all -> 0x0293 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0293 }
            auay r7 = r11.d     // Catch:{ all -> 0x0293 }
            r21 = r14
            boolean r14 = r6.c     // Catch:{ all -> 0x0293 }
            if (r14 != 0) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            r6.c()     // Catch:{ all -> 0x0293 }
            r14 = 0
            r6.c = r14     // Catch:{ all -> 0x0293 }
        L_0x011a:
            aucj r14 = r6.b     // Catch:{ all -> 0x0293 }
            aukq r14 = (defpackage.aukq) r14     // Catch:{ all -> 0x0293 }
            r7.getClass()     // Catch:{ all -> 0x0293 }
            int r15 = r14.a     // Catch:{ all -> 0x0293 }
            r18 = 2
            r15 = r15 | 2
            r14.a = r15     // Catch:{ all -> 0x0293 }
            r14.c = r7     // Catch:{ all -> 0x0293 }
            r23 = r13
            long r12 = r11.c     // Catch:{ all -> 0x0293 }
            r7 = r15 | 1
            r14.a = r7     // Catch:{ all -> 0x0293 }
            r14.b = r12     // Catch:{ all -> 0x0293 }
            auay r4 = defpackage.auay.a((byte[]) r4)     // Catch:{ all -> 0x0293 }
            boolean r7 = r6.c     // Catch:{ all -> 0x0293 }
            if (r7 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r6.c()     // Catch:{ all -> 0x0293 }
            r7 = 0
            r6.c = r7     // Catch:{ all -> 0x0293 }
        L_0x0144:
            aucj r7 = r6.b     // Catch:{ all -> 0x0293 }
            aukq r7 = (defpackage.aukq) r7     // Catch:{ all -> 0x0293 }
            r4.getClass()     // Catch:{ all -> 0x0293 }
            int r12 = r7.a     // Catch:{ all -> 0x0293 }
            r13 = 4
            r12 = r12 | r13
            r7.a = r12     // Catch:{ all -> 0x0293 }
            r7.d = r4     // Catch:{ all -> 0x0293 }
            aucj r4 = r6.i()     // Catch:{ all -> 0x0293 }
            aukq r4 = (defpackage.aukq) r4     // Catch:{ all -> 0x0293 }
            auay r6 = defpackage.aeuz.a((defpackage.aukq) r4)     // Catch:{ all -> 0x0293 }
            auay r7 = r11.f     // Catch:{ all -> 0x0293 }
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x0293 }
            if (r7 == 0) goto L_0x0168
            r12 = 3
            goto L_0x0208
        L_0x0168:
            java.lang.Object r0 = r26.a()     // Catch:{ all -> 0x0293 }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x0293 }
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0293 }
            auay r1 = r4.c     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r1)     // Catch:{ all -> 0x0293 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0293 }
            auay r1 = r4.d     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r1)     // Catch:{ all -> 0x0293 }
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0293 }
            auay r1 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r1)     // Catch:{ all -> 0x0293 }
            r2 = 2
            r0[r2] = r1     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r6)     // Catch:{ all -> 0x0293 }
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x0293 }
            auay r1 = r11.f     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r1)     // Catch:{ all -> 0x0293 }
            r2 = 4
            r0[r2] = r1     // Catch:{ all -> 0x0293 }
            afen r0 = new afen     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = "Footprint checksum after applying delta differs from expected delta!"
            r0.<init>(r1)     // Catch:{ all -> 0x0293 }
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x01a6:
            r0 = move-exception
            goto L_0x01b0
        L_0x01a8:
            r0 = move-exception
            r1 = r0
            aetm r0 = new aetm     // Catch:{ aetm -> 0x01a6 }
            r0.<init>(r1)     // Catch:{ aetm -> 0x01a6 }
            throw r0     // Catch:{ aetm -> 0x01a6 }
        L_0x01b0:
            java.lang.Object r1 = r26.a()     // Catch:{ all -> 0x0293 }
            pia r1 = (defpackage.pia) r1     // Catch:{ all -> 0x0293 }
            r12 = 3
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ all -> 0x0293 }
            auay r2 = r11.d     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = defpackage.aeuz.a((defpackage.auay) r2)     // Catch:{ all -> 0x0293 }
            r4 = 0
            r1[r4] = r2     // Catch:{ all -> 0x0293 }
            auay r2 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = defpackage.aeuz.a((defpackage.auay) r2)     // Catch:{ all -> 0x0293 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0293 }
            auay r2 = r11.e     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = defpackage.aeuz.a((defpackage.auay) r2)     // Catch:{ all -> 0x0293 }
            r7 = 2
            r1[r7] = r2     // Catch:{ all -> 0x0293 }
            afen r1 = new afen     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = "Decoding failed when trying to apply delta on footprint!"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0293 }
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x01de:
            java.lang.Object r0 = r26.a()     // Catch:{ all -> 0x0293 }
            pia r0 = (defpackage.pia) r0     // Catch:{ all -> 0x0293 }
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = defpackage.aeuz.a((defpackage.auay) r7)     // Catch:{ all -> 0x0293 }
            r6 = 0
            r0[r6] = r1     // Catch:{ all -> 0x0293 }
            afen r0 = new afen     // Catch:{ all -> 0x0293 }
            java.lang.String r1 = "Delta target footprint not found!"
            r0.<init>(r1)     // Catch:{ all -> 0x0293 }
            throw r0     // Catch:{ all -> 0x0293 }
        L_0x01f6:
            r20 = r3
            r23 = r13
            r21 = r14
            r12 = 3
            r3 = 4
            if (r11 != r3) goto L_0x0206
            java.lang.Object r3 = r5.c     // Catch:{ all -> 0x0293 }
            r4 = r3
            aukq r4 = (defpackage.aukq) r4     // Catch:{ all -> 0x0293 }
            goto L_0x0208
        L_0x0206:
            aukq r4 = defpackage.aukq.f     // Catch:{ all -> 0x0293 }
        L_0x0208:
            a(r2, r10, r4)     // Catch:{ all -> 0x0293 }
            int r3 = r5.b     // Catch:{ all -> 0x0293 }
            r6 = 6
            if (r3 != r6) goto L_0x023b
            java.lang.Object r3 = r5.c     // Catch:{ all -> 0x0293 }
            aukr r3 = (defpackage.aukr) r3     // Catch:{ all -> 0x0293 }
            int r5 = r3.U     // Catch:{ all -> 0x0293 }
            r6 = -1
            if (r5 != r6) goto L_0x0225
            aueh r5 = defpackage.aueh.a     // Catch:{ all -> 0x0293 }
            aueq r5 = r5.a((java.lang.Object) r3)     // Catch:{ all -> 0x0293 }
            int r5 = r5.b(r3)     // Catch:{ all -> 0x0293 }
            r3.U = r5     // Catch:{ all -> 0x0293 }
        L_0x0225:
            long r5 = (long) r5     // Catch:{ all -> 0x0293 }
            long r8 = r8 - r5
            int r3 = r4.U     // Catch:{ all -> 0x0293 }
            r6 = -1
            if (r3 != r6) goto L_0x0238
            aueh r3 = defpackage.aueh.a     // Catch:{ all -> 0x0293 }
            aueq r3 = r3.a((java.lang.Object) r4)     // Catch:{ all -> 0x0293 }
            int r3 = r3.b(r4)     // Catch:{ all -> 0x0293 }
            r4.U = r3     // Catch:{ all -> 0x0293 }
        L_0x0238:
            long r3 = (long) r3     // Catch:{ all -> 0x0293 }
            long r8 = r8 + r3
            goto L_0x0288
        L_0x023b:
            r6 = -1
            goto L_0x0288
        L_0x023d:
            afer r1 = new afer     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0293 }
            int r2 = r2.length()     // Catch:{ all -> 0x0293 }
            int r2 = r2 + 53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0293 }
            r3.<init>(r2)     // Catch:{ all -> 0x0293 }
            java.lang.String r2 = "Unsupported change type DELETE while syncing channel "
            r3.append(r2)     // Catch:{ all -> 0x0293 }
            r3.append(r0)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0293 }
            r1.<init>(r0)     // Catch:{ all -> 0x0293 }
            throw r1     // Catch:{ all -> 0x0293 }
        L_0x0262:
            r20 = r3
            r23 = r13
            r21 = r14
            r6 = -1
            r12 = 3
            int r3 = r5.b     // Catch:{ all -> 0x0293 }
            r4 = 4
            if (r3 != r4) goto L_0x0274
            java.lang.Object r3 = r5.c     // Catch:{ all -> 0x0293 }
            aukq r3 = (defpackage.aukq) r3     // Catch:{ all -> 0x0293 }
            goto L_0x0276
        L_0x0274:
            aukq r3 = defpackage.aukq.f     // Catch:{ all -> 0x0293 }
        L_0x0276:
            a(r2, r10, r3)     // Catch:{ all -> 0x0293 }
            goto L_0x0288
        L_0x027a:
            r20 = r3
            r23 = r13
            r21 = r14
            r6 = -1
            r12 = 3
            r2.a((defpackage.afdp) r10)     // Catch:{ all -> 0x0293 }
            r33.c()     // Catch:{ all -> 0x0293 }
        L_0x0288:
            r12 = r33
            r3 = r20
            r14 = r21
            r13 = r23
            r4 = -1
            goto L_0x0033
        L_0x0293:
            r0 = move-exception
            r1 = r0
            r15 = r10
            goto L_0x0329
        L_0x0298:
            r23 = r13
            r21 = r14
            r5 = 1
            r6 = 0
            r12 = 3
            aumr r3 = r1.b     // Catch:{ all -> 0x0326 }
            if (r3 != 0) goto L_0x02a5
            aumr r3 = defpackage.aumr.c     // Catch:{ all -> 0x0293 }
        L_0x02a5:
            r2.a(r10, r3)     // Catch:{ all -> 0x0326 }
            aeta r4 = defpackage.aeta.b     // Catch:{ all -> 0x0326 }
            long r13 = r30.longValue()     // Catch:{ all -> 0x0326 }
            int r11 = r32.intValue()     // Catch:{ all -> 0x0326 }
            long r15 = r31.longValue()     // Catch:{ all -> 0x0326 }
            r17 = r13
            long r12 = r1.d     // Catch:{ all -> 0x0326 }
            r2 = r29
            r3 = r10
            r14 = 0
            r19 = 1
            r5 = r17
            r14 = 2
            r7 = r11
            r24 = r8
            r8 = r15
            r15 = r10
            r10 = r12
            r2.a(r3, r4, r5, r7, r8, r10)     // Catch:{ all -> 0x0324 }
            r15.b()     // Catch:{ all -> 0x0324 }
            r15.close()
            int r2 = r0.a
            if (r2 != r14) goto L_0x02db
            java.lang.Object r0 = r0.b
            aukv r0 = (defpackage.aukv) r0
            goto L_0x02dd
        L_0x02db:
            aukv r0 = defpackage.aukv.e
        L_0x02dd:
            java.lang.Object r2 = r26.a()
            pia r2 = (defpackage.pia) r2
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r23.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r19] = r4
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r14] = r0
            java.lang.String r0 = "Downloaded %d changes to the local %s/%s InternalFootprintsLatestOnlySyncVariant."
            r2.a(r0, r3)
            aucx r0 = r1.a
            int r0 = r0.size()
            long r0 = (long) r0
            r2 = r33
            r2.b(r0)
            r0 = r21
            r8 = r24
            r2.a(r0, r8)
            return
        L_0x031a:
            r15 = r10
            r3 = 3
            affu r0 = new affu     // Catch:{ all -> 0x0324 }
            java.lang.String r1 = "GetChanges aborted due to pending local changes"
            r0.<init>((java.lang.String) r1, (int) r3)     // Catch:{ all -> 0x0324 }
            throw r0     // Catch:{ all -> 0x0324 }
        L_0x0324:
            r0 = move-exception
            goto L_0x0328
        L_0x0326:
            r0 = move-exception
            r15 = r10
        L_0x0328:
            r1 = r0
        L_0x0329:
            r15.close()     // Catch:{ all -> 0x032d }
            goto L_0x0332
        L_0x032d:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0332:
            goto L_0x0334
        L_0x0333:
            throw r1
        L_0x0334:
            goto L_0x0333
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevt.a(awdn, aukh, aull, aevc, java.lang.Long, java.lang.Long, java.lang.Integer, afgr):void");
    }
}
