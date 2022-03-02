package defpackage;

import android.util.Base64OutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.DeflaterOutputStream;

/* renamed from: aicj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicj implements aicc {
    private static aicj a;
    private final File b;
    private final long c;
    private DataOutputStream d;
    private int e = 0;
    private final int[] f = new int[aico.values().length];
    private long g = -1;

    public aicj(File file, long j) {
        this.b = file;
        this.c = j;
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Log file directory is ");
        sb.append(valueOf);
        sb.toString();
        this.d = b(file, j);
        this.g = -1;
    }

    public static synchronized aicj a(File file, long j) {
        aicj aicj;
        synchronized (aicj.class) {
            if (a == null) {
                a = new aicj(file, j);
            }
            aicj = a;
        }
        return aicj;
    }

    private static synchronized DataOutputStream b(File file, long j) {
        DataOutputStream dataOutputStream;
        synchronized (aicj.class) {
            File file2 = new File(file, "0.clog");
            int i = 0;
            while (true) {
                if (i < 8) {
                    StringBuilder sb = new StringBuilder(16);
                    sb.append(i);
                    sb.append(".clog");
                    File file3 = new File(file, sb.toString());
                    if (file3.length() == 0) {
                        file2 = file3;
                        break;
                    }
                    if (file2.lastModified() > file3.lastModified()) {
                        file2 = file3;
                    }
                    i++;
                }
            }
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                dataOutputStream.writeInt(-500881805);
                dataOutputStream.writeInt(4);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeInt(aico.values().length);
                for (aico name : aico.values()) {
                    dataOutputStream.writeShort(name.name().hashCode());
                }
            } catch (IOException e2) {
                dataOutputStream = new DataOutputStream(anmr.a);
            }
            String valueOf = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb2.append("pickNextFile ");
            sb2.append(valueOf);
            sb2.toString();
        }
        return dataOutputStream;
    }

    protected static final void a(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeInt(-500881805);
        dataOutputStream.writeInt(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0230 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:10: B:99:0x022e->B:100:0x0230, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0255 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x028f A[Catch:{ Exception -> 0x0319, all -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a4 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:8: B:94:0x0212->B:129:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096 A[Catch:{ Exception -> 0x03ad, all -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097 A[Catch:{ Exception -> 0x03ad, all -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0225 A[Catch:{ Exception -> 0x0319, all -> 0x0314 }, LOOP:9: B:96:0x0223->B:97:0x0225, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.io.DataOutputStream r48, long r49, long r51, long r53, int r55, defpackage.aicf r56) {
        /*
            r47 = this;
            r1 = r47
            r2 = r48
            r3 = r56
            r4 = 2500(0x9c4, double:1.235E-320)
            long r4 = r49 + r4
            java.io.DataOutputStream r0 = r1.d     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r0.flush()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            long r8 = r51 + r53
            java.io.File r0 = r1.b     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            aicd r10 = new aicd     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r10.<init>()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.io.File[] r10 = r0.listFiles(r10)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r0 = 8
            r11.<init>(r0)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r12 = -500881805(0xffffffffe2252673, float:-7.616208E20)
            if (r10 == 0) goto L_0x00a0
            int r14 = r10.length     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r15 = 0
        L_0x002a:
            if (r15 >= r14) goto L_0x00a0
            r6 = r10[r15]     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0074 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0074 }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0074 }
            r13.<init>(r6)     // Catch:{ IOException -> 0x0074 }
            r7.<init>(r13)     // Catch:{ IOException -> 0x0074 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0074 }
            int r7 = r0.readInt()     // Catch:{ IOException -> 0x0074 }
            if (r7 != r12) goto L_0x0072
            int r7 = r0.readInt()     // Catch:{ IOException -> 0x0074 }
            r13 = 4
            if (r7 != r13) goto L_0x0072
            long r19 = r0.readLong()     // Catch:{ IOException -> 0x0074 }
            int r7 = r0.readInt()     // Catch:{ IOException -> 0x0074 }
            short[] r13 = new short[r7]     // Catch:{ IOException -> 0x0074 }
            r12 = 0
        L_0x0055:
            if (r12 < r7) goto L_0x0069
            long r22 = r0.readLong()     // Catch:{ IOException -> 0x0074 }
            aici r7 = new aici     // Catch:{ IOException -> 0x0074 }
            r16 = r7
            r17 = r6
            r18 = r0
            r21 = r13
            r16.<init>(r17, r18, r19, r21, r22)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0094
        L_0x0069:
            short r16 = r0.readShort()     // Catch:{ IOException -> 0x0074 }
            r13[r12] = r16     // Catch:{ IOException -> 0x0074 }
            int r12 = r12 + 1
            goto L_0x0055
        L_0x0072:
            r7 = 0
            goto L_0x0094
        L_0x0074:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            int r6 = r6 + 21
            r7.<init>(r6)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.lang.String r6 = "Failed to read file: "
            r7.append(r6)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r7.append(r0)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r7.toString()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r7 = 0
        L_0x0094:
            if (r7 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r11.add(r7)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
        L_0x009a:
            int r15 = r15 + 1
            r12 = -500881805(0xffffffffe2252673, float:-7.616208E20)
            goto L_0x002a
        L_0x00a0:
            java.util.Collections.sort(r11)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r6 = 1
            r0 = 1
        L_0x00a5:
            int r7 = r11.size()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            if (r0 >= r7) goto L_0x00bc
            java.lang.Object r7 = r11.get(r0)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            aici r7 = (defpackage.aici) r7     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            long r12 = r7.a()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x00bc
            int r0 = r0 + 1
            goto L_0x00a5
        L_0x00bc:
            java.util.Iterator r7 = r11.iterator()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r8 = 0
        L_0x00c1:
            r9 = -1
            int r10 = r0 + -1
            if (r8 >= r10) goto L_0x00da
            java.lang.Object r9 = r7.next()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            aici r9 = (defpackage.aici) r9     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            java.io.DataInputStream r9 = r9.b     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            defpackage.ajre.a((java.io.Closeable) r9)     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            r7.remove()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            int r8 = r8 + 1
            r7.hasNext()     // Catch:{ Exception -> 0x03ad, all -> 0x0390 }
            goto L_0x00c1
        L_0x00da:
            r7 = 8192(0x2000, float:1.14794E-41)
            int[] r8 = new int[r7]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int[] r10 = new int[r7]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r12 = 2
            int[] r0 = new int[r12]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r0[r6] = r7     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r13 = 3
            r14 = 0
            r0[r14] = r13     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.Class<int> r14 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r14, r0)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r14 = r0
            int[][] r14 = (int[][]) r14     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.String[] r15 = new java.lang.String[r7]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            aico[] r0 = defpackage.aico.values()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r0 = r0.length     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int[] r13 = new int[r0]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int[] r9 = new int[r7]     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r12 = -500881805(0xffffffffe2252673, float:-7.616208E20)
            r2.writeInt(r12)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r12 = 4
            r2.writeInt(r12)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            aico[] r0 = defpackage.aico.values()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r0 = r0.length     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r2.writeInt(r0)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            aico[] r0 = defpackage.aico.values()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r12 = r0.length     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r6 = 0
        L_0x0115:
            if (r6 < r12) goto L_0x035b
            int[] r0 = r1.f     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r6 = r0.length     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r12 = 0
        L_0x011b:
            if (r12 < r6) goto L_0x033a
            int r0 = r11.size()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r2.writeInt(r0)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r20 = 0
            r22 = -1
            r26 = r22
            r28 = r26
            r6 = 0
        L_0x012d:
            int r0 = r11.size()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            if (r6 >= r0) goto L_0x02e1
            java.lang.Object r0 = r11.get(r6)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            aici r0 = (defpackage.aici) r0     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r12 = (r49 > r4 ? 1 : (r49 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x02bf
            r12 = r55
            r25 = r8
            long r7 = (long) r12     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r30 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r30 >= 0) goto L_0x02bc
            java.io.File r1 = r0.a     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.String r28 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            int r28 = r28.length()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r30 = r4
            int r4 = r28 + 13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.String r4 = "Dump file "
            r5.append(r4)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r5.append(r1)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.lang.String r1 = "..."
            r5.append(r1)     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r5.toString()     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            java.io.DataInputStream r1 = r0.b     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            long r4 = r0.c     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            short[] r12 = r0.d     // Catch:{ Exception -> 0x038c, all -> 0x0388 }
            r32 = r11
            r28 = r12
            long r11 = r0.e     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r33 = r11
            r35 = r26
            r3 = 0
            r26 = r20
            r11 = 0
            r12 = 0
            r20 = r33
        L_0x0184:
            r37 = r9
            r9 = 8192(0x2000, float:1.14794E-41)
            if (r11 < r9) goto L_0x018f
            r42 = r4
            r4 = 2
            goto L_0x0205
        L_0x018f:
            int r24 = (r26 > r7 ? 1 : (r26 == r7 ? 0 : -1))
            if (r24 >= 0) goto L_0x0202
            byte r9 = r1.readByte()     // Catch:{ EOFException -> 0x01fd }
            if (r9 < 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            int r9 = r9 + 256
        L_0x019c:
            r38 = r7
            int r7 = r1.readInt()     // Catch:{ EOFException -> 0x01fd }
            int r8 = r1.readInt()     // Catch:{ EOFException -> 0x01fd }
            int r29 = r1.readInt()     // Catch:{ EOFException -> 0x01fd }
            int r40 = r1.readInt()     // Catch:{ EOFException -> 0x01fd }
            java.lang.String r41 = r1.readUTF()     // Catch:{ EOFException -> 0x01fd }
            r42 = r4
            long r4 = (long) r7
            long r20 = r20 + r4
            if (r6 == 0) goto L_0x01ba
            goto L_0x01ce
        L_0x01ba:
            long r4 = r0.c     // Catch:{ EOFException -> 0x01fb }
            int r44 = (r4 > r51 ? 1 : (r4 == r51 ? 0 : -1))
            if (r44 == 0) goto L_0x01c1
        L_0x01c0:
            goto L_0x01ce
        L_0x01c1:
            int r4 = (r20 > r53 ? 1 : (r20 == r53 ? 0 : -1))
            if (r4 >= 0) goto L_0x01c7
            r4 = 2
            goto L_0x01eb
        L_0x01c7:
            if (r12 == 0) goto L_0x01ca
            goto L_0x01c0
        L_0x01ca:
            r33 = r20
            r7 = 0
            r12 = 1
        L_0x01ce:
            r25[r3] = r9     // Catch:{ EOFException -> 0x01f6 }
            r10[r3] = r7     // Catch:{ EOFException -> 0x01f6 }
            r4 = 0
            r5 = r14[r4]     // Catch:{ EOFException -> 0x01f6 }
            r5[r3] = r8     // Catch:{ EOFException -> 0x01f6 }
            r4 = 1
            r5 = r14[r4]     // Catch:{ EOFException -> 0x01f6 }
            r5[r3] = r29     // Catch:{ EOFException -> 0x01f6 }
            r4 = 2
            r5 = r14[r4]     // Catch:{ EOFException -> 0x01f4 }
            r5[r3] = r40     // Catch:{ EOFException -> 0x01f4 }
            r15[r3] = r41     // Catch:{ EOFException -> 0x01f4 }
            int r3 = r3 + 1
            r7 = 1
            long r26 = r26 + r7
            r35 = r20
        L_0x01eb:
            int r11 = r11 + 1
            r9 = r37
            r7 = r38
            r4 = r42
            goto L_0x0184
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f8
        L_0x01f6:
            r0 = move-exception
            r4 = 2
        L_0x01f8:
            r11 = r33
            goto L_0x0209
        L_0x01fb:
            r0 = move-exception
            goto L_0x0200
        L_0x01fd:
            r0 = move-exception
            r42 = r4
        L_0x0200:
            r4 = 2
            goto L_0x0205
        L_0x0202:
            r42 = r4
            r4 = 2
        L_0x0205:
            r11 = r33
            r20 = r35
        L_0x0209:
            defpackage.ajre.a((java.io.Closeable) r1)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r1 = -1
            java.util.Arrays.fill(r13, r1)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r0 = r3 + -1
        L_0x0212:
            if (r0 >= 0) goto L_0x02a4
            a((java.io.DataOutputStream) r2, (int) r3)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r7 = r42
            r2.writeLong(r7)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r1 = r28
            int r0 = r1.length     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r2.writeInt(r0)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r5 = 0
        L_0x0223:
            if (r5 >= r0) goto L_0x022d
            short r9 = r1[r5]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r2.writeShort(r9)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r5 = r5 + 1
            goto L_0x0223
        L_0x022d:
            r0 = 0
        L_0x022e:
            if (r0 >= r3) goto L_0x0239
            r1 = r25[r0]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r2.writeByte(r1)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r0 = r0 + 1
            goto L_0x022e
        L_0x0239:
            r2.writeLong(r11)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r0 = 0
        L_0x023d:
            r1 = 4
            if (r0 < r1) goto L_0x028f
            r0 = 0
        L_0x0241:
            aico[] r1 = defpackage.aico.values()     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r1 = r1.length     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            if (r0 < r1) goto L_0x0255
            r28 = r7
            r4 = -1
            r5 = 3
            r9 = 4
            r45 = r20
            r20 = r26
            r26 = r45
            goto L_0x02cf
        L_0x0255:
            r1 = 0
        L_0x0256:
            r5 = 3
            if (r1 < r5) goto L_0x0269
            r1 = r13[r0]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
        L_0x025b:
            r3 = -1
            if (r1 == r3) goto L_0x0266
            r3 = r15[r1]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r2.writeUTF(r3)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r1 = r37[r1]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            goto L_0x025b
        L_0x0266:
            int r0 = r0 + 1
            goto L_0x0241
        L_0x0269:
            r3 = 0
        L_0x026a:
            r9 = 4
            if (r3 < r9) goto L_0x0270
            int r1 = r1 + 1
            goto L_0x0256
        L_0x0270:
            r11 = r13[r0]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r12 = 0
        L_0x0273:
            r4 = -1
            if (r11 == r4) goto L_0x028b
            r16 = r14[r1]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r16 = r16[r11]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r16 = r16 - r12
            int r12 = r3 * 8
            int r12 = r16 >>> r12
            r2.writeByte(r12)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r12 = r14[r1]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r12 = r12[r11]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r11 = r37[r11]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r4 = 2
            goto L_0x0273
        L_0x028b:
            int r3 = r3 + 1
            r4 = 2
            goto L_0x026a
        L_0x028f:
            r4 = -1
            r5 = 3
            r9 = 4
            r1 = 0
        L_0x0293:
            if (r1 >= r3) goto L_0x02a0
            r11 = r10[r1]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r12 = r0 * 8
            int r11 = r11 >>> r12
            r2.writeByte(r11)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02a0:
            int r0 = r0 + 1
            r4 = 2
            goto L_0x023d
        L_0x02a4:
            r1 = r28
            r7 = r42
            r4 = -1
            r5 = 3
            r9 = 4
            r16 = r25[r0]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r17 = r13[r16]     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r37[r0] = r17     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r13[r16] = r0     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r0 = r0 + -1
            r28 = r1
            r42 = r7
            r4 = 2
            goto L_0x0212
        L_0x02bc:
            r30 = r4
            goto L_0x02c3
        L_0x02bf:
            r30 = r4
            r25 = r8
        L_0x02c3:
            r37 = r9
            r32 = r11
            r4 = -1
            r5 = 3
            r9 = 4
            r1 = 0
            a((java.io.DataOutputStream) r2, (int) r1)     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
        L_0x02cf:
            int r6 = r6 + 1
            r1 = r47
            r3 = r56
            r8 = r25
            r4 = r30
            r11 = r32
            r9 = r37
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x012d
        L_0x02e1:
            r32 = r11
            r0 = r26
            int r3 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x02ec
            r1 = r32
            goto L_0x0320
        L_0x02ec:
            r3 = r28
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 == 0) goto L_0x031e
            r7 = r56
            r7.a = r3     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            r7.b = r0     // Catch:{ Exception -> 0x0319, all -> 0x0314 }
            int r0 = r32.size()
            r7 = 0
        L_0x02fd:
            if (r7 >= r0) goto L_0x030f
            r1 = r32
            java.lang.Object r3 = r1.get(r7)
            aici r3 = (defpackage.aici) r3
            java.io.DataInputStream r3 = r3.b
            defpackage.ajre.a((java.io.Closeable) r3)
            int r7 = r7 + 1
            goto L_0x02fd
        L_0x030f:
            defpackage.ajre.a((java.io.Closeable) r48)
            r3 = 1
            return r3
        L_0x0314:
            r0 = move-exception
            r1 = r32
            goto L_0x038a
        L_0x0319:
            r0 = move-exception
            r1 = r32
            goto L_0x038e
        L_0x031e:
            r1 = r32
        L_0x0320:
            int r0 = r1.size()
            r3 = 0
        L_0x0325:
            if (r3 >= r0) goto L_0x0335
            java.lang.Object r4 = r1.get(r3)
            aici r4 = (defpackage.aici) r4
            java.io.DataInputStream r4 = r4.b
            defpackage.ajre.a((java.io.Closeable) r4)
            int r3 = r3 + 1
            goto L_0x0325
        L_0x0335:
            defpackage.ajre.a((java.io.Closeable) r48)
            r1 = 0
            return r1
        L_0x033a:
            r7 = r3
            r30 = r4
            r25 = r8
            r37 = r9
            r1 = r11
            r3 = 1
            r4 = -1
            r5 = 3
            r9 = 4
            r8 = r0[r12]     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            r2.writeInt(r8)     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            int r12 = r12 + 1
            r11 = r1
            r3 = r7
            r8 = r25
            r4 = r30
            r9 = r37
            r7 = 8192(0x2000, float:1.14794E-41)
            r1 = r47
            goto L_0x011b
        L_0x035b:
            r7 = r3
            r30 = r4
            r25 = r8
            r37 = r9
            r1 = r11
            r3 = 1
            r4 = -1
            r5 = 3
            r9 = 4
            r8 = r0[r6]     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            java.lang.String r8 = r8.name()     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            int r8 = r8.hashCode()     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            r2.writeShort(r8)     // Catch:{ Exception -> 0x0386, all -> 0x0384 }
            int r6 = r6 + 1
            r11 = r1
            r3 = r7
            r8 = r25
            r4 = r30
            r9 = r37
            r7 = 8192(0x2000, float:1.14794E-41)
            r1 = r47
            goto L_0x0115
        L_0x0384:
            r0 = move-exception
            goto L_0x038a
        L_0x0386:
            r0 = move-exception
            goto L_0x038e
        L_0x0388:
            r0 = move-exception
            r1 = r11
        L_0x038a:
            r6 = r1
            goto L_0x0392
        L_0x038c:
            r0 = move-exception
            r1 = r11
        L_0x038e:
            r6 = r1
            goto L_0x03af
        L_0x0390:
            r0 = move-exception
            r6 = 0
        L_0x0392:
            if (r6 == 0) goto L_0x03a9
            int r1 = r6.size()
            r7 = 0
        L_0x0399:
            if (r7 >= r1) goto L_0x03a9
            java.lang.Object r3 = r6.get(r7)
            aici r3 = (defpackage.aici) r3
            java.io.DataInputStream r3 = r3.b
            defpackage.ajre.a((java.io.Closeable) r3)
            int r7 = r7 + 1
            goto L_0x0399
        L_0x03a9:
            defpackage.ajre.a((java.io.Closeable) r48)
            throw r0
        L_0x03ad:
            r0 = move-exception
            r6 = 0
        L_0x03af:
            if (r6 == 0) goto L_0x03c6
            int r0 = r6.size()
            r14 = 0
        L_0x03b6:
            if (r14 >= r0) goto L_0x0335
            java.lang.Object r1 = r6.get(r14)
            aici r1 = (defpackage.aici) r1
            java.io.DataInputStream r1 = r1.b
            defpackage.ajre.a((java.io.Closeable) r1)
            int r14 = r14 + 1
            goto L_0x03b6
        L_0x03c6:
            goto L_0x0335
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicj.a(java.io.DataOutputStream, long, long, long, int, aicf):boolean");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:7:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[SYNTHETIC, Splitter:B:28:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.aicg a(java.io.File r16, long r17, long r19, int r21, long r22) {
        /*
            r15 = this;
            monitor-enter(r15)
            aicf r0 = new aicf     // Catch:{ all -> 0x004f }
            r0.<init>()     // Catch:{ all -> 0x004f }
            r11 = 0
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0041 }
            r13 = r16
            r12.<init>(r13)     // Catch:{ IOException -> 0x003d }
            java.io.DataOutputStream r14 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r1.<init>(r12)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r14.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r1 = r15
            r2 = r14
            r3 = r22
            r5 = r17
            r7 = r19
            r9 = r21
            r10 = r0
            boolean r1 = r1.a((java.io.DataOutputStream) r2, (long) r3, (long) r5, (long) r7, (int) r9, (defpackage.aicf) r10)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r14.flush()     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            defpackage.ajre.a((java.io.Closeable) r12)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0047
            aicg r1 = new aicg     // Catch:{ all -> 0x004f }
            long r2 = r0.a     // Catch:{ all -> 0x004f }
            long r4 = r0.b     // Catch:{ all -> 0x004f }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x004f }
            monitor-exit(r15)
            return r1
        L_0x003a:
            r0 = move-exception
            r11 = r12
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            goto L_0x0044
        L_0x003f:
            r0 = move-exception
            goto L_0x0049
        L_0x0041:
            r0 = move-exception
            r13 = r16
        L_0x0044:
            r16.delete()     // Catch:{ all -> 0x003f }
        L_0x0047:
            monitor-exit(r15)
            return r11
        L_0x0049:
            if (r11 == 0) goto L_0x004e
            defpackage.ajre.a((java.io.Closeable) r11)     // Catch:{ all -> 0x004f }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicj.a(java.io.File, long, long, int, long):aicg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aico r6, long r7, int r9, int r10, int r11, java.lang.Object r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            int[] r0 = r5.f     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            int r1 = r6.ordinal()     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r2 = r0[r1]     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            int r2 = r2 + 1
            r0[r1] = r2     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            long r0 = r5.g     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0016
            goto L_0x001d
        L_0x0016:
            java.io.DataOutputStream r0 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r0.writeLong(r7)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r5.g = r7     // Catch:{ IOException -> 0x0080, all -> 0x007d }
        L_0x001d:
            java.io.DataOutputStream r0 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            int r6 = r6.ordinal()     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r0.writeByte(r6)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.DataOutputStream r6 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            long r0 = r5.g     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            long r0 = r7 - r0
            int r1 = (int) r0     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r6.writeInt(r1)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r5.g = r7     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.DataOutputStream r6 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r6.writeInt(r9)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.DataOutputStream r6 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r6.writeInt(r10)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.DataOutputStream r6 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r6.writeInt(r11)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            if (r12 == 0) goto L_0x0048
            java.lang.String r6 = r12.toString()     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            goto L_0x004a
        L_0x0048:
            java.lang.String r6 = ""
        L_0x004a:
            int r7 = r6.length()     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r8 = 0
            r9 = 64
            if (r7 > r9) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            java.lang.String r6 = r6.substring(r8, r9)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
        L_0x0059:
            java.io.DataOutputStream r7 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r7.writeUTF(r6)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            int r6 = r5.e     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            int r6 = r6 + 1
            r5.e = r6     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r6 != r7) goto L_0x007b
            java.io.DataOutputStream r6 = r5.d     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r6.close()     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.File r6 = r5.b     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            long r9 = r5.c     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            java.io.DataOutputStream r6 = b(r6, r9)     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r5.d = r6     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r5.g = r2     // Catch:{ IOException -> 0x0080, all -> 0x007d }
            r5.e = r8     // Catch:{ IOException -> 0x0080, all -> 0x007d }
        L_0x007b:
            monitor-exit(r5)
            return
        L_0x007d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0080:
            r6 = move-exception
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicj.a(aico, long, int, int, int, java.lang.Object):void");
    }

    public final synchronized void a(PrintWriter printWriter, long j) {
        printWriter.println("#### com.google.android.location.utils.logging.CompactLogger Start ####");
        a(new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new BufferedOutputStream(new Base64OutputStream(new aice(new BufferedWriter(new aich(new BufferedWriter(printWriter)))), 18))))), j, 0, 0, Integer.MAX_VALUE, new aicf());
        printWriter.println();
        printWriter.println("#### com.google.android.location.utils.logging.CompactLogger End ####");
    }
}
