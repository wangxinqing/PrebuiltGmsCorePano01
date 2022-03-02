package defpackage;

import java.util.Comparator;

/* renamed from: arvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arvw implements Comparator {
    public static final Comparator a = new arvw();

    private arvw() {
    }

    public final int compare(Object obj, Object obj2) {
        return Double.compare(((arvr) obj).b, ((arvr) obj2).b);
    }
}
