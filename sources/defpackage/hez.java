package defpackage;

/* renamed from: hez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hez implements bpu {
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* JADX WARNING: type inference failed for: r15v23 */
    /* JADX WARNING: type inference failed for: r15v24 */
    /* JADX WARNING: type inference failed for: r15v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0388, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0390, code lost:
        throw new java.security.GeneralSecurityException("Package is not signed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x037d A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:137:0x0377] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0388 A[Catch:{ IOException -> 0x037b, bpk -> 0x0388, RuntimeException -> 0x037d, Exception -> 0x0391 }, ExcHandler: bpk (r0v6 'e' bpk A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:3:0x0011] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:144:0x0380=Splitter:B:144:0x0380, B:83:0x01cb=Splitter:B:83:0x01cb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.io.File r21) {
        /*
            r20 = this;
            ihs r1 = defpackage.ihs.b()
            android.content.pm.PackageInfo r2 = new android.content.pm.PackageInfo
            r2.<init>()
            r3 = 0
            defpackage.aams.a(r1)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r0 = r21.getAbsolutePath()     // Catch:{ Exception -> 0x0391 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ bpk -> 0x0388, IOException -> 0x037f, RuntimeException -> 0x037d }
            java.lang.String r5 = "r"
            r4.<init>(r0, r5)     // Catch:{ bpk -> 0x0388, IOException -> 0x037f, RuntimeException -> 0x037d }
            long r5 = r4.length()     // Catch:{ all -> 0x0374 }
            r7 = 22
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0035
            android.util.Pair r0 = defpackage.bpy.a((java.io.RandomAccessFile) r4, (int) r3)     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0036
            r0 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r0 = defpackage.bpy.a((java.io.RandomAccessFile) r4, (int) r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0036
        L_0x0030:
            r0 = move-exception
            r1 = r0
            r15 = r4
            goto L_0x0377
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 == 0) goto L_0x0369
            java.lang.Object r5 = r0.first     // Catch:{ all -> 0x0374 }
            r14 = r5
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14     // Catch:{ all -> 0x0374 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0374 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0374 }
            long r12 = r0.longValue()     // Catch:{ all -> 0x0374 }
            r5 = -20
            long r5 = r5 + r12
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0063
            r4.seek(r5)     // Catch:{ all -> 0x0030 }
            int r0 = r4.readInt()     // Catch:{ all -> 0x0030 }
            r5 = 1347094023(0x504b0607, float:1.36246794E10)
            if (r0 == r5) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            bpk r0 = new bpk     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "ZIP64 APK not supported"
            r0.<init>(r1)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0063:
            defpackage.bpy.a(r14)     // Catch:{ all -> 0x0374 }
            int r0 = r14.position()     // Catch:{ all -> 0x0374 }
            r5 = 16
            int r0 = r0 + r5
            long r10 = defpackage.bpy.a((java.nio.ByteBuffer) r14, (int) r0)     // Catch:{ all -> 0x0374 }
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0347
            defpackage.bpy.a(r14)     // Catch:{ all -> 0x0374 }
            int r0 = r14.position()     // Catch:{ all -> 0x0374 }
            int r0 = r0 + 12
            long r15 = defpackage.bpy.a((java.nio.ByteBuffer) r14, (int) r0)     // Catch:{ all -> 0x0374 }
            long r15 = r15 + r10
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x033e
            r15 = 32
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0324
            r0 = 24
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0374 }
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0374 }
            r0.order(r6)     // Catch:{ all -> 0x0374 }
            int r6 = r0.capacity()     // Catch:{ all -> 0x0374 }
            long r7 = (long) r6     // Catch:{ all -> 0x0374 }
            long r7 = r10 - r7
            r4.seek(r7)     // Catch:{ all -> 0x0374 }
            byte[] r6 = r0.array()     // Catch:{ all -> 0x0374 }
            int r7 = r0.arrayOffset()     // Catch:{ all -> 0x0374 }
            int r8 = r0.capacity()     // Catch:{ all -> 0x0374 }
            r4.readFully(r6, r7, r8)     // Catch:{ all -> 0x0374 }
            r6 = 8
            long r7 = r0.getLong(r6)     // Catch:{ all -> 0x0374 }
            r17 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r9 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r9 != 0) goto L_0x031b
            long r7 = r0.getLong(r5)     // Catch:{ all -> 0x0374 }
            r17 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r5 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x0319
            long r7 = r0.getLong(r3)     // Catch:{ all -> 0x0374 }
            int r0 = r0.capacity()     // Catch:{ all -> 0x0374 }
            r17 = r4
            long r3 = (long) r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x02fe
            r3 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x02fb
            r3 = 8
            long r3 = r3 + r7
            int r0 = (int) r3
            long r3 = (long) r0
            long r3 = r10 - r3
            r15 = 0
            int r9 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x02e0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x02db }
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x02db }
            r0.order(r9)     // Catch:{ all -> 0x02db }
            r15 = r17
            r15.seek(r3)     // Catch:{ all -> 0x0372 }
            byte[] r9 = r0.array()     // Catch:{ all -> 0x0372 }
            int r5 = r0.arrayOffset()     // Catch:{ all -> 0x0372 }
            int r6 = r0.capacity()     // Catch:{ all -> 0x0372 }
            r15.readFully(r9, r5, r6)     // Catch:{ all -> 0x0372 }
            r16 = r1
            r18 = r2
            r5 = 0
            long r1 = r0.getLong(r5)     // Catch:{ all -> 0x0372 }
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x02ba
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0372 }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0372 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0372 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x0372 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0372 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0372 }
            long r8 = r0.longValue()     // Catch:{ all -> 0x0372 }
            java.nio.ByteOrder r0 = r1.order()     // Catch:{ all -> 0x0372 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0372 }
            if (r0 != r2) goto L_0x02b2
            int r0 = r1.capacity()     // Catch:{ all -> 0x0372 }
            int r0 = r0 + -24
            r2 = 8
            if (r0 < r2) goto L_0x028f
            int r2 = r1.capacity()     // Catch:{ all -> 0x0372 }
            int r3 = r1.capacity()     // Catch:{ all -> 0x0372 }
            if (r0 > r3) goto L_0x026e
            int r2 = r1.limit()     // Catch:{ all -> 0x0372 }
            int r3 = r1.position()     // Catch:{ all -> 0x0372 }
            r4 = 0
            r1.position(r4)     // Catch:{ all -> 0x0262 }
            r1.limit(r0)     // Catch:{ all -> 0x0262 }
            r0 = 8
            r1.position(r0)     // Catch:{ all -> 0x0262 }
            java.nio.ByteBuffer r0 = r1.slice()     // Catch:{ all -> 0x0262 }
            java.nio.ByteOrder r4 = r1.order()     // Catch:{ all -> 0x0262 }
            r0.order(r4)     // Catch:{ all -> 0x0262 }
            r4 = 0
            r1.position(r4)     // Catch:{ all -> 0x0372 }
            r1.limit(r2)     // Catch:{ all -> 0x0372 }
            r1.position(r3)     // Catch:{ all -> 0x0372 }
            r1 = 0
        L_0x0175:
            boolean r2 = r0.hasRemaining()     // Catch:{ all -> 0x0372 }
            if (r2 == 0) goto L_0x025a
            int r1 = r1 + 1
            int r2 = r0.remaining()     // Catch:{ all -> 0x0372 }
            r3 = 8
            if (r2 < r3) goto L_0x0241
            long r2 = r0.getLong()     // Catch:{ all -> 0x0372 }
            r6 = 4
            java.lang.String r4 = " size out of range: "
            java.lang.String r5 = "APK Signing Block entry #"
            int r19 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r19 < 0) goto L_0x0224
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r19 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r19 > 0) goto L_0x0224
            int r3 = (int) r2
            int r2 = r0.position()     // Catch:{ all -> 0x0372 }
            int r2 = r2 + r3
            int r6 = r0.remaining()     // Catch:{ all -> 0x0372 }
            if (r3 > r6) goto L_0x01fb
            int r4 = r0.getInt()     // Catch:{ all -> 0x0372 }
            r5 = 1896449818(0x7109871a, float:6.810044E29)
            if (r4 != r5) goto L_0x01f2
            int r3 = r3 + -4
            java.nio.ByteBuffer r7 = defpackage.bpn.a((java.nio.ByteBuffer) r0, (int) r3)     // Catch:{ all -> 0x0372 }
            bpj r0 = new bpj     // Catch:{ all -> 0x0372 }
            r6 = r0
            r6.<init>(r7, r8, r10, r12, r14)     // Catch:{ all -> 0x0372 }
            java.nio.channels.FileChannel r1 = r15.getChannel()     // Catch:{ all -> 0x0372 }
            java.security.cert.X509Certificate[][] r1 = defpackage.bpn.a((java.nio.channels.FileChannel) r1, (defpackage.bpj) r0)     // Catch:{ all -> 0x0372 }
            r15.close()     // Catch:{ all -> 0x0372 }
            r15.close()     // Catch:{ IOException -> 0x01ca, bpk -> 0x0388, RuntimeException -> 0x037d }
            goto L_0x01cb
        L_0x01ca:
            r0 = move-exception
        L_0x01cb:
            int r0 = r1.length     // Catch:{ Exception -> 0x0391 }
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r0]     // Catch:{ Exception -> 0x0391 }
            r5 = 0
        L_0x01cf:
            int r2 = r1.length     // Catch:{ Exception -> 0x0391 }
            if (r5 >= r2) goto L_0x01e5
            android.content.pm.Signature r2 = new android.content.pm.Signature     // Catch:{ Exception -> 0x0391 }
            r3 = r1[r5]     // Catch:{ Exception -> 0x0391 }
            r4 = 0
            r3 = r3[r4]     // Catch:{ Exception -> 0x0391 }
            byte[] r3 = r3.getEncoded()     // Catch:{ Exception -> 0x0391 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0391 }
            r0[r5] = r2     // Catch:{ Exception -> 0x0391 }
            int r5 = r5 + 1
            goto L_0x01cf
        L_0x01e5:
            r3 = r18
            r3.signatures = r0     // Catch:{ Exception -> 0x0391 }
            hya r0 = defpackage.hya.a((android.content.Context) r16)
            boolean r0 = r0.c((android.content.pm.PackageInfo) r3)
            return r0
        L_0x01f2:
            r3 = r18
            r0.position(r2)     // Catch:{ all -> 0x0372 }
            r18 = r3
            goto L_0x0175
        L_0x01fb:
            bpk r2 = new bpk     // Catch:{ all -> 0x0372 }
            int r0 = r0.remaining()     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r8 = 91
            r7.<init>(r8)     // Catch:{ all -> 0x0372 }
            r7.append(r5)     // Catch:{ all -> 0x0372 }
            r7.append(r1)     // Catch:{ all -> 0x0372 }
            r7.append(r4)     // Catch:{ all -> 0x0372 }
            r7.append(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = ", available: "
            r7.append(r1)     // Catch:{ all -> 0x0372 }
            r7.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0372 }
            r2.<init>(r0)     // Catch:{ all -> 0x0372 }
            throw r2     // Catch:{ all -> 0x0372 }
        L_0x0224:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r8 = 76
            r7.<init>(r8)     // Catch:{ all -> 0x0372 }
            r7.append(r5)     // Catch:{ all -> 0x0372 }
            r7.append(r1)     // Catch:{ all -> 0x0372 }
            r7.append(r4)     // Catch:{ all -> 0x0372 }
            r7.append(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0241:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r3 = 70
            r2.<init>(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r3 = "Insufficient data to read size of APK Signing Block entry #"
            r2.append(r3)     // Catch:{ all -> 0x0372 }
            r2.append(r1)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x025a:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = "No APK Signature Scheme v2 block in APK Signing Block"
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0262:
            r0 = move-exception
            r4 = 0
            r1.position(r4)     // Catch:{ all -> 0x0372 }
            r1.limit(r2)     // Catch:{ all -> 0x0372 }
            r1.position(r3)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x026e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r4 = 41
            r3.<init>(r4)     // Catch:{ all -> 0x0372 }
            java.lang.String r4 = "end > capacity: "
            r3.append(r4)     // Catch:{ all -> 0x0372 }
            r3.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = " > "
            r3.append(r0)     // Catch:{ all -> 0x0372 }
            r3.append(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0372 }
            r1.<init>(r0)     // Catch:{ all -> 0x0372 }
            throw r1     // Catch:{ all -> 0x0372 }
        L_0x028f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r3 = 38
            r2.<init>(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r3 = "end < start: "
            r2.append(r3)     // Catch:{ all -> 0x0372 }
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = " < "
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            r0 = 8
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0372 }
            r1.<init>(r0)     // Catch:{ all -> 0x0372 }
            throw r1     // Catch:{ all -> 0x0372 }
        L_0x02b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = "ByteBuffer byte order must be little endian"
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x02ba:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r4 = 103(0x67, float:1.44E-43)
            r3.<init>(r4)     // Catch:{ all -> 0x0372 }
            java.lang.String r4 = "APK Signing Block sizes in header and footer do not match: "
            r3.append(r4)     // Catch:{ all -> 0x0372 }
            r3.append(r1)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = " vs "
            r3.append(r1)     // Catch:{ all -> 0x0372 }
            r3.append(r7)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x02db:
            r0 = move-exception
            r15 = r17
            goto L_0x0376
        L_0x02e0:
            r15 = r17
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r2 = 59
            r1.<init>(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = "APK Signing Block offset out of range: "
            r1.append(r2)     // Catch:{ all -> 0x0372 }
            r1.append(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x02fb:
            r15 = r17
            goto L_0x0300
        L_0x02fe:
            r15 = r17
        L_0x0300:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r2 = 57
            r1.<init>(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = "APK Signing Block size out of range: "
            r1.append(r2)     // Catch:{ all -> 0x0372 }
            r1.append(r7)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0319:
            r15 = r4
            goto L_0x031c
        L_0x031b:
            r15 = r4
        L_0x031c:
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = "No APK Signing Block before ZIP Central Directory"
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0324:
            r15 = r4
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r2 = 87
            r1.<init>(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            r1.append(r2)     // Catch:{ all -> 0x0372 }
            r1.append(r10)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x033e:
            r15 = r4
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0347:
            r15 = r4
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r2 = 122(0x7a, float:1.71E-43)
            r1.<init>(r2)     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = "ZIP Central Directory offset out of range: "
            r1.append(r2)     // Catch:{ all -> 0x0372 }
            r1.append(r10)     // Catch:{ all -> 0x0372 }
            java.lang.String r2 = ". ZIP End of Central Directory offset: "
            r1.append(r2)     // Catch:{ all -> 0x0372 }
            r1.append(r12)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0369:
            r15 = r4
            bpk r0 = new bpk     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = "Not an APK file: ZIP End of Central Directory record not found"
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0372:
            r0 = move-exception
            goto L_0x0376
        L_0x0374:
            r0 = move-exception
            r15 = r4
        L_0x0376:
            r1 = r0
        L_0x0377:
            r15.close()     // Catch:{ IOException -> 0x037b, bpk -> 0x0388, RuntimeException -> 0x037d }
            goto L_0x037c
        L_0x037b:
            r0 = move-exception
        L_0x037c:
            throw r1     // Catch:{ bpk -> 0x0388, IOException -> 0x037f, RuntimeException -> 0x037d }
        L_0x037d:
            r0 = move-exception
            goto L_0x0380
        L_0x037f:
            r0 = move-exception
        L_0x0380:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ Exception -> 0x0391 }
            java.lang.String r2 = "Failed to verify signatures"
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0391 }
            throw r1     // Catch:{ Exception -> 0x0391 }
        L_0x0388:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ Exception -> 0x0391 }
            java.lang.String r2 = "Package is not signed"
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0391 }
            throw r1     // Catch:{ Exception -> 0x0391 }
        L_0x0391:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 == 0) goto L_0x03a9
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r0)
        L_0x03a9:
            java.lang.String r0 = r21.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 25
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = " failed signature check: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "GmsSigVfyr"
            android.util.Log.w(r1, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hez.a(java.io.File):boolean");
    }
}
