package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.List;

/* renamed from: abzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzz {
    private static final iwd a = acqa.a("WorkProfileHelper");
    private final UserManager b;
    private final DevicePolicyManager c;

    public abzz(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = (UserManager) applicationContext.getSystemService("user");
        this.c = (DevicePolicyManager) applicationContext.getSystemService("device_policy");
    }

    public final int b() {
        List<ComponentName> activeAdmins;
        String deviceOwner = this.c.getDeviceOwner();
        UserHandle a2 = a();
        if (azkf.a.a().b() && deviceOwner == null && a2 == null && (activeAdmins = this.c.getActiveAdmins()) != null) {
            String c2 = azkf.a.a().c();
            for (ComponentName flattenToShortString : activeAdmins) {
                if (c2.equals(flattenToShortString.flattenToShortString())) {
                    if (!azkf.a.a().h()) {
                        return 3;
                    }
                    return 5;
                }
            }
        }
        if (deviceOwner != null && a2 != null) {
            return 6;
        }
        if (deviceOwner == null) {
            return a2 == null ? 2 : 4;
        }
        return 5;
    }

    public static abzz a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new abzz(context);
    }

    public final UserHandle a() {
        for (UserHandle next : this.b.getUserProfiles()) {
            int identifier = next.getIdentifier();
            String profileOwnerNameAsUser = this.c.getProfileOwnerNameAsUser(identifier);
            a.b("ProfileOwnerName(%d) = %s", Integer.valueOf(identifier), profileOwnerNameAsUser);
            if (profileOwnerNameAsUser != null) {
                return next;
            }
        }
        return null;
    }
}
