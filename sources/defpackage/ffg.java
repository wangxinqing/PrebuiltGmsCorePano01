package defpackage;

import java.util.List;

/* renamed from: ffg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ffg implements ax {
    private final ffi a;

    public ffg(ffi ffi) {
        this.a = ffi;
    }

    public final void a(Object obj) {
        ffi ffi = this.a;
        ffi.d.a((List) obj);
        ffi.c.getViewTreeObserver().addOnGlobalLayoutListener(new ffh(ffi));
    }
}
