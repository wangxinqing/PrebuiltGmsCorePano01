package defpackage;

import java.util.ArrayList;

/* renamed from: aaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaa implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ aai b;

    public aaa(aai aai, ArrayList arrayList) {
        this.b = aai;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.b.c((adl) arrayList.get(i));
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
