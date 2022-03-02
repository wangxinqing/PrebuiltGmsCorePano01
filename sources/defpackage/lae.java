package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: lae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lae extends lan {
    public lae(kyq kyq, lcv lcv) {
        super(kyq, true, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return Boolean.valueOf(kmp.Q());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
        if (file.v == null) {
            file.a(new File.Labels());
        }
        File.Labels labels = file.v;
        labels.c = bool.booleanValue();
        labels.a.add(4);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.b(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        kns f = knl.f();
        if (!f.a()) {
            f.a((Object) Boolean.valueOf(kmp.Q()), j);
        } else {
            f.a(j);
        }
    }
}
