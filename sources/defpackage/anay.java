package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: anay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anay implements Comparator {
    final /* synthetic */ Comparator a;

    public anay(Comparator comparator) {
        this.a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((Map.Entry) obj).getKey(), ((Map.Entry) obj2).getKey());
    }
}
