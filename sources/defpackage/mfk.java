package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: mfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfk {
    private static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");

    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
    }

    public static Intent a(mfl mfl) {
        return new Intent().setComponent(a).putExtras(new Bundle(((mfm) mfl).b));
    }

    public static String a(String str) {
        return str.length() == 0 ? new String("com.google.android.gms.family.") : "com.google.android.gms.family.".concat(str);
    }
}
