package defpackage;

import java.util.List;

/* renamed from: wxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wxj {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public wxj(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final int a() {
        return this.a.size() + this.b.size();
    }

    public final Object a(int i) {
        if (i < this.a.size()) {
            return this.a.get(i);
        }
        return this.b.get(i - this.a.size());
    }
}
