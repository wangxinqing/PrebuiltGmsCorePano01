package defpackage;

import android.content.Context;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;

/* renamed from: mrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mrr implements arxd {
    private final mrt a;

    public mrr(mrt mrt) {
        this.a = mrt;
    }

    public final void a(List list) {
        mrt mrt = this.a;
        jjg jjg = mte.a;
        list.size();
        if (mrt.b()) {
            mtc mtc = mrt.b;
            List a2 = mtc.a((List) mtc.b, list);
            mtc.a((List) mtc.c, list);
            mtc.a();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                String str = ((DiscoveryListItem) a2.get(i)).a;
                if (str != null) {
                    Context context = mtc.a;
                    context.startService(arza.b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_VIEWED").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str));
                }
            }
        }
    }
}
