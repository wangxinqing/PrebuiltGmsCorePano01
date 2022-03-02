package defpackage;

import java.util.Comparator;

/* renamed from: augh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class augh implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aubn aubn = (aubn) obj;
        aubn aubn2 = (aubn) obj2;
        augi.b(aubn);
        augi.b(aubn2);
        long j = aubn.a;
        long j2 = aubn2.a;
        return j == j2 ? Integer.compare(aubn.b, aubn2.b) : (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
