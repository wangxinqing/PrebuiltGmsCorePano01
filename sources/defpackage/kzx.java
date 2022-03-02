package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: kzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzx extends lan {
    public kzx(kyq kyq) {
        super(kyq, false, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return Boolean.valueOf(kmp.Y());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.Y = ((Boolean) obj).booleanValue();
        file.a.add(79);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.f(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        kns n = knl.n();
        if (!n.a()) {
            n.a((Object) Boolean.valueOf(kmp.Y()), j);
        } else {
            n.a(j);
        }
    }
}
