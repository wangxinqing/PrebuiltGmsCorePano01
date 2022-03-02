package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: afso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afso {
    public final afpi a;
    public final afqr b;
    public final agzs c;
    public final afsb d;
    public final Context e;
    public final afmh f;
    public final amri g;
    public final Executor h;

    public afso(Context context, afpi afpi, afqr afqr, agzs agzs, afsb afsb, afmh afmh, amri amri, Executor executor) {
        this.e = context;
        this.a = afpi;
        this.b = afqr;
        this.c = agzs;
        this.d = afsb;
        this.f = afmh;
        this.g = amri;
        this.h = executor;
    }

    public static final String a(aflf aflf) {
        return aflf.b + "|" + aflf.c;
    }

    public static final Set a(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
