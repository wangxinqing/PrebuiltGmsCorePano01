package defpackage;

import android.net.LinkAddress;
import android.net.StaticIpConfiguration;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;

/* renamed from: uwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwe {
    public static boolean a(WifiConfiguration wifiConfiguration, String str) {
        ((anih) ((anih) ulh.a.d()).a("uwe", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to use static ip.");
        if (str.equals("0.0.0.0") || str.equals("127.0.0.1")) {
            ((anih) ((anih) ulh.a.d()).a("uwe", "a", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Gateway address %s is invalid.", (Object) str);
            return false;
        }
        try {
            aonw.a(str);
            try {
                if (!(InetAddress.getByName(str) instanceof Inet4Address)) {
                    ((anih) ((anih) ulh.a.d()).a("uwe", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Gateway address %s is not ipv4.", (Object) str);
                    return false;
                }
                String format = String.format("%s.%s", new Object[]{str.substring(0, str.lastIndexOf(".")), Integer.valueOf(new SecureRandom().nextInt(253) + 2)});
                try {
                    byte[] address = InetAddress.getByName(format).getAddress();
                    byte b = address[address.length - 1];
                    if (b == 0 || b == 1 || b == -1) {
                        ((anih) ((anih) ulh.a.d()).a("uwe", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Generate static IP address %s failed.", (Object) format);
                        return false;
                    }
                    ((anih) ((anih) ulh.a.d()).a("uwe", "a", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Using ip address %s", (Object) format);
                    try {
                        LinkAddress linkAddress = (LinkAddress) new tgf(LinkAddress.class, new Class[]{String.class}).a(String.valueOf(format).concat("/24"));
                        int i = Build.VERSION.SDK_INT;
                        return a(wifiConfiguration, str, linkAddress);
                    } catch (tgg e) {
                        anih anih = (anih) ulh.a.d();
                        anih.a((Throwable) e);
                        ((anih) anih.a("uwe", "a", 109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                        return false;
                    }
                } catch (UnknownHostException e2) {
                    anih anih2 = (anih) ulh.a.d();
                    anih2.a((Throwable) e2);
                    ((anih) anih2.a("uwe", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                    return false;
                }
            } catch (UnknownHostException e3) {
                anih anih3 = (anih) ulh.a.d();
                anih3.a((Throwable) e3);
                ((anih) anih3.a("uwe", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                return false;
            }
        } catch (IllegalArgumentException e4) {
            anih anih4 = (anih) ulh.a.d();
            anih4.a((Throwable) e4);
            ((anih) anih4.a("uwe", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Gateway address %s is invalid.", (Object) str);
            return false;
        }
    }

    private static boolean a(WifiConfiguration wifiConfiguration, String str, LinkAddress linkAddress) {
        jjg jjg = ulh.a;
        Class<StaticIpConfiguration> cls = StaticIpConfiguration.class;
        try {
            Object a = tgf.a((Object) cls).a(new Object[0]);
            try {
                tgf a2 = tgf.a(a);
                a2.a("ipAddress", (Object) linkAddress);
                a2.a("gateway", (Object) InetAddress.getByName(str));
                try {
                    tgf.a((Object) wifiConfiguration).a("setStaticIpConfiguration", cls).a(a);
                    try {
                        tgf a3 = tgf.a((Object) Class.forName("android.net.IpConfiguration$IpAssignment"));
                        Object[] enumConstants = ((Class) a3.a).getEnumConstants();
                        if (enumConstants != null) {
                            int length = enumConstants.length;
                            int i = 0;
                            while (i < length) {
                                Object obj = enumConstants[i];
                                if (ampw.a(((Enum) obj).name()).equals(ampw.a("static"))) {
                                    try {
                                        tgf.a((Object) wifiConfiguration).a("setIpAssignment", obj.getClass()).a(obj);
                                        ((anih) ((anih) ulh.a.d()).a("uwe", "a", 248, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully configured static ip for lollipop and higher.");
                                        return true;
                                    } catch (tgg e) {
                                        anih anih = (anih) ulh.a.d();
                                        anih.a((Throwable) e);
                                        ((anih) anih.a("uwe", "a", 244, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                                        return false;
                                    }
                                } else {
                                    i++;
                                }
                            }
                            throw new tgg(new IllegalArgumentException(String.format("Failed to find enum %s", new Object[]{"static"})));
                        }
                        throw new tgg(new IllegalArgumentException(String.format("%s has no enums", new Object[]{a3.a.toString()})));
                    } catch (ClassNotFoundException e2) {
                        throw new tgg(e2);
                    } catch (tgg e3) {
                        return false;
                    }
                } catch (tgg e4) {
                    anih anih2 = (anih) ulh.a.d();
                    anih2.a((Throwable) e4);
                    ((anih) anih2.a("uwe", "a", 225, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                    return false;
                }
            } catch (tgg e5) {
                anih anih3 = (anih) ulh.a.d();
                anih3.a((Throwable) e5);
                ((anih) anih3.a("uwe", "a", 212, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                return false;
            } catch (UnknownHostException e6) {
                anih anih4 = (anih) ulh.a.d();
                anih4.a((Throwable) e6);
                ((anih) anih4.a("uwe", "a", 215, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
                return false;
            }
        } catch (tgg e7) {
            anih anih5 = (anih) ulh.a.d();
            anih5.a((Throwable) e7);
            ((anih) anih5.a("uwe", "a", 203, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to configure static ip.");
            return false;
        }
    }

    public static boolean a(WifiManager wifiManager) {
        if (aymi.a.a().ac()) {
            try {
                return ((Boolean) tgf.a((Object) wifiManager).a("isDualBandSupported", new Class[0]).a(new Object[0])).booleanValue();
            } catch (tgg e) {
            }
        }
        return false;
    }
}
