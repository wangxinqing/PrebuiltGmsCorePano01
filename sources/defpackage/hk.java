package defpackage;

import java.util.ArrayList;

/* renamed from: hk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hk implements hj {
    final String a;
    final int b;
    final int c;
    final /* synthetic */ hl d;

    public hk(hl hlVar, String str, int i, int i2) {
        this.d = hlVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        gj gjVar = this.d.n;
        if (gjVar != null && this.b < 0 && this.a == null && gjVar.getChildFragmentManager().c()) {
            return false;
        }
        return this.d.a(arrayList, arrayList2, this.a, this.b, this.c);
    }
}
