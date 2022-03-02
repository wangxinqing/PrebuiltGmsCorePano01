package defpackage;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

/* renamed from: banp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class banp implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
