package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: iie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iie {
    public final Intent a = new Intent("com.google.android.gms.common.acl.ACTION_ONLY_UPDATE");

    public iie(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.a.putExtra("EXTRA_ACCOUNT_NAME", str);
            this.a.putExtra("EXTRA_CLIENT_APPLICATION_ID", str2);
            return;
        }
        throw new IllegalArgumentException("The account name is required.");
    }
}
