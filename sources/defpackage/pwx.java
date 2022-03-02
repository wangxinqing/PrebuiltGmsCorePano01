package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: pwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pwx extends LinkedHashMap {
    private final int a = 3;

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a;
    }
}
