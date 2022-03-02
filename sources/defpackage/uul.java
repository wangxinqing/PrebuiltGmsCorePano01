package defpackage;

import java.net.ServerSocket;
import java.net.SocketAddress;
import java.util.concurrent.Callable;

/* renamed from: uul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uul implements Callable {
    static final Callable a = new uul();

    private uul() {
    }

    public final Object call() {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind((SocketAddress) null);
        return serverSocket;
    }
}
