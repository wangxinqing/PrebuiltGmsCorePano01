package defpackage;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: akxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxt implements Runnable {
    final /* synthetic */ BleSighting a;
    final /* synthetic */ akxu b;

    public akxt(akxu akxu, BleSighting bleSighting) {
        this.b = akxu;
        this.a = bleSighting;
    }

    public final void run() {
        akll a2 = this.b.a.a(this.a);
        if (a2 != null) {
            akxo akxo = this.b.a.g;
            akll akll = (akll) akxo.a.get(a2.a);
            if (akll == null || akll.d <= a2.d) {
                akxo.a.put(a2.a, a2);
            }
            akxy akxy = this.b.a;
            if (!akxy.l) {
                akxy.h.postDelayed(akxy.j, akxy.b);
                this.b.a.l = true;
            }
        }
    }
}
