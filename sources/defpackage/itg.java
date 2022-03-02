package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: itg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itg {
    private static final Uri a;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        a = parse;
        parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        return hwy.a((Account) null, (ArrayList) null, new String[]{"com.google"}, true, 0);
    }

    public static Intent b(String str) {
        return a(str, (String) null);
    }

    public static Intent b(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.fitness.app_disconnected");
        intent.setType("vnd.google.android.fitness/app_disconnect");
        intent.putExtra("com.google.android.gms.fitness.disconnected_app", str);
        intent.putExtra("com.google.android.gms.fitness.disconnected_account", str2);
        return intent;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty((CharSequence) null)) {
            intent.putExtra("authAccount", (String) null);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[]{str, 1})));
        intent2.setPackage("com.android.vending");
        intent2.putExtra("use_direct_purchase", true);
        return intent2;
    }

    public static Intent a(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent a(String str, Scope[] scopeArr, boolean z) {
        Intent intent = new Intent("com.google.android.gms.signin.action.SIGN_IN");
        intent.putExtra("SIGN_IN_PACKAGE_NAME", str);
        intent.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
        intent.putExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", z);
        return intent;
    }

    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent("com.google.android.gms.common.SET_GMS_ACCOUNT");
        intent.putExtra("ACCOUNT_NAME", str);
        intent.putExtra("PACKAGE_NAME", str2);
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent, "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    public static void a(Context context, String str, int[] iArr) {
        a("com.google.android.gms", context, str, iArr);
        if (hya.a(context).b("com.google.android.googlequicksearchbox")) {
            a("com.google.android.googlequicksearchbox", context, str, iArr);
        } else if (Log.isLoggable("GmsIntents", 5)) {
            Log.w("GmsIntents", "Google now certificate not valid. UDC settings broadcast will not be sent.");
        }
    }

    public static void a(Context context, boolean z) {
        context.sendBroadcast(new Intent("com.google.android.gms.icing.action.CONTACT_CHANGED").setPackage("com.google.android.gms").putExtra("com.google.android.gms.icing.extra.isSignificant", z));
    }

    private static void a(String str, Context context, String str2, int[] iArr) {
        context.sendBroadcast(new Intent("com.google.android.gms.udc.action.SETTING_CHANGED").setPackage(str).putExtra("com.google.android.gms.udc.extra.accountName", str2).putExtra("com.google.android.gms.udc.extra.settingIdList", iArr));
    }
}
