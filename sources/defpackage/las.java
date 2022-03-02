package defpackage;

import com.google.android.gms.drive.internal.model.File;
import java.util.Date;

/* renamed from: las  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class las extends lay {
    public las(kyq kyq, lcv lcv) {
        super(kyq, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.D();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.B = kju.a((Date) obj);
        file.a.add(44);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.b((Date) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        lax.a(knl.p(), kmp.D(), j);
    }
}
