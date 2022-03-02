package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ajcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajcn implements airs {
    final /* synthetic */ long[] a;
    final /* synthetic */ long[] b;
    final /* synthetic */ ajcp c;
    final /* synthetic */ aipp d;

    public ajcn(ajcp ajcp, long[] jArr, long[] jArr2, aipp aipp) {
        this.c = ajcp;
        this.a = jArr;
        this.b = jArr2;
        this.d = aipp;
    }

    public final void a(aizy aizy, aqek aqek) {
        boolean z;
        HashMap hashMap = new HashMap(this.a.length);
        HashMap hashMap2 = new HashMap(this.b.length);
        ArrayList arrayList = new ArrayList(this.b.length);
        boolean a2 = this.c.a(this.a, hashMap, this.b, hashMap2, arrayList, System.currentTimeMillis(), SystemClock.elapsedRealtime());
        int size = hashMap.size();
        int size2 = hashMap2.size();
        int size3 = arrayList.size();
        StringBuilder sb = new StringBuilder(191);
        sb.append("Returning post-GLS cache results, wifi success count is ");
        sb.append(size);
        sb.append(" Gls query might bring more wifi models, consulting GLS : ");
        sb.append(a2);
        sb.append(", cell success is ");
        sb.append(size2);
        sb.append(", cell cache miss is ");
        sb.append(size3);
        sb.toString();
        if (aqek != null) {
            z = true;
        } else {
            z = false;
        }
        this.d.a(z, hashMap, hashMap2);
    }
}
