package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: laj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class laj extends lan {
    public laj(kyq kyq) {
        super(kyq, true, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        kpd aa = kmp.aa();
        boolean z = true;
        if (!aa.b() && !aa.c()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.a(!((Boolean) obj).booleanValue() ? kpd.UNPINNED : kpd.PINNED_ACTIVE);
    }
}
