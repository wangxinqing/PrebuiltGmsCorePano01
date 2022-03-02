package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: kzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzk extends lan {
    public kzk(kyq kyq) {
        super(kyq, true, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return Boolean.valueOf(kmp.U());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
        if (file.v == null) {
            file.a(new File.Labels());
        }
        File.Labels labels = file.v;
        labels.e = bool.booleanValue();
        labels.a.add(6);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.d(((Boolean) obj).booleanValue());
    }

    /* access modifiers changed from: protected */
    public final void a(kmp kmp, knl knl, long j) {
        kns i = knl.i();
        if (!i.a()) {
            i.a((Object) Boolean.valueOf(kmp.U()), j);
        } else {
            i.a(j);
        }
    }
}
