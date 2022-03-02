package defpackage;

import java.util.Comparator;

/* renamed from: aijr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijr implements Comparator {
    private final double a;

    public aijr(double d) {
        this.a = d;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((aijt) obj).a(this.a) - ((aijt) obj2).a(this.a);
    }
}
