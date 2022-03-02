package defpackage;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncAdapterType;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: aeku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeku {
    public final Context a;
    public final aeks b;

    public aeku() {
    }

    public aeku(Context context, aeks aeks) {
        this.a = context;
        this.b = aeks;
    }

    public static boolean a(Context context, String str) {
        AuthenticatorDescription authenticatorDescription;
        aekt aekt;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        AuthenticatorDescription[] authenticatorTypes = AccountManager.get(context).getAuthenticatorTypes();
        HashSet hashSet = new HashSet();
        for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
            if ("com.android.contacts".equals(syncAdapterType.authority)) {
                hashSet.add(syncAdapterType.accountType);
            }
        }
        HashMap hashMap = new HashMap();
        for (AuthenticatorDescription authenticatorDescription2 : authenticatorTypes) {
            if (hashSet.contains(authenticatorDescription2.type)) {
                hashMap.put(authenticatorDescription2.type, authenticatorDescription2);
            }
        }
        aeku aeku = new aeku(context, new aeks(hashMap));
        if (str == null || "com.google".equals(str) || (authenticatorDescription = (AuthenticatorDescription) aeku.b.a.get(str)) == null) {
            return false;
        }
        try {
            String str2 = authenticatorDescription.packageName;
            aekt = new aekt(aeku.a);
            aekt.a();
            PackageManager packageManager = aekt.b.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.content.SyncAdapter").setPackage(str2), 132);
            if (queryIntentServices != null) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null) {
                        for (String loadXmlMetaData : aekt.a) {
                            XmlResourceParser loadXmlMetaData2 = serviceInfo.loadXmlMetaData(packageManager, loadXmlMetaData);
                            if (loadXmlMetaData2 != null) {
                                aekt.c = loadXmlMetaData2;
                            }
                        }
                    }
                }
            }
            aekt.a();
            boolean z = true;
            if (aekt.c != null) {
                while (true) {
                    int next = aekt.c.next();
                    if (next != 2) {
                        if (next == 1) {
                            break;
                        }
                    } else {
                        String name = aekt.c.getName();
                        if (!"ContactsAccountType".equals(name)) {
                            if ("ContactsSource".equals(name)) {
                            }
                        }
                        aekt.d = true;
                        int depth = aekt.c.getDepth();
                        while (true) {
                            int next2 = aekt.c.next();
                            if (next2 != 3 || aekt.c.getDepth() > depth) {
                                if (next2 == 1) {
                                    break;
                                } else if (next2 == 2 && aekt.c.getDepth() == depth + 1 && "EditSchema".equals(aekt.c.getName())) {
                                    aekt.e = true;
                                }
                            } else {
                                break;
                            }
                        }
                        aekt.f = true;
                    }
                }
            }
            if (aekt.c == null || !aekt.f || !aekt.d || aekt.e) {
                z = false;
            }
            aekt.close();
            return z;
        } catch (Exception e) {
            Log.e("ReadOnlyPred", str.length() == 0 ? new String("Failed to detect readonly state for ") : "Failed to detect readonly state for ".concat(str), e);
            return false;
        } catch (Throwable th) {
            aekt.close();
            throw th;
        }
    }
}
