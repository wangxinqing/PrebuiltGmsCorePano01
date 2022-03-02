package defpackage;

import java.util.ArrayList;

/* renamed from: bahk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahk implements Runnable {
    final /* synthetic */ babj a;
    final /* synthetic */ bahv b;

    public bahk(bahv bahv, babj babj) {
        this.b = bahv;
        this.a = babj;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList(this.b.j);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bajo) arrayList.get(i)).b(this.a);
        }
    }
}
