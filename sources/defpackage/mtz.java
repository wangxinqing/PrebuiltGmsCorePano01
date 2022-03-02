package defpackage;

import java.util.Comparator;

/* renamed from: mtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mtz implements Comparator {
    private final muc a;

    public mtz(muc muc) {
        this.a = muc;
    }

    public final int compare(Object obj, Object obj2) {
        muc muc = this.a;
        return muc.a(((olz) obj).b).compareTo(muc.a(((olz) obj2).b));
    }
}
