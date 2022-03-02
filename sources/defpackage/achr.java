package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: achr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achr extends acju {
    public static final iwd a = acqa.a("Setup", "Accounts", "AccountsServiceImpl");
    private static final long f = TimeUnit.MINUTES.toMillis(5);
    private static volatile boolean g = false;
    public final Context b;
    public final aors c;
    public final aboo d;
    public final abna e;
    private final Handler h;
    private final gck i;
    private final gaj j;
    private final abvs k;

    public achr(Context context, Handler handler) {
        if (aboo.a == null) {
            synchronized (aboo.class) {
                if (aboo.a == null) {
                    aboo.a = new abot();
                }
            }
        }
        aboo aboo = aboo.a;
        achm achm = new achm(context);
        gck gck = new gck(context);
        gaj a2 = gac.a(context);
        abvs a3 = abvs.a(context);
        this.b = context;
        this.h = handler;
        this.d = aboo;
        this.j = a2;
        this.e = abpo.a(context);
        this.i = gck;
        this.c = aors.a(achm);
        this.k = a3;
        handler.post(new achn(this));
    }

    public static aurq a(DeviceRiskSignals deviceRiskSignals) {
        if (deviceRiskSignals == null) {
            return null;
        }
        aucd o = aurq.e.o();
        aucd o2 = aurp.h.o();
        long j2 = deviceRiskSignals.c;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aurp aurp = (aurp) o2.b;
        int i2 = aurp.a | 2;
        aurp.a = i2;
        aurp.c = j2;
        String str = deviceRiskSignals.e;
        str.getClass();
        int i3 = i2 | 16;
        aurp.a = i3;
        aurp.e = str;
        String str2 = deviceRiskSignals.d;
        str2.getClass();
        aurp.a = i3 | 8;
        aurp.d = str2;
        int a2 = aurs.a(deviceRiskSignals.b);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aurp aurp2 = (aurp) o2.b;
        int i4 = a2 - 1;
        if (a2 != 0) {
            aurp2.b = i4;
            int i5 = aurp2.a | 1;
            aurp2.a = i5;
            long j3 = deviceRiskSignals.f;
            int i6 = i5 | 32;
            aurp2.a = i6;
            aurp2.f = j3;
            long j4 = deviceRiskSignals.g;
            aurp2.a = i6 | 64;
            aurp2.g = j4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aurq aurq = (aurq) o.b;
            aurp aurp3 = (aurp) o2.i();
            aurp3.getClass();
            aurq.b = aurp3;
            aurq.a |= 1;
            ScreenlockState screenlockState = deviceRiskSignals.h;
            if (screenlockState != null) {
                aucd o3 = aurt.g.o();
                long j5 = screenlockState.e;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aurt aurt = (aurt) o3.b;
                int i7 = aurt.a | 32;
                aurt.a = i7;
                aurt.e = j5;
                boolean z = screenlockState.f;
                int i8 = i7 | 64;
                aurt.a = i8;
                aurt.f = z;
                long j6 = screenlockState.d;
                aurt.a = i8 | 4;
                aurt.d = j6;
                int a3 = aurv.a(screenlockState.c);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aurt aurt2 = (aurt) o3.b;
                int i9 = a3 - 1;
                if (a3 != 0) {
                    aurt2.c = i9;
                    int i10 = aurt2.a | 2;
                    aurt2.a = i10;
                    boolean z2 = screenlockState.b;
                    aurt2.a = i10 | 1;
                    aurt2.b = z2;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aurq aurq2 = (aurq) o.b;
                    aurt aurt3 = (aurt) o3.i();
                    aurt3.getClass();
                    aurq2.c = aurt3;
                    aurq2.a |= 2;
                } else {
                    throw null;
                }
            }
            StarguardData starguardData = deviceRiskSignals.i;
            if (starguardData != null) {
                aucd o4 = aurw.c.o();
                String b2 = amrk.b(starguardData.b);
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aurw aurw = (aurw) o4.b;
                b2.getClass();
                aurw.a |= 1;
                aurw.b = b2;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aurq aurq3 = (aurq) o.b;
                aurw aurw2 = (aurw) o4.i();
                aurw2.getClass();
                aurq3.d = aurw2;
                aurq3.a |= 4;
            }
            return (aurq) o.i();
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r6v42, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.oq b(com.google.android.gms.smartdevice.setup.accounts.Challenge r23, boolean r24, boolean r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            abna r3 = r1.e
            int r4 = r0.b
            amsv r3 = r3.d
            java.lang.Object r3 = r3.a()
            ahgz r3 = (defpackage.ahgz) r3
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r6[r7] = r4
            r3.b(r6)
            java.lang.String r3 = "201216073"
            int r4 = r0.b
            if (r4 != 0) goto L_0x032f
            java.lang.String r4 = r0.c
            byte[] r8 = r0.e     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            android.content.Context r0 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            long r9 = defpackage.jhg.a((android.content.Context) r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r9 = java.lang.Long.toHexString(r9)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            azkv r0 = defpackage.azkv.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            azkw r0 = r0.a()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r0 = r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r10 = 2
            if (r0 == 0) goto L_0x005f
            acjz r0 = new acjz     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            android.content.Context r3 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            lya r11 = r22.b()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.util.Map r9 = a((java.lang.String) r9, (byte[]) r8)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.<init>(r3, r11, r9, r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals r0 = r0.a()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aurq r0 = a((com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals) r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            byte[] r0 = r0.k()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = "source_device_signals_v2"
            goto L_0x0269
        L_0x005f:
            android.content.Context r0 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r0 = defpackage.acpm.a(r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqed r11 = defpackage.aqed.g     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aucd r11 = r11.o()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r0 != 0) goto L_0x006f
            r12 = 1
            goto L_0x0070
        L_0x006f:
            r12 = 2
        L_0x0070:
            boolean r13 = r11.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r13 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r11.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r11.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x007a:
            aucj r13 = r11.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqed r13 = (defpackage.aqed) r13     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r13.d = r12     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r12 = r13.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r12 = r12 | 4
            r13.a = r12     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r12 = r12 | r5
            r13.a = r12     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r13.b = r0     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r12 = r12 | r10
            r13.a = r12     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r13.c = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r14 = -1
            if (r0 == 0) goto L_0x0150
            hwz r2 = new hwz     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.<init>()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            jca r0 = defpackage.jca.a()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            android.content.Context r12 = r1.b     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            android.content.Intent r13 = new android.content.Intent     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r13.<init>()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            android.content.Context r6 = r1.b     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            java.lang.String r10 = "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"
            android.content.Intent r6 = r13.setClassName(r6, r10)     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r0.a(r12, r6, r2, r5)     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            android.os.IBinder r0 = r2.a()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r6 = "com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService"
            android.os.IInterface r6 = r0.queryLocalInterface(r6)     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            boolean r10 = r6 instanceof defpackage.gdu     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            if (r10 != 0) goto L_0x00c6
            gds r6 = new gds     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r6.<init>(r0)     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r0 = r6
            goto L_0x00cb
        L_0x00c6:
            r0 = r6
            gdu r0 = (defpackage.gdu) r0     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            long r12 = r0.b()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            long r16 = r0.c()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r18 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            long r20 = r20 - r12
            long r20 = r20 / r18
            r12 = r20
            goto L_0x00e5
        L_0x00e4:
            r12 = r14
        L_0x00e5:
            boolean r0 = r11.c     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            if (r0 != 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r11.c()     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r11.c = r7     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
        L_0x00ef:
            aucj r0 = r11.b     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            aqed r0 = (defpackage.aqed) r0     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            int r6 = r0.a     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r6 = r6 | 8
            r0.a = r6     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r0.e = r12     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            int r10 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0104
            long r16 = r16 / r18
            r12 = r16
            goto L_0x0105
        L_0x0104:
            r12 = r14
        L_0x0105:
            r6 = r6 | 16
            r0.a = r6     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            r0.f = r12     // Catch:{ InterruptedException -> 0x0116, RemoteException -> 0x0114 }
            jca r0 = defpackage.jca.a()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            android.content.Context r6 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            goto L_0x0142
        L_0x0112:
            r0 = move-exception
            goto L_0x0146
        L_0x0114:
            r0 = move-exception
            goto L_0x0117
        L_0x0116:
            r0 = move-exception
        L_0x0117:
            iwd r6 = a     // Catch:{ all -> 0x0112 }
            java.lang.String r10 = "Could not get device signals. Setting to insecure."
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0112 }
            r6.d(r10, r0, r12)     // Catch:{ all -> 0x0112 }
            boolean r0 = r11.c     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            r11.c()     // Catch:{ all -> 0x0112 }
            r11.c = r7     // Catch:{ all -> 0x0112 }
        L_0x012a:
            aucj r0 = r11.b     // Catch:{ all -> 0x0112 }
            aqed r0 = (defpackage.aqed) r0     // Catch:{ all -> 0x0112 }
            int r6 = r0.a     // Catch:{ all -> 0x0112 }
            r6 = r6 | 8
            r0.a = r6     // Catch:{ all -> 0x0112 }
            r0.e = r14     // Catch:{ all -> 0x0112 }
            r6 = r6 | 16
            r0.a = r6     // Catch:{ all -> 0x0112 }
            r0.f = r14     // Catch:{ all -> 0x0112 }
            jca r0 = defpackage.jca.a()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            android.content.Context r6 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x0142:
            r0.a((android.content.Context) r6, (android.content.ServiceConnection) r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            goto L_0x015c
        L_0x0146:
            jca r3 = defpackage.jca.a()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            android.content.Context r4 = r1.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.a((android.content.Context) r4, (android.content.ServiceConnection) r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            throw r0     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x0150:
            r0 = r12 | 8
            r13.a = r0     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r13.e = r14     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0 = r0 | 16
            r13.a = r0     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r13.f = r14     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x015c:
            iwd r0 = a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aucj r2 = r11.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqed r2 = (defpackage.aqed) r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            long r12 = r2.e     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6 = 43
            r2.<init>(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = "lastUnlockDurationInS: "
            r2.append(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.append(r12)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.b(r2, r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            iwd r0 = a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aucj r2 = r11.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqed r2 = (defpackage.aqed) r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            long r12 = r2.f     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6 = 48
            r2.<init>(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = "lockScreenSetupDurationInS: "
            r2.append(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.append(r12)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.b(r2, r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r0 = defpackage.aqdq.i     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aucd r0 = r0.o()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r2 = r0.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r2 != 0) goto L_0x01a7
            goto L_0x01ac
        L_0x01a7:
            r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x01ac:
            aucj r2 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r2 = (defpackage.aqdq) r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r9.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r6 = r2.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6 = r6 | r5
            r2.a = r6     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.b = r9     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r6 = r0.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r6 != 0) goto L_0x01c1
            goto L_0x01c6
        L_0x01c1:
            r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x01c6:
            aucj r6 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r6 = (defpackage.aqdq) r6     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r9 = r6.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r9 = r9 | 4
            r6.a = r9     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6.d = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = android.os.Build.DEVICE     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r6 = r0.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r6 != 0) goto L_0x01dc
            goto L_0x01e1
        L_0x01dc:
            r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x01e1:
            aucj r6 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r6 = (defpackage.aqdq) r6     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r9 = r6.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r10 = 2
            r9 = r9 | r10
            r6.a = r9     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6.c = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2 = r9 | 16
            r6.a = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6.f = r3     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            boolean r3 = r0.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r3 != 0) goto L_0x0204
            goto L_0x0209
        L_0x0204:
            r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x0209:
            aucj r3 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r3 = (defpackage.aqdq) r3     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r6 = r3.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6 = r6 | 8
            r3.a = r6     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.e = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aucj r2 = r11.i()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqed r2 = (defpackage.aqed) r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.h = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r2 = r3.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2 = r2 | 64
            r3.a = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r25 != 0) goto L_0x022c
            goto L_0x025d
        L_0x022c:
            aucj r2 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r2 = (defpackage.aqdq) r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = r2.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r8 == 0) goto L_0x0243
            lya r3 = r22.b()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r3 == 0) goto L_0x0243
            java.util.Map r2 = a((java.lang.String) r2, (byte[]) r8)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = r3.a(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            goto L_0x0244
        L_0x0243:
            r2 = 0
        L_0x0244:
            boolean r3 = r0.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            if (r3 != 0) goto L_0x0249
            goto L_0x024e
        L_0x0249:
            r0.c()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r0.c = r7     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x024e:
            aucj r3 = r0.b     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r3 = (defpackage.aqdq) r3     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r2.getClass()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            int r6 = r3.a     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r6 = r6 | 32
            r3.a = r6     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.g = r2     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
        L_0x025d:
            aucj r0 = r0.i()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            aqdq r0 = (defpackage.aqdq) r0     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            byte[] r0 = r0.k()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = "source_device_signals"
        L_0x0269:
            org.json.JSONStringer r3 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            r3.<init>()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r3 = r3.object()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = "typ"
            org.json.JSONStringer r3 = r3.key(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = "navigator.id.getAssertion"
            org.json.JSONStringer r3 = r3.value(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = "challenge"
            org.json.JSONStringer r3 = r3.key(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r6 = defpackage.jhy.d(r8)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r3 = r3.value(r6)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r2 = r3.key(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r0 = defpackage.jhy.d(r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r0 = r2.value(r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = "account_identifier"
            org.json.JSONStringer r0 = r0.key(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r0 = r0.value(r4)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            org.json.JSONStringer r0 = r0.endObject()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.nio.charset.Charset r2 = defpackage.amqn.c     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            byte[] r2 = r2.digest(r0)     // Catch:{ JSONException -> 0x0320, NoSuchAlgorithmException -> 0x031e }
            gck r3 = r1.i
            gcg r6 = new gcg
            r6.<init>(r4)
            java.lang.Object r3 = r3.a((defpackage.gcj) r6)
            com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse r3 = (com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse) r3
            java.lang.Long r3 = r3.b
            if (r3 != 0) goto L_0x02d4
            abna r0 = r1.e
            r2 = 10659(0x29a3, float:1.4936E-41)
            r0.a(r2)
            r2 = 0
            return r2
        L_0x02d4:
            ausr r4 = defpackage.ausr.d
            aucd r4 = r4.o()
            auay r2 = defpackage.auay.a((byte[]) r2)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x02e3
            goto L_0x02e8
        L_0x02e3:
            r4.c()
            r4.c = r7
        L_0x02e8:
            aucj r6 = r4.b
            ausr r6 = (defpackage.ausr) r6
            r2.getClass()
            int r8 = r6.a
            r5 = r5 | r8
            r6.a = r5
            r6.b = r2
            long r2 = r3.longValue()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x02ff
            goto L_0x0304
        L_0x02ff:
            r4.c()
            r4.c = r7
        L_0x0304:
            aucj r5 = r4.b
            ausr r5 = (defpackage.ausr) r5
            int r6 = r5.a
            r7 = 2
            r6 = r6 | r7
            r5.a = r6
            r5.c = r2
            defpackage.ausr.a(r5)
            aucj r2 = r4.i()
            ausr r2 = (defpackage.ausr) r2
            oq r0 = defpackage.oq.a(r0, r2)
            return r0
        L_0x031e:
            r0 = move-exception
            goto L_0x0321
        L_0x0320:
            r0 = move-exception
        L_0x0321:
            iwd r2 = a
            r2.a((java.lang.Throwable) r0)
            abna r0 = r1.e
            r2 = 10660(0x29a4, float:1.4938E-41)
            r0.a(r2)
            r2 = 0
            return r2
        L_0x032f:
            iwd r2 = a
            int r0 = r0.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 47
            r3.<init>(r4)
            java.lang.String r4 = "challenge status was not STATUS_OK: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r2.e(r0, r3)
            abna r0 = r1.e
            r2 = 10658(0x29a2, float:1.4935E-41)
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achr.b(com.google.android.gms.smartdevice.setup.accounts.Challenge, boolean, boolean):oq");
    }

    public final void c(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.h.post(new achp(this, exchangeAssertionsForUserCredentialsRequest, acjs));
    }

    private static Assertion a(Challenge challenge) {
        if (g) {
            a.b("Creating fake assertion for %s", challenge.c);
            return new Assertion(challenge.c, new byte[0], new byte[0], challenge.f, challenge.e);
        }
        azkq.c();
        return null;
    }

    private static Object a(acwa acwa) {
        acws.a(acwa, f, TimeUnit.MILLISECONDS);
        return acwa.d();
    }

    private static Map a(String str, byte[] bArr) {
        byte[] bArr2;
        MessageDigest b2 = jhg.b("SHA-1");
        if (b2 == null) {
            a.d("Could not get SHA-1 Message Digest.", new Object[0]);
            bArr2 = new byte[0];
        } else {
            bArr2 = b2.digest(bArr);
        }
        return jir.b("androidId", str, "challengeHash", jhy.d(bArr2));
    }

    public static final byte[] a(int i2) {
        aucd o = auss.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auss auss = (auss) o.b;
        auss.b = 11;
        auss.a |= 1;
        auss.a(auss);
        return ((auss) o.i()).k();
    }

    public final aqdi a(Assertion assertion) {
        aucd o = aqdi.h.o();
        auay auay = auay.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi = (aqdi) o.b;
        auay.getClass();
        int i2 = aqdi.a | 4;
        aqdi.a = i2;
        aqdi.d = auay;
        String str = assertion.b;
        str.getClass();
        int i3 = 1;
        aqdi.a = i2 | 1;
        aqdi.b = str;
        int a2 = aqdk.a(assertion.g);
        if (a2 != 0) {
            i3 = a2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi2 = (aqdi) o.b;
        aqdi2.g = i3 - 1;
        aqdi2.a |= 32;
        auay a3 = auay.a(assertion.f);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi3 = (aqdi) o.b;
        a3.getClass();
        aqdi3.a |= 16;
        aqdi3.f = a3;
        auay a4 = auay.a(assertion.e);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi4 = (aqdi) o.b;
        a4.getClass();
        aqdi4.a |= 8;
        aqdi4.e = a4;
        auay a5 = auay.a(assertion.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi5 = (aqdi) o.b;
        a5.getClass();
        aqdi5.a |= 2;
        aqdi5.c = a5;
        auay a6 = auay.a(assertion.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqdi aqdi6 = (aqdi) o.b;
        a6.getClass();
        aqdi6.a |= 4;
        aqdi6.d = a6;
        return (aqdi) o.i();
    }

    public final Assertion a(Challenge challenge, boolean z, boolean z2) {
        Assertion a2 = a(challenge);
        if (a2 != null) {
            return a2;
        }
        oq b2 = b(challenge, z, z2);
        if (b2 != null) {
            byte[] bArr = (byte[]) b2.a;
            ausr ausr = (ausr) b2.b;
            if (!(bArr == null || ausr == null)) {
                Account account = new Account(challenge.c, "com.google");
                try {
                    return new Assertion(challenge.c, bArr, ((SignCryptedBlob) a(this.j.a("PublicKey", "authzen", account, new Payload(a(12), ausr.k())))).c, challenge.f, challenge.e);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    a.a(e2);
                    this.e.a(10660);
                    return null;
                }
            }
        }
        return null;
    }

    public final lya b() {
        try {
            return (lya) this.c.get();
        } catch (InterruptedException | ExecutionException e2) {
            a.d("Could not get DroidGuard snapshot.", e2, new Object[0]);
            return null;
        }
    }

    public final void b(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        String str;
        Status status;
        byte[] bArr;
        Status status2 = new Status(8);
        try {
            if (b() == null) {
                status = new Status(10651);
                try {
                    this.e.a(status.i);
                } catch (Throwable th) {
                    Status status3 = status;
                    th = th;
                    status2 = status3;
                    acjs.c(status2, exchangeAssertionsForUserCredentialsRequest);
                    throw th;
                }
            } else {
                String hexString = Long.toHexString(jhg.a(this.b));
                String str2 = Build.DEVICE;
                String str3 = Build.MODEL;
                String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                ArrayList<Assertion> arrayList = exchangeAssertionsForUserCredentialsRequest.b;
                if (arrayList != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    for (Assertion assertion : arrayList) {
                        byteArrayOutputStream.write(assertion.d);
                    }
                    MessageDigest b2 = jhg.b("SHA-1");
                    if (b2 == null) {
                        a.d("Could not get SHA-1 Message Digest.", new Object[0]);
                        bArr = new byte[0];
                    } else {
                        bArr = b2.digest(byteArrayOutputStream.toByteArray());
                    }
                    String d2 = jhy.d(bArr);
                    lya b3 = b();
                    if (b3 != null) {
                        str = b3.a(jir.b("androidId", hexString, "encryptedUserAssertionHash", d2));
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                exchangeAssertionsForUserCredentialsRequest.a(new DeviceSignals(hexString, str2, str3, valueOf, "201216073", str));
                exchangeAssertionsForUserCredentialsRequest.e(Locale.getDefault().toString());
                status = new Status(0);
            }
        } catch (IOException e2) {
            a.d("Could not convert assertions to bytes.", e2, new Object[0]);
            str = null;
        } catch (Throwable th2) {
            th = th2;
            acjs.c(status2, exchangeAssertionsForUserCredentialsRequest);
            throw th;
        }
        acjs.c(status, exchangeAssertionsForUserCredentialsRequest);
    }

    public final void a() {
        lya b2 = b();
        if (b2 != null) {
            b2.b();
        }
    }

    public final void a(acjs acjs) {
        Account[] a2 = qub.a(this.b).a("com.google");
        BootstrapAccount[] bootstrapAccountArr = new BootstrapAccount[a2.length];
        for (int i2 = 0; i2 < a2.length; i2++) {
            Account account = a2[i2];
            bootstrapAccountArr[i2] = new BootstrapAccount(account.name, account.type);
        }
        try {
            acjs.a(Status.a, bootstrapAccountArr);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public final void a(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Status status = new Status(8);
        try {
            String a2 = acph.a(this.b);
            if (a2 != null) {
                a.c("Backup account found.", new Object[0]);
                a.b(a2.length() == 0 ? new String("Backup enabled with account: ") : "Backup enabled with account: ".concat(a2), new Object[0]);
            } else {
                a.c("Backup account not found.", new Object[0]);
            }
            String hexString = Long.toHexString(jhg.a(this.b));
            if (TextUtils.isEmpty(hexString)) {
                a.c("Android ID is null or empty.", new Object[0]);
            }
            if (a2 == null) {
                a2 = "";
            }
            if (hexString == null) {
                hexString = "";
            }
            exchangeAssertionsForUserCredentialsRequest.f(a2);
            exchangeAssertionsForUserCredentialsRequest.g(hexString);
            status = new Status(0);
        } finally {
            acjs.b(status, exchangeAssertionsForUserCredentialsRequest);
        }
    }

    public final void a(acjs acjs, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.h.post(new achq(this, exchangeSessionCheckpointsForUserCredentialsRequest, acjs));
    }

    public final void a(acjs acjs, boolean z) {
        g = z;
        acjs.a(new Status(0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084, all -> 0x00f5, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1 A[Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084, all -> 0x00f5, all -> 0x00f0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.acjs r11, android.accounts.Account[] r12) {
        /*
            r10 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x013c
        L_0x0005:
            int r1 = r12.length
            if (r1 == 0) goto L_0x013c
            azjn r2 = defpackage.azjn.a
            azjo r2 = r2.a()
            boolean r2 = r2.e()
            r3 = 0
            if (r2 == 0) goto L_0x0038
            abvs r2 = r10.k
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r5 = 0
        L_0x001d:
            if (r5 >= r1) goto L_0x0030
            r6 = r12[r5]
            com.google.android.gms.smartdevice.d2d.BootstrapAccount r7 = new com.google.android.gms.smartdevice.d2d.BootstrapAccount
            java.lang.String r8 = r6.name
            java.lang.String r6 = r6.type
            r7.<init>(r8, r6)
            r4.add(r7)
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0030:
            r2.a((java.util.List) r4)
            abvs r1 = r10.k
            r1.a()
        L_0x0038:
            boolean r1 = defpackage.azjq.c()
            java.lang.String r2 = "PublicKey"
            if (r1 != 0) goto L_0x00fc
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r4 = 8
            r1.<init>(r4)
            int r4 = r12.length     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[] r0 = new com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[r4]     // Catch:{ all -> 0x00f7 }
            r5 = 0
        L_0x004b:
            if (r5 < r4) goto L_0x0056
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00f5 }
            r12.<init>(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0052:
            r11.a((com.google.android.gms.common.api.Status) r12, (com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[]) r0)
            return
        L_0x0056:
            r6 = r12[r5]     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x00f5 }
            r7 = r12[r5]     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            boolean r8 = g     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            if (r8 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            defpackage.azkq.c()     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
        L_0x0064:
            gaj r8 = r10.j     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            acwa r7 = r8.a(r2, r7)     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            java.lang.Object r7 = a((defpackage.acwa) r7)     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            com.google.android.gms.auth.cryptauth.CryptauthPublicKey r7 = (com.google.android.gms.auth.cryptauth.CryptauthPublicKey) r7     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            byte[] r7 = r7.b     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            java.security.PublicKey r7 = defpackage.ausq.b(r7)     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            byte[] r7 = defpackage.ausq.a((java.security.PublicKey) r7)     // Catch:{ InvalidKeySpecException -> 0x00be, InterruptedException -> 0x0088, ExecutionException -> 0x0086, TimeoutException -> 0x0084 }
            com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo r8 = new com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo     // Catch:{ all -> 0x00f5 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x00f5 }
            r0[r5] = r8     // Catch:{ all -> 0x00f5 }
            int r5 = r5 + 1
            goto L_0x004b
        L_0x0084:
            r12 = move-exception
            goto L_0x0089
        L_0x0086:
            r12 = move-exception
            goto L_0x0089
        L_0x0088:
            r12 = move-exception
        L_0x0089:
            iwd r2 = a     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "Failed retrieve PublicKey for account: "
            java.lang.String r5 = defpackage.iwd.a((java.lang.Object) r6)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f5 }
            int r6 = r5.length()     // Catch:{ all -> 0x00f5 }
            if (r6 != 0) goto L_0x00a1
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r5 = r4.concat(r5)     // Catch:{ all -> 0x00f5 }
        L_0x00a5:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f5 }
            r2.e(r5, r12, r3)     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00f5 }
            r2 = 10656(0x29a0, float:1.4932E-41)
            r12.<init>(r2)     // Catch:{ all -> 0x00f5 }
            abna r1 = r10.e     // Catch:{ all -> 0x00b9 }
            int r2 = r12.i     // Catch:{ all -> 0x00b9 }
            r1.a(r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x0052
        L_0x00b9:
            r1 = move-exception
            r9 = r1
            r1 = r12
            r12 = r9
            goto L_0x00f8
        L_0x00be:
            r12 = move-exception
            iwd r2 = a     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "Could not get public key of user: "
            java.lang.String r5 = defpackage.iwd.a((java.lang.Object) r6)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f5 }
            int r6 = r5.length()     // Catch:{ all -> 0x00f5 }
            if (r6 != 0) goto L_0x00d7
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x00db
        L_0x00d7:
            java.lang.String r5 = r4.concat(r5)     // Catch:{ all -> 0x00f5 }
        L_0x00db:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f5 }
            r2.e(r5, r12, r3)     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00f5 }
            r2 = 10657(0x29a1, float:1.4934E-41)
            r12.<init>(r2)     // Catch:{ all -> 0x00f5 }
            abna r1 = r10.e     // Catch:{ all -> 0x00f0 }
            int r2 = r12.i     // Catch:{ all -> 0x00f0 }
            r1.a(r2)     // Catch:{ all -> 0x00f0 }
            goto L_0x0052
        L_0x00f0:
            r1 = move-exception
            r9 = r1
            r1 = r12
            r12 = r9
            goto L_0x00f8
        L_0x00f5:
            r12 = move-exception
            goto L_0x00f8
        L_0x00f7:
            r12 = move-exception
        L_0x00f8:
            r11.a((com.google.android.gms.common.api.Status) r1, (com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[]) r0)
            throw r12
        L_0x00fc:
            int r0 = r12.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0102:
            if (r3 >= r0) goto L_0x012f
            r4 = r12[r3]
            boolean r5 = g
            if (r5 == 0) goto L_0x010d
            defpackage.azkq.c()
        L_0x010d:
            gaj r5 = r10.j
            acwa r5 = r5.a(r2, r4)
            jls r6 = new jls
            android.os.Handler r7 = r10.h
            r6.<init>((android.os.Handler) r7)
            acvf r7 = defpackage.achl.a
            acwa r5 = r5.a((java.util.concurrent.Executor) r6, (defpackage.acvf) r7)
            achg r6 = new achg
            r6.<init>(r4)
            acwa r4 = r5.a((defpackage.acvf) r6)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0102
        L_0x012f:
            acwa r12 = defpackage.acws.c(r1)
            achh r0 = new achh
            r0.<init>(r10, r11)
            r12.a((defpackage.acvp) r0)
            return
        L_0x013c:
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status
            r1 = 10655(0x299f, float:1.4931E-41)
            r12.<init>(r1)
            r11.a((com.google.android.gms.common.api.Status) r12, (com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achr.a(acjs, android.accounts.Account[]):void");
    }

    public final void a(acjs acjs, Assertion[] assertionArr) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest;
        Status status = new Status(0);
        try {
            exchangeAssertionsForUserCredentialsRequest = new ExchangeAssertionsForUserCredentialsRequest(new ArrayList(Arrays.asList(assertionArr)), awjm.c());
            try {
                acjs.a(new Status(0), exchangeAssertionsForUserCredentialsRequest);
            } catch (Throwable th) {
                th = th;
                acjs.a(status, exchangeAssertionsForUserCredentialsRequest);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            exchangeAssertionsForUserCredentialsRequest = null;
            acjs.a(status, exchangeAssertionsForUserCredentialsRequest);
            throw th;
        }
    }

    public final void a(acjs acjs, Challenge[] challengeArr, boolean z) {
        a(acjs, challengeArr, z, false);
    }

    public final void a(acjs acjs, Challenge[] challengeArr, boolean z, boolean z2) {
        acwa acwa;
        Throwable th;
        Status status;
        if (!azjq.c()) {
            Status status2 = new Status(8);
            try {
                ArrayList arrayList = new ArrayList(challengeArr.length);
                for (int i2 = 0; i2 < challengeArr.length; i2++) {
                    Assertion a2 = a(challengeArr[i2], z, z2);
                    if (a2 == null) {
                        iwd iwd = a;
                        String valueOf = String.valueOf(challengeArr[i2].c);
                        iwd.e(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), new Object[0]);
                    } else {
                        arrayList.add(a2);
                    }
                }
                if (arrayList.size() == 0) {
                    a.e("No assertion infos returned!", new Object[0]);
                    status = new Status(10650);
                    try {
                        this.e.a(status.i);
                        acjs.a(status, (Assertion[]) null);
                    } catch (Throwable th2) {
                        th = th2;
                        status2 = status;
                        acjs.a(status2, (Assertion[]) null);
                        throw th;
                    }
                } else {
                    status = new Status(0);
                    acjs.a(status, (Assertion[]) arrayList.toArray(new Assertion[0]));
                }
            } catch (Throwable th3) {
                th = th3;
                acjs.a(status2, (Assertion[]) null);
                throw th;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Challenge challenge : challengeArr) {
                Assertion a3 = a(challenge);
                if (a3 != null) {
                    acwa = acws.a((Object) a3);
                } else {
                    oq b2 = b(challenge, z, z2);
                    if (b2 == null) {
                        acwa = acws.a((Exception) new ibr(Status.c));
                    } else {
                        byte[] bArr = (byte[]) b2.a;
                        ausr ausr = (ausr) b2.b;
                        if (bArr == null || ausr == null) {
                            acwa = acws.a((Exception) new ibr(Status.c));
                        } else {
                            acwa = this.j.a("PublicKey", "authzen", new Account(challenge.c, "com.google"), new Payload(a(12), ausr.k())).a((acvf) new achk(challenge, bArr));
                        }
                    }
                }
                acwa.a((acvs) new achi(challenge));
                arrayList2.add(acwa);
            }
            acws.c(arrayList2).a((acvp) new achj(this, acjs));
        }
    }

    public final void a(acjs acjs, UserBootstrapInfo[] userBootstrapInfoArr) {
        aqdw aqdw = (aqdw) aqdx.d.o();
        if (aqdw.c) {
            aqdw.c();
            aqdw.c = false;
        }
        aqdx aqdx = (aqdx) aqdw.b;
        aqdx.c = 1;
        aqdx.a |= 1;
        aqec[] aqecArr = new aqec[userBootstrapInfoArr.length];
        for (int i2 = 0; i2 < userBootstrapInfoArr.length; i2++) {
            UserBootstrapInfo userBootstrapInfo = userBootstrapInfoArr[i2];
            aucd o = aqec.d.o();
            String str = userBootstrapInfo.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqec aqec = (aqec) o.b;
            str.getClass();
            aqec.a |= 1;
            aqec.b = str;
            auay a2 = auay.a(userBootstrapInfo.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqec aqec2 = (aqec) o.b;
            a2.getClass();
            aqec2.a |= 2;
            aqec2.c = a2;
            aqecArr[i2] = (aqec) o.i();
        }
        aqdw.a(Arrays.asList(aqecArr));
        aqdx aqdx2 = (aqdx) aqdw.i();
        aucd o2 = avov.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avov avov = (avov) o2.b;
        aqdx2.getClass();
        avov.b = aqdx2;
        avov.a |= 1;
        this.h.post(new acho(this, (avov) o2.i(), acjs));
    }

    public final UserCredential[] a(List list, avpd[] avpdArr) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        for (avpd avpd : avpdArr) {
            hashMap.put(avpd.a, avpd);
        }
        UserCredential[] userCredentialArr = new UserCredential[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            aqeb aqeb = (aqeb) list.get(i2);
            int i3 = aqeb.b;
            if (i3 != 0) {
                ((ahgz) this.e.e.a()).b(Integer.valueOf(i3));
            }
            avpd avpd2 = (avpd) hashMap.get(aqeb.a);
            if (avpd2 != null) {
                String str3 = avpd2.b;
                str = avpd2.c;
                str2 = str3;
            } else {
                str2 = null;
                str = null;
            }
            userCredentialArr[i2] = new UserCredential(aqeb.a, aqeb.b, aqeb.c, aqeb.d, aqeb.e, str2, str);
        }
        return userCredentialArr;
    }
}
