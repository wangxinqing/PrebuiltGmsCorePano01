package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: wiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wiz {
    public static final Object a = new Object();
    public static String b = "0";
    private static final String c = wiz.class.getSimpleName();
    private static final hxk d = hxk.d;
    private static mcx e = null;

    private wiz() {
    }

    @Deprecated
    public static void a(Context context) {
        Class<wiz> cls = wiz.class;
        synchronized (a) {
            if (!a()) {
                iva.a((Object) context, (Object) "Context must not be null");
                try {
                    cls.getClassLoader().loadClass("org.chromium.net.CronetEngine");
                    hxz.l(context);
                    mcx a2 = mcx.a(context, mcx.a, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = a2.d.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        int intValue = ((Integer) method.invoke((Object) null, new Object[0])).intValue();
                        b = (String) method2.invoke((Object) null, new Object[0]);
                        if (intValue >= 3) {
                            e = a2;
                            return;
                        }
                        Intent b2 = d.b(context, 2, "cr");
                        String str = b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                        sb.append("Google Play Services update is required. The API Level of the client is ");
                        sb.append(3);
                        sb.append(". The API Level of the implementation is ");
                        sb.append(intValue);
                        sb.append(". The Cronet implementation version is ");
                        sb.append(str);
                        throw new hxx(2, sb.toString(), b2);
                    }
                    Log.e(c, "ImplVersion class is missing from Cronet module.");
                    throw new hxw();
                } catch (ClassNotFoundException e2) {
                    Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((hxw) new hxw().initCause(e2));
                } catch (mct e3) {
                    Log.e(c, "Unable to load Cronet module", e3);
                    throw ((hxw) new hxw().initCause(e3));
                } catch (Exception e4) {
                    Log.e(c, "Unable to read Cronet version from the Cronet module ", e4);
                    throw ((hxw) new hxw().initCause(e4));
                }
            }
        }
    }

    public static mcx b() {
        mcx mcx;
        synchronized (a) {
            mcx = e;
        }
        return mcx;
    }

    public static boolean a() {
        return b() != null;
    }
}
