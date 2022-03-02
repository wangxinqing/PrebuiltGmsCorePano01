package defpackage;

import android.content.Context;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mtc {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public mrq d;

    public mtc(Context context) {
        this.a = context;
    }

    public static final int a(List list, DiscoveryListItem discoveryListItem) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            DiscoveryListItem discoveryListItem2 = (DiscoveryListItem) list.get(i);
            i++;
            if (discoveryListItem2.a.equals(discoveryListItem.a)) {
                return list.indexOf(discoveryListItem2);
            }
        }
        return -1;
    }

    public final void a() {
        mrq mrq = this.d;
        if (mrq != null) {
            ArrayList arrayList = this.b;
            mrk mrk = mrq.a.a;
            mrk.e.clear();
            mrk.e.addAll(arrayList);
            mrk.c();
            mrk.as();
        }
    }

    public static final List a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            DiscoveryListItem discoveryListItem = (DiscoveryListItem) list2.get(i);
            int size2 = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    list.add(discoveryListItem);
                    arrayList.add(discoveryListItem);
                    break;
                }
                int i3 = i2 + 1;
                if (((DiscoveryListItem) list.get(i2)).a.equals(discoveryListItem.a)) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }
}
