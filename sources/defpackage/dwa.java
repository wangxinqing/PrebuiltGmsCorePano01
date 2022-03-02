package defpackage;

import android.content.Intent;
import android.os.Bundle;

@Deprecated
/* renamed from: dwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwa {
    public static Bundle a(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.appinvite.INVITATION_ID", str);
        if (str2 != null) {
            bundle.putString("com.google.android.gms.appinvite.DEEP_LINK", str2);
        }
        bundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", z);
        return bundle;
    }

    @Deprecated
    public static void a(String str, String str2, Intent intent) {
        if (intent != null) {
            intent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", a(str, str2, false));
        }
    }
}
