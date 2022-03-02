package defpackage;

import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhi extends lhw {
    public static final /* synthetic */ int h = 0;
    public final lhk a;
    public Network b = null;
    public final lic c;
    public jzy d = null;
    public final lhc e;
    public final lhd f;
    public final lhe g;
    private lgt j = null;

    public lhi(lhk lhk) {
        int i = Build.VERSION.SDK_INT;
        iva.a(true);
        iva.a((Object) lhk);
        this.a = lhk;
        this.e = new lhc(this);
        this.f = new lhd(this);
        this.g = new lhe(this);
        this.c = new lhf(this);
    }

    private final void g() {
        jzy jzy;
        if (!e()) {
            boolean z = false;
            if (!(this.j == null || (jzy = this.d) == null)) {
                lhk lhk = this.a;
                ArrayList arrayList = new ArrayList();
                lhn lhn = (lhn) lhk;
                synchronized (lhn.c) {
                    for (Network network : ((lhn) lhk).d) {
                        if (((lhn) lhk).a(network, jzy)) {
                            arrayList.add(network);
                        }
                    }
                }
                Collections.sort(arrayList, lhn.f);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                if (!unmodifiableList.isEmpty()) {
                    this.b = (Network) unmodifiableList.get(0);
                    if (b(this.d)) {
                        z = true;
                    }
                }
            }
            a(z);
        }
    }

    public final lic a() {
        return this.c;
    }

    public final synchronized void b() {
        g();
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(jzy jzy) {
        if (!jzy.equals(this.d)) {
            this.d = jzy;
            g();
        }
    }

    public final boolean b(jzy jzy) {
        return jzy.c() != 257 || this.j.a;
    }

    public final synchronized void a(lgt lgt) {
        if (!lgt.equals(this.j)) {
            this.j = lgt;
            g();
        }
    }
}
