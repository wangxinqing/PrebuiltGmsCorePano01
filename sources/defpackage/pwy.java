package defpackage;

import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.Comparator;

/* renamed from: pwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pwy implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((UsageInfo) obj).b;
        long j2 = ((UsageInfo) obj2).b;
        if (j <= j2) {
            return j >= j2 ? 0 : 1;
        }
        return -1;
    }
}
