package defpackage;

import java.util.Comparator;

/* renamed from: arpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arpo implements Comparator {
    static final Comparator a = new arpo();

    private arpo() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((arpu) obj2).f, ((arpu) obj).f);
    }
}
