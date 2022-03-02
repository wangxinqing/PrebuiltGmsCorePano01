package com.google.android.gms.common.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.Conscrypt;
import java.lang.reflect.Field;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProviderInstallerImpl {
    private static final Object a = new Object();
    private static Provider b;

    private static SSLContext a() {
        int i = 0;
        while (i < 2) {
            try {
                SSLContext instance = SSLContext.getInstance("Default");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        throw new SecurityException("Failed to find SSLContext.Default provider");
    }

    private static void b() {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                SSLContext a2 = a();
                Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
                declaredField.setAccessible(true);
                declaredField.set((Object) null, a2.getSocketFactory());
                Field declaredField2 = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
                declaredField2.setAccessible(true);
                declaredField2.set((Object) null, a2.getServerSocketFactory());
            } catch (IllegalAccessException e) {
                Log.e("ProviderInstaller", "Failed to set socket factory via reflection");
                throw new SecurityException(e);
            } catch (NoSuchFieldException e2) {
                Log.e("ProviderInstaller", "Failed to set socket factory via reflection");
                throw new SecurityException(e2);
            }
        }
        Security.setProperty("ssl.SocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLSocketFactoryImpl");
        Security.setProperty("ssl.ServerSocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLServerSocketFactoryImpl");
    }

    private static native int getNativeCodeVersion();

    public static void insertProvider(Context context) {
        iyl iyl = new iyl(context);
        synchronized (a) {
            if (b == null) {
                a(iyl);
            }
            int insertProviderAt = Security.insertProviderAt(b, 1);
            if (insertProviderAt == 1) {
                b();
                SSLContext a2 = a();
                SSLContext.setDefault(a2);
                HttpsURLConnection.setDefaultSSLSocketFactory(a2.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(awdm.a);
                Log.i("ProviderInstaller", "Installed default security provider GmsCore_OpenSSL");
            } else if (insertProviderAt != -1) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("Failed to install security provider GmsCore_OpenSSL, result: ");
                sb.append(insertProviderAt);
                throw new SecurityException(sb.toString());
            }
        }
    }

    private static void a(Context context) {
        if ("com.google.android.gms".equals(context.getPackageName())) {
            try {
                context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                if (jji.b(context, "conscrypt_gmscore_jni")) {
                    int a2 = jjl.a(jhh.a(context));
                    try {
                        int nativeCodeVersion = getNativeCodeVersion();
                        if (a2 != nativeCodeVersion) {
                            throw new SecurityException(String.format("libgmscore version mismatch (%d vs. %d)", new Object[]{Integer.valueOf(a2), Integer.valueOf(nativeCodeVersion)}));
                        }
                    } catch (UnsatisfiedLinkError e) {
                        throw new SecurityException(e);
                    }
                } else {
                    throw new SecurityException("loadLibrary failed");
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new SecurityException("Failed to find ApplicationInfo", e2);
            }
        } else {
            System.loadLibrary("conscrypt_gmscore_jni");
        }
        Conscrypt.ProviderBuilder newProviderBuilder = Conscrypt.newProviderBuilder();
        newProviderBuilder.setName("GmsCore_OpenSSL");
        newProviderBuilder.defaultTlsProtocol("TLSv1.2");
        b = newProviderBuilder.build();
    }
}
