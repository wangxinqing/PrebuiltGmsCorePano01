package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: aabj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabj {
    private final Context a;
    private final ntv b;

    public aabj(Context context, ntv ntv) {
        this.a = context;
        this.b = ntv;
    }

    public static final void a(PrintWriter printWriter, String[] strArr, Collection collection, aabn aabn) {
        printWriter.println();
        aabn.a(printWriter);
        if (axbn.d()) {
            aabg.a().e.a.a(printWriter);
        }
        amzh f = amzh.f();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nxc nxc = ((aabq) it.next()).a;
            long j = nxc.e;
            String str = nxc.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append("u");
            sb.append((int) j);
            sb.append("|");
            sb.append(str);
            f.add(sb.toString());
        }
        printWriter.println("\nTask count by user and package:");
        for (anfd anfd : f.e()) {
            String str2 = (String) anfd.a;
            int a2 = anfd.a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(a2);
            printWriter.println(sb2.toString());
        }
        List<String> list = null;
        for (String str3 : strArr) {
            if (!"--endpoints".equals(str3)) {
                if (str3.contains("--")) {
                    break;
                } else if (list != null) {
                    list.add(str3);
                }
            } else {
                list = new ArrayList<>();
            }
        }
        if (list == null) {
            list = amzy.a((Object) ".");
        }
        long a3 = aabn.a();
        StringBuilder sb3 = new StringBuilder(73);
        sb3.append("GmsTaskScheduler execution stats over the last ");
        sb3.append(a3);
        sb3.append(" secs\n");
        printWriter.println(sb3.toString());
        printWriter.println("Pending:\n");
        for (String str4 : list) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                aabq aabq = (aabq) it2.next();
                if (aabq.f().flattenToShortString().contains(str4)) {
                    String valueOf = String.valueOf(aabq);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb4.append("(scheduled) ");
                    sb4.append(valueOf);
                    printWriter.println(sb4.toString());
                    if (aabq.g == 0) {
                        printWriter.println("Not yet run.");
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j2 = aabq.g;
                        StringBuilder sb5 = new StringBuilder(40);
                        sb5.append("Last executed ");
                        sb5.append((currentTimeMillis - j2) / 1000);
                        sb5.append("s ago.");
                        printWriter.println(sb5.toString());
                    }
                    printWriter.println();
                }
            }
        }
        aabn.a(printWriter, (List) list);
    }

    public static final aabq b(aabq aabq) {
        long j = 0;
        if (aabq.g == 0) {
            Log.e("NetworkScheduler", "Rescheduling a periodic should not have a last run-time of 0.");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = elapsedRealtime - (System.currentTimeMillis() - aabq.g);
        if (currentTimeMillis > 0 && currentTimeMillis < aabq.i()) {
            j = aabq.i() - currentTimeMillis;
        }
        aabq a2 = aabq.a(aabq, elapsedRealtime + j);
        a2.h = 0;
        return a2;
    }

    public static final aabq c(aabq aabq) {
        aabq a2 = aabq.a(aabq, (SystemClock.elapsedRealtime() + ((long) (aabs.a(aabq) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))) - ((Long) aabs.a(aabq.n).a()).longValue());
        a2.h = aabq.h + 1;
        return a2;
    }

    public final void a(aabi aabi, ntx ntx) {
        qyk qyk = new qyk();
        qyk.a(ntx.b);
        qyk.b(ntx.a);
        qyk.b = 23;
        qyk.a |= 8;
        aabi.b(qyk.a());
        aacu.a(this.a, ntx);
    }

    public final void a(aabq aabq) {
        if (aabq.f) {
            ntx j = aabq.j();
            PackageManager c = this.b.c(j.b);
            if (c == null || c.checkPermission("android.permission.RECEIVE_BOOT_COMPLETED", j.a) != 0) {
                String str = j.a;
                String e = aabq.e();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 146 + String.valueOf(e).length());
                sb.append(str);
                sb.append(" requested task be persisted for tag: '");
                sb.append(e);
                sb.append("' but does not hold the permission android.permission.RECEIVE_BOOT_COMPLETED. This task won't be persisted.");
                Log.e("NetworkScheduler", sb.toString());
                aabq.t();
            }
            Bundle bundle = aabq.n.m;
            if (bundle != null) {
                try {
                    new Bundle(bundle).size();
                } catch (BadParcelableException e2) {
                    aabq.t();
                    String str2 = j.a;
                    String e3 = aabq.e();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 108 + String.valueOf(e3).length());
                    sb2.append(str2);
                    sb2.append(" requested task be persisted for tag: '");
                    sb2.append(e3);
                    sb2.append("' but task contains custom Parcelables. This task won't be persisted.");
                    Log.w("NetworkScheduler", sb2.toString());
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof ClassNotFoundException) {
                        aabq.t();
                        String str3 = j.a;
                        String e5 = aabq.e();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 129 + String.valueOf(e5).length());
                        sb3.append(str3);
                        sb3.append(" requested task be persisted for tag: '");
                        sb3.append(e5);
                        sb3.append("' but task contains Parcelables referencing unknown classes. This task won't be persisted.");
                        Log.w("NetworkScheduler", sb3.toString());
                        return;
                    }
                    throw e4;
                }
            }
        }
    }

    public final boolean a(aabq aabq, int i) {
        long j;
        if (aabq.o()) {
            j = axmd.a.a().h();
        } else {
            j = axmd.a.a().i();
        }
        if (i >= ((int) j)) {
            String valueOf = String.valueOf(aabq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
            sb.append("Too many tasks scheduled for this package. Not scheduling: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler", sb.toString());
            return false;
        } else if (aabq.a.b.isEmpty()) {
            String valueOf2 = String.valueOf(aabq);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Invalid package name specified, not scheduling: ");
            sb2.append(valueOf2);
            Log.e("NetworkScheduler", sb2.toString());
            return false;
        } else if (!aabq.p() || aabq.i() >= aabq.h()) {
            String e = aabq.e();
            if (e == null || e.length() > 100) {
                String e2 = aabq.e();
                String valueOf3 = String.valueOf(aabq);
                StringBuilder sb3 = new StringBuilder(String.valueOf(e2).length() + 44 + String.valueOf(valueOf3).length());
                sb3.append("Dropping task - invalid tag specified: ");
                sb3.append(e2);
                sb3.append(" for ");
                sb3.append(valueOf3);
                Log.e("NetworkScheduler", sb3.toString());
                return false;
            }
            if (jkr.e()) {
                try {
                    if (aabq.j().a(this.b, 0).targetSdkVersion >= 26 && !aabq.a()) {
                        String valueOf4 = String.valueOf(aabq.a.b);
                        Log.e("NetworkScheduler", valueOf4.length() == 0 ? new String("Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Package: ") : "Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Package: ".concat(valueOf4));
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                }
            }
            return true;
        } else {
            Log.e("NetworkScheduler", String.format("Invalid task: %s. Latest runtime %d earlier than earliest %d", new Object[]{aabq, Long.valueOf(aabq.i()), Long.valueOf(aabq.h())}));
            return false;
        }
    }
}
