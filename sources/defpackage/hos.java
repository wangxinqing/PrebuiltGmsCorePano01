package defpackage;

import com.google.android.gms.phenotype.GenericDimension;
import java.util.Comparator;

/* renamed from: hos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hos implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        GenericDimension[] genericDimensionArr = (GenericDimension[]) obj;
        GenericDimension[] genericDimensionArr2 = (GenericDimension[]) obj2;
        int min = Math.min(genericDimensionArr.length, genericDimensionArr2.length);
        for (int i = 0; i < min; i++) {
            if (!genericDimensionArr[i].equals(genericDimensionArr2[i])) {
                return genericDimensionArr[i].compareTo(genericDimensionArr2[i]);
            }
        }
        return genericDimensionArr.length - genericDimensionArr2.length;
    }
}
