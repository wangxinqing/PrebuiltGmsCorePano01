package defpackage;

import java.util.Comparator;

/* renamed from: odq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odq implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        okz okz = (okz) obj2;
        aufd aufd = ((okz) obj).c;
        if (aufd == null) {
            aufd = aufd.b;
        }
        Long valueOf = Long.valueOf(aufd.a);
        aufd aufd2 = okz.c;
        if (aufd2 == null) {
            aufd2 = aufd.b;
        }
        return valueOf.compareTo(Long.valueOf(aufd2.a));
    }
}
