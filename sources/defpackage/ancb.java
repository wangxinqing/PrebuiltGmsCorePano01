package defpackage;

import java.util.Comparator;

/* renamed from: ancb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancb implements Comparator {
    final /* synthetic */ Comparator a;

    public ancb(Comparator comparator) {
        this.a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((ancd) obj).a(), ((ancd) obj2).a());
    }
}
