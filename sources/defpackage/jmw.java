package defpackage;

import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jmw extends jmt implements jly {
    public final ArrayList d;
    public jlz e;

    public jmw(CharSequence charSequence) {
        this(charSequence, 0);
    }

    public final void a(jmc jmc) {
        int c = c(jmc);
        jlz jlz = this.e;
        if (jlz != null) {
            jlz.b(c);
        }
        jmc.a(this);
    }

    public final boolean b(jmc jmc) {
        return this.d.contains(jmc);
    }

    /* access modifiers changed from: package-private */
    public final int c(jmc jmc) {
        int binarySearch = Collections.binarySearch(this.d, jmc, jmu.a);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.d.add(binarySearch, jmc);
        return binarySearch;
    }

    public final void d(jmc jmc) {
        jlz jlz;
        int indexOf = this.d.indexOf(jmc);
        if (indexOf >= 0) {
            this.d.remove(indexOf);
        }
        if (indexOf >= 0 && (jlz = this.e) != null) {
            jlz.c(indexOf);
        }
    }

    public final boolean d() {
        return false;
    }

    public final int e() {
        return R.layout.common_settings_category;
    }

    public final jms f() {
        return jmq.a();
    }

    public final List g() {
        return Collections.unmodifiableList(this.d);
    }

    public jmw(CharSequence charSequence, int i) {
        this.c = charSequence;
        this.b = i;
        this.d = new ArrayList();
    }

    public final void a(jmc... jmcArr) {
        for (jmc a : jmcArr) {
            a(a);
        }
    }
}
