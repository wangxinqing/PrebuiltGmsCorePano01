package defpackage;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bcx {
    private static int a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf));
        }
    }

    private static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return a(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void a(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        long j4 = j;
        if (!map.isEmpty()) {
            bcs bcs = new bcs(fileChannel, 0, j);
            bcs bcs2 = new bcs(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            bcy.a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            bcq bcq = new bcq(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] a = a(iArr, new bcr[]{bcs, bcs2, bcq});
                while (i < size) {
                    int i3 = iArr[i];
                    Map map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), a[i])) {
                        i++;
                    } else {
                        throw new SecurityException(b(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    private static X509Certificate[] a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair pair;
        ByteBuffer a = a(byteBuffer);
        ByteBuffer a2 = a(byteBuffer);
        byte[] b = b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (a2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer a3 = a(a2);
                if (a3.remaining() >= 8) {
                    int i3 = a3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (!(i3 == 513 || i3 == 514 || i3 == 769)) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i != -1) {
                        int a4 = a(i3);
                        int a5 = a(i);
                        if (a4 != 1) {
                            if (a5 != 1) {
                            }
                        }
                    }
                    bArr2 = b(a3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i != -1) {
            if (i == 513 || i == 514) {
                str = "EC";
            } else if (i != 769) {
                switch (i) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        String valueOf = String.valueOf(Long.toHexString((long) i));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf));
                }
            } else {
                str = "DSA";
            }
            if (i == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString((long) i));
                        throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf2));
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str2 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(b));
                Signature instance = Signature.getInstance(str2);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(a);
                if (instance.verify(bArr2)) {
                    a.clear();
                    ByteBuffer a6 = a(a);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (a6.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer a7 = a(a6);
                            if (a7.remaining() >= 8) {
                                int i5 = a7.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = b(a7);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Failed to parse digest record #");
                            sb2.append(i4);
                            throw new IOException(sb2.toString(), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int a8 = a(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(a8), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer a9 = a(a);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (a9.hasRemaining()) {
                                i6++;
                                byte[] b2 = b(a9);
                                try {
                                    arrayList3.add(new bcv((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b2)), b2));
                                } catch (CertificateException e3) {
                                    StringBuilder sb3 = new StringBuilder(41);
                                    sb3.append("Failed to decode certificate #");
                                    sb3.append(i6);
                                    throw new SecurityException(sb3.toString(), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(b, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(b(a8).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb4.append("Failed to verify ");
                sb4.append(str2);
                sb4.append(" signature");
                throw new SecurityException(sb4.toString(), e4);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        r23 = r6;
        r1 = (long) r2;
        r3 = r11 + r1;
        r9 = r9 - r1;
        r13 = r13 + 1;
        r12 = r8;
        r17 = r7;
        r1 = 0;
        r7 = 1048576;
        r24 = r3;
        r3 = r18;
        r4 = r4;
        r18 = r24;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[][] a(int[] r26, defpackage.bcr[] r27) {
        /*
            r0 = r26
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        L_0x0007:
            r7 = 1048576(0x100000, double:5.180654E-318)
            r9 = 3
            if (r4 >= r9) goto L_0x001c
            r9 = r27[r4]
            long r9 = r9.a()
            r11 = 1048575(0xfffff, double:5.18065E-318)
            long r9 = r9 + r11
            long r9 = r9 / r7
            long r5 = r5 + r9
            int r4 = r4 + 1
            goto L_0x0007
        L_0x001c:
            r10 = 2097151(0x1fffff, double:1.0361303E-317)
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0173
            int r4 = (int) r5
            int r5 = r0.length
            byte[][] r5 = new byte[r5][]
            r6 = 0
        L_0x0028:
            int r10 = r0.length
            r11 = 5
            if (r6 >= r10) goto L_0x0043
            r10 = r0[r6]
            int r10 = c(r10)
            int r10 = r10 * r4
            int r10 = r10 + r11
            byte[] r10 = new byte[r10]
            r11 = 90
            r10[r3] = r11
            a((int) r4, (byte[]) r10)
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0043:
            byte[] r4 = new byte[r11]
            r6 = -91
            r4[r3] = r6
            java.security.MessageDigest[] r6 = new java.security.MessageDigest[r10]
            r12 = 0
        L_0x004d:
            int r13 = r0.length
            java.lang.String r14 = " digest not supported"
            if (r12 >= r13) goto L_0x006c
            r13 = r0[r12]
            java.lang.String r13 = b((int) r13)
            java.security.MessageDigest r15 = java.security.MessageDigest.getInstance(r13)     // Catch:{ NoSuchAlgorithmException -> 0x0061 }
            r6[r12] = r15     // Catch:{ NoSuchAlgorithmException -> 0x0061 }
            int r12 = r12 + 1
            goto L_0x004d
        L_0x0061:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = r13.concat(r14)
            r1.<init>(r2, r0)
            throw r1
        L_0x006c:
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x006f:
            if (r12 >= r9) goto L_0x014a
            r3 = r27[r12]
            long r16 = r3.a()
            r18 = r1
            r24 = r16
            r17 = r10
            r9 = r24
        L_0x007f:
            int r20 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r20 > 0) goto L_0x008c
            int r15 = r15 + 1
            int r12 = r12 + 1
            r10 = r17
            r3 = 0
            r9 = 3
            goto L_0x006f
        L_0x008c:
            long r1 = java.lang.Math.min(r9, r7)
            int r2 = (int) r1
            a((int) r2, (byte[]) r4)
            r1 = 0
        L_0x0095:
            r7 = r17
            if (r1 >= r7) goto L_0x00a6
            r8 = r6[r1]
            r8.update(r4)
            int r1 = r1 + 1
            r17 = r7
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x0095
        L_0x00a6:
            r8 = r12
            r11 = r18
            r3.a(r6, r11, r2)     // Catch:{ IOException -> 0x0127 }
            r1 = 0
        L_0x00ad:
            r18 = r3
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0106
            r3 = r0[r1]
            r19 = r4
            r4 = r5[r1]
            int r3 = c(r3)
            r21 = r7
            r7 = r6[r1]
            int r22 = r13 * r3
            r23 = r6
            r17 = 5
            int r6 = r22 + 5
            int r4 = r7.digest(r4, r6, r3)
            if (r4 != r3) goto L_0x00d9
            int r1 = r1 + 1
            r3 = r18
            r4 = r19
            r7 = r21
            r6 = r23
            goto L_0x00ad
        L_0x00d9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = r7.getAlgorithm()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 46
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected output size of "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " digest: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r19 = r4
            r23 = r6
            r21 = r7
            r17 = 5
            long r1 = (long) r2
            long r3 = r11 + r1
            long r9 = r9 - r1
            int r13 = r13 + 1
            r12 = r8
            r17 = r21
            r1 = 0
            r7 = 1048576(0x100000, double:5.180654E-318)
            r11 = 5
            r24 = r3
            r3 = r18
            r4 = r19
            r18 = r24
            goto L_0x007f
        L_0x0127:
            r0 = move-exception
            r1 = r0
            java.security.DigestException r0 = new java.security.DigestException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 59
            r2.<init>(r3)
            java.lang.String r3 = "Failed to digest chunk #"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = " of section #"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x014a:
            int r1 = r0.length
            byte[][] r1 = new byte[r1][]
            r3 = 0
        L_0x014e:
            int r2 = r0.length
            if (r3 >= r2) goto L_0x0172
            r2 = r0[r3]
            r4 = r5[r3]
            java.lang.String r2 = b((int) r2)
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0166 }
            byte[] r2 = r2.digest(r4)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L_0x014e
        L_0x0166:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = r2.concat(r14)
            r0.<init>(r2, r1)
            throw r0
        L_0x0172:
            return r1
        L_0x0173:
            java.security.DigestException r0 = new java.security.DigestException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Too many chunks: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x018d
        L_0x018c:
            throw r0
        L_0x018d:
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.a(int[], bcr[]):byte[][]");
    }

    public static X509Certificate[][] a(String str) {
        Pair pair;
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() >= 22) {
                pair = bcy.a(randomAccessFile, 0);
                if (pair == null) {
                    pair = bcy.a(randomAccessFile, 65535);
                }
            } else {
                pair = null;
            }
            if (pair != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) pair.first;
                long longValue = ((Long) pair.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new bcu("ZIP64 APK not supported");
                    }
                }
                bcy.a(byteBuffer2);
                long a = bcy.a(byteBuffer2, byteBuffer2.position() + 16);
                if (a < longValue) {
                    bcy.a(byteBuffer2);
                    if (bcy.a(byteBuffer2, byteBuffer2.position() + 12) + a != longValue) {
                        throw new bcu("ZIP Central Directory is not immediately followed by End of Central Directory");
                    } else if (a >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(a - ((long) allocate.capacity()));
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        int i2 = 8;
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            long j2 = allocate.getLong(0);
                            if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                                StringBuilder sb = new StringBuilder(57);
                                sb.append("APK Signing Block size out of range: ");
                                sb.append(j2);
                                throw new bcu(sb.toString());
                            }
                            int i3 = (int) (8 + j2);
                            long j3 = a - ((long) i3);
                            if (j3 >= 0) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                randomAccessFile.seek(j3);
                                randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j4 = allocate2.getLong(0);
                                if (j4 == j2) {
                                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                    byteBuffer = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                        int capacity = byteBuffer.capacity() - 24;
                                        if (capacity >= 8) {
                                            int capacity2 = byteBuffer.capacity();
                                            if (capacity <= byteBuffer.capacity()) {
                                                limit = byteBuffer.limit();
                                                position = byteBuffer.position();
                                                byteBuffer.position(0);
                                                byteBuffer.limit(capacity);
                                                byteBuffer.position(8);
                                                ByteBuffer slice = byteBuffer.slice();
                                                slice.order(byteBuffer.order());
                                                byteBuffer.position(0);
                                                byteBuffer.limit(limit);
                                                byteBuffer.position(position);
                                                while (slice.hasRemaining()) {
                                                    i++;
                                                    if (slice.remaining() >= i2) {
                                                        long j5 = slice.getLong();
                                                        if (j5 < 4 || j5 > 2147483647L) {
                                                            StringBuilder sb2 = new StringBuilder(76);
                                                            sb2.append("APK Signing Block entry #");
                                                            sb2.append(i);
                                                            sb2.append(" size out of range: ");
                                                            sb2.append(j5);
                                                            throw new bcu(sb2.toString());
                                                        }
                                                        int i4 = (int) j5;
                                                        int position2 = slice.position() + i4;
                                                        if (i4 > slice.remaining()) {
                                                            int remaining = slice.remaining();
                                                            StringBuilder sb3 = new StringBuilder(91);
                                                            sb3.append("APK Signing Block entry #");
                                                            sb3.append(i);
                                                            sb3.append(" size out of range: ");
                                                            sb3.append(i4);
                                                            sb3.append(", available: ");
                                                            sb3.append(remaining);
                                                            throw new bcu(sb3.toString());
                                                        } else if (slice.getInt() == 1896449818) {
                                                            X509Certificate[][] a2 = a(randomAccessFile.getChannel(), new bct(a(slice, i4 - 4), longValue2, a, longValue, byteBuffer2));
                                                            randomAccessFile.close();
                                                            try {
                                                                randomAccessFile.close();
                                                            } catch (IOException e) {
                                                            }
                                                            return a2;
                                                        } else {
                                                            slice.position(position2);
                                                            i2 = 8;
                                                        }
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(70);
                                                        sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                        sb4.append(i);
                                                        throw new bcu(sb4.toString());
                                                    }
                                                }
                                                throw new bcu("No APK Signature Scheme v2 block in APK Signing Block");
                                            }
                                            StringBuilder sb5 = new StringBuilder(41);
                                            sb5.append("end > capacity: ");
                                            sb5.append(capacity);
                                            sb5.append(" > ");
                                            sb5.append(capacity2);
                                            throw new IllegalArgumentException(sb5.toString());
                                        }
                                        StringBuilder sb6 = new StringBuilder(38);
                                        sb6.append("end < start: ");
                                        sb6.append(capacity);
                                        sb6.append(" < ");
                                        sb6.append(8);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                }
                                StringBuilder sb7 = new StringBuilder(103);
                                sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                sb7.append(j4);
                                sb7.append(" vs ");
                                sb7.append(j2);
                                throw new bcu(sb7.toString());
                            }
                            StringBuilder sb8 = new StringBuilder(59);
                            sb8.append("APK Signing Block offset out of range: ");
                            sb8.append(j3);
                            throw new bcu(sb8.toString());
                        }
                        throw new bcu("No APK Signing Block before ZIP Central Directory");
                    } else {
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(a);
                        throw new bcu(sb9.toString());
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(122);
                    sb10.append("ZIP Central Directory offset out of range: ");
                    sb10.append(a);
                    sb10.append(". ZIP End of Central Directory offset: ");
                    sb10.append(longValue);
                    throw new bcu(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new bcu(sb11.toString());
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
            }
            throw th2;
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, bct bct) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a = a(bct.a);
                int i = 0;
                while (a.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(a(a(a), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    a(hashMap, fileChannel, bct.b, bct.c, bct.d, bct.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
