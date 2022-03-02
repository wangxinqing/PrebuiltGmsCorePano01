package defpackage;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: fys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fys {
    public static final fzi d = new fyr();
    private static final Pattern e = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    public final PackageManager a;
    public final jnh b;
    public final epw c;
    private final DevicePolicyManager f;

    public fys(DevicePolicyManager devicePolicyManager, PackageManager packageManager, jnh jnh, epw epw) {
        this.f = devicePolicyManager;
        this.a = packageManager;
        this.b = jnh;
        this.c = epw;
    }

    private final boolean c(String str) {
        int i = Build.VERSION.SDK_INT;
        return this.f.isDeviceOwnerApp(str) || this.f.isProfileOwnerApp(str);
    }

    private final String d(String str) {
        try {
            PackageInfo b2 = this.b.b(str, 64);
            if (b2 == null || b2.signatures == null || b2.signatures.length == 0 || b2.signatures[0] == null) {
                String valueOf = String.valueOf(str);
                Log.e("GLSUser", valueOf.length() == 0 ? new String("package without signature: ") : "package without signature: ".concat(valueOf));
                return "";
            }
            try {
                return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(b2.signatures[0].toByteArray()), 11);
            } catch (NoSuchAlgorithmException e2) {
                Log.e("GLSUser", "Cannot get SHA256 algorithm:", e2);
                return "";
            }
        } catch (PackageManager.NameNotFoundException e3) {
            String valueOf2 = String.valueOf(str);
            Log.e("GLSUser", valueOf2.length() == 0 ? new String("package not found: ") : "package not found: ".concat(valueOf2), e3);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r2.f.getProfileOwner();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            android.app.admin.DevicePolicyManager r0 = r2.f
            java.lang.String r0 = r0.getDeviceOwner()
            if (r0 != 0) goto L_0x0016
            android.app.admin.DevicePolicyManager r1 = r2.f
            android.content.ComponentName r1 = r1.getProfileOwner()
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = r1.getPackageName()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fys.a():java.lang.String");
    }

    public final boolean b(int i) {
        String[] a2 = this.b.a(i);
        if (a2 != null) {
            for (String c2 : a2) {
                if (c(c2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(String str) {
        List<ComponentName> activeAdmins = this.f.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName packageName : activeAdmins) {
                if (str.equals(packageName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(int i) {
        String[] a2 = this.b.a(i);
        if (a2 != null) {
            for (String a3 : a2) {
                if (a(a3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(Account account) {
        return account != null && "com.google.work".equals(account.type) && e.matcher(account.name).matches();
    }

    public final boolean a(String str) {
        if (c(str) || b(str)) {
            return true;
        }
        if (!((Boolean) ent.c.c()).booleanValue() || a() != null) {
            return false;
        }
        gqv j = ent.j();
        if (j.a.size() != 0) {
            String d2 = d(str);
            aucx aucx = j.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                gqw gqw = (gqw) aucx.get(i);
                if (gqw.a.equals(str) && gqw.b.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
