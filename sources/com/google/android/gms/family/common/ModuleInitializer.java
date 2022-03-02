package com.google.android.gms.family.common;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ModuleInitializer extends hec {
    private static final String[] a = {"com.google.android.gms.family.v2.create.FamilyCreationActivity", "com.google.android.gms.family.v2.manage.FamilyManagementActivity", "com.google.android.gms.family.v2.manage.DeleteMemberActivity", "com.google.android.gms.family.v2.manage.InvitationManagementActivity", "com.google.android.gms.family.v2.invites.SendInvitationsActivity", "com.google.android.gms.family.v2.tos.TosActivity", "com.google.android.gms.family.webview.FamilyWebViewActivity"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        for (String a2 : a) {
            jhg.a((Context) this, a2, true);
        }
    }
}
