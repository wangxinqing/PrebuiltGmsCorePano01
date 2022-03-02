package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: mcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mcx {
    public static final mcw a = new mcn();
    public static final mcw b = new mco();
    public static final mcw c = new mcp();
    private static Boolean e;
    private static mda f;
    private static mdd g;
    private static String h;
    private static int i = -1;
    private static final ThreadLocal j = new ThreadLocal();
    private static final mcu k = new mcm();
    public final Context d;

    private mcx(Context context) {
        iva.a((Object) context);
        this.d = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + str.length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.e("DynamiteModule", valueOf2.length() == 0 ? new String("Failed to load module descriptor class: ") : "Failed to load module descriptor class: ".concat(valueOf2));
            return 0;
        }
    }

    public static Cursor b(Context context, String str, boolean z) {
        return context.getContentResolver().query(a(str, z), (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            android.database.Cursor r2 = b(r2, r3, r4)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            if (r2 == 0) goto L_0x0049
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r3 == 0) goto L_0x0049
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r3 <= 0) goto L_0x0041
            java.lang.Class<mcx> r4 = defpackage.mcx.class
            monitor-enter(r4)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r1 = 2
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x003e }
            h = r1     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "loaderVersion"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x003e }
            if (r1 < 0) goto L_0x002c
            int r1 = r2.getInt(r1)     // Catch:{ all -> 0x003e }
            i = r1     // Catch:{ all -> 0x003e }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            java.lang.ThreadLocal r4 = j     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            mcr r4 = (defpackage.mcr) r4     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r4 == 0) goto L_0x0041
            android.database.Cursor r1 = r4.a     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r1 != 0) goto L_0x0041
            r4.a = r2     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            goto L_0x0043
        L_0x003e:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r3     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
        L_0x0041:
            r0 = r2
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            return r3
        L_0x0049:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Failed to retrieve remote module version."
            android.util.Log.w(r3, r4)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            mct r3 = new mct     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            java.lang.String r4 = "Failed to connect to dynamite module ContentResolver."
            r3.<init>(r4)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            throw r3     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
        L_0x0058:
            r3 = move-exception
            r0 = r2
            goto L_0x0070
        L_0x005b:
            r3 = move-exception
            r0 = r2
            goto L_0x0061
        L_0x005e:
            r3 = move-exception
            goto L_0x0070
        L_0x0060:
            r3 = move-exception
        L_0x0061:
            boolean r2 = r3 instanceof defpackage.mct     // Catch:{ all -> 0x006e }
            if (r2 != 0) goto L_0x006d
            mct r2 = new mct     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "V2 version check failed"
            r2.<init>(r4, r3)     // Catch:{ all -> 0x006e }
            throw r2     // Catch:{ all -> 0x006e }
        L_0x006d:
            throw r3     // Catch:{ all -> 0x006e }
        L_0x006e:
            r2 = move-exception
            r3 = r2
        L_0x0070:
            if (r0 == 0) goto L_0x0075
            r0.close()
        L_0x0075:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcx.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static mcx b(Context context, String str) {
        Log.i("DynamiteModule", str.length() == 0 ? new String("Selected local version of ") : "Selected local version of ".concat(str));
        return new mcx(context.getApplicationContext());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0077=Splitter:B:30:0x0077, B:45:0x009e=Splitter:B:45:0x009e} */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<mcx> r0 = defpackage.mcx.class
            monitor-enter(r0)     // Catch:{ all -> 0x014c }
            java.lang.Boolean r1 = e     // Catch:{ all -> 0x0149 }
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x00a2 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x0085
            int r4 = c(r8, r9, r10)     // Catch:{ mct -> 0x007a }
            java.lang.String r5 = h     // Catch:{ mct -> 0x007a }
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = h     // Catch:{ mct -> 0x007a }
            boolean r5 = r5.isEmpty()     // Catch:{ mct -> 0x007a }
            if (r5 != 0) goto L_0x0077
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ mct -> 0x007a }
            r6 = 29
            if (r5 >= r6) goto L_0x005f
            mcq r5 = new mcq     // Catch:{ mct -> 0x007a }
            java.lang.String r6 = h     // Catch:{ mct -> 0x007a }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ mct -> 0x007a }
            r5.<init>(r6, r7)     // Catch:{ mct -> 0x007a }
            goto L_0x006a
        L_0x005f:
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ mct -> 0x007a }
            java.lang.String r6 = h     // Catch:{ mct -> 0x007a }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ mct -> 0x007a }
            r5.<init>(r6, r7)     // Catch:{ mct -> 0x007a }
        L_0x006a:
            a((java.lang.ClassLoader) r5)     // Catch:{ mct -> 0x007a }
            r1.set(r3, r5)     // Catch:{ mct -> 0x007a }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ mct -> 0x007a }
            e = r5     // Catch:{ mct -> 0x007a }
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            return r4
        L_0x0077:
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            return r4
        L_0x007a:
            r4 = move-exception
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a2 }
            r1.set(r3, r4)     // Catch:{ all -> 0x00a2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a2 }
            goto L_0x00a0
        L_0x0085:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a2 }
            r1.set(r3, r4)     // Catch:{ all -> 0x00a2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a2 }
            goto L_0x00a0
        L_0x0090:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a2 }
            if (r4 != r1) goto L_0x0099
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a2 }
            goto L_0x00a0
        L_0x0099:
            a((java.lang.ClassLoader) r4)     // Catch:{ mct -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r1 = move-exception
        L_0x009e:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a2 }
        L_0x00a0:
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
            goto L_0x00d0
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a9, IllegalAccessException -> 0x00a7, NoSuchFieldException -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            goto L_0x00aa
        L_0x00a9:
            r1 = move-exception
        L_0x00aa:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0149 }
            int r3 = r3.length()     // Catch:{ all -> 0x0149 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r4.<init>(r3)     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x0149 }
            r4.append(r1)     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0149 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x0149 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0149 }
        L_0x00d0:
            e = r1     // Catch:{ all -> 0x0149 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x014c }
            r1 = 0
            if (r0 != 0) goto L_0x0123
            mda r0 = a((android.content.Context) r8)     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0121
            int r2 = r0.getIDynamiteLoaderVersion()     // Catch:{ RemoteException -> 0x0100 }
            r3 = 2
            if (r2 >= r3) goto L_0x00f7
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r3 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r2, r3)     // Catch:{ RemoteException -> 0x0100 }
            mby r2 = defpackage.mbz.a((java.lang.Object) r8)     // Catch:{ RemoteException -> 0x0100 }
            int r1 = r0.getModuleVersion2(r2, r9, r10)     // Catch:{ RemoteException -> 0x0100 }
            goto L_0x0122
        L_0x00f7:
            mby r2 = defpackage.mbz.a((java.lang.Object) r8)     // Catch:{ RemoteException -> 0x0100 }
            int r1 = r0.getModuleVersion2NoCrashUtils(r2, r9, r10)     // Catch:{ RemoteException -> 0x0100 }
            goto L_0x0121
        L_0x0100:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x014c }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x014c }
            int r2 = r9.length()     // Catch:{ all -> 0x014c }
            if (r2 != 0) goto L_0x0119
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x014c }
            r9.<init>(r0)     // Catch:{ all -> 0x014c }
            goto L_0x011d
        L_0x0119:
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x014c }
        L_0x011d:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x014c }
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            return r1
        L_0x0123:
            int r8 = c(r8, r9, r10)     // Catch:{ mct -> 0x0128 }
            return r8
        L_0x0128:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x014c }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x014c }
            int r2 = r9.length()     // Catch:{ all -> 0x014c }
            if (r2 != 0) goto L_0x0141
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x014c }
            r9.<init>(r0)     // Catch:{ all -> 0x014c }
            goto L_0x0145
        L_0x0141:
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x014c }
        L_0x0145:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x014c }
            return r1
        L_0x0149:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            throw r9     // Catch:{ all -> 0x014c }
        L_0x014c:
            r9 = move-exception
            boolean r10 = defpackage.jim.a()
            if (r10 != 0) goto L_0x0156
            defpackage.jis.a(r8, r9)
        L_0x0156:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcx.a(android.content.Context, java.lang.String, boolean):int");
    }

    public static Uri a(String str, boolean z) {
        String str2 = !z ? "api" : "api_force_staging";
        StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
        sb.append("content://com.google.android.gms.chimera/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    public static mcx a(Context context, mcw mcw, String str) {
        mcx b2;
        ThreadLocal threadLocal;
        Boolean bool;
        mcx mcx;
        mby mby;
        mdd mdd;
        Boolean valueOf;
        mby mby2;
        Class<mcx> cls = mcx.class;
        mcr mcr = (mcr) j.get();
        mcr mcr2 = new mcr();
        j.set(mcr2);
        try {
            mcv a2 = mcw.a(context, str, k);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a2.c;
            if (!(i4 == 0 || (i4 == -1 && a2.a == 0))) {
                boolean z = true;
                if (!(i4 == 1 && a2.b == 0)) {
                    if (i4 == -1) {
                        b2 = b(context, str);
                        Cursor cursor = mcr2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal = j;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a2.b;
                            try {
                                synchronized (cls) {
                                    bool = e;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (cls) {
                                            mdd = g;
                                        }
                                        if (mdd != null) {
                                            mcr mcr3 = (mcr) j.get();
                                            if (mcr3 == null || mcr3.a == null) {
                                                throw new mct("No result cursor");
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = mcr3.a;
                                            mbz.a((Object) null);
                                            synchronized (cls) {
                                                if (i < 2) {
                                                    z = false;
                                                }
                                                valueOf = Boolean.valueOf(z);
                                            }
                                            if (!valueOf.booleanValue()) {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                mby2 = mdd.loadModule2(mbz.a((Object) applicationContext), str, i5, mbz.a((Object) cursor2));
                                            } else {
                                                mby2 = mdd.loadModule2NoCrashUtils(mbz.a((Object) applicationContext), str, i5, mbz.a((Object) cursor2));
                                            }
                                            Context context2 = (Context) mbz.a(mby2);
                                            if (context2 != null) {
                                                mcx = new mcx(context2);
                                            } else {
                                                throw new mct("Failed to get module context");
                                            }
                                        } else {
                                            throw new mct("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        Log.i("DynamiteModule", sb3.toString());
                                        mda a3 = a(context);
                                        if (a3 != null) {
                                            if (a3.getIDynamiteLoaderVersion() < 2) {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                mby = a3.createModuleContext(mbz.a((Object) context), str, i5);
                                            } else {
                                                mby = a3.createModuleContextNoCrashUtils(mbz.a((Object) context), str, i5);
                                            }
                                            if (mbz.a(mby) != null) {
                                                mcx = new mcx((Context) mbz.a(mby));
                                            } else {
                                                throw new mct("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new mct("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    Cursor cursor3 = mcr2.a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    j.set(mcr);
                                    return mcx;
                                }
                                throw new mct("Failed to determine which loading route to use.");
                            } catch (RemoteException e2) {
                                throw new mct("Failed to load remote module.", e2);
                            } catch (mct e3) {
                                throw e3;
                            } catch (Throwable th) {
                                if (!jim.a()) {
                                    jis.a(context, th);
                                    throw new mct("Failed to load remote module.", th);
                                }
                                throw th;
                            }
                        } catch (mct e4) {
                            String valueOf2 = String.valueOf(e4.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() == 0 ? new String("Failed to load remote module: ") : "Failed to load remote module: ".concat(valueOf2));
                            int i6 = a2.a;
                            if (i6 == 0 || mcw.a(context, str, new mcs(i6)).c != -1) {
                                throw new mct("Remote load failed. No local fallback found.", e4);
                            }
                            b2 = b(context, str);
                            Cursor cursor4 = mcr2.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            threadLocal = j;
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(0);
                        throw new mct(sb4.toString());
                    }
                    threadLocal.set(mcr);
                    return b2;
                }
            }
            int i7 = a2.a;
            int i8 = a2.b;
            StringBuilder sb5 = new StringBuilder(91);
            sb5.append("No acceptable module found. Local version is ");
            sb5.append(i7);
            sb5.append(" and remote version is ");
            sb5.append(i8);
            sb5.append(".");
            throw new mct(sb5.toString());
        } catch (Throwable th2) {
            Cursor cursor5 = mcr2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            j.set(mcr);
            throw th2;
        }
    }

    private static mda a(Context context) {
        synchronized (mcx.class) {
            if (f == null) {
                try {
                    mda asInterface = mcz.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (asInterface != null) {
                        f = asInterface;
                        return asInterface;
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("DynamiteModule", valueOf.length() == 0 ? new String("Failed to load IDynamiteLoader from GmsCore: ") : "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf));
                }
            } else {
                mda mda = f;
                return mda;
            }
        }
        return null;
    }

    private static void a(ClassLoader classLoader) {
        try {
            g = mdc.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new mct("Failed to instantiate dynamite loader", e2);
        }
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.d.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new mct(str.length() == 0 ? new String("Failed to instantiate module class: ") : "Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
