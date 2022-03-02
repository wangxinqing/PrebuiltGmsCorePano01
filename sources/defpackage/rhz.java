package defpackage;

import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.Comparator;

/* renamed from: rhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rhz implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return -Float.compare(((PlaceLikelihoodEntity) obj).b, ((PlaceLikelihoodEntity) obj2).b);
    }
}
