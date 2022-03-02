package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: akaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akaz {
    final WeakReference a;
    int b;
    boolean c;

    public akaz(int i, akaj akaj) {
        this.a = new WeakReference(akaj);
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(akaj akaj) {
        return akaj != null && this.a.get() == akaj;
    }
}
