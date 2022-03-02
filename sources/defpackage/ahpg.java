package defpackage;

import java.io.Serializable;

/* renamed from: ahpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpg implements Serializable {
    public static final Object a = new Object();
    public static ahpg b;
    private final ahpa c;
    private final ahpa[] d;
    private final ahpa[] e;
    private int f = 0;
    private int g = 0;
    private float h;

    public ahpg(String str) {
        int i = 0;
        float f2 = 1.0f;
        this.h = 1.0f;
        this.c = new ahpa(5);
        this.d = new ahpa[3];
        this.e = new ahpa[10];
        int i2 = 0;
        while (true) {
            ahpa[] ahpaArr = this.d;
            int length = ahpaArr.length;
            if (i2 >= 3) {
                break;
            }
            ahpaArr[i2] = new ahpa(5);
            i2++;
        }
        while (true) {
            ahpa[] ahpaArr2 = this.e;
            int length2 = ahpaArr2.length;
            if (i >= 10) {
                break;
            }
            ahpaArr2[i] = new ahpa(5);
            i++;
        }
        this.h = ahpb.a.containsKey(str) ? ((Float) ahpb.a.get(str)).floatValue() : f2;
    }

    static final float a(float f2) {
        return (float) Math.max(Math.log10((double) Math.abs(f2)) * 10.0d, -10000.0d);
    }

    private static final void a(ahpf ahpf, String str, int i, float f2) {
        String valueOf = String.valueOf(ahpf.a[i]);
        ahpf.a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03f8, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ahpf a(java.util.Map r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            monitor-enter(r18)
            ahpf r3 = new ahpf     // Catch:{ all -> 0x03ff }
            r3.<init>()     // Catch:{ all -> 0x03ff }
            ahup r4 = defpackage.ahup.SOUND     // Catch:{ all -> 0x03ff }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03ff }
            ahyq r4 = (defpackage.ahyq) r4     // Catch:{ all -> 0x03ff }
            int r5 = r1.f     // Catch:{ all -> 0x03ff }
            int r6 = r2 - r5
            r7 = 0
            if (r5 == 0) goto L_0x0022
            int r8 = r6 + 60
            int r8 = r8 / 360
            int r8 = r8 + -1
            goto L_0x0023
        L_0x0022:
            r8 = 0
        L_0x0023:
            r9 = 4
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x03ff }
            r10 = 1
            if (r5 == 0) goto L_0x0032
            r5 = 330(0x14a, float:4.62E-43)
            if (r6 >= r5) goto L_0x0032
            r5 = 0
            goto L_0x0033
        L_0x0032:
            r5 = 1
        L_0x0033:
            r6 = 1073741824(0x40000000, float:2.0)
            r13 = 2
            if (r4 != 0) goto L_0x003a
            goto L_0x01c3
        L_0x003a:
            int r15 = r4.b     // Catch:{ all -> 0x03ff }
            if (r15 <= 0) goto L_0x01c3
            int r15 = r1.g     // Catch:{ all -> 0x03ff }
            if (r15 == 0) goto L_0x004b
            int r15 = r2 - r15
            int r15 = r15 + 60
            int r15 = r15 / 360
            int r15 = r15 + -1
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            int r9 = java.lang.Math.min(r15, r9)     // Catch:{ all -> 0x03ff }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0057:
            int r11 = r4.b     // Catch:{ all -> 0x03ff }
            if (r15 >= r11) goto L_0x0077
            float r11 = r4.a(r15, r7)     // Catch:{ all -> 0x03ff }
            boolean r12 = java.lang.Float.isInfinite(r11)     // Catch:{ all -> 0x03ff }
            if (r12 == 0) goto L_0x0066
        L_0x0065:
            goto L_0x0074
        L_0x0066:
            boolean r12 = java.lang.Float.isNaN(r11)     // Catch:{ all -> 0x03ff }
            if (r12 != 0) goto L_0x0065
            float r16 = r16 + r11
            float r11 = r11 * r11
            float r17 = r17 + r11
            int r14 = r14 + 1
        L_0x0074:
            int r15 = r15 + 1
            goto L_0x0057
        L_0x0077:
            if (r14 == 0) goto L_0x007d
            float r11 = (float) r14     // Catch:{ all -> 0x03ff }
            float r11 = r16 / r11
            goto L_0x007e
        L_0x007d:
            r11 = 0
        L_0x007e:
            if (r14 == 0) goto L_0x0088
            float r16 = r16 * r11
            float r17 = r17 - r16
            float r12 = (float) r14     // Catch:{ all -> 0x03ff }
            float r17 = r17 / r12
            goto L_0x008a
        L_0x0088:
            r17 = 0
        L_0x008a:
            float[] r12 = new float[r13]     // Catch:{ all -> 0x03ff }
            r12[r7] = r11     // Catch:{ all -> 0x03ff }
            r12[r10] = r17     // Catch:{ all -> 0x03ff }
            r11 = r12[r7]     // Catch:{ all -> 0x03ff }
            float r11 = a(r11)     // Catch:{ all -> 0x03ff }
            r14 = 1101004800(0x41a00000, float:20.0)
            float r11 = java.lang.Math.max(r11, r14)     // Catch:{ all -> 0x03ff }
            r3.i = r11     // Catch:{ all -> 0x03ff }
            r11 = r12[r10]     // Catch:{ all -> 0x03ff }
            double r14 = (double) r11     // Catch:{ all -> 0x03ff }
            double r14 = java.lang.Math.sqrt(r14)     // Catch:{ all -> 0x03ff }
            float r11 = (float) r14     // Catch:{ all -> 0x03ff }
            float r11 = a(r11)     // Catch:{ all -> 0x03ff }
            r3.j = r11     // Catch:{ all -> 0x03ff }
            r11 = r12[r10]     // Catch:{ all -> 0x03ff }
            double r14 = (double) r11     // Catch:{ all -> 0x03ff }
            double r14 = java.lang.Math.sqrt(r14)     // Catch:{ all -> 0x03ff }
            float r11 = (float) r14     // Catch:{ all -> 0x03ff }
            r12 = r12[r7]     // Catch:{ all -> 0x03ff }
            float r11 = r11 / r12
            r3.k = r11     // Catch:{ all -> 0x03ff }
            r11 = 1
        L_0x00bb:
            r12 = 23
            r14 = 27
            if (r11 >= r12) goto L_0x00f3
            int r12 = r11 + 44
            r15 = 0
            r16 = 0
        L_0x00c6:
            int r13 = r4.b     // Catch:{ all -> 0x03ff }
            if (r15 < r13) goto L_0x00e5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ff }
            r12.<init>(r14)     // Catch:{ all -> 0x03ff }
            java.lang.String r14 = "soundMeanLogBark"
            r12.append(r14)     // Catch:{ all -> 0x03ff }
            r12.append(r11)     // Catch:{ all -> 0x03ff }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x03ff }
            float r13 = (float) r13     // Catch:{ all -> 0x03ff }
            float r13 = r16 / r13
            r3.a(r12, r13)     // Catch:{ all -> 0x03ff }
            int r11 = r11 + 1
            r13 = 2
            goto L_0x00bb
        L_0x00e5:
            float r13 = r4.a(r15, r12)     // Catch:{ all -> 0x03ff }
            float r13 = a(r13)     // Catch:{ all -> 0x03ff }
            float r16 = r16 + r13
            int r15 = r15 + 1
            r13 = 2
            goto L_0x00c6
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            r11 = 10
            if (r4 >= r11) goto L_0x0154
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ff }
            r11.<init>(r14)     // Catch:{ all -> 0x03ff }
            java.lang.String r12 = "soundMeanLogBark"
            r11.append(r12)     // Catch:{ all -> 0x03ff }
            int r12 = r4 + 12
            r11.append(r12)     // Catch:{ all -> 0x03ff }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x03ff }
            float r11 = r3.a(r11)     // Catch:{ all -> 0x03ff }
            r12 = 1106247680(0x41f00000, float:30.0)
            float r11 = java.lang.Math.max(r11, r12)     // Catch:{ all -> 0x03ff }
            if (r9 <= 0) goto L_0x013a
            ahpa[] r12 = r1.e     // Catch:{ all -> 0x03ff }
            r12 = r12[r4]     // Catch:{ all -> 0x03ff }
            int r12 = r12.a()     // Catch:{ all -> 0x03ff }
            if (r12 == 0) goto L_0x012a
            ahpa[] r12 = r1.e     // Catch:{ all -> 0x03ff }
            r12 = r12[r4]     // Catch:{ all -> 0x03ff }
            float r12 = r12.c()     // Catch:{ all -> 0x03ff }
            goto L_0x012b
        L_0x012a:
            r12 = r11
        L_0x012b:
            float r12 = r12 + r11
            float r12 = r12 / r6
            r13 = 0
        L_0x012e:
            if (r13 >= r9) goto L_0x013a
            ahpa[] r15 = r1.e     // Catch:{ all -> 0x03ff }
            r15 = r15[r4]     // Catch:{ all -> 0x03ff }
            r15.a((float) r12)     // Catch:{ all -> 0x03ff }
            int r13 = r13 + 1
            goto L_0x012e
        L_0x013a:
            if (r5 != 0) goto L_0x014a
            ahpa[] r12 = r1.e     // Catch:{ all -> 0x03ff }
            r12 = r12[r4]     // Catch:{ all -> 0x03ff }
            float r13 = r12.c()     // Catch:{ all -> 0x03ff }
            float r11 = r11 + r13
            float r11 = r11 / r6
            r12.b(r11)     // Catch:{ all -> 0x03ff }
            goto L_0x0151
        L_0x014a:
            ahpa[] r12 = r1.e     // Catch:{ all -> 0x03ff }
            r12 = r12[r4]     // Catch:{ all -> 0x03ff }
            r12.a((float) r11)     // Catch:{ all -> 0x03ff }
        L_0x0151:
            int r4 = r4 + 1
            goto L_0x00f4
        L_0x0154:
            ahpa[] r4 = r1.e     // Catch:{ all -> 0x03ff }
            r4 = r4[r7]     // Catch:{ all -> 0x03ff }
            float[] r4 = r4.b()     // Catch:{ all -> 0x03ff }
            int r4 = r4.length     // Catch:{ all -> 0x03ff }
            float[] r9 = new float[r4]     // Catch:{ all -> 0x03ff }
            if (r4 <= 0) goto L_0x01a7
            float[] r12 = new float[r4]     // Catch:{ all -> 0x03ff }
            r13 = 0
        L_0x0164:
            if (r13 >= r11) goto L_0x0193
            ahpa[] r14 = r1.e     // Catch:{ all -> 0x03ff }
            r14 = r14[r13]     // Catch:{ all -> 0x03ff }
            float[] r14 = r14.b()     // Catch:{ all -> 0x03ff }
            r15 = 0
        L_0x016f:
            if (r15 >= r4) goto L_0x018a
            r16 = r12[r15]     // Catch:{ all -> 0x03ff }
            r11 = r14[r15]     // Catch:{ all -> 0x03ff }
            double r10 = (double) r11     // Catch:{ all -> 0x03ff }
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r10, r6)     // Catch:{ all -> 0x03ff }
            float r6 = (float) r10     // Catch:{ all -> 0x03ff }
            float r16 = r16 + r6
            r12[r15] = r16     // Catch:{ all -> 0x03ff }
            int r15 = r15 + 1
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            r10 = 1
            r11 = 10
            goto L_0x016f
        L_0x018a:
            int r13 = r13 + 1
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            r10 = 1
            r11 = 10
            goto L_0x0164
        L_0x0193:
            r6 = 0
        L_0x0194:
            if (r6 >= r4) goto L_0x01a7
            r7 = r12[r6]     // Catch:{ all -> 0x03ff }
            double r10 = (double) r7     // Catch:{ all -> 0x03ff }
            double r10 = java.lang.Math.sqrt(r10)     // Catch:{ all -> 0x03ff }
            long r10 = java.lang.Math.round(r10)     // Catch:{ all -> 0x03ff }
            float r7 = (float) r10     // Catch:{ all -> 0x03ff }
            r9[r6] = r7     // Catch:{ all -> 0x03ff }
            int r6 = r6 + 1
            goto L_0x0194
        L_0x01a7:
            r6 = 0
        L_0x01a8:
            java.lang.String[] r7 = defpackage.ahpf.a     // Catch:{ all -> 0x03ff }
            int r7 = r7.length     // Catch:{ all -> 0x03ff }
            if (r6 < r7) goto L_0x01b0
            r1.g = r2     // Catch:{ all -> 0x03ff }
            goto L_0x01c3
        L_0x01b0:
            if (r4 <= r6) goto L_0x01b9
            int r7 = r4 - r6
            int r7 = r7 + -1
            r7 = r9[r7]     // Catch:{ all -> 0x03ff }
            goto L_0x01bb
        L_0x01b9:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x01bb:
            java.lang.String r10 = "soundMeanLogBark"
            a(r3, r10, r6, r7)     // Catch:{ all -> 0x03ff }
            int r6 = r6 + 1
            goto L_0x01a8
        L_0x01c3:
            ahup r4 = defpackage.ahup.ACCELEROMETER     // Catch:{ all -> 0x03ff }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x03ff }
            ahyq r4 = (defpackage.ahyq) r4     // Catch:{ all -> 0x03ff }
            if (r4 != 0) goto L_0x01cf
            goto L_0x0345
        L_0x01cf:
            int r6 = r4.b     // Catch:{ all -> 0x03ff }
            if (r6 <= 0) goto L_0x0345
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x01d7:
            if (r7 < r6) goto L_0x0329
            float r4 = (float) r6
            float r9 = r9 / r4
            float r10 = r10 / r4
            float r11 = r11 / r4
            float r4 = r9 * r9
            float r6 = r10 * r10
            float r4 = r4 + r6
            float r6 = r11 * r11
            float r4 = r4 + r6
            double r6 = (double) r4
            double r6 = java.lang.Math.sqrt(r6)     // Catch:{ all -> 0x03fb }
            float r4 = (float) r6
            r12 = 0
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x01f2
            float r9 = r9 / r4
            goto L_0x01f3
        L_0x01f2:
            r9 = 0
        L_0x01f3:
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x01f9
            float r10 = r10 / r4
            goto L_0x01fa
        L_0x01f9:
            r10 = 0
        L_0x01fa:
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0200
            float r11 = r11 / r4
            goto L_0x0201
        L_0x0200:
            r11 = 0
        L_0x0201:
            if (r8 <= 0) goto L_0x0260
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03ff }
            r6 = 0
            r4 = r4[r6]     // Catch:{ all -> 0x03ff }
            int r4 = r4.a()     // Catch:{ all -> 0x03ff }
            if (r4 == 0) goto L_0x0217
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03ff }
            r4 = r4[r6]     // Catch:{ all -> 0x03ff }
            float r4 = r4.c()     // Catch:{ all -> 0x03ff }
            goto L_0x0218
        L_0x0217:
            r4 = r9
        L_0x0218:
            ahpa[] r6 = r1.d     // Catch:{ all -> 0x03ff }
            r7 = 1
            r6 = r6[r7]     // Catch:{ all -> 0x03ff }
            int r6 = r6.a()     // Catch:{ all -> 0x03ff }
            if (r6 == 0) goto L_0x022c
            ahpa[] r6 = r1.d     // Catch:{ all -> 0x03ff }
            r6 = r6[r7]     // Catch:{ all -> 0x03ff }
            float r6 = r6.c()     // Catch:{ all -> 0x03ff }
            goto L_0x022d
        L_0x022c:
            r6 = r10
        L_0x022d:
            ahpa[] r7 = r1.d     // Catch:{ all -> 0x03ff }
            r13 = 2
            r7 = r7[r13]     // Catch:{ all -> 0x03ff }
            int r7 = r7.a()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x0241
            ahpa[] r7 = r1.d     // Catch:{ all -> 0x03ff }
            r7 = r7[r13]     // Catch:{ all -> 0x03ff }
            float r7 = r7.c()     // Catch:{ all -> 0x03ff }
            goto L_0x0242
        L_0x0241:
            r7 = r11
        L_0x0242:
            r13 = 0
        L_0x0243:
            if (r13 >= r8) goto L_0x0260
            ahpa[] r14 = r1.d     // Catch:{ all -> 0x03ff }
            r15 = 0
            r14 = r14[r15]     // Catch:{ all -> 0x03ff }
            r14.a((float) r4)     // Catch:{ all -> 0x03ff }
            ahpa[] r14 = r1.d     // Catch:{ all -> 0x03ff }
            r15 = 1
            r14 = r14[r15]     // Catch:{ all -> 0x03ff }
            r14.a((float) r6)     // Catch:{ all -> 0x03ff }
            ahpa[] r14 = r1.d     // Catch:{ all -> 0x03ff }
            r15 = 2
            r14 = r14[r15]     // Catch:{ all -> 0x03ff }
            r14.a((float) r7)     // Catch:{ all -> 0x03ff }
            int r13 = r13 + 1
            goto L_0x0243
        L_0x0260:
            if (r5 != 0) goto L_0x0293
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03ff }
            r6 = 0
            r4 = r4[r6]     // Catch:{ all -> 0x03ff }
            float r6 = r4.c()     // Catch:{ all -> 0x03ff }
            float r9 = r9 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r6
            r4.b(r9)     // Catch:{ all -> 0x03ff }
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03ff }
            r6 = 1
            r4 = r4[r6]     // Catch:{ all -> 0x03ff }
            float r6 = r4.c()     // Catch:{ all -> 0x03ff }
            float r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r6
            r4.b(r10)     // Catch:{ all -> 0x03ff }
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03ff }
            r6 = 2
            r4 = r4[r6]     // Catch:{ all -> 0x03ff }
            float r6 = r4.c()     // Catch:{ all -> 0x03ff }
            float r11 = r11 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r6
            r4.b(r11)     // Catch:{ all -> 0x03ff }
            goto L_0x02ab
        L_0x0293:
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03fb }
            r6 = 0
            r4 = r4[r6]     // Catch:{ all -> 0x03fb }
            r4.a((float) r9)     // Catch:{ all -> 0x03fb }
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03fb }
            r6 = 1
            r4 = r4[r6]     // Catch:{ all -> 0x03fb }
            r4.a((float) r10)     // Catch:{ all -> 0x03fb }
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03fb }
            r6 = 2
            r4 = r4[r6]     // Catch:{ all -> 0x03fb }
            r4.a((float) r11)     // Catch:{ all -> 0x03fb }
        L_0x02ab:
            ahpa[] r4 = r1.d     // Catch:{ all -> 0x03fb }
            r6 = 0
            r4 = r4[r6]     // Catch:{ all -> 0x03fb }
            int r4 = r4.a()     // Catch:{ all -> 0x03fb }
            r7 = 1
            if (r4 == r7) goto L_0x031f
            ahpa[] r7 = r1.d     // Catch:{ all -> 0x03fb }
            r9 = 0
            r7 = r7[r9]     // Catch:{ all -> 0x03fb }
            float[] r7 = r7.b()     // Catch:{ all -> 0x03fb }
            ahpa[] r9 = r1.d     // Catch:{ all -> 0x03fb }
            r10 = 1
            r9 = r9[r10]     // Catch:{ all -> 0x03fb }
            float[] r9 = r9.b()     // Catch:{ all -> 0x03fb }
            ahpa[] r10 = r1.d     // Catch:{ all -> 0x03fb }
            r11 = 2
            r10 = r10[r11]     // Catch:{ all -> 0x03fb }
            float[] r10 = r10.b()     // Catch:{ all -> 0x03fb }
            int r4 = r4 + -1
            float[] r11 = new float[r4]     // Catch:{ all -> 0x03fb }
            r13 = 0
        L_0x02d7:
            if (r13 >= r4) goto L_0x0305
            r14 = r7[r13]     // Catch:{ all -> 0x03fb }
            r15 = r9[r13]     // Catch:{ all -> 0x03fb }
            r12 = r10[r13]     // Catch:{ all -> 0x03fb }
            r17 = r7
            double r6 = (double) r14     // Catch:{ all -> 0x03fb }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r6, r0)     // Catch:{ all -> 0x03fb }
            double r14 = (double) r15     // Catch:{ all -> 0x03fb }
            double r14 = java.lang.Math.pow(r14, r0)     // Catch:{ all -> 0x03fb }
            double r6 = r6 + r14
            double r14 = (double) r12     // Catch:{ all -> 0x03fb }
            double r14 = java.lang.Math.pow(r14, r0)     // Catch:{ all -> 0x03fb }
            double r6 = r6 + r14
            double r6 = java.lang.Math.sqrt(r6)     // Catch:{ all -> 0x03fb }
            float r6 = (float) r6     // Catch:{ all -> 0x03fb }
            r11[r13] = r6     // Catch:{ all -> 0x03fb }
            int r13 = r13 + 1
            r12 = 0
            r1 = r18
            r0 = r19
            r7 = r17
            goto L_0x02d7
        L_0x0305:
            r0 = 0
        L_0x0306:
            java.lang.String[] r1 = defpackage.ahpf.a     // Catch:{ all -> 0x03fb }
            int r1 = r1.length     // Catch:{ all -> 0x03fb }
            if (r0 >= r1) goto L_0x0345
            if (r4 <= r0) goto L_0x0314
            int r1 = r4 - r0
            int r1 = r1 + -1
            r1 = r11[r1]     // Catch:{ all -> 0x03fb }
            goto L_0x0317
        L_0x0314:
            r1 = 990057071(0x3b03126f, float:0.002)
        L_0x0317:
            java.lang.String r6 = "accelGravityDir"
            a(r3, r6, r0, r1)     // Catch:{ all -> 0x03fb }
            int r0 = r0 + 1
            goto L_0x0306
        L_0x031f:
            r0 = 990057071(0x3b03126f, float:0.002)
            r3.f = r0     // Catch:{ all -> 0x03fb }
            r3.g = r0     // Catch:{ all -> 0x03fb }
            r3.h = r0     // Catch:{ all -> 0x03fb }
            goto L_0x0345
        L_0x0329:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = 0
            float r13 = r4.a(r7, r12)     // Catch:{ all -> 0x03fb }
            float r9 = r9 + r13
            r12 = 1
            float r13 = r4.a(r7, r12)     // Catch:{ all -> 0x03fb }
            float r10 = r10 + r13
            r13 = 2
            float r14 = r4.a(r7, r13)     // Catch:{ all -> 0x03fb }
            float r11 = r11 + r14
            int r7 = r7 + 1
            r1 = r18
            r0 = r19
            goto L_0x01d7
        L_0x0345:
            ahup r0 = defpackage.ahup.LIGHT     // Catch:{ all -> 0x03fb }
            r1 = r19
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x03fb }
            ahyq r0 = (defpackage.ahyq) r0     // Catch:{ all -> 0x03fb }
            if (r0 != 0) goto L_0x0355
            r7 = r18
            goto L_0x03d2
        L_0x0355:
            int r1 = r0.b     // Catch:{ all -> 0x03fb }
            if (r1 <= 0) goto L_0x03d0
            r4 = 0
            r6 = 0
        L_0x035b:
            if (r6 < r1) goto L_0x03c3
            r0 = 1148846080(0x447a0000, float:1000.0)
            r7 = r18
            float r6 = r7.h     // Catch:{ all -> 0x03f9 }
            float r1 = (float) r1     // Catch:{ all -> 0x03f9 }
            float r4 = r4 / r1
            float r6 = r6 * r4
            float r0 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x03f9 }
            r3.b = r0     // Catch:{ all -> 0x03f9 }
            if (r8 <= 0) goto L_0x0391
            ahpa r1 = r7.c     // Catch:{ all -> 0x03f9 }
            int r1 = r1.a()     // Catch:{ all -> 0x03f9 }
            if (r1 == 0) goto L_0x037e
            ahpa r1 = r7.c     // Catch:{ all -> 0x03f9 }
            float r1 = r1.c()     // Catch:{ all -> 0x03f9 }
            goto L_0x0380
        L_0x037e:
            float r1 = r3.b     // Catch:{ all -> 0x03f9 }
        L_0x0380:
            float r4 = r3.b     // Catch:{ all -> 0x03f9 }
            float r4 = r4 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            r6 = 0
        L_0x0387:
            if (r6 >= r8) goto L_0x0391
            ahpa r1 = r7.c     // Catch:{ all -> 0x03f9 }
            r1.a((float) r4)     // Catch:{ all -> 0x03f9 }
            int r6 = r6 + 1
            goto L_0x0387
        L_0x0391:
            if (r5 != 0) goto L_0x03a1
            ahpa r1 = r7.c     // Catch:{ all -> 0x03f9 }
            float r4 = r1.c()     // Catch:{ all -> 0x03f9 }
            float r0 = r0 + r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r9
            r1.b(r0)     // Catch:{ all -> 0x03f9 }
            goto L_0x03a6
        L_0x03a1:
            ahpa r1 = r7.c     // Catch:{ all -> 0x03f9 }
            r1.a((float) r0)     // Catch:{ all -> 0x03f9 }
        L_0x03a6:
            ahpa r0 = r7.c     // Catch:{ all -> 0x03f9 }
            float[] r0 = r0.b()     // Catch:{ all -> 0x03f9 }
            r1 = 0
        L_0x03ad:
            java.lang.String[] r4 = defpackage.ahpf.a     // Catch:{ all -> 0x03f9 }
            int r4 = r4.length     // Catch:{ all -> 0x03f9 }
            if (r1 >= r4) goto L_0x03d2
            int r4 = r1 + 1
            int r6 = r0.length     // Catch:{ all -> 0x03f9 }
            if (r6 < r4) goto L_0x03bb
            int r6 = r6 - r4
            r6 = r0[r6]     // Catch:{ all -> 0x03f9 }
            goto L_0x03bc
        L_0x03bb:
            r6 = 0
        L_0x03bc:
            java.lang.String r8 = "meanLightLevel"
            a(r3, r8, r1, r6)     // Catch:{ all -> 0x03f9 }
            r1 = r4
            goto L_0x03ad
        L_0x03c3:
            r9 = 1073741824(0x40000000, float:2.0)
            r7 = r18
            r10 = 0
            float r11 = r0.a(r6, r10)     // Catch:{ all -> 0x03f9 }
            float r4 = r4 + r11
            int r6 = r6 + 1
            goto L_0x035b
        L_0x03d0:
            r7 = r18
        L_0x03d2:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x03f9 }
            java.lang.String r0 = r0.getID()     // Catch:{ all -> 0x03f9 }
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ all -> 0x03f9 }
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)     // Catch:{ all -> 0x03f9 }
            long r8 = (long) r2     // Catch:{ all -> 0x03f9 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            r0.setTimeInMillis(r8)     // Catch:{ all -> 0x03f9 }
            r1 = 11
            int r0 = r0.get(r1)     // Catch:{ all -> 0x03f9 }
            float r0 = (float) r0     // Catch:{ all -> 0x03f9 }
            r3.K = r0     // Catch:{ all -> 0x03f9 }
            if (r5 == 0) goto L_0x03f7
            r7.f = r2     // Catch:{ all -> 0x03f9 }
        L_0x03f7:
            monitor-exit(r18)
            return r3
        L_0x03f9:
            r0 = move-exception
            goto L_0x0401
        L_0x03fb:
            r0 = move-exception
            r7 = r18
            goto L_0x0401
        L_0x03ff:
            r0 = move-exception
            r7 = r1
        L_0x0401:
            monitor-exit(r18)
            goto L_0x0404
        L_0x0403:
            throw r0
        L_0x0404:
            goto L_0x0403
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpg.a(java.util.Map, int):ahpf");
    }
}
