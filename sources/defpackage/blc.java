package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: blc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class blc {
    public static String a() {
        try {
            try {
                String str = (String) Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke((Object) null, new Object[0]);
                if (str != null) {
                    return str;
                }
                throw new NoSuchMethodException("Error retrieving current instruction set.");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("DexOptUtils", "Failed to call dalvik.system.VMRuntime#getCurrentInstructionSet", e);
                throw new NoSuchMethodException("dalvik.system.VMRuntime#getCurrentInstructionSet could not be found.");
            }
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.w("DexOptUtils", "dalvik.system.VMRuntime#getCurrentInstructionSet is unsupported.", e2);
            throw new NoSuchMethodException("dalvik.system.VMRuntime#getCurrentInstructionSet could not be found.");
        }
    }
}
