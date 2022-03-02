package defpackage;

import org.json.JSONObject;

/* renamed from: kdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdp implements jzy {
    private final jzy a;

    static {
        new ith("JsonSerializableTransfe", "");
    }

    public kdp(String str) {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("n");
        boolean z = jSONObject.getBoolean("r");
        int i2 = jSONObject.getInt("b");
        kaa kaa = new kaa();
        kaa.b = i;
        kaa.c = z;
        kaa.d = i2;
        this.a = kaa.a();
    }

    public final int a() {
        return ((jzz) this.a).a;
    }

    public final boolean b() {
        return ((jzz) this.a).b;
    }

    public final int c() {
        return ((jzz) this.a).c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kdp kdp = (kdp) obj;
            return a() == kdp.a() && b() == kdp.b() && c() == kdp.c();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
