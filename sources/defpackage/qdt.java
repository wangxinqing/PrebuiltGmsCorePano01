package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdt {
    static String a = null;
    static boolean b = false;
    static int c = 0;
    static BroadcastReceiver d = null;
    final Context e;
    final Map f = new nz();
    Messenger g;
    Messenger h;
    MessengerCompat i;
    PendingIntent j;

    public qdt(Context context) {
        this.e = context;
    }

    public static synchronized String a() {
        String num;
        synchronized (qdt.class) {
            int i2 = c;
            c = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent.getExtras();
                        extras.putString("registration_id", group2);
                        a(group, (Object) extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("InstanceID", sb.toString());
                    return;
                }
                String str = null;
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        Log.w("InstanceID", stringExtra2.length() == 0 ? new String("Unexpected structured response ") : "Unexpected structured response ".concat(stringExtra2));
                    }
                    if (split.length > 2) {
                        String str2 = split[2];
                        String str3 = split[3];
                        if (str3.startsWith(":")) {
                            str = str2;
                            stringExtra2 = str3.substring(1);
                        } else {
                            str = str2;
                            stringExtra2 = str3;
                        }
                    } else {
                        stringExtra2 = "UNKNOWN";
                    }
                    intent.putExtra("error", stringExtra2);
                }
                if (str == null) {
                    synchronized (getClass()) {
                        for (String str4 : this.f.keySet()) {
                            Object obj = this.f.get(str4);
                            this.f.put(str4, stringExtra2);
                            a(obj, (Object) stringExtra2);
                        }
                    }
                    return;
                }
                a(str, (Object) stringExtra2);
            }
        }
    }

    public static String a(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!jkr.e()) {
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
                if (a(packageManager, resolveInfo.serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    b = false;
                    return a;
                }
            }
        }
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo2 : queryBroadcastReceivers) {
                if (a(packageManager, resolveInfo2.activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    b = true;
                    return a;
                }
            }
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (a(packageManager, "com.google.android.gms")) {
            b = jkr.e();
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
        return null;
    }

    private static final void a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    private final void a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f.get(str);
            this.f.put(str, obj);
            a(obj2, obj);
        }
    }

    private static boolean a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            a = applicationInfo.packageName;
            int i2 = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    private static boolean a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + str2.length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.os.Bundle a(android.os.Bundle r9) {
        /*
            r8 = this;
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            java.lang.String r1 = a()
            java.lang.Class r2 = r8.getClass()
            monitor-enter(r2)
            java.util.Map r3 = r8.f     // Catch:{ all -> 0x017f }
            r3.put(r1, r0)     // Catch:{ all -> 0x017f }
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            android.os.Messenger r2 = r8.g
            if (r2 != 0) goto L_0x002d
            android.content.Context r2 = r8.e
            a((android.content.Context) r2)
            android.os.Messenger r2 = new android.os.Messenger
            qdr r3 = new qdr
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r8, r4)
            r2.<init>(r3)
            r8.g = r2
        L_0x002d:
            java.lang.String r2 = a
            if (r2 == 0) goto L_0x0177
            android.content.Intent r2 = new android.content.Intent
            boolean r3 = b
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x003c
        L_0x003a:
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
        L_0x003c:
            r2.<init>(r3)
            java.lang.String r3 = a
            r2.setPackage(r3)
            r2.putExtras(r9)
            r8.a((android.content.Intent) r2)
            java.lang.String r9 = java.lang.String.valueOf(r1)
            int r9 = r9.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r9 = r9 + 5
            r3.<init>(r9)
            java.lang.String r9 = "|ID|"
            r3.append(r9)
            r3.append(r1)
            java.lang.String r9 = "|"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r9)
            java.lang.String r9 = java.lang.String.valueOf(r1)
            int r9 = r9.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r9 = r9 + 5
            r3.<init>(r9)
            java.lang.String r9 = "|ID|"
            r3.append(r9)
            r3.append(r1)
            java.lang.String r9 = "|"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "X-kid"
            r2.putExtra(r3, r9)
            java.lang.String r9 = a
            java.lang.String r3 = "com.google.android.gsf"
            boolean r9 = r3.equals(r9)
            java.lang.String r3 = "useGsf"
            java.lang.String r3 = r2.getStringExtra(r3)
            if (r3 == 0) goto L_0x00aa
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r3)
        L_0x00aa:
            android.os.Messenger r3 = r8.h
            if (r3 == 0) goto L_0x00c2
            android.os.Messenger r3 = r8.g
            java.lang.String r4 = "google.messenger"
            r2.putExtra(r4, r3)
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r4 = r8.h     // Catch:{ RemoteException -> 0x00c1 }
            r4.send(r3)     // Catch:{ RemoteException -> 0x00c1 }
            goto L_0x0121
        L_0x00c1:
            r3 = move-exception
        L_0x00c2:
            if (r9 != 0) goto L_0x00f3
            android.os.Messenger r9 = r8.g
            java.lang.String r3 = "google.messenger"
            r2.putExtra(r3, r9)
            java.lang.String r9 = "messenger2"
            java.lang.String r3 = "1"
            r2.putExtra(r9, r3)
            com.google.android.gms.iid.MessengerCompat r9 = r8.i
            if (r9 == 0) goto L_0x00e3
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            com.google.android.gms.iid.MessengerCompat r3 = r8.i     // Catch:{ RemoteException -> 0x00e2 }
            r3.a(r9)     // Catch:{ RemoteException -> 0x00e2 }
            goto L_0x0121
        L_0x00e2:
            r9 = move-exception
        L_0x00e3:
            boolean r9 = b
            if (r9 != 0) goto L_0x00ed
            android.content.Context r9 = r8.e
            r9.startService(r2)
            goto L_0x0121
        L_0x00ed:
            android.content.Context r9 = r8.e
            r9.sendBroadcast(r2)
            goto L_0x0121
        L_0x00f3:
            java.lang.Class<qdt> r9 = defpackage.qdt.class
            monitor-enter(r9)
            android.content.BroadcastReceiver r3 = d     // Catch:{ all -> 0x0174 }
            if (r3 != 0) goto L_0x011b
            qds r3 = new qds     // Catch:{ all -> 0x0174 }
            r3.<init>(r8)     // Catch:{ all -> 0x0174 }
            d = r3     // Catch:{ all -> 0x0174 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTRATION"
            r3.<init>(r4)     // Catch:{ all -> 0x0174 }
            android.content.Context r4 = r8.e     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0174 }
            r3.addCategory(r4)     // Catch:{ all -> 0x0174 }
            android.content.Context r4 = r8.e     // Catch:{ all -> 0x0174 }
            android.content.BroadcastReceiver r5 = d     // Catch:{ all -> 0x0174 }
            java.lang.String r6 = "com.google.android.c2dm.permission.SEND"
            r7 = 0
            r4.registerReceiver(r5, r3, r6, r7)     // Catch:{ all -> 0x0174 }
        L_0x011b:
            monitor-exit(r9)     // Catch:{ all -> 0x0174 }
            android.content.Context r9 = r8.e
            r9.sendBroadcast(r2)
        L_0x0121:
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.block(r2)
            java.lang.Class r0 = r8.getClass()
            monitor-enter(r0)
            java.util.Map r9 = r8.f     // Catch:{ all -> 0x0171 }
            java.lang.Object r9 = r9.remove(r1)     // Catch:{ all -> 0x0171 }
            boolean r1 = r9 instanceof android.os.Bundle     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x0139
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ all -> 0x0171 }
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            return r9
        L_0x0139:
            boolean r1 = r9 instanceof java.lang.String     // Catch:{ all -> 0x0171 }
            if (r1 != 0) goto L_0x0169
            java.lang.String r1 = "InstanceID"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0171 }
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0171 }
            int r2 = r2.length()     // Catch:{ all -> 0x0171 }
            int r2 = r2 + 12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0171 }
            r3.<init>(r2)     // Catch:{ all -> 0x0171 }
            java.lang.String r2 = "No response "
            r3.append(r2)     // Catch:{ all -> 0x0171 }
            r3.append(r9)     // Catch:{ all -> 0x0171 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0171 }
            android.util.Log.w(r1, r9)     // Catch:{ all -> 0x0171 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x0171 }
            throw r9     // Catch:{ all -> 0x0171 }
        L_0x0169:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0171 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0171 }
            r1.<init>(r9)     // Catch:{ all -> 0x0171 }
            throw r1     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0171 }
            throw r9
        L_0x0174:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0174 }
            throw r0
        L_0x0177:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x017f:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdt.a(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Intent intent) {
        if (this.j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.j = PendingIntent.getBroadcast(this.e, 0, intent2, 0);
        }
        intent.putExtra("app", this.j);
    }
}
