package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvk extends jba {
    private static final AtomicInteger a = new AtomicInteger(0);
    private final ClientContext d;
    private final fuw e;
    private final ProxyGrpcRequest f;
    private final izd g;

    public fvk(ClientContext clientContext, fuw fuw, ProxyGrpcRequest proxyGrpcRequest, izd izd) {
        super(16, "PerformProxyGrpcRequestOperation");
        this.d = clientContext;
        this.e = fuw;
        this.f = proxyGrpcRequest;
        this.g = izd;
    }

    private final void a(Context context, int i, int i2, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            try {
                pendingIntent = PendingIntent.getActivity(context, a.getAndIncrement(), intent, 134217728);
            } catch (RemoteException e2) {
                Log.e("AuthgRPCProxy", "RemoteException when proxying gRPC request");
                return;
            }
        } else {
            pendingIntent = null;
        }
        this.e.a(new ProxyResponse(i, pendingIntent, i2, (byte[]) null));
    }

    public final void a(Context context) {
        fvj fvj = new fvj();
        baaj a2 = baaj.a(baai.UNARY, this.f.f, fvj, fvj);
        try {
            izd izd = this.g;
            ClientContext clientContext = this.d;
            ProxyGrpcRequest proxyGrpcRequest = this.f;
            byte[] bArr = proxyGrpcRequest.e;
            long j = proxyGrpcRequest.d;
            this.e.a(new ProxyResponse(0, (PendingIntent) null, babj.b.r.r, (byte[]) izd.a(a2, clientContext, bArr, j, TimeUnit.MILLISECONDS)));
        } catch (UserRecoverableAuthException e2) {
            Log.e("AuthgRPCProxy", "Token error");
            a(context, 3004, -1, e2.a());
        } catch (eif e3) {
            Log.e("AuthgRPCProxy", "Token error");
            a(context, 3004, -1, (Intent) null);
        } catch (babk e4) {
            Log.e("AuthgRPCProxy", "gRPC StatusException", e4);
            a(context, 0, e4.a.r.r, (Intent) null);
        } catch (RemoteException e5) {
            Log.e("AuthgRPCProxy", "RemoteException when proxying gRPC request");
        }
    }
}
