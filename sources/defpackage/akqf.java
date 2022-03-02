package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: akqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqf implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akqj b;
    final /* synthetic */ akpw c;

    public akqf(akqj akqj, Collection collection, akpw akpw) {
        this.b = akqj;
        this.a = collection;
        this.c = akpw;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.util.Collection] */
    public final void run() {
        akqj akqj = this.b;
        ? r1 = this.a;
        akpw akpw = this.c;
        if (akqj.c != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                akqm akqm = (akqm) r1.get(i);
                List list = (List) akqj.c.a(akqm);
                if (list != null) {
                    hashMap.put(akqm, list);
                } else {
                    arrayList.add(akqm);
                }
            }
            akqj.b.execute(new akqg(akpw, hashMap, arrayList));
        }
    }
}
