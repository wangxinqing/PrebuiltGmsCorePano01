package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.libs.scheduler.PendingCallback;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aabx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabx {
    public static final /* synthetic */ int j = 0;
    private static final amsv k = amta.a(aabu.a);
    private final Integer A;
    public final aabq a;
    public final nxn b;
    public final int c;
    acrz d;
    public final aabw e;
    final Context f;
    public final Integer g;
    public final qwd h;
    public final int i;
    private final PackageManager l;
    private final aabn m;
    private final String n;
    private final ExecutorService o;
    private boolean p = false;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private final long w;
    private volatile Parcelable x;
    private final String y;
    private final Integer z;

    public aabx(aabq aabq, Context context, aabw aabw, ExecutorService executorService, PackageManager packageManager, aabn aabn, long j2, nxn nxn, int i2) {
        Integer num;
        String str;
        qwd qwd;
        Integer num2;
        this.a = aabq;
        this.n = aabq.f().flattenToShortString();
        this.f = context;
        this.e = aabw;
        this.o = executorService;
        this.l = packageManager;
        this.m = aabn;
        this.w = j2;
        this.b = nxn;
        this.c = i2;
        PackageInfo a2 = a(aabq.n.m);
        if (a2 != null) {
            num = Integer.valueOf(a2.applicationInfo.uid);
        } else {
            num = null;
        }
        this.z = num;
        if (a2 != null) {
            str = a2.packageName;
        } else {
            str = null;
        }
        this.y = str;
        PackageInfo a3 = a(aabq.a.b, 0);
        if (a3 == null || a3.applicationInfo == null) {
            this.g = null;
            this.A = null;
        } else {
            this.g = Integer.valueOf(a3.applicationInfo.uid);
            this.A = Integer.valueOf(a3.applicationInfo.targetSdkVersion);
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 2;
        if (jkr.e() && ((num2 = this.A) == null || num2.intValue() >= 26)) {
            i4 = 3;
        } else if (!this.a.o() ? !axlu.a.a().f() : (!axbn.a.a().G() && axlu.d()) || a(this.a)) {
            if (this.a.a()) {
                i4 = 3;
            }
        }
        this.i = i4;
        if (axbn.a.a().r()) {
            qwc qwc = new qwc();
            qwc.a = true;
            qwc.b = axbn.a.a().s();
            qwd = qwc.a();
        } else {
            qwc qwc2 = new qwc();
            qwc2.a = false;
            qwd = qwc2.a();
        }
        this.h = qwd;
    }

    public static long a() {
        return TimeUnit.SECONDS.toMillis(axlu.f());
    }

    private final synchronized boolean m() {
        if (this.l == null) {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("PackageManager service unavailable, can't execute ");
            sb.append(valueOf);
            Log.w("NetworkScheduler.ATC", sb.toString());
        } else {
            String a2 = a(this.a.f(), this.l);
            int a3 = nwh.a(this.a.j.b);
            if (a3 != 0) {
                if (a3 == 6) {
                    this.x = new PendingCallback((IBinder) new aabv(this));
                    return true;
                }
            }
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(a2)) {
                this.x = new com.google.android.gms.gcm.PendingCallback((IBinder) new ntd(this));
                return true;
            } else if (!"com.google.android.gms.gcm.nts.TASK_READY".equals(a2)) {
                String flattenToShortString = this.a.f().flattenToShortString();
                int k2 = k();
                StringBuilder sb2 = new StringBuilder(String.valueOf(flattenToShortString).length() + 108);
                sb2.append("Unable to resolve correct action against ");
                sb2.append(flattenToShortString);
                sb2.append(" for user #");
                sb2.append(k2);
                sb2.append(" to instantiate callback. Not executing task.");
                Log.e("NetworkScheduler.ATC", sb2.toString());
            } else {
                this.x = new com.google.android.gms.gcm.nts.PendingCallback((IBinder) new nxq(this));
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean n() {
        boolean z2;
        String str = this.y;
        String str2 = str != null ? str : this.a.a.b;
        Integer num = this.g;
        if (num != null) {
            if (num.intValue() == Process.myUid() && axlu.a.a().b()) {
                this.d = new acrz(this.f, 1, o(), (String) null, str2, this.a.a.c);
                this.u = SystemClock.elapsedRealtime();
                this.d.a(this.n, this.w);
                z2 = true;
            }
        }
        this.d = new acrz(this.f, 1, o(), (String) null, str2);
        Integer num2 = this.z;
        String str3 = this.y;
        if (num2 == null) {
            num2 = this.g;
            str3 = this.a.a.b;
        }
        WorkSource workSource = null;
        if (num2 == null) {
            String valueOf = String.valueOf(this.a.f());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append("No PackageInfo for ");
            sb.append(valueOf);
            sb.append(", not blaming for wake lock");
            Log.w("NetworkScheduler.ATC", sb.toString());
        } else {
            Integer num3 = this.g;
            if (num3 != null) {
                if (str3 != null) {
                    workSource = jlr.a(num3.intValue(), str3);
                }
            }
        }
        if (workSource != null) {
            this.d.c(workSource);
            this.u = SystemClock.elapsedRealtime();
            this.d.a(this.n, this.w);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    private final String o() {
        if (!this.a.o()) {
            return "*net_scheduler*";
        }
        if (!axma.b() && !axbn.a.a().V()) {
            return "*net_scheduler*";
        }
        StringBuilder sb = new StringBuilder("*gms_scheduler*");
        if (axbn.a.a().T()) {
            sb.append('/');
            sb.append(this.a.f().flattenToShortString());
        } else if (axbn.a.a().U()) {
            sb.append('/');
            String className = this.a.f().getClassName();
            String str = "";
            String substring = className.startsWith("com.google.android.gms") ? className.substring(23) : className.startsWith("com.google.android.apps") ? className.substring(24) : className.startsWith("com.google.android") ? className.substring(19) : str;
            if (!TextUtils.isEmpty(substring)) {
                int indexOf = substring.indexOf(46);
                if (indexOf >= 0) {
                    str = substring.substring(0, indexOf);
                } else {
                    str = substring;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void p() {
        /*
            r3 = this;
            monitor-enter(r3)
            acrz r0 = r3.d     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.e()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r3.n     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "Trying to release unacquired lock: "
            int r2 = r0.length()     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x001f
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005b }
            r0.<init>(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0023
        L_0x001f:
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x005b }
        L_0x0023:
            java.lang.String r1 = "NetworkScheduler.ATC"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            return
        L_0x002a:
            acrz r0 = r3.d     // Catch:{ RuntimeException -> 0x0039 }
            java.lang.String r1 = r3.n     // Catch:{ RuntimeException -> 0x0039 }
            r0.c((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0039 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0039 }
            r3.v = r0     // Catch:{ RuntimeException -> 0x0039 }
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "Caught exception releasing unacquired lock: "
            int r2 = r0.length()     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0050
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005b }
            r0.<init>(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0054
        L_0x0050:
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x005b }
        L_0x0054:
            java.lang.String r1 = "NetworkScheduler.ATC"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabx.p():void");
    }

    public final synchronized void b(int i2) {
        if (this.p) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append("Called cancelTask for already completed task ");
            sb.append(valueOf);
            sb.append(" :");
            sb.append(qxy.a(i2));
            Log.e("NetworkScheduler.ATC", sb.toString());
            return;
        }
        p();
        this.r = SystemClock.elapsedRealtime();
        this.t = SystemClock.uptimeMillis();
        this.m.a(this.a, aoog.b(this.r - this.q), aoog.b(this.t - this.s));
        this.m.a(this.a, TimeUnit.MILLISECONDS.toSeconds(this.q));
        this.p = true;
    }

    public final boolean b() {
        return this.i == 3;
    }

    public final boolean c() {
        return a(this.a);
    }

    public final synchronized aubn d() {
        if (this.p) {
            long j2 = this.v;
            if (j2 > 0) {
                return augi.a(Math.min(this.w, j2 - this.u));
            }
        }
        return aubn.c;
    }

    public final synchronized aubn e() {
        if (this.p) {
            return augi.a(this.r - this.q);
        }
        return aubn.c;
    }

    public final synchronized long f() {
        return this.q;
    }

    public final synchronized boolean g() {
        boolean z2;
        if (this.p || this.g == null || !m() || !n()) {
            z2 = false;
        } else {
            this.q = SystemClock.elapsedRealtime();
            this.s = SystemClock.uptimeMillis();
            z2 = true;
        }
        return z2;
    }

    public final synchronized boolean h() {
        return this.p;
    }

    public final synchronized Intent i() {
        Intent putExtra;
        putExtra = new Intent("com.google.android.gms.gcm.ACTION_EXECUTE_TASK").setPackage(this.f.getPackageName()).putExtra("tag", this.a.e()).putExtra("component", this.a.f()).putExtra("callback", this.x).putExtra("extras", this.a.n.m);
        if (axbn.g()) {
            putExtra.putExtra("user_serial", k());
        }
        if (axlu.e()) {
            putExtra.putExtra("max_exec_duration", l());
        }
        a(putExtra);
        return putExtra;
    }

    public final synchronized Intent j() {
        Intent a2;
        a2 = a(this.l, this.a.f(), this.a.e(), this.x, this.a.n.m, l(), this.h.a());
        a(a2);
        return a2;
    }

    public final int k() {
        return (int) this.a.a.e;
    }

    /* access modifiers changed from: package-private */
    public final long l() {
        return TimeUnit.MILLISECONDS.toSeconds(this.w);
    }

    public final String toString() {
        return this.a.toString();
    }

    public static Intent a(PackageManager packageManager, ComponentName componentName, String str, Parcelable parcelable, Bundle bundle, long j2, Bundle bundle2) {
        Intent intent = null;
        if (packageManager != null) {
            String a2 = a(componentName, packageManager);
            if (a2 == null) {
                String valueOf = String.valueOf(componentName.flattenToShortString());
                Log.e("NetworkScheduler.ATC", valueOf.length() == 0 ? new String("Error finding compatible intent-filter to handle SERVICE_ACTION_EXECUTE_TASK for ") : "Error finding compatible intent-filter to handle SERVICE_ACTION_EXECUTE_TASK for ".concat(valueOf));
                return null;
            }
            intent = new Intent(a2);
            intent.setComponent(componentName).putExtra("tag", str).putExtra("callback", parcelable).putExtra("extras", bundle);
            if (axlu.e()) {
                intent.putExtra("max_exec_duration", j2);
            }
            if (bundle2 != null && !bundle2.isEmpty()) {
                intent.putExtra("engine_flags", bundle2);
            }
        }
        return intent;
    }

    private final PackageInfo a(Bundle bundle) {
        if (bundle != null) {
            try {
                String string = new Bundle(bundle).getString("callingPackage");
                if (!TextUtils.isEmpty(string)) {
                    PackageInfo a2 = a(string, 64);
                    if (a2 == null) {
                        String valueOf = String.valueOf(string);
                        Log.e("NetworkScheduler.ATC", valueOf.length() == 0 ? new String("Provided calling package not found: ") : "Provided calling package not found: ".concat(valueOf));
                        return null;
                    } else if (hya.a(this.f).a(a2)) {
                        return a2;
                    }
                }
                return null;
            } catch (BadParcelableException e2) {
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof ClassNotFoundException) {
                    return null;
                }
                throw e3;
            }
        }
        return null;
    }

    private final PackageInfo a(String str, int i2) {
        PackageManager packageManager = this.l;
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(str, i2);
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return null;
    }

    private static String a(ComponentName componentName, PackageManager packageManager) {
        if (a("com.google.android.gms.gcm.ACTION_TASK_READY", componentName, packageManager)) {
            return "com.google.android.gms.gcm.ACTION_TASK_READY";
        }
        if (a("com.google.android.gms.gcm.nts.TASK_READY", componentName, packageManager)) {
            return "com.google.android.gms.gcm.nts.TASK_READY";
        }
        return null;
    }

    private final void a(Intent intent) {
        if (intent != null && this.a.q()) {
            intent.putParcelableArrayListExtra("triggered_uris", new ArrayList(this.a.d()));
        }
    }

    private static boolean a(aabq aabq) {
        int i2 = aabq.n.f;
        return i2 == 1 || (i2 == 2 && ((Boolean) k.a()).booleanValue());
    }

    private static boolean a(String str, ComponentName componentName, PackageManager packageManager) {
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent(str).setPackage(componentName.getPackageName()), 0);
        if (queryIntentServices != null) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo.name.equals(componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void a(int i2) {
        if (this.p) {
            String valueOf = String.valueOf(this.a.f());
            String e2 = this.a.e();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(e2).length());
            sb.append("Received callback from client for task that is already complete. ");
            sb.append(valueOf);
            sb.append(" ");
            sb.append(e2);
            Log.e("NetworkScheduler.ATC", sb.toString());
            return;
        }
        b(7);
        this.o.execute(new aabt(this, i2));
    }

    public final synchronized void a(PrintWriter printWriter) {
        String formatElapsedTime = DateUtils.formatElapsedTime((SystemClock.elapsedRealtime() - this.q) / 1000);
        String flattenToShortString = this.a.f().flattenToShortString();
        String e2 = this.a.e();
        long j2 = this.a.a.e;
        int length = String.valueOf(flattenToShortString).length();
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(e2).length() + String.valueOf(formatElapsedTime).length());
        sb.append("   ");
        sb.append(flattenToShortString);
        sb.append(":");
        sb.append(e2);
        sb.append(",");
        sb.append(j2);
        sb.append(" running: ");
        sb.append(formatElapsedTime);
        printWriter.println(sb.toString());
    }
}
