package defpackage;

import java.util.Comparator;

/* renamed from: tta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tta implements Comparator {
    public static final Comparator a = new tta();

    private tta() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((ual) obj2).j > ((ual) obj).j ? 1 : (((ual) obj2).j == ((ual) obj).j ? 0 : -1));
    }
}
