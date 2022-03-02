package defpackage;

import org.json.JSONObject;

/* renamed from: lba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lba extends lbc {
    public lba(kyq kyq, lcv lcv) {
        super(kyq, true, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.getLong(this.b.a()));
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        return Long.toString(((Long) obj).longValue());
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return Long.toString(((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), (Long) obj);
    }
}
