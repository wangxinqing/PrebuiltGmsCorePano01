package defpackage;

import com.google.android.gms.phenotype.Flag;
import java.util.Comparator;

/* renamed from: ydz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydz implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Flag flag = (Flag) obj;
        Flag flag2 = (Flag) obj2;
        int i = flag.h;
        int i2 = flag2.h;
        return i == i2 ? flag.a.compareTo(flag2.a) : i - i2;
    }
}
