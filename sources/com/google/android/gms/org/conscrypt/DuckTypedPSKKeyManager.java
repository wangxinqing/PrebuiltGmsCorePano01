package com.google.android.gms.org.conscrypt;

import java.lang.reflect.Method;
import java.net.Socket;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngine;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class DuckTypedPSKKeyManager implements PSKKeyManager {
    private final Object mDelegate;

    private DuckTypedPSKKeyManager(Object obj) {
        this.mDelegate = obj;
    }

    static DuckTypedPSKKeyManager getInstance(Object obj) {
        Class<?> cls = obj.getClass();
        for (Method method : PSKKeyManager.class.getMethods()) {
            if (!method.isSynthetic()) {
                Method method2 = cls.getMethod(method.getName(), method.getParameterTypes());
                Class<?> returnType = method2.getReturnType();
                Class<?> returnType2 = method.getReturnType();
                if (!returnType2.isAssignableFrom(returnType)) {
                    String valueOf = String.valueOf(method2);
                    String valueOf2 = String.valueOf(returnType);
                    String valueOf3 = String.valueOf(returnType2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                    sb.append(valueOf);
                    sb.append(" return value (");
                    sb.append(valueOf2);
                    sb.append(") incompatible with target return value (");
                    sb.append(valueOf3);
                    sb.append(")");
                    throw new NoSuchMethodException(sb.toString());
                }
            }
        }
        return new DuckTypedPSKKeyManager(obj);
    }

    public String chooseClientKeyIdentity(String str, Socket socket) {
        try {
            return (String) this.mDelegate.getClass().getMethod("chooseClientKeyIdentity", new Class[]{String.class, Socket.class}).invoke(this.mDelegate, new Object[]{str, socket});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke chooseClientKeyIdentity", e);
        }
    }

    public String chooseServerKeyIdentityHint(Socket socket) {
        try {
            return (String) this.mDelegate.getClass().getMethod("chooseServerKeyIdentityHint", new Class[]{Socket.class}).invoke(this.mDelegate, new Object[]{socket});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke chooseServerKeyIdentityHint", e);
        }
    }

    public SecretKey getKey(String str, String str2, Socket socket) {
        try {
            return (SecretKey) this.mDelegate.getClass().getMethod("getKey", new Class[]{String.class, String.class, Socket.class}).invoke(this.mDelegate, new Object[]{str, str2, socket});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke getKey", e);
        }
    }

    public String chooseClientKeyIdentity(String str, SSLEngine sSLEngine) {
        try {
            return (String) this.mDelegate.getClass().getMethod("chooseClientKeyIdentity", new Class[]{String.class, SSLEngine.class}).invoke(this.mDelegate, new Object[]{str, sSLEngine});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke chooseClientKeyIdentity", e);
        }
    }

    public String chooseServerKeyIdentityHint(SSLEngine sSLEngine) {
        try {
            return (String) this.mDelegate.getClass().getMethod("chooseServerKeyIdentityHint", new Class[]{SSLEngine.class}).invoke(this.mDelegate, new Object[]{sSLEngine});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke chooseServerKeyIdentityHint", e);
        }
    }

    public SecretKey getKey(String str, String str2, SSLEngine sSLEngine) {
        try {
            return (SecretKey) this.mDelegate.getClass().getMethod("getKey", new Class[]{String.class, String.class, SSLEngine.class}).invoke(this.mDelegate, new Object[]{str, str2, sSLEngine});
        } catch (Exception e) {
            throw new RuntimeException("Failed to invoke getKey", e);
        }
    }
}
