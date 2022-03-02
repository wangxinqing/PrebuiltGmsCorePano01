package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: lyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyx {
    private final String a;
    private final Context b;
    private final Throwable c;

    public lyx(String str, Context context, Throwable th) {
        this.a = str;
        this.b = context;
        this.c = th;
    }

    public static byte[] a(String str, Context context, Map map, Throwable th) {
        if (lyr.a(str, axff.a.a().a())) {
            String valueOf = String.valueOf(str);
            return (valueOf.length() == 0 ? new String("ERROR : no fallback for ") : "ERROR : no fallback for ".concat(valueOf)).getBytes();
        }
        try {
            return new lyx(str, context, th).a(map, (byte[]) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 8);
            sb.append("ERROR : ");
            sb.append(valueOf2);
            return sb.toString().getBytes();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v13, resolved type: int[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r0 = defpackage.lza.a(r2, (byte[]) r0.getMethod(r5.g.a(defpackage.lza.c), new java.lang.Class[]{byte[].class}).invoke(r0.getMethod(r5.g.a(defpackage.lza.d), new java.lang.Class[]{java.lang.String.class}).invoke((java.lang.Object) null, new java.lang.Object[]{r5.g.a(defpackage.lza.b)}), new java.lang.Object[]{r2}));
        r2 = new defpackage.lzh(defpackage.lza.e, defpackage.lza.f);
        r5 = r7.length * 8;
        r2.a[1] = defpackage.lzh.a(r7, 0);
        r2.a[2] = defpackage.lzh.a(r7, 4);
        r2.a[3] = defpackage.lzh.a(r7, r3);
        r9 = 12;
        r2.a[4] = defpackage.lzh.a(r7, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x060c, code lost:
        if (r5 != 256) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x060e, code lost:
        r5 = r2.b;
        r8 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0615, code lost:
        if (r5 != 128) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0617, code lost:
        r5 = r2.c;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x061a, code lost:
        r2.a[11] = defpackage.lzh.a(r7, r8);
        r2.a[12] = defpackage.lzh.a(r7, r8 + 4);
        r2.a[13] = defpackage.lzh.a(r7, r8 + 8);
        r2.a[14] = defpackage.lzh.a(r7, r8 + 12);
        r2.a[0] = defpackage.lzh.a(r5, 0);
        r2.a[5] = defpackage.lzh.a(r5, 4);
        r2.a[10] = defpackage.lzh.a(r5, r3);
        r2.a[15] = defpackage.lzh.a(r5, 12);
        r2.a[6] = defpackage.lzh.a(r6, 0);
        r2.a[7] = defpackage.lzh.a(r6, 4);
        r5 = r2.a;
        r5[r3] = 0;
        r5[9] = 0;
        r5 = r0.length;
        r8 = new byte[r5];
        r14 = new byte[64];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0690, code lost:
        if (r5 != 0) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0694, code lost:
        r16 = 0;
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0698, code lost:
        r15 = r2.a;
        r12 = 16;
        r11 = new int[16];
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x069f, code lost:
        if (r10 >= r12) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06a1, code lost:
        r11[r10] = r15[r10];
        r10 = r10 + 1;
        r12 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06aa, code lost:
        r10 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06ac, code lost:
        if (r10 <= 0) goto L_0x0933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06ae, code lost:
        r12 = r11[4] ^ defpackage.lzh.a(r11[0] + r11[r9], 7);
        r11[4] = r12;
        r9 = r11[r3] ^ defpackage.lzh.a(r12 + r11[0], 9);
        r11[r3] = r9;
        r9 = defpackage.lzh.a(r9 + r11[4], 13) ^ r11[12];
        r11[12] = r9;
        r11[0] = defpackage.lzh.a(r9 + r11[r3], 18) ^ r11[0];
        r9 = r11[9] ^ defpackage.lzh.a(r11[5] + r11[1], 7);
        r11[9] = r9;
        r9 = defpackage.lzh.a(r9 + r11[5], 9) ^ r11[13];
        r11[13] = r9;
        r9 = defpackage.lzh.a(r9 + r11[9], 13) ^ r11[1];
        r11[1] = r9;
        r11[5] = defpackage.lzh.a(r9 + r11[13], 18) ^ r11[5];
        r9 = r11[14] ^ defpackage.lzh.a(r11[10] + r11[6], 7);
        r11[14] = r9;
        r9 = defpackage.lzh.a(r9 + r11[10], 9) ^ r11[2];
        r11[2] = r9;
        r9 = defpackage.lzh.a(r9 + r11[14], 13) ^ r11[6];
        r11[6] = r9;
        r11[10] = defpackage.lzh.a(r9 + r11[2], 18) ^ r11[10];
        r12 = r11[3] ^ defpackage.lzh.a(r11[15] + r11[11], 7);
        r11[3] = r12;
        r9 = r11[7] ^ defpackage.lzh.a(r12 + r11[15], 9);
        r11[7] = r9;
        r9 = defpackage.lzh.a(r9 + r11[3], 13) ^ r11[11];
        r11[11] = r9;
        r11[15] = defpackage.lzh.a(r9 + r11[7], 18) ^ r11[15];
        r9 = r11[1] ^ defpackage.lzh.a(r11[0] + r11[3], 7);
        r11[1] = r9;
        r9 = defpackage.lzh.a(r9 + r11[0], 9) ^ r11[2];
        r11[2] = r9;
        r9 = defpackage.lzh.a(r9 + r11[1], 13) ^ r11[3];
        r11[3] = r9;
        r11[0] = defpackage.lzh.a(r9 + r11[2], 18) ^ r11[0];
        r12 = r11[6] ^ defpackage.lzh.a(r11[5] + r11[4], 7);
        r11[6] = r12;
        r9 = r11[7] ^ defpackage.lzh.a(r12 + r11[5], 9);
        r11[7] = r9;
        r9 = defpackage.lzh.a(r9 + r11[6], 13) ^ r11[4];
        r11[4] = r9;
        r11[5] = r11[5] ^ defpackage.lzh.a(r9 + r11[7], 18);
        r9 = r11[11] ^ defpackage.lzh.a(r11[10] + r11[9], 7);
        r11[11] = r9;
        r9 = defpackage.lzh.a(r9 + r11[10], 9) ^ r11[r3];
        r11[r3] = r9;
        r9 = defpackage.lzh.a(r9 + r11[11], 13) ^ r11[9];
        r11[9] = r9;
        r11[10] = defpackage.lzh.a(r9 + r11[r3], 18) ^ r11[10];
        r9 = defpackage.lzh.a(r11[15] + r11[14], 7) ^ r11[12];
        r11[12] = r9;
        r9 = r11[13] ^ defpackage.lzh.a(r9 + r11[15], 9);
        r11[13] = r9;
        r9 = r11[14] ^ defpackage.lzh.a(r9 + r11[12], 13);
        r11[14] = r9;
        r11[15] = r11[15] ^ defpackage.lzh.a(r9 + r11[13], 18);
        r10 = r10 - 2;
        r9 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0933, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x093c, code lost:
        if (r9 >= 16) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x093e, code lost:
        r11[r9] = r11[r9] + r15[r9];
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0949, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x094c, code lost:
        if (r9 < 16) goto L_0x09c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x094e, code lost:
        r9 = r2.a;
        r9[r3] = defpackage.lzh.a(r9[r3]);
        r9 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x095c, code lost:
        if (r9[r3] != 0) goto L_0x0969;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x095e, code lost:
        r9[9] = defpackage.lzh.a(r9[9]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x096d, code lost:
        if (r5 <= 64) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x096f, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0970, code lost:
        if (r9 < 64) goto L_0x0983;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0972, code lost:
        r5 = r5 - 64;
        r26 = r26 + 64;
        r16 = r16 + 64;
        r9 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0983, code lost:
        r8[r9 + r26] = (byte) ((r0[r9 + r16] ^ r14[r9]) & 255);
        r9 = r9 + 1;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0997, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0998, code lost:
        if (r2 >= r5) goto L_0x09ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x099a, code lost:
        r8[r2 + r26] = (byte) ((r0[r2 + r16] ^ r14[r2]) & 255);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x09c1, code lost:
        r24 = r9 * 4;
        r3 = r11[r9];
        r14[r24] = (byte) r3;
        r14[r24 + 1] = (byte) (r3 >>> 8);
        r14[r24 + 2] = (byte) (r3 >>> 16);
        r14[r24 + 3] = (byte) (r3 >> 24);
        r9 = r9 + 1;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x09f0, code lost:
        r2 = new java.lang.StringBuilder(18);
        r2.append("kbits: ");
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0a08, code lost:
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        return defpackage.lza.a(r6, r7, r8);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x049b A[Catch:{ UnsupportedEncodingException -> 0x04af }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x049d A[Catch:{ UnsupportedEncodingException -> 0x04af }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04b6 A[Catch:{ UnsupportedEncodingException -> 0x04ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04b8 A[Catch:{ UnsupportedEncodingException -> 0x04ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0509 A[SYNTHETIC, Splitter:B:175:0x0509] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0a3c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x01df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01cc A[SYNTHETIC, Splitter:B:39:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d6 A[SYNTHETIC, Splitter:B:46:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0211 A[LOOP:1: B:24:0x0161->B:53:0x0211, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(java.util.Map r36, byte[] r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "UTF-8"
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 0
            r9 = 0
        L_0x001b:
            int r10 = r0.length
            if (r9 >= r10) goto L_0x0077
            r10 = r0[r9]
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "em.V"
            boolean r11 = r10.contains(r11)
            if (r11 != 0) goto L_0x0057
            java.lang.String r11 = "j"
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L_0x003c
            java.lang.String r11 = "d.g"
            boolean r11 = r10.contains(r11)
            if (r11 != 0) goto L_0x0057
        L_0x003c:
            java.lang.String r11 = "a"
            boolean r11 = r10.startsWith(r11)
            if (r11 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x0074
        L_0x0045:
            java.lang.String r11 = "r.e"
            boolean r11 = r10.contains(r11)
            if (r11 == 0) goto L_0x0044
            r11 = 40
            int r10 = r10.indexOf(r11)
            r11 = 30
            if (r10 != r11) goto L_0x0044
        L_0x0057:
            java.lang.String r10 = ", "
            r7.append(r10)
            r10 = r0[r9]
            java.lang.String r10 = r10.getClassName()
            r7.append(r10)
            java.lang.String r10 = "."
            r7.append(r10)
            r10 = r0[r9]
            java.lang.String r10 = r10.getMethodName()
            r7.append(r10)
        L_0x0074:
            int r9 = r9 + 1
            goto L_0x001b
        L_0x0077:
            lzc r0 = new lzc
            java.lang.String r9 = "$"
            r7.append(r9)
            java.lang.String r9 = r7.toString()
            r0.<init>(r9)
            r9 = 102(0x66, float:1.43E-43)
            int[] r9 = new int[r9]
            r9 = {73, 196, 170, 158, 180, 182, 197, 170, 152, 37, 176, 161, 143, 203, 204, 197, 152, 192, 177, 107, 205, 185, 206, 178, 193, 177, 37, 132, 132, 202, 169, 178, 176, 152, 186, 114, 125, 169, 199, 177, 209, 185, 37, 195, 185, 193, 176, 202, 199, 107, 190, 132, 127, 190, 165, 15, 37, 192, 178, 202, 195, 197, 208, 180, 204, 178, 181, 170, 85, 143, 169, 193, 197, 208, 192, 195, 194, 120, 191, 194, 139, 201, 208, 203, 170, 197, 185, 4, 192, 176, 185, 169, 132, 152, 177, 170, 194, 188, 205, 143, 209, 143} // fill-array
            r10 = 77
            int r11 = r7.length()
            int r10 = java.lang.Math.min(r10, r11)
            java.lang.String r7 = r7.substring(r8, r10)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r0.a(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r9 = r0.length()
            if (r9 != 0) goto L_0x00b2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r0 = r7.concat(r0)
        L_0x00b6:
            r7 = r0
            lzc r9 = new lzc
            r9.<init>(r7)
            lzc r10 = new lzc
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r0 = r0.getName()
            r10.<init>(r0)
            lyz r0 = new lyz
            r0.<init>(r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            lzc r12 = r0.e
            int[] r13 = defpackage.lyz.d
            java.lang.String r12 = r12.a(r13)
            r0.a(r12, r11)
            lzc r12 = r0.e
            int[] r13 = defpackage.lyz.a
            java.lang.String r12 = r12.a(r13)
            r0.a(r12, r11)
            java.util.Collections.sort(r11)
            java.io.File r12 = new java.io.File
            lzc r13 = r0.e
            int[] r14 = defpackage.lyz.b
            java.lang.String r13 = r13.a(r14)
            r12.<init>(r13)
            lzc r13 = r0.e
            int[] r14 = defpackage.lyz.c
            java.lang.String r13 = r13.a(r14)
            java.lang.String r12 = defpackage.jkg.a((java.io.File) r12, (java.lang.String) r13)
            r11.add(r12)
            java.lang.String r11 = r11.toString()
            byte[] r11 = r11.getBytes()
            lzc r0 = r0.e
            int[] r12 = defpackage.lyz.c
            java.lang.String r0 = r0.a(r12)
            java.lang.String r11 = defpackage.jkg.a((byte[]) r11, (java.lang.String) r0)
            r13 = 11
            java.lang.String r14 = ""
            r8 = 2
            r15 = 9
            if (r3 != 0) goto L_0x0305
            int[] r0 = new int[r15]
            r0 = {217, 196, 195, 216, 204, 226, 186, 201, 80} // fill-array
            int[] r15 = new int[r8]
            r15 = {229, 102} // fill-array
            r8 = 27
            int[] r8 = new int[r8]
            r8 = {200, 208, 102, 196, 223, 157, 226, 196, 102, 224, 188, 219, 117, 223, 191, 196, 196, 102, 206, 211, 222, 210, 149, 183, 186, 224, 102} // fill-array
            int[] r12 = new int[r13]
            r12 = {102, 223, 191, 224, 192, 192, 217, 154, 183, 196, 196} // fill-array
            r26 = r14
            r13 = 16
            int[] r14 = new int[r13]
            r14 = {220, 149, 190, 149, 183, 214, 102, 228, 188, 220, 226, 210, 191, 6, 37, 183} // fill-array
            r27 = r4
            r13 = 7
            int[] r4 = new int[r13]
            r4 = {177, 224, 210, 117, 191, 149, 80} // fill-array
            r28 = r5
            r13 = 10
            int[] r5 = new int[r13]
            r5 = {211, 183, 186, 222, 223, 210, 171, 212, 220, 80} // fill-array
            r6 = 3
            int[][] r13 = new int[r6][]
            r18 = 0
            r13[r18] = r4
            r4 = 1
            r13[r4] = r5
            r4 = 2
            r13[r4] = r0
            r4 = 0
        L_0x0161:
            if (r4 >= r6) goto L_0x021c
            r5 = r13[r4]
            java.lang.String r0 = r9.a(r8)
            java.lang.String r6 = r9.a(r5)
            r30 = r8
            java.lang.String r8 = r9.a(r12)
            java.lang.String r31 = java.lang.String.valueOf(r0)
            int r31 = r31.length()
            java.lang.String r32 = java.lang.String.valueOf(r6)
            int r32 = r32.length()
            java.lang.String r33 = java.lang.String.valueOf(r8)
            int r33 = r33.length()
            r34 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r31 = r31 + r32
            r32 = r13
            int r13 = r31 + r33
            r12.<init>(r13)
            r12.append(r0)
            r12.append(r6)
            r12.append(r8)
            java.lang.String r0 = r12.toString()
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            r12.<init>(r0)     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            r8.<init>(r12)     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x01d2, all -> 0x01c7 }
            java.lang.String r8 = r6.readLine()     // Catch:{ IOException -> 0x01c5, all -> 0x01c1 }
            r6.close()     // Catch:{ IOException -> 0x01c5, all -> 0x01c1 }
            r6.close()     // Catch:{ IOException -> 0x01bf }
            goto L_0x01dd
        L_0x01bf:
            r0 = move-exception
            goto L_0x01dd
        L_0x01c1:
            r0 = move-exception
            r2 = r0
            r13 = r6
            goto L_0x01ca
        L_0x01c5:
            r0 = move-exception
            goto L_0x01d4
        L_0x01c7:
            r0 = move-exception
            r2 = r0
            r13 = 0
        L_0x01ca:
            if (r13 == 0) goto L_0x01d1
            r13.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d1
        L_0x01d0:
            r0 = move-exception
        L_0x01d1:
            throw r2
        L_0x01d2:
            r0 = move-exception
            r6 = 0
        L_0x01d4:
            if (r6 == 0) goto L_0x01dc
            r6.close()     // Catch:{ IOException -> 0x01db }
            r8 = 0
            goto L_0x01dd
        L_0x01db:
            r0 = move-exception
        L_0x01dc:
            r8 = 0
        L_0x01dd:
            if (r8 == 0) goto L_0x0211
            java.lang.String r0 = r9.a(r5)
            java.lang.String r4 = r9.a(r15)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r12 = r8.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r5 = r5 + r6
            int r5 = r5 + r12
            r13.<init>(r5)
            r13.append(r0)
            r13.append(r4)
            r13.append(r8)
            java.lang.String r0 = r13.toString()
            r4 = r0
            goto L_0x0221
        L_0x0211:
            int r4 = r4 + 1
            r8 = r30
            r13 = r32
            r12 = r34
            r6 = 3
            goto L_0x0161
        L_0x021c:
            java.lang.String r0 = r9.a(r14)
            r4 = r0
        L_0x0221:
            long r5 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r12
            lys r0 = new lys
            r0.<init>(r10)
            lzc r0 = r0.b
            int[] r8 = defpackage.lys.a
            java.lang.String r0 = r0.a(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Set r12 = r36.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0242:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0286
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.get(r13)
            if (r14 != 0) goto L_0x025f
            android.util.Pair r14 = new android.util.Pair
            java.lang.String r15 = "null"
            r14.<init>(r13, r15)
            r8.add(r14)
            goto L_0x0242
        L_0x025f:
            java.lang.Object r14 = r2.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            byte[] r14 = r14.getBytes()
            java.lang.String r14 = defpackage.jkg.a((byte[]) r14, (java.lang.String) r0)
            if (r14 == 0) goto L_0x027b
            int r15 = r14.length()
            r2 = 6
            if (r15 <= r2) goto L_0x027b
            r15 = 0
            java.lang.String r14 = r14.substring(r15, r2)
        L_0x027b:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r13, r14)
            r8.add(r2)
            r2 = r36
            goto L_0x0242
        L_0x0286:
            java.lang.String r2 = defpackage.lzd.a((java.util.List) r8)
            lyt r0 = new lyt
            r0.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Class r0 = r0.a
            java.lang.reflect.Field[] r12 = r0.getFields()
            int r13 = r12.length
            r14 = 0
        L_0x029c:
            if (r14 < r13) goto L_0x02b8
            java.lang.String r8 = defpackage.lzd.a((java.util.List) r8)
            lyu r0 = new lyu
            android.content.Context r12 = r1.b
            r0.<init>(r12)
            android.content.Context r0 = r0.a     // Catch:{ Exception -> 0x02b4 }
            long r12 = defpackage.jhg.a((android.content.Context) r0)     // Catch:{ Exception -> 0x02b4 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x02b4 }
            goto L_0x02b7
        L_0x02b4:
            r0 = move-exception
            java.lang.String r0 = "-"
        L_0x02b7:
            goto L_0x0312
        L_0x02b8:
            r0 = r12[r14]
            r15 = 1
            r0.setAccessible(r15)     // Catch:{ IllegalAccessException -> 0x02f9 }
            int r15 = r0.getModifiers()     // Catch:{ IllegalAccessException -> 0x02f9 }
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)     // Catch:{ IllegalAccessException -> 0x02f9 }
            if (r15 == 0) goto L_0x02e4
            android.util.Pair r15 = new android.util.Pair     // Catch:{ IllegalAccessException -> 0x02f9 }
            r36 = r2
            java.lang.String r2 = r0.getName()     // Catch:{ IllegalAccessException -> 0x02e2 }
            r30 = r4
            r4 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalAccessException -> 0x02f7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x02f7 }
            r15.<init>(r2, r0)     // Catch:{ IllegalAccessException -> 0x02f7 }
            r8.add(r15)     // Catch:{ IllegalAccessException -> 0x02f7 }
            goto L_0x02fe
        L_0x02e2:
            r0 = move-exception
            goto L_0x02fc
        L_0x02e4:
            r36 = r2
            r30 = r4
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IllegalAccessException -> 0x02f7 }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalAccessException -> 0x02f7 }
            java.lang.String r4 = "?"
            r2.<init>(r0, r4)     // Catch:{ IllegalAccessException -> 0x02f7 }
            r8.add(r2)     // Catch:{ IllegalAccessException -> 0x02f7 }
            goto L_0x02fe
        L_0x02f7:
            r0 = move-exception
            goto L_0x02fe
        L_0x02f9:
            r0 = move-exception
            r36 = r2
        L_0x02fc:
            r30 = r4
        L_0x02fe:
            int r14 = r14 + 1
            r2 = r36
            r4 = r30
            goto L_0x029c
        L_0x0305:
            r27 = r4
            r28 = r5
            r26 = r14
            r5 = 0
            r0 = r26
            r2 = r0
            r4 = r2
            r8 = r4
        L_0x0312:
            r12 = 7
            int[] r13 = new int[r12]
            r13 = {50, 27, 45, 48, 95, 116, 86} // fill-array
            byte[] r7 = r7.getBytes()
            java.lang.String r12 = r10.a(r13)
            java.lang.String r7 = defpackage.jkg.a((byte[]) r7, (java.lang.String) r12)
            lyw r12 = new lyw
            android.content.Context r13 = r1.b
            r12.<init>(r9, r13)
            r13 = 4
            java.lang.String[] r14 = new java.lang.String[r13]
            java.lang.String r15 = java.lang.String.valueOf(r5)
            r18 = 0
            r14[r18] = r15
            r15 = 1
            r14[r15] = r4
            r15 = 2
            r14[r15] = r0
            r15 = 3
            r14[r15] = r2
            if (r3 == 0) goto L_0x0349
            lyv r7 = r12.a((java.lang.String) r7, (byte[]) r3)
            r30 = r10
            goto L_0x037c
        L_0x0349:
            r15 = 19
            int[] r15 = new int[r15]
            r15 = {127, 4, 204, 209, 197, 211, 226, 218, 19, 202, 216, 115, 224, 211, 227, 206, 206, 53, 199} // fill-array
            lzc r13 = r12.a
            java.lang.String r13 = r13.a(r15)
            java.security.MessageDigest r13 = defpackage.jhg.b((java.lang.String) r13)
            if (r13 != 0) goto L_0x0360
            r30 = r10
            r10 = 0
            goto L_0x0378
        L_0x0360:
            r15 = 0
        L_0x0361:
            r30 = r10
            r10 = 4
            if (r15 >= r10) goto L_0x0374
            r10 = r14[r15]
            byte[] r10 = r10.getBytes()
            r13.update(r10)
            int r15 = r15 + 1
            r10 = r30
            goto L_0x0361
        L_0x0374:
            byte[] r10 = r13.digest()
        L_0x0378:
            lyv r7 = r12.a((java.lang.String) r7, (byte[]) r10)
        L_0x037c:
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "5="
            r10.append(r15)
            r10.append(r11)
            java.lang.String r11 = "\n7="
            r10.append(r11)
            java.lang.String r11 = r7.a
            r10.append(r11)
            java.lang.String r11 = "\n8="
            r10.append(r11)
            java.lang.String r11 = r7.b
            r10.append(r11)
            java.lang.String r11 = "\n9="
            r10.append(r11)
            java.lang.String r7 = r7.c
            r10.append(r7)
            if (r3 != 0) goto L_0x051d
            java.lang.Throwable r7 = r1.c
            java.lang.Throwable r7 = r7.getCause()
            java.lang.String r11 = "\n0="
            r10.append(r11)
            java.lang.String r11 = r1.a
            r10.append(r11)
            java.lang.String r11 = "\n1="
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = "\n2="
            r10.append(r4)
            r10.append(r5)
            java.lang.String r4 = "\n3="
            r10.append(r4)
            r10.append(r2)
            java.lang.String r2 = "\n4="
            r10.append(r2)
            r10.append(r0)
            java.lang.String r0 = "\n6="
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = "\n10="
            r10.append(r0)
            long r12 = r12 - r28
            r10.append(r12)
            java.lang.Throwable r0 = r1.c     // Catch:{ UnsupportedEncodingException -> 0x0406 }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0406 }
            r2 = r27
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0404 }
            java.lang.String r4 = "\n11="
            r10.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0404 }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0404 }
            goto L_0x0409
        L_0x0404:
            r0 = move-exception
            goto L_0x0409
        L_0x0406:
            r0 = move-exception
            r2 = r27
        L_0x0409:
            if (r7 == 0) goto L_0x0412
            java.lang.String r0 = r7.toString()     // Catch:{ UnsupportedEncodingException -> 0x0410 }
            goto L_0x0414
        L_0x0410:
            r0 = move-exception
            goto L_0x0420
        L_0x0412:
            r0 = r26
        L_0x0414:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0410 }
            java.lang.String r4 = "\n12="
            r10.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0410 }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0410 }
        L_0x0420:
            java.lang.Throwable r0 = r1.c     // Catch:{ UnsupportedEncodingException -> 0x0433 }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ UnsupportedEncodingException -> 0x0433 }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0433 }
            java.lang.String r4 = "\n13="
            r10.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0433 }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0433 }
            goto L_0x0434
        L_0x0433:
            r0 = move-exception
        L_0x0434:
            if (r7 == 0) goto L_0x043d
            java.lang.String r0 = android.util.Log.getStackTraceString(r7)     // Catch:{ UnsupportedEncodingException -> 0x043b }
            goto L_0x043f
        L_0x043b:
            r0 = move-exception
            goto L_0x044b
        L_0x043d:
            r0 = r26
        L_0x043f:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x043b }
            java.lang.String r4 = "\n14="
            r10.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x043b }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x043b }
        L_0x044b:
            lze r0 = new lze     // Catch:{ lzg -> 0x0487 }
            r0.<init>(r9)     // Catch:{ lzg -> 0x0487 }
            r4 = r26
            java.lang.String r5 = android.text.TextUtils.join(r4, r14)     // Catch:{ lzg -> 0x0485 }
            boolean r6 = defpackage.axet.b()     // Catch:{ lzg -> 0x0485 }
            if (r6 == 0) goto L_0x047e
            axet r6 = defpackage.axet.a     // Catch:{ lzg -> 0x0485 }
            axeu r6 = r6.a()     // Catch:{ lzg -> 0x0485 }
            boolean r6 = r6.b()     // Catch:{ lzg -> 0x0485 }
            if (r6 == 0) goto L_0x047e
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ lzg -> 0x0485 }
            lzf r6 = new lzf     // Catch:{ lzg -> 0x0485 }
            lzc r0 = r0.a     // Catch:{ lzg -> 0x0485 }
            r6.<init>(r0)     // Catch:{ lzg -> 0x0485 }
            java.lang.String r0 = r6.a((java.lang.String) r5)     // Catch:{ lzg -> 0x0485 }
            java.lang.String r5 = "\n15="
            r10.append(r5)     // Catch:{ lzg -> 0x0485 }
            r10.append(r0)     // Catch:{ lzg -> 0x0485 }
            goto L_0x04cb
        L_0x047e:
            lzg r0 = new lzg     // Catch:{ lzg -> 0x0485 }
            r5 = 4
            r0.<init>(r5)     // Catch:{ lzg -> 0x0485 }
            throw r0     // Catch:{ lzg -> 0x0485 }
        L_0x0485:
            r0 = move-exception
            goto L_0x048a
        L_0x0487:
            r0 = move-exception
            r4 = r26
        L_0x048a:
            r5 = r0
            java.lang.String r0 = "\n16="
            r10.append(r0)
            int r0 = r5.a
            r10.append(r0)
            java.lang.Throwable r0 = r5.getCause()     // Catch:{ UnsupportedEncodingException -> 0x04af }
            if (r0 != 0) goto L_0x049d
            r0 = r4
            goto L_0x04a1
        L_0x049d:
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x04af }
        L_0x04a1:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x04af }
            java.lang.String r6 = "\n17="
            r10.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x04af }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x04af }
            goto L_0x04b0
        L_0x04af:
            r0 = move-exception
        L_0x04b0:
            java.lang.Throwable r0 = r5.getCause()     // Catch:{ UnsupportedEncodingException -> 0x04ca }
            if (r0 != 0) goto L_0x04b8
            r0 = r4
            goto L_0x04bc
        L_0x04b8:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ UnsupportedEncodingException -> 0x04ca }
        L_0x04bc:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x04ca }
            java.lang.String r5 = "\n18="
            r10.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x04ca }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x04ca }
            goto L_0x04cb
        L_0x04ca:
            r0 = move-exception
        L_0x04cb:
            java.lang.String r0 = "\n19="
            r10.append(r0)
            java.lang.Throwable r0 = r1.c
        L_0x04d3:
            if (r0 != 0) goto L_0x04d7
            r14 = r4
            goto L_0x04f9
        L_0x04d7:
            boolean r5 = r0 instanceof defpackage.mbf
            if (r5 != 0) goto L_0x04ef
            boolean r5 = r0 instanceof defpackage.mbc
            if (r5 != 0) goto L_0x04e4
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x04d3
        L_0x04e4:
            mbc r0 = (defpackage.mbc) r0
            byte[] r0 = r0.a
            r4 = 11
            java.lang.String r14 = android.util.Base64.encodeToString(r0, r4)
            goto L_0x04f9
        L_0x04ef:
            r4 = 11
            mbf r0 = (defpackage.mbf) r0
            byte[] r0 = r0.a
            java.lang.String r14 = android.util.Base64.encodeToString(r0, r4)
        L_0x04f9:
            r10.append(r14)
            axez r0 = defpackage.axez.a
            axfa r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0509
            goto L_0x051d
        L_0x0509:
            android.content.Context r0 = r1.b     // Catch:{ UnsupportedEncodingException -> 0x051c }
            java.lang.String r0 = defpackage.lyq.b(r0)     // Catch:{ UnsupportedEncodingException -> 0x051c }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x051c }
            java.lang.String r2 = "\n20="
            r10.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x051c }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x051c }
            goto L_0x051d
        L_0x051c:
            r0 = move-exception
        L_0x051d:
            java.lang.String r0 = "\n"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            byte[] r2 = r0.getBytes()
            if (r3 != 0) goto L_0x0a3c
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0542 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0542 }
            r3.write(r2)     // Catch:{ IOException -> 0x0542 }
            r3.close()     // Catch:{ IOException -> 0x0542 }
            byte[] r2 = r0.toByteArray()
            goto L_0x0543
        L_0x0542:
            r0 = move-exception
        L_0x0543:
            r0 = 56
            int[] r0 = new int[r0]
            r0 = {29, 113, 97, 88, 9, 117, 9, 85, 91, 9, 74, 14, 93, 74, 114, 104, 107, 90, 90, 73, 57, 36, 77, 62, 98, 76, 36, 115, 110, 57, 92, 74, 102, 57, 114, 76, 104, 69, 107, 62, 30, 109, 72, 76, 92, 90, 53, 110, 74, 7, 15, 72, 75, 108, 57, 30} // fill-array
            r3 = r30
            java.lang.String r0 = r3.a(r0)
            byte[] r4 = r0.getBytes()
            lza r5 = new lza     // Catch:{ lzb -> 0x0a3a }
            r5.<init>(r3)     // Catch:{ lzb -> 0x0a3a }
            r3 = 8
            byte[] r6 = r5.a((int) r3)     // Catch:{ lzb -> 0x0a3a }
            int r0 = r6.length     // Catch:{ lzb -> 0x0a3a }
            r7 = 1
            r8 = 0
        L_0x0562:
            if (r8 < r0) goto L_0x0a26
            r8 = 2
            byte r0 = r6[r8]     // Catch:{ lzb -> 0x0a3a }
            r9 = r0 & -4
            r0 = r0 ^ r7
            r7 = 3
            r0 = r0 & r7
            r0 = r0 | r9
            byte r0 = (byte) r0     // Catch:{ lzb -> 0x0a3a }
            r6[r8] = r0     // Catch:{ lzb -> 0x0a3a }
            r0 = 32
            byte[] r7 = r5.a((int) r0)     // Catch:{ lzb -> 0x0a3a }
            r8 = 1
        L_0x0577:
            lzc r0 = r5.g     // Catch:{ Exception -> 0x0a0b }
            int[] r9 = defpackage.lza.a     // Catch:{ Exception -> 0x0a0b }
            java.lang.String r0 = r0.a(r9)     // Catch:{ Exception -> 0x0a0b }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0a0b }
            lzc r9 = r5.g     // Catch:{ Exception -> 0x0a0b }
            int[] r10 = defpackage.lza.d     // Catch:{ Exception -> 0x0a0b }
            java.lang.String r9 = r9.a(r10)     // Catch:{ Exception -> 0x0a0b }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0a0b }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x0a0b }
            java.lang.reflect.Method r9 = r0.getMethod(r9, r11)     // Catch:{ Exception -> 0x0a0b }
            lzc r10 = r5.g     // Catch:{ Exception -> 0x0a0b }
            int[] r11 = defpackage.lza.c     // Catch:{ Exception -> 0x0a0b }
            java.lang.String r10 = r10.a(r11)     // Catch:{ Exception -> 0x0a0b }
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0a0b }
            java.lang.Class<byte[]> r11 = byte[].class
            r13 = 0
            r12[r13] = r11     // Catch:{ Exception -> 0x0a0b }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r12)     // Catch:{ Exception -> 0x0a0b }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0a0b }
            lzc r10 = r5.g     // Catch:{ Exception -> 0x0a0b }
            int[] r12 = defpackage.lza.b     // Catch:{ Exception -> 0x0a0b }
            java.lang.String r10 = r10.a(r12)     // Catch:{ Exception -> 0x0a0b }
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x0a0b }
            r10 = 0
            java.lang.Object r9 = r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0a09 }
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0a09 }
            r13[r12] = r2     // Catch:{ Exception -> 0x0a09 }
            java.lang.Object r0 = r0.invoke(r9, r13)     // Catch:{ Exception -> 0x0a09 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0a09 }
            r5 = 2
            byte[][] r8 = new byte[r5][]     // Catch:{ lzb -> 0x0a3a }
            r5 = 0
            r8[r5] = r2     // Catch:{ lzb -> 0x0a3a }
            r2 = 1
            r8[r2] = r0     // Catch:{ lzb -> 0x0a3a }
            byte[] r0 = defpackage.lza.a((byte[][]) r8)     // Catch:{ lzb -> 0x0a3a }
            lzh r2 = new lzh     // Catch:{ lzb -> 0x0a3a }
            byte[] r5 = defpackage.lza.e     // Catch:{ lzb -> 0x0a3a }
            byte[] r8 = defpackage.lza.f     // Catch:{ lzb -> 0x0a3a }
            r2.<init>(r5, r8)     // Catch:{ lzb -> 0x0a3a }
            int r5 = r7.length     // Catch:{ lzb -> 0x0a3a }
            int r5 = r5 * 8
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r9 = 0
            int r10 = defpackage.lzh.a((byte[]) r7, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = 1
            r8[r9] = r10     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r9 = 4
            int r10 = defpackage.lzh.a((byte[]) r7, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = 2
            r8[r9] = r10     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r9 = defpackage.lzh.a((byte[]) r7, (int) r3)     // Catch:{ lzb -> 0x0a3a }
            r10 = 3
            r8[r10] = r9     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r9 = 12
            int r10 = defpackage.lzh.a((byte[]) r7, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r11 = 4
            r8[r11] = r10     // Catch:{ lzb -> 0x0a3a }
            r8 = 256(0x100, float:3.59E-43)
            if (r5 != r8) goto L_0x0613
            byte[] r5 = r2.b     // Catch:{ lzb -> 0x0a3a }
            r8 = 16
            goto L_0x061a
        L_0x0613:
            r8 = 128(0x80, float:1.794E-43)
            if (r5 != r8) goto L_0x09f0
            byte[] r5 = r2.c     // Catch:{ lzb -> 0x0a3a }
            r8 = 0
        L_0x061a:
            int[] r11 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r12 = defpackage.lzh.a((byte[]) r7, (int) r8)     // Catch:{ lzb -> 0x0a3a }
            r13 = 11
            r11[r13] = r12     // Catch:{ lzb -> 0x0a3a }
            int[] r11 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r12 = r8 + 4
            int r12 = defpackage.lzh.a((byte[]) r7, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r11[r9] = r12     // Catch:{ lzb -> 0x0a3a }
            int[] r11 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r12 = r8 + 8
            int r12 = defpackage.lzh.a((byte[]) r7, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r13 = 13
            r11[r13] = r12     // Catch:{ lzb -> 0x0a3a }
            int[] r11 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r8 = r8 + r9
            int r8 = defpackage.lzh.a((byte[]) r7, (int) r8)     // Catch:{ lzb -> 0x0a3a }
            r12 = 14
            r11[r12] = r8     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r11 = 0
            int r14 = defpackage.lzh.a((byte[]) r5, (int) r11)     // Catch:{ lzb -> 0x0a3a }
            r8[r11] = r14     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r11 = 4
            int r14 = defpackage.lzh.a((byte[]) r5, (int) r11)     // Catch:{ lzb -> 0x0a3a }
            r11 = 5
            r8[r11] = r14     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r14 = defpackage.lzh.a((byte[]) r5, (int) r3)     // Catch:{ lzb -> 0x0a3a }
            r15 = 10
            r8[r15] = r14     // Catch:{ lzb -> 0x0a3a }
            int[] r8 = r2.a     // Catch:{ lzb -> 0x0a3a }
            int r5 = defpackage.lzh.a((byte[]) r5, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r14 = 15
            r8[r14] = r5     // Catch:{ lzb -> 0x0a3a }
            int[] r5 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r8 = 0
            int r15 = defpackage.lzh.a((byte[]) r6, (int) r8)     // Catch:{ lzb -> 0x0a3a }
            r8 = 6
            r5[r8] = r15     // Catch:{ lzb -> 0x0a3a }
            int[] r5 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r8 = 4
            int r15 = defpackage.lzh.a((byte[]) r6, (int) r8)     // Catch:{ lzb -> 0x0a3a }
            r8 = 7
            r5[r8] = r15     // Catch:{ lzb -> 0x0a3a }
            int[] r5 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r8 = 0
            r5[r3] = r8     // Catch:{ lzb -> 0x0a3a }
            r15 = 9
            r5[r15] = r8     // Catch:{ lzb -> 0x0a3a }
            int r5 = r0.length     // Catch:{ lzb -> 0x0a3a }
            byte[] r8 = new byte[r5]     // Catch:{ lzb -> 0x0a3a }
            r15 = 64
            byte[] r14 = new byte[r15]     // Catch:{ lzb -> 0x0a3a }
            if (r5 != 0) goto L_0x0694
            goto L_0x09ab
        L_0x0694:
            r16 = 0
            r26 = 0
        L_0x0698:
            int[] r15 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r12 = 16
            int[] r11 = new int[r12]     // Catch:{ lzb -> 0x0a3a }
            r10 = 0
        L_0x069f:
            if (r10 >= r12) goto L_0x06aa
            r12 = r15[r10]     // Catch:{ lzb -> 0x0a3a }
            r11[r10] = r12     // Catch:{ lzb -> 0x0a3a }
            int r10 = r10 + 1
            r12 = 16
            goto L_0x069f
        L_0x06aa:
            r10 = 20
        L_0x06ac:
            if (r10 <= 0) goto L_0x0933
            r12 = 4
            r31 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 0
            r32 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r12 = r32 + r12
            r13 = 7
            int r12 = defpackage.lzh.a((int) r12, (int) r13)     // Catch:{ lzb -> 0x0a3a }
            r12 = r31 ^ r12
            r13 = 4
            r11[r13] = r12     // Catch:{ lzb -> 0x0a3a }
            r13 = r11[r3]     // Catch:{ lzb -> 0x0a3a }
            r18 = 0
            r31 = r11[r18]     // Catch:{ lzb -> 0x0a3a }
            int r12 = r12 + r31
            r9 = 9
            int r12 = defpackage.lzh.a((int) r12, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r13 ^ r12
            r11[r3] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 12
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 4
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 12
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 0
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = r11[r3]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r12
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 0
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 9
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 5
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 1
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r13 = r13 + r33
            r9 = 7
            int r13 = defpackage.lzh.a((int) r13, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r12 ^ r13
            r12 = 9
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 13
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 5
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 9
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 13
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 1
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 9
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 1
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 5
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 13
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 5
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 14
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 10
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 6
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r13 = r13 + r33
            r9 = 7
            int r13 = defpackage.lzh.a((int) r13, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r12 ^ r13
            r12 = 14
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 2
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 10
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 9
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 2
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 6
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 14
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 6
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 10
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 2
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 10
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 3
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 15
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 11
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r13 = r13 + r33
            r9 = 7
            int r13 = defpackage.lzh.a((int) r13, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r12 = r12 ^ r13
            r13 = 3
            r11[r13] = r12     // Catch:{ lzb -> 0x0a3a }
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 15
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r12 = r12 + r33
            r9 = 9
            int r12 = defpackage.lzh.a((int) r12, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r13 ^ r12
            r12 = 7
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 11
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 3
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 11
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 15
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 7
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 15
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 1
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 0
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 3
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r13 = r13 + r33
            r9 = 7
            int r13 = defpackage.lzh.a((int) r13, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r12 ^ r13
            r12 = 1
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 2
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 0
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 9
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 2
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 3
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 1
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 3
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 0
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 2
            r33 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 0
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 6
            r12 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 5
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 4
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r13 = r13 + r33
            r9 = 7
            int r13 = defpackage.lzh.a((int) r13, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r12 = r12 ^ r13
            r13 = 6
            r11[r13] = r12     // Catch:{ lzb -> 0x0a3a }
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 5
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r12 = r12 + r33
            r9 = 9
            int r12 = defpackage.lzh.a((int) r12, (int) r9)     // Catch:{ lzb -> 0x0a3a }
            r9 = r13 ^ r12
            r12 = 7
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 4
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = 6
            r17 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r17
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 4
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r13 = 5
            r33 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            r13 = 7
            r34 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r34
            r13 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r13)     // Catch:{ lzb -> 0x0a3a }
            r9 = r33 ^ r9
            r13 = 5
            r11[r13] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 11
            r29 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 10
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 9
            r34 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r33 + r34
            r12 = 7
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r29 ^ r9
            r12 = 11
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = r11[r3]     // Catch:{ lzb -> 0x0a3a }
            r20 = 10
            r29 = r11[r20]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r29
            r13 = 9
            int r9 = defpackage.lzh.a((int) r9, (int) r13)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r12
            r11[r3] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            r13 = 11
            r25 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r25
            r13 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r13)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r12
            r12 = 9
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r12 = 10
            r13 = r11[r12]     // Catch:{ lzb -> 0x0a3a }
            r12 = r11[r3]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r12
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r12 = 10
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r9 = 12
            r13 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 15
            r20 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r9 = 14
            r33 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r20 + r33
            r12 = 7
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r13
            r13 = 12
            r11[r13] = r9     // Catch:{ lzb -> 0x0a3a }
            r13 = 13
            r21 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            r13 = 15
            r33 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r33
            r13 = 9
            int r9 = defpackage.lzh.a((int) r9, (int) r13)     // Catch:{ lzb -> 0x0a3a }
            r9 = r21 ^ r9
            r13 = 13
            r11[r13] = r9     // Catch:{ lzb -> 0x0a3a }
            r13 = 14
            r21 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            r13 = 12
            r31 = r11[r13]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r31
            r12 = 13
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r21 ^ r9
            r12 = 14
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            r21 = 15
            r28 = r11[r21]     // Catch:{ lzb -> 0x0a3a }
            r21 = 13
            r32 = r11[r21]     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + r32
            r12 = 18
            int r9 = defpackage.lzh.a((int) r9, (int) r12)     // Catch:{ lzb -> 0x0a3a }
            r9 = r28 ^ r9
            r12 = 15
            r11[r12] = r9     // Catch:{ lzb -> 0x0a3a }
            int r10 = r10 + -2
            r9 = 12
            r13 = 13
            goto L_0x06ac
        L_0x0933:
            r12 = 15
            r13 = 12
            r21 = 13
            r9 = 0
        L_0x093a:
            r10 = 16
            if (r9 >= r10) goto L_0x0949
            r10 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            r28 = r15[r9]     // Catch:{ lzb -> 0x0a3a }
            int r10 = r10 + r28
            r11[r9] = r10     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + 1
            goto L_0x093a
        L_0x0949:
            r9 = 0
        L_0x094a:
            r15 = 16
            if (r9 < r15) goto L_0x09c1
            int[] r9 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r10 = r9[r3]     // Catch:{ lzb -> 0x0a3a }
            int r10 = defpackage.lzh.a(r10)     // Catch:{ lzb -> 0x0a3a }
            r9[r3] = r10     // Catch:{ lzb -> 0x0a3a }
            int[] r9 = r2.a     // Catch:{ lzb -> 0x0a3a }
            r10 = r9[r3]     // Catch:{ lzb -> 0x0a3a }
            if (r10 != 0) goto L_0x0969
            r22 = 9
            r10 = r9[r22]     // Catch:{ lzb -> 0x0a3a }
            int r10 = defpackage.lzh.a(r10)     // Catch:{ lzb -> 0x0a3a }
            r9[r22] = r10     // Catch:{ lzb -> 0x0a3a }
            goto L_0x096b
        L_0x0969:
            r22 = 9
        L_0x096b:
            r10 = 64
            if (r5 <= r10) goto L_0x0997
            r9 = 0
        L_0x0970:
            if (r9 < r10) goto L_0x0983
            int r5 = r5 + -64
            int r26 = r26 + 64
            int r16 = r16 + 64
            r9 = 12
            r11 = 5
            r12 = 14
            r13 = 13
            r15 = 64
            goto L_0x0698
        L_0x0983:
            int r11 = r9 + r26
            int r23 = r9 + r16
            byte r23 = r0[r23]     // Catch:{ lzb -> 0x0a3a }
            byte r27 = r14[r9]     // Catch:{ lzb -> 0x0a3a }
            r3 = r23 ^ r27
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch:{ lzb -> 0x0a3a }
            r8[r11] = r3     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + 1
            r3 = 8
            goto L_0x0970
        L_0x0997:
            r2 = 0
        L_0x0998:
            if (r2 >= r5) goto L_0x09ab
            int r3 = r2 + r26
            int r9 = r2 + r16
            byte r9 = r0[r9]     // Catch:{ lzb -> 0x0a3a }
            byte r10 = r14[r2]     // Catch:{ lzb -> 0x0a3a }
            r9 = r9 ^ r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9     // Catch:{ lzb -> 0x0a3a }
            r8[r3] = r9     // Catch:{ lzb -> 0x0a3a }
            int r2 = r2 + 1
            goto L_0x0998
        L_0x09ab:
            r3 = 3
            byte[][] r0 = new byte[r3][]     // Catch:{ lzb -> 0x0a3a }
            r18 = 0
            r0[r18] = r6     // Catch:{ lzb -> 0x0a3a }
            r19 = 1
            r0[r19] = r7     // Catch:{ lzb -> 0x0a3a }
            r23 = 2
            r0[r23] = r8     // Catch:{ lzb -> 0x0a3a }
            byte[] r4 = defpackage.lza.a((byte[][]) r0)     // Catch:{ lzb -> 0x0a3a }
            goto L_0x0a3b
        L_0x09c1:
            r3 = 3
            r10 = 64
            r18 = 0
            r19 = 1
            r22 = 9
            r23 = 2
            int r24 = r9 * 4
            r3 = r11[r9]     // Catch:{ lzb -> 0x0a3a }
            byte r10 = (byte) r3     // Catch:{ lzb -> 0x0a3a }
            r14[r24] = r10     // Catch:{ lzb -> 0x0a3a }
            int r10 = r24 + 1
            int r12 = r3 >>> 8
            byte r12 = (byte) r12     // Catch:{ lzb -> 0x0a3a }
            r14[r10] = r12     // Catch:{ lzb -> 0x0a3a }
            int r10 = r24 + 2
            int r12 = r3 >>> 16
            byte r12 = (byte) r12     // Catch:{ lzb -> 0x0a3a }
            r14[r10] = r12     // Catch:{ lzb -> 0x0a3a }
            int r24 = r24 + 3
            int r3 = r3 >> 24
            byte r3 = (byte) r3     // Catch:{ lzb -> 0x0a3a }
            r14[r24] = r3     // Catch:{ lzb -> 0x0a3a }
            int r9 = r9 + 1
            r3 = 8
            r12 = 15
            goto L_0x094a
        L_0x09f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ lzb -> 0x0a3a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ lzb -> 0x0a3a }
            r3 = 18
            r2.<init>(r3)     // Catch:{ lzb -> 0x0a3a }
            java.lang.String r3 = "kbits: "
            r2.append(r3)     // Catch:{ lzb -> 0x0a3a }
            r2.append(r5)     // Catch:{ lzb -> 0x0a3a }
            java.lang.String r2 = r2.toString()     // Catch:{ lzb -> 0x0a3a }
            r0.<init>(r2)     // Catch:{ lzb -> 0x0a3a }
            throw r0     // Catch:{ lzb -> 0x0a3a }
        L_0x0a09:
            r0 = move-exception
            goto L_0x0a0d
        L_0x0a0b:
            r0 = move-exception
            r10 = 0
        L_0x0a0d:
            r15 = 16
            r18 = 0
            r19 = 1
            r22 = 9
            r23 = 2
            lzb r3 = new lzb     // Catch:{ lzb -> 0x0a1d }
            r3.<init>(r0)     // Catch:{ lzb -> 0x0a1d }
            throw r3     // Catch:{ lzb -> 0x0a1d }
        L_0x0a1d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0a25
            r3 = 8
            r8 = 0
            goto L_0x0577
        L_0x0a25:
            throw r0     // Catch:{ lzb -> 0x0a3a }
        L_0x0a26:
            r10 = 0
            r15 = 16
            r18 = 0
            r19 = 1
            r22 = 9
            r23 = 2
            byte r3 = r6[r8]     // Catch:{ lzb -> 0x0a3a }
            r7 = r7 ^ r3
            int r8 = r8 + 1
            r3 = 8
            goto L_0x0562
        L_0x0a3a:
            r0 = move-exception
        L_0x0a3b:
            return r4
        L_0x0a3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyx.a(java.util.Map, byte[]):byte[]");
    }
}
