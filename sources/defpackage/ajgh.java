package defpackage;

import java.util.Comparator;

/* renamed from: ajgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajgh implements Comparator {
    static final Comparator a = new ajgh();

    private ajgh() {
    }

    public final int compare(Object obj, Object obj2) {
        return -(((ajgm) obj).a.a > ((ajgm) obj2).a.a ? 1 : (((ajgm) obj).a.a == ((ajgm) obj2).a.a ? 0 : -1));
    }
}
