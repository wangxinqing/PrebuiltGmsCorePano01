package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: xqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqw {
    public static ClientContext a(Context context, String str) {
        String[] strArr;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        xip.a();
        if (Boolean.valueOf(aywy.a.a().Q()).booleanValue()) {
            xip.a();
            String aa = aywy.a.a().aa();
            if (!TextUtils.isEmpty(aa)) {
                strArr = (String[]) anbs.a(amsk.a(',').b().a().a((CharSequence) aa), String.class);
            } else {
                strArr = new String[0];
            }
            if (strArr.length > 0) {
                clientContext.a(strArr);
            }
        } else {
            clientContext.d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
        }
        clientContext.a("social_client_app_id", "80");
        return clientContext;
    }
}
