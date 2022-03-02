package defpackage;

import java.util.Comparator;

/* renamed from: cik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cik implements Comparator {
    protected cik() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cij cij = (cij) obj;
        cij cij2 = (cij) obj2;
        if (cij.a.j().c() == cij2.a.j().c()) {
            return cij.c - cij2.c;
        }
        return ciq.a(cij.a.j().c(), cij2.a.j().c());
    }
}
