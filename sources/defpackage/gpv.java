package defpackage;

import android.text.Html;
import com.google.android.gms.constellation.PhoneNumberInfo;
import java.util.List;

/* renamed from: gpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpv implements acvv {
    final /* synthetic */ gqa a;

    public gpv(gqa gqa) {
        this.a = gqa;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        StringBuilder sb = new StringBuilder("var phoneNumberInfos = [];");
        for (PhoneNumberInfo phoneNumberInfo : (List) obj) {
            sb.append("phoneNumberInfos.push({number: \"");
            sb.append(Html.escapeHtml(phoneNumberInfo.b));
            sb.append("\", verificationTime: ");
            sb.append(phoneNumberInfo.c);
            sb.append(", data: {");
            String str = "";
            for (String str2 : phoneNumberInfo.d.keySet()) {
                sb.append(str);
                sb.append(str2);
                sb.append(": \"");
                sb.append(Html.escapeHtml(phoneNumberInfo.d.getString(str2)));
                sb.append("\"");
                str = ", ";
            }
            sb.append("}});");
        }
        sb.append("window.onFetchPhoneNumberInfo(0, phoneNumberInfos);");
        this.a.f(sb.toString());
    }
}
