package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: afcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afcl implements afcg {
    private final List a;

    public afcl(List list) {
        this.a = list;
    }

    public final boolean a(Object obj, Object obj2) {
        return this.a.add(new Pair(obj, obj2));
    }
}
