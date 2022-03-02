package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: acwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acwn implements acvf {
    final /* synthetic */ Collection a;

    public acwn(Collection collection) {
        this.a = collection;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        ArrayList arrayList = new ArrayList();
        for (acwa d : this.a) {
            arrayList.add(d.d());
        }
        return arrayList;
    }
}
