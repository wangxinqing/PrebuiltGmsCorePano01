package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: htr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class htr extends nis {
    static final Integer a = 2;
    static final Integer b = 3;
    private static final byte[][] c = new byte[0][];
    private static final String[] d = new String[0];
    private static final ExperimentTokens e;
    private static final Integer f = 0;
    private static final Integer g = 1;
    private static final Map h;
    private static final amsk i = amsk.a(',');
    private static final amsk j = amsk.a(':');
    private static String k = "";
    private static Map l = Collections.emptyMap();
    private final hsx o;
    private final LogEventParcelable p;
    private final hvh q;
    private final ModuleManager r;
    private final String s;
    private final htl t;
    private final hoj u;

    static {
        byte[][] bArr = c;
        e = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, new int[]{14900290}, (byte[][]) null, (int[]) null);
        Integer num = f;
        Integer num2 = g;
        Integer num3 = a;
        Map b2 = jir.b(4, false);
        b2.put("NONE", num);
        b2.put("NO_IDS", num2);
        b2.put("NO_USER_IDS", num3);
        b2.put("ALL_ON", 3);
        h = Collections.unmodifiableMap(b2);
    }

    public htr(hsx hsx, LogEventParcelable logEventParcelable, hvh hvh, ModuleManager moduleManager, String str, htl htl, hoj hoj) {
        super(40, "LogOperation");
        this.o = hsx;
        this.p = logEventParcelable;
        this.q = hvh;
        this.r = moduleManager;
        this.s = str;
        this.t = htl;
        this.u = hoj;
    }

    public static htq a(Context context, LogEventParcelable logEventParcelable) {
        Context context2 = context;
        LogEventParcelable logEventParcelable2 = logEventParcelable;
        logEventParcelable2.b = hvi.a(logEventParcelable2.j);
        htr htr = new htr((hsx) null, logEventParcelable, (hvh) null, ModuleManager.get(context), context.getPackageName(), new htl(context2), (hoj) null);
        yfg a2 = yfg.a(context);
        avtn a3 = htr.a(context2, logEventParcelable2.a, a2);
        byte[] bArr = logEventParcelable2.b;
        String[] strArr = logEventParcelable2.d;
        int[] iArr = logEventParcelable2.e;
        byte[][] bArr2 = logEventParcelable2.f;
        ExperimentTokens[] experimentTokensArr = logEventParcelable2.g;
        boolean z = logEventParcelable2.h;
        String a4 = hwt.a(logEventParcelable2.a);
        PlayLoggerContext playLoggerContext = logEventParcelable2.a;
        return new htq(a3, htr.a(context2, bArr, new int[0], new int[0], strArr, iArr, bArr2, experimentTokensArr, z, a4, playLoggerContext.h, playLoggerContext.d, (String) null, a2));
    }

    static final void a(Context context, aucd aucd, yfg yfg) {
        long j2;
        if (awta.b()) {
            try {
                j2 = ((Long) acws.a(yef.a(context).a(), awso.b(), TimeUnit.MILLISECONDS)).longValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.e("LogOperation", "Failed to get heterodyne serving version.", e2);
                j2 = 0;
            }
        } else {
            j2 = yfh.a(yfg);
        }
        if (j2 != 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avtn avtn = (avtn) aucd.b;
            avtn avtn2 = avtn.o;
            avtn.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            avtn.m = j2;
        }
    }

    private static void a(hvg hvg, String str, hvd hvd) {
        try {
            hvg.a(str, hvd, 1);
        } catch (SQLiteException | IOException e2) {
            String valueOf = String.valueOf(hvd);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(valueOf).length());
            sb.append("Failed to record log drop for source: ");
            sb.append(str);
            sb.append(" and reason: ");
            sb.append(valueOf);
            Log.e("LogOperation", sb.toString());
        }
    }

    static int[] a(int[] iArr, int[] iArr2) {
        int length;
        int length2;
        if (iArr == null || (length = iArr.length) == 0) {
            return iArr2;
        }
        if (iArr2 == null || (length2 = iArr2.length) == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.auay a(android.content.Context r24, byte[] r25, int[] r26, int[] r27, java.lang.String[] r28, int[] r29, byte[][] r30, com.google.android.gms.phenotype.ExperimentTokens[] r31, boolean r32, java.lang.String r33, boolean r34, java.lang.String r35, java.lang.String r36, defpackage.yfg r37) {
        /*
            r23 = this;
            r1 = r30
            r0 = r31
            r6 = r33
            r2 = r36
            avrm r3 = defpackage.avrm.t
            aucd r3 = r3.o()
            r7 = r3
            aucf r7 = (defpackage.aucf) r7
            r8 = r23
            htl r3 = r8.t
            amsv r3 = r3.c
            java.lang.Object r3 = r3.a()
            avsb r3 = (defpackage.avsb) r3
            boolean r4 = r7.c
            r9 = 0
            if (r4 == 0) goto L_0x0027
            r7.c()
            r7.c = r9
        L_0x0027:
            aucj r4 = r7.b
            avrm r4 = (defpackage.avrm) r4
            r3.getClass()
            r4.r = r3
            int r3 = r4.a
            r5 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r5
            r4.a = r3
            java.lang.Integer r3 = defpackage.hpk.a(r24)
            if (r3 == 0) goto L_0x0059
            int r3 = r3.intValue()
            long r3 = (long) r3
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            r7.c()
            r7.c = r9
        L_0x004c:
            aucj r5 = r7.b
            avrm r5 = (defpackage.avrm) r5
            int r10 = r5.a
            r11 = 2097152(0x200000, float:2.938736E-39)
            r10 = r10 | r11
            r5.a = r10
            r5.q = r3
        L_0x0059:
            if (r26 == 0) goto L_0x0082
            java.util.List r3 = defpackage.aoog.b((int[]) r26)
            boolean r4 = r7.c
            if (r4 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            r7.c()
            r7.c = r9
        L_0x0069:
            aucj r4 = r7.b
            avrm r4 = (defpackage.avrm) r4
            aucs r5 = r4.o
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x007d
            aucs r5 = r4.o
            aucs r5 = defpackage.aucj.a((defpackage.aucs) r5)
            r4.o = r5
        L_0x007d:
            aucs r4 = r4.o
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r4)
        L_0x0082:
            r3 = 1
            if (r2 == 0) goto L_0x00b7
            avrn r4 = defpackage.avrn.d
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r4.c()
            r4.c = r9
        L_0x0095:
            aucj r5 = r4.b
            avrn r5 = (defpackage.avrn) r5
            java.lang.String r10 = "application_id_3p"
            r10.getClass()
            int r11 = r5.a
            r11 = r11 | r3
            r5.a = r11
            r5.b = r10
            r36.getClass()
            r10 = r11 | 2
            r5.a = r10
            r5.c = r2
            aucj r2 = r4.i()
            avrn r2 = (defpackage.avrn) r2
            r7.a((defpackage.avrn) r2)
        L_0x00b7:
            if (r34 == 0) goto L_0x00bb
            goto L_0x0225
        L_0x00bb:
            r10 = 0
            if (r0 == 0) goto L_0x00c8
            int r2 = r0.length
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Collections.addAll(r4, r0)
            goto L_0x00c9
        L_0x00c8:
            r4 = r10
        L_0x00c9:
            java.lang.String r11 = "LogOperation"
            if (r1 != 0) goto L_0x00cf
            r12 = r4
            goto L_0x0106
        L_0x00cf:
            if (r4 != 0) goto L_0x00d8
            int r0 = r1.length
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r4 = r2
        L_0x00d8:
            int r2 = r1.length
            r5 = 0
        L_0x00da:
            if (r5 >= r2) goto L_0x0105
            r12 = r1[r5]
            java.lang.String r0 = new java.lang.String     // Catch:{ RuntimeException -> 0x00ed }
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ RuntimeException -> 0x00ed }
            r0.<init>(r12, r13)     // Catch:{ RuntimeException -> 0x00ed }
            com.google.android.gms.phenotype.ExperimentTokens r0 = com.google.android.gms.phenotype.ExperimentTokens.a((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00ed }
            r4.add(r0)     // Catch:{ RuntimeException -> 0x00ed }
            goto L_0x0102
        L_0x00ed:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r14 = new java.lang.String
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r14.<init>(r12, r15)
            r13[r9] = r14
            java.lang.String r12 = "Could not deserialize %s to valid experiment token."
            java.lang.String r12 = java.lang.String.format(r12, r13)
            android.util.Log.e(r11, r12, r0)
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x00da
        L_0x0105:
            r12 = r4
        L_0x0106:
            if (r6 == 0) goto L_0x011d
            awta r0 = defpackage.awta.a
            awtb r0 = r0.a()
            auib r0 = r0.b()
            aucx r0 = r0.a
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x011d
            r13 = r10
            goto L_0x01ce
        L_0x011d:
            if (r6 == 0) goto L_0x0156
            r3 = 0
            r0 = r23
            r1 = r24
            r2 = r33
            r4 = r35
            r5 = r37
            com.google.android.gms.phenotype.ExperimentTokens r0 = r0.a(r1, r2, r3, r4, r5)
            if (r32 == 0) goto L_0x0132
            r13 = r0
            goto L_0x0157
        L_0x0132:
            if (r0 == 0) goto L_0x0156
            com.google.android.gms.phenotype.ExperimentTokens r1 = new com.google.android.gms.phenotype.ExperimentTokens
            java.lang.String r14 = r0.b
            r15 = 0
            byte[][] r2 = r0.d
            byte[][] r3 = r0.e
            byte[][] r4 = r0.f
            byte[][] r5 = r0.g
            r20 = 0
            r21 = 0
            int[] r0 = r0.j
            r13 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r22 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0157
        L_0x0156:
            r13 = r10
        L_0x0157:
            if (r28 != 0) goto L_0x015d
            java.lang.String[] r0 = d
            r14 = r0
            goto L_0x015f
        L_0x015d:
            r14 = r28
        L_0x015f:
            if (r12 != 0) goto L_0x0165
            java.util.List r12 = java.util.Collections.emptyList()
        L_0x0165:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0170
            int r0 = r14.length
            if (r0 == 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            goto L_0x01ce
        L_0x0170:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r5 = r14.length
            int r0 = r5 + 1
            r15.<init>(r0)
            if (r13 == 0) goto L_0x017f
            r15.add(r13)
            r4 = 0
            goto L_0x0180
        L_0x017f:
            r4 = 0
        L_0x0180:
            if (r4 < r5) goto L_0x0238
            r15.addAll(r12)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x01cd
            com.google.android.gms.phenotype.ExperimentTokens r0 = com.google.android.gms.phenotype.ExperimentTokens.a((java.util.List) r15)
            if (r0 != 0) goto L_0x01cb
            java.lang.String r0 = ", "
            ium r0 = defpackage.ium.a((java.lang.String) r0)
            java.lang.String r0 = r0.a((java.lang.Iterable) r15)
            java.lang.String r1 = java.lang.String.valueOf(r33)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 28
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "bad merge: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = "mendel packaged: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r11, r0)
            goto L_0x01ce
        L_0x01cb:
            r13 = r0
            goto L_0x01ce
        L_0x01cd:
            r13 = r10
        L_0x01ce:
            r3 = r29
            apez r0 = defpackage.hws.a(r13, r3)
            if (r0 == 0) goto L_0x01f0
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            r7.c()
            r7.c = r9
        L_0x01e0:
            aucj r1 = r7.b
            avrm r1 = (defpackage.avrm) r1
            r0.getClass()
            r1.l = r0
            int r0 = r1.a
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r2
            r1.a = r0
        L_0x01f0:
            if (r13 == 0) goto L_0x01f5
            int[] r10 = r13.j
            goto L_0x01f6
        L_0x01f5:
        L_0x01f6:
            r2 = r27
            int[] r0 = a((int[]) r2, (int[]) r10)
            if (r0 == 0) goto L_0x0225
            java.util.List r0 = defpackage.aoog.b((int[]) r0)
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0207
            goto L_0x020c
        L_0x0207:
            r7.c()
            r7.c = r9
        L_0x020c:
            aucj r1 = r7.b
            avrm r1 = (defpackage.avrm) r1
            aucs r2 = r1.p
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0220
            aucs r2 = r1.p
            aucs r2 = defpackage.aucj.a((defpackage.aucs) r2)
            r1.p = r2
        L_0x0220:
            aucs r1 = r1.p
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x0225:
            aucj r0 = r7.i()
            avrm r0 = (defpackage.avrm) r0
            auay r1 = defpackage.auay.a((byte[]) r25)
            auay r0 = r0.au()
            auay r0 = r1.a((defpackage.auay) r0)
            return r0
        L_0x0238:
            r2 = r27
            r3 = r29
            r16 = r14[r4]
            if (r16 != 0) goto L_0x0245
            r16 = r4
            r17 = r5
            goto L_0x0260
        L_0x0245:
            r17 = 0
            r0 = r23
            r1 = r24
            r2 = r17
            r3 = r16
            r16 = r4
            r4 = r35
            r17 = r5
            r5 = r37
            com.google.android.gms.phenotype.ExperimentTokens r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0260
            r15.add(r0)
        L_0x0260:
            int r4 = r16 + 1
            r5 = r17
            goto L_0x0180
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htr.a(android.content.Context, byte[], int[], int[], java.lang.String[], int[], byte[][], com.google.android.gms.phenotype.ExperimentTokens[], boolean, java.lang.String, boolean, java.lang.String, java.lang.String, yfg):auay");
    }

    /* access modifiers changed from: package-private */
    public final avtn a(Context context, PlayLoggerContext playLoggerContext, yfg yfg) {
        PseudonymousIdToken b2;
        String str;
        Context context2 = context;
        PlayLoggerContext playLoggerContext2 = playLoggerContext;
        aucd o2 = avtn.o.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avtn.a((avtn) o2.b);
        int i2 = playLoggerContext2.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avtn avtn = (avtn) o2.b;
        int i3 = avtn.a | 4;
        avtn.a = i3;
        avtn.c = i2;
        int i4 = playLoggerContext2.c;
        int i5 = i3 | 8;
        avtn.a = i5;
        avtn.d = i4;
        boolean z = playLoggerContext2.f;
        int i6 = i5 | 64;
        avtn.a = i6;
        avtn.g = z;
        String str2 = "";
        str2.getClass();
        int i7 = i6 | 128;
        avtn.a = i7;
        avtn.h = str2;
        boolean z2 = playLoggerContext2.h;
        int i8 = i7 | 512;
        avtn.a = i8;
        avtn.j = z2;
        int i9 = playLoggerContext2.i;
        int i10 = i8 | 1024;
        avtn.a = i10;
        avtn.k = i9;
        String str3 = playLoggerContext2.g;
        if (str3 != null) {
            str3.getClass();
            i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avtn.a = i10;
            avtn.i = str3;
        }
        String str4 = playLoggerContext2.a;
        if (str4 != null) {
            str4.getClass();
            i10 |= 2;
            avtn.a = i10;
            avtn.b = str4;
        }
        String str5 = playLoggerContext2.d;
        if (str5 != null) {
            str5.getClass();
            i10 |= 16;
            avtn.a = i10;
            avtn.e = str5;
        }
        String str6 = playLoggerContext2.e;
        if (str6 != null) {
            str6.getClass();
            avtn.a = i10 | 32;
            avtn.f = str6;
        }
        Integer num = playLoggerContext2.j;
        if (num != null) {
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avtn avtn2 = (avtn) o2.b;
            avtn2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            avtn2.n = intValue;
        }
        avtn avtn3 = (avtn) o2.i();
        aucd aucd = (aucd) avtn3.c(5);
        aucd.a((aucj) avtn3);
        if (!aekv.a(context) && !((avtn) aucd.b).j && (b2 = zok.b(context)) != null && (str = b2.a) != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avtn avtn4 = (avtn) aucd.b;
            str.getClass();
            avtn4.a |= 128;
            avtn4.h = str;
        }
        Integer valueOf = Integer.valueOf(jhg.d(context));
        Integer num2 = null;
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        htl htl = this.t;
        avtn avtn5 = (avtn) aucd.b;
        boolean z3 = avtn5.g;
        String str7 = (avtn5.a & 32) != 0 ? avtn5.f : null;
        int i11 = avtn5.c;
        jik a2 = jil.a(this.r);
        anoc a3 = jgt.a(context);
        avrb avrb = (avrb) htl.b.a();
        aucd aucd2 = (aucd) avrb.c(5);
        aucd2.a((aucj) avrb);
        aucf aucf = (aucf) aucd2;
        if (!z3) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb2 = (avrb) aucf.b;
            avrb avrb3 = avrb.C;
            avrb2.a &= -2;
            avrb2.b = 0;
        }
        if (str7 != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb4 = (avrb) aucf.b;
            avrb avrb5 = avrb.C;
            str7.getClass();
            avrb4.a |= 2;
            avrb4.c = str7;
        }
        String num3 = Integer.toString(i11);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrb avrb6 = (avrb) aucf.b;
        avrb avrb7 = avrb.C;
        num3.getClass();
        avrb6.a |= 512;
        avrb6.j = num3;
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb8 = (avrb) aucf.b;
            avrb8.a |= 262144;
            avrb8.t = intValue2;
        }
        aucf.a(avqo.b, a2.a);
        if (a3 != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb9 = (avrb) aucf.b;
            a3.getClass();
            avrb9.y = a3;
            avrb9.a |= 16777216;
        }
        avrb avrb10 = (avrb) aucf.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avtn avtn6 = (avtn) aucd.b;
        avrb10.getClass();
        avtn6.l = avrb10;
        avtn6.a |= 2048;
        a(context2, aucd, yfg);
        if (((avtn) aucd.b).i.isEmpty()) {
            avtn avtn7 = (avtn) aucd.b;
            if ((avtn7.a & 8) != 0) {
                str2 = Integer.toString(avtn7.d);
            }
        } else {
            str2 = ((avtn) aucd.b).i;
        }
        Integer a4 = hwo.a(context2, str2);
        if (a4 != null) {
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            avtn avtn8 = (avtn) aucd.b;
            if ((avtn8.a & 1024) != 0) {
                num2 = Integer.valueOf(avtn8.k);
            }
            objArr[1] = num2;
            objArr[2] = a4;
            int intValue3 = a4.intValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avtn avtn9 = (avtn) aucd.b;
            avtn9.a |= 1024;
            avtn9.k = intValue3;
        } else if ((((avtn) aucd.b).a & 1024) == 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            avtn avtn10 = (avtn) aucd.b;
            avtn10.a |= 1024;
            avtn10.k = 0;
        }
        return (avtn) aucd.i();
    }

    /* access modifiers changed from: package-private */
    public final ExperimentTokens a(Context context, String str, String str2, String str3, yfg yfg) {
        if (!awta.b()) {
            try {
                return new yhj(str2, str, this.s).a((yfw) yfg);
            } catch (Exception e2) {
                return e;
            }
        } else {
            yey a2 = yef.a(context);
            if (str == null) {
                try {
                    return (ExperimentTokens) acws.a(a2.c(str2, str3, this.s), awso.b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    String valueOf = String.valueOf(str2);
                    Log.e("LogOperation", valueOf.length() == 0 ? new String("Failed to get experiment ids for mendel package ") : "Failed to get experiment ids for mendel package ".concat(valueOf), e3);
                    return e;
                }
            } else {
                try {
                    String str4 = this.s;
                    iha b2 = ihb.b();
                    b2.a = new yei(str, str3, str4);
                    b2.b = new Feature[]{ydy.c};
                    return (ExperimentTokens) acws.a(a2.a(b2.a()), awso.b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.e("LogOperation", str.length() == 0 ? new String("Failed to get experiment ids for log source ") : "Failed to get experiment ids for log source ".concat(str), e4);
                    return e;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06be, code lost:
        android.util.Log.e("LogOperation", "Failed to get accumulated test codes.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x079c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r3 = android.os.Build.VERSION.SDK_INT;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0815, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0818, code lost:
        r3 = r31;
        r1 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x081d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x081e, code lost:
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0821, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0824, code lost:
        r3 = r31;
        r1 = r29;
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x082b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x082d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x082e, code lost:
        r1 = r13;
        r2 = r14;
        r3 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06cc A[Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06d2 A[Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06e0 A[SYNTHETIC, Splitter:B:246:0x06e0] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0734 A[Catch:{ SQLiteException | IOException -> 0x0815, all -> 0x081d }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x081d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:255:0x0721] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x082b A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:230:0x0693] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x082d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:230:0x0693] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r32) {
        /*
            r31 = this;
            r15 = r31
            r2 = r32
            awsu r0 = defpackage.awsu.a
            awsv r0 = r0.a()
            boolean r0 = r0.a()
            r1 = 31002(0x791a, float:4.3443E-41)
            if (r0 == 0) goto L_0x001f
            hsx r0 = r15.o
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            java.lang.String r3 = "Logging is disabled"
            r2.<init>(r1, r3)
            r0.a((com.google.android.gms.common.api.Status) r2)
            return
        L_0x001f:
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a
            java.lang.String r14 = defpackage.hwt.a((com.google.android.gms.clearcut.internal.PlayLoggerContext) r0)
            hry r0 = defpackage.hry.EVENTS_SERVICE_EXECUTED
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            boolean r0 = defpackage.awsu.b()
            r3 = 4
            r4 = 2
            r6 = 0
            if (r0 == 0) goto L_0x032d
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            java.lang.String r7 = r15.s
            avts r8 = defpackage.avts.b
            aucd r8 = r8.o()
            avtq r8 = (defpackage.avtq) r8
            avtr r9 = defpackage.avtr.e
            aucd r9 = r9.o()
            avto r10 = defpackage.avto.d
            aucd r10 = r10.o()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r10.c()
            r10.c = r6
        L_0x0057:
            aucj r11 = r10.b
            avto r11 = (defpackage.avto) r11
            r7.getClass()
            int r12 = r11.a
            r12 = r12 | r4
            r11.a = r12
            r11.c = r7
            com.google.android.gms.clearcut.internal.PlayLoggerContext r7 = r0.a
            avtp r11 = defpackage.avtp.k
            aucd r11 = r11.o()
            avtn r12 = defpackage.avtn.o
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r12.c()
            r12.c = r6
        L_0x007d:
            aucj r13 = r12.b
            avtn r13 = (defpackage.avtn) r13
            defpackage.avtn.a(r13)
            java.lang.String r13 = r7.a
            java.lang.String r13 = defpackage.amrk.b(r13)
            boolean r1 = r12.c
            if (r1 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r12.c()
            r12.c = r6
        L_0x0094:
            aucj r1 = r12.b
            avtn r1 = (defpackage.avtn) r1
            r13.getClass()
            int r5 = r1.a
            r5 = r5 | r4
            r1.a = r5
            r1.b = r13
            int r13 = r7.b
            r5 = r5 | r3
            r1.a = r5
            r1.c = r13
            int r13 = r7.c
            r5 = r5 | 8
            r1.a = r5
            r1.d = r13
            java.lang.String r1 = r7.d
            java.lang.String r1 = defpackage.amrk.b(r1)
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r12.c()
            r12.c = r6
        L_0x00c1:
            aucj r5 = r12.b
            avtn r5 = (defpackage.avtn) r5
            r1.getClass()
            int r13 = r5.a
            r13 = r13 | 16
            r5.a = r13
            r5.e = r1
            java.lang.String r1 = r7.e
            java.lang.String r1 = defpackage.amrk.b(r1)
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            r12.c()
            r12.c = r6
        L_0x00e0:
            aucj r5 = r12.b
            avtn r5 = (defpackage.avtn) r5
            r1.getClass()
            int r13 = r5.a
            r13 = r13 | 32
            r5.a = r13
            r5.f = r1
            boolean r1 = r7.f
            r13 = r13 | 64
            r5.a = r13
            r5.g = r1
            java.lang.String r1 = ""
            r1.getClass()
            r13 = r13 | 128(0x80, float:1.794E-43)
            r5.a = r13
            r5.h = r1
            java.lang.String r1 = r7.g
            java.lang.String r1 = defpackage.amrk.b(r1)
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r12.c()
            r12.c = r6
        L_0x0112:
            aucj r5 = r12.b
            avtn r5 = (defpackage.avtn) r5
            r1.getClass()
            int r13 = r5.a
            r13 = r13 | 256(0x100, float:3.59E-43)
            r5.a = r13
            r5.i = r1
            boolean r1 = r7.h
            r13 = r13 | 512(0x200, float:7.175E-43)
            r5.a = r13
            r5.j = r1
            int r1 = r7.i
            r7 = r13 | 1024(0x400, float:1.435E-42)
            r5.a = r7
            r5.k = r1
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x0136
            goto L_0x013b
        L_0x0136:
            r11.c()
            r11.c = r6
        L_0x013b:
            aucj r1 = r11.b
            avtp r1 = (defpackage.avtp) r1
            aucj r5 = r12.i()
            avtn r5 = (defpackage.avtn) r5
            r5.getClass()
            r1.b = r5
            int r5 = r1.a
            r7 = 1
            r5 = r5 | r7
            r1.a = r5
            byte[] r1 = r0.b
            if (r1 == 0) goto L_0x0170
            auay r1 = defpackage.auay.a((byte[]) r1)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            r11.c()
            r11.c = r6
        L_0x0162:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            r1.getClass()
            int r7 = r5.a
            r7 = r7 | r4
            r5.a = r7
            r5.c = r1
        L_0x0170:
            java.lang.String[] r1 = r0.d
            if (r1 == 0) goto L_0x019b
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x017d
            goto L_0x0182
        L_0x017d:
            r11.c()
            r11.c = r6
        L_0x0182:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            aucx r7 = r5.e
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0196
            aucx r7 = r5.e
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r5.e = r7
        L_0x0196:
            aucx r5 = r5.e
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)
        L_0x019b:
            int[] r1 = r0.c
            if (r1 == 0) goto L_0x01c6
            java.util.List r1 = defpackage.aoog.b((int[]) r1)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x01a8
            goto L_0x01ad
        L_0x01a8:
            r11.c()
            r11.c = r6
        L_0x01ad:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            aucs r7 = r5.d
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x01c1
            aucs r7 = r5.d
            aucs r7 = defpackage.aucj.a((defpackage.aucs) r7)
            r5.d = r7
        L_0x01c1:
            aucs r5 = r5.d
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)
        L_0x01c6:
            int[] r1 = r0.e
            if (r1 == 0) goto L_0x01f1
            java.util.List r1 = defpackage.aoog.b((int[]) r1)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x01d3
            goto L_0x01d8
        L_0x01d3:
            r11.c()
            r11.c = r6
        L_0x01d8:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            aucs r7 = r5.f
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x01ec
            aucs r7 = r5.f
            aucs r7 = defpackage.aucj.a((defpackage.aucs) r7)
            r5.f = r7
        L_0x01ec:
            aucs r5 = r5.f
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)
        L_0x01f1:
            byte[][] r1 = r0.f
            if (r1 == 0) goto L_0x0222
            java.util.List r1 = java.util.Arrays.asList(r1)
            amqy r5 = defpackage.hon.a
            java.lang.Iterable r1 = defpackage.anbs.a((java.lang.Iterable) r1, (defpackage.amqy) r5)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x0204
            goto L_0x0209
        L_0x0204:
            r11.c()
            r11.c = r6
        L_0x0209:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            aucx r7 = r5.g
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x021d
            aucx r7 = r5.g
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r5.g = r7
        L_0x021d:
            aucx r5 = r5.g
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)
        L_0x0222:
            boolean r1 = r0.h
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x0229
            goto L_0x022e
        L_0x0229:
            r11.c()
            r11.c = r6
        L_0x022e:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            int r7 = r5.a
            r7 = r7 | r3
            r5.a = r7
            r5.h = r1
            com.google.android.gms.phenotype.ExperimentTokens[] r1 = r0.g
            if (r1 == 0) goto L_0x026a
            java.util.List r1 = java.util.Arrays.asList(r1)
            amqy r5 = defpackage.hoo.a
            java.lang.Iterable r1 = defpackage.anbs.a((java.lang.Iterable) r1, (defpackage.amqy) r5)
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x024c
            goto L_0x0251
        L_0x024c:
            r11.c()
            r11.c = r6
        L_0x0251:
            aucj r5 = r11.b
            avtp r5 = (defpackage.avtp) r5
            aucx r7 = r5.i
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0265
            aucx r7 = r5.i
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r5.i = r7
        L_0x0265:
            aucx r5 = r5.i
            defpackage.auab.a((java.lang.Iterable) r1, (java.util.List) r5)
        L_0x026a:
            com.google.android.gms.phenotype.GenericDimension[] r0 = r0.i
            if (r0 == 0) goto L_0x0299
            int[] r0 = com.google.android.gms.phenotype.GenericDimension.a((com.google.android.gms.phenotype.GenericDimension[]) r0)
            java.util.List r0 = defpackage.aoog.b((int[]) r0)
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x027b
            goto L_0x0280
        L_0x027b:
            r11.c()
            r11.c = r6
        L_0x0280:
            aucj r1 = r11.b
            avtp r1 = (defpackage.avtp) r1
            aucs r5 = r1.j
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0294
            aucs r5 = r1.j
            aucs r5 = defpackage.aucj.a((defpackage.aucs) r5)
            r1.j = r5
        L_0x0294:
            aucs r1 = r1.j
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
        L_0x0299:
            aucj r0 = r11.i()
            avtp r0 = (defpackage.avtp) r0
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x02a4
            goto L_0x02a9
        L_0x02a4:
            r10.c()
            r10.c = r6
        L_0x02a9:
            aucj r1 = r10.b
            avto r1 = (defpackage.avto) r1
            r0.getClass()
            r1.b = r0
            int r0 = r1.a
            r5 = 1
            r0 = r0 | r5
            r1.a = r0
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x02bd
            goto L_0x02c2
        L_0x02bd:
            r9.c()
            r9.c = r6
        L_0x02c2:
            aucj r0 = r9.b
            avtr r0 = (defpackage.avtr) r0
            aucj r1 = r10.i()
            avto r1 = (defpackage.avto) r1
            r1.getClass()
            r0.c = r1
            int r1 = r0.a
            r1 = r1 | r4
            r0.a = r1
            long r0 = java.lang.System.currentTimeMillis()
            boolean r5 = r9.c
            if (r5 != 0) goto L_0x02df
            goto L_0x02e4
        L_0x02df:
            r9.c()
            r9.c = r6
        L_0x02e4:
            aucj r5 = r9.b
            avtr r5 = (defpackage.avtr) r5
            int r7 = r5.a
            r10 = 1
            r7 = r7 | r10
            r5.a = r7
            r5.b = r0
            r8.a(r9)
            aucj r0 = r8.i()
            avts r0 = (defpackage.avts) r0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0324 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0324 }
            ihs r7 = defpackage.ihs.b()     // Catch:{ IOException -> 0x0324 }
            java.io.File r7 = r7.getFilesDir()     // Catch:{ IOException -> 0x0324 }
            java.lang.String r8 = "clearcut_simulation_log_events.pb"
            r5.<init>(r7, r8)     // Catch:{ IOException -> 0x0324 }
            r7 = 1
            r1.<init>(r5, r7)     // Catch:{ IOException -> 0x0324 }
            r0.a(r1)     // Catch:{ all -> 0x0318 }
            r1.flush()     // Catch:{ all -> 0x0318 }
            r1.close()     // Catch:{ IOException -> 0x0324 }
            goto L_0x032d
        L_0x0318:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch:{ all -> 0x031e }
            goto L_0x0323
        L_0x031e:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ IOException -> 0x0324 }
        L_0x0323:
            throw r2     // Catch:{ IOException -> 0x0324 }
        L_0x0324:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to write simulation log events to file."
            r1.<init>(r2, r0)
            throw r1
        L_0x032d:
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            com.google.android.gms.clearcut.internal.PlayLoggerContext r1 = r0.a
            boolean r5 = defpackage.jix.a((android.content.Context) r32)
            if (r5 == 0) goto L_0x050f
            java.lang.String r5 = r1.g
            awtm r7 = defpackage.awtm.a
            awtn r7 = r7.a()
            java.lang.String r7 = r7.c()
            java.util.Map r8 = h
            monitor-enter(r8)
            java.lang.String r9 = k     // Catch:{ all -> 0x050c }
            boolean r9 = r7.equals(r9)     // Catch:{ all -> 0x050c }
            if (r9 == 0) goto L_0x0351
            r12 = 1
            goto L_0x03d6
        L_0x0351:
            k = r7     // Catch:{ all -> 0x050c }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x050c }
            r9.<init>()     // Catch:{ all -> 0x050c }
            amsk r10 = i     // Catch:{ all -> 0x050c }
            java.lang.Iterable r10 = r10.a((java.lang.CharSequence) r7)     // Catch:{ all -> 0x050c }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x050c }
        L_0x0362:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x050c }
            if (r11 == 0) goto L_0x03d3
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x050c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x050c }
            java.lang.String r11 = r11.trim()     // Catch:{ all -> 0x050c }
            amsk r12 = j     // Catch:{ all -> 0x050c }
            java.util.List r11 = r12.c(r11)     // Catch:{ all -> 0x050c }
            int r12 = r11.size()     // Catch:{ all -> 0x050c }
            if (r12 == r4) goto L_0x039b
            java.lang.String r11 = "LogOperation"
            java.lang.String r12 = "Failed to parse a pair in sidewinderPermissions: "
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050c }
            int r18 = r4.length()     // Catch:{ all -> 0x050c }
            if (r18 != 0) goto L_0x0392
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x050c }
            r4.<init>(r12)     // Catch:{ all -> 0x050c }
            goto L_0x0396
        L_0x0392:
            java.lang.String r4 = r12.concat(r4)     // Catch:{ all -> 0x050c }
        L_0x0396:
            android.util.Log.e(r11, r4)     // Catch:{ all -> 0x050c }
            r4 = 2
            goto L_0x0362
        L_0x039b:
            java.util.Map r4 = h     // Catch:{ all -> 0x050c }
            r12 = 1
            java.lang.Object r13 = r11.get(r12)     // Catch:{ all -> 0x050c }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x050c }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x050c }
            if (r4 != 0) goto L_0x03c7
            java.lang.String r4 = "LogOperation"
            java.lang.String r11 = "Bad permission in sidewinderPermissions: "
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050c }
            int r18 = r13.length()     // Catch:{ all -> 0x050c }
            if (r18 != 0) goto L_0x03be
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x050c }
            r13.<init>(r11)     // Catch:{ all -> 0x050c }
            goto L_0x03c2
        L_0x03be:
            java.lang.String r13 = r11.concat(r13)     // Catch:{ all -> 0x050c }
        L_0x03c2:
            android.util.Log.e(r4, r13)     // Catch:{ all -> 0x050c }
            r4 = 2
            goto L_0x0362
        L_0x03c7:
            java.lang.Object r11 = r11.get(r6)     // Catch:{ all -> 0x050c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x050c }
            r9.put(r11, r4)     // Catch:{ all -> 0x050c }
            r4 = 2
            goto L_0x0362
        L_0x03d3:
            r12 = 1
            l = r9     // Catch:{ all -> 0x050c }
        L_0x03d6:
            java.util.Map r4 = l     // Catch:{ all -> 0x050c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x050c }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x050c }
            int r9 = r9.length()     // Catch:{ all -> 0x050c }
            int r9 = r9 + 36
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x050c }
            int r10 = r10.length()     // Catch:{ all -> 0x050c }
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x050c }
            r10.<init>(r9)     // Catch:{ all -> 0x050c }
            java.lang.String r9 = "permissions="
            r10.append(r9)     // Catch:{ all -> 0x050c }
            r10.append(r7)     // Catch:{ all -> 0x050c }
            java.lang.String r7 = ",sSidewinderPermissions="
            r10.append(r7)     // Catch:{ all -> 0x050c }
            r10.append(r4)     // Catch:{ all -> 0x050c }
            r10.toString()     // Catch:{ all -> 0x050c }
            java.util.Map r4 = l     // Catch:{ all -> 0x050c }
            monitor-exit(r8)     // Catch:{ all -> 0x050c }
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r8 = java.lang.String.valueOf(r5)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 38
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "logSourceName="
            r10.append(r8)
            r10.append(r5)
            java.lang.String r8 = ", sidewinder permission="
            r10.append(r8)
            r10.append(r7)
            r10.toString()
            if (r4 != 0) goto L_0x0459
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Default skipping log for Sidewinder: "
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0453
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x0456
        L_0x0453:
            r4.concat(r1)
        L_0x0456:
            r1 = 0
            goto L_0x0510
        L_0x0459:
            java.lang.Integer r7 = f
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0479
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Explicit skipping log for Sidewinder: "
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0473
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x0476
        L_0x0473:
            r4.concat(r1)
        L_0x0476:
            r1 = 0
            goto L_0x0510
        L_0x0479:
            java.lang.Integer r7 = b
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x050b
            boolean r7 = r1.h
            java.lang.Integer r8 = g
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x04a3
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Switching log to anonymous for Sidewinder: "
            int r7 = r4.length()
            if (r7 != 0) goto L_0x049d
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x04a0
        L_0x049d:
            r5.concat(r4)
        L_0x04a0:
            r25 = 1
            goto L_0x04c2
        L_0x04a3:
            java.lang.Integer r8 = a
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x04eb
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Removing user ids from log for Sidewinder: "
            int r8 = r4.length()
            if (r8 != 0) goto L_0x04bd
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x04c0
        L_0x04bd:
            r5.concat(r4)
        L_0x04c0:
            r25 = r7
        L_0x04c2:
            com.google.android.gms.clearcut.internal.PlayLoggerContext r4 = new com.google.android.gms.clearcut.internal.PlayLoggerContext
            java.lang.String r5 = r1.a
            int r7 = r1.b
            int r8 = r1.c
            r21 = 0
            java.lang.String r9 = r1.e
            r23 = 0
            java.lang.String r10 = r1.g
            int r11 = r1.i
            java.lang.Integer r1 = r1.j
            r17 = r4
            r18 = r5
            r19 = r7
            r20 = r8
            r22 = r9
            r24 = r10
            r26 = r11
            r27 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r4
            goto L_0x0510
        L_0x04eb:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 39
            r5.<init>(r4)
            java.lang.String r4 = "Unknown Sidewinder logging permission: "
            r5.append(r4)
            r5.append(r1)
            r5.toString()
            r1 = 0
            goto L_0x0510
        L_0x050b:
            goto L_0x0510
        L_0x050c:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x050c }
            throw r0
        L_0x050f:
        L_0x0510:
            r0.a = r1
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a
            if (r0 != 0) goto L_0x052c
            hry r0 = defpackage.hry.DROPS_BY_SIDEWINDER
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            hsx r0 = r15.o
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "Log dropped from Sidewinder."
            r3 = 31002(0x791a, float:4.3443E-41)
            r1.<init>(r3, r2)
            r0.a((com.google.android.gms.common.api.Status) r1)
            return
        L_0x052c:
            hry r0 = defpackage.hry.EVENTS_AFTER_SIDEWINDER
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            com.google.android.gms.clearcut.internal.PlayLoggerContext r1 = r0.a
            java.lang.String r4 = r1.g
            int r1 = r1.c
            avrm r5 = r0.j
            if (r5 == 0) goto L_0x0540
            int r6 = r5.f
            goto L_0x0541
        L_0x0540:
        L_0x0541:
            hoj r5 = r15.u
            boolean r1 = r5.a(r4, r1, r6)
            if (r1 != 0) goto L_0x057d
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 25
            r2.<init>(r1)
            java.lang.String r1 = "log skipped by sampling: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            hry r0 = defpackage.hry.DROPS_BY_SERVICE_SAMPLING
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            hsx r0 = r15.o
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "Log dropped from sampling."
            r3 = 31002(0x791a, float:4.3443E-41)
            r1.<init>(r3, r2)
            r0.a((com.google.android.gms.common.api.Status) r1)
            return
        L_0x057d:
            hry r0 = defpackage.hry.EVENTS_SERVICE_SAMPLED
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a
            int r1 = r0.i
            java.lang.String r4 = defpackage.hwt.a((com.google.android.gms.clearcut.internal.PlayLoggerContext) r0)
            java.lang.Integer r4 = defpackage.hwo.a((android.content.Context) r2, (java.lang.String) r4)
            if (r4 == 0) goto L_0x0596
            int r1 = r4.intValue()
        L_0x0596:
            if (r1 != r3) goto L_0x05ca
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 30
            r2.<init>(r1)
            java.lang.String r1 = "log dropped by NEVER qos tier:"
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            hry r0 = defpackage.hry.DROPS_BY_QOS_TIER_OVERRIDE
            defpackage.hsa.a((java.lang.String) r14, (defpackage.hry) r0)
            hsx r0 = r15.o
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "Log dropped from Qos Tier."
            r3 = 31002(0x791a, float:4.3443E-41)
            r1.<init>(r3, r2)
            r0.a((com.google.android.gms.common.api.Status) r1)
            return
        L_0x05ca:
            defpackage.hwn.a()
            awta r0 = defpackage.awta.a
            awtb r0 = r0.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x05ea
            hya r0 = defpackage.hya.a((android.content.Context) r32)
            java.lang.String r1 = r15.s
            boolean r0 = r0.b((java.lang.String) r1)
            if (r0 != 0) goto L_0x05ea
            java.lang.String r0 = r15.s
            r16 = r0
            goto L_0x05ec
        L_0x05ea:
            r16 = 0
        L_0x05ec:
            hvh r0 = r15.q
            hvg r13 = r0.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 32
            r1.<init>(r0)
            java.lang.String r0 = "Clearcut LogOperation overall ("
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.os.Trace.beginSection(r0)
            awtf r0 = defpackage.awtf.a     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            awtg r0 = r0.a()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            boolean r0 = r0.e()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            r1 = 31003(0x791b, float:4.3444E-41)
            if (r0 == 0) goto L_0x0677
            long r3 = r13.b(r14)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            awtf r0 = defpackage.awtf.a     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            awtg r0 = r0.a()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            avsp r0 = r0.g()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            long r5 = r0.a     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            aucx r7 = r0.b     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
        L_0x063b:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            if (r8 == 0) goto L_0x0652
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            avso r8 = (defpackage.avso) r8     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            java.lang.String r9 = r8.a     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            boolean r9 = r9.equals(r14)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            if (r9 == 0) goto L_0x063b
            long r5 = r8.b     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            goto L_0x0653
        L_0x0652:
        L_0x0653:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0677
            boolean r0 = r0.c     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            if (r0 != 0) goto L_0x0672
            hvc r0 = defpackage.hvc.EXCEED_LOG_SOURCE_LOG_CAP     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            a((defpackage.hvg) r13, (java.lang.String) r14, (defpackage.hvd) r0)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            hsx r0 = r15.o     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            java.lang.String r3 = "Log dropped because of log cap for this log source exceeded."
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            r0.a((com.google.android.gms.common.api.Status) r2)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
        L_0x066c:
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.Trace.endSection()
            return
        L_0x0672:
            hvc r0 = defpackage.hvc.EXCEED_LOG_SOURCE_LOG_CAP_DRY_RUN     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            a((defpackage.hvg) r13, (java.lang.String) r14, (defpackage.hvd) r0)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
        L_0x0677:
            boolean r0 = r13.d()     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            if (r0 == 0) goto L_0x068f
            hvc r0 = defpackage.hvc.OVERFLOW     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            a((defpackage.hvg) r13, (java.lang.String) r14, (defpackage.hvd) r0)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            hsx r0 = r15.o     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            java.lang.String r3 = "Log dropped because of storage quota exceeded."
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            r0.a((com.google.android.gms.common.api.Status) r2)     // Catch:{ IOException -> 0x0857, SQLiteException -> 0x0855 }
            goto L_0x066c
        L_0x068f:
            yfg r11 = defpackage.yfg.a(r32)     // Catch:{ all -> 0x0852 }
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            avtn r10 = r15.a((android.content.Context) r2, (com.google.android.gms.clearcut.internal.PlayLoggerContext) r0, (defpackage.yfg) r11)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            byte[] r3 = r0.b     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            int[] r1 = r0.c     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            auib r0 = defpackage.ayyg.b()     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            aucx r0 = r0.a     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            boolean r0 = r0.contains(r14)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            if (r0 == 0) goto L_0x06c5
            hvh r0 = r15.q     // Catch:{ SQLiteException -> 0x06bd, IOException -> 0x082d }
            hvg r0 = r0.a()     // Catch:{ SQLiteException -> 0x06bd, IOException -> 0x082d }
            int[] r0 = r0.d(r14)     // Catch:{ SQLiteException -> 0x06bd, IOException -> 0x082d }
            int[] r0 = a((int[]) r1, (int[]) r0)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            r4 = r0
            goto L_0x06c6
        L_0x06bd:
            r0 = move-exception
            java.lang.String r4 = "LogOperation"
            java.lang.String r5 = "Failed to get accumulated test codes."
            android.util.Log.e(r4, r5, r0)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
        L_0x06c5:
            r4 = r1
        L_0x06c6:
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            com.google.android.gms.phenotype.GenericDimension[] r0 = r0.i     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            if (r0 == 0) goto L_0x06d2
            int[] r0 = com.google.android.gms.phenotype.GenericDimension.a((com.google.android.gms.phenotype.GenericDimension[]) r0)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            r1 = r0
            goto L_0x06d3
        L_0x06d2:
            r1 = 0
        L_0x06d3:
            auib r0 = defpackage.ayyg.b()     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            aucx r0 = r0.a     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            boolean r0 = r0.contains(r14)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            if (r0 != 0) goto L_0x06e0
            goto L_0x06f8
        L_0x06e0:
            hvh r0 = r15.q     // Catch:{ IOException -> 0x06f0, SQLiteException -> 0x082b }
            hvg r0 = r0.a()     // Catch:{ IOException -> 0x06f0, SQLiteException -> 0x082b }
            int[] r0 = r0.e(r14)     // Catch:{ IOException -> 0x06f0, SQLiteException -> 0x082b }
            int[] r0 = a((int[]) r0, (int[]) r1)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            r5 = r0
            goto L_0x06f9
        L_0x06f0:
            r0 = move-exception
            java.lang.String r5 = "LogOperation"
            java.lang.String r6 = "Failed to get accumulated generic dimensions."
            android.util.Log.e(r5, r6, r0)     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
        L_0x06f8:
            r5 = r1
        L_0x06f9:
            com.google.android.gms.clearcut.LogEventParcelable r0 = r15.p     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            java.lang.String[] r6 = r0.d     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            int[] r7 = r0.e     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            byte[][] r8 = r0.f     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            com.google.android.gms.phenotype.ExperimentTokens[] r9 = r0.g     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            boolean r1 = r0.h     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            com.google.android.gms.clearcut.internal.PlayLoggerContext r0 = r0.a     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            boolean r12 = r0.h     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            java.lang.String r0 = r0.d     // Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }
            r18 = r1
            r1 = r31
            r2 = r32
            r28 = r10
            r10 = r18
            r18 = r11
            r11 = r14
            r29 = r13
            r13 = r0
            r30 = r14
            r14 = r16
            r15 = r18
            auay r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0823, SQLiteException -> 0x0821, all -> 0x081d }
            hry r1 = defpackage.hry.EVENTS_SERVICE_SERIALIZED     // Catch:{ IOException -> 0x0823, SQLiteException -> 0x0821, all -> 0x081d }
            r2 = r30
            defpackage.hsa.a((java.lang.String) r2, (defpackage.hry) r1)     // Catch:{ IOException -> 0x0817, SQLiteException -> 0x0815, all -> 0x081d }
            int r1 = r0.a()     // Catch:{ IOException -> 0x0817, SQLiteException -> 0x0815, all -> 0x081d }
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r1 > r3) goto L_0x07f8
            awsu r1 = defpackage.awsu.a     // Catch:{ IOException -> 0x0817, SQLiteException -> 0x0815, all -> 0x081d }
            awsv r1 = r1.a()     // Catch:{ IOException -> 0x0817, SQLiteException -> 0x0815, all -> 0x081d }
            boolean r1 = r1.c()     // Catch:{ IOException -> 0x0817, SQLiteException -> 0x0815, all -> 0x081d }
            if (r1 != 0) goto L_0x07b8
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            int r1 = r1.length()     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            int r1 = r1 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            r3.<init>(r1)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            java.lang.String r1 = "Clearcut writeLogEventProto ("
            r3.append(r1)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            r3.append(r2)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x07b1, SQLiteException -> 0x07af, all -> 0x081d }
            r3 = r28
            r1 = r29
            boolean r0 = r1.a(r3, r0)     // Catch:{ Exception -> 0x079e }
            if (r0 == 0) goto L_0x0791
            hry r0 = defpackage.hry.EVENTS_WRITTEN     // Catch:{ Exception -> 0x079e }
            defpackage.hsa.a((java.lang.String) r2, (defpackage.hry) r0)     // Catch:{ Exception -> 0x079e }
            int r0 = r3.k     // Catch:{ Exception -> 0x079e }
            r3 = 3
            if (r0 == r3) goto L_0x077a
            goto L_0x0796
        L_0x077a:
            hwn r0 = defpackage.hwn.a()     // Catch:{ Exception -> 0x079e }
            java.lang.Object r3 = r0.b     // Catch:{ Exception -> 0x079e }
            monitor-enter(r3)     // Catch:{ Exception -> 0x079e }
            boolean r4 = r0.a     // Catch:{ all -> 0x078e }
            if (r4 != 0) goto L_0x078c
            r4 = 0
            r0.a(r4)     // Catch:{ all -> 0x078e }
            monitor-exit(r3)     // Catch:{ all -> 0x078e }
            goto L_0x0796
        L_0x078c:
            monitor-exit(r3)     // Catch:{ all -> 0x078e }
            goto L_0x0796
        L_0x078e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x078e }
            throw r0     // Catch:{ Exception -> 0x079e }
        L_0x0791:
            hry r0 = defpackage.hry.DROPS_BY_WRITE_FAILURE     // Catch:{ Exception -> 0x079e }
            defpackage.hsa.a((java.lang.String) r2, (defpackage.hry) r0)     // Catch:{ Exception -> 0x079e }
        L_0x0796:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07ad, SQLiteException -> 0x07ab, all -> 0x081d }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x07ad, SQLiteException -> 0x07ab, all -> 0x081d }
            goto L_0x07ba
        L_0x079c:
            r0 = move-exception
            goto L_0x07a5
        L_0x079e:
            r0 = move-exception
            hry r3 = defpackage.hry.DROPS_BY_WRITE_EXCEPTION     // Catch:{ all -> 0x079c }
            defpackage.hsa.a((java.lang.String) r2, (defpackage.hry) r3)     // Catch:{ all -> 0x079c }
            throw r0     // Catch:{ all -> 0x079c }
        L_0x07a5:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07ad, SQLiteException -> 0x07ab, all -> 0x081d }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x07ad, SQLiteException -> 0x07ab, all -> 0x081d }
            throw r0     // Catch:{ IOException -> 0x07ad, SQLiteException -> 0x07ab, all -> 0x081d }
        L_0x07ab:
            r0 = move-exception
            goto L_0x07b4
        L_0x07ad:
            r0 = move-exception
            goto L_0x07b4
        L_0x07af:
            r0 = move-exception
            goto L_0x07b2
        L_0x07b1:
            r0 = move-exception
        L_0x07b2:
            r1 = r29
        L_0x07b4:
            r3 = r31
            goto L_0x0831
        L_0x07b8:
            r1 = r29
        L_0x07ba:
            r3 = r31
            com.google.android.gms.clearcut.LogEventParcelable r0 = r3.p     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            int[] r0 = r0.c     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            if (r0 != 0) goto L_0x07c3
            goto L_0x07cf
        L_0x07c3:
            int r4 = r0.length     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            if (r4 <= 0) goto L_0x07cf
            auib r4 = defpackage.ayyg.b()     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            aucx r4 = r4.a     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            r1.a((int[]) r0, (java.lang.String) r2, (java.util.Collection) r4)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
        L_0x07cf:
            com.google.android.gms.clearcut.LogEventParcelable r0 = r3.p     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            com.google.android.gms.phenotype.GenericDimension[] r0 = r0.i     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            if (r0 != 0) goto L_0x07d6
            goto L_0x07e6
        L_0x07d6:
            int r4 = r0.length     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            if (r4 <= 0) goto L_0x07e6
            int[] r0 = com.google.android.gms.phenotype.GenericDimension.a((com.google.android.gms.phenotype.GenericDimension[]) r0)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            auib r4 = defpackage.ayyg.b()     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            aucx r4 = r4.a     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            r1.b(r0, r2, r4)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
        L_0x07e6:
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.Trace.endSection()
            hry r0 = defpackage.hry.EVENTS_SERVICE_LOGGED
            defpackage.hsa.a((java.lang.String) r2, (defpackage.hry) r0)
            hsx r0 = r3.o
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a
            r0.a((com.google.android.gms.common.api.Status) r1)
            return
        L_0x07f8:
            r3 = r31
            r1 = r29
            hvc r0 = defpackage.hvc.SINGLE_LOG_TOO_BIG     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            a((defpackage.hvg) r1, (java.lang.String) r2, (defpackage.hvd) r0)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            hsx r0 = r3.o     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            r5 = 31004(0x791c, float:4.3446E-41)
            java.lang.String r6 = "Log dropped because event exceeds maximum size"
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            r0.a((com.google.android.gms.common.api.Status) r4)     // Catch:{ IOException -> 0x0813, SQLiteException -> 0x0811 }
            goto L_0x066c
        L_0x0811:
            r0 = move-exception
            goto L_0x0831
        L_0x0813:
            r0 = move-exception
            goto L_0x0831
        L_0x0815:
            r0 = move-exception
            goto L_0x0818
        L_0x0817:
            r0 = move-exception
        L_0x0818:
            r3 = r31
            r1 = r29
            goto L_0x0831
        L_0x081d:
            r0 = move-exception
            r3 = r31
            goto L_0x0879
        L_0x0821:
            r0 = move-exception
            goto L_0x0824
        L_0x0823:
            r0 = move-exception
        L_0x0824:
            r3 = r31
            r1 = r29
            r2 = r30
            goto L_0x0831
        L_0x082b:
            r0 = move-exception
            goto L_0x082e
        L_0x082d:
            r0 = move-exception
        L_0x082e:
            r1 = r13
            r2 = r14
            r3 = r15
        L_0x0831:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0878 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0878 }
            java.lang.String r4 = defpackage.hvi.a(r4, r0)     // Catch:{ all -> 0x0878 }
            hry r5 = defpackage.hry.WRITE_EXCEPTIONS     // Catch:{ all -> 0x0878 }
            hvb r6 = new hvb     // Catch:{ all -> 0x0878 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0878 }
            a((defpackage.hvg) r1, (java.lang.String) r2, (defpackage.hvd) r6)     // Catch:{ all -> 0x0878 }
            nja r1 = new nja     // Catch:{ all -> 0x0878 }
            java.lang.String r2 = "Error writing log"
            r4 = 31005(0x791d, float:4.3447E-41)
            r5 = 0
            r1.<init>(r4, r2, r5, r0)     // Catch:{ all -> 0x0878 }
            throw r1     // Catch:{ all -> 0x0878 }
        L_0x0852:
            r0 = move-exception
            r3 = r15
            goto L_0x0879
        L_0x0855:
            r0 = move-exception
            goto L_0x0858
        L_0x0857:
            r0 = move-exception
        L_0x0858:
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = 31005(0x791d, float:4.3447E-41)
            r5 = 0
            hvb r6 = new hvb     // Catch:{ all -> 0x0878 }
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x0878 }
            java.lang.String r7 = r7.getSimpleName()     // Catch:{ all -> 0x0878 }
            hry r8 = defpackage.hry.DROPS_BY_STORAGE_SIZE_EXCEPTION     // Catch:{ all -> 0x0878 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0878 }
            a((defpackage.hvg) r1, (java.lang.String) r2, (defpackage.hvd) r6)     // Catch:{ all -> 0x0878 }
            nja r1 = new nja     // Catch:{ all -> 0x0878 }
            java.lang.String r2 = "Error checking storage size"
            r1.<init>(r4, r2, r5, r0)     // Catch:{ all -> 0x0878 }
            throw r1     // Catch:{ all -> 0x0878 }
        L_0x0878:
            r0 = move-exception
        L_0x0879:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.os.Trace.endSection()
            goto L_0x0880
        L_0x087f:
            throw r0
        L_0x0880:
            goto L_0x087f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htr.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.o.a(status);
    }
}
