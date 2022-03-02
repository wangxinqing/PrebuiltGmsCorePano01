package com.google.android.gms.icing.nativeindex;

import android.util.SparseIntArray;
import com.android.volley.toolbox.ImageRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NativeIndex {
    public static final boolean a;
    public long b;

    static {
        boolean z = false;
        try {
            System.loadLibrary("AppDataSearch");
            int nativeGetVersionCode = nativeGetVersionCode() / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
            if (nativeGetVersionCode == 201216) {
                z = true;
                a = z;
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Version mismatch: lib: ");
            sb.append(nativeGetVersionCode);
            sb.append(" vs apk: ");
            sb.append(201216);
            throw new UnsatisfiedLinkError(sb.toString());
        } catch (LinkageError e) {
            oso.b((Throwable) e, "Native load error: %s", e.getMessage());
        }
    }

    public NativeIndex(File file, otu otu) {
        if (!file.exists()) {
            file.mkdir();
        }
        this.b = nativeCreate(a(file.getCanonicalPath()), otu.k());
    }

    public static int a(double d) {
        return Math.max((int) Math.round(d * 255.0d), 1);
    }

    private static final oup b(byte[] bArr) {
        try {
            return (oup) aucj.a((aucj) oup.q, bArr, aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing query response");
            return null;
        }
    }

    private static native boolean nativeAddCorpus(long j, long j2, int i, byte[] bArr);

    private static native void nativeAddPendingDeleteUsageReport(long j, long j2, byte[] bArr, int i, int i2);

    public static native boolean nativeAddUsageReport(long j, byte[] bArr);

    private static native int nativeAdvanceLastSeqno(long j, int i, long j2);

    private static native boolean nativeApplyPendingDeleteUsageReports(long j);

    public static native boolean nativeClear(long j);

    public static native boolean nativeClearUsageReportData(long j);

    public static native boolean nativeClearUsageReportDataForIdAndUri(long j, long j2, byte[] bArr);

    private static native void nativeCommit(long j);

    private static native byte[] nativeCompact(long j, double d, int i, byte[] bArr, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3);

    public static native boolean nativeCopyIndexToDirectory(long j, String str, byte[] bArr);

    private static native long nativeCreate(byte[] bArr, byte[] bArr2);

    public static native boolean nativeDeleteCorpus(long j, int i);

    private static native int nativeDeleteDocument(long j, long j2, int i, byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native byte[] nativeExecuteQuery(long j, byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void nativeFlush(long j);

    private static native byte[] nativeGetCompactStatus(long j);

    public static native long nativeGetCorpusDocumentsSize(long j, int i);

    public static native byte[] nativeGetDebugInfo(long j, int i);

    private static native long nativeGetDiskUsage(byte[] bArr);

    private static native byte[] nativeGetDocuments(long j, byte[][] bArr, byte[] bArr2);

    private static native long nativeGetLastSeqno(long j, int i, boolean z);

    public static native int[] nativeGetPhraseAffinityScores(long j, byte[] bArr);

    public static native byte[] nativeGetStatus(long j, boolean z);

    public static native byte[] nativeGetStorageState(long j);

    private static native byte[] nativeGetUsageStats(long j);

    private static native int nativeGetVersionCode();

    private static native byte[] nativeIndexDocument(long j, long j2, byte[] bArr, byte[] bArr2);

    private static native byte[] nativeIndexThing(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native byte[] nativeInit(long j);

    private static native double nativeMinFreeFraction(long j);

    private static native int nativeNumDocuments(long j);

    private static native int nativeNumPostingLists(long j);

    public static native void nativeOnMaintenance(long j, boolean z);

    public static native void nativeOnSleep(long j);

    private static native byte[] nativePatch(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private static native boolean nativeRebuildIndex(long j, byte[] bArr);

    public static native byte[] nativeRestoreIndex(long j, byte[] bArr);

    public static native byte[] nativeSuggest(long j, byte[] bArr, int[] iArr, int i);

    public static native int nativeTagDocument(long j, long j2, int i, byte[] bArr, byte[] bArr2, int i2, boolean z);

    private static native boolean nativeUpdateNativeConfig(long j, byte[] bArr);

    public static native boolean nativeUpgrade(long j, int i, int i2);

    public final void c() {
        nativeCommit(this.b);
    }

    public final anth d() {
        try {
            return (anth) aucj.a((aucj) anth.d, nativeGetCompactStatus(this.b), aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing compact status");
            return null;
        }
    }

    public final int e() {
        return nativeNumDocuments(this.b);
    }

    public final int f() {
        return nativeNumPostingLists(this.b);
    }

    public final void finalize() {
        b();
        super.finalize();
    }

    public final double g() {
        return nativeMinFreeFraction(this.b);
    }

    public final ove h() {
        byte[] nativeGetUsageStats = nativeGetUsageStats(this.b);
        if (nativeGetUsageStats == null) {
            return null;
        }
        try {
            return (ove) aucj.a((aucj) ove.b, nativeGetUsageStats, aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing usage stats");
            return null;
        }
    }

    public final boolean i() {
        return nativeApplyPendingDeleteUsageReports(this.b);
    }

    public static long a(File file) {
        if (!a) {
            return -1;
        }
        try {
            oso.a("getDiskUsage: %s", (Object) file.getCanonicalPath());
            return nativeGetDiskUsage(a(file.getCanonicalPath()));
        } catch (IOException e) {
            oso.b((Throwable) e, "Bad path: %s", file);
            return -1;
        }
    }

    public static aond a(int i) {
        return (aond) amrh.a(aond.a(i), aond.UNRECOGNIZED);
    }

    public final aojr b(long j, byte[] bArr, plf plf, osz osz, otr otr) {
        try {
            return (aojr) aucj.a((aucj) aojr.d, nativePatch(this.b, j, bArr, plf.k(), osz.k(), otr.k()), aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed to parse native index document stats.");
            return null;
        }
    }

    public static String a(aond aond) {
        aond aond2 = aond.OK;
        int ordinal = aond.ordinal();
        if (ordinal == 0) {
            return "ok";
        }
        if (ordinal == 1 || ordinal == 2) {
            return "ok trimmed";
        }
        if (ordinal == 3) {
            return "ok duplicate uri replaced";
        }
        if (ordinal == 4) {
            return "ok modified";
        }
        if (ordinal == 6) {
            return "error uri not found";
        }
        if (ordinal == 7) {
            return "error i/o";
        }
        int a2 = aond.a();
        StringBuilder sb = new StringBuilder(26);
        sb.append("error internal ");
        sb.append(a2);
        return sb.toString();
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("UTF-8 not supported");
        }
    }

    public final long a(int i, boolean z) {
        return nativeGetLastSeqno(this.b, i, z);
    }

    public final void b() {
        long j = this.b;
        if (j != 0) {
            nativeDestroy(j);
        }
        this.b = 0;
    }

    public final antj a(double d, int i, otr otr, long[] jArr, int[] iArr, SparseIntArray sparseIntArray) {
        SparseIntArray sparseIntArray2 = sparseIntArray;
        int[] iArr2 = new int[sparseIntArray.size()];
        int[] iArr3 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            iArr2[i2] = sparseIntArray2.keyAt(i2);
            iArr3[i2] = sparseIntArray2.valueAt(i2);
        }
        try {
            return (antj) aucj.a((aucj) antj.d, nativeCompact(this.b, d, i, otr.k(), jArr, iArr, iArr2, iArr3), aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing compaction stats");
            aucd o = antj.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((antj) o.b).b = 18;
            return (antj) o.i();
        }
    }

    public final aojr a(long j, oqo oqo, otr otr) {
        try {
            return (aojr) aucj.a((aucj) aojr.d, nativeIndexDocument(this.b, j, oqo.k(), otr.k()), aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed to parse native index document stats.");
            return null;
        }
    }

    public final aojr a(long j, byte[] bArr, plf plf, osz osz, otr otr) {
        try {
            return (aojr) aucj.a((aucj) aojr.d, nativeIndexThing(this.b, j, bArr, plf.k(), osz.k(), otr.k()), aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed to parse native index document stats.");
            return null;
        }
    }

    public final aond a(int i, long j) {
        return a(nativeAdvanceLastSeqno(this.b, i, j));
    }

    public final aond a(long j, int i, String str) {
        return a(nativeDeleteDocument(this.b, j, i, a(str)));
    }

    public final oti a(byte[] bArr) {
        try {
            return (oti) aucj.a((aucj) oti.d, bArr, aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing document store status");
            return null;
        }
    }

    public final ots a() {
        byte[] nativeInit = nativeInit(this.b);
        if (nativeInit == null) {
            return null;
        }
        try {
            return (ots) aucj.a((aucj) ots.d, nativeInit, aubs.c());
        } catch (auda e) {
            oso.a((Throwable) e, "Failed parsing init status");
            return null;
        }
    }

    public final oup a(String str, oul oul, int i, int i2) {
        return b(nativeExecuteQuery(this.b, a(str), oul.k(), 100000, i, i2));
    }

    public final oup a(String[] strArr, oul oul) {
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = a(strArr[i]);
            i++;
            i2++;
        }
        return b(nativeGetDocuments(this.b, bArr, oul.k()));
    }

    public final void a(long j, int i, int i2) {
        nativeAddPendingDeleteUsageReport(this.b, j, a(""), i, i2);
    }

    public final boolean a(long j, int i, oto oto) {
        return nativeAddCorpus(this.b, j, i, oto.k());
    }

    public final boolean a(otr otr) {
        return nativeRebuildIndex(this.b, otr.k());
    }

    public final boolean a(otu otu) {
        return nativeUpdateNativeConfig(this.b, otu.k());
    }
}
