package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.android.volley.RequestQueue;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvl extends jba {
    private static final AtomicInteger d = new AtomicInteger(0);
    protected final RequestQueue a = ihs.b().getAuthChannelBoundApiaryRequestQueue();
    private final ClientContext e;
    private final fuw f;
    private final ProxyRequest g;
    private anps h;
    private fxu i;
    private hol j;
    private izw k;

    public fvl(ClientContext clientContext, fuw fuw, ProxyRequest proxyRequest) {
        super(16, "PerformProxyRequestOperation");
        this.e = clientContext;
        this.f = fuw;
        this.g = proxyRequest;
        if (clientContext.f()) {
            this.k = new izw(clientContext);
        }
    }

    private final void a(Context context, int i2, int i3, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            try {
                pendingIntent = PendingIntent.getActivity(context, d.getAndIncrement(), intent, 134217728);
            } catch (RemoteException e2) {
                return;
            }
        } else {
            pendingIntent = null;
        }
        this.f.a(new ProxyResponse(i2, pendingIntent, i3, (byte[]) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a9, code lost:
        r12 = r10.networkResponse.statusCode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02af, code lost:
        if (r5.c == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b2, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b8, code lost:
        r14 = (defpackage.anps) r5.b;
        r14.a |= 8;
        r14.e = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c4, code lost:
        if (r11 == 3000) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c6, code lost:
        defpackage.eig.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d0, code lost:
        throw new defpackage.fvc(r9, r11, r10.networkResponse);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d3, code lost:
        if ((r10 instanceof com.android.volley.NetworkError) != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d5, code lost:
        r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse(7, (android.app.PendingIntent) null, -1, (byte[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02df, code lost:
        if (r5.c == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e2, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e8, code lost:
        r8 = (defpackage.anps) r5.b;
        r8.i = 7;
        r8.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f6, code lost:
        android.util.Log.w("AuthChimeraService", "ExecutionException for cause.", r9);
        r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse(13, (android.app.PendingIntent) null, -1, (byte[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0306, code lost:
        if (r5.c == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0309, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030f, code lost:
        r8 = (defpackage.anps) r5.b;
        r8.i = 7;
        r8.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0335, code lost:
        if (r5.c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0338, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033e, code lost:
        r6 = (defpackage.anps) r5.b;
        r6.a |= 1;
        r6.b = r3;
        r3 = (defpackage.anps) r5.i();
        r1.h = r3;
        a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0355, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        a(r2, 3005, -1, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038e, code lost:
        if (r5.c == false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0391, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0397, code lost:
        r3 = (defpackage.anps) r5.b;
        r3.i = 5;
        r3.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a4, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ab, code lost:
        if (r5.c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b1, code lost:
        if (r5.c == false) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b4, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ba, code lost:
        r3 = (defpackage.anps) r5.b;
        r3.i = 4;
        r3.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c7, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ce, code lost:
        if (r5.c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        a(r2, 7, -1, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03db, code lost:
        if (r5.c == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03de, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e4, code lost:
        r3 = (defpackage.anps) r5.b;
        r3.i = 3;
        r3.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f1, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f8, code lost:
        if (r5.c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03fd, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r4 = r3.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0400, code lost:
        if (r4 == null) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0402, code lost:
        a(r2, 0, r3.a, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r1.f.a(new com.google.android.gms.auth.api.proxy.ProxyResponse(1, 0, (android.app.PendingIntent) null, r3.a, com.google.android.gms.auth.api.proxy.ProxyResponse.a(r4.headers), r4.data));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0429, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0443, code lost:
        if (r5.c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        android.util.Log.e("AuthChimeraService", "Token error");
        a(r2, 3004, -1, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0454, code lost:
        if (r5.c == false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0457, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x045d, code lost:
        r3 = (defpackage.anps) r5.b;
        r3.i = 1;
        r3.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x046a, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0471, code lost:
        if (r5.c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0475, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0476, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        android.util.Log.e("AuthChimeraService", "Token error");
        a(r2, 3004, -1, r8.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0486, code lost:
        if (r5.c == false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0489, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x048f, code lost:
        r3 = (defpackage.anps) r5.b;
        r3.i = 0;
        r3.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x049c, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a3, code lost:
        if (r5.c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        android.util.Log.w("AuthChimeraService", r0);
        r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse(14, (android.app.PendingIntent) null, -1, (byte[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0221, code lost:
        if (r5.c == false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0224, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022a, code lost:
        r8 = (defpackage.anps) r5.b;
        r8.i = 6;
        r8.a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023a, code lost:
        r9 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0241, code lost:
        if ((r9 instanceof com.android.volley.VolleyError) != false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0243, code lost:
        r10 = (com.android.volley.VolleyError) r9;
        r11 = r10.networkResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0248, code lost:
        if (r11 != null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024a, code lost:
        r9 = new java.lang.String(r11.data, "UTF-8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0258, code lost:
        if (android.util.Log.isLoggable("AuthChimeraService", 4) != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0260, code lost:
        if (r9.length() == 0) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0262, code lost:
        r12 = new java.lang.String("Error description received from server: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0268, code lost:
        r12 = "Error description received from server: ".concat(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026c, code lost:
        android.util.Log.i("AuthChimeraService", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026f, code lost:
        r11 = r10.networkResponse.statusCode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0277, code lost:
        if (r11 != 401) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027b, code lost:
        if (r11 != 403) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027d, code lost:
        r12 = r11 / 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0280, code lost:
        if (r12 != 4) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0283, code lost:
        if (r12 != 5) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0285, code lost:
        r12 = new java.lang.StringBuilder(35);
        r12.append("Response code received: ");
        r12.append(r11);
        android.util.Log.e("AuthChimeraService", r12.toString());
        r11 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029e, code lost:
        r11 = 3003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a1, code lost:
        r11 = 3002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a4, code lost:
        r11 = 3001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02a7, code lost:
        r11 = 3000;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0384 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ae A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03fc A[ExcHandler: fvc (r0v2 'e' fvc A[CUSTOM_DECLARE]), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0428 A[Catch:{ eif | IOException -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384, all -> 0x0380 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0429 A[Catch:{ eif | IOException -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384, all -> 0x0380 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "Token error"
            java.lang.String r4 = "AuthChimeraService"
            anps r5 = defpackage.anps.j
            aucd r5 = r5.o()
            long r6 = android.os.SystemClock.elapsedRealtime()
            r8 = 3
            r9 = 4
            r10 = 0
            java.net.URI r11 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0075 }
            com.google.android.gms.auth.api.proxy.ProxyRequest r12 = r1.g     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r12 = r12.b     // Catch:{ URISyntaxException -> 0x0075 }
            r11.<init>(r12)     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r12 = r11.getScheme()     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r13 = r11.getHost()     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r11 = r11.getPath()     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ URISyntaxException -> 0x0075 }
            int r14 = r14.length()     // Catch:{ URISyntaxException -> 0x0075 }
            int r14 = r14 + r8
            java.lang.String r15 = java.lang.String.valueOf(r13)     // Catch:{ URISyntaxException -> 0x0075 }
            int r15 = r15.length()     // Catch:{ URISyntaxException -> 0x0075 }
            int r14 = r14 + r15
            java.lang.String r15 = java.lang.String.valueOf(r11)     // Catch:{ URISyntaxException -> 0x0075 }
            int r15 = r15.length()     // Catch:{ URISyntaxException -> 0x0075 }
            int r14 = r14 + r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0075 }
            r15.<init>(r14)     // Catch:{ URISyntaxException -> 0x0075 }
            r15.append(r12)     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r12 = "://"
            r15.append(r12)     // Catch:{ URISyntaxException -> 0x0075 }
            r15.append(r13)     // Catch:{ URISyntaxException -> 0x0075 }
            r15.append(r11)     // Catch:{ URISyntaxException -> 0x0075 }
            java.lang.String r11 = r15.toString()     // Catch:{ URISyntaxException -> 0x0075 }
            boolean r12 = r5.c     // Catch:{ URISyntaxException -> 0x0075 }
            if (r12 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r5.c()     // Catch:{ URISyntaxException -> 0x0075 }
            r5.c = r10     // Catch:{ URISyntaxException -> 0x0075 }
        L_0x0066:
            aucj r12 = r5.b     // Catch:{ URISyntaxException -> 0x0075 }
            anps r12 = (defpackage.anps) r12     // Catch:{ URISyntaxException -> 0x0075 }
            r11.getClass()     // Catch:{ URISyntaxException -> 0x0075 }
            int r13 = r12.a     // Catch:{ URISyntaxException -> 0x0075 }
            r13 = r13 | r9
            r12.a = r13     // Catch:{ URISyntaxException -> 0x0075 }
            r12.d = r11     // Catch:{ URISyntaxException -> 0x0075 }
            goto L_0x0094
        L_0x0075:
            r0 = move-exception
            r11 = r0
            java.lang.String r11 = r11.getMessage()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "Request url with UriSyntaxException: "
            int r13 = r11.length()
            if (r13 != 0) goto L_0x008d
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
            goto L_0x0091
        L_0x008d:
            java.lang.String r11 = r12.concat(r11)
        L_0x0091:
            android.util.Log.e(r4, r11)
        L_0x0094:
            com.google.android.gms.common.internal.ClientContext r11 = r1.e
            java.lang.String r11 = r11.f
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r5.c()
            r5.c = r10
        L_0x00a2:
            aucj r12 = r5.b
            anps r12 = (defpackage.anps) r12
            r11.getClass()
            int r13 = r12.a
            r14 = 2
            r13 = r13 | r14
            r12.a = r13
            r12.c = r11
            boolean r16 = android.util.Log.isLoggable(r4, r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r16 == 0) goto L_0x00db
            com.google.android.gms.auth.api.proxy.ProxyRequest r8 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r17 = java.lang.String.valueOf(r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r17 = r17.length()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r11 = r17 + 19
            r13.<init>(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = "Executing request: "
            r13.append(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r13.append(r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r8 = r13.toString()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            android.util.Log.i(r4, r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x00db:
            com.google.android.gms.common.internal.ClientContext r8 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r8 = r8.f()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 == 0) goto L_0x0109
            izw r8 = r1.k     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r8 = r8.b(r2)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.common.internal.ClientContext r11 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = r11.g()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r13 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r13 != 0) goto L_0x00f4
            goto L_0x00f9
        L_0x00f4:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r5.c = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x00f9:
            aucj r13 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r13 = (defpackage.anps) r13     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r11.getClass()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r9 = r13.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r9 = r9 | 16
            r13.a = r9     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r13.f = r11     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x010a
        L_0x0109:
            r8 = 0
        L_0x010a:
            awoq r9 = defpackage.awoq.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            awor r9 = r9.a()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r9 = r9.b()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            fzq r9 = defpackage.fzq.a(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyRequest r11 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = r11.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r9 = r9.b(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r9 == 0) goto L_0x0356
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyRequest r11 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            android.os.Bundle r14 = r11.f     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r14 = r14.size()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r13.<init>(r14)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            android.os.Bundle r14 = r11.f     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.util.Set r14 = r14.keySet()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x013b:
            boolean r18 = r14.hasNext()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r18 == 0) goto L_0x0153
            java.lang.Object r18 = r14.next()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r15 = r18
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            android.os.Bundle r12 = r11.f     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r12 = r12.getString(r15)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r13.put(r15, r12)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x013b
        L_0x0153:
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r13)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r9.<init>(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 == 0) goto L_0x018e
            java.lang.String r11 = "Authorization"
            java.lang.String r12 = "Bearer "
            java.lang.String r13 = java.lang.String.valueOf(r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r14 = r13.length()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r14 != 0) goto L_0x0170
            java.lang.String r13 = new java.lang.String     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r13.<init>(r12)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x0174
        L_0x0170:
            java.lang.String r13 = r12.concat(r13)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x0174:
            r9.put(r11, r13)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r11 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r11 != 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r5.c = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x0181:
            aucj r11 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r11 = (defpackage.anps) r11     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r12 = r11.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12 = r12 | 32
            r11.a = r12     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12 = 1
            r11.g = r12     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x018e:
            com.google.android.gms.common.internal.ClientContext r11 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = r11.f     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            fxu r12 = new fxu     // Catch:{ IOException -> 0x01a0, eif -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12.<init>(r2)     // Catch:{ IOException -> 0x01a0, eif -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r1.i = r12     // Catch:{ IOException -> 0x01a0, eif -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = r12.a((java.lang.String) r11)     // Catch:{ IOException -> 0x01a0, eif -> 0x019e, fvc -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x01a7
        L_0x019e:
            r0 = move-exception
            goto L_0x01a1
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            java.lang.String r11 = "Exception while getting app cert is being ignored."
            android.util.Log.w(r4, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r11 = 0
        L_0x01a7:
            if (r11 != 0) goto L_0x01aa
            goto L_0x01c6
        L_0x01aa:
            java.lang.String r12 = "X-Goog-Spatula"
            r9.put(r12, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r11 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r11 != 0) goto L_0x01b4
            goto L_0x01b9
        L_0x01b4:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r5.c = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x01b9:
            aucj r11 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r11 = (defpackage.anps) r11     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r12 = r11.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12 = r12 | 64
            r11.a = r12     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12 = 1
            r11.h = r12     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x01c6:
            com.android.volley.toolbox.RequestFuture r11 = com.android.volley.toolbox.RequestFuture.newFuture()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            fvd r12 = new fvd     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyRequest r13 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r14 = r13.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r15 = r13.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            byte[] r13 = r13.e     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.common.internal.ClientContext r10 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r10.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r18 = r12
            r19 = r14
            r20 = r15
            r21 = r11
            r22 = r11
            r23 = r9
            r24 = r13
            r25 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.android.volley.RequestQueue r9 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r9.add(r12)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.Object r9 = r11.get()     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            com.google.android.gms.auth.api.proxy.ProxyResponse r9 = (com.google.android.gms.auth.api.proxy.ProxyResponse) r9     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            int r10 = r9.d     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            boolean r11 = r5.c     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            if (r11 != 0) goto L_0x01fd
            goto L_0x0203
        L_0x01fd:
            r5.c()     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            r11 = 0
            r5.c = r11     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
        L_0x0203:
            aucj r11 = r5.b     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            anps r11 = (defpackage.anps) r11     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            int r12 = r11.a     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            r12 = r12 | 8
            r11.a = r12     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            r11.e = r10     // Catch:{ ExecutionException -> 0x0239, InterruptedException -> 0x0211 }
            goto L_0x031c
        L_0x0211:
            r0 = move-exception
            r8 = r0
            android.util.Log.w(r4, r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyResponse r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 14
            r10 = -1
            r11 = 0
            r9.<init>(r8, r11, r10, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r8 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 != 0) goto L_0x0224
            goto L_0x022a
        L_0x0224:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 0
            r5.c = r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x022a:
            aucj r8 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r8 = (defpackage.anps) r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = 6
            r8.i = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r8.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r8.a = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x031c
        L_0x0239:
            r0 = move-exception
            r9 = r0
            java.lang.Throwable r9 = r9.getCause()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r10 = r9 instanceof com.android.volley.VolleyError     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r10 == 0) goto L_0x02f6
            r10 = r9
            com.android.volley.VolleyError r10 = (com.android.volley.VolleyError) r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.android.volley.NetworkResponse r11 = r10.networkResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r11 == 0) goto L_0x02d1
            java.lang.String r9 = new java.lang.String     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            byte[] r11 = r11.data     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r12 = "UTF-8"
            r9.<init>(r11, r12)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r11 = 4
            boolean r12 = android.util.Log.isLoggable(r4, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r12 == 0) goto L_0x026f
            java.lang.String r11 = "Error description received from server: "
            int r12 = r9.length()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r12 != 0) goto L_0x0268
            java.lang.String r12 = new java.lang.String     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12.<init>(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x026c
        L_0x0268:
            java.lang.String r12 = r11.concat(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x026c:
            android.util.Log.i(r4, r12)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x026f:
            com.android.volley.NetworkResponse r11 = r10.networkResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r11 = r11.statusCode     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12 = 401(0x191, float:5.62E-43)
            r13 = 3000(0xbb8, float:4.204E-42)
            if (r11 == r12) goto L_0x02a7
            r12 = 403(0x193, float:5.65E-43)
            if (r11 == r12) goto L_0x02a4
            int r12 = r11 / 100
            r14 = 4
            if (r12 == r14) goto L_0x02a1
            r14 = 5
            if (r12 == r14) goto L_0x029e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r14 = 35
            r12.<init>(r14)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r14 = "Response code received: "
            r12.append(r14)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r12.append(r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r11 = r12.toString()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            android.util.Log.e(r4, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r11 = 10
            goto L_0x02a9
        L_0x029e:
            r11 = 3003(0xbbb, float:4.208E-42)
            goto L_0x02a9
        L_0x02a1:
            r11 = 3002(0xbba, float:4.207E-42)
            goto L_0x02a9
        L_0x02a4:
            r11 = 3001(0xbb9, float:4.205E-42)
            goto L_0x02a9
        L_0x02a7:
            r11 = 3000(0xbb8, float:4.204E-42)
        L_0x02a9:
            com.android.volley.NetworkResponse r12 = r10.networkResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r12 = r12.statusCode     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r14 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r14 != 0) goto L_0x02b2
            goto L_0x02b8
        L_0x02b2:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r14 = 0
            r5.c = r14     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x02b8:
            aucj r14 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r14 = (defpackage.anps) r14     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r15 = r14.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r15 = r15 | 8
            r14.a = r15     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r14.e = r12     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r11 != r13) goto L_0x02c9
            defpackage.eig.a(r2, r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x02c9:
            fvc r8 = new fvc     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.android.volley.NetworkResponse r10 = r10.networkResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8.<init>(r9, r11, r10)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            throw r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x02d1:
            boolean r8 = r10 instanceof com.android.volley.NetworkError     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 == 0) goto L_0x02f6
            com.google.android.gms.auth.api.proxy.ProxyResponse r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 7
            r10 = -1
            r11 = 0
            r9.<init>(r8, r11, r10, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r8 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 != 0) goto L_0x02e2
            goto L_0x02e8
        L_0x02e2:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 0
            r5.c = r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x02e8:
            aucj r8 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r8 = (defpackage.anps) r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = 7
            r8.i = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r8.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r8.a = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            goto L_0x031c
        L_0x02f6:
            java.lang.String r8 = "ExecutionException for cause."
            android.util.Log.w(r4, r8, r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyResponse r9 = new com.google.android.gms.auth.api.proxy.ProxyResponse     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 13
            r10 = -1
            r11 = 0
            r9.<init>(r8, r11, r10, r11)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            boolean r8 = r5.c     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r8 != 0) goto L_0x0309
            goto L_0x030f
        L_0x0309:
            r5.c()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8 = 0
            r5.c = r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x030f:
            aucj r8 = r5.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            anps r8 = (defpackage.anps) r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = 7
            r8.i = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r8.a     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r8.a = r10     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x031c:
            r8 = 4
            boolean r10 = android.util.Log.isLoggable(r4, r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            if (r10 == 0) goto L_0x0329
            java.lang.String r8 = "Executing send connection operation"
            android.util.Log.i(r4, r8)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x0329:
            fuw r8 = r1.f     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8.a((com.google.android.gms.auth.api.proxy.ProxyResponse) r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
        L_0x0337:
            goto L_0x033e
        L_0x0338:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x033e:
            aucj r6 = r5.b
            anps r6 = (defpackage.anps) r6
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r6.b = r3
            aucj r3 = r5.i()
            anps r3 = (defpackage.anps) r3
            r1.h = r3
            r1.a(r2, r3)
            return
        L_0x0356:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            com.google.android.gms.auth.api.proxy.ProxyRequest r9 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r9 = r9.b     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r10.length()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            int r10 = r10 + 48
            r11.<init>(r10)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r10 = "The supplied url [ "
            r11.append(r10)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r11.append(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r9 = " ] is not a valid Google url!"
            r11.append(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            java.lang.String r9 = r11.toString()     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            r8.<init>(r9)     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
            throw r8     // Catch:{ UserRecoverableAuthException -> 0x0475, eif -> 0x0447, fvc -> 0x03fc, IOException -> 0x03d2, RemoteException -> 0x03ae, SecurityException -> 0x0384 }
        L_0x0380:
            r0 = move-exception
            r3 = r0
            goto L_0x04a7
        L_0x0384:
            r0 = move-exception
            r3 = 3005(0xbbd, float:4.211E-42)
            r4 = -1
            r8 = 0
            r1.a(r2, r3, r4, r8)     // Catch:{ all -> 0x0380 }
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x0391
            goto L_0x0397
        L_0x0391:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x0397:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 5
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x03ae:
            r0 = move-exception
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x03b4
            goto L_0x03ba
        L_0x03b4:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x03ba:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 4
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x03d2:
            r0 = move-exception
            r3 = 7
            r4 = -1
            r8 = 0
            r1.a(r2, r3, r4, r8)     // Catch:{ all -> 0x0380 }
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x03de
            goto L_0x03e4
        L_0x03de:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x03e4:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 3
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x03fc:
            r0 = move-exception
            r3 = r0
            com.android.volley.NetworkResponse r4 = r3.b     // Catch:{ all -> 0x0380 }
            if (r4 != 0) goto L_0x040a
            int r3 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = 0
            r8 = 0
            r1.a(r2, r8, r3, r4)     // Catch:{ all -> 0x0380 }
            goto L_0x0424
        L_0x040a:
            int r13 = r3.a     // Catch:{ all -> 0x0380 }
            java.util.Map r3 = r4.headers     // Catch:{ all -> 0x0380 }
            byte[] r15 = r4.data     // Catch:{ all -> 0x0380 }
            com.google.android.gms.auth.api.proxy.ProxyResponse r4 = new com.google.android.gms.auth.api.proxy.ProxyResponse     // Catch:{ all -> 0x0380 }
            r10 = 1
            r11 = 0
            r12 = 0
            android.os.Bundle r14 = com.google.android.gms.auth.api.proxy.ProxyResponse.a(r3)     // Catch:{ all -> 0x0380 }
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0380 }
            fuw r3 = r1.f     // Catch:{ RemoteException -> 0x0423 }
            r3.a((com.google.android.gms.auth.api.proxy.ProxyResponse) r4)     // Catch:{ RemoteException -> 0x0423 }
            goto L_0x0424
        L_0x0423:
            r0 = move-exception
        L_0x0424:
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x0429
            goto L_0x042f
        L_0x0429:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x042f:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 2
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x0447:
            r0 = move-exception
            android.util.Log.e(r4, r3)     // Catch:{ all -> 0x0380 }
            r3 = 3004(0xbbc, float:4.21E-42)
            r4 = -1
            r8 = 0
            r1.a(r2, r3, r4, r8)     // Catch:{ all -> 0x0380 }
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x0457
            goto L_0x045d
        L_0x0457:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x045d:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 1
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x0475:
            r0 = move-exception
            r8 = r0
            android.util.Log.e(r4, r3)     // Catch:{ all -> 0x0380 }
            android.content.Intent r3 = r8.a()     // Catch:{ all -> 0x0380 }
            r4 = 3004(0xbbc, float:4.21E-42)
            r8 = -1
            r1.a(r2, r4, r8, r3)     // Catch:{ all -> 0x0380 }
            boolean r3 = r5.c     // Catch:{ all -> 0x0380 }
            if (r3 != 0) goto L_0x0489
            goto L_0x048f
        L_0x0489:
            r5.c()     // Catch:{ all -> 0x0380 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0380 }
        L_0x048f:
            aucj r3 = r5.b     // Catch:{ all -> 0x0380 }
            anps r3 = (defpackage.anps) r3     // Catch:{ all -> 0x0380 }
            r4 = 0
            r3.i = r4     // Catch:{ all -> 0x0380 }
            int r4 = r3.a     // Catch:{ all -> 0x0380 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ all -> 0x0380 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0338
            goto L_0x0337
        L_0x04a7:
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x04b1
            goto L_0x04b7
        L_0x04b1:
            r5.c()
            r4 = 0
            r5.c = r4
        L_0x04b7:
            aucj r4 = r5.b
            anps r4 = (defpackage.anps) r4
            int r6 = r4.a
            r7 = 1
            r6 = r6 | r7
            r4.a = r6
            r4.b = r8
            aucj r4 = r5.i()
            anps r4 = (defpackage.anps) r4
            r1.h = r4
            r1.a(r2, r4)
            goto L_0x04d0
        L_0x04cf:
            throw r3
        L_0x04d0:
            goto L_0x04cf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvl.a(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, anps anps) {
        if (((double) new Random().nextFloat()) < awoq.a.a().a()) {
            this.j = new hol(context, "ANDROID_AUTH", (String) null);
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 14;
            int i2 = anon.a | 1;
            anon.a = i2;
            anps.getClass();
            anon.j = anps;
            anon.a = i2 | FragmentTransaction.TRANSIT_EXIT_MASK;
            this.j.a(((anon) o.i()).k()).b();
        }
    }
}
