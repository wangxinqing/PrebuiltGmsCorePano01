package defpackage;

import org.json.JSONObject;

/* renamed from: lbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lbf extends lbc {
    public lbf(kyq kyq, boolean z, lcv lcv) {
        super(kyq, z, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.getString(this.b.a());
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        return lso.b((String) obj);
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return (String) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), (String) obj);
    }
}
