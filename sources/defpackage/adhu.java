package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: adhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhu {
    public static Intent a() {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 212);
    }

    public static Intent a(Context context, String str, String str2) {
        return new Intent("android.intent.action.VIEW").setData(adhr.a(str, Uri.parse("https://myaccount.google.com/activitycontrols").buildUpon().appendQueryParameter("target_user_id", str2).appendQueryParameter("hl", adcp.a(context)).build().toString()));
    }

    public static Intent a(String str) {
        return a().putExtra("extra.accountName", str);
    }
}
