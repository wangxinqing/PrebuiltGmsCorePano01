package defpackage;

import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: opw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opw {
    static void a(NativeIndex nativeIndex, otw otw, pxh pxh, opv opv) {
        if (!NativeIndex.nativeAddUsageReport(nativeIndex.b, otw.k())) {
            opv.b++;
            pxh.a("failed usage report");
            return;
        }
        opv.a++;
        pxh.a("usage report");
    }
}
