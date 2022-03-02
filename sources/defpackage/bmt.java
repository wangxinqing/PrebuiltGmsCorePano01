package defpackage;

import android.content.UriMatcher;
import java.util.Comparator;

/* renamed from: bmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bmt implements Comparator {
    static final Comparator a = new bmt();

    private bmt() {
    }

    public final int compare(Object obj, Object obj2) {
        bpa bpa = (bpa) obj;
        bpa bpa2 = (bpa) obj2;
        UriMatcher uriMatcher = bmv.a;
        return amya.b.a(bpa.S(), bpa2.S()).a((Comparable) bpa.c(), (Comparable) bpa2.c()).a();
    }
}
