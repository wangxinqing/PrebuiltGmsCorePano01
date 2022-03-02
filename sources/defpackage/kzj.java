package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: kzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzj extends lbf {
    public kzj(kyq kyq) {
        super(kyq, false, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.u();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.p = (String) obj;
        file.a.add(24);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.c((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        kns b = knl.b();
        if (b.a()) {
            b.a(j);
        } else {
            b.a((Object) kmp.u(), j);
        }
    }
}
