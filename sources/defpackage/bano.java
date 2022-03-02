package defpackage;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

/* renamed from: bano  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bano implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
    }
}
