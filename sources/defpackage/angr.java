package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: angr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angr extends amyr {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ angs b;

    public angr(angs angs, Map.Entry entry) {
        this.b = angs;
        this.a = entry;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return anhf.b((Collection) this.a.getValue(), this.b.a.g);
    }
}
