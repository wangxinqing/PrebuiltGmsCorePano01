package com.google.android.gms.ads.internal.flag;

import com.google.android.gms.ads.internal.config.k;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a {
    private final String a;
    private final Object b;
    private final int c;

    protected a(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static a a(String str, String str2) {
        return new a(str, str2, 4);
    }

    public static a a(String str, boolean z) {
        return new a(str, Boolean.valueOf(z), 1);
    }

    public final Object a() {
        k kVar = (k) h.a.get();
        if (kVar != null) {
            int i = this.c - 1;
            if (i == 0) {
                return Boolean.valueOf(kVar.a.e.getBoolean(this.a, ((Boolean) this.b).booleanValue()));
            } else if (i == 1) {
                String str = this.a;
                long longValue = ((Long) this.b).longValue();
                try {
                    return Long.valueOf(kVar.a.e.getLong(str, longValue));
                } catch (ClassCastException e) {
                    return Long.valueOf((long) kVar.a.e.getInt(str, (int) longValue));
                }
            } else if (i != 2) {
                return kVar.a.e.getString(this.a, (String) this.b);
            } else {
                return Double.valueOf((double) kVar.a.e.getFloat(this.a, (float) ((Double) this.b).doubleValue()));
            }
        } else {
            throw new IllegalStateException("Flag is not initialized.");
        }
    }
}
