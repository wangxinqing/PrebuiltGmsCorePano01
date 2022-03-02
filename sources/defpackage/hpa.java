package defpackage;

import com.google.android.gms.phenotype.GenericDimension;
import java.util.Arrays;

/* renamed from: hpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpa implements Comparable {
    public final GenericDimension[] a;
    public final byte[] b;

    public hpa(GenericDimension[] genericDimensionArr, byte[] bArr) {
        this.a = genericDimensionArr == null ? hph.a.a : genericDimensionArr;
        this.b = bArr == null ? hph.a.b : bArr;
        Arrays.sort(this.a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hpa hpa = (hpa) obj;
        int compare = hph.o.compare(this.a, hpa.a);
        return compare == 0 ? hph.n.compare(this.b, hpa.b) : compare;
    }
}
