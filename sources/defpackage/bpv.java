package defpackage;

import java.util.Set;

/* renamed from: bpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bpv implements amrm {
    private final Set a;

    public bpv(Set set) {
        this.a = set;
    }

    public final boolean a(Object obj) {
        return !this.a.contains(obj);
    }
}
