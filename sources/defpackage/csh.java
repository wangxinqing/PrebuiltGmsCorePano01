package defpackage;

import org.json.JSONObject;

/* renamed from: csh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csh {
    public final aqrx a;
    public final JSONObject b;
    public final int c;

    public csh(int i) {
        this(i, (aqrx) null, (JSONObject) null);
    }

    public csh(int i, aqrx aqrx, JSONObject jSONObject) {
        boolean z = false;
        if (!(i == 3 && (aqrx == null || jSONObject == null))) {
            z = true;
        }
        iva.b(z);
        this.a = aqrx;
        this.b = jSONObject;
        this.c = i;
    }
}
