package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.util.r;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class f {
    public final int a = 1;
    public final String b;
    public final Object c;

    public static f a(String str, long j) {
        return new c(str, Long.valueOf(j));
    }

    public static void b(String str) {
        c.a().c.add(a(str, (String) null));
    }

    /* access modifiers changed from: protected */
    public abstract Object a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract Object a(JSONObject jSONObject);

    public /* synthetic */ f(String str, Object obj) {
        this.b = str;
        this.c = obj;
        c.a().a.add(this);
    }

    public static f a(String str, Boolean bool) {
        return new a(str, bool);
    }

    public static f a(String str, String str2) {
        return new e(str, str2);
    }

    public static void a(String str) {
        new d(str, Float.valueOf(0.0f));
    }

    public static void a(String str, int i) {
        new b(str, Integer.valueOf(i));
    }

    public final Object a() {
        l b2 = c.b();
        if (!b2.b.block(5000)) {
            synchronized (b2.a) {
                if (!b2.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!b2.c || b2.e == null) {
            synchronized (b2.a) {
                if (b2.c) {
                    if (b2.e == null) {
                    }
                }
                Object obj = this.c;
                return obj;
            }
        }
        if (this.a == 1 && b2.h.has(this.b)) {
            return a(b2.h);
        }
        return r.a(new i(b2, this));
    }
}
