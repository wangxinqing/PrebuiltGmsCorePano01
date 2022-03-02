package com.google.android.gms.org.conscrypt;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.ct.CTLogStore;
import com.google.android.gms.org.conscrypt.ct.CTPolicy;
import dalvik.system.BlockGuard;
import dalvik.system.CloseGuard;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class Platform {
    private static final String TAG = "Conscrypt";
    public static final /* synthetic */ int a = 0;
    private static Method m_getCurveName;

    static {
        try {
            Method declaredMethod = ECParameterSpec.class.getDeclaredMethod("getCurveName", new Class[0]);
            m_getCurveName = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
        }
    }

    private Platform() {
    }

    public static void blockGuardOnNetwork() {
        BlockGuard.getThreadPolicy().onNetwork();
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket)) {
            if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        }
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket)) {
            if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
    }

    private static boolean checkTrusted(String str, X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str2, Class cls, Object obj) {
        try {
            x509TrustManager.getClass().getMethod(str, new Class[]{X509Certificate[].class, String.class, cls}).invoke(x509TrustManager, new Object[]{x509CertificateArr, str2, obj});
            return true;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            return false;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof CertificateException) {
                throw ((CertificateException) e2.getCause());
            }
            throw new RuntimeException(e2.getCause());
        }
    }

    public static void closeGuardClose(Object obj) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).close();
    }

    public static CloseGuard closeGuardGet() {
        int i = Build.VERSION.SDK_INT;
        return CloseGuard.get();
    }

    public static void closeGuardOpen(Object obj, String str) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).open(str);
    }

    public static void closeGuardWarnIfOpen(Object obj) {
        int i = Build.VERSION.SDK_INT;
        ((CloseGuard) obj).warnIfOpen();
    }

    static ConscryptEngineSocket createEngineSocket(SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(sSLParametersImpl);
        }
        return new ConscryptEngineSocket(sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(sSLParametersImpl);
    }

    public static GCMParameters fromGCMParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
            return null;
        }
        try {
            return new GCMParameters(((Integer) cls.getMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) cls.getMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Could not fetch GCM parameters", e4.getTargetException());
        }
    }

    static AlgorithmParameterSpec fromGCMParameters(AlgorithmParameters algorithmParameters) {
        Class cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls != null) {
            try {
                return algorithmParameters.getParameterSpec(cls);
            } catch (InvalidParameterSpecException e2) {
            }
        }
        return null;
    }

    private static Class getClass(String... strArr) {
        int i = 0;
        while (i < strArr.length) {
            try {
                return Class.forName(strArr[i]);
            } catch (Exception e) {
                i++;
            }
        }
        return null;
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        Method method = m_getCurveName;
        if (method != null) {
            try {
                return (String) method.invoke(eCParameterSpec, new Object[0]);
            } catch (Exception e) {
            }
        }
        return null;
    }

    static KeyStore getDefaultCertKeyStore() {
        KeyStore instance = KeyStore.getInstance("AndroidCAStore");
        try {
            instance.load((InputStream) null, (char[]) null);
            return instance;
        } catch (IOException e) {
            throw new KeyStoreException(e);
        } catch (CertificateException e2) {
            throw new KeyStoreException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new KeyStoreException(e3);
        }
    }

    public static String getDefaultProviderName() {
        return TAG;
    }

    public static String getEndpointIdentificationAlgorithm(SSLParameters sSLParameters) {
        return null;
    }

    public static FileDescriptor getFileDescriptor(Socket socket) {
        try {
            Field declaredField = Socket.class.getDeclaredField("impl");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(socket);
            Field declaredField2 = SocketImpl.class.getDeclaredField("fd");
            declaredField2.setAccessible(true);
            return (FileDescriptor) declaredField2.get(obj);
        } catch (Exception e) {
            throw new RuntimeException("Can't get FileDescriptor from socket", e);
        }
    }

    public static FileDescriptor getFileDescriptorFromSSLSocket(AbstractConscryptSocket abstractConscryptSocket) {
        return getFileDescriptor(abstractConscryptSocket);
    }

    public static String getHostStringFromInetSocketAddress(InetSocketAddress inetSocketAddress) {
        if (Build.VERSION.SDK_INT <= 23) {
            return null;
        }
        try {
            return (String) InetSocketAddress.class.getDeclaredMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            return null;
        }
    }

    public static String getOriginalHostNameFromInetAddress(InetAddress inetAddress) {
        if (Build.VERSION.SDK_INT > 27) {
            try {
                Method declaredMethod = InetAddress.class.getDeclaredMethod("holder", new Class[0]);
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Class.forName("java.net.InetAddress$InetAddressHolder").getDeclaredMethod("getOriginalHostName", new Class[0]);
                declaredMethod2.setAccessible(true);
                String str = (String) declaredMethod2.invoke(declaredMethod.invoke(inetAddress, new Object[0]), new Object[0]);
                return str == null ? inetAddress.getHostAddress() : str;
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to get originalHostName", e);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e2) {
            }
        }
        return inetAddress.getHostAddress();
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24) {
                setParametersSniHostname(sSLParameters, sSLParametersImpl, abstractConscryptSocket);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void getSSLParametersFromImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParameters.getClass().getMethod("setEndpointIdentificationAlgorithm", new Class[]{String.class}).invoke(sSLParameters, new Object[]{sSLParametersImpl.getEndpointIdentificationAlgorithm()});
        sSLParameters.getClass().getMethod("setUseCipherSuitesOrder", new Class[]{Boolean.TYPE}).invoke(sSLParameters, new Object[]{Boolean.valueOf(sSLParametersImpl.getUseCipherSuitesOrder())});
    }

    private static String getSniHostnameFromParams(SSLParameters sSLParameters) {
        List<SNIServerName> list = (List) sSLParameters.getClass().getMethod("getServerNames", new Class[0]).invoke(sSLParameters, new Object[0]);
        if (list == null) {
            return null;
        }
        for (SNIServerName sNIServerName : list) {
            if (sNIServerName.getType() == 0) {
                return ((SNIHostName) sNIServerName).getAsciiName();
            }
        }
        return null;
    }

    public static boolean isCTVerificationRequired(String str) {
        String property;
        boolean z = false;
        if (!(str == null || (property = Security.getProperty("conscrypt.ct.enable")) == null || !Boolean.valueOf(property).booleanValue())) {
            List<String> asList = Arrays.asList(str.split("\\."));
            Collections.reverse(asList);
            String str2 = "conscrypt.ct.enforce";
            for (String str3 : asList) {
                String property2 = Security.getProperty(String.valueOf(str2).concat(".*"));
                if (property2 != null) {
                    z = Boolean.valueOf(property2).booleanValue();
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(".");
                sb.append(str3);
                str2 = sb.toString();
            }
            String property3 = Security.getProperty(str2);
            if (property3 != null) {
                return Boolean.valueOf(property3).booleanValue();
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void logEvent(java.lang.String r9) {
        /*
            java.lang.String r0 = "android.os.Process"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x006c }
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = "myUid"
            r4 = 0
            java.lang.Class[] r4 = (java.lang.Class[]) r4     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch:{ Exception -> 0x006c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x006c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x006c }
            java.lang.String r2 = "android.util.EventLog"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ Exception -> 0x006c }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x006c }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006c }
            r5[r1] = r6     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
            r7 = 1
            r5[r7] = r6     // Catch:{ Exception -> 0x006c }
            java.lang.String r6 = "writeEvent"
            java.lang.reflect.Method r2 = r2.getMethod(r6, r5)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x006c }
            r6 = 1397638484(0x534e4554, float:8.859264E11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x006c }
            r5[r1] = r6     // Catch:{ Exception -> 0x006c }
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x006c }
            java.lang.String r8 = "conscrypt"
            r6[r1] = r8     // Catch:{ Exception -> 0x006c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x006c }
            r6[r7] = r0     // Catch:{ Exception -> 0x006c }
            r6[r4] = r9     // Catch:{ Exception -> 0x006c }
            r5[r7] = r6     // Catch:{ Exception -> 0x006c }
            r2.invoke(r3, r5)     // Catch:{ Exception -> 0x006c }
            return
        L_0x006c:
            r9 = move-exception
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.Platform.logEvent(java.lang.String):void");
    }

    private static void logStackTraceSnippet(String str, Throwable th) {
        Log.w(TAG, str);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = 0;
        while (i < 2 && i < stackTrace.length) {
            String valueOf = String.valueOf(stackTrace[i].toString());
            Log.w(TAG, valueOf.length() == 0 ? new String("\tat ") : "\tat ".concat(valueOf));
            i++;
        }
    }

    static CertBlacklist newDefaultBlacklist() {
        return null;
    }

    static ConscryptCertStore newDefaultCertStore() {
        return null;
    }

    static CTLogStore newDefaultLogStore() {
        return null;
    }

    static CTPolicy newDefaultPolicy(CTLogStore cTLogStore) {
        return null;
    }

    public static String oidToAlgorithmName(String str) {
        try {
            Method declaredMethod = Class.forName("org.apache.harmony.security.utils.AlgNameMapper").getDeclaredMethod("map2AlgName", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke((Object) null, new Object[]{str});
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            try {
                Class<?> cls = Class.forName("sun.security.x509.AlgorithmId");
                Method declaredMethod2 = cls.getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getName", new Class[0]);
                declaredMethod3.setAccessible(true);
                return (String) declaredMethod3.invoke(declaredMethod2.invoke((Object) null, new Object[]{str}), new Object[0]);
            } catch (InvocationTargetException e3) {
                Throwable cause2 = e3.getCause();
                if (cause2 instanceof RuntimeException) {
                    throw ((RuntimeException) cause2);
                } else if (cause2 instanceof Error) {
                    throw ((Error) cause2);
                } else {
                    throw new RuntimeException(e3);
                }
            } catch (Exception e4) {
                return str;
            }
        }
    }

    static boolean provideTrustManagerByDefault() {
        return false;
    }

    public static void setCurveName(ECParameterSpec eCParameterSpec, String str) {
        try {
            eCParameterSpec.getClass().getDeclaredMethod("setCurveName", new Class[]{String.class}).invoke(eCParameterSpec, new Object[]{str});
        } catch (Exception e) {
        }
    }

    public static void setEndpointIdentificationAlgorithm(SSLParameters sSLParameters, String str) {
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(abstractConscryptSocket.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", new Class[]{List.class}).invoke(sSLParameters, new Object[]{Collections.singletonList(new SNIHostName(abstractConscryptSocket.getHostname()))});
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        String sniHostnameFromParams;
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24 && (sniHostnameFromParams = getSniHostnameFromParams(sSLParameters)) != null) {
                abstractConscryptSocket.setHostname(sniHostnameFromParams);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void setSSLParametersOnImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParametersImpl.setEndpointIdentificationAlgorithm((String) sSLParameters.getClass().getMethod("getEndpointIdentificationAlgorithm", new Class[0]).invoke(sSLParameters, new Object[0]));
        sSLParametersImpl.setUseCipherSuitesOrder(((Boolean) sSLParameters.getClass().getMethod("getUseCipherSuitesOrder", new Class[0]).invoke(sSLParameters, new Object[0])).booleanValue());
    }

    public static void setSocketWriteTimeout(Socket socket, long j) {
        try {
            FileDescriptor fileDescriptor = getFileDescriptor(socket);
            if (fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket closed");
            }
            Class cls = getClass("android.system.StructTimeval", "libcore.io.StructTimeval");
            if (cls != null) {
                Method declaredMethod = cls.getDeclaredMethod("fromMillis", new Class[]{Long.TYPE});
                if (declaredMethod != null) {
                    Object invoke = declaredMethod.invoke((Object) null, new Object[]{Long.valueOf(j)});
                    Class<?> cls2 = Class.forName("libcore.io.Libcore");
                    if (cls2 == null) {
                        Log.w(TAG, "Libcore == null; not setting socket write timeout");
                        return;
                    }
                    Field field = cls2.getField("os");
                    if (field == null) {
                        Log.w(TAG, "os == null; not setting socket write timeout");
                        return;
                    }
                    Object obj = field.get((Object) null);
                    if (obj != null) {
                        Class cls3 = getClass("android.system.OsConstants", "libcore.io.OsConstants");
                        if (cls3 == null) {
                            Log.w(TAG, "OsConstants == null; not setting socket write timeout");
                            return;
                        }
                        Field field2 = cls3.getField("SOL_SOCKET");
                        if (field2 == null) {
                            Log.w(TAG, "SOL_SOCKET == null; not setting socket write timeout");
                            return;
                        }
                        Field field3 = cls3.getField("SO_SNDTIMEO");
                        if (field3 != null) {
                            Method method = obj.getClass().getMethod("setsockoptTimeval", new Class[]{FileDescriptor.class, Integer.TYPE, Integer.TYPE, cls});
                            if (method != null) {
                                method.invoke(obj, new Object[]{fileDescriptor, field2.get((Object) null), field3.get((Object) null), invoke});
                                return;
                            }
                            Log.w(TAG, "setsockoptTimeval == null; not setting socket write timeout");
                            return;
                        }
                        Log.w(TAG, "SO_SNDTIMEO == null; not setting socket write timeout");
                        return;
                    }
                    Log.w(TAG, "instance_os == null; not setting socket write timeout");
                    return;
                }
                Log.w(TAG, "fromMillis == null; not setting socket write timeout");
                return;
            }
            Log.w(TAG, "StructTimeval == null; not setting socket write timeout");
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not set socket write timeout: ");
            sb.append(valueOf);
            logStackTraceSnippet(sb.toString(), e);
            for (Throwable cause = e.getCause(); cause != null; cause = cause.getCause()) {
                String valueOf2 = String.valueOf(cause);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
                sb2.append("Caused by: ");
                sb2.append(valueOf2);
                logStackTraceSnippet(sb2.toString(), cause);
            }
        }
    }

    public static void setup() {
    }

    static boolean supportsConscryptCertStore() {
        return false;
    }

    static boolean supportsX509ExtendedTrustManager() {
        return Build.VERSION.SDK_INT > 23;
    }

    public static AlgorithmParameterSpec toGCMParameterSpec(int i, byte[] bArr) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AlgorithmParameterSpec) cls.getConstructor(new Class[]{Integer.TYPE, byte[].class}).newInstance(new Object[]{Integer.valueOf(i), bArr});
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException e2) {
                apev.a(e2);
            } catch (InvocationTargetException e3) {
                apev.a(e3.getCause());
            }
        }
        return null;
    }

    static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
        return sSLEngine;
    }

    static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
        return conscryptEngine;
    }

    public static OpenSSLKey wrapRsaKey(PrivateKey privateKey) {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8ExtendedSSLSession(externalSession) : externalSession;
    }

    public static SSLSocketFactory wrapSocketFactoryIfNeeded(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        int i = Build.VERSION.SDK_INT;
        return Build.VERSION.SDK_INT < 22 ? new KitKatPlatformOpenSSLSocketAdapterFactory(openSSLSocketFactoryImpl) : openSSLSocketFactoryImpl;
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(str, i, sSLParametersImpl);
        }
        return new ConscryptEngineSocket(str, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(str, i, sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(str, i, sSLParametersImpl);
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24) {
                setParametersSniHostname(sSLParameters, sSLParametersImpl, conscryptEngine);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(conscryptEngine.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", new Class[]{List.class}).invoke(sSLParameters, new Object[]{Collections.singletonList(new SNIHostName(conscryptEngine.getHostname()))});
        }
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine)) {
            if (!checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        }
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine)) {
            if (!checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(str, i, inetAddress, i2, sSLParametersImpl);
        }
        return new ConscryptEngineSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(str, i, inetAddress, i2, sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        String sniHostnameFromParams;
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24 && (sniHostnameFromParams = getSniHostnameFromParams(sSLParameters)) != null) {
                conscryptEngine.setHostname(sniHostnameFromParams);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(inetAddress, i, sSLParametersImpl);
        }
        return new ConscryptEngineSocket(inetAddress, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(inetAddress, i, sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(inetAddress, i, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
        }
        return new ConscryptEngineSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8EngineSocket(socket, str, i, z, sSLParametersImpl);
        }
        return new ConscryptEngineSocket(socket, str, i, z, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new Java8FileDescriptorSocket(socket, str, i, z, sSLParametersImpl);
        }
        return new ConscryptFileDescriptorSocket(socket, str, i, z, sSLParametersImpl);
    }
}
