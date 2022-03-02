package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: akqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqh implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akqk b;
    final /* synthetic */ akqj c;

    public akqh(akqj akqj, Collection collection, akqk akqk) {
        this.c = akqj;
        this.a = collection;
        this.b = akqk;
    }

    public final void run() {
        akqj akqj = this.c;
        Collection<String> collection = this.a;
        akqk akqk = this.b;
        if (akqj.d != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String str : collection) {
                akrb akrb = (akrb) akqj.d.a(str);
                if (akrb != null) {
                    hashMap.put(str, akrb);
                } else {
                    arrayList.add(str);
                }
            }
            akqj.b.execute(new akqi(akqk, hashMap, arrayList));
        }
    }
}
