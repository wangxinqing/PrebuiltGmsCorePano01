package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: hmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmo extends iyv {
    public final String a;
    public final String b;
    public final String c = jhg.h(this.d.i, this.a);
    protected final iyn d;

    public hmo(iyn iyn, String str) {
        this.d = iyn;
        this.a = str;
        this.b = jhg.j(iyn.i, this.a);
        this.d.g = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
    }
}
