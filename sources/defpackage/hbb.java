package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: hbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hbb {
    private static final iwd a = gzk.a("ConnectivityPropertiesModule");
    private static final Pattern b = Pattern.compile("^([0-9]{0,15})$");
    private static final Pattern c = Pattern.compile("^([0-9a-fA-F]{8})$");
    private static final Pattern d = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F][:-]?){5}[0-9a-fA-F][0-9a-fA-F]$");
    private static final Pattern e = Pattern.compile("^(([0-9]{15})|([0-9a-fA-F]{14}))$");

    static amri a(amri amri) {
        if (amri.a()) {
            return !c.matcher((CharSequence) amri.b()).matches() ? ampu.a : amri;
        }
        return ampu.a;
    }

    static amri b(Context context) {
        return jkr.a() ? amri.b(Boolean.valueOf(((TelephonyManager) context.getSystemService("phone")).isVoiceCapable())) : ampu.a;
    }

    static amri c(Context context) {
        String str;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return ampu.a;
        }
        String typeName = activeNetworkInfo.getTypeName();
        String subtypeName = activeNetworkInfo.getSubtypeName();
        if (!activeNetworkInfo.isRoaming()) {
            str = "";
        } else {
            str = "r";
        }
        int length = String.valueOf(typeName).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(subtypeName).length() + str.length());
        sb.append(typeName);
        sb.append(":");
        sb.append(subtypeName);
        sb.append(":");
        sb.append(str);
        return amri.b(sb.toString());
    }

    static amri d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? amri.c(activeNetworkInfo.getTypeName()) : ampu.a;
    }

    static List e(Context context, boolean z) {
        amri amri;
        String str;
        int i;
        int i2;
        int i3;
        amri amri2;
        amri amri3;
        amri amri4;
        int i4;
        int i5;
        Context context2 = context;
        if (!z) {
            return amzy.h();
        }
        int i6 = 1;
        if (jkr.a()) {
            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) context2.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null) {
                a.c("Unknown state of subscriptions on the device", new Object[0]);
                amri = ampu.a;
            } else if (activeSubscriptionInfoList.isEmpty()) {
                a.a("No Subscription records found on the device", new Object[0]);
                amri = amri.b(amzy.h());
            } else {
                a.a("Reading the Subscription data for each Subscription.", new Object[0]);
                if (!jkr.c()) {
                    amri c2 = amri.c((Integer) a(SubscriptionManager.class, context2.getSystemService("telephony_subscription_service"), "getDefaultVoiceSubId", (Class[]) null, (Object[]) null));
                    i2 = c2.a() ? ((Integer) c2.b()).intValue() : -1;
                    amri c3 = amri.c((Integer) a(SubscriptionManager.class, context2.getSystemService("telephony_subscription_service"), "getDefaultDataSubId", (Class[]) null, (Object[]) null));
                    i = c3.a() ? ((Integer) c3.b()).intValue() : -1;
                    amri c4 = amri.c((Integer) a(SubscriptionManager.class, context2.getSystemService("telephony_subscription_service"), "getDefaultSmsSubId", (Class[]) null, (Object[]) null));
                    i3 = c4.a() ? ((Integer) c4.b()).intValue() : -1;
                } else {
                    if (jkr.c()) {
                        i5 = SubscriptionManager.getDefaultVoiceSubscriptionId();
                    } else {
                        i5 = -1;
                    }
                    if (jkr.c()) {
                        i4 = SubscriptionManager.getDefaultDataSubscriptionId();
                    } else {
                        i4 = -1;
                    }
                    i3 = jkr.c() ? SubscriptionManager.getDefaultSmsSubscriptionId() : -1;
                }
                ArrayList arrayList = new ArrayList();
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    aucd o = har.i.o();
                    int subscriptionId = next.getSubscriptionId();
                    if (jkr.c()) {
                        amri2 = amri.c(amrk.c(telephonyManager.createForSubscriptionId(subscriptionId).getSimOperator()));
                    } else {
                        Class[] clsArr = new Class[i6];
                        clsArr[0] = Integer.TYPE;
                        Integer[] numArr = new Integer[i6];
                        numArr[0] = Integer.valueOf(subscriptionId);
                        amri2 = amri.c(amrk.c((String) a(TelephonyManager.class, telephonyManager, "getSimOperator", clsArr, numArr)));
                    }
                    if (amri2.a()) {
                        String str2 = (String) amri2.b();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har = (har) o.b;
                        str2.getClass();
                        har.a |= 1;
                        har.b = str2;
                    }
                    if (!TextUtils.isEmpty(next.getCarrierName())) {
                        String charSequence = next.getCarrierName().toString();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har2 = (har) o.b;
                        charSequence.getClass();
                        har2.a |= 2;
                        har2.c = charSequence;
                    }
                    String num = Integer.toString(next.getDataRoaming());
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har3 = (har) o.b;
                    num.getClass();
                    har3.a |= 4;
                    har3.d = num;
                    if (subscriptionId != -1) {
                        if (subscriptionId == i2) {
                            o.a(haq.VOICE);
                        }
                        if (subscriptionId == i) {
                            o.a(haq.DATA);
                        }
                        if (subscriptionId == i3) {
                            o.a(haq.SMS);
                        }
                    }
                    if (jkr.c()) {
                        amri3 = amri.c(amrk.c(telephonyManager.createForSubscriptionId(subscriptionId).getSubscriberId()));
                    } else {
                        amri3 = amri.c(amrk.c((String) a(TelephonyManager.class, telephonyManager, "getSubscriberId", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)})));
                    }
                    if (awrq.e() && amri3.a()) {
                        amri a2 = a((String) amri3.b());
                        if (a2.a()) {
                            String str3 = (String) a2.b();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            har har4 = (har) o.b;
                            str3.getClass();
                            har4.a |= 16;
                            har4.f = str3;
                        }
                        if (jkr.c()) {
                            amri4 = amri.c(amrk.c(telephonyManager.createForSubscriptionId(subscriptionId).getGroupIdLevel1()));
                        } else {
                            amri4 = amri.c(amrk.c((String) a(TelephonyManager.class, telephonyManager, "getGroupIdLevel1", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)})));
                        }
                        if (amri4.a()) {
                            String str4 = (String) amri4.b();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            har har5 = (har) o.b;
                            str4.getClass();
                            har5.a |= 32;
                            har5.g = str4;
                        }
                    }
                    amri a3 = a(amri3, (int) awrq.n());
                    if (a3.a()) {
                        auay auay = (auay) a3.b();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har6 = (har) o.b;
                        auay.getClass();
                        har6.a |= 64;
                        har6.h = auay;
                    }
                    arrayList.add((har) o.i());
                    i6 = 1;
                }
                amri = amri.b(amzy.a((Collection) arrayList));
            }
        } else {
            amri = ampu.a;
        }
        if (amri.a()) {
            return (List) amri.b();
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) context2.getSystemService("phone");
        aucd o2 = har.i.o();
        String simOperator = telephonyManager2.getSimOperator();
        if (!TextUtils.isEmpty(simOperator)) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            har har7 = (har) o2.b;
            simOperator.getClass();
            har7.a |= 1;
            har7.b = simOperator;
        }
        String simOperatorName = telephonyManager2.getSimOperatorName();
        if (telephonyManager2.getSimState() == 5 && !TextUtils.isEmpty(simOperatorName)) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            har har8 = (har) o2.b;
            simOperatorName.getClass();
            har8.a |= 2;
            har8.c = simOperatorName;
        }
        int i7 = ((har) o2.b).a;
        if ((i7 & 1) == 0 && (i7 & 2) == 0) {
            return amzy.h();
        }
        if (!telephonyManager2.isNetworkRoaming()) {
            str = "0";
        } else {
            str = "1";
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        har har9 = (har) o2.b;
        str.getClass();
        har9.a |= 4;
        har9.d = str;
        o2.a(haq.VOICE);
        o2.a(haq.DATA);
        o2.a(haq.SMS);
        String subscriberId = telephonyManager2.getSubscriberId();
        if (awrq.e()) {
            amri a4 = a(subscriberId);
            if (a4.a()) {
                String str5 = (String) a4.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                har har10 = (har) o2.b;
                str5.getClass();
                har10.a |= 16;
                har10.f = str5;
            }
            int i8 = Build.VERSION.SDK_INT;
            String groupIdLevel1 = telephonyManager2.getGroupIdLevel1();
            if (!TextUtils.isEmpty(groupIdLevel1)) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                har har11 = (har) o2.b;
                groupIdLevel1.getClass();
                har11.a |= 32;
                har11.g = groupIdLevel1;
            }
        }
        amri a5 = a(amri.c(subscriberId), (int) awrq.n());
        if (a5.a()) {
            auay auay2 = (auay) a5.b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            har har12 = (har) o2.b;
            auay2.getClass();
            har12.a |= 64;
            har12.h = auay2;
        }
        return amzy.a((Object) (har) o2.i());
    }

    private static amri a(amri amri, int i) {
        return amri.a() ? amri.b(auay.a(aemg.a((String) amri.b(), i))) : ampu.a;
    }

    static amri d(Context context, boolean z) {
        return z ? amri.c(amrk.c(((TelephonyManager) context.getSystemService("phone")).getSimOperator())) : ampu.a;
    }

    static amri b(Context context, boolean z) {
        if (!z) {
            return ampu.a;
        }
        if (awrq.u()) {
            return jkr.e() ? amri.c(((TelephonyManager) context.getSystemService("phone")).getImei()) : ampu.a;
        }
        return ampu.a;
    }

    static amri a(Context context, amri amri, boolean z) {
        if (z) {
            return amri.a() ? !e.matcher((CharSequence) amri.b()).matches() ? ampu.a : amri : jkr.e() ? amri.c(((TelephonyManager) context.getSystemService("phone")).getMeid()) : ampu.a;
        }
        return ampu.a;
    }

    static amzy b(anax anax) {
        amzt j = amzy.j();
        anhj a2 = anax.iterator();
        while (a2.hasNext()) {
            j.c(((has) a2.next()).c);
        }
        return j.a();
    }

    static amri c(Context context, boolean z) {
        return z ? amri.c(amrk.c(((TelephonyManager) context.getSystemService("phone")).getNetworkOperator())) : ampu.a;
    }

    static amri a(Context context, boolean z) {
        if (z) {
            return (!jkr.e() || !awrq.u()) ? amri.c(((TelephonyManager) context.getSystemService("phone")).getDeviceId()) : ampu.a;
        }
        return ampu.a;
    }

    private static amri a(String str) {
        if (TextUtils.isEmpty(str) || !b.matcher(str).matches()) {
            return ampu.a;
        }
        int k = (int) awrq.k();
        if (k > str.length()) {
            k = str.length();
        }
        String valueOf = String.valueOf(str.substring(0, str.length() - k));
        String valueOf2 = String.valueOf("000000000000000".substring(0, k));
        return amri.b(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    static amzy a(anax anax) {
        amzt j = amzy.j();
        anhj a2 = anax.iterator();
        while (a2.hasNext()) {
            j.c(((has) a2.next()).b);
        }
        return j.a();
    }

    static anax a(Context context) {
        WifiInfo connectionInfo;
        String macAddress;
        String extraInfo;
        anav j = anax.j();
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(9);
        if (!(networkInfo == null || (extraInfo = networkInfo.getExtraInfo()) == null || !d.matcher(extraInfo).matches())) {
            String replace = extraInfo.replace(":", "").replace("-", "");
            aucd o = has.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            has has = (has) o.b;
            "ethernet".getClass();
            int i = has.a | 2;
            has.a = i;
            has.c = "ethernet";
            replace.getClass();
            has.a = i | 1;
            has.b = replace;
            j.b((has) o.i());
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (!(wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null)) {
            String replace2 = macAddress.replace(":", "");
            aucd o2 = has.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            has has2 = (has) o2.b;
            "wifi".getClass();
            int i2 = has2.a | 2;
            has2.a = i2;
            has2.c = "wifi";
            replace2.getClass();
            has2.a = i2 | 1;
            has2.b = replace2;
            j.b((has) o2.i());
        }
        return j.a();
    }

    private static Object a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (NoSuchMethodException e2) {
            a.d("Cannot call method %s on object %s.", e2, str, cls.getName());
            return null;
        } catch (IllegalAccessException e3) {
            a.d("Cannot call method %s on object %s.", e3, str, cls.getName());
            return null;
        } catch (InvocationTargetException e4) {
            a.d("Cannot call method %s on object %s.", e4, str, cls.getName());
            return null;
        }
    }

    static boolean e(Context context) {
        boolean z = true;
        if (jkr.b()) {
            if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) != 0) {
                z = false;
            }
            if (!z) {
                a.e("READ_PHONE_STATE permission not granted, checkin would miss device information.", new Object[0]);
            }
        }
        return z;
    }
}
