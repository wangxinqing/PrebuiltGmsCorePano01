package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.KeyAgreement;

/* renamed from: aeha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeha {
    public static final /* synthetic */ int h = 0;
    private static String i;
    private static final byte[] j;
    private static final byte[] k;
    public final aejv a;
    public aegx b;
    public String c;
    public aegw d;
    aegv e;
    public String f;
    public tuq g;
    private final Context l;
    private final aeia m;
    private final aegn n;
    private final String o;
    private final aeij p;
    private aehf q;
    private boolean r;
    private byte[] s;
    private byte[] t;
    private String u;
    private boolean v;

    static {
        aehw aehw = new aehw((byte) 1, aefk.a(ByteOrder.LITTLE_ENDIAN, 4363, 4382, 4360));
        byte[] bArr = aehw.b;
        byte[] a2 = aooa.a(new byte[]{(byte) (bArr.length + 1), aehw.a}, bArr);
        j = a2;
        k = aooa.a(new byte[]{1, 1}, a2);
    }

    public aeha(Context context, String str, aeia aeia, tue tue) {
        aejv aejv;
        aeij aeij = new aeij("FastPairConnection", aeia);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            aejv = new aejv(defaultAdapter);
        } else {
            aejv = null;
        }
        amrl.a((Object) aejv);
        this.a = aejv;
        this.u = null;
        this.v = false;
        this.l = context;
        this.m = aeia;
        this.n = new aegn(tue);
        this.o = str;
        this.p = aeij;
    }

    private static int a(BluetoothAdapter bluetoothAdapter) {
        if (Build.VERSION.SDK_INT < 23) {
            return bluetoothAdapter.getState();
        }
        try {
            return ((Integer) aeic.a(bluetoothAdapter).a("getLeState", new Class[0]).b(new Object[0])).intValue();
        } catch (aeid e2) {
            anih anih = (anih) aehd.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "b", 1596, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't call getLeState");
            return bluetoothAdapter.getState();
        }
    }

    private static int b(BluetoothAdapter bluetoothAdapter) {
        try {
            return ((Integer) aeic.a(bluetoothAdapter).a("getLeState", new Class[0]).b(new Object[0])).intValue();
        } catch (aeid e2) {
            anih anih = (anih) aehd.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "b", 1596, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't call getLeState");
            return bluetoothAdapter.getState();
        }
    }

    private static void c(BluetoothAdapter bluetoothAdapter) {
        try {
            aeic.a(bluetoothAdapter).a("disableBLE", new Class[0]).a(new Object[0]);
        } catch (aeid e2) {
            anih anih = (anih) aehd.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "c", 1605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't call disableBLE");
        }
    }

    private final void d(BluetoothDevice bluetoothDevice) {
        aeif a2;
        ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1515, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Priming cache for %s via classic discovery", (Object) bluetoothDevice);
        aegd a3 = aegd.a(this.l, this.m, bluetoothDevice, "android.bluetooth.device.action.FOUND");
        try {
            a2 = aeif.a(this.l, this.m, "android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            this.n.a(aspb.DISCOVER_DEVICE);
            this.a.a.startDiscovery();
            a3.a((long) this.m.e(), TimeUnit.SECONDS);
            this.n.b();
            this.n.a(aspb.CANCEL_DISCOVERY);
            this.a.a.cancelDiscovery();
            a2.a((long) this.m.e(), TimeUnit.SECONDS);
            this.n.b();
            a2.close();
            a3.close();
            return;
        } catch (Throwable th) {
            try {
                a3.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    private static final boolean d(byte[] bArr) {
        return bArr != null && bArr.length == 64;
    }

    private final boolean f() {
        return d(this.t);
    }

    private final aejb g() {
        return b(f());
    }

    private final aehn h() {
        if (this.q == null) {
            this.q = new aehf(this.l, this.m, this.n, this.a, new aegp(this), this.o, this.p, g());
        }
        return new aehn(this.q, this.o, this.m.a());
    }

    private final void i() {
        ((anih) ((anih) aehd.a.d()).a("aeha", "i", 1403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("register for the device name response from address=%s", (Object) this.o);
        aeiy a2 = this.q.a();
        a2.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
        try {
            this.e = new aegv(a2);
        } catch (BluetoothException e2) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "i", 1411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't register for device name response, no naming characteristic.");
        }
    }

    private final void j() {
        aegx aegx = this.b;
        if (aegx != null) {
            String str = this.c;
            if (str == null) {
                str = this.o;
            }
            aegx.a(str);
        }
    }

    public final byte[] b() {
        aegw aegw = this.d;
        if (aegw != null) {
            return aegw.a;
        }
        return null;
    }

    public final void e() {
        try {
            a((byte[]) null);
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Should never happen, no security key!", e2);
        }
    }

    private final void c(byte[] bArr, String str) {
        ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1330, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing account key to address=%s", (Object) str);
        aeiy a2 = this.q.a();
        a2.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
        a2.a(aeft.a, aefl.a, bArr);
        ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1336, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished writing encrypted account key=%s", (Object) anml.g.a(bArr));
    }

    private final aejb b(boolean z) {
        aeja e2 = aejb.e();
        if (z) {
            e2.a = amri.b(83);
        }
        e2.a(TimeUnit.SECONDS.toMillis((long) this.m.b()));
        return e2.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a1 A[ExcHandler: aehv | aeig (e java.lang.Throwable), Splitter:B:1:0x0012] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final short[] c(defpackage.aeiy r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            aegn r0 = r1.n
            aspb r3 = defpackage.aspb.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK
            r0.a((defpackage.aspb) r3)
            java.lang.String r3 = "aeha"
            java.lang.String r4 = "c"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r6 = 0
            java.util.UUID r0 = defpackage.aefz.a     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aeia r7 = r1.m     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            short r7 = r7.t()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.UUID r7 = defpackage.aefj.a((short) r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aeia r8 = r1.m     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            short r8 = r8.v()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.UUID r8 = defpackage.aefj.a((short) r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r6] = r8     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r11 = 1
            r10[r11] = r7     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r12 = 2
            r10[r12] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            android.bluetooth.BluetoothGattCharacteristic r10 = r2.a(r0, r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.List r10 = r10.getDescriptors()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r13 = 0
        L_0x0040:
            boolean r14 = r10.hasNext()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r15 = 4
            if (r14 == 0) goto L_0x007a
            java.lang.Object r14 = r10.next()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            android.bluetooth.BluetoothGattDescriptor r14 = (android.bluetooth.BluetoothGattDescriptor) r14     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.UUID r9 = r14.getUuid()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            boolean r9 = r9.equals(r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            if (r9 == 0) goto L_0x0078
            if (r13 != 0) goto L_0x005b
            r13 = r14
            goto L_0x0078
        L_0x005b:
            com.google.android.libraries.bluetooth.BluetoothException r9 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r6] = r8     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r11] = r7     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r12] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejx r0 = r2.d     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejw r0 = r0.a()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2 = 3
            r10[r2] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = "More than one descriptor %s found on characteristic %s service %s on device %s."
            java.lang.String r0 = java.lang.String.format(r0, r10)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9.<init>(r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r9     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x0078:
            r9 = 3
            goto L_0x0040
        L_0x007a:
            if (r13 == 0) goto L_0x0184
            aekl r0 = r2.e     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            aeiu r7 = new aeiu     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            aeje r8 = defpackage.aeje.READ_DESCRIPTOR     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9[r6] = r8     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejx r8 = r2.d     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9[r11] = r8     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9[r12] = r13     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7.<init>(r2, r9, r13)     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            long r8 = r2.k     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Object r0 = r0.a((defpackage.aekj) r7, (long) r8)     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            byte[] r0 = (byte[]) r0     // Catch:{ BluetoothException -> 0x0160, aeig -> 0x01a3, aehv -> 0x01a1 }
            anil r2 = defpackage.aehd.a     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anie r2 = r2.d()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7 = 1281(0x501, float:1.795E-42)
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r7, (java.lang.String) r5)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r7 = "Got transport block: %s"
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r8 = r8.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2.a((java.lang.String) r7, (java.lang.Object) r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            int r2 = r0.length     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            if (r2 < r15) goto L_0x014a
            byte r7 = r0[r12]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8 = 3
            int r7 = r7 + r8
            if (r2 < r7) goto L_0x0134
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r8, r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2.<init>()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7 = 0
        L_0x00cb:
            int r8 = r0.length     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            if (r7 < r8) goto L_0x00f5
            java.util.Iterator r0 = r2.iterator()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x00d2:
            boolean r2 = r0.hasNext()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            if (r2 == 0) goto L_0x00ec
            java.lang.Object r2 = r0.next()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aehw r2 = (defpackage.aehw) r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            byte r7 = r2.a     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            if (r7 == r11) goto L_0x00e3
            goto L_0x00d2
        L_0x00e3:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            byte[] r2 = r2.b     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            short[] r0 = defpackage.aefk.a((java.nio.ByteOrder) r0, (byte[]) r2)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            goto L_0x00ef
        L_0x00ec:
            short[] r0 = new short[r6]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x00ef:
            aegn r2 = r1.n     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2.b()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            return r0
        L_0x00f5:
            byte r9 = r0[r7]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            int r10 = r9 + -1
            if (r10 < 0) goto L_0x0115
            int r13 = r7 + 2
            int r14 = r13 + r10
            if (r8 < r14) goto L_0x0115
            aehw r8 = new aehw     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            int r9 = r7 + 1
            byte r9 = r0[r9]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            byte[] r13 = java.util.Arrays.copyOfRange(r0, r13, r14)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8.<init>(r9, r13)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2.add(r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            int r10 = r10 + 2
            int r7 = r7 + r10
            goto L_0x00cb
        L_0x0115:
            aehv r2 = new aehv     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r6] = r9     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r11] = r7     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r7 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = r7.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r12] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = "Wrong length=%d at index=%d in LTVs=%s"
            r2.<init>(r0, r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x0134:
            aeig r2 = new aeig     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = r8.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7[r6] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = "Transport Block has wrong length byte: %s"
            r2.<init>(r15, r0, r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x014a:
            aeig r2 = new aeig     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = r8.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7[r6] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = "Transport Block null or too short: %s"
            r2.<init>(r15, r0, r7)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x0160:
            r0 = move-exception
            com.google.android.libraries.bluetooth.BluetoothException r7 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.util.UUID r9 = r13.getUuid()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r6] = r9     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r9 = defpackage.aekh.b((android.bluetooth.BluetoothGattDescriptor) r13)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r11] = r9     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejx r2 = r2.d     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejw r2 = r2.a()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r8[r12] = r2     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r2 = "Failed to read %s on %s on device %s."
            java.lang.String r2 = java.lang.String.format(r2, r8)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r7.<init>(r2, r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r7     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x0184:
            com.google.android.libraries.bluetooth.BluetoothException r9 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r6] = r8     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r11] = r7     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r10[r12] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejx r0 = r2.d     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            aejw r0 = r0.a()     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r2 = 3
            r10[r2] = r0     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            java.lang.String r0 = "Descriptor %s not found on characteristic %s on service %s of device %s."
            java.lang.String r0 = java.lang.String.format(r0, r10)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            r9.<init>(r0)     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
            throw r9     // Catch:{ BluetoothException -> 0x01a5, aeig -> 0x01a3, aehv -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a6
        L_0x01a3:
            r0 = move-exception
            goto L_0x01a6
        L_0x01a5:
            r0 = move-exception
        L_0x01a6:
            anil r2 = defpackage.aehd.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r0)
            r7 = 1286(0x506, float:1.802E-42)
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r7, (java.lang.String) r5)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "Failed to get supported profiles from transport block."
            r2.a((java.lang.String) r3)
            aegn r2 = r1.n
            r2.a((java.lang.Exception) r0)
            short[] r0 = new short[r6]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.c(aeiy):short[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0206, code lost:
        throw new defpackage.aehv("Wrong length=%d at index=%d in LTVs=%s", java.lang.Byte.valueOf(r12), java.lang.Integer.valueOf(r5), defpackage.anml.g.a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0276, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0276 A[ExcHandler: aehv | aeig (e java.lang.Throwable), Splitter:B:14:0x00e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.aegt a(defpackage.aeiy r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            anil r0 = defpackage.aehd.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "aeha"
            java.lang.String r4 = "a"
            r5 = 1225(0x4c9, float:1.717E-42)
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = r1.o
            java.lang.String r7 = "Connecting GATT server to BLE address=%s"
            r0.a((java.lang.String) r7, (java.lang.Object) r5)
            anil r0 = defpackage.aehd.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r5 = 1226(0x4ca, float:1.718E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r4 = "Telling device to become discoverable"
            r0.a((java.lang.String) r4)
            aegn r0 = r1.n
            aspb r4 = defpackage.aspb.BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST
            r0.a((defpackage.aspb) r4)
            java.util.UUID r0 = defpackage.aefz.a
            java.util.UUID r4 = defpackage.aefy.a
            aeix r0 = r2.c(r0, r4)
            java.util.UUID r4 = defpackage.aefz.a
            java.util.UUID r5 = defpackage.aefy.a
            byte[] r7 = k
            r2.a(r4, r5, r7)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            aeia r5 = r1.m
            int r5 = r5.a()
            long r7 = (long) r5
            long r4 = r4.toMillis(r7)
            byte[] r0 = r0.a(r4)
            aegy r4 = defpackage.aegy.a(r0)
            aegy r5 = defpackage.aegy.SUCCESS
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 != r5) goto L_0x02ba
            aegn r0 = r1.n
            r0.b()
            aegt r4 = new aegt
            anil r0 = defpackage.aehd.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r5 = 1254(0x4e6, float:1.757E-42)
            java.lang.String r10 = "b"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r10, (int) r5, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = "Getting Bluetooth MAC"
            r0.a((java.lang.String) r5)
            aegn r0 = r1.n
            aspb r5 = defpackage.aspb.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC
            r0.a((defpackage.aspb) r5)
            java.util.UUID r0 = defpackage.aefz.a
            aeia r5 = r1.m
            short r5 = r5.s()
            java.util.UUID r5 = defpackage.aefj.a((short) r5)
            byte[] r0 = r2.b(r0, r5)
            r5 = 3
            if (r0 != 0) goto L_0x00a4
            goto L_0x029e
        L_0x00a4:
            int r10 = r0.length
            r11 = 7
            if (r10 < r11) goto L_0x029e
            aefk r10 = new aefk
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r8, r11)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.<init>(r0, r11)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteOrder r11 = r10.b
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00d1
            byte[] r0 = r10.a
            int r10 = r0.length
            byte[] r10 = new byte[r10]
            r11 = 0
        L_0x00c3:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x00d0
            int r12 = r12 - r11
            int r12 = r12 + -1
            byte r12 = r0[r12]
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d0:
            goto L_0x00d3
        L_0x00d1:
            byte[] r10 = r10.a
        L_0x00d3:
            aegn r0 = r1.n
            r0.b()
            aegn r0 = r1.n
            aspb r11 = defpackage.aspb.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK
            r0.a((defpackage.aspb) r11)
            java.lang.String r11 = "c"
            java.util.UUID r0 = defpackage.aefz.a     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aeia r12 = r1.m     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            short r12 = r12.t()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.UUID r12 = defpackage.aefj.a((short) r12)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aeia r13 = r1.m     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            short r13 = r13.v()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.UUID r13 = defpackage.aefj.a((short) r13)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r14[r9] = r13     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r14[r8] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r14[r7] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            android.bluetooth.BluetoothGattCharacteristic r14 = r2.a(r0, r12)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.List r14 = r14.getDescriptors()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r15 = 0
        L_0x010c:
            boolean r16 = r14.hasNext()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5 = 4
            if (r16 == 0) goto L_0x0149
            java.lang.Object r16 = r14.next()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            android.bluetooth.BluetoothGattDescriptor r16 = (android.bluetooth.BluetoothGattDescriptor) r16     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.UUID r7 = r16.getUuid()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            boolean r7 = r7.equals(r13)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            if (r7 == 0) goto L_0x0146
            if (r15 != 0) goto L_0x0128
            r15 = r16
            goto L_0x0146
        L_0x0128:
            com.google.android.libraries.bluetooth.BluetoothException r7 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5[r9] = r13     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5[r8] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r8 = 2
            r5[r8] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejx r0 = r2.d     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejw r0 = r0.a()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2 = 3
            r5[r2] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = "More than one descriptor %s found on characteristic %s service %s on device %s."
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7.<init>(r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r7     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x0146:
            r5 = 3
            r7 = 2
            goto L_0x010c
        L_0x0149:
            if (r15 == 0) goto L_0x0258
            aekl r0 = r2.e     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            aeiu r7 = new aeiu     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            aeje r12 = defpackage.aeje.READ_DESCRIPTOR     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            r13[r9] = r12     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            aejx r12 = r2.d     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            r13[r8] = r12     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            r12 = 2
            r13[r12] = r15     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            r7.<init>(r2, r13, r15)     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            long r12 = r2.k     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object r0 = r0.a((defpackage.aekj) r7, (long) r12)     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            byte[] r0 = (byte[]) r0     // Catch:{ BluetoothException -> 0x0233, aeig -> 0x0278, aehv -> 0x0276 }
            anil r2 = defpackage.aehd.a     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anie r2 = r2.d()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7 = 1281(0x501, float:1.795E-42)
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r11, (int) r7, (java.lang.String) r6)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r7 = "Got transport block: %s"
            anml r12 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r12 = r12.b()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r12 = r12.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2.a((java.lang.String) r7, (java.lang.Object) r12)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            int r2 = r0.length     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            if (r2 < r5) goto L_0x021d
            r7 = 2
            byte r12 = r0[r7]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7 = 3
            int r12 = r12 + r7
            if (r2 < r12) goto L_0x0207
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r7, r12)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2.<init>()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5 = 0
        L_0x019c:
            int r7 = r0.length     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            if (r5 < r7) goto L_0x01c7
            java.util.Iterator r0 = r2.iterator()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x01a3:
            boolean r2 = r0.hasNext()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            if (r2 == 0) goto L_0x01bd
            java.lang.Object r2 = r0.next()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aehw r2 = (defpackage.aehw) r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            byte r5 = r2.a     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            if (r5 == r8) goto L_0x01b4
            goto L_0x01a3
        L_0x01b4:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            byte[] r2 = r2.b     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            short[] r0 = defpackage.aefk.a((java.nio.ByteOrder) r0, (byte[]) r2)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            goto L_0x01c0
        L_0x01bd:
            short[] r0 = new short[r9]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x01c0:
            aegn r2 = r1.n     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2.b()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            goto L_0x029a
        L_0x01c7:
            byte r12 = r0[r5]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            int r13 = r12 + -1
            if (r13 < 0) goto L_0x01e7
            int r14 = r5 + 2
            int r15 = r14 + r13
            if (r7 < r15) goto L_0x01e7
            aehw r7 = new aehw     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            int r12 = r5 + 1
            byte r12 = r0[r12]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            byte[] r14 = java.util.Arrays.copyOfRange(r0, r14, r15)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7.<init>(r12, r14)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2.add(r7)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            int r13 = r13 + 2
            int r5 = r5 + r13
            goto L_0x019c
        L_0x01e7:
            aehv r2 = new aehv     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r9] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r8] = r5     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r5 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = r5.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5 = 2
            r7[r5] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = "Wrong length=%d at index=%d in LTVs=%s"
            r2.<init>(r0, r7)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x0207:
            aeig r2 = new aeig     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = r8.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r9] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = "Transport Block has wrong length byte: %s"
            r2.<init>(r5, r0, r7)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x021d:
            aeig r2 = new aeig     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = r8.a((byte[]) r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r9] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = "Transport Block null or too short: %s"
            r2.<init>(r5, r0, r7)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x0233:
            r0 = move-exception
            com.google.android.libraries.bluetooth.BluetoothException r5 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.util.UUID r12 = r15.getUuid()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r9] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r12 = defpackage.aekh.b((android.bluetooth.BluetoothGattDescriptor) r15)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7[r8] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejx r2 = r2.d     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejw r2 = r2.a()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r8 = 2
            r7[r8] = r2     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r2 = "Failed to read %s on %s on device %s."
            java.lang.String r2 = java.lang.String.format(r2, r7)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5.<init>(r2, r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r5     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x0258:
            com.google.android.libraries.bluetooth.BluetoothException r7 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5[r9] = r13     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r5[r8] = r12     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r8 = 2
            r5[r8] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejx r0 = r2.d     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            aejw r0 = r0.a()     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r2 = 3
            r5[r2] = r0     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            java.lang.String r0 = "Descriptor %s not found on characteristic %s on service %s of device %s."
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            r7.<init>(r0)     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
            throw r7     // Catch:{ BluetoothException -> 0x027a, aeig -> 0x0278, aehv -> 0x0276 }
        L_0x0276:
            r0 = move-exception
            goto L_0x027b
        L_0x0278:
            r0 = move-exception
            goto L_0x027b
        L_0x027a:
            r0 = move-exception
        L_0x027b:
            anil r2 = defpackage.aehd.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r0)
            r5 = 1286(0x506, float:1.802E-42)
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r11, (int) r5, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "Failed to get supported profiles from transport block."
            r2.a((java.lang.String) r3)
            aegn r2 = r1.n
            r2.a((java.lang.Exception) r0)
            short[] r0 = new short[r9]
        L_0x029a:
            r4.<init>(r10, r0)
            return r4
        L_0x029e:
            aeig r2 = new aeig
            java.lang.Object[] r3 = new java.lang.Object[r8]
            if (r0 == 0) goto L_0x02af
            anml r4 = defpackage.anml.g
            anml r4 = r4.b()
            java.lang.String r0 = r4.a((byte[]) r0)
            goto L_0x02b1
        L_0x02af:
            java.lang.String r0 = "(none)"
        L_0x02b1:
            r3[r9] = r0
            java.lang.String r0 = "Bluetooth MAC not contained in BR handover data: %s"
            r4 = 3
            r2.<init>(r4, r0, r3)
            throw r2
        L_0x02ba:
            aeig r2 = new aeig
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r9] = r4
            anml r4 = defpackage.anml.g
            anml r4 = r4.b()
            java.lang.String r0 = r4.a((byte[]) r0)
            r5[r8] = r0
            java.lang.String r0 = "TDS Control Point result code (%s) was not success in response %s"
            r2.<init>(r3, r0, r5)
            goto L_0x02d4
        L_0x02d3:
            throw r2
        L_0x02d4:
            goto L_0x02d3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.a(aeiy):aegt");
    }

    private final byte[] b(aeiy aeiy) {
        String str;
        byte[] bArr;
        ((anih) ((anih) aehd.a.d()).a("aeha", "b", 1254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Getting Bluetooth MAC");
        this.n.a(aspb.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC);
        byte[] b2 = aeiy.b(aefz.a, aefj.a(this.m.s()));
        int i2 = 0;
        if (b2 != null && b2.length >= 7) {
            aefk aefk = new aefk(Arrays.copyOfRange(b2, 1, 7), ByteOrder.LITTLE_ENDIAN);
            if (!aefk.b.equals(ByteOrder.BIG_ENDIAN)) {
                byte[] bArr2 = aefk.a;
                bArr = new byte[bArr2.length];
                while (true) {
                    int length = bArr2.length;
                    if (i2 >= length) {
                        break;
                    }
                    bArr[i2] = bArr2[(length - i2) - 1];
                    i2++;
                }
            } else {
                bArr = aefk.a;
            }
            this.n.b();
            return bArr;
        }
        Object[] objArr = new Object[1];
        if (b2 != null) {
            str = anml.g.b().a(b2);
        } else {
            str = "(none)";
        }
        objArr[0] = str;
        throw new aeig(3, "Bluetooth MAC not contained in BR handover data: %s", objArr);
    }

    private final void d(byte[] bArr, String str) {
        ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1342, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing new device name to address=%s", (Object) str);
        aeiy a2 = this.q.a();
        a2.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
        a2.a(aeft.a, aefq.a, bArr);
        ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1347, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished writing new device name=%s", (Object) anml.g.a(bArr));
    }

    private final byte[] b(byte[] bArr, String str) {
        aeih aeih;
        aeih aeih2;
        if (this.s == null) {
            ((anih) ((anih) aehd.a.c()).a("aeha", "b", 856, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Pairing secret was null, account key couldn't be encrypted or written.");
            return null;
        }
        if (!this.m.I()) {
            aeih aeih3 = new aeih(this.p, "Close GATT and sleep");
            try {
                this.q.b();
                Thread.sleep((long) this.m.H());
                aeih3.close();
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        try {
            aeih = new aeih(this.p, "Encrypt key");
            byte[] a2 = aeev.a(this.s, bArr);
            aeih.close();
            int i2 = 1;
            while (i2 <= this.m.m()) {
                this.n.a(aspb.WRITE_ACCOUNT_KEY);
                try {
                    aeij aeij = this.p;
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Write key via GATT #");
                    sb.append(i2);
                    aeih2 = new aeih(aeij, sb.toString());
                    ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1330, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing account key to address=%s", (Object) str);
                    aeiy a3 = this.q.a();
                    a3.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
                    a3.a(aeft.a, aefl.a, a2);
                    ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1336, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished writing encrypted account key=%s", (Object) anml.g.a(a2));
                    this.n.b();
                    aeih2.close();
                    return bArr;
                } catch (BluetoothException e2) {
                    anih anih = (anih) aehd.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("aeha", "b", 884, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error writing account key attempt %d of %d", i2, this.m.m());
                    this.n.a((Exception) e2);
                    Thread.sleep((long) this.m.H());
                    i2++;
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            return null;
        } catch (GeneralSecurityException e3) {
            anih anih2 = (anih) aehd.a.c();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("aeha", "b", 873, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to encrypt key.");
            return null;
        } catch (Throwable th3) {
            apev.a(th, th3);
        }
        throw th;
        throw th;
        throw th;
    }

    private static boolean d(BluetoothAdapter bluetoothAdapter) {
        try {
            return ((Boolean) aeic.a(bluetoothAdapter).a("isLeEnabled", new Class[0]).b(new Object[0])).booleanValue();
        } catch (aeid e2) {
            anih anih = (anih) aehd.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "d", 1613, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't call isLeEnabled");
            if (bluetoothAdapter.getState() == 12) {
                return true;
            }
            return false;
        }
    }

    public final String d() {
        if (!TextUtils.isEmpty(i)) {
            String str = i;
            i = null;
            return str;
        }
        if (this.q == null) {
            aehf aehf = new aehf(this.l, this.m, this.n, this.a, new aegr(this), this.o, this.p, b(true));
            this.q = aehf;
            aehf.b();
        }
        aeiy a2 = this.q.a();
        a2.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
        try {
            String str2 = new String(a2.b(aeft.a, aefj.a(this.m.u())));
            ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1385, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Got the firmware info version number = %s", (Object) str2);
            this.q.b();
            return str2;
        } catch (BluetoothException e2) {
            anih anih = (anih) aehd.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "d", 1389, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: can't read firmware characteristic.");
            this.q.b();
            return null;
        }
    }

    private final short[] b(BluetoothDevice bluetoothDevice) {
        ((anih) ((anih) aehd.a.d()).a("aeha", "b", 1484, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Getting supported profiles via SDP (Bluetooth Classic) for %s", (Object) bluetoothDevice.getAddress());
        aegd a2 = aegd.a(this.l, this.m, bluetoothDevice, "android.bluetooth.device.action.UUID");
        try {
            bluetoothDevice.fetchUuidsWithSdp();
            a2.a((long) this.m.i(), TimeUnit.SECONDS);
            a2.close();
            return c(bluetoothDevice);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final Intent b(byte[] bArr) {
        Intent intent = new Intent("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_DEVICE_ADDED");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.service.DiscoveryService");
        intent.putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", this.o);
        String str = this.c;
        if (str != null) {
            intent.putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", str);
        }
        intent.putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr);
        intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", this.m.aa());
        return intent;
    }

    private static short[] c(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1497, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Got supported UUIDs: %s", (Object) Arrays.toString(uuids));
        if (uuids == null) {
            uuids = new ParcelUuid[0];
        }
        ArrayList arrayList = new ArrayList(r1);
        for (ParcelUuid uuid : uuids) {
            UUID uuid2 = uuid.getUuid();
            if (aefj.b(uuid2)) {
                arrayList.add(Short.valueOf(aefj.a(uuid2)));
            }
        }
        return aoom.a((Collection) arrayList);
    }

    public final void c() {
        if (this.m.n()) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1041, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Turning Bluetooth off.");
            this.n.a(aspb.DISABLE_BLUETOOTH);
            this.a.a.disable();
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    aeic.a(this.a.a).a("disableBLE", new Class[0]).a(new Object[0]);
                } catch (aeid e2) {
                    anih anih = (anih) aehd.a.d();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("aeha", "c", 1605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't call disableBLE");
                }
            }
            try {
                a(10);
                this.n.b();
            } catch (TimeoutException e3) {
                this.n.a((Exception) e3);
                anih anih2 = (anih) aehd.a.c();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("aeha", "c", 1054, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bluetooth still on. BluetoothAdapter state=%s", a(this.a.a));
            }
            ((anih) ((anih) aehd.a.d()).a("aeha", "c", 1061, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Turning Bluetooth on.");
            this.n.a(aspb.ENABLE_BLUETOOTH);
            this.a.a.enable();
            a(12);
            this.n.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c(byte[] bArr) {
        if (!this.m.Y()) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "c", 910, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The provider has already paired with the account, skip writing account key.");
            return false;
        } else if (bArr[0] != 4) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "c", 915, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The provider has already paired with the account, but accountKey[0] != 0x04. Forget the device from the account and re-try");
            return false;
        } else {
            ((anih) ((anih) aehd.a.d()).a("aeha", "c", 921, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The provider has already paired with the account, still write the same account key.");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6 A[Catch:{ all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0193 A[SYNTHETIC, Splitter:B:79:0x0193] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.aegz a(android.bluetooth.BluetoothDevice r10) {
        /*
            r9 = this;
            aeia r0 = r9.m
            boolean r0 = r0.G()
            r1 = 0
            if (r0 == 0) goto L_0x01a6
            aeia r0 = r9.m
            int r0 = r0.m()
            if (r0 <= 0) goto L_0x01a6
            boolean r0 = r9.f()
            if (r0 == 0) goto L_0x01a6
            aegw r0 = r9.d
            if (r0 == 0) goto L_0x001e
            byte[] r0 = r0.a
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r2 = 4
            r3 = 0
            java.lang.String r4 = "a"
            java.lang.String r5 = "aeha"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 == 0) goto L_0x0084
            java.lang.String r1 = "c"
            aeia r7 = r9.m
            boolean r7 = r7.Y()
            if (r7 != 0) goto L_0x004a
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 910(0x38e, float:1.275E-42)
            anie r1 = r2.a((java.lang.String) r5, (java.lang.String) r1, (int) r3, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "The provider has already paired with the account, skip writing account key."
            r1.a((java.lang.String) r2)
            goto L_0x00fb
        L_0x004a:
            byte r3 = r0[r3]
            if (r3 == r2) goto L_0x0066
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 915(0x393, float:1.282E-42)
            anie r1 = r2.a((java.lang.String) r5, (java.lang.String) r1, (int) r3, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "The provider has already paired with the account, but accountKey[0] != 0x04. Forget the device from the account and re-try"
            r1.a((java.lang.String) r2)
            goto L_0x00fb
        L_0x0066:
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 921(0x399, float:1.29E-42)
            anie r1 = r2.a((java.lang.String) r5, (java.lang.String) r1, (int) r3, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "The provider has already paired with the account, still write the same account key."
            r1.a((java.lang.String) r2)
            java.lang.String r1 = r10.getAddress()
            r9.b(r0, r1)
            goto L_0x00fb
        L_0x0084:
            aeih r0 = new aeih
            aeij r7 = r9.p
            java.lang.String r8 = "Write account key"
            r0.<init>(r7, r8)
            aeia r7 = r9.m     // Catch:{ all -> 0x019c }
            boolean r7 = r7.Z()     // Catch:{ all -> 0x019c }
            if (r7 != 0) goto L_0x0096
            goto L_0x00a5
        L_0x0096:
            java.lang.String r7 = r9.f     // Catch:{ all -> 0x019c }
            if (r7 == 0) goto L_0x00a5
            android.content.Context r2 = r9.l     // Catch:{ all -> 0x019c }
            byte[] r2 = defpackage.aegb.a(r2)     // Catch:{ all -> 0x019c }
            byte[] r2 = defpackage.aegb.a(r2, r7)     // Catch:{ all -> 0x019c }
            goto L_0x00ac
        L_0x00a5:
            byte[] r7 = defpackage.aeev.a()     // Catch:{ all -> 0x019c }
            r7[r3] = r2     // Catch:{ all -> 0x019c }
            r2 = r7
        L_0x00ac:
            java.lang.String r3 = r10.getAddress()     // Catch:{ all -> 0x019c }
            byte[] r2 = r9.b(r2, r3)     // Catch:{ all -> 0x019c }
            if (r2 == 0) goto L_0x0193
            aeia r1 = r9.m     // Catch:{ all -> 0x019c }
            boolean r1 = r1.aa()     // Catch:{ all -> 0x019c }
            if (r1 != 0) goto L_0x00f7
            aeih r1 = new aeih     // Catch:{ SecurityException -> 0x00de }
            aeij r3 = r9.p     // Catch:{ SecurityException -> 0x00de }
            java.lang.String r7 = "Start CloudSyncing"
            r1.<init>(r3, r7)     // Catch:{ SecurityException -> 0x00de }
            android.content.Context r3 = r9.l     // Catch:{ all -> 0x00d4 }
            android.content.Intent r7 = r9.b((byte[]) r2)     // Catch:{ all -> 0x00d4 }
            r3.startService(r7)     // Catch:{ all -> 0x00d4 }
            r1.close()     // Catch:{ SecurityException -> 0x00de }
            goto L_0x00f7
        L_0x00d4:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r1)     // Catch:{ SecurityException -> 0x00de }
        L_0x00dd:
            throw r3     // Catch:{ SecurityException -> 0x00de }
        L_0x00de:
            r1 = move-exception
            anil r3 = defpackage.aehd.a     // Catch:{ all -> 0x019c }
            anie r3 = r3.c()     // Catch:{ all -> 0x019c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x019c }
            r3.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x019c }
            r1 = 805(0x325, float:1.128E-42)
            anie r1 = r3.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r6)     // Catch:{ all -> 0x019c }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x019c }
            java.lang.String r3 = "Error adding device."
            r1.a((java.lang.String) r3)     // Catch:{ all -> 0x019c }
        L_0x00f7:
            r0.close()
            r0 = r2
        L_0x00fb:
            aeih r1 = new aeih
            aeij r2 = r9.p
            java.lang.String r3 = "Send the account key to Validator"
            r1.<init>(r2, r3)
            android.content.Context r2 = r9.l     // Catch:{ all -> 0x0189 }
            java.lang.String r3 = "aein"
            boolean r5 = defpackage.aein.a(r2)     // Catch:{ all -> 0x0189 }
            if (r5 == 0) goto L_0x013a
            anil r5 = defpackage.aehd.a     // Catch:{ all -> 0x0189 }
            anie r5 = r5.d()     // Catch:{ all -> 0x0189 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0189 }
            r7 = 62
            anie r3 = r5.a((java.lang.String) r3, (java.lang.String) r4, (int) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0189 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "Send account key to validator"
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0189 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "com.google.android.libraries.bluetooth.fastpair.action.SEND_ACCOUNT_KEY"
            r3.<init>(r4)     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "com.google.location.nearby.apps.fastpair.validator"
            android.content.Intent r3 = r3.setPackage(r4)     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.ACCOUNT_KEY"
            android.content.Intent r3 = r3.putExtra(r4, r0)     // Catch:{ all -> 0x0189 }
            r2.sendBroadcast(r3)     // Catch:{ all -> 0x0189 }
            goto L_0x013c
        L_0x013a:
            anil r2 = defpackage.aehd.a     // Catch:{ all -> 0x0189 }
        L_0x013c:
            r1.close()
            aeia r1 = r9.m
            boolean r1 = r1.W()
            if (r1 != 0) goto L_0x0148
            goto L_0x017a
        L_0x0148:
            boolean r1 = r9.v
            if (r1 == 0) goto L_0x017a
            aehf r1 = r9.q
            aeiy r1 = r1.a()
            java.util.UUID r2 = defpackage.aefq.a
            boolean r1 = r9.a((defpackage.aeiy) r1, (java.util.UUID) r2)
            if (r1 == 0) goto L_0x017a
            aeih r1 = new aeih
            aeij r2 = r9.p
            java.lang.String r3 = "WriteNameToProvider"
            r1.<init>(r2, r3)
            java.lang.String r2 = r9.u     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r10.getAddress()     // Catch:{ all -> 0x0170 }
            r9.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0170 }
            r1.close()
            goto L_0x017a
        L_0x0170:
            r10 = move-exception
            r1.close()     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r0)
        L_0x0179:
            throw r10
        L_0x017a:
            aehf r1 = r9.q
            r1.b()
            aeew r1 = new aeew
            java.lang.String r10 = r10.getAddress()
            r1.<init>(r0, r10)
            return r1
        L_0x0189:
            r10 = move-exception
            r1.close()     // Catch:{ all -> 0x018e }
            goto L_0x0192
        L_0x018e:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r0)
        L_0x0192:
            throw r10
        L_0x0193:
            aehf r10 = r9.q     // Catch:{ all -> 0x019c }
            r10.b()     // Catch:{ all -> 0x019c }
            r0.close()
            return r1
        L_0x019c:
            r10 = move-exception
            r0.close()     // Catch:{ all -> 0x01a1 }
            goto L_0x01a5
        L_0x01a1:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r0)
        L_0x01a5:
            throw r10
        L_0x01a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.a(android.bluetooth.BluetoothDevice):aegz");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: int} */
    /* JADX WARNING: type inference failed for: r20v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v130 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017a, code lost:
        if (r4 == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5 = (byte[]) r3.e.a((defpackage.aekj) new defpackage.aeiu(r3, new java.lang.Object[]{defpackage.aeje.h, r3.d, r4}, r4), r3.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019b, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.aehd.a.d()).a("aeha", "c", 1281, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Got transport block: %s", (java.lang.Object) defpackage.anml.g.b().a(r5));
        r3 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bc, code lost:
        if (r3 < 4) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01be, code lost:
        r8 = r5[2] + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c3, code lost:
        if (r3 < r8) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c5, code lost:
        r3 = java.util.Arrays.copyOfRange(r5, 3, r8);
        r4 = new java.util.ArrayList();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        r8 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d0, code lost:
        if (r5 < r8) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01da, code lost:
        if (r3.hasNext() == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dc, code lost:
        r4 = (defpackage.aehw) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e5, code lost:
        if (r4.a == 1) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e8, code lost:
        r3 = defpackage.aefk.a(java.nio.ByteOrder.LITTLE_ENDIAN, r4.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f1, code lost:
        r3 = new short[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f6, code lost:
        r7.n.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fb, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r13 = r3[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0201, code lost:
        r14 = r13 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0203, code lost:
        if (r14 < 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0205, code lost:
        r15 = r5 + 2;
        r20 = r9;
        r9 = r15 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020b, code lost:
        if (r8 < r9) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020d, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4.add(new defpackage.aehw(r3[r5 + 1], java.util.Arrays.copyOfRange(r3, r15, r9)));
        r5 = r5 + (r14 + 2);
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0223, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0246, code lost:
        throw new defpackage.aehv("Wrong length=%d at index=%d in LTVs=%s", java.lang.Byte.valueOf(r13), java.lang.Integer.valueOf(r5), defpackage.anml.g.a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0247, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0261, code lost:
        throw new defpackage.aeig(4, "Transport Block has wrong length byte: %s", defpackage.anml.g.b().a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0262, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027c, code lost:
        throw new defpackage.aeig(4, "Transport Block null or too short: %s", defpackage.anml.g.b().a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0282, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0284, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0286, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0287, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02af, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException(java.lang.String.format("Failed to read %s on %s on device %s.", new java.lang.Object[]{r4.getUuid(), defpackage.aekh.b(r4), r3.d.a()}), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b0, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d2, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException(java.lang.String.format("Descriptor %s not found on characteristic %s on service %s of device %s.", new java.lang.Object[]{r14, r15, r5, r3.d.a()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d3, code lost:
        r0 = e;
        r20 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0410 A[SYNTHETIC, Splitter:B:159:0x0410] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0594 A[Catch:{ PairingException -> 0x06ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0699 A[Catch:{ PairingException -> 0x06a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06d3 A[SYNTHETIC, Splitter:B:307:0x06d3] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027f A[Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f, aehv | aeig | BluetoothException -> 0x02d3 }, ExcHandler: all (th java.lang.Throwable), PHI: r9 
      PHI: (r9v11 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x017c, B:47:?, B:48:0x019b, B:67:0x01ff, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x017c] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0282 A[Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f, aehv | aeig | BluetoothException -> 0x02d3 }, ExcHandler: aehv (e aehv), PHI: r9 
      PHI: (r9v10 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x017c, B:47:?, B:48:0x019b, B:67:0x01ff, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x017c] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0284 A[Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f, aehv | aeig | BluetoothException -> 0x02d3 }, ExcHandler: aeig (e aeig), PHI: r9 
      PHI: (r9v9 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:46:0x017c, B:47:?, B:48:0x019b, B:67:0x01ff, B:68:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x017c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.aegz a(boolean r30) {
        /*
            r29 = this;
            r7 = r29
            java.lang.String r8 = "Attempting to connect constants profiles, %s"
            java.lang.String r9 = "Attempting to connect device profiles, %s"
            java.lang.String r10 = "a"
            java.lang.String r11 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r12 = "aeha"
            r14 = 1
            if (r30 == 0) goto L_0x0394
            aeih r2 = new aeih     // Catch:{ BluetoothException -> 0x036f, aeig -> 0x036d }
            aeij r3 = r7.p     // Catch:{ BluetoothException -> 0x036f, aeig -> 0x036d }
            java.lang.String r4 = "Get BR/EDR handover information via GATT"
            r2.<init>(r3, r4)     // Catch:{ BluetoothException -> 0x036f, aeig -> 0x036d }
            aehf r3 = r7.q     // Catch:{ all -> 0x0357 }
            aeiy r3 = r3.a()     // Catch:{ all -> 0x0357 }
            anil r4 = defpackage.aehd.a     // Catch:{ all -> 0x0357 }
            anie r4 = r4.d()     // Catch:{ all -> 0x0357 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0357 }
            r5 = 1225(0x4c9, float:1.717E-42)
            anie r4 = r4.a((java.lang.String) r12, (java.lang.String) r10, (int) r5, (java.lang.String) r11)     // Catch:{ all -> 0x0357 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0357 }
            java.lang.String r5 = "Connecting GATT server to BLE address=%s"
            java.lang.String r6 = r7.o     // Catch:{ all -> 0x0357 }
            r4.a((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0357 }
            anil r4 = defpackage.aehd.a     // Catch:{ all -> 0x0357 }
            anie r4 = r4.d()     // Catch:{ all -> 0x0357 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0357 }
            r5 = 1226(0x4ca, float:1.718E-42)
            anie r4 = r4.a((java.lang.String) r12, (java.lang.String) r10, (int) r5, (java.lang.String) r11)     // Catch:{ all -> 0x0357 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0357 }
            java.lang.String r5 = "Telling device to become discoverable"
            r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0357 }
            aegn r4 = r7.n     // Catch:{ all -> 0x0357 }
            aspb r5 = defpackage.aspb.BR_EDR_HANDOVER_WRITE_CONTROL_POINT_REQUEST     // Catch:{ all -> 0x0357 }
            r4.a((defpackage.aspb) r5)     // Catch:{ all -> 0x0357 }
            java.util.UUID r4 = defpackage.aefz.a     // Catch:{ all -> 0x0357 }
            java.util.UUID r5 = defpackage.aefy.a     // Catch:{ all -> 0x0357 }
            aeix r4 = r3.c(r4, r5)     // Catch:{ all -> 0x0357 }
            java.util.UUID r5 = defpackage.aefz.a     // Catch:{ all -> 0x0357 }
            java.util.UUID r6 = defpackage.aefy.a     // Catch:{ all -> 0x0357 }
            byte[] r15 = k     // Catch:{ all -> 0x0357 }
            r3.a(r5, r6, r15)     // Catch:{ all -> 0x0357 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0357 }
            aeia r6 = r7.m     // Catch:{ all -> 0x0357 }
            int r6 = r6.a()     // Catch:{ all -> 0x0357 }
            r30 = r2
            long r1 = (long) r6
            long r1 = r5.toMillis(r1)     // Catch:{ all -> 0x0355 }
            byte[] r1 = r4.a(r1)     // Catch:{ all -> 0x0355 }
            aegy r2 = defpackage.aegy.a(r1)     // Catch:{ all -> 0x0355 }
            aegy r4 = defpackage.aegy.SUCCESS     // Catch:{ all -> 0x0355 }
            if (r2 != r4) goto L_0x0333
            aegn r1 = r7.n     // Catch:{ all -> 0x0355 }
            r1.b()     // Catch:{ all -> 0x0355 }
            aegt r1 = new aegt     // Catch:{ all -> 0x0355 }
            anil r2 = defpackage.aehd.a     // Catch:{ all -> 0x0355 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0355 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = "b"
            r6 = 1254(0x4e6, float:1.757E-42)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r4, (int) r6, (java.lang.String) r11)     // Catch:{ all -> 0x0355 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = "Getting Bluetooth MAC"
            r2.a((java.lang.String) r4)     // Catch:{ all -> 0x0355 }
            aegn r2 = r7.n     // Catch:{ all -> 0x0355 }
            aspb r4 = defpackage.aspb.BR_EDR_HANDOVER_READ_BLUETOOTH_MAC     // Catch:{ all -> 0x0355 }
            r2.a((defpackage.aspb) r4)     // Catch:{ all -> 0x0355 }
            java.util.UUID r2 = defpackage.aefz.a     // Catch:{ all -> 0x0355 }
            aeia r4 = r7.m     // Catch:{ all -> 0x0355 }
            short r4 = r4.s()     // Catch:{ all -> 0x0355 }
            java.util.UUID r4 = defpackage.aefj.a((short) r4)     // Catch:{ all -> 0x0355 }
            byte[] r2 = r3.b(r2, r4)     // Catch:{ all -> 0x0355 }
            r4 = 3
            if (r2 == 0) goto L_0x0311
            int r6 = r2.length     // Catch:{ all -> 0x0355 }
            r15 = 7
            if (r6 < r15) goto L_0x0311
            aefk r6 = new aefk     // Catch:{ all -> 0x0355 }
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r14, r15)     // Catch:{ all -> 0x0355 }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0355 }
            r6.<init>(r2, r15)     // Catch:{ all -> 0x0355 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0355 }
            java.nio.ByteOrder r15 = r6.b     // Catch:{ all -> 0x0355 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0355 }
            if (r2 != 0) goto L_0x00ea
            byte[] r2 = r6.a     // Catch:{ all -> 0x00e2 }
            int r6 = r2.length     // Catch:{ all -> 0x00e2 }
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00e2 }
            r15 = 0
        L_0x00d4:
            int r5 = r2.length     // Catch:{ all -> 0x00e2 }
            if (r15 >= r5) goto L_0x00e1
            int r5 = r5 - r15
            int r5 = r5 + -1
            byte r5 = r2[r5]     // Catch:{ all -> 0x00e2 }
            r6[r15] = r5     // Catch:{ all -> 0x00e2 }
            int r15 = r15 + 1
            goto L_0x00d4
        L_0x00e1:
            goto L_0x00ec
        L_0x00e2:
            r0 = move-exception
            r1 = r0
            r21 = r8
        L_0x00e6:
            r20 = r9
            goto L_0x035f
        L_0x00ea:
            byte[] r6 = r6.a     // Catch:{ all -> 0x0355 }
        L_0x00ec:
            aegn r2 = r7.n     // Catch:{ all -> 0x0355 }
            r2.b()     // Catch:{ all -> 0x0355 }
            java.lang.String r2 = "c"
            aegn r5 = r7.n     // Catch:{ all -> 0x0355 }
            aspb r15 = defpackage.aspb.BR_EDR_HANDOVER_READ_TRANSPORT_BLOCK     // Catch:{ all -> 0x0355 }
            r5.a((defpackage.aspb) r15)     // Catch:{ all -> 0x0355 }
            java.util.UUID r5 = defpackage.aefz.a     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            aeia r15 = r7.m     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            short r15 = r15.t()     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            java.util.UUID r15 = defpackage.aefj.a((short) r15)     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            aeia r14 = r7.m     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            short r14 = r14.v()     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            java.util.UUID r14 = defpackage.aefj.a((short) r14)     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            r19 = 0
            r13[r19] = r14     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            r18 = 1
            r13[r18] = r15     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            r17 = 2
            r13[r17] = r5     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            android.bluetooth.BluetoothGattCharacteristic r13 = r3.a(r5, r15)     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            java.util.List r13 = r13.getDescriptors()     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            r4 = 0
        L_0x012b:
            boolean r20 = r13.hasNext()     // Catch:{ BluetoothException -> 0x02dd, aeig -> 0x02db, aehv -> 0x02d9 }
            r21 = r8
            if (r20 == 0) goto L_0x017a
            java.lang.Object r20 = r13.next()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            android.bluetooth.BluetoothGattDescriptor r20 = (android.bluetooth.BluetoothGattDescriptor) r20     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            java.util.UUID r8 = r20.getUuid()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            boolean r8 = r8.equals(r14)     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            if (r8 == 0) goto L_0x0169
            if (r4 != 0) goto L_0x0148
            r4 = r20
            goto L_0x0169
        L_0x0148:
            com.google.android.libraries.bluetooth.BluetoothException r4 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r13 = 0
            r8[r13] = r14     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r13 = 1
            r8[r13] = r15     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r13 = 2
            r8[r13] = r5     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            aejx r3 = r3.d     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            aejw r3 = r3.a()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r5 = 3
            r8[r5] = r3     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            java.lang.String r3 = "More than one descriptor %s found on characteristic %s service %s on device %s."
            java.lang.String r3 = java.lang.String.format(r3, r8)     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r4.<init>(r3)     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            throw r4     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
        L_0x0169:
            r8 = r21
            goto L_0x012b
        L_0x016c:
            r0 = move-exception
            r1 = r0
            goto L_0x00e6
        L_0x0170:
            r0 = move-exception
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            goto L_0x0175
        L_0x0174:
            r0 = move-exception
        L_0x0175:
            r3 = r0
            r20 = r9
            goto L_0x02e3
        L_0x017a:
            if (r4 == 0) goto L_0x02b0
            aekl r5 = r3.e     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            aeiu r8 = new aeiu     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            aeje r13 = defpackage.aeje.READ_DESCRIPTOR     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r15 = 0
            r14[r15] = r13     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            aejx r13 = r3.d     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r15 = 1
            r14[r15] = r13     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r13 = 2
            r14[r13] = r4     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r8.<init>(r3, r14, r4)     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            long r13 = r3.k     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            java.lang.Object r5 = r5.a((defpackage.aekj) r8, (long) r13)     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            byte[] r5 = (byte[]) r5     // Catch:{ BluetoothException -> 0x0286, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            anil r3 = defpackage.aehd.a     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            anie r3 = r3.d()     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            anih r3 = (defpackage.anih) r3     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r4 = 1281(0x501, float:1.795E-42)
            anie r3 = r3.a((java.lang.String) r12, (java.lang.String) r2, (int) r4, (java.lang.String) r11)     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            anih r3 = (defpackage.anih) r3     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            java.lang.String r4 = "Got transport block: %s"
            anml r8 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            anml r8 = r8.b()     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            java.lang.String r8 = r8.a((byte[]) r5)     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r3.a((java.lang.String) r4, (java.lang.Object) r8)     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            int r3 = r5.length     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r4 = 4
            if (r3 < r4) goto L_0x0262
            r4 = 2
            byte r8 = r5[r4]     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r4 = 3
            int r8 = r8 + r4
            if (r3 < r8) goto L_0x0247
            byte[] r3 = java.util.Arrays.copyOfRange(r5, r4, r8)     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r4.<init>()     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            r5 = 0
        L_0x01cf:
            int r8 = r3.length     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            if (r5 < r8) goto L_0x01ff
            java.util.Iterator r3 = r4.iterator()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
        L_0x01d6:
            boolean r4 = r3.hasNext()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            if (r4 == 0) goto L_0x01f1
            java.lang.Object r4 = r3.next()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            aehw r4 = (defpackage.aehw) r4     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            byte r5 = r4.a     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r8 = 1
            if (r5 == r8) goto L_0x01e8
            goto L_0x01d6
        L_0x01e8:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            byte[] r4 = r4.b     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            short[] r3 = defpackage.aefk.a((java.nio.ByteOrder) r3, (byte[]) r4)     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            goto L_0x01f6
        L_0x01f1:
            r3 = 0
            short[] r4 = new short[r3]     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r3 = r4
        L_0x01f6:
            aegn r4 = r7.n     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r4.b()     // Catch:{ BluetoothException -> 0x0174, aeig -> 0x0172, aehv -> 0x0170, all -> 0x016c }
            r20 = r9
            goto L_0x0303
        L_0x01ff:
            byte r13 = r3[r5]     // Catch:{ BluetoothException -> 0x027d, aeig -> 0x0284, aehv -> 0x0282, all -> 0x027f }
            int r14 = r13 + -1
            if (r14 < 0) goto L_0x0223
            int r15 = r5 + 2
            r20 = r9
            int r9 = r15 + r14
            if (r8 < r9) goto L_0x0225
            aehw r8 = new aehw     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            int r13 = r5 + 1
            byte r13 = r3[r13]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            byte[] r9 = java.util.Arrays.copyOfRange(r3, r15, r9)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r8.<init>(r13, r9)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r4.add(r8)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            int r14 = r14 + 2
            int r5 = r5 + r14
            r9 = r20
            goto L_0x01cf
        L_0x0223:
            r20 = r9
        L_0x0225:
            aehv r4 = new aehv     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.Byte r9 = java.lang.Byte.valueOf(r13)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r13 = 0
            r8[r13] = r9     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r9 = 1
            r8[r9] = r5     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            anml r5 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r3 = r5.a((byte[]) r3)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r5 = 2
            r8[r5] = r3     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r3 = "Wrong length=%d at index=%d in LTVs=%s"
            r4.<init>(r3, r8)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            throw r4     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
        L_0x0247:
            r20 = r9
            aeig r3 = new aeig     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            anml r4 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            anml r4 = r4.b()     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r4 = r4.a((byte[]) r5)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r5 = 0
            r8[r5] = r4     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r4 = "Transport Block has wrong length byte: %s"
            r5 = 4
            r3.<init>(r5, r4, r8)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            throw r3     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
        L_0x0262:
            r20 = r9
            aeig r3 = new aeig     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            anml r4 = defpackage.anml.g     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            anml r4 = r4.b()     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r4 = r4.a((byte[]) r5)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r5 = 0
            r8[r5] = r4     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r4 = "Transport Block null or too short: %s"
            r5 = 4
            r3.<init>(r5, r4, r8)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            throw r3     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
        L_0x027d:
            r0 = move-exception
            goto L_0x02e0
        L_0x027f:
            r0 = move-exception
            goto L_0x035c
        L_0x0282:
            r0 = move-exception
            goto L_0x02e0
        L_0x0284:
            r0 = move-exception
            goto L_0x02e0
        L_0x0286:
            r0 = move-exception
            r20 = r9
            r5 = r0
            com.google.android.libraries.bluetooth.BluetoothException r8 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.util.UUID r13 = r4.getUuid()     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r14 = 0
            r9[r14] = r13     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r4 = defpackage.aekh.b((android.bluetooth.BluetoothGattDescriptor) r4)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r13 = 1
            r9[r13] = r4     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            aejx r3 = r3.d     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            aejw r3 = r3.a()     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r4 = 2
            r9[r4] = r3     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r3 = "Failed to read %s on %s on device %s."
            java.lang.String r3 = java.lang.String.format(r3, r9)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r8.<init>(r3, r5)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            throw r8     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
        L_0x02b0:
            r20 = r9
            com.google.android.libraries.bluetooth.BluetoothException r4 = new com.google.android.libraries.bluetooth.BluetoothException     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r9 = 0
            r8[r9] = r14     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r9 = 1
            r8[r9] = r15     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r9 = 2
            r8[r9] = r5     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            aejx r3 = r3.d     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            aejw r3 = r3.a()     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r5 = 3
            r8[r5] = r3     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            java.lang.String r3 = "Descriptor %s not found on characteristic %s on service %s of device %s."
            java.lang.String r3 = java.lang.String.format(r3, r8)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            r4.<init>(r3)     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
            throw r4     // Catch:{ BluetoothException -> 0x02d7, aeig -> 0x02d5, aehv -> 0x02d3 }
        L_0x02d3:
            r0 = move-exception
            goto L_0x02e2
        L_0x02d5:
            r0 = move-exception
            goto L_0x02e2
        L_0x02d7:
            r0 = move-exception
            goto L_0x02e2
        L_0x02d9:
            r0 = move-exception
            goto L_0x02de
        L_0x02db:
            r0 = move-exception
            goto L_0x02de
        L_0x02dd:
            r0 = move-exception
        L_0x02de:
            r21 = r8
        L_0x02e0:
            r20 = r9
        L_0x02e2:
            r3 = r0
        L_0x02e3:
            anil r4 = defpackage.aehd.a     // Catch:{ all -> 0x0353 }
            anie r4 = r4.c()     // Catch:{ all -> 0x0353 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x0353 }
            r4.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0353 }
            r5 = 1286(0x506, float:1.802E-42)
            anie r2 = r4.a((java.lang.String) r12, (java.lang.String) r2, (int) r5, (java.lang.String) r11)     // Catch:{ all -> 0x0353 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0353 }
            java.lang.String r4 = "Failed to get supported profiles from transport block."
            r2.a((java.lang.String) r4)     // Catch:{ all -> 0x0353 }
            aegn r2 = r7.n     // Catch:{ all -> 0x0353 }
            r2.a((java.lang.Exception) r3)     // Catch:{ all -> 0x0353 }
            r2 = 0
            short[] r3 = new short[r2]     // Catch:{ all -> 0x0353 }
        L_0x0303:
            r1.<init>(r6, r3)     // Catch:{ all -> 0x0353 }
            r30.close()     // Catch:{ BluetoothException -> 0x030d, aeig -> 0x030b }
            goto L_0x0399
        L_0x030b:
            r0 = move-exception
            goto L_0x030e
        L_0x030d:
            r0 = move-exception
        L_0x030e:
            r2 = r0
            goto L_0x0376
        L_0x0311:
            r21 = r8
            r20 = r9
            aeig r1 = new aeig     // Catch:{ all -> 0x0353 }
            java.lang.String r3 = "Bluetooth MAC not contained in BR handover data: %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0353 }
            if (r2 == 0) goto L_0x0329
            anml r4 = defpackage.anml.g     // Catch:{ all -> 0x0353 }
            anml r4 = r4.b()     // Catch:{ all -> 0x0353 }
            java.lang.String r2 = r4.a((byte[]) r2)     // Catch:{ all -> 0x0353 }
            goto L_0x032b
        L_0x0329:
            java.lang.String r2 = "(none)"
        L_0x032b:
            r4 = 0
            r5[r4] = r2     // Catch:{ all -> 0x0353 }
            r2 = 3
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x0353 }
            throw r1     // Catch:{ all -> 0x0353 }
        L_0x0333:
            r21 = r8
            r20 = r9
            aeig r3 = new aeig     // Catch:{ all -> 0x0353 }
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0353 }
            r4 = 0
            r5[r4] = r2     // Catch:{ all -> 0x0353 }
            anml r2 = defpackage.anml.g     // Catch:{ all -> 0x0353 }
            anml r2 = r2.b()     // Catch:{ all -> 0x0353 }
            java.lang.String r1 = r2.a((byte[]) r1)     // Catch:{ all -> 0x0353 }
            r2 = 1
            r5[r2] = r1     // Catch:{ all -> 0x0353 }
            java.lang.String r1 = "TDS Control Point result code (%s) was not success in response %s"
            r2 = 2
            r3.<init>(r2, r1, r5)     // Catch:{ all -> 0x0353 }
            throw r3     // Catch:{ all -> 0x0353 }
        L_0x0353:
            r0 = move-exception
            goto L_0x035e
        L_0x0355:
            r0 = move-exception
            goto L_0x035a
        L_0x0357:
            r0 = move-exception
            r30 = r2
        L_0x035a:
            r21 = r8
        L_0x035c:
            r20 = r9
        L_0x035e:
            r1 = r0
        L_0x035f:
            r30.close()     // Catch:{ all -> 0x0363 }
            goto L_0x0368
        L_0x0363:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ BluetoothException -> 0x036b, aeig -> 0x0369 }
        L_0x0368:
            throw r1     // Catch:{ BluetoothException -> 0x036b, aeig -> 0x0369 }
        L_0x0369:
            r0 = move-exception
            goto L_0x0374
        L_0x036b:
            r0 = move-exception
            goto L_0x0374
        L_0x036d:
            r0 = move-exception
            goto L_0x0370
        L_0x036f:
            r0 = move-exception
        L_0x0370:
            r21 = r8
            r20 = r9
        L_0x0374:
            r2 = r0
            r1 = 0
        L_0x0376:
            anil r3 = defpackage.aehd.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r2)
            r4 = 514(0x202, float:7.2E-43)
            anie r3 = r3.a((java.lang.String) r12, (java.lang.String) r10, (int) r4, (java.lang.String) r11)
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = "Couldn't get BR/EDR Handover info via TDS. Trying direct connect."
            r3.a((java.lang.String) r4)
            aegn r3 = r7.n
            r3.a((java.lang.Exception) r2)
            goto L_0x0399
        L_0x0394:
            r21 = r8
            r20 = r9
            r1 = 0
        L_0x0399:
            if (r1 == 0) goto L_0x039d
            r8 = r1
            goto L_0x03c2
        L_0x039d:
            aegt r1 = new aegt
            java.lang.String r2 = r7.c
            if (r2 == 0) goto L_0x03a4
            goto L_0x03a6
        L_0x03a4:
            java.lang.String r2 = r7.o
        L_0x03a6:
            byte[] r2 = defpackage.aeez.a((java.lang.String) r2)
            aejv r3 = r7.a
            java.lang.String r4 = r7.o
            aejw r3 = r3.a((java.lang.String) r4)
            android.bluetooth.BluetoothDevice r3 = r3.a
            aeia r4 = r7.m
            int r4 = r4.j()
            short[] r3 = r7.a((android.bluetooth.BluetoothDevice) r3, (int) r4)
            r1.<init>(r2, r3)
            r8 = r1
        L_0x03c2:
            aejv r1 = r7.a
            byte[] r2 = r8.a
            android.bluetooth.BluetoothAdapter r1 = r1.a
            android.bluetooth.BluetoothDevice r1 = r1.getRemoteDevice(r2)
            aejw r1 = defpackage.aejw.a(r1)
            android.bluetooth.BluetoothDevice r9 = r1.a
            java.lang.String r1 = r9.getAddress()
            tuq r2 = r7.g
            if (r2 == 0) goto L_0x03df
            twf r2 = r2.a
            r2.a((java.lang.String) r1)
        L_0x03df:
            aegn r1 = r7.n
            r1.b = r9
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x03eb
            goto L_0x054c
        L_0x03eb:
            boolean r1 = r7.r
            if (r1 != 0) goto L_0x054c
            aeia r1 = r7.m
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x03ff
            int r1 = r9.getBondState()
            r2 = 10
            if (r1 != r2) goto L_0x054c
        L_0x03ff:
            aeia r1 = r7.m
            boolean r1 = r1.J()
            if (r1 != 0) goto L_0x054c
            r1 = 1
        L_0x0408:
            aeia r2 = r7.m
            int r2 = r2.f()
            if (r1 > r2) goto L_0x054c
            aeih r2 = new aeih     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            aeij r3 = r7.p     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            r5 = 28
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            java.lang.String r5 = "Discover device #"
            r4.append(r5)     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            r4.append(r1)     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            r2.<init>(r3, r4)     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            anil r3 = defpackage.aehd.a     // Catch:{ all -> 0x04c2 }
            anie r3 = r3.d()     // Catch:{ all -> 0x04c2 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x04c2 }
            java.lang.String r4 = "d"
            r5 = 1515(0x5eb, float:2.123E-42)
            anie r3 = r3.a((java.lang.String) r12, (java.lang.String) r4, (int) r5, (java.lang.String) r11)     // Catch:{ all -> 0x04c2 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x04c2 }
            java.lang.String r4 = "Priming cache for %s via classic discovery"
            r3.a((java.lang.String) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x04c2 }
            android.content.Context r3 = r7.l     // Catch:{ all -> 0x04c2 }
            aeia r4 = r7.m     // Catch:{ all -> 0x04c2 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x04c2 }
            java.lang.String r5 = "android.bluetooth.device.action.FOUND"
            r13 = 0
            r6[r13] = r5     // Catch:{ all -> 0x04c2 }
            aegd r3 = defpackage.aegd.a(r3, r4, r9, r6)     // Catch:{ all -> 0x04c2 }
            android.content.Context r4 = r7.l     // Catch:{ all -> 0x04b6 }
            aeia r5 = r7.m     // Catch:{ all -> 0x04b6 }
            r6 = 1
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch:{ all -> 0x04b6 }
            java.lang.String r6 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED"
            r14 = 0
            r13[r14] = r6     // Catch:{ all -> 0x04b6 }
            aeif r4 = defpackage.aeif.a(r4, r5, r13)     // Catch:{ all -> 0x04b6 }
            aegn r5 = r7.n     // Catch:{ all -> 0x04aa }
            aspb r6 = defpackage.aspb.DISCOVER_DEVICE     // Catch:{ all -> 0x04aa }
            r5.a((defpackage.aspb) r6)     // Catch:{ all -> 0x04aa }
            aejv r5 = r7.a     // Catch:{ all -> 0x04aa }
            android.bluetooth.BluetoothAdapter r5 = r5.a     // Catch:{ all -> 0x04aa }
            r5.startDiscovery()     // Catch:{ all -> 0x04aa }
            aeia r5 = r7.m     // Catch:{ all -> 0x04aa }
            int r5 = r5.e()     // Catch:{ all -> 0x04aa }
            long r5 = (long) r5     // Catch:{ all -> 0x04aa }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x04aa }
            r3.a(r5, r13)     // Catch:{ all -> 0x04aa }
            aegn r5 = r7.n     // Catch:{ all -> 0x04aa }
            r5.b()     // Catch:{ all -> 0x04aa }
            aegn r5 = r7.n     // Catch:{ all -> 0x04aa }
            aspb r6 = defpackage.aspb.CANCEL_DISCOVERY     // Catch:{ all -> 0x04aa }
            r5.a((defpackage.aspb) r6)     // Catch:{ all -> 0x04aa }
            aejv r5 = r7.a     // Catch:{ all -> 0x04aa }
            android.bluetooth.BluetoothAdapter r5 = r5.a     // Catch:{ all -> 0x04aa }
            r5.cancelDiscovery()     // Catch:{ all -> 0x04aa }
            aeia r5 = r7.m     // Catch:{ all -> 0x04aa }
            int r5 = r5.e()     // Catch:{ all -> 0x04aa }
            long r5 = (long) r5     // Catch:{ all -> 0x04aa }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x04aa }
            r4.a(r5, r13)     // Catch:{ all -> 0x04aa }
            aegn r5 = r7.n     // Catch:{ all -> 0x04aa }
            r5.b()     // Catch:{ all -> 0x04aa }
            r4.close()     // Catch:{ all -> 0x04b6 }
            r3.close()     // Catch:{ all -> 0x04c2 }
            r2.close()     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
            goto L_0x054c
        L_0x04aa:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x04b0 }
            goto L_0x04b5
        L_0x04b0:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x04b6 }
        L_0x04b5:
            throw r5     // Catch:{ all -> 0x04b6 }
        L_0x04b6:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x04bc }
            goto L_0x04c1
        L_0x04bc:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r3)     // Catch:{ all -> 0x04c2 }
        L_0x04c1:
            throw r4     // Catch:{ all -> 0x04c2 }
        L_0x04c2:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch:{ all -> 0x04c8 }
            goto L_0x04cd
        L_0x04c8:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r2)     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
        L_0x04cd:
            throw r3     // Catch:{ InterruptedException -> 0x04d2, ExecutionException -> 0x04d0, TimeoutException -> 0x04ce }
        L_0x04ce:
            r0 = move-exception
            goto L_0x04d3
        L_0x04d0:
            r0 = move-exception
            goto L_0x04d3
        L_0x04d2:
            r0 = move-exception
        L_0x04d3:
            r2 = r0
            anil r3 = defpackage.aehd.a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r2)
            r4 = 553(0x229, float:7.75E-43)
            anie r3 = r3.a((java.lang.String) r12, (java.lang.String) r10, (int) r4, (java.lang.String) r11)
            anih r3 = (defpackage.anih) r3
            aeia r4 = r7.m
            int r4 = r4.f()
            java.lang.String r5 = "discover() failed, attempt %d of %d."
            r3.a((java.lang.String) r5, (int) r1, (int) r4)
            aeia r3 = r7.m
            int r3 = r3.f()
            if (r1 >= r3) goto L_0x0525
            r29.c()
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 557(0x22d, float:7.8E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r2 = (defpackage.anih) r2
            aeia r3 = r7.m
            int r3 = r3.g()
            java.lang.String r4 = "Sleeping %s sec after discover() failure."
            r2.a((java.lang.String) r4, (int) r3)
            aeia r2 = r7.m
            int r2 = r2.g()
            int r2 = r2 * 1000
            long r2 = (long) r2
            android.os.SystemClock.sleep(r2)
            goto L_0x0547
        L_0x0525:
            aeia r3 = r7.m
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x054b
            aegn r3 = r7.n
            r3.a((java.lang.Exception) r2)
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 563(0x233, float:7.89E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "Device discovery failed. Let's try to pair anyway."
            r2.a((java.lang.String) r3)
        L_0x0547:
            int r1 = r1 + 1
            goto L_0x0408
        L_0x054b:
            throw r2
        L_0x054c:
            anil r1 = defpackage.aehd.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            r2 = 572(0x23c, float:8.02E-43)
            anie r1 = r1.a((java.lang.String) r12, (java.lang.String) r10, (int) r2, (java.lang.String) r11)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Pairing with %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r8)
            byte[] r1 = r7.s
            if (r1 == 0) goto L_0x0571
            aefg r2 = new aefg
            aehf r3 = r7.q
            boolean r4 = r7.r
            r2.<init>(r1, r3, r4)
            r27 = r2
            goto L_0x0573
        L_0x0571:
            r27 = 0
        L_0x0573:
            aefi r13 = new aefi
            android.content.Context r1 = r7.l
            aeia r2 = r7.m
            aegn r3 = r7.n
            aeij r4 = r7.p
            r22 = r13
            r23 = r1
            r24 = r9
            r25 = r2
            r26 = r3
            r28 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            aeia r1 = r7.m     // Catch:{ PairingException -> 0x06ab }
            boolean r1 = r1.P()     // Catch:{ PairingException -> 0x06ab }
            if (r1 != 0) goto L_0x0699
            aeia r1 = r7.m     // Catch:{ PairingException -> 0x06ab }
            boolean r1 = r1.N()     // Catch:{ PairingException -> 0x06ab }
            if (r1 == 0) goto L_0x067d
            int r1 = r9.getBondState()     // Catch:{ PairingException -> 0x0675 }
            r2 = 12
            if (r1 != r2) goto L_0x0670
            short[] r1 = c((android.bluetooth.BluetoothDevice) r9)     // Catch:{ PairingException -> 0x0675 }
            int r2 = r1.length     // Catch:{ PairingException -> 0x0675 }
            if (r2 != 0) goto L_0x05c6
            aeia r2 = r7.m     // Catch:{ PairingException -> 0x05be }
            int r2 = r2.ab()     // Catch:{ PairingException -> 0x05be }
            if (r2 <= 0) goto L_0x05c6
            aeia r1 = r7.m     // Catch:{ PairingException -> 0x05be }
            int r1 = r1.ab()     // Catch:{ PairingException -> 0x05be }
            short[] r1 = r7.a((android.bluetooth.BluetoothDevice) r9, (int) r1)     // Catch:{ PairingException -> 0x05be }
            goto L_0x05c6
        L_0x05be:
            r0 = move-exception
            r1 = r0
            r14 = r20
        L_0x05c2:
            r15 = r21
            goto L_0x067b
        L_0x05c6:
            int r2 = r1.length     // Catch:{ PairingException -> 0x0675 }
            if (r2 == 0) goto L_0x05ed
            anil r2 = defpackage.aehd.a     // Catch:{ PairingException -> 0x05e8 }
            anie r2 = r2.d()     // Catch:{ PairingException -> 0x05e8 }
            anih r2 = (defpackage.anih) r2     // Catch:{ PairingException -> 0x05e8 }
            r3 = 695(0x2b7, float:9.74E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)     // Catch:{ PairingException -> 0x05e8 }
            anih r2 = (defpackage.anih) r2     // Catch:{ PairingException -> 0x05e8 }
            java.lang.String r3 = java.util.Arrays.toString(r1)     // Catch:{ PairingException -> 0x05e8 }
            r14 = r20
            r2.a((java.lang.String) r14, (java.lang.Object) r3)     // Catch:{ PairingException -> 0x05e6 }
            r4 = r1
            r15 = r21
            goto L_0x060d
        L_0x05e6:
            r0 = move-exception
            goto L_0x05eb
        L_0x05e8:
            r0 = move-exception
            r14 = r20
        L_0x05eb:
            r1 = r0
            goto L_0x05c2
        L_0x05ed:
            r14 = r20
            short[] r1 = defpackage.aega.a()     // Catch:{ PairingException -> 0x066e }
            anil r2 = defpackage.aehd.a     // Catch:{ PairingException -> 0x066e }
            anie r2 = r2.c()     // Catch:{ PairingException -> 0x066e }
            anih r2 = (defpackage.anih) r2     // Catch:{ PairingException -> 0x066e }
            r3 = 692(0x2b4, float:9.7E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)     // Catch:{ PairingException -> 0x066e }
            anih r2 = (defpackage.anih) r2     // Catch:{ PairingException -> 0x066e }
            java.lang.String r3 = java.util.Arrays.toString(r1)     // Catch:{ PairingException -> 0x066e }
            r15 = r21
            r2.a((java.lang.String) r15, (java.lang.Object) r3)     // Catch:{ PairingException -> 0x066c }
            r4 = r1
        L_0x060d:
            aegn r1 = r7.n     // Catch:{ PairingException -> 0x066c }
            aspb r2 = defpackage.aspb.DIRECTLY_CONNECTED_TO_PROFILE     // Catch:{ PairingException -> 0x066c }
            r1.a((defpackage.aspb) r2)     // Catch:{ PairingException -> 0x066c }
            aeih r6 = new aeih     // Catch:{ PairingException -> 0x0664 }
            aeij r1 = r7.p     // Catch:{ PairingException -> 0x0664 }
            java.lang.String r2 = "Connect to profile directly"
            r6.<init>(r1, r2)     // Catch:{ PairingException -> 0x0664 }
            r5 = 1
            aeia r1 = r7.m     // Catch:{ all -> 0x0656 }
            boolean r16 = r1.ad()     // Catch:{ all -> 0x0656 }
            r1 = r29
            r2 = r13
            r3 = r9
            r17 = r6
            r6 = r16
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0654 }
            anil r1 = defpackage.aehd.a     // Catch:{ all -> 0x0654 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0654 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0654 }
            r2 = 707(0x2c3, float:9.91E-43)
            anie r1 = r1.a((java.lang.String) r12, (java.lang.String) r10, (int) r2, (java.lang.String) r11)     // Catch:{ all -> 0x0654 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0654 }
            java.lang.String r2 = "Directly connected to %s."
            r1.a((java.lang.String) r2, (java.lang.Object) r9)     // Catch:{ all -> 0x0654 }
            aegn r1 = r7.n     // Catch:{ all -> 0x0654 }
            r1.b()     // Catch:{ all -> 0x0654 }
            r17.close()     // Catch:{ PairingException -> 0x0664 }
            r29.j()     // Catch:{ PairingException -> 0x066c }
            aegz r1 = r7.a((android.bluetooth.BluetoothDevice) r9)     // Catch:{ PairingException -> 0x066c }
            return r1
        L_0x0654:
            r0 = move-exception
            goto L_0x0659
        L_0x0656:
            r0 = move-exception
            r17 = r6
        L_0x0659:
            r1 = r0
            r17.close()     // Catch:{ all -> 0x065e }
            goto L_0x0663
        L_0x065e:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ PairingException -> 0x0664 }
        L_0x0663:
            throw r1     // Catch:{ PairingException -> 0x0664 }
        L_0x0664:
            r0 = move-exception
            r1 = r0
            aegn r2 = r7.n     // Catch:{ PairingException -> 0x066c }
            r2.a((java.lang.Exception) r1)     // Catch:{ PairingException -> 0x066c }
            throw r1     // Catch:{ PairingException -> 0x066c }
        L_0x066c:
            r0 = move-exception
            goto L_0x067a
        L_0x066e:
            r0 = move-exception
            goto L_0x0678
        L_0x0670:
            r14 = r20
            r15 = r21
            goto L_0x0681
        L_0x0675:
            r0 = move-exception
            r14 = r20
        L_0x0678:
            r15 = r21
        L_0x067a:
            r1 = r0
        L_0x067b:
            r2 = 1
            goto L_0x06b2
        L_0x067d:
            r14 = r20
            r15 = r21
        L_0x0681:
            com.google.android.libraries.bluetooth.fastpair.PairingException r1 = new com.google.android.libraries.bluetooth.fastpair.PairingException     // Catch:{ PairingException -> 0x0697 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ PairingException -> 0x06a9 }
            int r4 = r9.getBondState()     // Catch:{ PairingException -> 0x06a9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ PairingException -> 0x06a9 }
            r5 = 0
            r3[r5] = r4     // Catch:{ PairingException -> 0x06a9 }
            java.lang.String r4 = "Not previously bonded skipping direct connection, %s"
            r1.<init>(r4, r3)     // Catch:{ PairingException -> 0x06a9 }
            throw r1     // Catch:{ PairingException -> 0x06a9 }
        L_0x0697:
            r0 = move-exception
            goto L_0x06b0
        L_0x0699:
            r14 = r20
            r15 = r21
            r2 = 1
            com.google.android.libraries.bluetooth.fastpair.PairingException r1 = new com.google.android.libraries.bluetooth.fastpair.PairingException     // Catch:{ PairingException -> 0x06a9 }
            java.lang.String r3 = "Skipping connecting to profiles, no direct connection possible."
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ PairingException -> 0x06a9 }
            r1.<init>(r3, r5)     // Catch:{ PairingException -> 0x06a9 }
            throw r1     // Catch:{ PairingException -> 0x06a9 }
        L_0x06a9:
            r0 = move-exception
            goto L_0x06b1
        L_0x06ab:
            r0 = move-exception
            r14 = r20
            r15 = r21
        L_0x06b0:
            r2 = 1
        L_0x06b1:
            r1 = r0
        L_0x06b2:
            anil r3 = defpackage.aehd.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            r4 = 591(0x24f, float:8.28E-43)
            anie r3 = r3.a((java.lang.String) r12, (java.lang.String) r10, (int) r4, (java.lang.String) r11)
            anih r3 = (defpackage.anih) r3
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = "Failed to directly connect to supported profiles: %s"
            r3.a((java.lang.String) r4, (java.lang.Object) r1)
        L_0x06cb:
            aeia r1 = r7.m
            int r1 = r1.k()
            if (r2 > r1) goto L_0x075e
            aeih r1 = new aeih     // Catch:{ Exception -> 0x0700 }
            aeij r3 = r7.p     // Catch:{ Exception -> 0x0700 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0700 }
            r5 = 24
            r4.<init>(r5)     // Catch:{ Exception -> 0x0700 }
            java.lang.String r5 = "Pair device #"
            r4.append(r5)     // Catch:{ Exception -> 0x0700 }
            r4.append(r2)     // Catch:{ Exception -> 0x0700 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0700 }
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0700 }
            r13.c()     // Catch:{ all -> 0x06f4 }
            r1.close()     // Catch:{ Exception -> 0x0700 }
            goto L_0x075e
        L_0x06f4:
            r0 = move-exception
            r3 = r0
            r1.close()     // Catch:{ all -> 0x06fa }
            goto L_0x06ff
        L_0x06fa:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0700 }
        L_0x06ff:
            throw r3     // Catch:{ Exception -> 0x0700 }
        L_0x0700:
            r0 = move-exception
            r1 = r0
            aegn r3 = r7.n
            r3.a((java.lang.Exception) r1)
            anil r3 = defpackage.aehd.a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r1)
            r1 = 600(0x258, float:8.41E-43)
            anie r1 = r3.a((java.lang.String) r12, (java.lang.String) r10, (int) r1, (java.lang.String) r11)
            anih r1 = (defpackage.anih) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            aeia r4 = r7.m
            int r4 = r4.k()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r9.getBondState()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "removeBond() or createBond() failed, attempt %d of %d. Bond state %s"
            r1.a((java.lang.String) r6, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            aeia r1 = r7.m
            int r1 = r1.k()
            if (r2 >= r1) goto L_0x075a
            r29.c()
            anil r1 = defpackage.aehd.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            r3 = 608(0x260, float:8.52E-43)
            anie r1 = r1.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r1 = (defpackage.anih) r1
            java.lang.String r3 = "Sleeping 1 sec after createBond() failure."
            r1.a((java.lang.String) r3)
            r3 = 1000(0x3e8, double:4.94E-321)
            android.os.SystemClock.sleep(r3)
        L_0x075a:
            int r2 = r2 + 1
            goto L_0x06cb
        L_0x075e:
            boolean r1 = r13.a()
            if (r1 == 0) goto L_0x0765
            goto L_0x0786
        L_0x0765:
            byte[] r1 = r7.s
            if (r1 != 0) goto L_0x0862
            aeia r1 = r7.m
            boolean r1 = r1.P()
            if (r1 != 0) goto L_0x0857
            anil r1 = defpackage.aehd.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 625(0x271, float:8.76E-43)
            anie r1 = r1.a((java.lang.String) r12, (java.lang.String) r10, (int) r2, (java.lang.String) r11)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "createBond() failed, will try connecting profiles anyway."
            r1.a((java.lang.String) r2)
        L_0x0786:
            aeia r1 = r7.m
            boolean r1 = r1.P()
            if (r1 != 0) goto L_0x0818
            aeia r1 = r7.m
            boolean r1 = r1.w()
            if (r1 == 0) goto L_0x07d0
            short[] r1 = r8.b
            int r1 = r1.length
            if (r1 != 0) goto L_0x07d0
            short[] r1 = c((android.bluetooth.BluetoothDevice) r9)
            int r2 = r1.length
            if (r2 != 0) goto L_0x07c8
            aeia r2 = r7.m
            int r2 = r2.ab()
            if (r2 <= 0) goto L_0x07c8
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 634(0x27a, float:8.88E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "Found no supported profiles in UUID cache, manually trigger SDP."
            r2.a((java.lang.String) r3)
            aeia r2 = r7.m
            int r2 = r2.ab()
            r7.a((android.bluetooth.BluetoothDevice) r9, (int) r2)
        L_0x07c8:
            aegt r2 = new aegt
            byte[] r3 = r8.a
            r2.<init>(r3, r1)
            r8 = r2
        L_0x07d0:
            short[] r1 = r8.b
            int r2 = r1.length
            if (r2 != 0) goto L_0x07f2
            short[] r1 = defpackage.aega.a()
            anil r2 = defpackage.aehd.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r3 = 645(0x285, float:9.04E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = java.util.Arrays.toString(r1)
            r2.a((java.lang.String) r15, (java.lang.Object) r3)
            r4 = r1
            goto L_0x080a
        L_0x07f2:
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r3 = 648(0x288, float:9.08E-43)
            anie r2 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r3, (java.lang.String) r11)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = java.util.Arrays.toString(r1)
            r2.a((java.lang.String) r14, (java.lang.Object) r3)
            r4 = r1
        L_0x080a:
            aeia r1 = r7.m
            int r5 = r1.l()
            r6 = 0
            r1 = r29
            r2 = r13
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)
        L_0x0818:
            r29.j()
            aeia r1 = r7.m
            boolean r1 = r1.X()
            if (r1 == 0) goto L_0x0852
            aehf r1 = r7.q
            aeiy r1 = r1.a()
            java.util.UUID r2 = defpackage.aefm.a
            boolean r1 = r7.a((defpackage.aeiy) r1, (java.util.UUID) r2)
            if (r1 == 0) goto L_0x0852
            java.lang.String r1 = r29.d()     // Catch:{ BluetoothException -> 0x0838 }
            i = r1     // Catch:{ BluetoothException -> 0x0838 }
            goto L_0x0852
        L_0x0838:
            r0 = move-exception
            r1 = r0
            anil r2 = defpackage.aehd.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r1)
            r1 = 665(0x299, float:9.32E-43)
            anie r1 = r2.a((java.lang.String) r12, (java.lang.String) r10, (int) r1, (java.lang.String) r11)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Fast Pair: head phone does not support firmware read"
            r1.a((java.lang.String) r2)
        L_0x0852:
            aegz r1 = r7.a((android.bluetooth.BluetoothDevice) r9)
            return r1
        L_0x0857:
            com.google.android.libraries.bluetooth.fastpair.PairingException r1 = new com.google.android.libraries.bluetooth.fastpair.PairingException
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "createBond() failed and skipping connecting to a profile."
            r1.<init>(r3, r2)
            throw r1
        L_0x0862:
            r2 = 0
            com.google.android.libraries.bluetooth.fastpair.PairingException r1 = new com.google.android.libraries.bluetooth.fastpair.PairingException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "createBond() failed, exiting connection process."
            r1.<init>(r3, r2)
            goto L_0x086e
        L_0x086d:
            throw r1
        L_0x086e:
            goto L_0x086d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.a(boolean):aegz");
    }

    private final void a(int i2) {
        String str;
        if (!this.m.o()) {
            if (Build.VERSION.SDK_INT < 23) {
                str = "android.bluetooth.adapter.action.STATE_CHANGED";
            } else {
                str = "android.bluetooth.adapter.action.BLE_STATE_CHANGED";
            }
            aegs aegs = new aegs(this, this.l, this.m, new String[]{str}, i2);
            try {
                aegs.a((long) this.m.c(), TimeUnit.SECONDS);
                aegs.close();
                if (Build.VERSION.SDK_INT < 24 && i2 == 12) {
                    SystemClock.sleep((long) (this.m.d() * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long c2 = ((long) this.m.c()) * 1000;
            while (SystemClock.elapsedRealtime() - elapsedRealtime < c2 && i2 != a(this.a.a)) {
                SystemClock.sleep((long) this.m.p());
            }
            if (i2 != a(this.a.a)) {
                throw new TimeoutException(String.format(Locale.getDefault(), "Timed out waiting for state %d, current state is %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(a(this.a.a))}));
            } else if (Build.VERSION.SDK_INT < 24 && i2 == 12) {
                SystemClock.sleep((long) (this.m.d() * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                return;
            } else {
                return;
            }
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0179 A[SYNTHETIC, Splitter:B:102:0x0179] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0182 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aefi r26, android.bluetooth.BluetoothDevice r27, short[] r28, int r29, boolean r30) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r28
            java.lang.String r4 = "aefi"
            int r5 = r3.length
            r7 = 0
        L_0x000a:
            if (r7 >= r5) goto L_0x01f6
            short r9 = r3[r7]
            java.lang.String r10 = "aeha"
            aeia r0 = r1.m
            boolean r0 = r0.a(r9)
            java.lang.String r11 = "a"
            java.lang.String r12 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 != 0) goto L_0x0037
            anil r0 = defpackage.aehd.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r8 = 725(0x2d5, float:1.016E-42)
            anie r0 = r0.a((java.lang.String) r10, (java.lang.String) r11, (int) r8, (java.lang.String) r12)
            anih r0 = (defpackage.anih) r0
            java.lang.String r8 = "Ignoring unsupported profile=%s"
            r0.a((java.lang.String) r8, (short) r9)
            r18 = r5
            r17 = r7
            goto L_0x01ee
        L_0x0037:
            r13 = 1
        L_0x0038:
            r14 = r29
            if (r13 > r14) goto L_0x01ea
            aegn r0 = r1.n
            aspb r15 = defpackage.aspb.CONNECT_PROFILE
            r0.a((defpackage.aspb) r15)
            aegn r0 = r1.n
            java.lang.Short r15 = java.lang.Short.valueOf(r9)
            r0.a = r15
            aeia r0 = r2.b     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            boolean r0 = r0.a(r9)     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            if (r0 == 0) goto L_0x0183
            anaf r0 = defpackage.aega.a     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            aefu r0 = (defpackage.aefu) r0     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            anil r15 = defpackage.aehd.a     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            anie r15 = r15.d()     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            anih r15 = (defpackage.anih) r15     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            r6 = 255(0xff, float:3.57E-43)
            anie r6 = r15.a((java.lang.String) r4, (java.lang.String) r11, (int) r6, (java.lang.String) r12)     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            anih r6 = (defpackage.anih) r6     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            java.lang.String r15 = "Connecting to profile=%s on device=%s"
            android.bluetooth.BluetoothDevice r8 = r2.d     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            r6.a((java.lang.String) r15, (java.lang.Object) r0, (java.lang.Object) r8)     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            if (r30 == 0) goto L_0x007a
            aefe r6 = new aefe     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            r6.<init>(r2)     // Catch:{ InterruptedException -> 0x01a8, aeid -> 0x01a6, TimeoutException -> 0x01a4, ExecutionException -> 0x01a2, ConnectException -> 0x01a0 }
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            aeih r8 = new aeih     // Catch:{ all -> 0x0171 }
            aeij r15 = r2.f     // Catch:{ all -> 0x0171 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r17 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0171 }
            int r17 = r17.length()     // Catch:{ all -> 0x0171 }
            r18 = r5
            int r5 = r17 + 9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x016f }
            r14.<init>(r5)     // Catch:{ all -> 0x016f }
            java.lang.String r5 = "Connect: "
            r14.append(r5)     // Catch:{ all -> 0x016f }
            r14.append(r3)     // Catch:{ all -> 0x016f }
            java.lang.String r3 = r14.toString()     // Catch:{ all -> 0x016f }
            r8.<init>(r15, r3)     // Catch:{ all -> 0x016f }
            aefb r3 = new aefb     // Catch:{ all -> 0x015f }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x015f }
            aeff r5 = new aeff     // Catch:{ all -> 0x014f }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x014f }
            android.bluetooth.BluetoothProfile r0 = r3.a     // Catch:{ all -> 0x013f }
            aeic r14 = defpackage.aeic.a(r0)     // Catch:{ all -> 0x013f }
            r17 = r7
            r15 = 1
            java.lang.Class[] r7 = new java.lang.Class[r15]     // Catch:{ all -> 0x013d }
            java.lang.Class<android.bluetooth.BluetoothDevice> r15 = android.bluetooth.BluetoothDevice.class
            r16 = 0
            r7[r16] = r15     // Catch:{ all -> 0x013d }
            java.lang.String r15 = "connect"
            aeib r7 = r14.a(r15, r7)     // Catch:{ all -> 0x013d }
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x013d }
            android.bluetooth.BluetoothDevice r14 = r2.d     // Catch:{ all -> 0x013d }
            r16 = 0
            r15[r16] = r14     // Catch:{ all -> 0x013d }
            java.lang.Object r7 = r7.b(r15)     // Catch:{ all -> 0x013d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x013d }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x013d }
            if (r7 != 0) goto L_0x00f4
            anil r7 = defpackage.aehd.a     // Catch:{ all -> 0x013d }
            anie r7 = r7.c()     // Catch:{ all -> 0x013d }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x013d }
            r14 = 274(0x112, float:3.84E-43)
            anie r7 = r7.a((java.lang.String) r4, (java.lang.String) r11, (int) r14, (java.lang.String) r12)     // Catch:{ all -> 0x013d }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "connect returned false, expected if connecting, state=%d"
            android.bluetooth.BluetoothDevice r15 = r2.d     // Catch:{ all -> 0x013d }
            int r15 = r0.getConnectionState(r15)     // Catch:{ all -> 0x013d }
            r7.a((java.lang.String) r14, (int) r15)     // Catch:{ all -> 0x013d }
        L_0x00f4:
            android.bluetooth.BluetoothDevice r7 = r2.d     // Catch:{ all -> 0x013d }
            int r0 = r0.getConnectionState(r7)     // Catch:{ all -> 0x013d }
            r7 = 2
            if (r0 == r7) goto L_0x0125
            aeih r7 = new aeih     // Catch:{ all -> 0x013d }
            aeij r0 = r2.f     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "Wait connection"
            r7.<init>(r0, r14)     // Catch:{ all -> 0x013d }
            aeia r0 = r2.b     // Catch:{ all -> 0x0119 }
            int r0 = r0.A()     // Catch:{ all -> 0x0119 }
            long r14 = (long) r0     // Catch:{ all -> 0x0119 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0119 }
            r5.a(r14, r0)     // Catch:{ all -> 0x0119 }
            r7.close()     // Catch:{ all -> 0x013d }
            r5.close()     // Catch:{ all -> 0x014d }
            goto L_0x012a
        L_0x0119:
            r0 = move-exception
            r14 = r0
            r7.close()     // Catch:{ all -> 0x011f }
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            r7 = r0
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r7)     // Catch:{ all -> 0x013d }
        L_0x0124:
            throw r14     // Catch:{ all -> 0x013d }
        L_0x0125:
            android.bluetooth.BluetoothDevice r0 = r2.d     // Catch:{ all -> 0x013d }
            r5.close()     // Catch:{ all -> 0x014d }
        L_0x012a:
            r3.close()     // Catch:{ all -> 0x015d }
            r8.close()     // Catch:{ all -> 0x016d }
            if (r6 != 0) goto L_0x0133
        L_0x0132:
            goto L_0x0137
        L_0x0133:
            r6.close()     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            goto L_0x0132
        L_0x0137:
            aegn r0 = r1.n     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            r0.b()     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            return
        L_0x013d:
            r0 = move-exception
            goto L_0x0142
        L_0x013f:
            r0 = move-exception
            r17 = r7
        L_0x0142:
            r7 = r0
            r5.close()     // Catch:{ all -> 0x0147 }
            goto L_0x014c
        L_0x0147:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r5)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r7     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            goto L_0x0152
        L_0x014f:
            r0 = move-exception
            r17 = r7
        L_0x0152:
            r5 = r0
            r3.close()     // Catch:{ all -> 0x0157 }
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x015d }
        L_0x015c:
            throw r5     // Catch:{ all -> 0x015d }
        L_0x015d:
            r0 = move-exception
            goto L_0x0162
        L_0x015f:
            r0 = move-exception
            r17 = r7
        L_0x0162:
            r3 = r0
            r8.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016c
        L_0x0167:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ all -> 0x016d }
        L_0x016c:
            throw r3     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            goto L_0x0176
        L_0x016f:
            r0 = move-exception
            goto L_0x0174
        L_0x0171:
            r0 = move-exception
            r18 = r5
        L_0x0174:
            r17 = r7
        L_0x0176:
            r3 = r0
            if (r6 == 0) goto L_0x0182
            r6.close()     // Catch:{ all -> 0x017d }
            goto L_0x0182
        L_0x017d:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
        L_0x0182:
            throw r3     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
        L_0x0183:
            r18 = r5
            r17 = r7
            com.google.android.libraries.bluetooth.fastpair.ConnectException r0 = new com.google.android.libraries.bluetooth.fastpair.ConnectException     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            r3 = 0
            r5[r3] = r15     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            java.lang.String r3 = "Unsupported profile=%s"
            r6 = 2
            r0.<init>(r6, r3, r5)     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
            throw r0     // Catch:{ InterruptedException -> 0x019e, aeid -> 0x019c, TimeoutException -> 0x019a, ExecutionException -> 0x0198, ConnectException -> 0x0196 }
        L_0x0196:
            r0 = move-exception
            goto L_0x01ad
        L_0x0198:
            r0 = move-exception
            goto L_0x01ad
        L_0x019a:
            r0 = move-exception
            goto L_0x01ad
        L_0x019c:
            r0 = move-exception
            goto L_0x01ad
        L_0x019e:
            r0 = move-exception
            goto L_0x01ad
        L_0x01a0:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a2:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a4:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a8:
            r0 = move-exception
        L_0x01a9:
            r18 = r5
            r17 = r7
        L_0x01ad:
            anil r3 = defpackage.aehd.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r5 = 743(0x2e7, float:1.041E-42)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r11, (int) r5, (java.lang.String) r12)
            r19 = r3
            anih r19 = (defpackage.anih) r19
            java.lang.Short r21 = java.lang.Short.valueOf(r9)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)
            aeia r3 = r1.m
            int r3 = r3.l()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r3)
            java.lang.String r20 = "Error connecting to profile=%s for device=%s (attempt %d of %d)."
            r22 = r27
            r19.a(r20, r21, r22, r23, r24)
            aegn r3 = r1.n
            r3.a((java.lang.Exception) r0)
            int r13 = r13 + 1
            r3 = r28
            r7 = r17
            r5 = r18
            goto L_0x0038
        L_0x01ea:
            r18 = r5
            r17 = r7
        L_0x01ee:
            int r7 = r17 + 1
            r3 = r28
            r5 = r18
            goto L_0x000a
        L_0x01f6:
            com.google.android.libraries.bluetooth.fastpair.PairingException r0 = new com.google.android.libraries.bluetooth.fastpair.PairingException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = java.util.Arrays.toString(r28)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Unable to connect to any profiles in: %s"
            r0.<init>(r3, r2)
            goto L_0x0209
        L_0x0208:
            throw r0
        L_0x0209:
            goto L_0x0208
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.a(aefi, android.bluetooth.BluetoothDevice, short[], int, boolean):void");
    }

    private final void a(aehn aehn, byte[] bArr, aehj aehj) {
        aehm aehm;
        byte[] bArr2;
        aehn aehn2 = aehn;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        if (length == 64) {
            KeyPair a2 = aegi.a();
            aegi aegi = new aegi((ECPublicKey) a2.getPublic(), (ECPrivateKey) a2.getPrivate());
            ECPublicKey eCPublicKey = aegi.a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = aooa.a(aegi.a(w.getAffineX().toByteArray()), aegi.a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                ((anih) ((anih) aehd.a.d()).a("aehn", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, generates key by ECDH.", (Object) aehn2.b);
                KeyAgreement keyAgreement = (KeyAgreement) aegi.a(aegf.a);
                keyAgreement.init(aegi.b);
                keyAgreement.doPhase(((KeyFactory) aegi.a(aegg.a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr3, 32)), new BigInteger(1, Arrays.copyOfRange(bArr3, 32, 64))), ((ECPublicKey) aegi.a().getPublic()).getParams())), true);
                aehm = new aehm(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            } else {
                throw new GeneralSecurityException("Failed to do ECDH.");
            }
        } else if (length == 16) {
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, using the given secret.", (Object) aehn2.b);
            aehm = new aehm(bArr3, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
        ((anih) ((anih) aehd.a.d()).a("aehn", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, flags %s.", (Object) aehn2.b, aehj.b);
        byte[] a3 = aooa.a(aeev.a(aehm.a, aehj.a()), aehm.b);
        aeiy a4 = aehn2.a.a();
        a4.a(TimeUnit.SECONDS.toMillis((long) aehn2.c));
        aeix c2 = a4.c(aeft.a, aefp.a);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing handshake packet to address=%s", (Object) aehn2.b);
        a4.a(aeft.a, aefp.a, a3);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Waiting handshake packet from address=%s", (Object) aehn2.b);
        byte[] a5 = c2.a(TimeUnit.SECONDS.toMillis((long) aehn2.c));
        byte[] bArr4 = aehm.a;
        if (a5.length != 16) {
            String valueOf = String.valueOf(anml.g.a(a5));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b2 = aeev.b(bArr4, a5);
        byte b3 = b2[0];
        if (b3 == 1) {
            String a6 = aeez.a(Arrays.copyOfRange(b2, 1, 7));
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake success with public %s, ble %s", (Object) a6, (Object) aehn2.b);
            aeew aeew = new aeew(aehm.a, a6);
            this.c = aeew.b;
            this.s = aeew.a;
            return;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Handshake response type incorrect: ");
        sb2.append(b3);
        throw new PairingException(sb2.toString(), new Object[0]);
    }

    private final void a(BluetoothDevice bluetoothDevice, aefi aefi) {
        short[] sArr;
        aeih aeih;
        if (this.m.P()) {
            throw new PairingException("Skipping connecting to profiles, no direct connection possible.", new Object[0]);
        } else if (!this.m.N() || bluetoothDevice.getBondState() != 12) {
            throw new PairingException("Not previously bonded skipping direct connection, %s", Integer.valueOf(bluetoothDevice.getBondState()));
        } else {
            short[] c2 = c(bluetoothDevice);
            if (c2.length == 0 && this.m.ab() > 0) {
                c2 = a(bluetoothDevice, this.m.ab());
            }
            if (c2.length == 0) {
                short[] a2 = aega.a();
                ((anih) ((anih) aehd.a.c()).a("aeha", "a", 692, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to connect constants profiles, %s", (Object) Arrays.toString(a2));
                sArr = a2;
            } else {
                ((anih) ((anih) aehd.a.d()).a("aeha", "a", 695, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to connect device profiles, %s", (Object) Arrays.toString(c2));
                sArr = c2;
            }
            this.n.a(aspb.DIRECTLY_CONNECTED_TO_PROFILE);
            try {
                aeih = new aeih(this.p, "Connect to profile directly");
                a(aefi, bluetoothDevice, sArr, 1, this.m.ad());
                ((anih) ((anih) aehd.a.d()).a("aeha", "a", 707, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Directly connected to %s.", (Object) bluetoothDevice);
                this.n.b();
                aeih.close();
                return;
            } catch (PairingException e2) {
                this.n.a((Exception) e2);
                throw e2;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        throw th;
    }

    private final boolean a(aeiy aeiy, UUID uuid) {
        aeih aeih;
        try {
            aeih = new aeih(this.p, "Get service characteristic list");
            UUID uuid2 = aeft.a;
            new Object[1][0] = uuid2;
            if (!aeiy.g) {
                aeiy.a();
            }
            BluetoothGattService bluetoothGattService = null;
            for (BluetoothGattService bluetoothGattService2 : aeiy.d.b()) {
                if (bluetoothGattService2.getUuid().equals(uuid2)) {
                    if (bluetoothGattService == null) {
                        bluetoothGattService = bluetoothGattService2;
                    } else {
                        throw new BluetoothException(String.format("More than one service %s found on device %s.", new Object[]{uuid2, aeiy.d.a()}));
                    }
                }
            }
            if (bluetoothGattService != null) {
                for (BluetoothGattCharacteristic uuid3 : bluetoothGattService.getCharacteristics()) {
                    if (uuid.equals(uuid3.getUuid())) {
                        ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1555, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("characteristic is exists, uuid = %s.", (Object) uuid.toString());
                        aeih.close();
                        return true;
                    }
                }
                aeih.close();
                ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1562, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("can't find characteristic, uuid = %s.", (Object) uuid.toString());
                return false;
            }
            throw new BluetoothException(String.format("Service %s not found on device %s.", new Object[]{uuid2, aeiy.d.a()}));
        } catch (BluetoothException e2) {
            anih anih = (anih) aehd.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("aeha", "a", 1560, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't get service characteristic list.");
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        return new short[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final short[] a(android.bluetooth.BluetoothDevice r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "aeha"
            r2 = 1
            r3 = 0
            r4 = 1
        L_0x0007:
            r5 = 0
            if (r4 > r13) goto L_0x00ca
            aegn r6 = r11.n
            aspb r7 = defpackage.aspb.GET_PROFILES_VIA_SDP
            r6.a((defpackage.aspb) r7)
            aeih r6 = new aeih     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            aeij r7 = r11.p     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            r9 = 52
            r8.<init>(r9)     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            java.lang.String r9 = "Get BR/EDR handover information via SDP #"
            r8.append(r9)     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            r8.append(r4)     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            java.lang.String r8 = r8.toString()     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            r6.<init>(r7, r8)     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
            anil r7 = defpackage.aehd.a     // Catch:{ all -> 0x007e }
            anie r7 = r7.d()     // Catch:{ all -> 0x007e }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "b"
            r9 = 1484(0x5cc, float:2.08E-42)
            anie r7 = r7.a((java.lang.String) r1, (java.lang.String) r8, (int) r9, (java.lang.String) r0)     // Catch:{ all -> 0x007e }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "Getting supported profiles via SDP (Bluetooth Classic) for %s"
            java.lang.String r9 = r12.getAddress()     // Catch:{ all -> 0x007e }
            r7.a((java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x007e }
            android.content.Context r7 = r11.l     // Catch:{ all -> 0x007e }
            aeia r8 = r11.m     // Catch:{ all -> 0x007e }
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x007e }
            java.lang.String r10 = "android.bluetooth.device.action.UUID"
            r9[r5] = r10     // Catch:{ all -> 0x007e }
            aegd r7 = defpackage.aegd.a(r7, r8, r12, r9)     // Catch:{ all -> 0x007e }
            r12.fetchUuidsWithSdp()     // Catch:{ all -> 0x0074 }
            aeia r8 = r11.m     // Catch:{ all -> 0x0074 }
            int r8 = r8.i()     // Catch:{ all -> 0x0074 }
            long r8 = (long) r8     // Catch:{ all -> 0x0074 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0074 }
            r7.a(r8, r10)     // Catch:{ all -> 0x0074 }
            r7.close()     // Catch:{ all -> 0x007e }
            short[] r3 = c((android.bluetooth.BluetoothDevice) r12)     // Catch:{ all -> 0x007e }
            r6.close()     // Catch:{ ExecutionException -> 0x0072, InterruptedException -> 0x0070, TimeoutException -> 0x006e }
            goto L_0x008d
        L_0x006e:
            r6 = move-exception
            goto L_0x008d
        L_0x0070:
            r6 = move-exception
            goto L_0x008d
        L_0x0072:
            r6 = move-exception
            goto L_0x008d
        L_0x0074:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r7 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x007e }
        L_0x007d:
            throw r8     // Catch:{ all -> 0x007e }
        L_0x007e:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r6)     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
        L_0x0087:
            throw r7     // Catch:{ ExecutionException -> 0x008c, InterruptedException -> 0x008a, TimeoutException -> 0x0088 }
        L_0x0088:
            r6 = move-exception
            goto L_0x008d
        L_0x008a:
            r6 = move-exception
            goto L_0x008d
        L_0x008c:
            r6 = move-exception
        L_0x008d:
            if (r3 != 0) goto L_0x0090
            goto L_0x0099
        L_0x0090:
            int r6 = r3.length
            if (r6 == 0) goto L_0x0099
            aegn r12 = r11.n
            r12.b()
            goto L_0x00cb
        L_0x0099:
            aegn r5 = r11.n
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException
            r6.<init>()
            r5.a((java.lang.Exception) r6)
            anil r5 = defpackage.aehd.a
            anie r5 = r5.c()
            anih r5 = (defpackage.anih) r5
            r6 = 1474(0x5c2, float:2.066E-42)
            java.lang.String r7 = "a"
            anie r5 = r5.a((java.lang.String) r1, (java.lang.String) r7, (int) r6, (java.lang.String) r0)
            anih r5 = (defpackage.anih) r5
            java.lang.String r6 = r12.getAddress()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            java.lang.String r9 = "SDP returned no UUIDs from %s, assuming timeout (attempt %d of %d)."
            r5.a((java.lang.String) r9, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            int r4 = r4 + 1
            goto L_0x0007
        L_0x00ca:
        L_0x00cb:
            if (r3 != 0) goto L_0x00d0
            short[] r12 = new short[r5]
            return r12
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeha.a(android.bluetooth.BluetoothDevice, int):short[]");
    }

    public final aegz a(byte[] bArr) {
        Throwable th;
        Throwable th2;
        aehn h2;
        aehk aehk;
        byte[] bArr2 = bArr;
        this.t = bArr2;
        if (bArr2 != null) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 399, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Starting to pair %s: key[%s] %s, %s", this.o, Integer.valueOf(bArr2.length), anml.g.a(bArr2), this.m);
        } else {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Pairing %s: %s", (Object) this.o, (Object) this.m);
        }
        if (this.m.V() != null) {
            this.n.a(this.l, this.o, this.m.V());
        }
        if (bArr2 != null && this.m.M()) {
            this.n.a(aspb.GET_LOCAL_PUBLIC_ADDRESS);
            if (aeez.a(this.l) != null) {
                this.n.b();
                this.r = true;
            } else {
                this.n.a((Exception) new IllegalStateException("null bluetooth_address"));
                ((anih) ((anih) aehd.a.b()).a("aeha", "a", 417, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Want provider to initiate bonding, but cannot access Bluetooth public address. Falling back to initiating bonding ourselves.");
            }
        }
        aehf aehf = new aehf(this.l, this.m, this.n, this.a, new aego(this), this.o, this.p, g());
        this.q = aehf;
        if (bArr2 != null) {
            try {
                if (bArr2.length > 0) {
                    aeiy a2 = aehf.a();
                    try {
                        this.n.a(aspb.SECRET_HANDSHAKE);
                        aeih aeih = new aeih(this.p, "Handshake");
                        try {
                            h2 = h();
                            aehk = new aehk();
                            aehk.a(aeez.a(this.o));
                            if (this.r) {
                                aehk.a(aefo.PROVIDER_INITIATES_BONDING);
                            }
                            if (!this.r) {
                                if (Build.VERSION.SDK_INT < 26 && !this.m.J()) {
                                    aehk.a(aefo.REQUEST_DISCOVERABLE);
                                }
                            }
                            if (this.m.W() && d(bArr)) {
                                aehk.a(aefo.REQUEST_DEVICE_NAME);
                                ((anih) ((anih) aehd.a.d()).a("aeha", "i", 1403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("register for the device name response from address=%s", (Object) this.o);
                                aeiy a3 = this.q.a();
                                a3.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
                                this.e = new aegv(a3);
                            }
                        } catch (BluetoothException e2) {
                            ((anih) ((anih) aehd.a.d()).a("aeha", "i", 1411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't register for device name response, no naming characteristic.");
                        } catch (Throwable th3) {
                            th2 = th3;
                            aeih.close();
                            throw th2;
                        }
                        if (this.m.aa()) {
                            aehk.a(aefo.REQUEST_RETROACTIVE_PAIR);
                            aehk.a = (byte[]) amrl.a((Object) aeez.a(this.l));
                        }
                        aehk.d = 0;
                        a(h2, bArr2, new aehl(aehk));
                        String str = this.c;
                        if (str != null) {
                            aegw aegw = this.d;
                            if (aegw != null) {
                                List list = aegw.b;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        Iterator it = aegw.b.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            aehc aehc = (aehc) it.next();
                                            byte[] a4 = aeez.a(str);
                                            if (Arrays.equals(aehc.b().k(), anln.d().a(aooa.a(aehc.a().k(), a4)).b())) {
                                                aegw.a = aehc.a().k();
                                                ((anih) ((anih) aehd.a.d()).a("aeha", "a", 448, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The provider is found in paired history.");
                                                break;
                                            }
                                        }
                                    }
                                }
                                ((anih) ((anih) aehd.a.d()).a("aeha", "a", 450, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The provider is not found in paired history.");
                            }
                        }
                        aeih.close();
                        this.n.b();
                        aegz a5 = a(this.m.r());
                        if (a2 != null) {
                            a2.close();
                        }
                        this.p.a();
                        if (this.n.a()) {
                            this.n.a(this.l);
                        }
                        return a5;
                    } catch (Throwable th4) {
                        th = th4;
                        if (a2 != null) {
                            a2.close();
                        }
                        throw th;
                    }
                }
            } catch (aeid | BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e3) {
                try {
                    if (this.n.c()) {
                        this.n.a(e3);
                    }
                    throw e3;
                } catch (Throwable th5) {
                    this.p.a();
                    if (this.n.a()) {
                        this.n.a(this.l);
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                apev.a(th, th6);
            }
        }
        aegz a6 = a(this.m.r());
        this.p.a();
        if (this.n.a()) {
            this.n.a(this.l);
        }
        return a6;
    }

    public final String a() {
        aegv aegv = this.e;
        if (aegv == null) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 336, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getProviderDeviceName failed, deviceNameReceiver == null.");
            return null;
        }
        byte[] bArr = this.s;
        if (bArr != null) {
            String a2 = aegv.a(bArr);
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 344, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getProviderDeviceName = %s.", (Object) a2);
            Context context = this.l;
            String b2 = amrk.b(a2);
            if (aein.a(context)) {
                ((anih) ((anih) aehd.a.d()).a("aein", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send device name (%s) to validator", (Object) b2);
                context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.GET_DEVICE_NAME").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME", b2));
            }
            return a2;
        }
        ((anih) ((anih) aehd.a.d()).a("aeha", "a", 340, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("getProviderDeviceName failed, pairingSecret == null.");
        return null;
    }

    public final void a(String str) {
        ((anih) ((anih) aehd.a.d()).a("aeha", "a", 327, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Update provider device name = %s.", (Object) str);
        this.u = str;
        this.v = true;
    }

    public final void a(List list) {
        ((anih) ((anih) aehd.a.d()).a("aeha", "a", 318, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired history has been set.");
        this.d = new aegw(list);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        aeih aeih;
        Object obj;
        if (str == null || str2 == null) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeNameToProvider fail because provider name or address is null.");
            return false;
        } else if (this.s != null) {
            try {
                aeih = new aeih(this.p, "Encode device name");
                byte[] bArr = this.s;
                if (bArr == null || bArr.length != 16) {
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    } else {
                        obj = "NULL";
                    }
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                    sb.append("Incorrect secret for encoding name packet, secret.length = ");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
                } else if (str.length() == 0 || amte.a(str) > 48) {
                    String valueOf2 = String.valueOf(Integer.valueOf(amte.a(str)));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 66);
                    sb2.append("Invalid name for encoding name packet, Utf8.encodedLength(name) = ");
                    sb2.append(valueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } else {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    byte[] bArr2 = new byte[8];
                    new SecureRandom().nextBytes(bArr2);
                    byte[] a2 = aooa.a(bArr2, aeeu.a(bArr, bytes, bArr2));
                    byte[] a3 = aooa.a(Arrays.copyOf(aehq.a(bArr, a2), 8), a2);
                    aeih.close();
                    int i2 = 1;
                    while (i2 <= this.m.m()) {
                        this.n.a(aspb.WRITE_DEVICE_NAME);
                        try {
                            ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1342, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing new device name to address=%s", (Object) str2);
                            aeiy a4 = this.q.a();
                            a4.a(TimeUnit.SECONDS.toMillis((long) this.m.a()));
                            a4.a(aeft.a, aefq.a, a3);
                            ((anih) ((anih) aehd.a.d()).a("aeha", "d", 1347, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Finished writing new device name=%s", (Object) anml.g.a(a3));
                            this.n.b();
                            return true;
                        } catch (BluetoothException e2) {
                            anih anih = (anih) aehd.a.c();
                            anih.a((Throwable) e2);
                            ((anih) anih.a("aeha", "a", 1318, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error writing name attempt %d of %d", i2, this.m.m());
                            this.n.a((Exception) e2);
                            Thread.sleep((long) this.m.H());
                            i2++;
                        }
                    }
                    return false;
                }
            } catch (GeneralSecurityException e3) {
                anih anih2 = (anih) aehd.a.c();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("aeha", "a", 1307, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to encrypt device name.");
                return false;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1300, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeNameToProvider fail because no pairingSecret.");
            return false;
        }
        throw th;
    }

    public final boolean a(byte[] bArr, String str) {
        Throwable th;
        aeih aeih;
        Throwable th2;
        aeih aeih2;
        Throwable th3;
        byte[] bArr2 = bArr;
        if (!this.m.W()) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1130, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disable NamingCharacteristic feature, ignoring.");
            return false;
        } else if (amrk.a(str)) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Provider name is null or empty, ignoring.");
            return false;
        } else if (bArr2 != null && bArr2.length == 16) {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Start to update device name for provider.");
            if (this.m.V() != null) {
                this.n.a(this.l, this.o, this.m.V());
            }
            Context context = this.l;
            aeia aeia = this.m;
            aegn aegn = this.n;
            aejv aejv = this.a;
            aegq aegq = new aegq(this);
            String str2 = this.o;
            aehf aehf = new aehf(context, aeia, aegn, aejv, aegq, str2, this.p, b(true));
            this.q = aehf;
            try {
                aeiy a2 = aehf.a();
                try {
                    if (!a(a2, aefq.a)) {
                        ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't find name characteristic, skip to write name with retry times.");
                        this.q.b();
                        if (a2 != null) {
                            a2.close();
                        }
                        this.p.a();
                        return true;
                    }
                    this.n.a(aspb.SECRET_HANDSHAKE);
                    aeih = new aeih(this.p, "Handshake");
                    aehn h2 = h();
                    aehg aehg = new aehg();
                    aehg.a(aeez.a(this.o));
                    aefn aefn = aefn.ADDITIONAL_DATA_CHARACTERISTIC;
                    aehg.e = (byte) (aefn.c | aehg.e);
                    aehg.d = 16;
                    a(h2, bArr2, new aehh(aehg));
                    aeih.close();
                    this.n.b();
                    aeih2 = new aeih(this.p, "WriteNameToProvider");
                    boolean a3 = a(str, this.c);
                    aeih2.close();
                    if (a2 != null) {
                        a2.close();
                    }
                    this.p.a();
                    this.q.b();
                    return a3;
                } catch (Throwable th4) {
                    th = th4;
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th;
                }
            } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e2) {
                try {
                    if (this.n.c()) {
                        this.n.a(e2);
                    }
                    throw e2;
                } catch (Throwable th5) {
                    this.p.a();
                    throw th5;
                }
            } catch (Throwable th6) {
                apev.a(th, th6);
            }
        } else {
            ((anih) ((anih) aehd.a.d()).a("aeha", "a", 1138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("key is null or key length is not account key size.");
            return false;
        }
        throw th2;
        throw th3;
    }
}
