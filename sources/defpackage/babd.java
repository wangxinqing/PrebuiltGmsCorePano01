package defpackage;

import java.util.Comparator;

/* renamed from: babd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babd implements Comparator {
    final /* synthetic */ babe a;

    public babd(babe babe) {
        this.a = babe;
    }

    public final int compare(Object obj, Object obj2) {
        int a2 = this.a.a(obj) - this.a.a(obj2);
        return a2 == 0 ? obj.getClass().getName().compareTo(obj2.getClass().getName()) : a2;
    }
}
