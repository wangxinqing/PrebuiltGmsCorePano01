package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzc implements alzf {
    public static final alzc a = new alzc();

    private alzc() {
    }

    public final Object a() {
        return null;
    }

    public final Object a(String str) {
        return str;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return new HashMap();
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return new ArrayList();
    }

    public final Object a(double d) {
        long j = (long) d;
        if (d != ((double) j)) {
            return Double.valueOf(d);
        }
        if (j < -2147483648L || j > 2147483647L) {
            return Long.valueOf(j);
        }
        return Integer.valueOf((int) j);
    }

    public final Object a(int i) {
        return Integer.valueOf(i);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return Collections.unmodifiableMap((Map) obj);
    }

    public final Object a(boolean z) {
        return Boolean.valueOf(z);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((List) obj2).add(obj);
    }

    public final /* bridge */ /* synthetic */ void a(String str, Object obj, Object obj2) {
        ((Map) obj2).put(str, obj);
    }
}
