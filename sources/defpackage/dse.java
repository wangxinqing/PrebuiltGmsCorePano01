package defpackage;

import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: dse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dse extends ppr {
    final /* synthetic */ ozc a;
    final /* synthetic */ GlobalSearchApplicationInfo b;
    final /* synthetic */ dsh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dse(dsh dsh, aonk aonk, String str, ozc ozc, GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        super(aonk, 2, str);
        this.c = dsh;
        this.a = ozc;
        this.b = globalSearchApplicationInfo;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        try {
            this.c.a.m.a(this.a).a(ozv.a(this.b, System.currentTimeMillis()));
            return null;
        } catch (SecurityException | pau e) {
            return e;
        }
    }
}
