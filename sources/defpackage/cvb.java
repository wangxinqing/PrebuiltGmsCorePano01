package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: cvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cvb implements Callable {
    private final cvk a;

    public cvb(cvk cvk) {
        this.a = cvk;
    }

    public final Object call() {
        cvk cvk = this.a;
        HashMap hashMap = new HashMap();
        cvk.a(cvk.c, System.currentTimeMillis(), (Map) hashMap, cvk.f);
        return amzy.a(hashMap.values());
    }
}
