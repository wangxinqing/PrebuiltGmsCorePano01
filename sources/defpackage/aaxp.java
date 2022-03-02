package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: aaxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxp {
    static {
        aaxp.class.getCanonicalName();
    }

    aaxp() {
    }

    private static int a(Context context) {
        try {
            Class<?> cls = Class.forName("android.service.persistentdata.PersistentDataBlockManager");
            Object systemService = context.getSystemService((String) Context.class.getField("PERSISTENT_DATA_BLOCK_SERVICE").get((Object) null));
            if (systemService != null) {
                return ((Integer) cls.getDeclaredMethod("getFlashLockState", new Class[0]).invoke(systemService, new Object[0])).intValue();
            }
            return -1;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{str, -1})).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            return -1;
        }
    }

    private static int a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("android.provider.Settings$System");
            return ((Integer) cls.getMethod("getInt", new Class[]{ContentResolver.class, String.class}).invoke((Object) null, new Object[]{context.getContentResolver(), (String) cls.getField(str).get((Object) null)})).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return -1;
        }
    }

    static aaxm a(Context context, aayc aayc) {
        aayc aayc2 = aayc;
        aaxm aaxm = new aaxm();
        aaxm.a = a("ro.boot.verifiedbootstate");
        aaxm.b = a("ro.boot.veritymode");
        aaxm.c = a("ro.build.version.security_patch");
        aaxm.d = b("ro.oem_unlock_supported");
        if (Build.VERSION.SDK_INT > 23) {
            aaxm.e = a(context);
        } else {
            aaxm.e = b("ro.boot.flash.locked");
        }
        aaxm.f = a("ro.product.brand");
        aaxm.g = a("ro.product.model");
        aaxm.h = aaza.b("/proc/version");
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = new ArrayList();
            String a = aayc2.b.a("system_properties");
            if (!TextUtils.isEmpty(a)) {
                arrayList.addAll(Arrays.asList(a.split(",")));
            }
            if (!arrayList.isEmpty()) {
                aaxm.i = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) arrayList.get(i);
                    aaxo aaxo = new aaxo();
                    aaxo.a = str;
                    aaxo.b = a(str);
                    if (!"Unknown".equals(aaxo.b)) {
                        aaxm.i.add(aaxo);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String a2 = aayc2.b.a("jvm_properties");
        if (!TextUtils.isEmpty(a2)) {
            arrayList2.addAll(Arrays.asList(a2.split(",")));
        }
        Collections.addAll(arrayList2, aayc.a);
        if (arrayList2.size() > 0) {
            if (aaxm.i == null) {
                aaxm.i = new ArrayList();
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                aaxo aaxo2 = new aaxo();
                aaxo2.a = str2;
                aaxo2.b = System.getProperty(str2);
                if (aaxo2.b != null) {
                    aaxm.i.add(aaxo2);
                }
            }
        }
        if (aaza.a(aaxm.f, aaza.c("KkzFqJ9SGQ=="))) {
            aaxm.j = new aaxn();
            aaxm.j.b = 3;
            Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(128).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationInfo next = it.next();
                if (aaza.c("OkLF9ZlZHd1DkGVR2aCjET9C3LqJUBeWTIo=").equalsIgnoreCase(next.packageName)) {
                    if (next.enabled) {
                        aaxm.j.b = 1;
                    } else {
                        aaxm.j.b = 2;
                    }
                }
            }
            aaxm.j.a = a(context, "SOFTWARE_UPDATE_AUTO_UPDATE");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            aucd o = aatq.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aatq aatq = (aatq) o.b;
            "RSA_hardware_backed".getClass();
            aatq.a |= 1;
            aatq.b = "RSA_hardware_backed";
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                instance.initialize(new KeyGenParameterSpec.Builder("snet_test_keys", 4).setDigests(new String[]{"SHA-256"}).build());
                String valueOf = String.valueOf(((KeyInfo) KeyFactory.getInstance("RSA", "AndroidKeyStore").getKeySpec(instance.generateKeyPair().getPrivate(), KeyInfo.class)).isInsideSecureHardware());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aatq aatq2 = (aatq) o.b;
                valueOf.getClass();
                aatq2.a |= 2;
                aatq2.c = valueOf;
            } catch (GeneralSecurityException e) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aatq aatq3 = (aatq) o.b;
                "Unknown".getClass();
                aatq3.a |= 2;
                aatq3.c = "Unknown";
            }
            aucd o2 = aatq.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aatq aatq4 = (aatq) o2.b;
            "EC_hardware_backed".getClass();
            aatq4.a |= 1;
            aatq4.b = "EC_hardware_backed";
            try {
                KeyPairGenerator instance2 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                instance2.initialize(new KeyGenParameterSpec.Builder("snet_test_keys", 4).setDigests(new String[]{"SHA-256"}).build());
                String valueOf2 = String.valueOf(((KeyInfo) KeyFactory.getInstance("EC", "AndroidKeyStore").getKeySpec(instance2.generateKeyPair().getPrivate(), KeyInfo.class)).isInsideSecureHardware());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aatq aatq5 = (aatq) o2.b;
                valueOf2.getClass();
                aatq5.a |= 2;
                aatq5.c = valueOf2;
            } catch (GeneralSecurityException | ProviderException e2) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aatq aatq6 = (aatq) o2.b;
                "Unknown".getClass();
                aatq6.a |= 2;
                aatq6.c = "Unknown";
            }
            aaxm.k = new aatq[]{(aatq) o.i(), (aatq) o2.i()};
        }
        return aaxm;
    }

    private static String a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            return TextUtils.isEmpty(str2) ? "Unknown" : str2;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
            return "Unknown";
        } catch (InvocationTargetException e2) {
            return "Unknown";
        }
    }
}
