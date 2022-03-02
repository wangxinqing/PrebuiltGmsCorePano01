package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: lyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyw {
    static Class d = null;
    final lzc a;
    final Context b;
    Object c;

    public lyw(lzc lzc, Context context) {
        this.a = lzc;
        this.b = context;
    }

    private static synchronized Class a(lyw lyw, String str) {
        Class cls;
        lyw lyw2 = lyw;
        synchronized (lyw.class) {
            if (d == null) {
                int[] iArr = {225, 207, 192, 207, 154, 190, 195, 192, 182, 193, 191, 203, 154, 192, 102, 192, 202, 154, 190, 218, 195, 192, 216, 206, 182, 193, 191, 196, 208, 196, 206, 219, 190, 222, 181, 183, 149, 188};
                int[] iArr2 = {205, 208, 221, 197, 68, 127, 202, 102, 121, 212, 206, 214, 214, 137, 203, 221, 121, 214, 102, 71, 207, 228, 219, 214, 222, 45, 121, 127, 115, 215, 71, 228, 191, 205, 212, 192, 192, 195, 149, 182};
                int[] iArr3 = {197, 200, 68, 127};
                int[] iArr4 = {203, 188, 190, 38, 210, 181, 205, 224, 227, 202, 182, 190, 190, 226, 182, 202, 214, 117, 183, 200, 200, 181, 207, 188, 188, 226, 213, 188, 181, 191, 133, 193, 196, 223, 215, 183, 181, 192, 217, 154, 190, 214, 195, 192, 200, 210, 182, 210, 202, 193, 191, 202, 226, 154, 227, 192, 208, 226, 203, 221, 181, 192, 217, 154, 190, 218, 206, 210, 195, 228, 218, 200, 192, 209, 201, 182, 202, 214, 193, 191, 196, 220, 219, 196, 190, 181, 20, 154, 190, 195, 206, 223, 192, 217, 225, 219, 204, 182, 207, 193, 191, 196, 196, 209, 190};
                File dir = lyw2.b.getDir(lyw2.a.a(new int[]{213, 227, 37, 133}), 0);
                String absolutePath = dir.getAbsolutePath();
                String valueOf = String.valueOf(dir.getAbsolutePath());
                String valueOf2 = String.valueOf(lyw2.a.a(new int[]{222, 219, 200, 102, 216, 200, 37, 181, 191, 206, 229, 145, 214, 201, 217, 165}));
                String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                String a2 = lyw2.a.a(iArr3);
                String a3 = lyw2.a.a(iArr2);
                String a4 = lyw2.a.a(iArr);
                try {
                    byte[] bArr = new byte[16];
                    byte[] bytes = str.getBytes();
                    int i = 0;
                    while (true) {
                        if (i < 16) {
                            if (i >= bytes.length) {
                                break;
                            }
                            bArr[i] = bytes[i];
                            i++;
                        } else {
                            break;
                        }
                    }
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, a2);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{1, 33, 13, 28, 87, 122, 25, 5, 4, 30, 22, 101, 5, 50, 12, 0});
                    AssetFileDescriptor openFd = lyw2.b.getAssets().openFd(a4);
                    openFd.close();
                    byte[] bArr2 = new byte[((int) openFd.getLength())];
                    InputStream open = lyw2.b.getAssets().open(a4);
                    open.read(bArr2);
                    open.close();
                    Cipher f = jhg.f(a3);
                    if (f != null) {
                        f.init(2, secretKeySpec, ivParameterSpec);
                        byte[] doFinal = f.doFinal(bArr2);
                        FileOutputStream fileOutputStream = new FileOutputStream(str2);
                        fileOutputStream.write(doFinal);
                        fileOutputStream.close();
                    }
                } catch (Exception e) {
                }
                Class loadClass = new DexClassLoader(str2, absolutePath, "", lyw.getClass().getClassLoader()).loadClass(lyw2.a.a(iArr4));
                jjc.a(dir);
                d = loadClass;
            }
            cls = d;
        }
        return cls;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lyv a(java.lang.String r29, byte[] r30) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            lyv r2 = new lyv
            r2.<init>()
            java.lang.Class r3 = a((defpackage.lyw) r28, (java.lang.String) r29)     // Catch:{ Exception -> 0x01f4 }
            r4 = 12
            float[] r5 = new float[r4]     // Catch:{ Exception -> 0x01f4 }
            r6 = 1052100194(0x3eb5c662, float:0.35502917)
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1056023972(0x3ef1a5a4, float:0.47196686)
            r8 = 1
            r5[r8] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1048367700(0x3e7cd254, float:0.24689609)
            r9 = 2
            r5[r9] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1059791573(0x3f2b22d5, float:0.66850024)
            r10 = 3
            r5[r10] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1061572066(0x3f464de2, float:0.7746259)
            r11 = 4
            r5[r11] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1058587713(0x3f18c441, float:0.5967446)
            r12 = 5
            r5[r12] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1031826776(0x3d806d58, float:0.06270856)
            r13 = 6
            r5[r13] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1044684492(0x3e449ecc, float:0.19201201)
            r14 = 7
            r5[r14] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1051961794(0x3eb3a9c2, float:0.35090452)
            r15 = 8
            r5[r15] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1057926879(0x3f0eaedf, float:0.5573558)
            r16 = 9
            r5[r16] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1055966666(0x3ef0c5ca, float:0.470259)
            r17 = 10
            r5[r17] = r6     // Catch:{ Exception -> 0x01f4 }
            r6 = 1065128973(0x3f7c940d, float:0.9866341)
            r18 = 11
            r5[r18] = r6     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x0087
            int r6 = r0.length     // Catch:{ Exception -> 0x01f4 }
            r15 = 48
            if (r6 < r15) goto L_0x0087
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r30)     // Catch:{ Exception -> 0x01f4 }
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x01f4 }
            java.nio.ByteBuffer r0 = r0.order(r6)     // Catch:{ Exception -> 0x01f4 }
            r6 = 0
        L_0x006f:
            if (r6 >= r4) goto L_0x0087
            int r15 = r0.getInt()     // Catch:{ Exception -> 0x01f4 }
            int r15 = java.lang.Math.abs(r15)     // Catch:{ Exception -> 0x01f4 }
            if (r15 < 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r15 = 0
        L_0x007d:
            float r15 = (float) r15     // Catch:{ Exception -> 0x01f4 }
            r19 = 1325400064(0x4f000000, float:2.14748365E9)
            float r15 = r15 / r19
            r5[r6] = r15     // Catch:{ Exception -> 0x01f4 }
            int r6 = r6 + 1
            goto L_0x006f
        L_0x0087:
            r0 = 13
            int[] r6 = new int[r0]     // Catch:{ Exception -> 0x01f4 }
            r15 = 229(0xe5, float:3.21E-43)
            r6[r7] = r15     // Catch:{ Exception -> 0x01f4 }
            r15 = 182(0xb6, float:2.55E-43)
            r6[r8] = r15     // Catch:{ Exception -> 0x01f4 }
            r19 = 214(0xd6, float:3.0E-43)
            r6[r9] = r19     // Catch:{ Exception -> 0x01f4 }
            r20 = 206(0xce, float:2.89E-43)
            r6[r10] = r20     // Catch:{ Exception -> 0x01f4 }
            r21 = 183(0xb7, float:2.56E-43)
            r6[r11] = r21     // Catch:{ Exception -> 0x01f4 }
            r22 = 186(0xba, float:2.6E-43)
            r6[r12] = r22     // Catch:{ Exception -> 0x01f4 }
            r6[r13] = r11     // Catch:{ Exception -> 0x01f4 }
            r23 = 191(0xbf, float:2.68E-43)
            r6[r14] = r23     // Catch:{ Exception -> 0x01f4 }
            r24 = 196(0xc4, float:2.75E-43)
            r25 = 8
            r6[r25] = r24     // Catch:{ Exception -> 0x01f4 }
            r25 = 211(0xd3, float:2.96E-43)
            r6[r16] = r25     // Catch:{ Exception -> 0x01f4 }
            r25 = 208(0xd0, float:2.91E-43)
            r6[r17] = r25     // Catch:{ Exception -> 0x01f4 }
            r25 = 171(0xab, float:2.4E-43)
            r6[r18] = r25     // Catch:{ Exception -> 0x01f4 }
            r25 = 53
            r6[r4] = r25     // Catch:{ Exception -> 0x01f4 }
            int[] r0 = new int[r13]     // Catch:{ Exception -> 0x01f4 }
            r0[r7] = r15     // Catch:{ Exception -> 0x01f4 }
            r0[r8] = r21     // Catch:{ Exception -> 0x01f4 }
            r0[r9] = r22     // Catch:{ Exception -> 0x01f4 }
            r25 = 144(0x90, float:2.02E-43)
            r0[r10] = r25     // Catch:{ Exception -> 0x01f4 }
            r25 = 145(0x91, float:2.03E-43)
            r0[r11] = r25     // Catch:{ Exception -> 0x01f4 }
            r25 = 193(0xc1, float:2.7E-43)
            r0[r12] = r25     // Catch:{ Exception -> 0x01f4 }
            r4 = 22
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x01f4 }
            r26 = 222(0xde, float:3.11E-43)
            r4[r7] = r26     // Catch:{ Exception -> 0x01f4 }
            r4[r8] = r15     // Catch:{ Exception -> 0x01f4 }
            r15 = 219(0xdb, float:3.07E-43)
            r4[r9] = r15     // Catch:{ Exception -> 0x01f4 }
            r15 = 224(0xe0, float:3.14E-43)
            r4[r10] = r15     // Catch:{ Exception -> 0x01f4 }
            r4[r11] = r19     // Catch:{ Exception -> 0x01f4 }
            r15 = 207(0xcf, float:2.9E-43)
            r4[r12] = r15     // Catch:{ Exception -> 0x01f4 }
            r15 = 210(0xd2, float:2.94E-43)
            r4[r13] = r15     // Catch:{ Exception -> 0x01f4 }
            r4[r14] = r21     // Catch:{ Exception -> 0x01f4 }
            r26 = 202(0xca, float:2.83E-43)
            r27 = 8
            r4[r27] = r26     // Catch:{ Exception -> 0x01f4 }
            r26 = 200(0xc8, float:2.8E-43)
            r4[r16] = r26     // Catch:{ Exception -> 0x01f4 }
            r4[r17] = r15     // Catch:{ Exception -> 0x01f4 }
            r4[r18] = r22     // Catch:{ Exception -> 0x01f4 }
            r22 = 225(0xe1, float:3.15E-43)
            r25 = 12
            r4[r25] = r22     // Catch:{ Exception -> 0x01f4 }
            r22 = 13
            r4[r22] = r11     // Catch:{ Exception -> 0x01f4 }
            r22 = 14
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 15
            r23 = 205(0xcd, float:2.87E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 16
            r4[r22] = r24     // Catch:{ Exception -> 0x01f4 }
            r22 = 17
            r23 = 204(0xcc, float:2.86E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 18
            r23 = 216(0xd8, float:3.03E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 19
            r23 = 171(0xab, float:2.4E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 20
            r23 = 212(0xd4, float:2.97E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r22 = 21
            r23 = 199(0xc7, float:2.79E-43)
            r4[r22] = r23     // Catch:{ Exception -> 0x01f4 }
            r15 = 16
            int[] r15 = new int[r15]     // Catch:{ Exception -> 0x01f4 }
            r23 = 154(0x9a, float:2.16E-43)
            r15[r7] = r23     // Catch:{ Exception -> 0x01f4 }
            r15[r8] = r19     // Catch:{ Exception -> 0x01f4 }
            r15[r9] = r19     // Catch:{ Exception -> 0x01f4 }
            r15[r10] = r21     // Catch:{ Exception -> 0x01f4 }
            r9 = 209(0xd1, float:2.93E-43)
            r15[r11] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 149(0x95, float:2.09E-43)
            r15[r12] = r9     // Catch:{ Exception -> 0x01f4 }
            r15[r13] = r20     // Catch:{ Exception -> 0x01f4 }
            r9 = 226(0xe2, float:3.17E-43)
            r15[r14] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 211(0xd3, float:2.96E-43)
            r10 = 8
            r15[r10] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 216(0xd8, float:3.03E-43)
            r15[r16] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 192(0xc0, float:2.69E-43)
            r15[r17] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 208(0xd0, float:2.91E-43)
            r15[r18] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 210(0xd2, float:2.94E-43)
            r10 = 12
            r15[r10] = r9     // Catch:{ Exception -> 0x01f4 }
            r9 = 13
            r15[r9] = r21     // Catch:{ Exception -> 0x01f4 }
            r9 = 14
            r10 = 209(0xd1, float:2.93E-43)
            r15[r9] = r10     // Catch:{ Exception -> 0x01f4 }
            r9 = 15
            r10 = 154(0x9a, float:2.16E-43)
            r15[r9] = r10     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.reflect.Constructor r9 = r3.getDeclaredConstructor(r9)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r9 = r9.newInstance(r10)     // Catch:{ Exception -> 0x01f4 }
            r1.c = r9     // Catch:{ Exception -> 0x01f4 }
            lzc r9 = r1.a     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = r9.a(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r9)     // Catch:{ Exception -> 0x01f4 }
            lzc r9 = r1.a     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r9 = r9.a(r15)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class<float[]> r11 = float[].class
            r10[r7] = r11     // Catch:{ Exception -> 0x01f4 }
            java.lang.reflect.Method r9 = r3.getMethod(r9, r10)     // Catch:{ Exception -> 0x01f4 }
            lzc r10 = r1.a     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r6 = r10.a(r6)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.reflect.Method r6 = r3.getMethod(r6, r10)     // Catch:{ Exception -> 0x01f4 }
            lzc r10 = r1.a     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r4 = r10.a(r4)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r10)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Class<lyw> r4 = defpackage.lyw.class
            monitor-enter(r4)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r10 = r1.c     // Catch:{ all -> 0x01f1 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x01f1 }
            r8[r7] = r5     // Catch:{ all -> 0x01f1 }
            r9.invoke(r10, r8)     // Catch:{ all -> 0x01f1 }
            monitor-exit(r4)     // Catch:{ all -> 0x01f1 }
            java.lang.Object r4 = r1.c     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r0.invoke(r4, r5)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01f4 }
            r2.a = r0     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r1.c     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r6.invoke(r0, r4)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r2.b = r0     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r1.c     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r3.invoke(r0, r4)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r2.c = r0     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01f5
        L_0x01f1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01f1 }
            throw r0     // Catch:{ Exception -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
        L_0x01f5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyw.a(java.lang.String, byte[]):lyv");
    }
}
