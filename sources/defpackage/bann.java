package defpackage;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

/* renamed from: bann  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bann implements PrivilegedExceptionAction {
    public final /* bridge */ /* synthetic */ Object run() {
        return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
    }
}
