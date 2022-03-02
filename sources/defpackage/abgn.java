package defpackage;

import android.content.Intent;

/* renamed from: abgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgn {
    public static Intent a(Intent intent, String str, String str2) {
        abgm abgm = new abgm();
        abgm.a.putExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE", str2);
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID")) {
            abgm.a(intent.getIntExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 0));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.CARDS")) {
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.CARDS", intent.getExtras().getIntArray("com.google.android.gms.people.smart_profile.CARDS"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")) {
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY", intent.getExtras().getIntArray("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY"));
        }
        String valueOf = String.valueOf(str);
        abgm.a(valueOf.length() == 0 ? new String("g:") : "g:".concat(valueOf));
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID")) {
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID", intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME")) {
            abgm.b(intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR")) {
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR", intent.getStringExtra("com.google.android.gms.people.smart_profile.THEME_COLOR"));
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT")) {
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", intent.getIntExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", 0));
        }
        return abgm.a;
    }
}
