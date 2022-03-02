package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: agxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agxu extends LinkedHashMap {
    final /* synthetic */ agxv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agxu(agxv agxv) {
        super(134, 0.75f, true);
        this.a = agxv;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.a;
    }
}
