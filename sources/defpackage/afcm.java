package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: afcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afcm implements afcg {
    private final List a;

    public afcm(List list) {
        this.a = list;
    }

    public final boolean a(Object obj, Object obj2) {
        return this.a.add(new Pair((byte[]) obj, (byte[]) obj2));
    }
}
