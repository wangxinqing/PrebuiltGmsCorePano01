package com.google.android.gms.instantapps.routing;

import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppsChimeraContentProvider extends ContentProvider {
    public static final qfn a = new qfn("IAContentProvider");
    private static int f = jhg.a;
    Map b;
    public qex c;
    qfl d;
    public qjt e;
    private qfg g;
    private qhj h;

    private final qfc a() {
        PackageInfo packageInfo;
        int callingUid = Binder.getCallingUid();
        String a2 = this.h.a(callingUid);
        boolean z = false;
        if (!TextUtils.isEmpty(a2)) {
            try {
                packageInfo = this.h.b(a2, 0);
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Unable to load package for uid ");
                sb.append(callingUid);
                throw new SecurityException(sb.toString());
            }
        } else {
            packageInfo = null;
        }
        if (packageInfo == null) {
            try {
                packageInfo = getContext().getPackageManager().getPackageInfo(getCallingPackage(), 0);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new SecurityException();
            }
        } else {
            z = true;
        }
        return new qfc(callingUid, packageInfo, z);
    }

    private final void b() {
        boolean z;
        if (this.b == null) {
            qfq a2 = qfq.a(getContext());
            ArrayList arrayList = new ArrayList();
            jiq jiq = a2.b;
            qkk qkk = new qkk(a2.i, a2.j, a2.k, qfe.a());
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(new qki(qkk));
            arrayList2.add(new qkj(qkk));
            arrayList.addAll(arrayList2);
            qij qij = new qij(getContext(), a2.h, a2.l, a2.o, a2.u);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new qhl(qij));
            arrayList3.add(new qhm(qij));
            arrayList3.add(new qhn(qij));
            arrayList3.add(new qho(qij));
            arrayList3.add(new qhv(qij));
            arrayList3.add(new qhz(qij));
            arrayList3.add(new qhp(qij));
            arrayList3.add(new qhr(qij));
            arrayList3.add(new qhq(qij));
            arrayList3.add(new qhw(qij));
            arrayList3.add(new qhy(qij));
            arrayList3.add(new qia(qij));
            arrayList3.add(new qib(qij));
            arrayList3.add(new qif(qij));
            arrayList3.add(new qig(qij));
            arrayList3.add(new qih(qij));
            arrayList3.add(new qhs(qij));
            arrayList3.add(new qhx(qij));
            arrayList3.add(new qie(qij));
            arrayList3.add(new qht(qij));
            arrayList3.add(new qhu(qij));
            arrayList3.add(new qid(qij));
            arrayList.addAll(arrayList3);
            arrayList.add(new qkh(this));
            nz nzVar = new nz(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qfd qfd = (qfd) arrayList.get(i);
                if (((qfd) nzVar.put(qfd.a, qfd)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                String str = qfd.a;
                iva.b(z, str.length() == 0 ? new String("Multiple provider methods found for ") : "Multiple provider methods found for ".concat(str));
            }
            this.b = nzVar;
            this.c = a2.k;
            this.g = a2.p;
            this.h = a2.h;
            this.e = a2.g;
            this.d = a2.o;
        }
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (qfq.a(getContext()).r.a()) {
                b();
                qfd qfd = (qfd) this.b.get(str);
                if (qfd != null) {
                    qfc a2 = a();
                    PackageInfo packageInfo = a2.b;
                    this.c.a(packageInfo.packageName, packageInfo.versionCode);
                    qev a3 = this.c.a();
                    Bundle a4 = qfd.a(a2, str2, bundle);
                    String valueOf = String.valueOf(str);
                    a3.a(valueOf.length() == 0 ? new String("IAContentProvider.") : "IAContentProvider.".concat(valueOf));
                    return a4;
                }
                a.b("Unrecognized method: %s", str);
            }
            return null;
        } catch (RuntimeException e2) {
            a.a(e2);
            qex qex = this.c;
            if (qex != null) {
                qev a5 = qex.a();
                String valueOf2 = String.valueOf(str);
                a5.a(valueOf2.length() == 0 ? new String("IAContentProvider.Failure.") : "IAContentProvider.Failure.".concat(valueOf2));
            }
            if (!(e2 instanceof SecurityException)) {
                qfp.a(getContext(), e2.getMessage(), e2, a);
                return null;
            }
            throw e2;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        qgw a2;
        qfq a3 = qfq.a(getContext());
        if (!a3.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", new Object[]{Boolean.valueOf(aecx.a())});
        printWriter.printf("Accounts: %s\n", new Object[]{Arrays.toString(a3.c.d())});
        printWriter.printf("Opt-in account: %s\n", new Object[]{a3.c.a()});
        printWriter.printf("Opt-in state: %s\n", new Object[]{Integer.valueOf(a3.d.a())});
        printWriter.println("Event Log:");
        ListIterator b2 = this.g.iterator();
        while (b2.hasNext()) {
            printWriter.println((String) b2.next());
        }
        a3.g.a(printWriter);
        qiz qiz = a3.l;
        printWriter.println("\n=== AppOverrides dump ===");
        try {
            qiz.b();
            try {
                qgx b3 = qiz.c.b();
                try {
                    a2 = qiz.c.a(b3);
                    a2.c();
                    while (a2.e()) {
                        String a4 = qiz.a(a2.a());
                        if (a4 != null) {
                            byte[] b4 = a2.b();
                            aubs b5 = aubs.b();
                            long currentTimeMillis = System.currentTimeMillis();
                            qip qip = ((qil) aucj.a((aucj) qil.b, b4, b5)).a;
                            if (qip == null) {
                                qip = qip.b;
                            }
                            long j = qip.a;
                            long j2 = j - currentTimeMillis;
                            long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                            printWriter.printf("Package: %s\n", new Object[]{a4});
                            printWriter.printf("\tExpiration (millis): %d\n", new Object[]{Long.valueOf(j)});
                            printWriter.printf("\tSnooze remaining: %dm%ds\n", new Object[]{Long.valueOf(minutes), Long.valueOf(seconds % 60)});
                            if (j == Long.MAX_VALUE) {
                                printWriter.printf("\tThis package is permanently snoozed\n", new Object[0]);
                            }
                        }
                        a2.d();
                    }
                    a2.close();
                    b3.close();
                } catch (Throwable th) {
                    b3.close();
                    throw th;
                }
            } catch (auda e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("AppOverrides dump exception: ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            printWriter.println("=== End of AppOverrides dump ===");
            return;
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("AppOverrides dump exception: ");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
            return;
        }
        throw th;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        if (!qfq.a(getContext()).r.a()) {
            return false;
        }
        b();
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        qgw a2;
        try {
            if (qfq.a(getContext()).r.a()) {
                b();
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1) {
                    a.b("Invalid URI for query: %s", uri);
                    return null;
                }
                String str3 = pathSegments.get(0);
                if (!"snoozedApps".equals(str3)) {
                    a.b("Unrecognized query path: %s", uri);
                    return null;
                }
                qfc a3 = a();
                if (a(a3.a)) {
                    PackageInfo packageInfo = a3.b;
                    this.c.a(packageInfo.packageName, packageInfo.versionCode);
                    qev a4 = this.c.a();
                    qiz qiz = ((qhk) this.h).a;
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"packageName", "appOverrides"});
                    try {
                        qiz.b();
                        qgx b2 = qiz.c.b();
                        try {
                            a2 = qiz.c.a(b2);
                            a2.c();
                            while (a2.e()) {
                                String a5 = qiz.a(a2.a());
                                if (a5 != null) {
                                    matrixCursor.newRow().add("packageName", a5).add("appOverrides", a2.b());
                                }
                                a2.d();
                            }
                            a2.close();
                            b2.close();
                        } catch (Throwable th) {
                            b2.close();
                            throw th;
                        }
                    } catch (IOException e2) {
                        qiz.a.a(e2, "QuerySnoozedApps exception while accessing levelDb", new Object[0]);
                    }
                    String valueOf = String.valueOf(str3);
                    a4.a(valueOf.length() == 0 ? new String("IAContentProvider.") : "IAContentProvider.".concat(valueOf));
                    return matrixCursor;
                }
            }
            return null;
            throw th;
        } catch (RuntimeException e3) {
            a.a(e3);
            qex qex = this.c;
            if (qex != null) {
                qev a6 = qex.a();
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb.append("IAContentProvider.Failure.");
                sb.append(valueOf2);
                a6.a(sb.toString());
            }
            if (!(e3 instanceof SecurityException)) {
                qfp.a(getContext(), e3.getMessage(), e3, a);
                return null;
            }
            throw e3;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final boolean a(int i) {
        return i == f || this.d.b(i) || this.d.a(i);
    }
}
