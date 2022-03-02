package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: nur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nur {
    private final Context a;
    private final SSLSocketFactory b;
    private final SSLSocketFactory c;
    private final HostnameVerifier d;
    private Class e;
    private Method f;
    private Method g;
    private Method h;

    public static final int a() {
        return (int) axlc.a.a().ap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean b(javax.net.ssl.SSLSocket r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = defpackage.jkr.e()     // Catch:{ all -> 0x005f }
            r1 = 0
            if (r0 == 0) goto L_0x005d
            boolean r0 = defpackage.axlc.h()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005d
            java.lang.reflect.Method r0 = r5.h     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0056
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x002f }
            java.lang.Object r6 = r0.invoke(r6, r2)     // Catch:{ Exception -> 0x002f }
            java.io.FileDescriptor r6 = (java.io.FileDescriptor) r6     // Catch:{ Exception -> 0x002f }
            int r0 = android.system.OsConstants.IPPROTO_TCP     // Catch:{ Exception -> 0x002f }
            int r2 = android.system.OsConstants.TCP_USER_TIMEOUT     // Catch:{ Exception -> 0x002f }
            axlc r3 = defpackage.axlc.a     // Catch:{ Exception -> 0x002f }
            axld r3 = r3.a()     // Catch:{ Exception -> 0x002f }
            long r3 = r3.as()     // Catch:{ Exception -> 0x002f }
            int r4 = (int) r3     // Catch:{ Exception -> 0x002f }
            android.system.Os.setsockoptInt(r6, r0, r2, r4)     // Catch:{ Exception -> 0x002f }
            r6 = 1
            monitor-exit(r5)
            return r6
        L_0x002f:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x005f }
            int r0 = r0.length()     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            int r0 = r0 + 20
            r2.<init>(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "TCP timeout failed: "
            r2.append(r0)     // Catch:{ all -> 0x005f }
            r2.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "GCM"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005f }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x005f }
            monitor-exit(r5)
            return r1
        L_0x0056:
            java.lang.String r6 = "GCM"
            java.lang.String r0 = "socket file descriptor unavailable."
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r5)
            return r1
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nur.b(javax.net.ssl.SSLSocket):boolean");
    }

    public nur(Context context) {
        aamu aamu = aekv.a(context) ? new aamu(context.createDeviceProtectedStorageContext(), (int) axlc.t(), false, (String) null) : null;
        SSLSocketFactory a2 = aamu.a((int) axlc.t(), context);
        this.a = context;
        this.b = aamu;
        this.c = a2;
        this.d = HttpsURLConnection.getDefaultHostnameVerifier();
    }

    private final synchronized void a(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        if (!cls.equals(this.e)) {
            this.e = cls;
            try {
                this.f = cls.getMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                this.g = cls.getMethod("setHostname", new Class[]{String.class});
            } catch (NoSuchMethodException e2) {
                this.f = null;
                this.g = null;
            }
            try {
                if (jkr.e() && axlc.h()) {
                    this.h = this.e.getMethod("getFileDescriptor$", new Class[0]);
                }
            } catch (NoSuchMethodException e3) {
                this.h = null;
            }
        }
        return;
    }

    private final synchronized void a(SSLSocket sSLSocket, String str) {
        try {
            Method method = this.f;
            if (method != null) {
                method.invoke(sSLSocket, new Object[]{true});
            } else {
                Log.w("GCM", "Tickets unavailable");
            }
            Method method2 = this.g;
            if (method2 != null) {
                method2.invoke(sSLSocket, new Object[]{str});
                return;
            }
            Log.w("GCM", "SNI unavailable");
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Tickets or SNI failed: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
        }
    }

    public final nuq a(InetSocketAddress inetSocketAddress, String str, nux nux) {
        Socket socket;
        SSLSocketFactory sSLSocketFactory;
        izj.b(1031);
        if (aekv.a(this.a) && (sSLSocketFactory = this.b) != null) {
            socket = sSLSocketFactory.createSocket();
        } else {
            socket = this.c.createSocket();
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        try {
            izj.a((Socket) sSLSocket);
            sSLSocket.setSoTimeout(a());
            a(sSLSocket);
            a(sSLSocket, str);
            boolean b2 = b(sSLSocket);
            if (nux != null) {
                int i = Build.VERSION.SDK_INT;
                nux.a.bindSocket(sSLSocket);
            }
            sSLSocket.connect(inetSocketAddress, a());
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("Cannot verify SSL socket without session");
            } else if (!this.d.verify(str, session)) {
                String valueOf = String.valueOf(str);
                throw new SSLException(valueOf.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf));
            } else {
                nuq nuq = new nuq(sSLSocket, b2);
                izj.a();
                return nuq;
            }
        } catch (IOException e2) {
            sSLSocket.close();
            throw e2;
        } catch (Throwable th) {
            izj.a();
            throw th;
        }
    }
}
