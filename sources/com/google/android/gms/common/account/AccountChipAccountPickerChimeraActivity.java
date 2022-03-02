package com.google.android.gms.common.account;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChipAccountPickerChimeraActivity extends hzf {
    /* access modifiers changed from: protected */
    public final String e() {
        String str;
        if (!azgk.a.a().a()) {
            str = "OriginalAccountChipAccountPickerActivity";
        } else {
            str = "AccountPickerActivity";
        }
        return str.length() == 0 ? new String("com.google.android.gms.common.account.") : "com.google.android.gms.common.account.".concat(str);
    }
}
