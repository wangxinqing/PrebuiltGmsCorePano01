package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: yqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqh implements icm {
    final /* synthetic */ yqq a;

    public yqh(yqq yqq) {
        this.a = yqq;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        ParcelFileDescriptor b;
        wlj wlj = (wlj) icl;
        if (wlj.aO().c() && this.a.e() != null && (b = wlj.b()) != null) {
            this.a.h = wlu.a(b);
            this.a.c();
        }
    }
}
