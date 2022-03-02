package defpackage;

import com.google.android.gms.common.stats.GmsCoreStatsChimeraService;
import java.util.Comparator;

/* renamed from: jch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class jch implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return (GmsCoreStatsChimeraService.a((aoid) obj) > GmsCoreStatsChimeraService.a((aoid) obj2) ? 1 : (GmsCoreStatsChimeraService.a((aoid) obj) == GmsCoreStatsChimeraService.a((aoid) obj2) ? 0 : -1));
    }
}
