package defpackage;

import android.content.Context;
import org.apache.http.entity.StringEntity;

/* renamed from: elq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elq {
    public static final iwd a = new iwd("Auth", "BackendStub");
    public final Context b;
    public final String c;
    public final String d;

    public elq(Context context) {
        String aF = ent.aF();
        this.b = context;
        this.d = String.valueOf(aF).concat("/ratepw");
        this.c = String.valueOf(aF).concat("/checkavail");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.auth.firstparty.shared.CaptchaChallenge a(org.json.JSONObject r4) {
        /*
            elp r0 = defpackage.elp.CAPTCHA_DATA
            java.lang.String r0 = r0.aF
            boolean r1 = r4.has(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            elp r1 = defpackage.elp.CAPTCHA_TOKEN
            java.lang.String r1 = r1.aF
            boolean r1 = r4.has(r1)
            if (r1 == 0) goto L_0x002e
            elp r1 = defpackage.elp.CAPTCHA_TOKEN
            java.lang.String r1 = r1.aF
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = r4.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r4 = r2
        L_0x002f:
            r1 = 0
            if (r0 == 0) goto L_0x004f
            byte[] r0 = android.util.Base64.decode(r0, r1)
            int r3 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r3)
            if (r0 != 0) goto L_0x0047
            iwd r4 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Failed to read bitmap"
            r4.e(r1, r0)
            return r2
        L_0x0047:
            com.google.android.gms.auth.firstparty.shared.CaptchaChallenge r1 = new com.google.android.gms.auth.firstparty.shared.CaptchaChallenge
            gei r2 = defpackage.gei.SUCCESS
            r1.<init>(r2, r4, r0)
            return r1
        L_0x004f:
            iwd r4 = a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "**** NO CAPTCHA DATA ***"
            r4.e(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elq.a(org.json.JSONObject):com.google.android.gms.auth.firstparty.shared.CaptchaChallenge");
    }

    public final String a(String str, String str2, String str3) {
        return emt.b(emt.a(str, str3, new StringEntity(str2, "UTF-8"), this.b));
    }
}
