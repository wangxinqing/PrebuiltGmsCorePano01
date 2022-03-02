package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iic {
    public static String a(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_ACCOUNT_NAME");
    }

    public static int b(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_APP_ID");
        if (!TextUtils.isEmpty(stringExtra)) {
            return Integer.parseInt(stringExtra);
        }
        return 80;
    }

    public static String c(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_PAGE_ID");
    }

    public static AudienceMember d(Intent intent) {
        return (AudienceMember) intent.getParcelableExtra("com.google.android.gms.common.audience.EXTRA_TARGET_PERSON");
    }
}
