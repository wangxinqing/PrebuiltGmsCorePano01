package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: kjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjb extends kja {
    private static final ith f = new ith("BinaryDiffUploader", "");
    private static final Pattern g = Pattern.compile("\\AUser-provided checksum does not match received payload content.*");
    private static final Pattern h = Pattern.compile("\\ARevision not found.*");
    private final khx i;
    private final AtomicBoolean j;
    private final amdf k;
    private final lfp l;
    private final lfl m;
    private final String n;
    private final String o;
    private final List p = new ArrayList();

    private kjb(Context context, kjl kjl, khx khx, kht kht, AtomicBoolean atomicBoolean, amdf amdf, kjd kjd, lfp lfp, lfl lfl, kjn kjn, String str, String str2) {
        super(context, kjl, kht, kjn);
        iva.a((Object) khx);
        this.i = khx;
        iva.a((Object) atomicBoolean);
        this.j = atomicBoolean;
        iva.a((Object) amdf);
        this.k = amdf;
        iva.a((Object) kjd);
        iva.a((Object) lfp);
        this.l = lfp;
        iva.a((Object) lfl);
        this.m = lfl;
        iva.a((Object) str);
        this.o = str;
        iva.a((Object) str2);
        this.n = str2;
    }

    public static kjb a(Context context, kjl kjl, khx khx, kkf kkf, kht kht, AtomicBoolean atomicBoolean, amdf amdf, kjd kjd, lfp lfp, kjn kjn) {
        kmp kmp;
        kjl kjl2 = kjl;
        iva.a((Object) kkf);
        lfl a = lfp.a();
        if (!jzp.a(jzo.BINARY_DIFF_UPLOAD) || !atomicBoolean.get()) {
            a.c(5);
            a.a();
            return null;
        }
        if (!kjl2.c && kjl2.d != null && kjl2.e >= ((long) ((Integer) jzq.r.c()).intValue()) && kjl2.e >= ((long) ((Integer) jzq.s.c()).intValue())) {
            if (kjl2.e <= 4194304) {
                try {
                    kmp = kkf.a(kjl2.a, kjl2.d);
                } catch (kcs e) {
                    kmp = null;
                } catch (ktv e2) {
                    f.c("BinaryDiffUploader", String.format("Bad DriveID: %s", new Object[]{kjl2.d}), e2);
                    a.c(6);
                    a.a();
                    return null;
                }
                if (kmp == null || kmp.n() == null || kmp.o() == null) {
                    f.b("BinaryDiffUploader", "Cannot find any valid hash/revId to base diff on");
                    a.c(6);
                    a.a();
                    return null;
                }
                return new kjb(context, kjl, khx, kht, atomicBoolean, amdf, kjd, lfp, a, kjn, kmp.n(), kmp.o());
            }
            f.b("Target file size is bigger than Multipart max size");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "";
    }

    public final amzy e() {
        return amzy.a((Collection) this.p);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: amdd} */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        f.c("Unable to get response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0485, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0486, code lost:
        r2 = r0;
        r17 = r3;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x048c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x048d, code lost:
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0556, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0558, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x055e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x055f, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0561, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0562, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0565, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0566, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0568, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0569, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ee, code lost:
        r2 = r0;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f4, code lost:
        r2 = r0;
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fc, code lost:
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0192, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a8, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bd, code lost:
        r23 = r9;
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0225, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0226, code lost:
        r2 = r0;
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0231, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0232, code lost:
        r2 = r0;
        r17 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0237, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0238, code lost:
        r2 = r0;
        r17 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02c6 A[Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0424 A[ADDED_TO_REGION, Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x048c A[ExcHandler: kjj (e kjj), Splitter:B:99:0x027e] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x054e A[SYNTHETIC, Splitter:B:266:0x054e] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0556 A[ExcHandler: all (th java.lang.Throwable), PHI: r23 
      PHI: (r23v22 lsr) = (r23v23 lsr), (r23v24 lsr), (r23v31 lsr) binds: [B:266:0x054e, B:70:0x01c2, B:47:0x013f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:47:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0558 A[ExcHandler: kjj (e kjj), PHI: r23 
      PHI: (r23v21 lsr) = (r23v23 lsr), (r23v24 lsr), (r23v31 lsr) binds: [B:266:0x054e, B:70:0x01c2, B:47:0x013f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:47:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x055e A[ExcHandler: all (th java.lang.Throwable), PHI: r9 
      PHI: (r9v8 lsr) = (r9v6 lsr), (r9v6 lsr), (r9v6 lsr), (r9v15 lsr) binds: [B:15:0x007f, B:16:?, B:18:0x0088, B:42:0x0108] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0565 A[ExcHandler: kjj (e kjj), PHI: r9 
      PHI: (r9v7 lsr) = (r9v6 lsr), (r9v6 lsr), (r9v6 lsr), (r9v15 lsr) binds: [B:15:0x007f, B:16:?, B:18:0x0088, B:42:0x0108] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed A[ExcHandler: all (r0v51 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:22:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3 A[ExcHandler: kjj (r0v50 'e' kjj A[CUSTOM_DECLARE]), Splitter:B:22:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d8 A[Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0225 A[ExcHandler: all (r0v43 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v42 kje) = (r3v20 kje), (r3v20 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v14 kje), (r3v14 kje) binds: [B:215:0x049e, B:216:?, B:94:0x0273, B:95:?, B:202:0x0473, B:203:?, B:147:0x0377, B:183:0x03fa, B:99:0x027e, B:100:?, B:113:0x02a9, B:102:0x0282, B:79:0x0221, B:80:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:79:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0231 A[ExcHandler: IOException (r0v40 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v39 kje) = (r3v20 kje), (r3v20 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v14 kje), (r3v14 kje) binds: [B:215:0x049e, B:216:?, B:94:0x0273, B:95:?, B:202:0x0473, B:203:?, B:183:0x03fa, B:99:0x027e, B:100:?, B:113:0x02a9, B:102:0x0282, B:79:0x0221, B:80:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:79:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237 A[ExcHandler: lhp (r0v39 'e' lhp A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v38 kje) = (r3v20 kje), (r3v20 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v19 kje), (r3v14 kje), (r3v14 kje) binds: [B:215:0x049e, B:216:?, B:94:0x0273, B:95:?, B:202:0x0473, B:203:?, B:183:0x03fa, B:99:0x027e, B:100:?, B:113:0x02a9, B:102:0x0282, B:79:0x0221, B:80:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:79:0x0221] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lnj a(defpackage.kjk r28, defpackage.lic r29, com.google.android.gms.common.internal.ClientContext r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            java.lang.String r5 = "BinaryDiffUploader"
            r6 = 1
            r1.e = r6
            kjl r7 = r1.b
            long r7 = r7.e
            r2.a(r7)
            r7 = 0
            kjl r9 = r1.b     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            long r9 = r9.e     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            amdf r11 = r1.k     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            r12 = 0
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0023
            r14 = 1
            goto L_0x0024
        L_0x0023:
            r14 = 0
        L_0x0024:
            defpackage.amrl.a((boolean) r14)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            double r14 = r11.c     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            double r12 = (double) r9
            r18 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r18
            double r12 = r12 / r14
            double r12 = java.lang.Math.sqrt(r12)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r14 = r11.d     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            double r12 = r12 * r18
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r12 = r12 / r14
            long r12 = java.lang.Math.round(r12)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r14 = r11.d     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r15 = r11.a     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r11 = r11.b     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r13 = (int) r12     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r13 = r13 * r14
            int r11 = java.lang.Math.min(r11, r13)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            int r11 = java.lang.Math.max(r15, r11)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            ith r12 = f     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            r14[r7] = r9     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            r14[r6] = r9     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            java.lang.String r9 = "File size = %d, chunk size: %d"
            r12.a((java.lang.String) r9, (java.lang.Object[]) r14)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            khx r9 = r1.i     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            java.lang.String r10 = r1.o     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            lsr r9 = r9.b(r10)     // Catch:{ lhp -> 0x0615, IOException -> 0x05fd, kjj -> 0x05a6, all -> 0x059e }
            kjl r10 = r1.b     // Catch:{ lhp -> 0x0593, IOException -> 0x0588, kjj -> 0x0581, all -> 0x0579 }
            lsr r10 = r10.a()     // Catch:{ lhp -> 0x0593, IOException -> 0x0588, kjj -> 0x0581, all -> 0x0579 }
            kib r12 = new kib     // Catch:{ lhp -> 0x0593, IOException -> 0x0588, kjj -> 0x0581, all -> 0x0579 }
            java.lang.String r14 = "SHA-1"
            r12.<init>(r10, r14)     // Catch:{ lhp -> 0x0593, IOException -> 0x0588, kjj -> 0x0581, all -> 0x0579 }
            kjf r14 = new kjf     // Catch:{ lhp -> 0x0572, IOException -> 0x056b, kjj -> 0x0565, all -> 0x055e }
            r14.<init>()     // Catch:{ lhp -> 0x0572, IOException -> 0x056b, kjj -> 0x0565, all -> 0x055e }
            r14.a()     // Catch:{ lhp -> 0x0572, IOException -> 0x056b, kjj -> 0x0565, all -> 0x055e }
            r15 = -1
            amdi r8 = new amdi     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            r8.<init>(r11)     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            defpackage.amrl.a((java.lang.Object) r9)     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            amdh r13 = new amdh     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            amdk r11 = defpackage.amdb.a(r11)     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            r13.<init>(r11)     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            int r8 = r8.a     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            byte[] r8 = new byte[r8]     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
        L_0x009d:
            int r11 = r9.read(r8)     // Catch:{ lsq -> 0x01bc, IOException -> 0x01ba, kjj -> 0x0565, all -> 0x055e }
            if (r11 != r15) goto L_0x0103
            long r7 = r13.c     // Catch:{ lsq -> 0x00fb, IOException -> 0x00f9, kjj -> 0x00f3, all -> 0x00ed }
            int r11 = r13.b     // Catch:{ lsq -> 0x00fb, IOException -> 0x00f9, kjj -> 0x00f3, all -> 0x00ed }
            r20 = r10
            long r10 = (long) r11
            long r7 = r7 % r10
            int r8 = (int) r7     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            if (r8 <= 0) goto L_0x00cd
            amdk r7 = r13.d     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            int r7 = r7.a((int) r8)     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            amdd r10 = new amdd     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r11 = r7
            long r6 = r13.c     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            long r2 = (long) r8     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            long r6 = r6 - r2
            amdk r2 = r13.d     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            java.lang.String r2 = r2.b(r8)     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r10.<init>(r6, r2)     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r26 = r10
            r25 = r11
            goto L_0x00d1
        L_0x00cd:
            r25 = 0
            r26 = 0
        L_0x00d1:
            amdj r2 = new amdj     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            amde r3 = r13.a     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            int r6 = r13.b     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r21 = r2
            r22 = r3
            r23 = r6
            r24 = r8
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r9.a()     // Catch:{ lsq -> 0x00eb, IOException -> 0x00e9, kjj -> 0x00f3, all -> 0x00ed }
            r23 = r9
            goto L_0x01d6
        L_0x00e9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00eb:
            r0 = move-exception
            goto L_0x00fe
        L_0x00ed:
            r0 = move-exception
            r2 = r0
            r23 = r9
            goto L_0x0562
        L_0x00f3:
            r0 = move-exception
            r2 = r0
            r23 = r9
            goto L_0x0569
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fc
        L_0x00fb:
            r0 = move-exception
        L_0x00fc:
            r20 = r10
        L_0x00fe:
            r2 = r0
            r23 = r9
            goto L_0x01c2
        L_0x0103:
            r20 = r10
            r2 = 0
        L_0x0106:
            if (r2 >= r11) goto L_0x01ab
            byte r3 = r8[r2]     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            amdk r6 = r13.d     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            r6.a((byte) r3)     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            long r6 = r13.c     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            r21 = 1
            long r6 = r6 + r21
            r13.c = r6     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            amdk r3 = r13.d     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            int r3 = r3.a()     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            r21 = r11
            long r10 = (long) r3     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            long r6 = r6 % r10
            r10 = 0
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0196
            amdk r3 = r13.d     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            int r3 = r3.d()     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            amdk r6 = r13.d     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            java.lang.String r6 = r6.e()     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            amdd r7 = new amdd     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            long r10 = r13.c     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            int r15 = r13.b     // Catch:{ lsq -> 0x01a7, IOException -> 0x01a5, kjj -> 0x0565, all -> 0x055e }
            r24 = r8
            r23 = r9
            long r8 = (long) r15
            long r10 = r10 - r8
            r7.<init>(r10, r6)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            amde r6 = r13.a     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            ov r8 = r6.b     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            int r9 = r3.intValue()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            java.lang.Object r8 = r8.a(r9)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            if (r8 != 0) goto L_0x0165
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            r8.<init>()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            ov r9 = r6.b     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            int r3 = r3.intValue()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            r9.b(r3, r8)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            goto L_0x0166
        L_0x0165:
        L_0x0166:
            boolean r3 = r8.isEmpty()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            if (r3 == 0) goto L_0x016d
            goto L_0x0188
        L_0x016d:
            java.util.Iterator r3 = r8.iterator()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
        L_0x0171:
            boolean r9 = r3.hasNext()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            if (r9 == 0) goto L_0x0188
            java.lang.Object r9 = r3.next()     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            amdd r9 = (defpackage.amdd) r9     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r9 = r9.b     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r10 = r7.b     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            boolean r9 = r9.equals(r10)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            if (r9 == 0) goto L_0x0171
            goto L_0x019a
        L_0x0188:
            int r3 = r6.a     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            r9 = 1
            int r3 = r3 + r9
            r6.a = r3     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            r8.add(r7)     // Catch:{ lsq -> 0x0194, IOException -> 0x0192, kjj -> 0x0558, all -> 0x0556 }
            goto L_0x019a
        L_0x0192:
            r0 = move-exception
            goto L_0x01c1
        L_0x0194:
            r0 = move-exception
            goto L_0x01c1
        L_0x0196:
            r24 = r8
            r23 = r9
        L_0x019a:
            int r2 = r2 + 1
            r11 = r21
            r9 = r23
            r8 = r24
            r15 = -1
            goto L_0x0106
        L_0x01a5:
            r0 = move-exception
            goto L_0x01a8
        L_0x01a7:
            r0 = move-exception
        L_0x01a8:
            r23 = r9
            goto L_0x01c1
        L_0x01ab:
            r24 = r8
            r23 = r9
            r2 = r28
            r3 = r29
            r10 = r20
            r6 = 1
            r7 = 0
            r15 = -1
            goto L_0x009d
        L_0x01ba:
            r0 = move-exception
            goto L_0x01bd
        L_0x01bc:
            r0 = move-exception
        L_0x01bd:
            r23 = r9
            r20 = r10
        L_0x01c1:
            r2 = r0
        L_0x01c2:
            ith r3 = f     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            android.content.Context r6 = r1.a     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r8 = 0
            r7[r8] = r6     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r6 = "Unable to create hash summary in %s"
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r3.c(r5, r6, r2)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r2 = 0
        L_0x01d6:
            if (r2 == 0) goto L_0x054e
            lfl r3 = r1.m     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            int r6 = r14.b()     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r3.a((int) r6)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            amdl r3 = new amdl     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r3.<init>()     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r3.a = r2     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r3.b = r12     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            amdj r2 = r3.a     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            defpackage.amrl.a((java.lang.Object) r2)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.io.InputStream r2 = r3.b     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            defpackage.amrl.a((java.lang.Object) r2)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            amdm r2 = new amdm     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.io.InputStream r6 = r3.b     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            amdj r3 = r3.a     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            r2.<init>(r6, r3)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            android.content.Context r3 = r1.a     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.net.URL r6 = r27.b()     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r7 = "PUT"
            r8 = r29
            kje r3 = defpackage.kjd.a(r3, r6, r7, r4, r8)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r6 = "X-Goog-Upload-Protocol"
            java.lang.String r7 = "multipart"
            r3.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            java.lang.String r6 = "X-Goog-Diff-Content-Encoding"
            java.lang.String r7 = r1.n     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r3.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            kjl r6 = r1.b     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            java.lang.String r6 = r6.f     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            if (r6 == 0) goto L_0x023d
            java.lang.String r7 = "If-Match"
            r3.a((java.lang.String) r7, (java.lang.String) r6)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            goto L_0x023d
        L_0x0225:
            r0 = move-exception
            r2 = r0
            r17 = r3
            goto L_0x052e
        L_0x022b:
            r0 = move-exception
        L_0x022c:
            r2 = r0
            r17 = r3
            goto L_0x0536
        L_0x0231:
            r0 = move-exception
            r2 = r0
            r17 = r3
            goto L_0x053e
        L_0x0237:
            r0 = move-exception
            r2 = r0
            r17 = r3
            goto L_0x0548
        L_0x023d:
            kjl r6 = r1.b     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            java.lang.String r6 = r6.b     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r3.c(r6)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            long r6 = r3.d()     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r14.a()     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            java.lang.String r9 = "application/octet-stream"
            r3.f()     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r3.b(r9)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            lhb r9 = r3.e()     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            java.io.InputStream r10 = r2.b     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            amdj r2 = r2.a     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            amdn r11 = new amdn     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r11.<init>(r9)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            int r9 = r2.b     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            amdk r9 = defpackage.amdb.a(r9)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r13 = 256(0x100, float:3.59E-43)
            byte[] r13 = new byte[r13]     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
        L_0x026a:
            int r15 = r10.read(r13)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r16 = r10
            r10 = -1
            if (r15 != r10) goto L_0x0491
            int r10 = r9.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            byte[] r13 = r9.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            int r13 = r13.length     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            if (r10 >= r13) goto L_0x027b
            goto L_0x027c
        L_0x027b:
            r10 = r13
        L_0x027c:
            if (r10 == 0) goto L_0x02cf
            int r13 = r2.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r13 == 0) goto L_0x02a3
            int r13 = r9.a((int) r13)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            java.lang.Integer r15 = r2.d     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            int r15 = r15.intValue()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            if (r13 != r15) goto L_0x02a3
            int r13 = r2.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            java.lang.String r13 = r9.b(r13)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            amdd r15 = r2.e     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            java.lang.String r15 = r15.b     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            boolean r13 = r15.equals(r13)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            if (r13 == 0) goto L_0x02a3
            int r13 = r2.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            int r10 = r10 - r13
            r13 = 1
            goto L_0x02a4
        L_0x02a3:
            r13 = 0
        L_0x02a4:
            r15 = 0
        L_0x02a5:
            if (r15 >= r10) goto L_0x02c4
            r16 = r10
            int r10 = r9.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            byte[] r8 = r9.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r4 = r8.length     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r10 < r4) goto L_0x02b5
            int r10 = r9.b     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r10 = r10 + r15
            int r10 = r10 % r4
            goto L_0x02b6
        L_0x02b5:
            r10 = r15
        L_0x02b6:
            byte r4 = r8[r10]     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r11.a(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r15 = r15 + 1
            r8 = r29
            r4 = r30
            r10 = r16
            goto L_0x02a5
        L_0x02c4:
            if (r13 == 0) goto L_0x02cf
            amdd r4 = r2.e     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            long r8 = r4.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r2 = r2.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r11.a(r8, r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x02cf:
            int r2 = r11.b     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r2 == 0) goto L_0x02d9
            amdc r2 = r11.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r2 == 0) goto L_0x02d9
            r2 = 0
            goto L_0x02da
        L_0x02d9:
            r2 = 1
        L_0x02da:
            defpackage.amrl.b(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r2 = r11.b     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r2 != 0) goto L_0x02e2
            goto L_0x02e5
        L_0x02e2:
            r11.a()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x02e5:
            amdc r2 = r11.c     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r2 != 0) goto L_0x02ea
            goto L_0x02ed
        L_0x02ea:
            r11.b()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x02ed:
            java.io.OutputStream r2 = r11.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r2.flush()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r2 = r3.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r4 = 1
            int r2 = r2 + r4
            r3.a = r2     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            lfl r2 = r1.m     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r4 = r14.b()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r2.b(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.security.MessageDigest r2 = r12.a     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            byte[] r2 = r2.digest()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r2 = defpackage.jhy.b((byte[]) r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r8 = 0
            r4[r8] = r2     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r2 = "text/plain"
            java.lang.String r8 = "X-Goog-Hash: sha1=%s"
            java.lang.String r4 = java.lang.String.format(r8, r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r8 = "UTF-8"
            byte[] r4 = r4.getBytes(r8)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r3.a((java.lang.String) r2, (byte[]) r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            long r8 = r3.d()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            lfl r2 = r1.m     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            long r8 = r8 - r6
            r2.a((long) r8)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r20.a()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            int r2 = r3.a()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            ith r4 = f     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r8 = 0
            r7[r8] = r6     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r6 = "HTTP upload status %d"
            r4.a((java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r4 = "X-GUploader-UploadID"
            java.lang.String r4 = r3.a(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r4 == 0) goto L_0x0351
            java.util.List r6 = r1.p     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r6.add(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x0351:
            r6 = 201(0xc9, float:2.82E-43)
            if (r2 != r6) goto L_0x0357
            goto L_0x045e
        L_0x0357:
            r6 = 200(0xc8, float:2.8E-43)
            if (r2 == r6) goto L_0x045e
            ith r6 = f     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r7 = 0
            r8[r7] = r4     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r4 = "Upload ID: %s"
            r6.a((java.lang.String) r4, (java.lang.Object[]) r8)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            kjl r4 = r1.b     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r6 = 7
            r7 = 8
            r8 = 400(0x190, float:5.6E-43)
            r9 = 4
            r10 = 3
            if (r2 != r8) goto L_0x03bd
            java.lang.String r11 = "invalid_protocol"
            java.lang.String r13 = "X-GUploader-Request-Result"
            java.lang.String r13 = r3.a(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            boolean r11 = r11.equals(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r11 != 0) goto L_0x03b9
            java.io.InputStream r11 = r3.c()     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            lrx r11 = defpackage.lry.a((java.io.InputStream) r11)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            defpackage.lry.a(r8, r11)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.util.regex.Pattern r8 = g     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r13 = r11.a     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.util.regex.Matcher r8 = r8.matcher(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            boolean r8 = r8.matches()     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r8 != 0) goto L_0x03b7
            r8 = 110(0x6e, float:1.54E-43)
            boolean r8 = r11.a(r8)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r8 != 0) goto L_0x03b9
            r8 = 99
            boolean r8 = r11.a(r8)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r8 != 0) goto L_0x03b5
            java.lang.String r8 = "checksumMismatch"
            java.lang.String r11 = r11.b     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            boolean r8 = r8.equals(r11)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r8 != 0) goto L_0x03b7
            goto L_0x03bd
        L_0x03b5:
            r13 = 7
            goto L_0x0411
        L_0x03b7:
            r13 = 4
            goto L_0x0411
        L_0x03b9:
            r13 = 3
            goto L_0x0411
        L_0x03bb:
            r0 = move-exception
            goto L_0x03fa
        L_0x03bd:
            r8 = 404(0x194, float:5.66E-43)
            if (r2 == r8) goto L_0x03c2
            goto L_0x0401
        L_0x03c2:
            java.io.InputStream r8 = r3.c()     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            lrx r8 = defpackage.lry.a((java.io.InputStream) r8)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r11 = r8.c     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r11 == 0) goto L_0x03de
            java.util.regex.Pattern r11 = h     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r13 = r8.c     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            java.util.regex.Matcher r11 = r11.matcher(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            boolean r11 = r11.matches()     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r11 == 0) goto L_0x03de
            r11 = 1
            goto L_0x03df
        L_0x03de:
            r11 = 0
        L_0x03df:
            r13 = 45
            boolean r13 = r8.a(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r13 == 0) goto L_0x03f1
            r13 = 68
            boolean r8 = r8.b(r13)     // Catch:{ IOException -> 0x03bb, kjj -> 0x048c, all -> 0x0225 }
            if (r8 == 0) goto L_0x03f1
            r8 = 1
            goto L_0x03f2
        L_0x03f1:
            r8 = 0
        L_0x03f2:
            if (r11 == 0) goto L_0x03f6
            r13 = 2
            goto L_0x0411
        L_0x03f6:
            if (r8 == 0) goto L_0x0401
            r13 = 2
            goto L_0x0411
        L_0x03fa:
            ith r8 = f     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r11 = "Unable to get response"
            r8.c(r11)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x0401:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.Integer r4 = r4.h     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            boolean r4 = defpackage.ius.a(r8, r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r4 == 0) goto L_0x0410
            r13 = 8
            goto L_0x0411
        L_0x0410:
            r13 = 1
        L_0x0411:
            ith r4 = f     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r14 = 0
            r8[r14] = r11     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r11 = "Binary diff failed, reason: %s"
            r4.a((java.lang.String) r11, (java.lang.Object[]) r8)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            if (r13 == r10) goto L_0x0433
            if (r13 == r9) goto L_0x0433
            if (r13 == r6) goto L_0x0433
            if (r13 == r7) goto L_0x042b
            goto L_0x0440
        L_0x042b:
            kji r2 = new kji     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r4 = "Conflict uploading"
            r2.<init>(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            throw r2     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x0433:
            ith r4 = f     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r6 = "Binary diff upload disabled"
            r4.b((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.j     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r6 = 0
            r4.set(r6)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x0440:
            lfl r4 = r1.m     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r4.c(r13)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            kjj r4 = new kjj     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r7 = 37
            r6.<init>(r7)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r7 = "Upload failed HTTP status "
            r6.append(r7)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r6.append(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r2 = r6.toString()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r4.<init>(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            throw r4     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
        L_0x045e:
            r28.a()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.io.InputStream r2 = r3.b()     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            com.google.android.gms.drive.internal.model.File r2 = defpackage.kjn.a(r2)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            java.lang.String r4 = "X-Server-Object-Version"
            java.lang.String r4 = r3.a(r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            lnl r6 = new lnl     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x048c, all -> 0x0225 }
            r7 = r30
            r6.<init>(r2, r7, r4)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x0485, all -> 0x0225 }
            lfl r2 = r1.m
            r2.a()
            defpackage.jjt.a((java.io.Closeable) r3)
            defpackage.jjt.a((java.io.Closeable) r23)
            defpackage.jjt.a((java.io.Closeable) r12)
            return r6
        L_0x0485:
            r0 = move-exception
            r2 = r0
            r17 = r3
            r4 = r7
            goto L_0x0536
        L_0x048c:
            r0 = move-exception
            r4 = r30
            goto L_0x022c
        L_0x0491:
            r8 = 1
            r8 = 0
        L_0x0493:
            if (r8 >= r15) goto L_0x0520
            byte r10 = r13[r8]     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r9.a((byte) r10)     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            boolean r10 = r9.e     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            if (r10 == 0) goto L_0x04a3
            byte r10 = r9.d     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
            r11.a(r10)     // Catch:{ lhp -> 0x0237, IOException -> 0x0231, kjj -> 0x022b, all -> 0x0225 }
        L_0x04a3:
            boolean r10 = r9.b()     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            if (r10 == 0) goto L_0x0513
            amde r10 = r2.a     // Catch:{ lhp -> 0x0544, IOException -> 0x053a, kjj -> 0x0532, all -> 0x052a }
            r17 = r3
            int r3 = r9.d()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            ov r10 = r10.b     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            int r3 = r10.e(r3)     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            if (r3 < 0) goto L_0x04fa
            amde r3 = r2.a     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            int r10 = r9.d()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            ov r3 = r3.b     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            java.lang.Object r3 = r3.a(r10)     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            if (r3 != 0) goto L_0x04ce
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            r3.<init>()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
        L_0x04ce:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            r10 = 0
        L_0x04d3:
            boolean r21 = r3.hasNext()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            if (r21 == 0) goto L_0x04fa
            java.lang.Object r21 = r3.next()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            r24 = r3
            r3 = r21
            amdd r3 = (defpackage.amdd) r3     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            if (r10 == 0) goto L_0x04e6
            goto L_0x04ea
        L_0x04e6:
            java.lang.String r10 = r9.e()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
        L_0x04ea:
            r25 = r6
            java.lang.String r6 = r3.b     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            boolean r6 = r6.equals(r10)     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            if (r6 == 0) goto L_0x04f5
            goto L_0x04fd
        L_0x04f5:
            r3 = r24
            r6 = r25
            goto L_0x04d3
        L_0x04fa:
            r25 = r6
            r3 = 0
        L_0x04fd:
            if (r3 != 0) goto L_0x0500
            goto L_0x0517
        L_0x0500:
            long r6 = r3.a     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            int r3 = r2.b     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            r11.a(r6, r3)     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            r9.c()     // Catch:{ lhp -> 0x0511, IOException -> 0x050f, kjj -> 0x050d, all -> 0x050b }
            goto L_0x0517
        L_0x050b:
            r0 = move-exception
            goto L_0x052d
        L_0x050d:
            r0 = move-exception
            goto L_0x0535
        L_0x050f:
            r0 = move-exception
            goto L_0x053d
        L_0x0511:
            r0 = move-exception
            goto L_0x0547
        L_0x0513:
            r17 = r3
            r25 = r6
        L_0x0517:
            int r8 = r8 + 1
            r3 = r17
            r6 = r25
            r10 = -1
            goto L_0x0493
        L_0x0520:
            r17 = r3
            r25 = r6
            r8 = r29
            r10 = r16
            goto L_0x026a
        L_0x052a:
            r0 = move-exception
            r17 = r3
        L_0x052d:
            r2 = r0
        L_0x052e:
            r8 = r17
            goto L_0x0622
        L_0x0532:
            r0 = move-exception
            r17 = r3
        L_0x0535:
            r2 = r0
        L_0x0536:
            r8 = r17
            goto L_0x05ac
        L_0x053a:
            r0 = move-exception
            r17 = r3
        L_0x053d:
            r2 = r0
        L_0x053e:
            r18 = r17
            r8 = r23
            goto L_0x0603
        L_0x0544:
            r0 = move-exception
            r17 = r3
        L_0x0547:
            r2 = r0
        L_0x0548:
            r18 = r17
            r8 = r23
            goto L_0x061b
        L_0x054e:
            kjj r2 = new kjj     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            java.lang.String r3 = "Cannot create hash summary from source stream"
            r2.<init>(r3)     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
            throw r2     // Catch:{ lhp -> 0x055c, IOException -> 0x055a, kjj -> 0x0558, all -> 0x0556 }
        L_0x0556:
            r0 = move-exception
            goto L_0x0561
        L_0x0558:
            r0 = move-exception
            goto L_0x0568
        L_0x055a:
            r0 = move-exception
            goto L_0x056e
        L_0x055c:
            r0 = move-exception
            goto L_0x0575
        L_0x055e:
            r0 = move-exception
            r23 = r9
        L_0x0561:
            r2 = r0
        L_0x0562:
            r8 = 0
            goto L_0x0622
        L_0x0565:
            r0 = move-exception
            r23 = r9
        L_0x0568:
            r2 = r0
        L_0x0569:
            r8 = 0
            goto L_0x05ac
        L_0x056b:
            r0 = move-exception
            r23 = r9
        L_0x056e:
            r2 = r0
            r8 = r23
            goto L_0x058f
        L_0x0572:
            r0 = move-exception
            r23 = r9
        L_0x0575:
            r2 = r0
            r8 = r23
            goto L_0x059a
        L_0x0579:
            r0 = move-exception
            r23 = r9
            r2 = r0
            r8 = 0
            r12 = 0
            goto L_0x0622
        L_0x0581:
            r0 = move-exception
            r23 = r9
            r2 = r0
            r8 = 0
            r12 = 0
            goto L_0x05ac
        L_0x0588:
            r0 = move-exception
            r23 = r9
            r2 = r0
            r8 = r23
            r12 = 0
        L_0x058f:
            r18 = 0
            goto L_0x0603
        L_0x0593:
            r0 = move-exception
            r23 = r9
            r2 = r0
            r8 = r23
            r12 = 0
        L_0x059a:
            r18 = 0
            goto L_0x061b
        L_0x059e:
            r0 = move-exception
            r2 = r0
            r8 = 0
            r12 = 0
            r23 = 0
            goto L_0x0622
        L_0x05a6:
            r0 = move-exception
            r2 = r0
            r8 = 0
            r12 = 0
            r23 = 0
        L_0x05ac:
            ith r3 = f     // Catch:{ all -> 0x05fa }
            java.lang.String r6 = "Binary diff upload failed, trying alternate uploader"
            r3.b((java.lang.String) r5, (java.lang.String) r6, (java.lang.Throwable) r2)     // Catch:{ all -> 0x05fa }
            kjn r2 = r1.d     // Catch:{ all -> 0x05fa }
            kjl r3 = r1.b     // Catch:{ all -> 0x05fa }
            lsm r5 = defpackage.lsm.a()     // Catch:{ all -> 0x05fa }
            lfp r6 = r1.l     // Catch:{ all -> 0x05fa }
            r7 = 0
            kjm r2 = r2.a(r3, r5, r6, r7)     // Catch:{ all -> 0x05fa }
            r3 = r28
            r5 = r29
            lnj r3 = r2.a(r3, r5, r4)     // Catch:{ all -> 0x05e8 }
            int r4 = r2.a()     // Catch:{ all -> 0x05fa }
            r1.e = r4     // Catch:{ all -> 0x05fa }
            java.util.List r4 = r1.p     // Catch:{ all -> 0x05fa }
            amzy r2 = r2.e()     // Catch:{ all -> 0x05fa }
            r4.addAll(r2)     // Catch:{ all -> 0x05fa }
            lfl r2 = r1.m
            r2.a()
            defpackage.jjt.a((java.io.Closeable) r8)
            defpackage.jjt.a((java.io.Closeable) r23)
            defpackage.jjt.a((java.io.Closeable) r12)
            return r3
        L_0x05e8:
            r0 = move-exception
            r3 = r0
            int r4 = r2.a()     // Catch:{ all -> 0x05fa }
            r1.e = r4     // Catch:{ all -> 0x05fa }
            java.util.List r4 = r1.p     // Catch:{ all -> 0x05fa }
            amzy r2 = r2.e()     // Catch:{ all -> 0x05fa }
            r4.addAll(r2)     // Catch:{ all -> 0x05fa }
            throw r3     // Catch:{ all -> 0x05fa }
        L_0x05fa:
            r0 = move-exception
            r2 = r0
            goto L_0x0622
        L_0x05fd:
            r0 = move-exception
            r2 = r0
            r8 = 0
            r12 = 0
            r18 = 0
        L_0x0603:
            ith r3 = f     // Catch:{ all -> 0x0612 }
            java.lang.String r4 = "Input stream verification failed"
            r3.b(r4)     // Catch:{ all -> 0x0612 }
            kjj r3 = new kjj     // Catch:{ all -> 0x0612 }
            java.lang.String r4 = "Upload exception"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0612 }
            throw r3     // Catch:{ all -> 0x0612 }
        L_0x0612:
            r0 = move-exception
            r2 = r0
            goto L_0x061e
        L_0x0615:
            r0 = move-exception
            r2 = r0
            r8 = 0
            r12 = 0
            r18 = 0
        L_0x061b:
            throw r2     // Catch:{ all -> 0x061c }
        L_0x061c:
            r0 = move-exception
            r2 = r0
        L_0x061e:
            r23 = r8
            r8 = r18
        L_0x0622:
            lfl r3 = r1.m
            r3.a()
            defpackage.jjt.a((java.io.Closeable) r8)
            defpackage.jjt.a((java.io.Closeable) r23)
            defpackage.jjt.a((java.io.Closeable) r12)
            goto L_0x0632
        L_0x0631:
            throw r2
        L_0x0632:
            goto L_0x0631
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjb.a(kjk, lic, com.google.android.gms.common.internal.ClientContext):lnj");
    }
}
