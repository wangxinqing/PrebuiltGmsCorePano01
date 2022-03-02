package defpackage;

import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.Comparator;

/* renamed from: akus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akus implements Comparator {
    static final Comparator a = new akus();

    private akus() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((HierarchicalPlaceLikelihoodEntity) obj2).c, ((HierarchicalPlaceLikelihoodEntity) obj).c);
    }
}
