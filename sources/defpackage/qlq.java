package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: qlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlq {
    public static Intent a(boolean z) {
        Intent flags = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.instantapps.settings.OptInActivity").putExtra("lastChance", z).setFlags(65536);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            flags.putExtra("defaultAccount", (String) null);
        }
        return flags;
    }
}
