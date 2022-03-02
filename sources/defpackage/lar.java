package defpackage;

import com.google.android.gms.drive.internal.model.File;
import java.util.Date;

/* renamed from: lar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lar extends lay {
    public lar(kyq kyq, lcv lcv) {
        super(kyq, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.C();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.C = kju.a((Date) obj);
        file.a.add(45);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.a((Date) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        lax.a(knl.o(), kmp.C(), j);
    }
}
