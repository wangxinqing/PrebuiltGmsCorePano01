package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aaxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxx {
    private static final Set g = new HashSet(Arrays.asList(new Integer[]{1, 2, 3}));
    private static final byte[][] h = {new byte[]{-16, -3, 108, 91, 65, 15, 37, -53, 37, -61, -75, 51, 70, -56, -105, 47, -82, 48, -8, -18, 116, 17, -33, -111, 4, Byte.MIN_VALUE, -83, 107, 45, 96, -37, -125}, new byte[]{61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74}, new byte[]{124, -86, -74, -26, -70, 112, 14, 13, -36, -9, 92, -54, 82, -72, -61, -79, -102, 60, 125, 35, 48, -113, 126, -79, 119, -90, 78, -78, 71, 97, -105, -67}};
    public final Context a;
    public final aayc b;
    public final aayx c;
    public SparseIntArray d;
    public final anax e;
    public int[] f;

    static {
        aaxx.class.getCanonicalName();
    }

    public aaxx(Context context, aayc aayc, aayx aayx) {
        int length;
        this.a = context;
        this.b = aayc;
        this.c = aayx;
        String a2 = aayc.b.a("report_event_logs");
        if (!TextUtils.isEmpty(a2)) {
            String[] split = a2.split(",");
            this.f = new int[(split.length + 1)];
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.d = sparseIntArray;
            sparseIntArray.put(1397638484, 3);
            int i = 0;
            while (true) {
                length = split.length;
                if (i >= length) {
                    break;
                }
                try {
                    String[] split2 = split[i].split(":");
                    if (split2.length == 2) {
                        String str = split2[0];
                        int parseInt = Integer.parseInt(split2[1]);
                        if (parseInt == 3) {
                            this.f[i] = 1397638484;
                        } else if (g.contains(Integer.valueOf(parseInt))) {
                            int parseInt2 = Integer.parseInt(str);
                            this.f[i] = parseInt2;
                            if (this.d.get(parseInt2, -1) == -1) {
                                this.d.put(parseInt2, parseInt);
                            }
                        } else {
                            this.f[i] = -1;
                        }
                    } else {
                        this.f[i] = -1;
                    }
                } catch (NumberFormatException e2) {
                    this.f[i] = -1;
                }
                i++;
            }
            this.f[length] = 1397638484;
        }
        String m = azfv.a.a().m();
        if (!TextUtils.isEmpty(m)) {
            HashSet hashSet = new HashSet();
            for (String trim : amsk.a(',').a((CharSequence) m)) {
                String trim2 = trim.trim();
                if (!TextUtils.isEmpty(trim2) && !hashSet.contains(trim2)) {
                    hashSet.add(trim2);
                }
            }
            this.e = anax.a((Collection) hashSet);
            return;
        }
        this.e = anfv.a;
    }

    public static List a(String[] strArr, aaxh aaxh) {
        aaxf aaxf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (azfv.n()) {
                aaxf = aaxh.a(str, true);
            } else {
                aaxf = aaxh.a(str, false);
            }
            if (aaxf != null) {
                arrayList.add(aaxf);
            }
        }
        return arrayList;
    }

    static void a(String str) {
        if (str != null) {
            EventLog.writeEvent(1397638484, new Object[]{"do-not-log-execution-checkpoint-tag", -1, str});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r13 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final defpackage.aaxs b(long r16) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            aaxs r1 = new aaxs
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            int[] r4 = new int[r3]     // Catch:{ IOException -> 0x019e }
            r5 = 524292(0x80004, float:7.3469E-40)
            r6 = 0
            r4[r6] = r5     // Catch:{ IOException -> 0x019e }
            android.util.EventLog.readEvents(r4, r2)     // Catch:{ IOException -> 0x019e }
            int r4 = r2.size()
            r7 = -1
            r9 = 0
        L_0x0029:
            if (r9 >= r4) goto L_0x0138
            java.lang.Object r7 = r2.get(r9)
            android.util.EventLog$Event r7 = (android.util.EventLog.Event) r7
            long r10 = r7.getTimeNanos()
            java.lang.Object r8 = r7.getData()
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x003f
            goto L_0x0130
        L_0x003f:
            int r7 = r7.getTag()
            if (r7 != r5) goto L_0x0130
            boolean r7 = r8 instanceof java.lang.Object[]
            if (r7 == 0) goto L_0x0130
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r7 = 0
        L_0x004c:
            int r12 = r8.length
            int r12 = r12 + -1
            if (r7 >= r12) goto L_0x0078
            r12 = r8[r7]
            int r14 = r7 + 1
            r14 = r8[r14]
            boolean r15 = r12 instanceof java.lang.Integer
            if (r15 == 0) goto L_0x0075
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r15 = 1514(0x5ea, float:2.122E-42)
            if (r12 == r15) goto L_0x0066
            goto L_0x0075
        L_0x0066:
            boolean r7 = r14 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x0078
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r7 = r14.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0079
        L_0x0075:
            int r7 = r7 + 2
            goto L_0x004c
        L_0x0078:
            r7 = 0
        L_0x0079:
            r12 = 0
        L_0x007a:
            int r14 = r8.length
            int r14 = r14 + -1
            if (r12 >= r14) goto L_0x00ac
            r14 = r8[r12]
            int r15 = r12 + 1
            r15 = r8[r15]
            boolean r5 = r14 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x00a6
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r5 = r14.intValue()
            r14 = 757(0x2f5, float:1.061E-42)
            if (r5 == r14) goto L_0x0094
            goto L_0x00a6
        L_0x0094:
            boolean r5 = r15 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x00ac
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r5 = r15.intValue()
            r12 = 1513(0x5e9, float:2.12E-42)
            if (r5 == r12) goto L_0x00a4
            r5 = 0
            goto L_0x00ad
        L_0x00a4:
            r5 = 1
            goto L_0x00ad
        L_0x00a6:
            int r12 = r12 + 2
            r5 = 524292(0x80004, float:7.3469E-40)
            goto L_0x007a
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            r12 = 0
        L_0x00ae:
            int r14 = r8.length
            int r14 = r14 + -1
            if (r12 >= r14) goto L_0x00d3
            r14 = r8[r12]
            int r15 = r12 + 1
            r15 = r8[r15]
            boolean r13 = r14 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x00d0
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = 1526(0x5f6, float:2.138E-42)
            if (r13 == r14) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            boolean r8 = r15 instanceof java.lang.String
            if (r8 == 0) goto L_0x00d3
            r13 = r15
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x00d4
        L_0x00d0:
            int r12 = r12 + 2
            goto L_0x00ae
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            if (r7 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            aars r5 = defpackage.aars.d
            aucd r5 = r5.o()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            r5.c()
            r5.c = r6
        L_0x00ea:
            aucj r8 = r5.b
            aars r8 = (defpackage.aars) r8
            r13.getClass()
            int r12 = r8.a
            r12 = r12 | 2
            r8.a = r12
            r8.c = r13
            int r7 = r7.intValue()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            r5.c()
            r5.c = r6
        L_0x0107:
            aucj r8 = r5.b
            aars r8 = (defpackage.aars) r8
            int r12 = r8.a
            r12 = r12 | r3
            r8.a = r12
            r8.b = r7
            aucj r5 = r5.i()
            aars r5 = (defpackage.aars) r5
            java.lang.Object r7 = r0.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x0124
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
        L_0x0124:
            int r7 = r7.intValue()
            int r7 = r7 + r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r5, r7)
        L_0x0130:
            int r9 = r9 + 1
            r7 = r10
            r5 = 524292(0x80004, float:7.3469E-40)
            goto L_0x0029
        L_0x0138:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0140:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x019b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            aarr r4 = defpackage.aarr.d
            aucd r4 = r4.o()
            java.lang.Object r5 = r2.getKey()
            aars r5 = (defpackage.aars) r5
            boolean r9 = r4.c
            if (r9 == 0) goto L_0x0161
            r4.c()
            r4.c = r6
        L_0x0161:
            aucj r9 = r4.b
            aarr r9 = (defpackage.aarr) r9
            r5.getClass()
            r9.b = r5
            int r5 = r9.a
            r5 = r5 | r3
            r9.a = r5
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x017e
            goto L_0x0183
        L_0x017e:
            r4.c()
            r4.c = r6
        L_0x0183:
            aucj r5 = r4.b
            aarr r5 = (defpackage.aarr) r5
            int r9 = r5.a
            r9 = r9 | 2
            r5.a = r9
            r5.c = r2
            aucj r2 = r4.i()
            aarr r2 = (defpackage.aarr) r2
            java.util.List r4 = r1.b
            r4.add(r2)
            goto L_0x0140
        L_0x019b:
            r1.a = r7
            return r1
        L_0x019e:
            r0 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxx.b(long):aaxs");
    }

    public static boolean a(aaxf aaxf) {
        byte[] bArr;
        byte[][] bArr2 = aaxf.c;
        if (!(bArr2 == null || bArr2.length != 1 || (bArr = bArr2[0]) == null)) {
            for (byte[] equals : h) {
                if (Arrays.equals(bArr, equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aaxt a(long r17) {
        /*
            r16 = this;
            r1 = r16
            aaxt r2 = new aaxt
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r0 = r1.f     // Catch:{ IOException -> 0x013a }
            android.util.EventLog.readEvents(r0, r3)     // Catch:{ IOException -> 0x013a }
            int r4 = r3.size()
            r5 = -1
            r7 = 0
            r8 = 0
        L_0x0020:
            if (r8 >= r4) goto L_0x0137
            java.lang.Object r0 = r3.get(r8)
            android.util.EventLog$Event r0 = (android.util.EventLog.Event) r0
            long r5 = r0.getTimeNanos()
            int r9 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x0133
            aart r9 = defpackage.aart.g
            aucd r9 = r9.o()
            int r10 = r0.getTag()
            boolean r11 = r9.c
            if (r11 == 0) goto L_0x0043
            r9.c()
            r9.c = r7
        L_0x0043:
            aucj r11 = r9.b
            aart r11 = (defpackage.aart) r11
            int r12 = r11.a
            r13 = 1
            r12 = r12 | r13
            r11.a = r12
            r11.b = r10
            long r10 = r0.getTimeNanos()
            boolean r12 = r9.c
            if (r12 == 0) goto L_0x005c
            r9.c()
            r9.c = r7
        L_0x005c:
            aucj r12 = r9.b
            aart r12 = (defpackage.aart) r12
            int r14 = r12.a
            r14 = r14 | 4
            r12.a = r14
            r12.d = r10
            android.util.SparseIntArray r10 = r1.d
            int r11 = r0.getTag()
            int r10 = r10.get(r11)
            r11 = 2
            if (r10 == r11) goto L_0x0100
            r12 = 3
            if (r10 == r12) goto L_0x007a
            goto L_0x0133
        L_0x007a:
            aaxw r10 = new aaxw
            r10.<init>()
            r14 = 0
            java.lang.Object r0 = r0.getData()     // Catch:{ ClassCastException -> 0x00b3 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ ClassCastException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b1
            int r15 = r0.length
            if (r15 != r12) goto L_0x00b1
            r12 = r0[r7]
            boolean r15 = r12 instanceof java.lang.String
            if (r15 == 0) goto L_0x00b1
            java.lang.String r12 = (java.lang.String) r12
            r10.b = r12
            r12 = r0[r13]
            boolean r13 = r12 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x00a2
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            goto L_0x00a3
        L_0x00a2:
            r12 = -1
        L_0x00a3:
            r10.a = r12
            r0 = r0[r11]
            boolean r12 = r0 instanceof java.lang.String
            if (r12 == 0) goto L_0x00b0
            java.lang.String r0 = (java.lang.String) r0
            r10.c = r0
            goto L_0x00b5
        L_0x00b0:
            goto L_0x00b5
        L_0x00b1:
            r10 = r14
            goto L_0x00b5
        L_0x00b3:
            r0 = move-exception
            r10 = r14
        L_0x00b5:
            if (r10 == 0) goto L_0x0133
            java.lang.String r0 = r10.b
            java.lang.String r12 = "do-not-log-"
            boolean r0 = r0.startsWith(r12)
            if (r0 != 0) goto L_0x0133
            boolean r0 = defpackage.azfv.x()
            if (r0 != 0) goto L_0x00c8
            goto L_0x00d2
        L_0x00c8:
            anax r0 = r1.e
            java.lang.String r12 = r10.b
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0133
        L_0x00d2:
            java.lang.String r0 = r10.b
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r9.c()
            r9.c = r7
        L_0x00de:
            aucj r12 = r9.b
            aart r12 = (defpackage.aart) r12
            r0.getClass()
            int r13 = r12.a
            r11 = r11 | r13
            r12.a = r11
            r12.c = r0
            int r0 = r10.a
            r11 = r11 | 8
            r12.a = r11
            r12.e = r0
            java.lang.String r0 = r10.c
            r0.getClass()
            r10 = r11 | 16
            r12.a = r10
            r12.f = r0
            goto L_0x0128
        L_0x0100:
            java.lang.Object r10 = r0.getData()
            boolean r10 = r10 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0133
            java.lang.Object r0 = r0.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            r9.c()
            r9.c = r7
        L_0x011c:
            aucj r10 = r9.b
            aart r10 = (defpackage.aart) r10
            int r11 = r10.a
            r11 = r11 | 8
            r10.a = r11
            r10.e = r0
        L_0x0128:
            java.util.List r0 = r2.b
            aucj r9 = r9.i()
            aart r9 = (defpackage.aart) r9
            r0.add(r9)
        L_0x0133:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0137:
            r2.a = r5
            return r2
        L_0x013a:
            r0 = move-exception
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxx.a(long):aaxt");
    }

    /* access modifiers changed from: package-private */
    public final List a(List list) {
        aaxh aaxh = new aaxh(this.a, this.b);
        PackageManager packageManager = this.a.getPackageManager();
        amxc p = amxc.p();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aarr aarr = (aarr) list.get(i);
            aars aars = aarr.b;
            if (aars == null) {
                aars = aars.d;
            }
            Integer valueOf = Integer.valueOf(aars.b);
            aars aars2 = aarr.b;
            if (aars2 == null) {
                aars2 = aars.d;
            }
            p.a((Object) valueOf, (Object) Pair.create(aars2.c, Integer.valueOf(aarr.c)));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : p.o().entrySet()) {
            String[] packagesForUid = packageManager.getPackagesForUid(((Integer) entry.getKey()).intValue());
            if (packagesForUid != null) {
                List a2 = a(packagesForUid, aaxh);
                if (!a2.isEmpty() && !b(a2)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Pair pair : (Collection) entry.getValue()) {
                        arrayList2.add(new aaxi((String) pair.first, ((Integer) pair.second).intValue()));
                    }
                    aaxr aaxr = new aaxr();
                    aaxr.a = a2;
                    aaxr.b = arrayList2;
                    arrayList.add(aaxr);
                }
            }
        }
        return arrayList;
    }

    public static boolean b(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (a((aaxf) list.get(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
