package defpackage;

import android.content.pm.FeatureInfo;
import java.util.Comparator;

/* renamed from: jiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jiv implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((FeatureInfo) obj).name;
        String str2 = ((FeatureInfo) obj2).name;
        if (str != null) {
            return str.compareTo(str2);
        }
        return str2 == null ? 0 : -1;
    }
}
