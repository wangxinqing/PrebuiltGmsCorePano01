package defpackage;

import com.google.android.gms.drive.query.internal.Operator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lis implements ljf {
    public final /* bridge */ /* synthetic */ Object a() {
        return Collections.singleton(lce.G);
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return Collections.emptySet();
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        iva.a((Object) list);
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.addAll((Set) list.get(i));
        }
        return hashSet;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        return Collections.singleton(kyq);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return (Set) obj;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return new ob((Collection) Arrays.asList(new kyq[]{lce.Q, lce.c}));
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        return Collections.singleton(kym);
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        return Collections.singleton(kyq);
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        return Collections.singleton(kyq);
    }
}
