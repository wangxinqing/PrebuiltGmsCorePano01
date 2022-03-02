package defpackage;

import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.Comparator;
import java.util.List;

/* renamed from: mtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mtb implements Comparator {
    private final mtc a;

    public mtb(mtc mtc) {
        this.a = mtc;
    }

    public final int compare(Object obj, Object obj2) {
        mtc mtc = this.a;
        return mtc.a((List) mtc.b, (DiscoveryListItem) obj) - mtc.a((List) mtc.b, (DiscoveryListItem) obj2);
    }
}
