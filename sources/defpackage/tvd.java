package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: tvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvd {
    public static Executor a() {
        return jfm.b(10);
    }

    public static boolean a(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static ttg a(Context context, aucd aucd, String str, byte[] bArr) {
        ttg e = ((ttf) thl.a(context, ttf.class)).e(((uaj) aucd.b).c);
        if (e != null) {
            int J = e.J();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj = (uaj) aucd.b;
            int i = J - 1;
            uaj uaj2 = uaj.K;
            if (J != 0) {
                uaj.m = i;
                uaj.a |= 1024;
                int I = e.I();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                uaj uaj3 = (uaj) aucd.b;
                int i2 = I - 1;
                if (I != 0) {
                    uaj3.E = i2;
                    uaj3.a |= 134217728;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj4 = (uaj) aucd.b;
        uaj uaj5 = uaj.K;
        str.getClass();
        uaj4.a |= 4;
        uaj4.e = str;
        tzf a = tvq.a(context, str);
        if (a != null) {
            long j = a.y;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj6 = (uaj) aucd.b;
            uaj6.a |= 512;
            uaj6.l = j;
        }
        long a2 = ((jiq) thl.a(context, jiq.class)).a();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj7 = (uaj) aucd.b;
        uaj7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        uaj7.k = a2;
        String string = context.getString(R.string.common_tap_to_pair);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj8 = (uaj) aucd.b;
        string.getClass();
        uaj8.a |= 64;
        uaj8.i = string;
        uaj8.C = aucj.s();
        aucd.ab(tsr.a(601));
        Intent putExtra = DiscoveryChimeraService.a(context).setPackage(context.getPackageName()).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", ((uaj) aucd.b).c).putExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET", anml.g.a(bArr));
        uaj uaj9 = (uaj) aucd.b;
        if ((uaj9.a & 8) != 0) {
            try {
                putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", Intent.parseUri(uaj9.f, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"));
            } catch (URISyntaxException e2) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e2);
                anih.a("Failed to parse action url %s", (Object) ((uaj) aucd.b).f);
            }
        }
        String uri = putExtra.toUri(1);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj10 = (uaj) aucd.b;
        uri.getClass();
        int i3 = uaj10.a | 8;
        uaj10.a = i3;
        uaj10.f = uri;
        String str2 = uaj10.h;
        str2.getClass();
        uaj10.a = i3 | 64;
        uaj10.i = str2;
        String string2 = context.getString(R.string.fast_pair_your_device);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj11 = (uaj) aucd.b;
        string2.getClass();
        uaj11.a |= 32;
        uaj11.h = string2;
        return new ttg(context, (uaj) aucd.i());
    }

    static tzj a(List list, tzi tzi) {
        jjg jjg = tsp.a;
        list.size();
        if (!(tzi == null || (tzi.a & 2) == 0)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tzj tzj = (tzj) it.next();
                if (Arrays.equals(tzi.c.k(), tzj.b.k())) {
                    return tzj;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if ((r0.getCause() instanceof defpackage.auda) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r0.getCause() instanceof defpackage.auda) == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        throw new defpackage.auda(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:6:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.uaj a(android.content.Context r5, defpackage.tzi r6, defpackage.arxt r7) {
        /*
            int r0 = r6.a
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = r5.getPackageName()
            java.util.List r5 = defpackage.jgu.d(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r5.next()
            android.accounts.Account r0 = (android.accounts.Account) r0
            aorr r0 = r7.a((android.accounts.Account) r0)     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            tzj r0 = a((java.util.List) r0, (defpackage.tzi) r6)     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            if (r0 == 0) goto L_0x0012
            auay r0 = r0.c     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            aubs r1 = defpackage.aubs.c()     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            uaj r2 = defpackage.uaj.K     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            r3 = 4
            java.lang.Object r2 = r2.c(r3)     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            aucj r2 = (defpackage.aucj) r2     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            aueh r3 = defpackage.aueh.a     // Catch:{ IOException -> 0x006e, RuntimeException -> 0x005d }
            aueq r3 = r3.a((java.lang.Object) r2)     // Catch:{ IOException -> 0x006e, RuntimeException -> 0x005d }
            aubd r4 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x006e, RuntimeException -> 0x005d }
            r3.a(r2, r4, r1)     // Catch:{ IOException -> 0x006e, RuntimeException -> 0x005d }
            r3.d(r2)     // Catch:{ IOException -> 0x006e, RuntimeException -> 0x005d }
            r1 = 0
            r0.a((int) r1)     // Catch:{ auda -> 0x005b, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            defpackage.aucj.b((defpackage.aucj) r2)     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            uaj r2 = (defpackage.uaj) r2     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
            return r2
        L_0x005b:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
        L_0x005d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            if (r1 == 0) goto L_0x006d
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            throw r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
        L_0x006d:
            throw r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
        L_0x006e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            if (r1 != 0) goto L_0x0081
            auda r1 = new auda     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            r1.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            throw r1     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
        L_0x0081:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
            throw r0     // Catch:{ auda -> 0x0088, ExecutionException -> 0x008e, InterruptedException -> 0x008c }
        L_0x0088:
            r0 = move-exception
            throw r0     // Catch:{ ExecutionException -> 0x008e, InterruptedException -> 0x008c, auda -> 0x008a }
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            goto L_0x008f
        L_0x008e:
            r0 = move-exception
        L_0x008f:
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            java.lang.String r0 = "FastPair: Failed to read device from Footprints based on cached item."
            r1.a((java.lang.String) r0)
            goto L_0x0012
        L_0x00a1:
            r5 = 0
            return r5
        L_0x00a3:
            uaj r5 = r6.n
            if (r5 != 0) goto L_0x00a9
            uaj r5 = defpackage.uaj.K
        L_0x00a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvd.a(android.content.Context, tzi, arxt):uaj");
    }

    public static void a(Context context, BluetoothDevice bluetoothDevice, tzi tzi, arxt arxt) {
        if (!aymw.ac()) {
            return;
        }
        if (!jkr.h() || arww.a(bluetoothDevice, 1) != null) {
            jjg jjg = tsp.a;
            return;
        }
        ((anih) tsp.a.d()).a("FastPair: Backfilling bluetooth metadata for %s", (Object) bluetoothDevice);
        a((Runnable) new tux(context, tzi, arxt, bluetoothDevice));
    }

    public static void a(Context context, BluetoothDevice bluetoothDevice, uaj uaj, int i, uab uab) {
        String a = arww.a(bluetoothDevice, i);
        if (!amrk.a(a) && !uac.a(context, Uri.parse(a))) {
            ((anih) tsp.a.d()).a("FastPair: re-get image's content uri:%s", (Object) uac.a(uaj, uab).a(context));
        }
    }

    public static void a(Context context, String str, uaj uaj, String str2) {
        ((anih) tsp.a.d()).a("FastPair: Preparing to write metadata: %s, %s (SDK_INT: %d, Q: %d)", Boolean.valueOf(aymw.ac()), Boolean.valueOf(jkr.h()), Integer.valueOf(Build.VERSION.SDK_INT), 29);
        if (aymw.ac() && jkr.h()) {
            boolean a = arwx.a(uaj);
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            arww.a(remoteDevice, 1, uaj.h);
            auzo auzo = uaj.I;
            if (auzo == null) {
                auzo = auzo.j;
            }
            arww.a(remoteDevice, 0, auzo.h);
            String valueOf = String.valueOf(uaj.y);
            arww.a(remoteDevice, 3, valueOf.length() == 0 ? new String("FAST_PAIR_") : "FAST_PAIR_".concat(valueOf));
            if (a(str2)) {
                arww.a(remoteDevice, 4, str2);
            }
            arww.a(remoteDevice, 6, (!a ? Boolean.FALSE : Boolean.TRUE).toString());
            arww.a(remoteDevice, 16, new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links").appendQueryParameter("address", str).toString());
            Uri a2 = uac.a(uaj, uab.MAIN).a(context);
            if (a2 != null) {
                arww.a(remoteDevice, 5, a2.toString());
            }
            if (a) {
                Uri a3 = uac.a(uaj, uab.LEFT).a(context);
                if (a3 != null) {
                    arww.a(remoteDevice, 7, a3.toString());
                }
                Uri a4 = uac.a(uaj, uab.RIGHT).a(context);
                if (a4 != null) {
                    arww.a(remoteDevice, 8, a4.toString());
                }
                Uri a5 = uac.a(uaj, uab.CASE).a(context);
                if (a5 != null) {
                    arww.a(remoteDevice, 9, a5.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0248, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024b, code lost:
        r1 = r0;
        r2 = (defpackage.anih) defpackage.tsp.a.b();
        r2.a(r1);
        r2.a("FastPair: Error");
        r11.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021b, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r2 = (defpackage.anih) defpackage.tsp.a.c();
        r2.a((java.lang.Throwable) r1);
        r2.a("FastPair: Failed to insert device into cache.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0232, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0233, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0238, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e A[ExcHandler: aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException (e java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ae A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01af A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c6 A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d0 A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d9 A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01da A[Catch:{ all -> 0x0232, all -> 0x0238, BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, aeid | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x023e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r16, defpackage.ttg r17, java.lang.String r18, byte[] r19, defpackage.arxt r20, defpackage.twf r21) {
        /*
            r9 = r16
            r10 = r19
            r11 = r21
            java.lang.Class<tvg> r1 = defpackage.tvg.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r9, (java.lang.Class) r1)
            tvg r1 = (defpackage.tvg) r1
            r1.a()
            r21.d()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r9.getSystemService(r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.inKeyguardRestrictedInputMode()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r12 = 0
            r13 = 1
            if (r1 != 0) goto L_0x0025
            goto L_0x004b
        L_0x0025:
            jjg r1 = defpackage.tsp.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aehy r1 = defpackage.tvt.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aeia r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r3 = "android.intent.action.USER_PRESENT"
            r2[r12] = r3     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aeif r1 = defpackage.aeif.a(r9, r1, r2)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymt r2 = defpackage.aymt.a     // Catch:{ all -> 0x0232 }
            aymu r2 = r2.a()     // Catch:{ all -> 0x0232 }
            long r2 = r2.bf()     // Catch:{ all -> 0x0232 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0232 }
            r1.a(r2, r4)     // Catch:{ all -> 0x0232 }
            r1.close()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x004b:
            jjg r1 = defpackage.tsp.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anie r1 = r1.d()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anih r1 = (defpackage.anih) r1     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r2 = "PairingProgressHandler:onScreenUnlocked"
            r1.a((java.lang.String) r2)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            ttu r1 = r11.e     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1.b()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = defpackage.aymq.g()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            goto L_0x0088
        L_0x0064:
            boolean r1 = defpackage.arxk.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x0063
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.enable()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x0087
            java.lang.Class<arwg> r1 = defpackage.arwg.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r9, (java.lang.Class) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            arwg r1 = (defpackage.arwg) r1     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            tuy r2 = new tuy     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r3 = "enableBluetoothToast"
            r2.<init>(r3, r9)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1.c(r2)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x0088
        L_0x0087:
            return
        L_0x0088:
            r21.e()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r14 = r17.G()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymt r1 = defpackage.aymt.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymu r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r1 = r1.B()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.contains(r14)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aehy r2 = defpackage.tvt.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.f((boolean) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.l((boolean) r13)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r11.a((defpackage.aehy) r2)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x00bb
            goto L_0x00cd
        L_0x00bb:
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            int r1 = r1.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1 = r1 & r13
            if (r1 == 0) goto L_0x00cd
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.b     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.u((boolean) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x00cd:
            aymw r1 = defpackage.aymw.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymx r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.B()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x00da
            goto L_0x0100
        L_0x00da:
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x0100
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            int r1 = r1.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0100
            auzo r1 = r17.p()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            int r1 = r1.i     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            int r1 = defpackage.avbc.a(r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x0100
            r3 = 9
            if (r1 != r3) goto L_0x0100
            r2.x(r13)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.f((int) r13)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x0100:
            aeha r15 = new aeha     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r1 = r17.m()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aeia r2 = r2.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            tue r3 = new tue     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            ttu r4 = r11.e     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r3.<init>(r4)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r15.<init>(r9, r1, r2, r3)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            tup r8 = new tup     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1 = r8
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r15
            r7 = r19
            r12 = r8
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r15.b = r12     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = defpackage.aymw.D()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x0137
            tuq r1 = new tuq     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1.<init>(r11)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r15.g = r1     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x0137:
            amzt r1 = defpackage.amzy.j()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aorr r2 = r20.a()     // Catch:{ ExecutionException -> 0x0173, InterruptedException -> 0x0171, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0173, InterruptedException -> 0x0171, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.util.List r2 = (java.util.List) r2     // Catch:{ ExecutionException -> 0x0173, InterruptedException -> 0x0171, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x0149:
            boolean r3 = r2.hasNext()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r3 == 0) goto L_0x016c
            java.lang.Object r3 = r2.next()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            tzj r3 = (defpackage.tzj) r3     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            int r4 = r3.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0149
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0149
            auay r4 = r3.b     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            auay r3 = r3.d     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aeex r5 = new aeex     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r5.<init>(r4, r3)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1.c(r5)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x0149
        L_0x016c:
            amzy r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x0186
        L_0x0171:
            r0 = move-exception
            goto L_0x0174
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            r1 = r0
            jjg r2 = defpackage.tsp.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anie r2 = r2.c()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.a((java.lang.Throwable) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r1 = "FastPair: Failed to read sha256 and account key from Footprints."
            r2.a((java.lang.String) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r1 = 0
        L_0x0186:
            anil r2 = defpackage.aehd.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anie r2 = r2.d()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r3 = "aeha"
            java.lang.String r4 = "a"
            r5 = 318(0x13e, float:4.46E-43)
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r3 = "Paired history has been set."
            r2.a((java.lang.String) r3)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aegw r2 = new aegw     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.<init>(r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r15.d = r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = defpackage.aymw.q()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r15.f = r14     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x01b1:
            r21.c()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymw r1 = defpackage.aymw.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymx r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.t()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x01d0
            boolean r1 = defpackage.jkr.f()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x01d0
            boolean r1 = defpackage.jix.d(r16)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x01ce
            r12 = 0
            goto L_0x01d1
        L_0x01ce:
            r12 = 1
            goto L_0x01d1
        L_0x01d0:
            r12 = 0
        L_0x01d1:
            if (r10 != 0) goto L_0x01da
            byte[] r1 = r17.n()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 != 0) goto L_0x01da
            goto L_0x01e9
        L_0x01da:
            if (r12 == 0) goto L_0x01ed
            aymw r1 = defpackage.aymw.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            aymx r1 = r1.a()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            boolean r1 = r1.br()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r1 == 0) goto L_0x01e9
            goto L_0x01ed
        L_0x01e9:
            r15.e()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x022c
        L_0x01ed:
            if (r10 != 0) goto L_0x01f4
            byte[] r1 = r17.n()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x01f5
        L_0x01f4:
            r1 = r10
        L_0x01f5:
            aegz r1 = r15.a((byte[]) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            byte[] r5 = r11.a(r10, r15, r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            if (r5 == 0) goto L_0x022c
            java.lang.String r3 = r15.c     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.Class<arwg> r1 = defpackage.arwg.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r9, (java.lang.Class) r1)     // Catch:{ InterruptedException -> 0x021a, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r7 = r1
            arwg r7 = (defpackage.arwg) r7     // Catch:{ InterruptedException -> 0x021a, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            tuz r8 = new tuz     // Catch:{ InterruptedException -> 0x021a, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r2 = "FastPairCacheDevice"
            r1 = r8
            r4 = r17
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ InterruptedException -> 0x021a, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r7.a((defpackage.arwm) r8)     // Catch:{ InterruptedException -> 0x021a, BluetoothException -> 0x024a, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            goto L_0x022c
        L_0x021a:
            r0 = move-exception
            r1 = r0
            jjg r2 = defpackage.tsp.a     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anie r2 = r2.c()     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            anih r2 = (defpackage.anih) r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r2.a((java.lang.Throwable) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            java.lang.String r1 = "FastPair: Failed to insert device into cache."
            r2.a((java.lang.String) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x022c:
            java.lang.String r1 = r15.c     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            r11.b(r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
            return
        L_0x0232:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch:{ all -> 0x0238 }
            goto L_0x023d
        L_0x0238:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x023d:
            throw r2     // Catch:{ BluetoothException -> 0x024a, InterruptedException -> 0x0248, aeid -> 0x0246, TimeoutException -> 0x0244, ExecutionException -> 0x0242, PairingException -> 0x0240, GeneralSecurityException -> 0x023e }
        L_0x023e:
            r0 = move-exception
            goto L_0x024b
        L_0x0240:
            r0 = move-exception
            goto L_0x024b
        L_0x0242:
            r0 = move-exception
            goto L_0x024b
        L_0x0244:
            r0 = move-exception
            goto L_0x024b
        L_0x0246:
            r0 = move-exception
            goto L_0x024b
        L_0x0248:
            r0 = move-exception
            goto L_0x024b
        L_0x024a:
            r0 = move-exception
        L_0x024b:
            r1 = r0
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r1)
            java.lang.String r3 = "FastPair: Error"
            r2.a((java.lang.String) r3)
            r11.a((java.lang.Throwable) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvd.a(android.content.Context, ttg, java.lang.String, byte[], arxt, twf):void");
    }

    static final /* synthetic */ void a(Context context, tzi tzi, arxt arxt, BluetoothDevice bluetoothDevice) {
        String str;
        uaj a = a(context, tzi, arxt);
        if (a != null) {
            try {
                str = Intent.parseUri(a.f, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            } catch (URISyntaxException e) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e);
                anih.a("FastPair: Failed to parse companion app.");
                str = null;
            }
            a(context, bluetoothDevice.getAddress(), a, str);
            return;
        }
        ((anih) tsp.a.d()).a("FastPair: Failed to get stored discovery item for writing bluetooth metadata.");
    }

    public static void a(Context context, tzi tzi, byte[] bArr, boolean z, double d, arxt arxt, String str) {
        uaj uaj;
        amri amri;
        if ((tzi.a & 1024) == 0) {
            uaj = a(context, tzi, arxt);
        } else {
            uaj = tzi.n;
            if (uaj == null) {
                uaj = uaj.K;
            }
        }
        if (uaj != null) {
            txb txb = (txb) thl.a(context, txb.class);
            if (!aymw.a.a().o() || !txb.b(tzi.b)) {
                BatteryAdvertisement batteryAdvertisement = new BatteryAdvertisement();
                batteryAdvertisement.a(bArr);
                batteryAdvertisement.c = z;
                batteryAdvertisement.d = d;
                batteryAdvertisement.f = tzi.c;
                batteryAdvertisement.a = tzi.b;
                batteryAdvertisement.a(uaj);
                batteryAdvertisement.s = 1;
                tzf a = tvq.a(context, str);
                if (a == null) {
                    ((anih) tsp.a.d()).a("FastPairUtils: Failed to find the scan result for %s", (Object) str);
                    amri = ampu.a;
                } else {
                    amri = amri.b(Long.valueOf(a.y));
                }
                batteryAdvertisement.o = ((Long) amri.a((Object) -1L)).longValue();
                txb.b(batteryAdvertisement);
            }
        }
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }

    static boolean a(String str) {
        return !TextUtils.isEmpty(str);
    }

    static boolean a(ttg ttg, byte[] bArr) {
        return bArr == null && ttg.n() != null;
    }
}
