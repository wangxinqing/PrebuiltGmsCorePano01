package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: tlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tlb {
    public static int a(String str) {
        if ("android.permission.BLUETOOTH".equals(str)) {
            return 8030;
        }
        if ("android.permission.BLUETOOTH_ADMIN".equals(str)) {
            return 8031;
        }
        if ("android.permission.ACCESS_WIFI_STATE".equals(str)) {
            return 8032;
        }
        if ("android.permission.CHANGE_WIFI_STATE".equals(str)) {
            return 8033;
        }
        if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return 8034;
        }
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
            return 8036;
        }
        ((anih) ((anih) tky.a.b()).a("tlb", "a", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Need to add corresponding status code for missing permission %s", (Object) str);
        return 8;
    }

    private static String b(Context context, String str) {
        try {
            return jhg.e(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) tky.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("tlb", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", (Object) str);
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        String str2;
        try {
            str2 = jhg.e(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) tky.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("tlb", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", (Object) str);
            str2 = null;
        }
        if (str2 == null) {
            ((anih) ((anih) tky.a.d()).a("tlb", "a", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils deemed package %s as not whitelisted because its fingerprint couldn't be computed", (Object) str);
            return false;
        } else if (!"EDA6413C3E3A95492114FE07CD953AD897E40D1A".equalsIgnoreCase(str2)) {
            String aZ = aymi.a.a().aZ();
            if (!aZ.isEmpty()) {
                for (String str3 : aZ.split(",")) {
                    String[] split = str3.split(":");
                    if (split.length != 2) {
                        ((anih) ((anih) tky.a.b()).a("tlb", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils found malformed whitelist entry %s", (Object) str3);
                    } else if (split[0].equals(str) && split[1].equals(str2)) {
                        jjg jjg = tky.a;
                        return true;
                    }
                }
            }
            return false;
        } else {
            jjg jjg2 = tky.a;
            return true;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        String str2;
        if (!z && !hya.a(context).b(str)) {
            try {
                str2 = jhg.e(context, str);
            } catch (PackageManager.NameNotFoundException e) {
                anih anih = (anih) tky.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("tlb", "b", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", (Object) str);
                str2 = null;
            }
            if (str2 == null) {
                ((anih) ((anih) tky.a.d()).a("tlb", "a", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils deemed package %s as not whitelisted because its fingerprint couldn't be computed", (Object) str);
            } else if (!"EDA6413C3E3A95492114FE07CD953AD897E40D1A".equalsIgnoreCase(str2)) {
                String aZ = aymi.a.a().aZ();
                if (!aZ.isEmpty()) {
                    for (String str3 : aZ.split(",")) {
                        String[] split = str3.split(":");
                        if (split.length != 2) {
                            ((anih) ((anih) tky.a.b()).a("tlb", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils found malformed whitelist entry %s", (Object) str3);
                        } else if (split[0].equals(str) && split[1].equals(str2)) {
                            jjg jjg = tky.a;
                        }
                    }
                }
            } else {
                jjg jjg2 = tky.a;
            }
            return false;
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        String aZ = aymi.a.a().aZ();
        if (!aZ.isEmpty()) {
            for (String str3 : aZ.split(",")) {
                String[] split = str3.split(":");
                if (split.length != 2) {
                    ((anih) ((anih) tky.a.b()).a("tlb", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PermissionUtils found malformed whitelist entry %s", (Object) str3);
                } else if (split[0].equals(str) && split[1].equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
