package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ihy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihy extends isu {
    private static final anax b = anax.a("adid_settings.xml", "event_attestation_settings.xml", "LockboxOptInSettings.xml");

    public ihy(Context context) {
        super(context);
    }

    private final void b(Thread thread, Throwable th) {
        BufferedInputStream bufferedInputStream;
        if (!"SharedPreferencesImpl-load".equals(thread.getName())) {
            return;
        }
        if ((th instanceof ArrayIndexOutOfBoundsException) || (th instanceof ClassCastException)) {
            Log.i("WAUncaughtExcptnHndlr", "Deleting corrupt shared preferences files");
            File file = new File(this.a.getApplicationContext().getApplicationInfo().dataDir, "shared_prefs");
            String[] list = file.list();
            if (list == null || (r2 = list.length) == 0) {
                Log.e("WAUncaughtExcptnHndlr", "No files in the shared_prefs folder.");
                return;
            }
            for (String str : list) {
                if (!str.endsWith(".xml")) {
                    String valueOf = String.valueOf(str);
                    Log.w("WAUncaughtExcptnHndlr", valueOf.length() == 0 ? new String("Non-XML file: ") : "Non-XML file: ".concat(valueOf));
                } else {
                    File file2 = new File(file, str);
                    try {
                        ClassLoader classLoader = getClass().getClassLoader();
                        iva.a((Object) classLoader, (Object) "Couldn't get classLoader. Using bootstrap class loader?");
                        Class<?> loadClass = classLoader.loadClass("com.android.internal.util.XmlUtils");
                        Method method = loadClass.getMethod("readMapXml", new Class[]{InputStream.class});
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                        method.invoke(loadClass, new Object[]{bufferedInputStream});
                        jjt.a((Closeable) bufferedInputStream);
                        String valueOf2 = String.valueOf(str);
                        Log.i("WAUncaughtExcptnHndlr", valueOf2.length() == 0 ? new String("Keeping good file: ") : "Keeping good file: ".concat(valueOf2));
                    } catch (InvocationTargetException e) {
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw e;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        file2.delete();
                        String valueOf3 = String.valueOf(file2.getName());
                        Log.i("WAUncaughtExcptnHndlr", valueOf3.length() == 0 ? new String("Deleting corrupt shared pref file: ") : "Deleting corrupt shared pref file: ".concat(valueOf3));
                    } catch (ClassCastException e3) {
                        String valueOf4 = String.valueOf(file2.getName());
                        Log.e("WAUncaughtExcptnHndlr", valueOf4.length() == 0 ? new String("Corrupted shared pref file: ") : "Corrupted shared pref file: ".concat(valueOf4), e3);
                        if (awyg.a.a().d() && !b.contains(str)) {
                            String valueOf5 = String.valueOf(str);
                            Log.i("WAUncaughtExcptnHndlr", valueOf5.length() == 0 ? new String("Deleting corrupt shared pref file: ") : "Deleting corrupt shared pref file: ".concat(valueOf5));
                            file2.delete();
                        }
                    } catch (Throwable th2) {
                        String valueOf6 = String.valueOf(str);
                        Log.e("WAUncaughtExcptnHndlr", valueOf6.length() == 0 ? new String("Caught unexpected exception trying to read file: ") : "Caught unexpected exception trying to read file: ".concat(valueOf6), th2);
                    }
                }
            }
        }
    }

    public final boolean a(Thread thread, Throwable th) {
        b(thread, th);
        return false;
    }
}
