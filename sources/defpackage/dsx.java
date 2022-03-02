package defpackage;

import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsx {
    private final int[] a = new int[dtb.a()];
    private final ArrayList b = new ArrayList();

    public final GlobalSearchCorpusConfig a() {
        int[] iArr = this.a;
        ArrayList arrayList = this.b;
        return new GlobalSearchCorpusConfig(iArr, (Feature[]) arrayList.toArray(new Feature[arrayList.size()]));
    }

    public final void a(String str, int i) {
        this.a[dtb.a(str)] = i;
    }

    public final void a(Feature... featureArr) {
        for (Feature a2 : featureArr) {
            Feature.a((List) this.b, a2);
        }
    }
}
