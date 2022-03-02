package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: iib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iib {
    public final Intent a = new Intent("com.google.android.gms.plus.audience.ACTION_CIRCLE_CREATION");

    public iib(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.a.putExtra("com.google.android.gms.common.audience.EXTRA_ACCOUNT_NAME", str);
            this.a.putExtra("com.google.android.gms.common.audience.EXTRA_APP_ID", str2);
            return;
        }
        throw new IllegalArgumentException("The account name is required.");
    }
}
