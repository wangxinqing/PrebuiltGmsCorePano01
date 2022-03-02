package com.google.android.gms.romanesco.base;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RomanescoInitIntentOperation extends hec {
    static final String[] a = {"com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreDialogActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity"};
    private final zsg b = zsg.a("RomanescoInit");

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if (azem.b() && azem.a.a().f()) {
            ztg.a(this).b();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        for (String str : a) {
            new Object[1][0] = str;
            try {
                jhg.a((Context) this, str, true);
            } catch (IllegalArgumentException e) {
                zsg zsg = this.b;
                String valueOf = String.valueOf(e.getMessage());
                zsg.d(valueOf.length() == 0 ? new String("Component invalid: ") : "Component invalid: ".concat(valueOf));
            }
        }
    }
}
