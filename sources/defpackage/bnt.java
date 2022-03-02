package defpackage;

import android.util.SparseArray;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: bnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bnt {
    public static final Comparator n = bnq.a;
    static final Comparator o = bnr.a;
    public final String a;
    public bpw b;
    public final List c = new ArrayList();
    public final Map d = qug.a();
    public bpw e;
    public BitSet f;
    public ArrayList g;
    public final List h = new ArrayList();
    public final Map i = qug.a();
    public final Map j = qug.a();
    public bpw k = bpw.a((Comparator) anfh.a);
    public final SparseArray l = new SparseArray();
    public boolean m = false;
    public aucd p;

    protected bnt(String str) {
        this.a = str;
    }

    public static final List a(List list, List list2, SortedMap sortedMap) {
        brm brm;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (brp brp : Collections.unmodifiableSet(((bom) it.next()).g)) {
                aucd o2 = brm.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                brm brm2 = (brm) o2.b;
                int i2 = brm2.a | 2;
                brm2.a = i2;
                brm2.c = Integer.MAX_VALUE;
                String str = brp.b;
                str.getClass();
                brm2.a = i2 | 1;
                brm2.b = str;
                int binarySearch = Collections.binarySearch(list2, (brm) o2.i(), o);
                if (binarySearch < 0) {
                    binarySearch = -(binarySearch + 1);
                }
                Object obj = list2.get(binarySearch);
                while (true) {
                    brm = (brm) obj;
                    int i3 = brp.d;
                    int i4 = brm.c;
                    if (i3 >= i4 && brp.c <= i4) {
                        break;
                    }
                    binarySearch++;
                    obj = list2.get(binarySearch);
                }
                amtf.a(brp.b.equals(brm.b));
                amtf.a((Object) (bom) sortedMap.get(brm));
                arrayList.add(brm);
            }
        }
        return arrayList;
    }

    private final int b(bnm bnm) {
        int a2 = this.e.a((Object) bnm);
        boolean z = false;
        if (a2 >= 0 && a2 < this.e.size()) {
            z = true;
        }
        amtf.a(z);
        return a2;
    }

    private static String c(bom bom) {
        StringBuilder sb = new StringBuilder();
        for (brp brp : bom.b()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(bom.a);
            sb.append("(");
            sb.append(brp.c);
            sb.append(":");
            sb.append(brp.d);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x03a7 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0447 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04f3 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0850 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0102 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018f A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b8 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b9 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ea A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0260 A[Catch:{ brs -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0307 A[SYNTHETIC, Splitter:B:92:0x0307] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.bom r15) {
        /*
            r14 = this;
            int r0 = r15.f
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == r2) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            defpackage.amtf.a((boolean) r0)
            int r0 = r14.a((defpackage.bom) r15)
            java.util.ArrayList r4 = r14.g
            java.lang.Object r4 = r4.get(r0)
            bnm r4 = (defpackage.bnm) r4
            r5 = 5
            java.lang.Object r6 = r4.c(r5)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r4)
            bnn r4 = defpackage.bnn.e
            aucd r4 = r4.o()
            java.lang.String r7 = r15.a
            boolean r8 = r4.c
            if (r8 == 0) goto L_0x0034
            r4.c()
            r4.c = r3
        L_0x0034:
            aucj r8 = r4.b
            bnn r8 = (defpackage.bnn) r8
            r7.getClass()
            int r9 = r8.a
            r9 = r9 | r1
            r8.a = r9
            r8.b = r7
            r7 = 2
            r9 = r9 | r7
            r8.a = r9
            r8.c = r0
            int r10 = r15.b
            r9 = r9 | 4
            r8.a = r9
            r8.d = r10
            aucj r4 = r4.i()
            bnn r4 = (defpackage.bnn) r4
            java.util.List r8 = r14.c
            r8.add(r4)
            aucj r4 = r6.b     // Catch:{ brs -> 0x0858 }
            bnm r4 = (defpackage.bnm) r4     // Catch:{ brs -> 0x0858 }
            int r4 = r4.b     // Catch:{ brs -> 0x0858 }
            int r4 = defpackage.bnj.a(r4)     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            if (r4 != r7) goto L_0x006c
            goto L_0x00e9
        L_0x006c:
            aucj r4 = r6.b     // Catch:{ brs -> 0x0858 }
            bnm r4 = (defpackage.bnm) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.e     // Catch:{ brs -> 0x0858 }
            boolean r4 = r4.isEmpty()     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x00ca
            brl r4 = r15.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.e     // Catch:{ brs -> 0x0858 }
            aucj r7 = r6.b     // Catch:{ brs -> 0x0858 }
            bnm r7 = (defpackage.bnm) r7     // Catch:{ brs -> 0x0858 }
            java.lang.String r7 = r7.e     // Catch:{ brs -> 0x0858 }
            boolean r4 = r4.equals(r7)     // Catch:{ brs -> 0x0858 }
            if (r4 == 0) goto L_0x0089
            goto L_0x00ca
        L_0x0089:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            aucj r1 = r6.b     // Catch:{ brs -> 0x0858 }
            bnm r1 = (defpackage.bnm) r1     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r1.e     // Catch:{ brs -> 0x0858 }
            brl r2 = r15.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r2.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r4 = r4.length()     // Catch:{ brs -> 0x0858 }
            int r4 = r4 + 59
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            int r4 = r4 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            r6.<init>(r4)     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = "modules in the same APK require different module APIs ("
            r6.append(r4)     // Catch:{ brs -> 0x0858 }
            r6.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = " & "
            r6.append(r1)     // Catch:{ brs -> 0x0858 }
            r6.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r6.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x00ca:
            brl r4 = r15.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.e     // Catch:{ brs -> 0x0858 }
            boolean r7 = r6.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r6.c()     // Catch:{ brs -> 0x0858 }
            r6.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x00d8:
            aucj r7 = r6.b     // Catch:{ brs -> 0x0858 }
            bnm r7 = (defpackage.bnm) r7     // Catch:{ brs -> 0x0858 }
            bnm r8 = defpackage.bnm.r     // Catch:{ brs -> 0x0858 }
            r4.getClass()     // Catch:{ brs -> 0x0858 }
            int r8 = r7.a     // Catch:{ brs -> 0x0858 }
            r8 = r8 | 8
            r7.a = r8     // Catch:{ brs -> 0x0858 }
            r7.e = r4     // Catch:{ brs -> 0x0858 }
        L_0x00e9:
            java.util.ArrayList r4 = r14.g     // Catch:{ brs -> 0x0858 }
            aucj r6 = r6.i()     // Catch:{ brs -> 0x0858 }
            bnm r6 = (defpackage.bnm) r6     // Catch:{ brs -> 0x0858 }
            r4.set(r0, r6)     // Catch:{ brs -> 0x0858 }
            aucd r0 = r14.p     // Catch:{ brs -> 0x0858 }
            brl r4 = r15.c()     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = r4.e     // Catch:{ brs -> 0x0858 }
            boolean r6 = r6.isEmpty()     // Catch:{ brs -> 0x0858 }
            if (r6 == 0) goto L_0x0104
            goto L_0x017b
        L_0x0104:
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = r6.e     // Catch:{ brs -> 0x0858 }
            boolean r6 = r6.isEmpty()     // Catch:{ brs -> 0x0858 }
            if (r6 != 0) goto L_0x015e
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = r6.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r7 = r4.e     // Catch:{ brs -> 0x0858 }
            boolean r6 = r6.equals(r7)     // Catch:{ brs -> 0x0858 }
            if (r6 == 0) goto L_0x011f
            goto L_0x015e
        L_0x011f:
            brs r1 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r4.e     // Catch:{ brs -> 0x0858 }
            aucj r0 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r0 = (defpackage.brl) r0     // Catch:{ brs -> 0x0858 }
            java.lang.String r0 = r0.e     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r4 = r4.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r4 = r4 + 95
            int r4 = r4 + r6
            r7.<init>(r4)     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = "Can't merge <uses-module-api name='"
            r7.append(r4)     // Catch:{ brs -> 0x0858 }
            r7.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = "'>.  This module already requires a different module API '"
            r7.append(r2)     // Catch:{ brs -> 0x0858 }
            r7.append(r0)     // Catch:{ brs -> 0x0858 }
            java.lang.String r0 = "'."
            r7.append(r0)     // Catch:{ brs -> 0x0858 }
            java.lang.String r0 = r7.toString()     // Catch:{ brs -> 0x0858 }
            r1.<init>(r0)     // Catch:{ brs -> 0x0858 }
            throw r1     // Catch:{ brs -> 0x0858 }
        L_0x015e:
            java.lang.String r6 = r4.e     // Catch:{ brs -> 0x0858 }
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x0165
            goto L_0x016a
        L_0x0165:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x016a:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            brl r8 = defpackage.brl.v     // Catch:{ brs -> 0x0858 }
            r6.getClass()     // Catch:{ brs -> 0x0858 }
            int r8 = r7.a     // Catch:{ brs -> 0x0858 }
            r8 = r8 | 4
            r7.a = r8     // Catch:{ brs -> 0x0858 }
            r7.e = r6     // Catch:{ brs -> 0x0858 }
        L_0x017b:
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.f     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.f     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = defpackage.brt.a((java.util.List) r6, (java.util.List) r7)     // Catch:{ brs -> 0x0858 }
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x0190
            goto L_0x0195
        L_0x0190:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0195:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            brl r8 = defpackage.brl.v     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.f = r8     // Catch:{ brs -> 0x0858 }
            r0.v((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.g     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.g     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = defpackage.brt.a((java.util.List) r6, (java.util.List) r7)     // Catch:{ brs -> 0x0858 }
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x01b9
            goto L_0x01be
        L_0x01b9:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x01be:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.g = r8     // Catch:{ brs -> 0x0858 }
            r0.r((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.f     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r7 = r7.g     // Catch:{ brs -> 0x0858 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ brs -> 0x0858 }
            defpackage.brt.a((java.util.Collection) r6, (java.util.List) r7)     // Catch:{ brs -> 0x0858 }
            aucx r6 = r4.h     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x0258
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r7 = r7.h     // Catch:{ brs -> 0x0858 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r7)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.h     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x01ff:
            boolean r8 = r7.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r8 == 0) goto L_0x0241
            java.lang.Object r8 = r7.next()     // Catch:{ brs -> 0x0858 }
            brm r8 = (defpackage.brm) r8     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r9 = defpackage.bqy.b     // Catch:{ brs -> 0x0858 }
            int r9 = java.util.Collections.binarySearch(r6, r8, r9)     // Catch:{ brs -> 0x0858 }
            if (r9 >= 0) goto L_0x0219
            int r9 = -r9
            int r9 = r9 + r2
            r6.add(r9, r8)     // Catch:{ brs -> 0x0858 }
            goto L_0x01ff
        L_0x0219:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r8.b     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r2 = r2.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r2 = r2 + 83
            r4.<init>(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = "Can't merge <provides-api name='"
            r4.append(r2)     // Catch:{ brs -> 0x0858 }
            r4.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'>.  This module is already providing the same API."
            r4.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r4.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0241:
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x024b:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.h = r8     // Catch:{ brs -> 0x0858 }
            r0.s((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x0258:
            aucx r6 = r4.q     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x02fd
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r7 = r7.q     // Catch:{ brs -> 0x0858 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r7)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.q     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x0275:
            boolean r8 = r7.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r8 == 0) goto L_0x02c6
            java.lang.Object r8 = r7.next()     // Catch:{ brs -> 0x0858 }
            boc r8 = (defpackage.boc) r8     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r9 = defpackage.bqy.c     // Catch:{ brs -> 0x0858 }
            int r9 = java.util.Collections.binarySearch(r6, r8, r9)     // Catch:{ brs -> 0x0858 }
            if (r9 < 0) goto L_0x02c0
            java.lang.Object r9 = r6.get(r9)     // Catch:{ brs -> 0x0858 }
            boc r9 = (defpackage.boc) r9     // Catch:{ brs -> 0x0858 }
            long r9 = r9.c     // Catch:{ brs -> 0x0858 }
            long r11 = r8.c     // Catch:{ brs -> 0x0858 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0298
            goto L_0x0275
        L_0x0298:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r8.b     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r2 = r2.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r2 = r2 + 114
            r4.<init>(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = "Can't merge <provides-feature name='"
            r4.append(r2)     // Catch:{ brs -> 0x0858 }
            r4.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'>.  This module is already providing the same feature at a different version."
            r4.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r4.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x02c0:
            int r9 = -r9
            int r9 = r9 + r2
            r6.add(r9, r8)     // Catch:{ brs -> 0x0858 }
            goto L_0x0275
        L_0x02c6:
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x02cb
            goto L_0x02d0
        L_0x02cb:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x02d0:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.q = r8     // Catch:{ brs -> 0x0858 }
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x02df
            goto L_0x02e4
        L_0x02df:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x02e4:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = r7.q     // Catch:{ brs -> 0x0858 }
            boolean r8 = r8.a()     // Catch:{ brs -> 0x0858 }
            if (r8 != 0) goto L_0x02f8
            aucx r8 = r7.q     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ brs -> 0x0858 }
            r7.q = r8     // Catch:{ brs -> 0x0858 }
        L_0x02f8:
            aucx r7 = r7.q     // Catch:{ brs -> 0x0858 }
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r7)     // Catch:{ brs -> 0x0858 }
        L_0x02fd:
            aucx r6 = r4.i     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            java.lang.String r7 = "'"
            if (r6 <= 0) goto L_0x039f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r8 = r8.i     // Catch:{ brs -> 0x0858 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r8)     // Catch:{ brs -> 0x0858 }
            aucx r8 = r4.i     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x031c:
            boolean r9 = r8.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r9 == 0) goto L_0x0388
            java.lang.Object r9 = r8.next()     // Catch:{ brs -> 0x0858 }
            brq r9 = (defpackage.brq) r9     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r10 = defpackage.bqy.d     // Catch:{ brs -> 0x0858 }
            int r10 = java.util.Collections.binarySearch(r6, r9, r10)     // Catch:{ brs -> 0x0858 }
            if (r10 >= 0) goto L_0x0336
            int r10 = -r10
            int r10 = r10 + r2
            r6.add(r10, r9)     // Catch:{ brs -> 0x0858 }
            goto L_0x031c
        L_0x0336:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r9.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r9.b     // Catch:{ brs -> 0x0858 }
            java.lang.Object r4 = r6.get(r10)     // Catch:{ brs -> 0x0858 }
            brq r4 = (defpackage.brq) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r8 = r8.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ brs -> 0x0858 }
            int r9 = r9.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r6 = r6 + 118
            int r6 = r6 + r8
            int r6 = r6 + r9
            r10.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = "Can't merge <module-service name='"
            r10.append(r6)     // Catch:{ brs -> 0x0858 }
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'> with container-service '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'.  That service is already proxied to Chimera service '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r4)     // Catch:{ brs -> 0x0858 }
            r10.append(r7)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r10.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0388:
            boolean r8 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r8 != 0) goto L_0x038d
            goto L_0x0392
        L_0x038d:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0392:
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r9 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r8.i = r9     // Catch:{ brs -> 0x0858 }
            r0.w((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x039f:
            aucx r6 = r4.j     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x043f
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r8 = r8.j     // Catch:{ brs -> 0x0858 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r8)     // Catch:{ brs -> 0x0858 }
            aucx r8 = r4.j     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x03bc:
            boolean r9 = r8.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r9 == 0) goto L_0x0428
            java.lang.Object r9 = r8.next()     // Catch:{ brs -> 0x0858 }
            bro r9 = (defpackage.bro) r9     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r10 = defpackage.bqy.e     // Catch:{ brs -> 0x0858 }
            int r10 = java.util.Collections.binarySearch(r6, r9, r10)     // Catch:{ brs -> 0x0858 }
            if (r10 >= 0) goto L_0x03d6
            int r10 = -r10
            int r10 = r10 + r2
            r6.add(r10, r9)     // Catch:{ brs -> 0x0858 }
            goto L_0x03bc
        L_0x03d6:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r9.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r9.b     // Catch:{ brs -> 0x0858 }
            java.lang.Object r4 = r6.get(r10)     // Catch:{ brs -> 0x0858 }
            bro r4 = (defpackage.bro) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r8 = r8.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ brs -> 0x0858 }
            int r9 = r9.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r6 = r6 + 122
            int r6 = r6 + r8
            int r6 = r6 + r9
            r10.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = "Can't merge <module-receiver name='"
            r10.append(r6)     // Catch:{ brs -> 0x0858 }
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'> with container-receiver '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'.  That receiver is already proxied to Chimera receiver '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r4)     // Catch:{ brs -> 0x0858 }
            r10.append(r7)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r10.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0428:
            boolean r8 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r8 != 0) goto L_0x042d
            goto L_0x0432
        L_0x042d:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0432:
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r9 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r8.j = r9     // Catch:{ brs -> 0x0858 }
            r0.u((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x043f:
            aucx r6 = r4.m     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x04df
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r8 = r8.m     // Catch:{ brs -> 0x0858 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r8)     // Catch:{ brs -> 0x0858 }
            aucx r8 = r4.m     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x045c:
            boolean r9 = r8.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r9 == 0) goto L_0x04c8
            java.lang.Object r9 = r8.next()     // Catch:{ brs -> 0x0858 }
            bqz r9 = (defpackage.bqz) r9     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r10 = defpackage.bqy.f     // Catch:{ brs -> 0x0858 }
            int r10 = java.util.Collections.binarySearch(r6, r9, r10)     // Catch:{ brs -> 0x0858 }
            if (r10 >= 0) goto L_0x0476
            int r10 = -r10
            int r10 = r10 + r2
            r6.add(r10, r9)     // Catch:{ brs -> 0x0858 }
            goto L_0x045c
        L_0x0476:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r9.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r9.b     // Catch:{ brs -> 0x0858 }
            java.lang.Object r4 = r6.get(r10)     // Catch:{ brs -> 0x0858 }
            bqz r4 = (defpackage.bqz) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r8 = r8.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ brs -> 0x0858 }
            int r9 = r9.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r6 = r6 + 122
            int r6 = r6 + r8
            int r6 = r6 + r9
            r10.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = "Can't merge <module-activity name='"
            r10.append(r6)     // Catch:{ brs -> 0x0858 }
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'> with container-activity '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'.  That activity is already proxied to Chimera activity '"
            r10.append(r1)     // Catch:{ brs -> 0x0858 }
            r10.append(r4)     // Catch:{ brs -> 0x0858 }
            r10.append(r7)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r10.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x04c8:
            boolean r8 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r8 != 0) goto L_0x04cd
            goto L_0x04d2
        L_0x04cd:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x04d2:
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r9 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r8.m = r9     // Catch:{ brs -> 0x0858 }
            r0.o((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x04df:
            aucx r6 = r4.l     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 > 0) goto L_0x0850
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.l     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 > 0) goto L_0x0850
            aucx r6 = r4.n     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x0522
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.n     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r8 = r4.n     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = defpackage.brt.d(r6, r8)     // Catch:{ brs -> 0x0858 }
            boolean r8 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r8 != 0) goto L_0x0510
            goto L_0x0515
        L_0x0510:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0515:
            aucj r8 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0858 }
            aucx r9 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r8.n = r9     // Catch:{ brs -> 0x0858 }
            r0.q((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x0522:
            aucx r6 = r4.k     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            java.lang.String r8 = "'.  That provider is already proxied to Chimera provider '"
            if (r6 <= 0) goto L_0x05c2
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r9 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r9 = (defpackage.brl) r9     // Catch:{ brs -> 0x0858 }
            aucx r9 = r9.k     // Catch:{ brs -> 0x0858 }
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r9)     // Catch:{ brs -> 0x0858 }
            aucx r9 = r4.k     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x0541:
            boolean r10 = r9.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r10 == 0) goto L_0x05ab
            java.lang.Object r10 = r9.next()     // Catch:{ brs -> 0x0858 }
            brn r10 = (defpackage.brn) r10     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r11 = defpackage.bqy.j     // Catch:{ brs -> 0x0858 }
            int r11 = java.util.Collections.binarySearch(r6, r10, r11)     // Catch:{ brs -> 0x0858 }
            if (r11 >= 0) goto L_0x055b
            int r11 = -r11
            int r11 = r11 + r2
            r6.add(r11, r10)     // Catch:{ brs -> 0x0858 }
            goto L_0x0541
        L_0x055b:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r10.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r10.b     // Catch:{ brs -> 0x0858 }
            java.lang.Object r4 = r6.get(r11)     // Catch:{ brs -> 0x0858 }
            brn r4 = (defpackage.brn) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r9 = r9.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ brs -> 0x0858 }
            int r10 = r10.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r6 = r6 + 122
            int r6 = r6 + r9
            int r6 = r6 + r10
            r11.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = "Can't merge <module-provider name='"
            r11.append(r6)     // Catch:{ brs -> 0x0858 }
            r11.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'> with container-provider '"
            r11.append(r1)     // Catch:{ brs -> 0x0858 }
            r11.append(r2)     // Catch:{ brs -> 0x0858 }
            r11.append(r8)     // Catch:{ brs -> 0x0858 }
            r11.append(r4)     // Catch:{ brs -> 0x0858 }
            r11.append(r7)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r11.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x05ab:
            boolean r9 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r9 != 0) goto L_0x05b0
            goto L_0x05b5
        L_0x05b0:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x05b5:
            aucj r9 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r9 = (defpackage.brl) r9     // Catch:{ brs -> 0x0858 }
            aucx r10 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r9.k = r10     // Catch:{ brs -> 0x0858 }
            r0.t((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x05c2:
            aucx r6 = r4.t     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x0660
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            aucj r9 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r9 = (defpackage.brl) r9     // Catch:{ brs -> 0x0858 }
            aucx r9 = r9.t     // Catch:{ brs -> 0x0858 }
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)     // Catch:{ brs -> 0x0858 }
            r6.<init>(r9)     // Catch:{ brs -> 0x0858 }
            aucx r9 = r4.t     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x05df:
            boolean r10 = r9.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r10 == 0) goto L_0x0649
            java.lang.Object r10 = r9.next()     // Catch:{ brs -> 0x0858 }
            brr r10 = (defpackage.brr) r10     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r11 = defpackage.bqy.k     // Catch:{ brs -> 0x0858 }
            int r11 = java.util.Collections.binarySearch(r6, r10, r11)     // Catch:{ brs -> 0x0858 }
            if (r11 >= 0) goto L_0x05f9
            int r11 = -r11
            int r11 = r11 + r2
            r6.add(r11, r10)     // Catch:{ brs -> 0x0858 }
            goto L_0x05df
        L_0x05f9:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r10.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = r10.b     // Catch:{ brs -> 0x0858 }
            java.lang.Object r4 = r6.get(r11)     // Catch:{ brs -> 0x0858 }
            brr r4 = (defpackage.brr) r4     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = r4.c     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r9 = r9.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ brs -> 0x0858 }
            int r10 = r10.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r6 = r6 + 134
            int r6 = r6 + r9
            int r6 = r6 + r10
            r11.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = "Can't merge <module-slice-provider name='"
            r11.append(r6)     // Catch:{ brs -> 0x0858 }
            r11.append(r1)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "'> with container-slice-provider '"
            r11.append(r1)     // Catch:{ brs -> 0x0858 }
            r11.append(r2)     // Catch:{ brs -> 0x0858 }
            r11.append(r8)     // Catch:{ brs -> 0x0858 }
            r11.append(r4)     // Catch:{ brs -> 0x0858 }
            r11.append(r7)     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = r11.toString()     // Catch:{ brs -> 0x0858 }
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0649:
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x064e
            goto L_0x0653
        L_0x064e:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0653:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.t = r8     // Catch:{ brs -> 0x0858 }
            r0.x((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x0660:
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.k     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r7 = r7.t     // Catch:{ brs -> 0x0858 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ brs -> 0x0858 }
            defpackage.brt.b((java.util.List) r6, (java.util.List) r7)     // Catch:{ brs -> 0x0858 }
            aucx r6 = r4.p     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x06a6
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.p     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.p     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = defpackage.brt.c(r6, r7)     // Catch:{ brs -> 0x0858 }
            boolean r7 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r7 != 0) goto L_0x0694
            goto L_0x0699
        L_0x0694:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0699:
            aucj r7 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r7 = (defpackage.brl) r7     // Catch:{ brs -> 0x0858 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r7.p = r8     // Catch:{ brs -> 0x0858 }
            r0.p((java.lang.Iterable) r6)     // Catch:{ brs -> 0x0858 }
        L_0x06a6:
            aucx r6 = r4.s     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x0725
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.s     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.s     // Catch:{ brs -> 0x0858 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            r8.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x06c3:
            boolean r7 = r6.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r7 == 0) goto L_0x06fb
            java.lang.Object r7 = r6.next()     // Catch:{ brs -> 0x0858 }
            brc r7 = (defpackage.brc) r7     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r9 = defpackage.bqy.n     // Catch:{ brs -> 0x0858 }
            int r9 = java.util.Collections.binarySearch(r8, r7, r9)     // Catch:{ brs -> 0x0858 }
            if (r9 < 0) goto L_0x06f5
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "Each module can have at most one DowngradeHandler: "
            java.lang.String r2 = r7.b     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r4 = r2.length()     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x06ed
            java.lang.String r2 = new java.lang.String     // Catch:{ brs -> 0x0858 }
            r2.<init>(r1)     // Catch:{ brs -> 0x0858 }
            goto L_0x06f1
        L_0x06ed:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ brs -> 0x0858 }
        L_0x06f1:
            r0.<init>(r2)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x06f5:
            int r9 = -r9
            int r9 = r9 + r2
            r8.add(r9, r7)     // Catch:{ brs -> 0x0858 }
            goto L_0x06c3
        L_0x06fb:
            boolean r6 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r6 != 0) goto L_0x0700
            goto L_0x0705
        L_0x0700:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0705:
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r7 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r6.s = r7     // Catch:{ brs -> 0x0858 }
            boolean r6 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r6 != 0) goto L_0x0714
            goto L_0x0719
        L_0x0714:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0719:
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            r6.h()     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.s     // Catch:{ brs -> 0x0858 }
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r6)     // Catch:{ brs -> 0x0858 }
        L_0x0725:
            aucx r6 = r4.r     // Catch:{ brs -> 0x0858 }
            int r6 = r6.size()     // Catch:{ brs -> 0x0858 }
            if (r6 <= 0) goto L_0x07a4
            aucj r6 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r6 = (defpackage.brl) r6     // Catch:{ brs -> 0x0858 }
            aucx r6 = r6.r     // Catch:{ brs -> 0x0858 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ brs -> 0x0858 }
            aucx r7 = r4.r     // Catch:{ brs -> 0x0858 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ brs -> 0x0858 }
            r8.<init>(r6)     // Catch:{ brs -> 0x0858 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ brs -> 0x0858 }
        L_0x0742:
            boolean r7 = r6.hasNext()     // Catch:{ brs -> 0x0858 }
            if (r7 == 0) goto L_0x077a
            java.lang.Object r7 = r6.next()     // Catch:{ brs -> 0x0858 }
            brk r7 = (defpackage.brk) r7     // Catch:{ brs -> 0x0858 }
            java.util.Comparator r9 = defpackage.bqy.m     // Catch:{ brs -> 0x0858 }
            int r9 = java.util.Collections.binarySearch(r8, r7, r9)     // Catch:{ brs -> 0x0858 }
            if (r9 < 0) goto L_0x0774
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "Duplicated meta-data entry: "
            java.lang.String r2 = r7.d     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r4 = r2.length()     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x076c
            java.lang.String r2 = new java.lang.String     // Catch:{ brs -> 0x0858 }
            r2.<init>(r1)     // Catch:{ brs -> 0x0858 }
            goto L_0x0770
        L_0x076c:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ brs -> 0x0858 }
        L_0x0770:
            r0.<init>(r2)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0774:
            int r9 = -r9
            int r9 = r9 + r2
            r8.add(r9, r7)     // Catch:{ brs -> 0x0858 }
            goto L_0x0742
        L_0x077a:
            boolean r2 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r2 != 0) goto L_0x077f
            goto L_0x0784
        L_0x077f:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0784:
            aucj r2 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x0858 }
            aucx r6 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r2.r = r6     // Catch:{ brs -> 0x0858 }
            boolean r2 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r2 != 0) goto L_0x0793
            goto L_0x0798
        L_0x0793:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0798:
            aucj r2 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x0858 }
            r2.g()     // Catch:{ brs -> 0x0858 }
            aucx r2 = r2.r     // Catch:{ brs -> 0x0858 }
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r2)     // Catch:{ brs -> 0x0858 }
        L_0x07a4:
            int r2 = r4.a     // Catch:{ brs -> 0x0858 }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x081c
            aucj r2 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x0858 }
            int r2 = r2.a     // Catch:{ brs -> 0x0858 }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x07fc
            brs r1 = new brs     // Catch:{ brs -> 0x0858 }
            bra r2 = r4.u     // Catch:{ brs -> 0x0858 }
            if (r2 == 0) goto L_0x07bb
            goto L_0x07bd
        L_0x07bb:
            bra r2 = defpackage.bra.d     // Catch:{ brs -> 0x0858 }
        L_0x07bd:
            java.lang.String r2 = r2.b     // Catch:{ brs -> 0x0858 }
            aucj r0 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r0 = (defpackage.brl) r0     // Catch:{ brs -> 0x0858 }
            bra r0 = r0.u     // Catch:{ brs -> 0x0858 }
            if (r0 == 0) goto L_0x07c8
            goto L_0x07ca
        L_0x07c8:
            bra r0 = defpackage.bra.d     // Catch:{ brs -> 0x0858 }
        L_0x07ca:
            java.lang.String r0 = r0.b     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ brs -> 0x0858 }
            int r4 = r4.length()     // Catch:{ brs -> 0x0858 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ brs -> 0x0858 }
            int r6 = r6.length()     // Catch:{ brs -> 0x0858 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0858 }
            int r4 = r4 + 84
            int r4 = r4 + r6
            r7.<init>(r4)     // Catch:{ brs -> 0x0858 }
            java.lang.String r4 = "Multiple backup agents are disallowed. More than one module backup-agent found:"
            r7.append(r4)     // Catch:{ brs -> 0x0858 }
            r7.append(r2)     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = " and "
            r7.append(r2)     // Catch:{ brs -> 0x0858 }
            r7.append(r0)     // Catch:{ brs -> 0x0858 }
            java.lang.String r0 = r7.toString()     // Catch:{ brs -> 0x0858 }
            r1.<init>(r0)     // Catch:{ brs -> 0x0858 }
            throw r1     // Catch:{ brs -> 0x0858 }
        L_0x07fc:
            bra r2 = r4.u     // Catch:{ brs -> 0x0858 }
            if (r2 == 0) goto L_0x0801
            goto L_0x0803
        L_0x0801:
            bra r2 = defpackage.bra.d     // Catch:{ brs -> 0x0858 }
        L_0x0803:
            boolean r4 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x0808
            goto L_0x080d
        L_0x0808:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x080d:
            aucj r0 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r0 = (defpackage.brl) r0     // Catch:{ brs -> 0x0858 }
            r2.getClass()     // Catch:{ brs -> 0x0858 }
            r0.u = r2     // Catch:{ brs -> 0x0858 }
            int r2 = r0.a     // Catch:{ brs -> 0x0858 }
            r2 = r2 | 16
            r0.a = r2     // Catch:{ brs -> 0x0858 }
        L_0x081c:
            aucd r0 = r14.p     // Catch:{ brs -> 0x0858 }
            java.lang.String r2 = ""
            boolean r4 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r4 != 0) goto L_0x0825
            goto L_0x082a
        L_0x0825:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x082a:
            aucj r0 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r0 = (defpackage.brl) r0     // Catch:{ brs -> 0x0858 }
            r2.getClass()     // Catch:{ brs -> 0x0858 }
            int r4 = r0.a     // Catch:{ brs -> 0x0858 }
            r4 = r4 | 4
            r0.a = r4     // Catch:{ brs -> 0x0858 }
            r0.e = r2     // Catch:{ brs -> 0x0858 }
            aucd r0 = r14.p     // Catch:{ brs -> 0x0858 }
            boolean r2 = r0.c     // Catch:{ brs -> 0x0858 }
            if (r2 != 0) goto L_0x0840
            goto L_0x0845
        L_0x0840:
            r0.c()     // Catch:{ brs -> 0x0858 }
            r0.c = r3     // Catch:{ brs -> 0x0858 }
        L_0x0845:
            aucj r0 = r0.b     // Catch:{ brs -> 0x0858 }
            brl r0 = (defpackage.brl) r0     // Catch:{ brs -> 0x0858 }
            aucx r2 = defpackage.aucj.s()     // Catch:{ brs -> 0x0858 }
            r0.q = r2     // Catch:{ brs -> 0x0858 }
            return r1
        L_0x0850:
            brs r0 = new brs     // Catch:{ brs -> 0x0858 }
            java.lang.String r1 = "Manifest should be normalized before merging"
            r0.<init>(r1)     // Catch:{ brs -> 0x0858 }
            throw r0     // Catch:{ brs -> 0x0858 }
        L_0x0858:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 31
            int r4 = r4 + r6
            r7.<init>(r4)
            java.lang.String r4 = "Failed merging manifest from "
            r7.append(r4)
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = r7.toString()
            r14.a((java.lang.String) r1)
            bnm r15 = r15.d
            bke r1 = new bke
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r5, r0)
            r14.a((defpackage.bnm) r15, (defpackage.bke) r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnt.b(bom):boolean");
    }

    private static final boolean c(bnm bnm) {
        int a2 = bnl.a(bnm.k);
        return a2 != 0 && a2 == 2;
    }

    private final void a(bnm bnm, bke bke) {
        if (a(bnm)) {
            this.f.set(b(bnm));
            return;
        }
        this.d.put(bnm, bke);
        String valueOf = String.valueOf(bkd.a(bnm));
        throw new InvalidConfigException(valueOf.length() == 0 ? new String("Cannot discard required APK: ") : "Cannot discard required APK: ".concat(valueOf));
    }

    private final void a(bom bom, String str) {
        StringBuilder sb = new StringBuilder(bom.toString());
        sb.append(" rejected due to ");
        sb.append(str);
        sb.append(":");
        for (brp brp : bom.b()) {
            sb.append(' ');
            sb.append(brp.b);
            sb.append('[');
            sb.append(brp.c);
            if (brp.d < Integer.MAX_VALUE) {
                sb.append(',');
                sb.append(brp.d);
            }
            sb.append(']');
        }
        b(sb.toString());
    }

    private final void a(ArrayList arrayList, int i2, Collection collection, bke bke) {
        bom bom = (bom) arrayList.get(i2);
        if (c(bom.d)) {
            this.d.put(bom.d, bke);
        }
        if (!bom.e.h.isEmpty()) {
            collection.remove(bom);
        }
        arrayList.remove(i2);
    }

    public static final boolean a(bnm bnm) {
        int a2 = bnl.a(bnm.k);
        return a2 != 0 && a2 == 3;
    }

    public final int a(bom bom) {
        return b(bom.d);
    }

    /* access modifiers changed from: package-private */
    public final ArrayList a(ArrayList arrayList, SortedMap sortedMap) {
        Map map;
        int i2;
        Map map2;
        ArrayList arrayList2 = arrayList;
        Collections.sort(arrayList);
        Map a2 = qug.a();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            bom bom = (bom) arrayList2.get(i3);
            if (!bom.e.h.isEmpty()) {
                arrayList4.add(bom);
            }
        }
        sortedMap.clear();
        Set keySet = sortedMap.keySet();
        while (true) {
            int size2 = keySet.size();
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                arrayList5.addAll(((bom) arrayList4.get(i4)).e.h);
            }
            Collections.sort(arrayList5, o);
            int i5 = 0;
            String str = null;
            while (i5 < arrayList.size()) {
                bom bom2 = (bom) arrayList2.get(i5);
                if (str == null || !bom.a(bom2.a, str)) {
                    str = bom2.a;
                    if (bom2.a((Collection) keySet, true)) {
                        String valueOf = String.valueOf(bom2);
                        int i6 = bom2.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(str).length());
                        sb.append(valueOf);
                        sb.append(" accepted (id=");
                        sb.append(str);
                        sb.append(", version=");
                        sb.append(i6);
                        sb.append(")");
                        sb.toString();
                        a();
                        arrayList3.add(bom2);
                        List list = bom2.c;
                        if (list != null) {
                            int size4 = list.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                a2.put((String) list.get(i7), bom2);
                                i7++;
                                list = list;
                            }
                        }
                        aucx aucx = bom2.e.h;
                        int size5 = aucx.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            int i9 = size5;
                            sortedMap.put((brm) aucx.get(i8), bom2);
                            i8++;
                            size5 = i9;
                            aucx = aucx;
                        }
                        SortedMap sortedMap2 = sortedMap;
                        arrayList2.remove(i5);
                        arrayList4.remove(bom2);
                        while (i5 < arrayList.size() && bom.a(bom2.a, ((bom) arrayList2.get(i5)).a)) {
                            String valueOf2 = String.valueOf(arrayList2.get(i5));
                            int i10 = ((bom) arrayList2.get(i5)).b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36 + String.valueOf(str).length());
                            sb2.append(valueOf2);
                            sb2.append(" rejected (id=");
                            sb2.append(str);
                            sb2.append(", version=");
                            sb2.append(i10);
                            sb2.append(")");
                            sb2.toString();
                            a();
                            a(arrayList2, i5, arrayList4, new bke(1, String.valueOf(bom2.b)));
                            SortedMap sortedMap3 = sortedMap;
                            a2 = a2;
                        }
                        map2 = a2;
                    } else {
                        map2 = a2;
                        if (!bom2.a((Collection) arrayList5, false)) {
                            a(bom2, "missing APIs");
                            a(arrayList2, i5, arrayList4, new bke(3, c(bom2)));
                            str = null;
                        } else {
                            i5++;
                        }
                        a2 = map2;
                    }
                } else {
                    i5++;
                    map2 = a2;
                }
                a2 = map2;
            }
            map = a2;
            i2 = 0;
            if (!arrayList.isEmpty() && keySet.size() != size2) {
                a2 = map;
            }
        }
        int size6 = arrayList.size();
        String str2 = null;
        for (int i11 = 0; i11 < size6; i11++) {
            bom bom3 = (bom) arrayList2.get(i11);
            if (str2 == null || !bom.a(bom3.a, str2)) {
                String str3 = bom3.a;
                a(bom3, "dependency cycle");
                str2 = str3;
            }
            if (c(bom3.d)) {
                this.d.put(bom3.d, new bke(3, c(bom3)));
            }
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            bom bom4 = (bom) arrayList3.get(i12);
            Map map3 = map;
            bom bom5 = (bom) map3.remove(bom4.a);
            if (bom5 != null) {
                String str4 = bom4.a;
                String str5 = bom5.a;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 36 + String.valueOf(str5).length());
                sb3.append(str4);
                sb3.append(" NOT accepted, replaced by alias to ");
                sb3.append(str5);
                sb3.toString();
                a();
                arrayList3.remove(i12);
            } else {
                i12++;
            }
            map = map3;
        }
        Collections.sort(arrayList3, bom.h);
        int size7 = arrayList3.size();
        int i13 = 0;
        while (i13 < size7) {
            ((bom) arrayList3.get(i13)).f = i2;
            i13++;
            i2++;
        }
        return arrayList3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        if (r12.contains(r14.toString()) == false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList a(java.util.List r23, boolean r24) {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 256(0x100, float:3.59E-43)
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x000b:
            int r5 = r23.size()
            if (r4 >= r5) goto L_0x0861
            java.util.BitSet r5 = r1.f
            boolean r5 = r5.get(r4)
            if (r5 != 0) goto L_0x084f
            r5 = r23
            java.lang.Object r6 = r5.get(r4)
            bnm r6 = (defpackage.bnm) r6
            java.util.Map r7 = r1.j
            java.lang.Object r7 = r7.get(r6)
            brh r7 = (defpackage.brh) r7
            if (r7 != 0) goto L_0x0059
            java.lang.String r7 = defpackage.bkd.a(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Can't get Chimera manifests from "
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0041
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8)
            goto L_0x0045
        L_0x0041:
            java.lang.String r7 = r8.concat(r7)
        L_0x0045:
            r1.b((java.lang.String) r7)
            bke r7 = new bke
            r8 = 4
            r7.<init>(r8)
            r1.a((defpackage.bnm) r6, (defpackage.bke) r7)
            r19 = r2
            r20 = r4
            r2 = 0
            r4 = r1
            goto L_0x0855
        L_0x0059:
            r8 = 5
            java.lang.Object r9 = r7.c(r8)
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r7)
            r7 = 0
        L_0x0065:
            aucj r10 = r9.b
            brh r10 = (defpackage.brh) r10
            aucx r10 = r10.a
            int r10 = r10.size()
            if (r7 < r10) goto L_0x0118
            aucj r7 = r9.b
            brh r7 = (defpackage.brh) r7
            aucx r7 = r7.a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r7.next()
            brl r8 = (defpackage.brl) r8
            if (r24 == 0) goto L_0x00d0
            java.lang.String r10 = r8.b
            int r11 = r8.d
            bpw r12 = r1.k
            boolean r12 = r12.contains(r10)
            if (r12 != 0) goto L_0x00c0
            bpw r12 = r1.k
            java.lang.String r13 = java.lang.String.valueOf(r10)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r13 = r13 + 12
            r14.<init>(r13)
            r14.append(r10)
            java.lang.String r10 = ":"
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = r14.toString()
            boolean r10 = r12.contains(r10)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00d0
        L_0x00c0:
            boolean r8 = c((defpackage.bnm) r6)
            if (r8 == 0) goto L_0x007f
            bke r8 = new bke
            r10 = 6
            r8.<init>(r10)
            r1.a((defpackage.bnm) r6, (defpackage.bke) r8)
            goto L_0x007f
        L_0x00d0:
            bom r10 = new bom
            r10.<init>(r8, r6)
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String r11 = defpackage.bkd.a(r6)
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r12 = r12 + 18
            int r12 = r12 + r13
            r14.<init>(r12)
            java.lang.String r12 = "Considering "
            r14.append(r12)
            r14.append(r8)
            java.lang.String r8 = " from "
            r14.append(r8)
            r14.append(r11)
            r14.toString()
            r22.a()
            r2.add(r10)
            goto L_0x007f
        L_0x0110:
            r19 = r2
            r20 = r4
            r2 = 0
            r4 = r1
            goto L_0x0843
        L_0x0118:
            aucj r10 = r9.b
            brh r10 = (defpackage.brh) r10
            aucx r10 = r10.a
            java.lang.Object r10 = r10.get(r7)
            brl r10 = (defpackage.brl) r10
            int r11 = r6.b
            int r11 = defpackage.bnj.a(r11)
            r12 = 1
            if (r11 == 0) goto L_0x013a
            r13 = 2
            if (r11 != r13) goto L_0x013a
            java.lang.String r11 = r10.b
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x013a
            r11 = 1
            goto L_0x013b
        L_0x013a:
            r11 = 0
        L_0x013b:
            java.lang.String r13 = r1.a     // Catch:{ brs -> 0x07e3 }
            if (r11 == 0) goto L_0x0140
            goto L_0x0154
        L_0x0140:
            java.lang.String r11 = r10.b     // Catch:{ brs -> 0x07e3 }
            boolean r11 = r11.isEmpty()     // Catch:{ brs -> 0x07e3 }
            if (r11 != 0) goto L_0x07d4
            int r11 = r10.d     // Catch:{ brs -> 0x07e3 }
            if (r11 <= 0) goto L_0x07c7
            java.lang.String r11 = r10.e     // Catch:{ brs -> 0x07e3 }
            boolean r11 = r11.isEmpty()     // Catch:{ brs -> 0x07e3 }
            if (r11 != 0) goto L_0x07ba
        L_0x0154:
            java.lang.Object r11 = r10.c(r8)     // Catch:{ brs -> 0x07e3 }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ brs -> 0x07e3 }
            r11.a((defpackage.aucj) r10)     // Catch:{ brs -> 0x07e3 }
            aucj r14 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r14 = (defpackage.brl) r14     // Catch:{ brs -> 0x07e3 }
            java.lang.String r14 = r14.o     // Catch:{ brs -> 0x07e3 }
            boolean r14 = r14.equals(r13)     // Catch:{ brs -> 0x07e3 }
            if (r14 == 0) goto L_0x016b
            goto L_0x016e
        L_0x016b:
            defpackage.brt.a((java.lang.String) r13, (defpackage.aucd) r11)     // Catch:{ brs -> 0x07e3 }
        L_0x016e:
            aucj r13 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x07e3 }
            aucx r13 = r13.f     // Catch:{ brs -> 0x07e3 }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x07e3 }
            java.util.List r13 = defpackage.brt.a((java.util.List) r13)     // Catch:{ brs -> 0x07e3 }
            boolean r14 = r11.c     // Catch:{ brs -> 0x07e3 }
            if (r14 != 0) goto L_0x0181
            goto L_0x0186
        L_0x0181:
            r11.c()     // Catch:{ brs -> 0x07e3 }
            r11.c = r3     // Catch:{ brs -> 0x07e3 }
        L_0x0186:
            aucj r14 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r14 = (defpackage.brl) r14     // Catch:{ brs -> 0x07e3 }
            brl r15 = defpackage.brl.v     // Catch:{ brs -> 0x07e3 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x07e3 }
            r14.f = r15     // Catch:{ brs -> 0x07e3 }
            r11.v((java.lang.Iterable) r13)     // Catch:{ brs -> 0x07e3 }
            aucj r13 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x07e3 }
            aucx r13 = r13.g     // Catch:{ brs -> 0x07e3 }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x07e3 }
            java.util.List r13 = defpackage.brt.a((java.util.List) r13)     // Catch:{ brs -> 0x07e3 }
            boolean r14 = r11.c     // Catch:{ brs -> 0x07e3 }
            if (r14 != 0) goto L_0x01a8
            goto L_0x01ad
        L_0x01a8:
            r11.c()     // Catch:{ brs -> 0x07e3 }
            r11.c = r3     // Catch:{ brs -> 0x07e3 }
        L_0x01ad:
            aucj r14 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r14 = (defpackage.brl) r14     // Catch:{ brs -> 0x07e3 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x07e3 }
            r14.g = r15     // Catch:{ brs -> 0x07e3 }
            r11.r((java.lang.Iterable) r13)     // Catch:{ brs -> 0x07e3 }
            aucj r13 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x07e3 }
            aucx r13 = r13.f     // Catch:{ brs -> 0x07e3 }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x07e3 }
            aucj r14 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r14 = (defpackage.brl) r14     // Catch:{ brs -> 0x07e3 }
            aucx r14 = r14.g     // Catch:{ brs -> 0x07e3 }
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)     // Catch:{ brs -> 0x07e3 }
            defpackage.brt.a((java.util.Collection) r13, (java.util.List) r14)     // Catch:{ brs -> 0x07e3 }
            aucj r13 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x07e3 }
            aucx r13 = r13.h     // Catch:{ brs -> 0x07e3 }
            int r13 = r13.size()     // Catch:{ brs -> 0x07e3 }
            java.lang.String r14 = "'"
            if (r13 <= r12) goto L_0x025c
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r13 = r13.h     // Catch:{ brs -> 0x0253 }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x0253 }
            java.util.Comparator r15 = defpackage.bqy.b     // Catch:{ brs -> 0x0253 }
            java.util.List r13 = defpackage.brt.a((java.util.List) r13, (java.util.Comparator) r15)     // Catch:{ brs -> 0x0253 }
            boolean r15 = r11.c     // Catch:{ brs -> 0x0253 }
            if (r15 != 0) goto L_0x01f4
            goto L_0x01f9
        L_0x01f4:
            r11.c()     // Catch:{ brs -> 0x0253 }
            r11.c = r3     // Catch:{ brs -> 0x0253 }
        L_0x01f9:
            aucj r15 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r15 = (defpackage.brl) r15     // Catch:{ brs -> 0x0253 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ brs -> 0x0253 }
            r15.h = r8     // Catch:{ brs -> 0x0253 }
            r11.s((java.lang.Iterable) r13)     // Catch:{ brs -> 0x0253 }
            brm r8 = r11.g((int) r3)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            r13 = 1
        L_0x020d:
            aucj r15 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r15 = (defpackage.brl) r15     // Catch:{ brs -> 0x0253 }
            aucx r15 = r15.h     // Catch:{ brs -> 0x0253 }
            int r15 = r15.size()     // Catch:{ brs -> 0x0253 }
            if (r13 < r15) goto L_0x021a
            goto L_0x025c
        L_0x021a:
            brm r15 = r11.g((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r15 = r15.b     // Catch:{ brs -> 0x0253 }
            boolean r15 = r15.equals(r8)     // Catch:{ brs -> 0x0253 }
            if (r15 != 0) goto L_0x022f
            brm r8 = r11.g((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            int r13 = r13 + 1
            goto L_0x020d
        L_0x022f:
            brs r7 = new brs     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ brs -> 0x0253 }
            int r11 = r11.length()     // Catch:{ brs -> 0x0253 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0253 }
            int r11 = r11 + 42
            r12.<init>(r11)     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = "Multiple <provides-api> entries for API '"
            r12.append(r11)     // Catch:{ brs -> 0x0253 }
            r12.append(r8)     // Catch:{ brs -> 0x0253 }
            r12.append(r14)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r12.toString()     // Catch:{ brs -> 0x0253 }
            r7.<init>(r8)     // Catch:{ brs -> 0x0253 }
            throw r7     // Catch:{ brs -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            r1 = r0
            r19 = r2
            r20 = r4
        L_0x0259:
            r2 = 0
            goto L_0x07ea
        L_0x025c:
            aucj r8 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x07e3 }
            aucx r8 = r8.i     // Catch:{ brs -> 0x07e3 }
            int r8 = r8.size()     // Catch:{ brs -> 0x07e3 }
            if (r8 <= r12) goto L_0x02dc
            aucj r8 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0253 }
            aucx r8 = r8.i     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0253 }
            java.util.Comparator r13 = defpackage.bqy.d     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = defpackage.brt.a((java.util.List) r8, (java.util.Comparator) r13)     // Catch:{ brs -> 0x0253 }
            boolean r13 = r11.c     // Catch:{ brs -> 0x0253 }
            if (r13 != 0) goto L_0x027d
            goto L_0x0282
        L_0x027d:
            r11.c()     // Catch:{ brs -> 0x0253 }
            r11.c = r3     // Catch:{ brs -> 0x0253 }
        L_0x0282:
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x0253 }
            r13.i = r15     // Catch:{ brs -> 0x0253 }
            r11.w((java.lang.Iterable) r8)     // Catch:{ brs -> 0x0253 }
            brq r8 = r11.h((int) r3)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            r13 = 1
        L_0x0296:
            aucj r15 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r15 = (defpackage.brl) r15     // Catch:{ brs -> 0x0253 }
            aucx r15 = r15.i     // Catch:{ brs -> 0x0253 }
            int r15 = r15.size()     // Catch:{ brs -> 0x0253 }
            if (r13 < r15) goto L_0x02a3
            goto L_0x02dc
        L_0x02a3:
            brq r15 = r11.h((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r15 = r15.b     // Catch:{ brs -> 0x0253 }
            boolean r15 = r15.equals(r8)     // Catch:{ brs -> 0x0253 }
            if (r15 != 0) goto L_0x02b8
            brq r8 = r11.h((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            int r13 = r13 + 1
            goto L_0x0296
        L_0x02b8:
            brs r7 = new brs     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ brs -> 0x0253 }
            int r11 = r11.length()     // Catch:{ brs -> 0x0253 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0253 }
            int r11 = r11 + 46
            r12.<init>(r11)     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = "Multiple services tied to container-service '"
            r12.append(r11)     // Catch:{ brs -> 0x0253 }
            r12.append(r8)     // Catch:{ brs -> 0x0253 }
            r12.append(r14)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r12.toString()     // Catch:{ brs -> 0x0253 }
            r7.<init>(r8)     // Catch:{ brs -> 0x0253 }
            throw r7     // Catch:{ brs -> 0x0253 }
        L_0x02dc:
            aucj r8 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x07e3 }
            aucx r8 = r8.j     // Catch:{ brs -> 0x07e3 }
            int r8 = r8.size()     // Catch:{ brs -> 0x07e3 }
            if (r8 <= r12) goto L_0x035c
            aucj r8 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0253 }
            aucx r8 = r8.j     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0253 }
            java.util.Comparator r13 = defpackage.bqy.e     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = defpackage.brt.a((java.util.List) r8, (java.util.Comparator) r13)     // Catch:{ brs -> 0x0253 }
            boolean r13 = r11.c     // Catch:{ brs -> 0x0253 }
            if (r13 != 0) goto L_0x02fd
            goto L_0x0302
        L_0x02fd:
            r11.c()     // Catch:{ brs -> 0x0253 }
            r11.c = r3     // Catch:{ brs -> 0x0253 }
        L_0x0302:
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x0253 }
            r13.j = r15     // Catch:{ brs -> 0x0253 }
            r11.u((java.lang.Iterable) r8)     // Catch:{ brs -> 0x0253 }
            bro r8 = r11.i((int) r3)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            r13 = 1
        L_0x0316:
            aucj r15 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r15 = (defpackage.brl) r15     // Catch:{ brs -> 0x0253 }
            aucx r15 = r15.j     // Catch:{ brs -> 0x0253 }
            int r15 = r15.size()     // Catch:{ brs -> 0x0253 }
            if (r13 < r15) goto L_0x0323
            goto L_0x035c
        L_0x0323:
            bro r15 = r11.i((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r15 = r15.b     // Catch:{ brs -> 0x0253 }
            boolean r15 = r15.equals(r8)     // Catch:{ brs -> 0x0253 }
            if (r15 != 0) goto L_0x0338
            bro r8 = r11.i((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            int r13 = r13 + 1
            goto L_0x0316
        L_0x0338:
            brs r7 = new brs     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ brs -> 0x0253 }
            int r11 = r11.length()     // Catch:{ brs -> 0x0253 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0253 }
            int r11 = r11 + 48
            r12.<init>(r11)     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = "Multiple receivers tied to container-receiver '"
            r12.append(r11)     // Catch:{ brs -> 0x0253 }
            r12.append(r8)     // Catch:{ brs -> 0x0253 }
            r12.append(r14)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r12.toString()     // Catch:{ brs -> 0x0253 }
            r7.<init>(r8)     // Catch:{ brs -> 0x0253 }
            throw r7     // Catch:{ brs -> 0x0253 }
        L_0x035c:
            aucj r8 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x07e3 }
            aucx r8 = r8.m     // Catch:{ brs -> 0x07e3 }
            int r8 = r8.size()     // Catch:{ brs -> 0x07e3 }
            if (r8 <= r12) goto L_0x03dc
            aucj r8 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x0253 }
            aucx r8 = r8.m     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x0253 }
            java.util.Comparator r13 = defpackage.bqy.f     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = defpackage.brt.a((java.util.List) r8, (java.util.Comparator) r13)     // Catch:{ brs -> 0x0253 }
            boolean r13 = r11.c     // Catch:{ brs -> 0x0253 }
            if (r13 != 0) goto L_0x037d
            goto L_0x0382
        L_0x037d:
            r11.c()     // Catch:{ brs -> 0x0253 }
            r11.c = r3     // Catch:{ brs -> 0x0253 }
        L_0x0382:
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x0253 }
            r13.m = r15     // Catch:{ brs -> 0x0253 }
            r11.o((java.lang.Iterable) r8)     // Catch:{ brs -> 0x0253 }
            bqz r8 = r11.k((int) r3)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            r13 = 1
        L_0x0396:
            aucj r15 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r15 = (defpackage.brl) r15     // Catch:{ brs -> 0x0253 }
            aucx r15 = r15.m     // Catch:{ brs -> 0x0253 }
            int r15 = r15.size()     // Catch:{ brs -> 0x0253 }
            if (r13 < r15) goto L_0x03a3
            goto L_0x03dc
        L_0x03a3:
            bqz r15 = r11.k((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r15 = r15.b     // Catch:{ brs -> 0x0253 }
            boolean r15 = r15.equals(r8)     // Catch:{ brs -> 0x0253 }
            if (r15 != 0) goto L_0x03b8
            bqz r8 = r11.k((int) r13)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r8.b     // Catch:{ brs -> 0x0253 }
            int r13 = r13 + 1
            goto L_0x0396
        L_0x03b8:
            brs r7 = new brs     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ brs -> 0x0253 }
            int r11 = r11.length()     // Catch:{ brs -> 0x0253 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ brs -> 0x0253 }
            int r11 = r11 + 49
            r12.<init>(r11)     // Catch:{ brs -> 0x0253 }
            java.lang.String r11 = "Multiple activities tied to container-activity '"
            r12.append(r11)     // Catch:{ brs -> 0x0253 }
            r12.append(r8)     // Catch:{ brs -> 0x0253 }
            r12.append(r14)     // Catch:{ brs -> 0x0253 }
            java.lang.String r8 = r12.toString()     // Catch:{ brs -> 0x0253 }
            r7.<init>(r8)     // Catch:{ brs -> 0x0253 }
            throw r7     // Catch:{ brs -> 0x0253 }
        L_0x03dc:
            aucj r8 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x07e3 }
            aucx r8 = r8.n     // Catch:{ brs -> 0x07e3 }
            int r8 = r8.size()     // Catch:{ brs -> 0x07e3 }
            if (r8 <= 0) goto L_0x0411
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ brs -> 0x0253 }
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r13 = r13.n     // Catch:{ brs -> 0x0253 }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x0253 }
            java.util.List r8 = defpackage.brt.d(r8, r13)     // Catch:{ brs -> 0x0253 }
            boolean r13 = r11.c     // Catch:{ brs -> 0x0253 }
            if (r13 != 0) goto L_0x03ff
            goto L_0x0404
        L_0x03ff:
            r11.c()     // Catch:{ brs -> 0x0253 }
            r11.c = r3     // Catch:{ brs -> 0x0253 }
        L_0x0404:
            aucj r13 = r11.b     // Catch:{ brs -> 0x0253 }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x0253 }
            aucx r15 = defpackage.aucj.s()     // Catch:{ brs -> 0x0253 }
            r13.n = r15     // Catch:{ brs -> 0x0253 }
            r11.q((java.lang.Iterable) r8)     // Catch:{ brs -> 0x0253 }
        L_0x0411:
            aucj r8 = r11.b     // Catch:{ brs -> 0x07e3 }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x07e3 }
            aucx r8 = r8.l     // Catch:{ brs -> 0x07e3 }
            int r8 = r8.size()     // Catch:{ brs -> 0x07e3 }
            if (r8 <= 0) goto L_0x0622
            aucj r8 = r11.b     // Catch:{ brs -> 0x061a }
            brl r8 = (defpackage.brl) r8     // Catch:{ brs -> 0x061a }
            aucx r8 = r8.n     // Catch:{ brs -> 0x061a }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ brs -> 0x061a }
            aucj r13 = r11.b     // Catch:{ brs -> 0x061a }
            brl r13 = (defpackage.brl) r13     // Catch:{ brs -> 0x061a }
            aucx r13 = r13.l     // Catch:{ brs -> 0x061a }
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)     // Catch:{ brs -> 0x061a }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ brs -> 0x061a }
            r15.<init>(r8)     // Catch:{ brs -> 0x061a }
            java.util.Iterator r8 = r13.iterator()     // Catch:{ brs -> 0x061a }
        L_0x043a:
            boolean r13 = r8.hasNext()     // Catch:{ brs -> 0x061a }
            if (r13 == 0) goto L_0x05e8
            java.lang.Object r13 = r8.next()     // Catch:{ brs -> 0x061a }
            brd r13 = (defpackage.brd) r13     // Catch:{ brs -> 0x061a }
            brg r16 = defpackage.brg.d     // Catch:{ brs -> 0x061a }
            aucd r12 = r16.o()     // Catch:{ brs -> 0x061a }
            java.lang.String r3 = r13.c     // Catch:{ brs -> 0x061a }
            boolean r5 = r12.c     // Catch:{ brs -> 0x061a }
            if (r5 != 0) goto L_0x0453
            goto L_0x0459
        L_0x0453:
            r12.c()     // Catch:{ brs -> 0x061a }
            r5 = 0
            r12.c = r5     // Catch:{ brs -> 0x061a }
        L_0x0459:
            aucj r5 = r12.b     // Catch:{ brs -> 0x061a }
            brg r5 = (defpackage.brg) r5     // Catch:{ brs -> 0x061a }
            r3.getClass()     // Catch:{ brs -> 0x061a }
            r18 = r8
            int r8 = r5.a     // Catch:{ brs -> 0x061a }
            r17 = 1
            r8 = r8 | 1
            r5.a = r8     // Catch:{ brs -> 0x061a }
            r5.b = r3     // Catch:{ brs -> 0x061a }
            aucj r3 = r12.i()     // Catch:{ brs -> 0x061a }
            brg r3 = (defpackage.brg) r3     // Catch:{ brs -> 0x061a }
            java.util.Comparator r5 = defpackage.bqy.g     // Catch:{ brs -> 0x061a }
            int r3 = java.util.Collections.binarySearch(r15, r3, r5)     // Catch:{ brs -> 0x061a }
            if (r3 < 0) goto L_0x0581
            java.lang.Object r5 = r15.get(r3)     // Catch:{ brs -> 0x061a }
            brg r5 = (defpackage.brg) r5     // Catch:{ brs -> 0x061a }
            aucx r5 = r5.c     // Catch:{ brs -> 0x061a }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ brs -> 0x061a }
            r8.<init>(r5)     // Catch:{ brs -> 0x061a }
            brf r12 = defpackage.brf.d     // Catch:{ brs -> 0x061a }
            aucd r12 = r12.o()     // Catch:{ brs -> 0x061a }
            r19 = r2
            java.lang.String r2 = r13.d     // Catch:{ brs -> 0x057e }
            r20 = r4
            boolean r4 = r12.c     // Catch:{ brs -> 0x065d }
            if (r4 != 0) goto L_0x0498
            goto L_0x049e
        L_0x0498:
            r12.c()     // Catch:{ brs -> 0x065d }
            r4 = 0
            r12.c = r4     // Catch:{ brs -> 0x065d }
        L_0x049e:
            aucj r4 = r12.b     // Catch:{ brs -> 0x065d }
            brf r4 = (defpackage.brf) r4     // Catch:{ brs -> 0x065d }
            r2.getClass()     // Catch:{ brs -> 0x065d }
            int r1 = r4.a     // Catch:{ brs -> 0x065d }
            r17 = 1
            r1 = r1 | 1
            r4.a = r1     // Catch:{ brs -> 0x065d }
            r4.b = r2     // Catch:{ brs -> 0x065d }
            aucj r1 = r12.i()     // Catch:{ brs -> 0x065d }
            brf r1 = (defpackage.brf) r1     // Catch:{ brs -> 0x065d }
            java.util.Comparator r2 = defpackage.bqy.h     // Catch:{ brs -> 0x065d }
            int r1 = java.util.Collections.binarySearch(r8, r1, r2)     // Catch:{ brs -> 0x065d }
            if (r1 < 0) goto L_0x052c
            java.lang.Object r2 = r5.get(r1)     // Catch:{ brs -> 0x065d }
            brf r2 = (defpackage.brf) r2     // Catch:{ brs -> 0x065d }
            aucx r2 = r2.c     // Catch:{ brs -> 0x065d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ brs -> 0x065d }
            r4.<init>(r2)     // Catch:{ brs -> 0x065d }
            bre r2 = defpackage.brt.a((defpackage.brd) r13)     // Catch:{ brs -> 0x065d }
            java.util.Comparator r12 = defpackage.bqy.i     // Catch:{ brs -> 0x065d }
            int r12 = java.util.Collections.binarySearch(r4, r2, r12)     // Catch:{ brs -> 0x065d }
            if (r12 < 0) goto L_0x04f4
            brs r1 = new brs     // Catch:{ brs -> 0x065d }
            java.lang.String r2 = "Duplicate ModuleIntentOperation: "
            java.lang.String r3 = r13.b     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ brs -> 0x065d }
            int r4 = r3.length()     // Catch:{ brs -> 0x065d }
            if (r4 != 0) goto L_0x04ec
            java.lang.String r3 = new java.lang.String     // Catch:{ brs -> 0x065d }
            r3.<init>(r2)     // Catch:{ brs -> 0x065d }
            goto L_0x04f0
        L_0x04ec:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ brs -> 0x065d }
        L_0x04f0:
            r1.<init>(r3)     // Catch:{ brs -> 0x065d }
            throw r1     // Catch:{ brs -> 0x065d }
        L_0x04f4:
            int r12 = -r12
            int r12 = r12 + -1
            r4.add(r12, r2)     // Catch:{ brs -> 0x065d }
            java.lang.Object r2 = r5.get(r1)     // Catch:{ brs -> 0x065d }
            brf r2 = (defpackage.brf) r2     // Catch:{ brs -> 0x065d }
            r5 = 5
            java.lang.Object r12 = r2.c(r5)     // Catch:{ brs -> 0x065d }
            aucd r12 = (defpackage.aucd) r12     // Catch:{ brs -> 0x065d }
            r12.a((defpackage.aucj) r2)     // Catch:{ brs -> 0x065d }
            boolean r2 = r12.c     // Catch:{ brs -> 0x065d }
            if (r2 != 0) goto L_0x050f
            goto L_0x0515
        L_0x050f:
            r12.c()     // Catch:{ brs -> 0x065d }
            r2 = 0
            r12.c = r2     // Catch:{ brs -> 0x07e1 }
        L_0x0515:
            aucj r2 = r12.b     // Catch:{ brs -> 0x065d }
            brf r2 = (defpackage.brf) r2     // Catch:{ brs -> 0x065d }
            aucx r5 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r2.c = r5     // Catch:{ brs -> 0x065d }
            r12.m((java.lang.Iterable) r4)     // Catch:{ brs -> 0x065d }
            aucj r2 = r12.i()     // Catch:{ brs -> 0x065d }
            brf r2 = (defpackage.brf) r2     // Catch:{ brs -> 0x065d }
            r8.set(r1, r2)     // Catch:{ brs -> 0x065d }
            goto L_0x053f
        L_0x052c:
            bre r2 = defpackage.brt.a((defpackage.brd) r13)     // Catch:{ brs -> 0x065d }
            r12.a((defpackage.bre) r2)     // Catch:{ brs -> 0x065d }
            int r1 = -r1
            int r1 = r1 + -1
            aucj r2 = r12.i()     // Catch:{ brs -> 0x065d }
            brf r2 = (defpackage.brf) r2     // Catch:{ brs -> 0x065d }
            r8.add(r1, r2)     // Catch:{ brs -> 0x065d }
        L_0x053f:
            java.lang.Object r1 = r15.get(r3)     // Catch:{ brs -> 0x065d }
            brg r1 = (defpackage.brg) r1     // Catch:{ brs -> 0x065d }
            r2 = 5
            java.lang.Object r4 = r1.c(r2)     // Catch:{ brs -> 0x065d }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ brs -> 0x065d }
            r4.a((defpackage.aucj) r1)     // Catch:{ brs -> 0x065d }
            boolean r1 = r4.c     // Catch:{ brs -> 0x065d }
            if (r1 != 0) goto L_0x0554
            goto L_0x055a
        L_0x0554:
            r4.c()     // Catch:{ brs -> 0x065d }
            r1 = 0
            r4.c = r1     // Catch:{ brs -> 0x065d }
        L_0x055a:
            aucj r1 = r4.b     // Catch:{ brs -> 0x065d }
            brg r1 = (defpackage.brg) r1     // Catch:{ brs -> 0x065d }
            aucx r2 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r1.c = r2     // Catch:{ brs -> 0x065d }
            r4.n((java.lang.Iterable) r8)     // Catch:{ brs -> 0x065d }
            aucj r1 = r4.i()     // Catch:{ brs -> 0x065d }
            brg r1 = (defpackage.brg) r1     // Catch:{ brs -> 0x065d }
            r15.set(r3, r1)     // Catch:{ brs -> 0x065d }
            r1 = r22
            r5 = r23
            r8 = r18
            r2 = r19
            r4 = r20
            r3 = 0
            r12 = 1
            goto L_0x043a
        L_0x057e:
            r0 = move-exception
            goto L_0x061d
        L_0x0581:
            r19 = r2
            r20 = r4
            brf r1 = defpackage.brf.d     // Catch:{ brs -> 0x065d }
            aucd r1 = r1.o()     // Catch:{ brs -> 0x065d }
            java.lang.String r2 = r13.d     // Catch:{ brs -> 0x065d }
            boolean r4 = r1.c     // Catch:{ brs -> 0x065d }
            if (r4 != 0) goto L_0x0592
            goto L_0x0598
        L_0x0592:
            r1.c()     // Catch:{ brs -> 0x065d }
            r4 = 0
            r1.c = r4     // Catch:{ brs -> 0x065d }
        L_0x0598:
            aucj r4 = r1.b     // Catch:{ brs -> 0x065d }
            brf r4 = (defpackage.brf) r4     // Catch:{ brs -> 0x065d }
            r2.getClass()     // Catch:{ brs -> 0x065d }
            int r5 = r4.a     // Catch:{ brs -> 0x065d }
            r8 = 1
            r5 = r5 | r8
            r4.a = r5     // Catch:{ brs -> 0x065d }
            r4.b = r2     // Catch:{ brs -> 0x065d }
            bre r2 = defpackage.brt.a((defpackage.brd) r13)     // Catch:{ brs -> 0x065d }
            r1.a((defpackage.bre) r2)     // Catch:{ brs -> 0x065d }
            aucj r1 = r1.i()     // Catch:{ brs -> 0x065d }
            brf r1 = (defpackage.brf) r1     // Catch:{ brs -> 0x065d }
            boolean r2 = r12.c     // Catch:{ brs -> 0x065d }
            if (r2 != 0) goto L_0x05b9
            goto L_0x05bf
        L_0x05b9:
            r12.c()     // Catch:{ brs -> 0x065d }
            r2 = 0
            r12.c = r2     // Catch:{ brs -> 0x07e1 }
        L_0x05bf:
            aucj r2 = r12.b     // Catch:{ brs -> 0x065d }
            brg r2 = (defpackage.brg) r2     // Catch:{ brs -> 0x065d }
            r1.getClass()     // Catch:{ brs -> 0x065d }
            r2.a()     // Catch:{ brs -> 0x065d }
            aucx r2 = r2.c     // Catch:{ brs -> 0x065d }
            r2.add(r1)     // Catch:{ brs -> 0x065d }
            int r1 = -r3
            int r1 = r1 + -1
            aucj r2 = r12.i()     // Catch:{ brs -> 0x065d }
            brg r2 = (defpackage.brg) r2     // Catch:{ brs -> 0x065d }
            r15.add(r1, r2)     // Catch:{ brs -> 0x065d }
            r1 = r22
            r5 = r23
            r8 = r18
            r2 = r19
            r4 = r20
            r3 = 0
            r12 = 1
            goto L_0x043a
        L_0x05e8:
            r19 = r2
            r20 = r4
            boolean r1 = r11.c     // Catch:{ brs -> 0x065d }
            if (r1 != 0) goto L_0x05f1
            goto L_0x05f7
        L_0x05f1:
            r11.c()     // Catch:{ brs -> 0x065d }
            r1 = 0
            r11.c = r1     // Catch:{ brs -> 0x065d }
        L_0x05f7:
            aucj r1 = r11.b     // Catch:{ brs -> 0x065d }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x065d }
            aucx r2 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r1.l = r2     // Catch:{ brs -> 0x065d }
            boolean r1 = r11.c     // Catch:{ brs -> 0x065d }
            if (r1 != 0) goto L_0x0606
            goto L_0x060c
        L_0x0606:
            r11.c()     // Catch:{ brs -> 0x065d }
            r1 = 0
            r11.c = r1     // Catch:{ brs -> 0x065d }
        L_0x060c:
            aucj r1 = r11.b     // Catch:{ brs -> 0x065d }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x065d }
            aucx r2 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r1.n = r2     // Catch:{ brs -> 0x065d }
            r11.q((java.lang.Iterable) r15)     // Catch:{ brs -> 0x065d }
            goto L_0x0626
        L_0x061a:
            r0 = move-exception
            r19 = r2
        L_0x061d:
            r20 = r4
        L_0x061f:
            r1 = r0
            goto L_0x0259
        L_0x0622:
            r19 = r2
            r20 = r4
        L_0x0626:
            aucj r1 = r11.b     // Catch:{ brs -> 0x07b8 }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x07b8 }
            aucx r1 = r1.p     // Catch:{ brs -> 0x07b8 }
            int r1 = r1.size()     // Catch:{ brs -> 0x07b8 }
            if (r1 <= 0) goto L_0x065f
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ brs -> 0x065d }
            aucj r2 = r11.b     // Catch:{ brs -> 0x065d }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x065d }
            aucx r2 = r2.p     // Catch:{ brs -> 0x065d }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ brs -> 0x065d }
            java.util.List r1 = defpackage.brt.c(r1, r2)     // Catch:{ brs -> 0x065d }
            boolean r2 = r11.c     // Catch:{ brs -> 0x065d }
            if (r2 != 0) goto L_0x0649
            goto L_0x064f
        L_0x0649:
            r11.c()     // Catch:{ brs -> 0x065d }
            r2 = 0
            r11.c = r2     // Catch:{ brs -> 0x07e1 }
        L_0x064f:
            aucj r2 = r11.b     // Catch:{ brs -> 0x065d }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x065d }
            aucx r3 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r2.p = r3     // Catch:{ brs -> 0x065d }
            r11.p((java.lang.Iterable) r1)     // Catch:{ brs -> 0x065d }
            goto L_0x065f
        L_0x065d:
            r0 = move-exception
            goto L_0x061f
        L_0x065f:
            aucj r1 = r11.b     // Catch:{ brs -> 0x07b8 }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x07b8 }
            aucx r1 = r1.k     // Catch:{ brs -> 0x07b8 }
            int r1 = r1.size()     // Catch:{ brs -> 0x07b8 }
            r2 = 1
            if (r1 <= r2) goto L_0x06e2
            aucj r1 = r11.b     // Catch:{ brs -> 0x065d }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x065d }
            aucx r1 = r1.k     // Catch:{ brs -> 0x065d }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ brs -> 0x065d }
            java.util.Comparator r2 = defpackage.bqy.j     // Catch:{ brs -> 0x065d }
            java.util.List r1 = defpackage.brt.a((java.util.List) r1, (java.util.Comparator) r2)     // Catch:{ brs -> 0x065d }
            boolean r2 = r11.c     // Catch:{ brs -> 0x065d }
            if (r2 != 0) goto L_0x0681
            goto L_0x0687
        L_0x0681:
            r11.c()     // Catch:{ brs -> 0x065d }
            r2 = 0
            r11.c = r2     // Catch:{ brs -> 0x07e1 }
        L_0x0687:
            aucj r2 = r11.b     // Catch:{ brs -> 0x065d }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x065d }
            aucx r3 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r2.k = r3     // Catch:{ brs -> 0x065d }
            r11.t((java.lang.Iterable) r1)     // Catch:{ brs -> 0x065d }
            r1 = 0
            brn r2 = r11.j((int) r1)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r2.b     // Catch:{ brs -> 0x065d }
            r2 = 1
        L_0x069c:
            aucj r3 = r11.b     // Catch:{ brs -> 0x065d }
            brl r3 = (defpackage.brl) r3     // Catch:{ brs -> 0x065d }
            aucx r3 = r3.k     // Catch:{ brs -> 0x065d }
            int r3 = r3.size()     // Catch:{ brs -> 0x065d }
            if (r2 < r3) goto L_0x06a9
            goto L_0x06e2
        L_0x06a9:
            brn r3 = r11.j((int) r2)     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = r3.b     // Catch:{ brs -> 0x065d }
            boolean r3 = r3.equals(r1)     // Catch:{ brs -> 0x065d }
            if (r3 != 0) goto L_0x06be
            brn r1 = r11.j((int) r2)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r1.b     // Catch:{ brs -> 0x065d }
            int r2 = r2 + 1
            goto L_0x069c
        L_0x06be:
            brs r2 = new brs     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x065d }
            int r3 = r3.length()     // Catch:{ brs -> 0x065d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ brs -> 0x065d }
            int r3 = r3 + 48
            r4.<init>(r3)     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = "Multiple providers tied to container-provider '"
            r4.append(r3)     // Catch:{ brs -> 0x065d }
            r4.append(r1)     // Catch:{ brs -> 0x065d }
            r4.append(r14)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r4.toString()     // Catch:{ brs -> 0x065d }
            r2.<init>(r1)     // Catch:{ brs -> 0x065d }
            throw r2     // Catch:{ brs -> 0x065d }
        L_0x06e2:
            aucj r1 = r11.b     // Catch:{ brs -> 0x07b8 }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x07b8 }
            aucx r1 = r1.t     // Catch:{ brs -> 0x07b8 }
            int r1 = r1.size()     // Catch:{ brs -> 0x07b8 }
            r2 = 1
            if (r1 <= r2) goto L_0x0765
            aucj r1 = r11.b     // Catch:{ brs -> 0x065d }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x065d }
            aucx r1 = r1.t     // Catch:{ brs -> 0x065d }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ brs -> 0x065d }
            java.util.Comparator r3 = defpackage.bqy.k     // Catch:{ brs -> 0x065d }
            java.util.List r1 = defpackage.brt.a((java.util.List) r1, (java.util.Comparator) r3)     // Catch:{ brs -> 0x065d }
            boolean r3 = r11.c     // Catch:{ brs -> 0x065d }
            if (r3 != 0) goto L_0x0704
            goto L_0x070a
        L_0x0704:
            r11.c()     // Catch:{ brs -> 0x065d }
            r3 = 0
            r11.c = r3     // Catch:{ brs -> 0x065d }
        L_0x070a:
            aucj r3 = r11.b     // Catch:{ brs -> 0x065d }
            brl r3 = (defpackage.brl) r3     // Catch:{ brs -> 0x065d }
            aucx r4 = defpackage.aucj.s()     // Catch:{ brs -> 0x065d }
            r3.t = r4     // Catch:{ brs -> 0x065d }
            r11.x((java.lang.Iterable) r1)     // Catch:{ brs -> 0x065d }
            r1 = 0
            brr r3 = r11.o((int) r1)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r3.b     // Catch:{ brs -> 0x065d }
            r12 = 1
        L_0x071f:
            aucj r2 = r11.b     // Catch:{ brs -> 0x065d }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x065d }
            aucx r2 = r2.t     // Catch:{ brs -> 0x065d }
            int r2 = r2.size()     // Catch:{ brs -> 0x065d }
            if (r12 < r2) goto L_0x072c
            goto L_0x0765
        L_0x072c:
            brr r2 = r11.o((int) r12)     // Catch:{ brs -> 0x065d }
            java.lang.String r2 = r2.b     // Catch:{ brs -> 0x065d }
            boolean r2 = r2.equals(r1)     // Catch:{ brs -> 0x065d }
            if (r2 != 0) goto L_0x0741
            brr r1 = r11.o((int) r12)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r1.b     // Catch:{ brs -> 0x065d }
            int r12 = r12 + 1
            goto L_0x071f
        L_0x0741:
            brs r2 = new brs     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ brs -> 0x065d }
            int r3 = r3.length()     // Catch:{ brs -> 0x065d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ brs -> 0x065d }
            int r3 = r3 + 60
            r4.<init>(r3)     // Catch:{ brs -> 0x065d }
            java.lang.String r3 = "Multiple slice-providers tied to container-slice-provider '"
            r4.append(r3)     // Catch:{ brs -> 0x065d }
            r4.append(r1)     // Catch:{ brs -> 0x065d }
            r4.append(r14)     // Catch:{ brs -> 0x065d }
            java.lang.String r1 = r4.toString()     // Catch:{ brs -> 0x065d }
            r2.<init>(r1)     // Catch:{ brs -> 0x065d }
            throw r2     // Catch:{ brs -> 0x065d }
        L_0x0765:
            aucj r1 = r11.b     // Catch:{ brs -> 0x07b8 }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x07b8 }
            aucx r1 = r1.k     // Catch:{ brs -> 0x07b8 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ brs -> 0x07b8 }
            aucj r2 = r11.b     // Catch:{ brs -> 0x07b8 }
            brl r2 = (defpackage.brl) r2     // Catch:{ brs -> 0x07b8 }
            aucx r2 = r2.t     // Catch:{ brs -> 0x07b8 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ brs -> 0x07b8 }
            defpackage.brt.b((java.util.List) r1, (java.util.List) r2)     // Catch:{ brs -> 0x07b8 }
            aucj r1 = r11.i()     // Catch:{ brs -> 0x07b8 }
            brl r1 = (defpackage.brl) r1     // Catch:{ brs -> 0x07b8 }
            boolean r2 = r9.c     // Catch:{ brs -> 0x07b8 }
            if (r2 != 0) goto L_0x0788
            r2 = 0
            goto L_0x078e
        L_0x0788:
            r9.c()     // Catch:{ brs -> 0x07b8 }
            r2 = 0
            r9.c = r2     // Catch:{ brs -> 0x07e1 }
        L_0x078e:
            aucj r3 = r9.b     // Catch:{ brs -> 0x07e1 }
            brh r3 = (defpackage.brh) r3     // Catch:{ brs -> 0x07e1 }
            r1.getClass()     // Catch:{ brs -> 0x07e1 }
            aucx r4 = r3.a     // Catch:{ brs -> 0x07e1 }
            boolean r4 = r4.a()     // Catch:{ brs -> 0x07e1 }
            if (r4 != 0) goto L_0x07a5
            aucx r4 = r3.a     // Catch:{ brs -> 0x07e1 }
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)     // Catch:{ brs -> 0x07e1 }
            r3.a = r4     // Catch:{ brs -> 0x07e1 }
        L_0x07a5:
            aucx r3 = r3.a     // Catch:{ brs -> 0x07e1 }
            r3.set(r7, r1)     // Catch:{ brs -> 0x07e1 }
            int r7 = r7 + 1
            r1 = r22
            r5 = r23
            r2 = r19
            r4 = r20
            r3 = 0
            r8 = 5
            goto L_0x0065
        L_0x07b8:
            r0 = move-exception
            goto L_0x07e8
        L_0x07ba:
            r19 = r2
            r20 = r4
            r2 = 0
            brs r1 = new brs     // Catch:{ brs -> 0x07e1 }
            java.lang.String r3 = "Missing required <uses-module-api>"
            r1.<init>(r3)     // Catch:{ brs -> 0x07e1 }
            throw r1     // Catch:{ brs -> 0x07e1 }
        L_0x07c7:
            r19 = r2
            r20 = r4
            r2 = 0
            brs r1 = new brs     // Catch:{ brs -> 0x07e1 }
            java.lang.String r3 = "Missing required module version"
            r1.<init>(r3)     // Catch:{ brs -> 0x07e1 }
            throw r1     // Catch:{ brs -> 0x07e1 }
        L_0x07d4:
            r19 = r2
            r20 = r4
            r2 = 0
            brs r1 = new brs     // Catch:{ brs -> 0x07e1 }
            java.lang.String r3 = "Missing required module ID"
            r1.<init>(r3)     // Catch:{ brs -> 0x07e1 }
            throw r1     // Catch:{ brs -> 0x07e1 }
        L_0x07e1:
            r0 = move-exception
            goto L_0x07e9
        L_0x07e3:
            r0 = move-exception
            r19 = r2
            r20 = r4
        L_0x07e8:
            r2 = 0
        L_0x07e9:
            r1 = r0
        L_0x07ea:
            java.lang.String r3 = r10.b
            java.lang.String r4 = defpackage.bkd.a(r6)
            java.lang.String r5 = r1.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r7 = r7 + 65
            int r7 = r7 + r8
            int r7 = r7 + r10
            r11.<init>(r7)
            java.lang.String r7 = "Manifest for module '"
            r11.append(r7)
            r11.append(r3)
            java.lang.String r3 = "' from "
            r11.append(r3)
            r11.append(r4)
            java.lang.String r3 = " is malformed. Ignore the whole APK: "
            r11.append(r3)
            r11.append(r5)
            java.lang.String r3 = r11.toString()
            r4 = r22
            r4.b((java.lang.String) r3)
            bke r3 = new bke
            java.lang.String r1 = r1.getMessage()
            r5 = 5
            r3.<init>(r5, r1)
            r4.a((defpackage.bnm) r6, (defpackage.bke) r3)
        L_0x0843:
            java.util.Map r1 = r4.j
            aucj r3 = r9.i()
            brh r3 = (defpackage.brh) r3
            r1.put(r6, r3)
            goto L_0x0855
        L_0x084f:
            r19 = r2
            r20 = r4
            r2 = 0
            r4 = r1
        L_0x0855:
            int r1 = r20 + 1
            r2 = r19
            r3 = 0
            r21 = r4
            r4 = r1
            r1 = r21
            goto L_0x000b
        L_0x0861:
            r4 = r1
            r19 = r2
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnt.a(java.util.List, boolean):java.util.ArrayList");
    }
}
