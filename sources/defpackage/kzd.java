package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: kzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzd extends lbf {
    public kzd(kyq kyq) {
        super(kyq, true, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.T();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.h = (String) obj;
        file.a.add(11);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.h((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        kns g = knl.g();
        if (!g.a()) {
            g.a((Object) kmp.T(), j);
        } else {
            g.a(j);
        }
    }
}
