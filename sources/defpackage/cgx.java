package defpackage;

import java.util.Comparator;

/* renamed from: cgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cgx implements Comparator {
    private final int a;

    public cgx(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        int[] iArr = cha.a;
        return -Float.compare(((cgy) obj).b(i), ((cgy) obj2).b(i));
    }
}
