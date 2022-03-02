package defpackage;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.mdm.receivers.MdmDeviceAdminChimeraReceiver;
import com.google.android.gms.mdm.services.SitrepHelperIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: snb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snb {
    public static boolean a = false;
    private static boolean b = false;

    public static ComponentName a() {
        return new ComponentName(ihs.b(), aann.a(MdmDeviceAdminChimeraReceiver.class));
    }

    public static avuj b(Context context, boolean z) {
        if (z == b(context)) {
            snn.c("Device admin action is a no-op. Action: %s", Boolean.valueOf(z));
            return z ? avuj.AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR : avuj.AUTO_DISABLE_ALREADY_NOT_DEVICE_ADMINISTRATOR;
        } else if (z) {
            return c(context, false);
        } else {
            h(context);
            return avuj.SUCCESS;
        }
    }

    public static void d(Context context) {
        if (azfv.l()) {
            int i = Build.VERSION.SDK_INT;
            if (!jkr.h() || !d(context, false)) {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                ComponentName a2 = a();
                try {
                    devicePolicyManager.setKeyguardDisabledFeatures(a2, 8);
                } catch (SecurityException e) {
                    int i2 = Build.VERSION.SDK_INT;
                    c(context, true);
                    try {
                        devicePolicyManager.setKeyguardDisabledFeatures(a2, 8);
                    } catch (SecurityException e2) {
                        snn.c("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURESeven after refreshing device admin", new Object[0]);
                    }
                }
            }
        }
    }

    public static void e(Context context) {
        if (azfv.l()) {
            int i = Build.VERSION.SDK_INT;
            if (!jkr.h() || !d(context, true)) {
                try {
                    ((DevicePolicyManager) context.getSystemService("device_policy")).setKeyguardDisabledFeatures(a(), 0);
                } catch (SecurityException e) {
                    snn.c("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURES", new Object[0]);
                }
            }
        }
    }

    public static void f(Context context) {
        NfcAdapter defaultAdapter;
        if (!azfk.c() && (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) != null) {
            if (b) {
                b = false;
                defaultAdapter.enable();
                snn.b("Enable NFC", new Object[0]);
            }
            if (azfk.e() && jkr.h() && a) {
                a = false;
                if (defaultAdapter.isSecureNfcSupported()) {
                    if (defaultAdapter.isEnabled()) {
                        defaultAdapter.enableSecureNfc(false);
                    } else {
                        defaultAdapter.enable();
                        defaultAdapter.enableSecureNfc(false);
                        defaultAdapter.disable();
                    }
                    snn.b("Disable Secure NFC", new Object[0]);
                }
            }
        }
    }

    public static void g(Context context) {
        if (!b(context)) {
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", a());
            intent.putExtra("android.app.extra.ADD_EXPLANATION", context.getString(R.string.mdm_device_admin_desc));
            context.startActivity(intent);
        }
    }

    private static void h(Context context) {
        try {
            ((DevicePolicyManager) context.getSystemService("device_policy")).removeActiveAdmin(a());
        } catch (SecurityException e) {
            snn.c("FMD is not in the owner application of admin", new Object[0]);
        }
    }

    public static avue a(DevicePolicyManager devicePolicyManager) {
        aucd o = avue.k.o();
        int passwordQuality = devicePolicyManager.getPasswordQuality((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue = (avue) o.b;
        avue.a |= 1;
        avue.b = passwordQuality;
        int passwordMaximumLength = devicePolicyManager.getPasswordMaximumLength(passwordQuality);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue2 = (avue) o.b;
        avue2.a |= 2;
        avue2.c = passwordMaximumLength;
        int passwordMinimumLength = devicePolicyManager.getPasswordMinimumLength((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue3 = (avue) o.b;
        avue3.a |= 4;
        avue3.d = passwordMinimumLength;
        int passwordMinimumLetters = devicePolicyManager.getPasswordMinimumLetters((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue4 = (avue) o.b;
        avue4.a |= 8;
        avue4.e = passwordMinimumLetters;
        int passwordMinimumLowerCase = devicePolicyManager.getPasswordMinimumLowerCase((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue5 = (avue) o.b;
        avue5.a |= 16;
        avue5.f = passwordMinimumLowerCase;
        int passwordMinimumNonLetter = devicePolicyManager.getPasswordMinimumNonLetter((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue6 = (avue) o.b;
        avue6.a |= 32;
        avue6.g = passwordMinimumNonLetter;
        int passwordMinimumNumeric = devicePolicyManager.getPasswordMinimumNumeric((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue7 = (avue) o.b;
        avue7.a |= 64;
        avue7.h = passwordMinimumNumeric;
        int passwordMinimumSymbols = devicePolicyManager.getPasswordMinimumSymbols((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue8 = (avue) o.b;
        avue8.a |= 128;
        avue8.i = passwordMinimumSymbols;
        int passwordMinimumUpperCase = devicePolicyManager.getPasswordMinimumUpperCase((ComponentName) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avue avue9 = (avue) o.b;
        avue9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        avue9.j = passwordMinimumUpperCase;
        return (avue) o.i();
    }

    private static avuj c(Context context, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (jkr.h()) {
            snn.c("Q+ devices does not need device admin.", new Object[0]);
            return avuj.SUCCESS;
        }
        Class<DevicePolicyManager> cls = DevicePolicyManager.class;
        try {
            Method method = cls.getMethod("setActiveAdmin", new Class[]{ComponentName.class, Boolean.TYPE});
            if (method != null) {
                method.invoke((DevicePolicyManager) context.getSystemService("device_policy"), new Object[]{a(), Boolean.valueOf(z)});
                return avuj.SUCCESS;
            }
        } catch (NoSuchMethodException e) {
            snn.b(e, "Cannot find DevicePolicyManager.setActiveAdmin()", new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            snn.b(e2, "Unable to set as device admin.", new Object[0]);
        }
        return avuj.FAILURE;
    }

    public static boolean b(Context context) {
        return ((DevicePolicyManager) context.getSystemService("device_policy")).isAdminActive(a());
    }

    private static boolean d(Context context, boolean z) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        Class<KeyguardManager> cls = KeyguardManager.class;
        try {
            Method method = cls.getMethod("setPrivateNotificationsAllowed", new Class[]{Boolean.TYPE});
            if (method != null) {
                method.invoke(keyguardManager, new Object[]{Boolean.valueOf(z)});
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            snn.b("Exception trying to set keyguard through KeyguardManager", new Object[0]);
        }
        return false;
    }

    public static void c(Context context) {
        try {
            ((DevicePolicyManager) context.getSystemService("device_policy")).lockNow();
        } catch (SecurityException e) {
            snn.c("FMD does not own an active administrator that uses USES_POLICY_FORCE_LOCK", new Object[0]);
        }
    }

    public static void a(Context context) {
        if (b(context)) {
            h(context);
        }
    }

    public static void a(Context context, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(33);
        sb.append("DeviceAdminState changed to ");
        sb.append(z);
        sb.toString();
        int i2 = crc.a;
        Intent startIntent = IntentOperation.getStartIntent(context, SitrepHelperIntentOperation.class, "com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED");
        startIntent.putExtra("force", false);
        startIntent.putExtra("enabled", z);
        if (!z) {
            i = 3;
        } else {
            i = 4;
        }
        startIntent.putExtra("reason", i);
        context.startService(startIntent);
        Intent intent = new Intent("com.google.android.gms.mdm.DEVICE_ADMIN_CHANGE_INTENT");
        intent.putExtra("device_admin_enabled", z);
        alv.a(context).a(intent);
        iwq.a(context).a("mdm.notification_reminder", 1);
    }

    public static void a(NfcAdapter nfcAdapter) {
        if (nfcAdapter.isEnabled()) {
            b = true;
            nfcAdapter.disable();
            snn.b("Disable NFC", new Object[0]);
        }
    }
}
