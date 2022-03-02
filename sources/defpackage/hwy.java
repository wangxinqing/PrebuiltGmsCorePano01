package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: hwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwy {
    @Deprecated
    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, int i) {
        return a(account, arrayList, strArr, true, (String) null, z, i, 0, (String) null, false);
    }

    @Deprecated
    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, boolean z2, int i, int i2, String str2, boolean z3) {
        String str3;
        boolean z4;
        Intent intent = new Intent();
        if (z3) {
            str3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE";
        } else {
            if (str2 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            iva.b(z4, "We only support hostedDomain filter for account chip styled account picker");
            str3 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT";
        }
        intent.setAction(str3);
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", (Bundle) null);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", (String) null);
        intent.putExtra("addAccountRequiredFeatures", (String[]) null);
        intent.putExtra("setGmsCoreAccount", z2);
        intent.putExtra("overrideTheme", i);
        intent.putExtra("overrideCustomTheme", i2);
        intent.putExtra("hostedDomainFilter", str2);
        return intent;
    }

    public static Intent a(hwx hwx) {
        Intent intent = new Intent();
        int i = 0;
        if (!hwx.i) {
            iva.b(hwx.h == null, "We only support hostedDomain filter for account chip styled account picker");
            iva.b(hwx.j == null, "Consent is only valid for account chip styled account picker");
        }
        intent.setAction(!hwx.i ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", hwx.b);
        ArrayList arrayList = hwx.c;
        if (arrayList != null) {
            intent.putExtra("allowableAccountTypes", (String[]) arrayList.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", (Bundle) null);
        intent.putExtra("selectedAccount", hwx.a);
        intent.putExtra("alwaysPromptForAccount", hwx.d);
        intent.putExtra("descriptionTextOverride", hwx.e);
        intent.putExtra("setGmsCoreAccount", hwx.f);
        intent.putExtra("realClientPackage", hwx.k);
        intent.putExtra("overrideTheme", hwx.g);
        if (hwx.i) {
            i = 2;
        }
        intent.putExtra("overrideCustomTheme", i);
        intent.putExtra("hostedDomainFilter", hwx.h);
        Bundle bundle = new Bundle();
        if (hwx.i && !TextUtils.isEmpty(hwx.e)) {
            bundle.putString("title", hwx.e);
        }
        if (hwx.j != null) {
            bundle.putBoolean("should_show_consent", true);
            bundle.putString("privacy_policy_url", hwx.j.b);
            bundle.putString("terms_of_service_url", hwx.j.a);
        }
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
