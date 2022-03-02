package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: jji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jji {
    public static String a(Context context, String str) {
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            Context i = hxz.i(context);
            if (context != null) {
                context = i;
            } else {
                Log.w("GmsNativeLibraryLoader", "Google Play service not installed.");
                return null;
            }
        }
        b(context);
        if (context.getClassLoader() instanceof BaseDexClassLoader) {
            return ((BaseDexClassLoader) context.getClassLoader()).findLibrary(str);
        }
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(context.getClassLoader(), new Object[]{str});
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Reflective call to findLibrary failed: ");
            } else {
                "Reflective call to findLibrary failed: ".concat(valueOf);
            }
            return null;
        }
    }

    public static boolean b(Context context) {
        File[] listFiles;
        if (a(context)) {
            ClassLoader classLoader = context.getClassLoader();
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                try {
                    context = context.createPackageContext("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GmsNativeLibraryLoader", "Google Play service not installed.");
                    return false;
                }
            }
            Context d = aekv.d(context);
            ArrayList arrayList = new ArrayList();
            File c = c(d);
            if (!(c == null || !c.exists() || (listFiles = c.listFiles()) == null)) {
                Collections.addAll(arrayList, listFiles);
            }
            String str = d.getApplicationInfo().nativeLibraryDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    arrayList.add(file);
                }
            }
            if (arrayList.size() > 0) {
                try {
                    if (jkr.e()) {
                        Object obj = a((Object) classLoader, "pathList").get(classLoader);
                        jjh.a(arrayList);
                        Field a = a(obj, "nativeLibraryDirectories");
                        Field a2 = a(obj, "systemNativeLibraryDirectories");
                        Field a3 = a(obj, "nativeLibraryPathElements");
                        Method declaredMethod = obj.getClass().getDeclaredMethod("makePathElements", new Class[]{List.class});
                        declaredMethod.setAccessible(true);
                        List list = (List) a.get(obj);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            File file2 = (File) arrayList.get(i);
                            if (!list.contains(file2)) {
                                list.add(0, file2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.addAll((List) a2.get(obj));
                        a3.set(obj, (Object[]) declaredMethod.invoke((Object) null, new Object[]{arrayList2}));
                    } else if (jkr.b()) {
                        Object obj2 = a((Object) classLoader, "pathList").get(classLoader);
                        jjh.a(arrayList);
                        Field a4 = a(obj2, "nativeLibraryDirectories");
                        Field a5 = a(obj2, "systemNativeLibraryDirectories");
                        Field a6 = a(obj2, "nativeLibraryPathElements");
                        Method declaredMethod2 = obj2.getClass().getDeclaredMethod("makePathElements", new Class[]{List.class, File.class, List.class});
                        declaredMethod2.setAccessible(true);
                        List list2 = (List) a4.get(obj2);
                        int size2 = arrayList.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            File file3 = (File) arrayList.get(i2);
                            if (!list2.contains(file3)) {
                                list2.add(0, file3);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(list2);
                        arrayList3.addAll((List) a5.get(obj2));
                        a6.set(obj2, (Object[]) declaredMethod2.invoke((Object) null, new Object[]{arrayList3, null, new ArrayList()}));
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        Object obj3 = a((Object) classLoader, "pathList").get(classLoader);
                        int i4 = Build.VERSION.SDK_INT;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= Build.SUPPORTED_64_BIT_ABIS.length) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (((File) it.next()).getName().contains("64")) {
                                        it.remove();
                                    }
                                }
                            } else if (!Build.SUPPORTED_64_BIT_ABIS[i5].equals(Build.CPU_ABI)) {
                                i5++;
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (!((File) it2.next()).getName().contains("64")) {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                        int size3 = arrayList.size();
                        File[] fileArr = new File[size3];
                        ListIterator listIterator = arrayList.listIterator();
                        while (listIterator.hasNext()) {
                            fileArr[listIterator.previousIndex()] = (File) listIterator.next();
                        }
                        Field a7 = a(obj3, "nativeLibraryDirectories");
                        Object[] objArr = (Object[]) a7.get(obj3);
                        Class<?> componentType = objArr.getClass().getComponentType();
                        int length = objArr.length;
                        Object[] objArr2 = (Object[]) Array.newInstance(componentType, length + size3);
                        System.arraycopy(fileArr, 0, objArr2, 0, size3);
                        System.arraycopy(objArr, 0, objArr2, size3, length);
                        a7.set(obj3, objArr2);
                    }
                    return true;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                    Log.e("GmsNativeLibraryLoader", "Could not install GmsCore nativeLibraryDirectories.", e2);
                }
            }
        }
        return false;
    }

    private static File c(Context context) {
        return aekv.d(context).getDir("extracted_libs", 0);
    }

    private static boolean c(Context context, String str) {
        try {
            if ("com.google.android.gms".equals(ModuleManager.get(context).getCurrentModuleApk().apkPackageName)) {
                return false;
            }
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                return false;
            }
        } catch (IllegalStateException e2) {
            return false;
        } catch (Exception e3) {
            Log.w("GmsNativeLibraryLoader", "chimera load failed", e3);
            return false;
        }
    }

    public static Field a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(str.length() + 20 + String.valueOf(valueOf).length());
        sb.append("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(valueOf);
        throw new NoSuchFieldException(sb.toString());
    }

    public static boolean a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName()) && (!jkr.b() || (context.getApplicationInfo().flags & 268435456) > 0);
    }

    public static boolean b(Context context, String str) {
        Context context2;
        String[] strArr;
        int i;
        String str2;
        String str3 = str;
        if (c(context, str)) {
            return true;
        }
        String str4 = " in ";
        if (!a(context)) {
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                UnsatisfiedLinkError unsatisfiedLinkError = e;
                String obj = context.getClassLoader().toString();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length());
                sb.append("Unable to locate ");
                sb.append(str3);
                sb.append(str4);
                sb.append(obj);
                Log.e("GmsNativeLibraryLoader", sb.toString(), unsatisfiedLinkError);
            }
        }
        if (b(context)) {
            String a = a(context, str);
            if (a != null) {
                try {
                    System.load(a);
                    return true;
                } catch (UnsatisfiedLinkError e2) {
                    Log.w("GmsNativeLibraryLoader", a.length() == 0 ? new String("Unable to load native code from existing library ") : "Unable to load native code from existing library ".concat(a), e2);
                }
            } else {
                String obj2 = context.getClassLoader().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj2).length());
                sb2.append("Unable to locate ");
                sb2.append(str3);
                sb2.append(str4);
                sb2.append(obj2);
                Log.w("GmsNativeLibraryLoader", sb2.toString());
            }
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            try {
                context2 = context.createPackageContext("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("GmsNativeLibraryLoader", "Google Play service not installed.");
                return false;
            }
        } else {
            context2 = context;
        }
        ApplicationInfo applicationInfo = context2.getApplicationInfo();
        int i2 = Build.VERSION.SDK_INT;
        String[] strArr2 = Build.SUPPORTED_ABIS;
        int length = strArr2.length;
        int i3 = 0;
        while (i3 < length) {
            String str5 = strArr2[i3];
            if (str5 != null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 6);
                sb3.append("lib");
                sb3.append(str3);
                sb3.append(".so");
                String sb4 = sb3.toString();
                File c = c(context2);
                strArr = strArr2;
                String str6 = File.separator;
                i = length;
                str2 = str4;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(sb4).length());
                sb5.append(str5);
                sb5.append(str6);
                sb5.append(sb4);
                File file = new File(c, sb5.toString());
                if (file.exists()) {
                    try {
                        System.load(file.getAbsolutePath());
                        return true;
                    } catch (UnsatisfiedLinkError e4) {
                        String valueOf = String.valueOf(file.getAbsolutePath());
                        Log.w("GmsNativeLibraryLoader", valueOf.length() == 0 ? new String("Unable to load native code from existing library ") : "Unable to load native code from existing library ".concat(valueOf), e4);
                    }
                } else {
                    String str7 = applicationInfo.nativeLibraryDir;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 6);
                    sb6.append("lib");
                    sb6.append(str3);
                    sb6.append(".so");
                    File file2 = new File(str7, sb6.toString());
                    if (!file2.exists()) {
                        continue;
                    } else {
                        try {
                            System.load(file2.getAbsolutePath());
                            return true;
                        } catch (UnsatisfiedLinkError e5) {
                            String valueOf2 = String.valueOf(file2.getAbsolutePath());
                            Log.w("GmsNativeLibraryLoader", valueOf2.length() == 0 ? new String("Unable to load native code from ") : "Unable to load native code from ".concat(valueOf2), e5);
                        }
                    }
                }
            } else {
                str2 = str4;
                strArr = strArr2;
                i = length;
            }
            i3++;
            strArr2 = strArr;
            str4 = str2;
            length = i;
        }
        String str8 = str4;
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e6) {
            UnsatisfiedLinkError unsatisfiedLinkError2 = e6;
            String obj3 = context2.getClassLoader().toString();
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj3).length());
            sb7.append("Unable to locate ");
            sb7.append(str3);
            sb7.append(str8);
            sb7.append(obj3);
            Log.e("GmsNativeLibraryLoader", sb7.toString(), unsatisfiedLinkError2);
            return false;
        }
    }
}
