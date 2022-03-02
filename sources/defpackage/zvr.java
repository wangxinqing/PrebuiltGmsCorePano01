package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: zvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvr {
    public static ClientContext a(Context context, String str) {
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        if (azfa.a.a().x()) {
            clientContext.a((String[]) anbs.a(amsk.a(',').b().a().a((CharSequence) azfa.a.a().b()), String.class));
        } else {
            clientContext.d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
        }
        clientContext.a("social_client_app_id", "80");
        return clientContext;
    }
}
