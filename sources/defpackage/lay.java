package defpackage;

import java.util.Date;
import org.json.JSONObject;

/* renamed from: lay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lay extends lbc {
    public lay(kyq kyq, lcv lcv) {
        super(kyq, true, lcv);
    }

    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return new Date(jSONObject.getLong(this.b.a()));
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        String a = kju.a((Date) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
        sb.append("'");
        sb.append(a);
        sb.append("'");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return Long.toString(((Date) obj).getTime());
    }

    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), ((Date) obj).getTime());
    }
}
