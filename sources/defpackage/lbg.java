package defpackage;

import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: lbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lbg extends lbc {
    public lbg(kyq kyq, lcv lcv) {
        super(kyq, false, lcv);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject(this.b.a());
        String string = jSONObject2.getString("permissionId");
        String optString = jSONObject2.optString("displayName", (String) null);
        JSONObject optJSONObject = jSONObject2.optJSONObject("picture");
        if (optJSONObject != null) {
            str = optJSONObject.optString("url", (String) null);
        } else {
            str = null;
        }
        return new UserMetadata(string, optString, str, jSONObject2.optBoolean("isAuthenticatedUser", false), jSONObject2.optString("emailAddress", (String) null));
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        UserMetadata userMetadata = (UserMetadata) obj;
        throw new UnsupportedOperationException("Cannot query User Metadata from Genoa.");
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
        throw new UnsupportedOperationException("Cannot convert User Metadata directly to a database value.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
        JSONObject put = new JSONObject().put("permissionId", userMetadata.a).put("displayName", userMetadata.b).put("isAuthenticatedUser", userMetadata.d).put("emailAddress", userMetadata.e);
        String str = userMetadata.c;
        if (str != null) {
            put.put("picture", new JSONObject().put("url", str));
        }
        jSONObject.put(this.b.a(), put);
    }
}
