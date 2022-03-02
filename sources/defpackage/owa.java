package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: owa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owa {
    public final Context a;
    public final prp b;
    public final oyq c;
    private final oyt d;

    public owa(Context context, prp prp, oyq oyq, oyt oyt) {
        this.a = context;
        this.b = prp;
        this.c = oyq;
        this.d = oyt;
    }

    private static Intent a() {
        return new Intent().setAction("com.google.firebase.appindexing.UPDATE_INDEX");
    }

    public static boolean b(Context context, Intent intent) {
        return !a((List) context.getPackageManager().queryBroadcastReceivers(intent, 0)).isEmpty();
    }

    public static Intent a(String str) {
        return a().setPackage(str);
    }

    private static List a(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    public static Set a(Context context) {
        HashSet hashSet = new HashSet();
        Intent a2 = a();
        for (ResolveInfo resolveInfo : a((List) context.getPackageManager().queryIntentServices(a2, 0))) {
            if (resolveInfo == null) {
                oso.e("Missing resolveInfo");
            } else {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo == null) {
                    oso.e("Missing serviceInfo");
                } else {
                    String str = serviceInfo.packageName;
                    if (str == null) {
                        oso.e("Missing packageName");
                    } else {
                        hashSet.add(str);
                    }
                }
            }
        }
        for (ResolveInfo resolveInfo2 : a((List) context.getPackageManager().queryBroadcastReceivers(a2, 0))) {
            if (resolveInfo2 == null) {
                oso.e("Missing resolveInfo");
            } else {
                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                if (activityInfo == null) {
                    oso.e("Missing activityInfo");
                } else {
                    String str2 = activityInfo.packageName;
                    if (str2 == null) {
                        oso.e("Missing packageName");
                    } else {
                        hashSet.add(str2);
                    }
                }
            }
        }
        if (((Boolean) ozx.aN.c()).booleanValue()) {
            hashSet.add("com.google.android.gms");
        } else {
            hashSet.remove("com.google.android.gms");
        }
        return hashSet;
    }

    public static boolean a(Context context, Intent intent) {
        return !a((List) context.getPackageManager().queryIntentServices(intent, 0)).isEmpty();
    }

    public final boolean a(String str, long j, aomb aomb, boolean z) {
        aolz aolz;
        if (!((Boolean) ozx.aM.c()).booleanValue()) {
            aolz = aolz.FLAG_DISABLED;
        } else {
            try {
                if (jim.b(this.a, str)) {
                    aolz = aolz.PACKAGE_STOPPED;
                } else if (!this.a.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled) {
                    aolz = aolz.PACKAGE_DISABLED;
                } else if (!ozx.c(str)) {
                    aolz = aolz.FLAG_DISABLED;
                } else {
                    int i = (z || this.b.p(str) == 0) ? 1 : 2;
                    Intent a2 = a(str);
                    a2.putExtra("com.google.firebase.appindexing.extra.REASON", i);
                    if (!"com.google.android.gms".equals(str)) {
                        if (b(this.a, a2)) {
                            try {
                                this.a.sendBroadcast(a2);
                                aolz = aolz.BROADCAST_SENT;
                            } catch (RuntimeException e) {
                                this.d.a("RebuildScheduler sendBroadcast", e, axrp.f());
                            }
                        }
                        if (axsj.a.a().b() && jkr.e()) {
                            try {
                                if (this.a.getPackageManager().getPackageInfo(str, 0).applicationInfo.targetSdkVersion >= 26) {
                                    aolz = aolz.NOT_ALLOWED;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                this.d.a("RebuildScheduler start service", e2, axrp.f());
                                aolz = aolz.PACKAGE_MISSING;
                            }
                        }
                        try {
                            if (this.a.startService(a2) == null) {
                                aolz = aolz.START_SERVICE_FAILED;
                            }
                        } catch (SecurityException e3) {
                            aolz = aolz.NO_PERMISSION;
                        } catch (IllegalStateException e4) {
                            aolz = aolz.NOT_ALLOWED;
                        } catch (RuntimeException e5) {
                            this.d.a("RebuildScheduler startService", e5, axrp.f());
                            aolz = aolz.START_SERVICE_UNKNOWN_ERROR;
                        }
                    } else if (((Boolean) ozx.aN.c()).booleanValue()) {
                        try {
                            this.a.sendBroadcast(a2);
                        } catch (RuntimeException e6) {
                            this.d.a("RebuildScheduler sendBroadcast to GMSCore", e6, axrp.f());
                        }
                    } else {
                        aolz = aolz.FLAG_DISABLED;
                    }
                    aolz = aolz.SERVICE_STARTED;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                aolz = aolz.PACKAGE_MISSING;
            }
        }
        oso.b("Sending UPDATE_INDEX: package=%s source=%s result=%s", str, aomb, aolz);
        this.c.a(str, aomb, aolz);
        if (aolz != aolz.SERVICE_STARTED && aolz != aolz.BROADCAST_SENT) {
            return false;
        }
        prp prp = this.b;
        synchronized (prp.g) {
            out d2 = prp.d(str);
            aucd aucd = (aucd) d2.c(5);
            aucd.a((aucj) d2);
            if (j != ((out) aucd.b).m) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out out = (out) aucd.b;
                out out2 = out.n;
                out.a |= 2048;
                out.m = j;
                prp.a(str, (out) aucd.i());
            }
        }
        return true;
    }
}
