package defpackage;

import org.json.JSONObject;

/* renamed from: kao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kao {
    public final kah a;
    public final kah b;

    public kao(kah kah, kah kah2) {
        iva.a((Object) kah);
        this.a = kah;
        iva.a((Object) kah2);
        this.b = kah2;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("forward", this.a.h());
        jSONObject.put("reverse", this.b.h());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kao kao = (kao) obj;
            return this.a.equals(kao.a) && this.b.equals(kao.b);
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("ApplyResult [forwardAction=");
        sb.append(valueOf);
        sb.append(", reverseAction=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
