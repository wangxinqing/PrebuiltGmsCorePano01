package defpackage;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: lah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lah extends lan {
    public lah(kyq kyq) {
        super(kyq, true, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return Boolean.valueOf(kmp.B());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        file.j = ((Boolean) obj).booleanValue();
        file.a.add(14);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        kmp.a(((Boolean) obj).booleanValue());
    }
}
