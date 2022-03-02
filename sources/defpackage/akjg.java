package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: akjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akjg implements Runnable {
    private final akjj a;
    private final akln b;
    private final List c;
    private final akmd d;

    public akjg(akjj akjj, akln akln, List list, akmd akmd) {
        this.a = akjj;
        this.b = akln;
        this.c = list;
        this.d = akmd;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        List list;
        akjj akjj = this.a;
        akln akln = this.b;
        List list2 = this.c;
        akmd akmd = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        akjm akjm = akjj.a;
        ArrayList arrayList = new ArrayList();
        String l = azbz.a.a().l();
        List asList = l.length() > 0 ? Arrays.asList(l.split(",")) : Collections.emptyList();
        List list3 = akjm.a;
        int size = list3.size();
        for (int i4 = 0; i4 < size; i4++) {
            akmu akmu = (akmu) list3.get(i4);
            if (asList.contains(akmu.a())) {
                aklz.a();
                String valueOf = String.valueOf(akmu.a());
                if (valueOf.length() == 0) {
                    new String("Module is blacklisted: ");
                } else {
                    "Module is blacklisted: ".concat(valueOf);
                }
            } else {
                akmy a2 = akmu.a(akln, list2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
            i3 = 1;
            i2 = 1;
            i = 0;
        } else if (akmd != null) {
            List a3 = akjm.c.a(akmd, arrayList);
            int i5 = akmd.f;
            i = akmd.e;
            list = a3;
            i2 = i5;
            i3 = 0;
        } else {
            list = Collections.emptyList();
            i3 = 3;
            i2 = 1;
            i = 0;
        }
        akhy a4 = akhy.a(list, SystemClock.elapsedRealtime(), akjm.b, i3, akln.f, false, i2, i, (aklr) null);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        int size2 = list2.size();
        if (size2 > 0) {
            aklz.a();
            double d2 = (double) elapsedRealtime2;
            double d3 = (double) size2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            akjj.a(String.format("Inference computation on %d candidates: %d millis (%.3f millis/candidate)", new Object[]{Integer.valueOf(size2), Long.valueOf(elapsedRealtime2), Double.valueOf(d2 / d3)}));
        }
        akjj.a(a4);
    }
}
