package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: hwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwc {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private long d = 0;

    public hwc(Context context) {
        if (awtr.a.a().y()) {
            iby a2 = znu.a(context);
            iha b2 = ihb.b();
            b2.a = znx.a;
            b2.b = new Feature[]{zns.a};
            try {
                this.d = ((Long) acws.a(a2.a(b2.a()), awso.a.a().c(), TimeUnit.MILLISECONDS)).longValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("BatchedLogRequestWrap", "Failed to get last time zwieback is reset.", e);
            }
        }
    }

    public final hux a(int i) {
        return (hux) this.a.get(i);
    }

    public final int b() {
        return this.b.size();
    }

    public final long c() {
        if (!this.b.isEmpty()) {
            return ((avrr) this.b.get(0)).c;
        }
        return 0;
    }

    public final void e() {
        String str;
        List list = this.b;
        int size = list.size();
        String str2 = "";
        for (int i = 0; i < size; i++) {
            avrr avrr = (avrr) list.get(i);
            String valueOf = String.valueOf(str2);
            if (avrr.f.isEmpty()) {
                avrp a2 = avrp.a(avrr.e);
                if (a2 == null) {
                    a2 = avrp.UNKNOWN;
                }
                str = Integer.toString(a2.yv);
            } else {
                str = avrr.f;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            sb.append(",");
            str2 = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(this.b.size()), str2};
    }

    public final void a(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            for (avrr avrr : this.b) {
                aucd aucd = (aucd) avrr.c(5);
                aucd.a((aucj) avrr);
                aucf aucf = (aucf) aucd;
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                avrr avrr2 = (avrr) aucf.b;
                avrr avrr3 = avrr.q;
                int i = avrr2.a | 2;
                avrr2.a = i;
                avrr2.c = j;
                avrr2.a = i | 1;
                avrr2.b = j2;
                arrayList.add((avrr) aucf.i());
            }
            this.b.clear();
            this.b.addAll(arrayList);
        }
    }

    public final byte[] d() {
        aucd o = avrd.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avrd avrd = (avrd) o.b;
        int i = avrd.a | 1;
        avrd.a = i;
        avrd.c = true;
        long j = this.d;
        if (j != 0) {
            avrd.a = i | 4;
            avrd.d = j;
        }
        List list = this.b;
        if (!avrd.b.a()) {
            avrd.b = aucj.a(avrd.b);
        }
        auab.a((Iterable) list, (List) avrd.b);
        return ((avrd) o.i()).k();
    }

    public final boolean a() {
        return this.b.isEmpty();
    }
}
