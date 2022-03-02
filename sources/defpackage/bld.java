package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;

/* renamed from: bld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bld {
    static String a(File file, File file2, String str) {
        String str2;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            String valueOf = String.valueOf(name);
            str2 = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
        } else {
            StringBuilder sb = new StringBuilder(lastIndexOf + 4);
            sb.append(name, 0, lastIndexOf);
            sb.append(str);
            str2 = sb.toString();
        }
        return new File(file2, str2).getPath();
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT < 29;
    }

    public static boolean a(File file, File file2) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            while (file2 != null && !parentFile.equals(file2)) {
                if (file2.setExecutable(true, false)) {
                    file2 = file2.getParentFile();
                } else {
                    String valueOf = String.valueOf(file2.getAbsolutePath());
                    Log.e("DexOptUtils", valueOf.length() == 0 ? new String("Failed to make odex directory world traversable: ") : "Failed to make odex directory world traversable: ".concat(valueOf));
                    return false;
                }
            }
            return true;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 37);
        sb.append("Failed to find dex path parent path: ");
        sb.append(valueOf2);
        Log.e("DexOptUtils", sb.toString());
        return false;
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(File file, boolean z) {
        String str;
        File file2;
        if (!a()) {
            return true;
        }
        if (!file.exists()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            Log.e("DexOptUtils", valueOf.length() == 0 ? new String("Dex file does not exist! ") : "Dex file does not exist! ".concat(valueOf));
            return false;
        }
        try {
            str = file.getCanonicalPath();
        } catch (IOException e) {
            str = file.getAbsolutePath();
        }
        if (!z && !bnx.a(str)) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        bkn.b();
        boolean n = awxs.a.a().n();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    File parentFile = file.getParentFile();
                    String a = blc.a();
                    file2 = new File(parentFile, a.length() == 0 ? new String("oat/") : "oat/".concat(a));
                } catch (NoSuchMethodException e2) {
                    file2 = null;
                }
            } else {
                file2 = new File(file.getParentFile(), blc.a());
            }
            if (file2 != null) {
                if (!file2.exists()) {
                    if (!file2.mkdirs()) {
                        throw new IOException("Failed to create odex directory.");
                    } else if (!n) {
                        if (!a(file, file2)) {
                            throw new IOException("Failed to make world traversable.");
                        }
                    }
                } else if (n) {
                    String absolutePath = file2.getAbsolutePath();
                    Os.chmod(absolutePath, Os.stat(absolutePath).st_mode & (OsConstants.S_IXOTH ^ -1));
                }
                File file3 = new File(a(file, file2, ".dex"));
                if (!file3.exists() || bma.a(file3)) {
                    int threadPriority = Process.getThreadPriority(Process.myTid());
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    try {
                        Process.setThreadPriority(10);
                        bkn.b();
                        if (awxs.a.a().u()) {
                            System.gc();
                        }
                        new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), (String) null, ClassLoader.getSystemClassLoader());
                        StrictMode.setVmPolicy(vmPolicy);
                        Process.setThreadPriority(threadPriority);
                        if (file3.exists()) {
                            File file4 = new File(a(file, file2, ".odex"));
                            if (!file3.setReadable(true, false)) {
                                Log.e("DexOptUtils", "Failed to make odex world readable.");
                                return false;
                            } else if (!file3.renameTo(file4)) {
                                String valueOf2 = String.valueOf(file4.getAbsolutePath());
                                Log.e("DexOptUtils", valueOf2.length() == 0 ? new String("Failed to rename odex to ") : "Failed to rename odex to ".concat(valueOf2));
                                return false;
                            } else if (!n || a(file, file2)) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (!n || a(file, file2)) {
                            return true;
                        } else {
                            return false;
                        }
                    } catch (Throwable th) {
                        StrictMode.setVmPolicy(vmPolicy);
                        Process.setThreadPriority(threadPriority);
                        throw th;
                    }
                } else {
                    String valueOf3 = String.valueOf(file3.getAbsolutePath());
                    Log.e("DexOptUtils", valueOf3.length() == 0 ? new String("Failed to delete tmp odex file: ") : "Failed to delete tmp odex file: ".concat(valueOf3));
                    return false;
                }
            } else {
                throw new IOException("Failed to create odex cache directory. Could not determine odex directory.");
            }
        } catch (Exception e3) {
            if (e3 instanceof RuntimeException) {
                throw ((RuntimeException) e3);
            }
            throw new IOException("Failed to remove world traversable from existing odex directory.");
        } catch (IOException e4) {
            String valueOf4 = String.valueOf(e4);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 33);
            sb.append("Failed to create odex directory: ");
            sb.append(valueOf4);
            Log.e("DexOptUtils", sb.toString());
            return false;
        }
    }
}
