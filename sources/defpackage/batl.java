package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: batl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batl implements baua {
    private int a = 0;
    private final batf b;
    private final Inflater c;
    private final batm d;
    private final CRC32 e = new CRC32();

    public batl(baua baua) {
        if (baua != null) {
            this.c = new Inflater(true);
            this.b = batq.a(baua);
            this.d = new batm(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private final void a(batd batd, long j, long j2) {
        batw batw = batd.a;
        while (true) {
            long j3 = (long) (batw.c - batw.b);
            if (j < j3) {
                break;
            }
            j -= j3;
            batw = batw.f;
        }
        while (j2 > 0) {
            int i = (int) (((long) batw.b) + j);
            int min = (int) Math.min((long) (batw.c - i), j2);
            this.e.update(batw.a, i, min);
            j2 -= (long) min;
            batw = batw.f;
            j = 0;
        }
    }

    public final bauc bu() {
        return this.b.bu();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        if (r0 == 2) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c(defpackage.batd r20, long r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r8 = r21
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0175
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0174
            int r0 = r6.a
            r10 = -1
            r12 = 1
            if (r0 != 0) goto L_0x011e
            batf r0 = r6.b
            r1 = 10
            r0.a((long) r1)
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r0 = r0.a
            r1 = 3
            byte r13 = r0.c((long) r1)
            int r0 = r13 >> 1
            r14 = r0 & 1
            if (r14 == 0) goto L_0x003f
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r1 = r0.a
            r2 = 0
            r4 = 10
            r0 = r19
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
        L_0x003f:
            r0 = 8075(0x1f8b, float:1.1315E-41)
            batf r1 = r6.b
            short r1 = r1.f()
            java.lang.String r2 = "ID1ID2"
            a((java.lang.String) r2, (int) r0, (int) r1)
            batf r0 = r6.b
            r1 = 8
            r0.h(r1)
            int r0 = r13 >> 2
            r0 = r0 & r12
            r4 = 2
            if (r0 == r12) goto L_0x005b
            goto L_0x009a
        L_0x005b:
            batf r0 = r6.b
            r0.a((long) r4)
            if (r14 == 0) goto L_0x0072
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r1 = r0.a
            r2 = 0
            r15 = 2
            r0 = r19
            r4 = r15
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
        L_0x0072:
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r0 = r0.a
            short r0 = r0.h()
            long r4 = (long) r0
            batf r0 = r6.b
            r0.a((long) r4)
            if (r14 == 0) goto L_0x0093
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r1 = r0.a
            r2 = 0
            r0 = r19
            r15 = r4
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
            goto L_0x0094
        L_0x0093:
            r15 = r4
        L_0x0094:
            batf r0 = r6.b
            r1 = r15
            r0.h(r1)
        L_0x009a:
            int r0 = r13 >> 3
            r0 = r0 & r12
            r15 = 1
            if (r0 != r12) goto L_0x00ca
            batf r0 = r6.b
            long r17 = r0.q()
            int r0 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            if (r14 == 0) goto L_0x00bc
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r1 = r0.a
            r2 = 0
            long r4 = r17 + r15
            r0 = r19
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
        L_0x00bc:
            batf r0 = r6.b
            long r1 = r17 + r15
            r0.h(r1)
            goto L_0x00ca
        L_0x00c4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x00ca:
            int r0 = r13 >> 4
            r0 = r0 & r12
            if (r0 != r12) goto L_0x00f8
            batf r0 = r6.b
            long r17 = r0.q()
            int r0 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            if (r14 == 0) goto L_0x00ea
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            batd r1 = r0.a
            r2 = 0
            long r4 = r17 + r15
            r0 = r19
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
        L_0x00ea:
            batf r0 = r6.b
            long r1 = r17 + r15
            r0.h(r1)
            goto L_0x00f8
        L_0x00f2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x00f8:
            if (r14 == 0) goto L_0x011b
            batf r0 = r6.b
            batv r0 = (defpackage.batv) r0
            r1 = 2
            r0.a((long) r1)
            batd r0 = r0.a
            short r0 = r0.h()
            java.util.zip.CRC32 r1 = r6.e
            long r1 = r1.getValue()
            int r2 = (int) r1
            short r1 = (short) r2
            java.lang.String r2 = "FHCRC"
            a((java.lang.String) r2, (int) r0, (int) r1)
            java.util.zip.CRC32 r0 = r6.e
            r0.reset()
        L_0x011b:
            r6.a = r12
            r0 = 1
        L_0x011e:
            r1 = 2
            if (r0 != r12) goto L_0x0139
            long r2 = r7.b
            batm r0 = r6.d
            long r8 = r0.c(r7, r8)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0130
            r6.a = r1
            goto L_0x013b
        L_0x0130:
            r0 = r19
            r1 = r20
            r4 = r8
            r0.a((defpackage.batd) r1, (long) r2, (long) r4)
            return r8
        L_0x0139:
            if (r0 != r1) goto L_0x0173
        L_0x013b:
            batf r0 = r6.b
            int r0 = r0.i()
            java.util.zip.CRC32 r1 = r6.e
            long r1 = r1.getValue()
            int r2 = (int) r1
            java.lang.String r1 = "CRC"
            a((java.lang.String) r1, (int) r0, (int) r2)
            batf r0 = r6.b
            int r0 = r0.i()
            java.util.zip.Inflater r1 = r6.c
            long r1 = r1.getBytesWritten()
            int r2 = (int) r1
            java.lang.String r1 = "ISIZE"
            a((java.lang.String) r1, (int) r0, (int) r2)
            r0 = 3
            r6.a = r0
            batf r0 = r6.b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x016b
            goto L_0x0173
        L_0x016b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "gzip finished without exhausting source"
            r0.<init>(r1)
            throw r0
        L_0x0173:
            return r10
        L_0x0174:
            return r0
        L_0x0175:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 35
            r1.<init>(r2)
            java.lang.String r2 = "byteCount < 0: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.batl.c(batd, long):long");
    }

    public final void close() {
        this.d.close();
    }

    private static final void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
