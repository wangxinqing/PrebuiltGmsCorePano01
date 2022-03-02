package defpackage;

import org.json.JSONObject;

/* renamed from: lan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lan extends lbc {
    public lan(kyq kyq, boolean z, lcv lcv) {
        super(kyq, z, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getBoolean(this.b.a()));
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        return ((Boolean) obj).toString();
    }

    public String a(Boolean bool) {
        return !bool.booleanValue() ? "0" : "1";
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), (Boolean) obj);
    }
}
