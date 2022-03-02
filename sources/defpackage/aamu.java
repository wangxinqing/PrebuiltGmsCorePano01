package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: aamu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamu extends SSLSocketFactory {
    private static final TrustManager[] j = {new aamt()};
    SSLSocketFactory a = null;
    SSLSocketFactory b = null;
    public byte[] c = null;
    public PrivateKey d = null;
    final Context e;
    final int f;
    final boolean g;
    final boolean h;
    final String i;

    public aamu(Context context, int i2, boolean z, String str) {
        this.e = context.getApplicationContext();
        this.f = i2;
        this.g = z;
        this.h = true;
        this.i = str;
    }

    private final synchronized SSLSocketFactory a() {
        if (!this.h) {
            if (this.a == null) {
                Log.w("SSLCertSocketFactory", "Bypassing SSL security checks at caller's request");
                this.a = aamw.a().a(this.e, j, this.g);
            }
            return this.a;
        }
        if (this.i != null) {
            if (this.b == null) {
                aamw a2 = aamw.a();
                Context context = this.e;
                try {
                    this.b = (SSLSocketFactory) mbz.a(a2.a(context).newSocketFactoryWithCacheDir(mbz.a((Object) context), mbz.a((Object) null), mbz.a((Object) null), this.i));
                } catch (RemoteException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (mca e3) {
                    e = e3;
                    throw new RuntimeException(e);
                }
            }
        } else if (this.b == null) {
            this.b = aamw.a().a(this.e, (TrustManager[]) null, this.g);
        }
        return this.b;
    }

    public final Socket createSocket() {
        Socket createSocket = a().createSocket();
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return a().getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return a().getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i2) {
        Socket createSocket = a().createSocket(str, i2);
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        if (this.h) {
            a(createSocket, str);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = a().createSocket(str, i2, inetAddress, i3);
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        if (this.h) {
            a(createSocket, str);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i2) {
        Socket createSocket = a().createSocket(inetAddress, i2);
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        Socket createSocket = a().createSocket(inetAddress, i2, inetAddress2, i3);
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        Socket createSocket = a().createSocket(socket, str, i2, z);
        a(createSocket);
        a(createSocket, this.c);
        a(createSocket, this.f);
        a(createSocket, this.d);
        if (this.h) {
            a(createSocket, str);
        }
        return createSocket;
    }

    public static SSLSocketFactory a(int i2, Context context) {
        return new aamu(context, i2, true, (String) null);
    }

    static final void a(Socket socket) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setNpnProtocols", new Class[]{byte[].class}).invoke(socket, new Object[]{null});
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to invoke setNpnProtocols on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e2);
            } catch (NoSuchMethodException e3) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                sb2.append(valueOf2);
                sb2.append(" does not implement setNpnProtocols");
                throw new IllegalArgumentException(sb2.toString(), e3);
            } catch (IllegalAccessException e4) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                sb3.append(valueOf3);
                sb3.append(" does not implement setNpnProtocols");
                throw new IllegalArgumentException(sb3.toString(), e4);
            }
        }
    }

    static final void a(Socket socket, int i2) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setHandshakeTimeout", new Class[]{Integer.TYPE}).invoke(socket, new Object[]{Integer.valueOf(i2)});
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("Failed to invoke setSocketHandshakeTimeout on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e2);
            } catch (NoSuchMethodException e3) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append(valueOf2);
                sb2.append(" does not implement setSocketHandshakeTimeout");
                throw new IllegalArgumentException(sb2.toString(), e3);
            } catch (IllegalAccessException e4) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 45);
                sb3.append(valueOf3);
                sb3.append(" does not implement setSocketHandshakeTimeout");
                throw new IllegalArgumentException(sb3.toString(), e4);
            }
        }
    }

    public static void a(Socket socket, String str) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("Cannot verify SSL socket without session");
            } else if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                String valueOf = String.valueOf(str);
                throw new SSLPeerUnverifiedException(valueOf.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Attempt to verify non-SSL socket");
        }
    }

    static final void a(Socket socket, PrivateKey privateKey) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setChannelIdPrivateKey", new Class[]{PrivateKey.class}).invoke(socket, new Object[]{privateKey});
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Failed to invoke setChannelIdPrivateKey on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e2);
            } catch (NoSuchMethodException e3) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append(valueOf2);
                sb2.append(" does not implement setChannelIdPrivateKey");
                throw new IllegalArgumentException(sb2.toString(), e3);
            } catch (IllegalAccessException e4) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 42);
                sb3.append(valueOf3);
                sb3.append(" does not implement setChannelIdPrivateKey");
                throw new IllegalArgumentException(sb3.toString(), e4);
            }
        }
    }

    static final void a(Socket socket, byte[] bArr) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setAlpnProtocols", new Class[]{byte[].class}).invoke(socket, new Object[]{bArr});
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Failed to invoke setAlpnProtocols on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e2);
            } catch (NoSuchMethodException e3) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
                sb2.append(valueOf2);
                sb2.append(" does not implement setAlpnProtocols");
                throw new IllegalArgumentException(sb2.toString(), e3);
            } catch (IllegalAccessException e4) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                sb3.append(valueOf3);
                sb3.append(" does not implement setAlpnProtocols");
                throw new IllegalArgumentException(sb3.toString(), e4);
            }
        }
    }
}
