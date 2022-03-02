package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.slice.Slice;
import com.google.android.gms.R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mtk extends bsq {
    public final List a = new ArrayList();
    private mts b;
    private aoe c;
    private hya d;

    public mtk(String... strArr) {
        super(strArr);
    }

    private static PendingIntent a(Context context, String str, avbh avbh, String str2, byte[] bArr, String str3, Intent intent) {
        if (intent != null && !TextUtils.isEmpty(str3)) {
            return PendingIntent.getService(context, 2, arza.a(context, asom.FAST_PAIR_DEVICE_OPEN_COMPANION_APP_CLICKED, str, avbh, str2, bArr, intent), 134217728);
        }
        return PendingIntent.getService(context, 2, arza.a(context, asom.FAST_PAIR_DEVICE_INSTALL_COMPANION_APP_CLICKED, str, avbh, str2, bArr, aryl.a(context, itg.b(str))), 134217728);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0162, code lost:
        if (defpackage.aymw.a.ad().bj() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
        if (r13.a(r8.c, a("settings_slice", r11, r0), new defpackage.mti(r16, new java.util.concurrent.atomic.AtomicInteger(150), r14, r19, r11, r12)) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.slice.Slice b(android.content.Context r17, android.net.Uri r18, defpackage.avbh r19) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r18
            java.lang.String r0 = "address"
            java.lang.String r11 = r10.getQueryParameter(r0)
            java.lang.String r0 = "account_key"
            java.lang.String r0 = r10.getQueryParameter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "mtk"
            r4 = 0
            if (r1 != 0) goto L_0x01e0
            mts r0 = r16.c()
            java.lang.String r1 = "a"
            if (r0 != 0) goto L_0x003c
            jjg r0 = defpackage.mte.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 477(0x1dd, float:6.68E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r1, (int) r5, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper."
            r0.a((java.lang.String) r1)
            goto L_0x01df
        L_0x003c:
            com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks r12 = r0.b((java.lang.String) r11)     // Catch:{ RemoteException -> 0x01c9 }
            if (r12 != 0) goto L_0x0059
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r5 = 490(0x1ea, float:6.87E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r1, (int) r5, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: No data found for deviceDetailsLinks."
            r0.a((java.lang.String) r1)
            goto L_0x01df
        L_0x0059:
            mtp r13 = b(r17, r18)
            aoe r0 = r8.c
            if (r0 != 0) goto L_0x006b
            android.content.Context r0 = r16.getContext()
            aoe r0 = defpackage.aoe.a((android.content.Context) r0)
            r8.c = r0
        L_0x006b:
            java.lang.String r0 = r12.f()
            java.lang.String r5 = r12.g()
            java.lang.String r6 = r12.c()
            java.lang.String r14 = defpackage.mtu.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0087
            java.lang.String r0 = defpackage.aymt.r()
            r6 = r0
            goto L_0x009a
        L_0x0087:
            java.lang.String r6 = defpackage.aymt.r()
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0099
            boolean r6 = defpackage.aymw.Z()
            if (r6 != 0) goto L_0x0099
            r6 = r4
            goto L_0x009a
        L_0x0099:
            r6 = r0
        L_0x009a:
            java.lang.String r0 = defpackage.aymt.r()
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0131
            boolean r0 = defpackage.aymw.Z()
            if (r0 != 0) goto L_0x00ac
            goto L_0x0131
        L_0x00ac:
            if (r5 != 0) goto L_0x00b1
            r0 = r4
            goto L_0x0132
        L_0x00b1:
            if (r14 == 0) goto L_0x012f
            android.content.pm.PackageManager r0 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0115 }
            r7 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r14, r7)     // Catch:{ NameNotFoundException -> 0x0115 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0115 }
            int r0 = r0.length     // Catch:{ NameNotFoundException -> 0x0115 }
            r7 = 1
            if (r0 != r7) goto L_0x00ff
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r0 = r5.toUpperCase(r0)     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r5 = "SHA-256"
            java.lang.String r5 = defpackage.jhg.b(r9, r14, r5)     // Catch:{ NameNotFoundException -> 0x0115 }
            boolean r0 = r0.equals(r5)     // Catch:{ NameNotFoundException -> 0x0115 }
            if (r0 != 0) goto L_0x0131
            java.lang.String r0 = "discovery_shared_pref"
            r5 = 4
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r5)     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r5 = "nearby_debug_mode"
            boolean r7 = defpackage.aymq.c()     // Catch:{ NameNotFoundException -> 0x0115 }
            boolean r0 = r0.getBoolean(r5, r7)     // Catch:{ NameNotFoundException -> 0x0115 }
            if (r0 != 0) goto L_0x0131
            jjg r0 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0115 }
            anie r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x0115 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0115 }
            r5 = 534(0x216, float:7.48E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r1, (int) r5, (java.lang.String) r2)     // Catch:{ NameNotFoundException -> 0x0115 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r5 = "Does not show slice signature, hash does not match what is registered in the console"
            r0.a((java.lang.String) r5)     // Catch:{ NameNotFoundException -> 0x0115 }
            r0 = r4
            goto L_0x0132
        L_0x00ff:
            jjg r0 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0115 }
            anie r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x0115 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0115 }
            r5 = 525(0x20d, float:7.36E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r1, (int) r5, (java.lang.String) r2)     // Catch:{ NameNotFoundException -> 0x0115 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r5 = "Does not show slice since companion app has more than one signature"
            r0.a((java.lang.String) r5)     // Catch:{ NameNotFoundException -> 0x0115 }
            goto L_0x012f
        L_0x0115:
            r0 = move-exception
            jjg r4 = defpackage.mte.a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r0)
            r0 = 541(0x21d, float:7.58E-43)
            anie r0 = r4.a((java.lang.String) r3, (java.lang.String) r1, (int) r0, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Fail to verify the app's signature package name: %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r14)
            goto L_0x0131
        L_0x012f:
            r0 = r4
            goto L_0x0132
        L_0x0131:
            r0 = r6
        L_0x0132:
            if (r0 == 0) goto L_0x0164
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 100
            r3.<init>(r1)
            aoe r15 = r8.c
            java.lang.String r1 = "oobe_slice"
            android.net.Uri r7 = a((java.lang.String) r1, (java.lang.String) r11, (java.lang.String) r0)
            mth r6 = new mth
            r1 = r6
            r2 = r16
            r4 = r14
            r5 = r19
            r10 = r6
            r6 = r11
            r9 = r7
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r1 = r13.a(r15, r9, r10)
            if (r1 == 0) goto L_0x0164
            aymw r1 = defpackage.aymw.a
            aymx r1 = r1.a()
            boolean r1 = r1.bj()
            if (r1 == 0) goto L_0x0170
        L_0x0164:
            r1 = r16
            r2 = r17
            r3 = r13
            r4 = r12
            r5 = r11
            r6 = r19
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks) r4, (java.lang.String) r5, (defpackage.avbh) r6)
        L_0x0170:
            byte[] r4 = r12.a()
            r1 = r16
            r2 = r17
            r3 = r13
            r5 = r11
            r6 = r19
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (byte[]) r4, (java.lang.String) r5, (defpackage.avbh) r6)
            boolean r1 = e(r18)
            if (r1 != 0) goto L_0x01c4
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x01bd
            java.lang.String r1 = defpackage.aymt.r()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x019b
            boolean r1 = defpackage.jix.f(r17)
            if (r1 == 0) goto L_0x01bd
        L_0x019b:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 150(0x96, float:2.1E-43)
            r3.<init>(r1)
            aoe r9 = r8.c
            java.lang.String r1 = "settings_slice"
            android.net.Uri r0 = a((java.lang.String) r1, (java.lang.String) r11, (java.lang.String) r0)
            mti r10 = new mti
            r1 = r10
            r2 = r16
            r4 = r14
            r5 = r19
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r0 = r13.a(r9, r0, r10)
            if (r0 != 0) goto L_0x01c4
        L_0x01bd:
            r5 = r17
            r6 = r19
            r8.a((android.content.Context) r5, (defpackage.mtp) r13, (com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks) r12, (defpackage.avbh) r6)
        L_0x01c4:
            androidx.slice.Slice r4 = r13.a()
            goto L_0x01df
        L_0x01c9:
            r0 = move-exception
            jjg r0 = defpackage.mte.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 486(0x1e6, float:6.81E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r1, (int) r5, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: RemoteException when getting DeviceDetailsLinks."
            r0.a((java.lang.String) r1)
        L_0x01df:
            return r4
        L_0x01e0:
            r6 = r19
            r5 = r9
            if (r0 != 0) goto L_0x01fd
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r1 = 466(0x1d2, float:6.53E-43)
            java.lang.String r5 = "b"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r5, (int) r1, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: Queried device details links but did not include address."
            r0.a((java.lang.String) r1)
            return r4
        L_0x01fd:
            anml r1 = defpackage.anml.g
            byte[] r4 = r1.b((java.lang.CharSequence) r0)
            mtp r0 = b(r17, r18)
            r7 = 0
            r1 = r16
            r2 = r17
            r3 = r0
            r5 = r7
            r6 = r19
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (byte[]) r4, (java.lang.String) r5, (defpackage.avbh) r6)
            androidx.slice.Slice r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.b(android.content.Context, android.net.Uri, avbh):androidx.slice.Slice");
    }

    private final mts c() {
        mts mts = this.b;
        if (mts != null) {
            return mts;
        }
        if (getContext() == null) {
            ((anih) ((anih) mte.a.c()).a("mtk", "c", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: getServiceBindHelper got null context ");
            return null;
        }
        mts mts2 = new mts(getContext(), arwg.a("FastPairSliceProvider"), new mtg(this));
        this.b = mts2;
        return mts2;
    }

    private static boolean e(Uri uri) {
        return aymt.a.a().as().equals(uri.getQueryParameter("caller"));
    }

    public final boolean a() {
        return true;
    }

    private static Bitmap a(Context context, int i) {
        Drawable a2 = kf.a(context, i);
        Bitmap createBitmap = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        a2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        a2.draw(canvas);
        return createBitmap;
    }

    static Uri a(String str, String str2, String str3) {
        return new Uri.Builder().scheme("content").authority(str3).appendPath(str).appendQueryParameter("addr", str2).build();
    }

    private final Slice a(Context context, Uri uri) {
        IconCompat iconCompat;
        int i;
        String str;
        Context context2 = context;
        String str2 = "mtk";
        if (this.a.isEmpty()) {
            ((anih) ((anih) mte.a.d()).a(str2, "a", 310, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Nothing found from discoveryListItem");
            return null;
        }
        List list = this.a;
        int size = list.size();
        DiscoveryListItem discoveryListItem = null;
        int i2 = 0;
        while (i2 < size) {
            DiscoveryListItem discoveryListItem2 = (DiscoveryListItem) list.get(i2);
            if (discoveryListItem2 == null) {
                str = str2;
            } else if (avbx.NEARBY_DEVICE.equals(discoveryListItem2.l)) {
                if (discoveryListItem != null) {
                    if (!discoveryListItem2.a()) {
                        str = str2;
                    } else if (discoveryListItem.a()) {
                        str = str2;
                        if (discoveryListItem2.n >= discoveryListItem.n) {
                        }
                        discoveryListItem = discoveryListItem2;
                    }
                }
                str = str2;
                discoveryListItem = discoveryListItem2;
            } else {
                str = str2;
            }
            i2++;
            str2 = str;
        }
        String str3 = str2;
        if (discoveryListItem == null) {
            ((anih) ((anih) mte.a.d()).a(str3, "a", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Nothing found from discoveryListItem");
            return null;
        }
        mtp a2 = mtp.a(context, uri);
        Bitmap bitmap = discoveryListItem.j;
        if (bitmap != null) {
            iconCompat = IconCompat.a(bitmap);
        } else {
            if (!jkr.c()) {
                i = R.drawable.discovery_link_notification;
            } else {
                i = R.drawable.quantum_ic_link_grey600_24;
            }
            iconCompat = IconCompat.a(context2, i);
        }
        a2.a(PendingIntent.getService(context2, 0, discoveryListItem.i, 134217728), iconCompat, discoveryListItem.b, context2.getString(R.string.common_tap_to_pair), false);
        return a2.a();
    }

    private final Slice a(Context context, Uri uri, avbh avbh) {
        mts c2 = c();
        if (c2 == null) {
            ((anih) ((anih) mte.a.c()).a("mtk", "a", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: createOtaSlice can't get ServiceBindHelper.");
            return null;
        }
        aorr b2 = c2.b();
        if (b2 != null) {
            try {
                List<DiscoveryListItem> list = (List) b2.get(aymt.x(), TimeUnit.MILLISECONDS);
                if (list != null && !list.isEmpty()) {
                    ((anih) ((anih) mte.a.d()).a("mtk", "a", 387, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Got %d firmware updatable items.", list.size());
                    mtp a2 = mtp.a(context, uri);
                    for (DiscoveryListItem discoveryListItem : list) {
                        String str = discoveryListItem.f;
                        if (str == null) {
                            ((anih) ((anih) mte.a.d()).a("mtk", "a", 392, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Skip adding unknown package for ota slice.");
                        } else {
                            Context context2 = context;
                            mtp mtp = a2;
                            mtp.a(a(context, str, avbh, discoveryListItem.o, (byte[]) null, arwx.b(context, str), context.getPackageManager().getLaunchIntentForPackage(discoveryListItem.f)), IconCompat.a(discoveryListItem.j), discoveryListItem.b, discoveryListItem.c, false);
                        }
                    }
                    return a2.a();
                }
                ((anih) ((anih) mte.a.d()).a("mtk", "a", 383, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: FirmwareUpdatableItems is empty.");
                return null;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                anih anih = (anih) mte.a.c();
                anih.a(e);
                ((anih) anih.a("mtk", "a", 377, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Meet exception when getting FirmwareUpdatableItems.");
                return null;
            }
        } else {
            ((anih) ((anih) mte.a.c()).a("mtk", "a", 368, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: getFirmwareUpdatableItemFuture is null!");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014e, code lost:
        if (defpackage.aymw.a.ad().bj() == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01aa, code lost:
        if (r12.a(r8.c, a("settings_slice", r10, r0), new defpackage.mti(r16, new java.util.concurrent.atomic.AtomicInteger(150), r13, r20, r19, r11)) == false) goto L_0x01ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.slice.Slice a(android.content.Context r17, android.net.Uri r18, java.lang.String r19, defpackage.avbh r20) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            mts r0 = r16.c()
            r1 = 0
            java.lang.String r2 = "mtk"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 != 0) goto L_0x0029
            jjg r0 = defpackage.mte.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 477(0x1dd, float:6.68E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper."
            r0.a((java.lang.String) r2)
            return r1
        L_0x0029:
            com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks r11 = r0.b((java.lang.String) r10)     // Catch:{ RemoteException -> 0x01b8 }
            if (r11 != 0) goto L_0x0045
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r5 = 490(0x1ea, float:6.87E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPairSlice: No data found for deviceDetailsLinks."
            r0.a((java.lang.String) r2)
            return r1
        L_0x0045:
            mtp r12 = b(r17, r18)
            aoe r0 = r8.c
            if (r0 != 0) goto L_0x0057
            android.content.Context r0 = r16.getContext()
            aoe r0 = defpackage.aoe.a((android.content.Context) r0)
            r8.c = r0
        L_0x0057:
            java.lang.String r0 = r11.f()
            java.lang.String r5 = r11.g()
            java.lang.String r6 = r11.c()
            java.lang.String r13 = defpackage.mtu.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0073
            java.lang.String r0 = defpackage.aymt.r()
            r6 = r0
            goto L_0x0086
        L_0x0073:
            java.lang.String r6 = defpackage.aymt.r()
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0085
            boolean r6 = defpackage.aymw.Z()
            if (r6 != 0) goto L_0x0085
            r6 = r1
            goto L_0x0086
        L_0x0085:
            r6 = r0
        L_0x0086:
            java.lang.String r0 = defpackage.aymt.r()
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x011d
            boolean r0 = defpackage.aymw.Z()
            if (r0 != 0) goto L_0x0098
            goto L_0x011d
        L_0x0098:
            if (r5 != 0) goto L_0x009d
            r0 = r1
            goto L_0x011e
        L_0x009d:
            if (r13 == 0) goto L_0x011b
            android.content.pm.PackageManager r0 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0101 }
            r7 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r13, r7)     // Catch:{ NameNotFoundException -> 0x0101 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0101 }
            int r0 = r0.length     // Catch:{ NameNotFoundException -> 0x0101 }
            r7 = 1
            if (r0 != r7) goto L_0x00eb
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ NameNotFoundException -> 0x0101 }
            java.lang.String r0 = r5.toUpperCase(r0)     // Catch:{ NameNotFoundException -> 0x0101 }
            java.lang.String r5 = "SHA-256"
            java.lang.String r5 = defpackage.jhg.b(r9, r13, r5)     // Catch:{ NameNotFoundException -> 0x0101 }
            boolean r0 = r0.equals(r5)     // Catch:{ NameNotFoundException -> 0x0101 }
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "discovery_shared_pref"
            r5 = 4
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r5)     // Catch:{ NameNotFoundException -> 0x0101 }
            java.lang.String r5 = "nearby_debug_mode"
            boolean r7 = defpackage.aymq.c()     // Catch:{ NameNotFoundException -> 0x0101 }
            boolean r0 = r0.getBoolean(r5, r7)     // Catch:{ NameNotFoundException -> 0x0101 }
            if (r0 != 0) goto L_0x011d
            jjg r0 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0101 }
            anie r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x0101 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0101 }
            r5 = 534(0x216, float:7.48E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ NameNotFoundException -> 0x0101 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0101 }
            java.lang.String r5 = "Does not show slice signature, hash does not match what is registered in the console"
            r0.a((java.lang.String) r5)     // Catch:{ NameNotFoundException -> 0x0101 }
            r0 = r1
            goto L_0x011e
        L_0x00eb:
            jjg r0 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0101 }
            anie r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x0101 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0101 }
            r5 = 525(0x20d, float:7.36E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ NameNotFoundException -> 0x0101 }
            anih r0 = (defpackage.anih) r0     // Catch:{ NameNotFoundException -> 0x0101 }
            java.lang.String r5 = "Does not show slice since companion app has more than one signature"
            r0.a((java.lang.String) r5)     // Catch:{ NameNotFoundException -> 0x0101 }
            goto L_0x011b
        L_0x0101:
            r0 = move-exception
            jjg r1 = defpackage.mte.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            r0 = 541(0x21d, float:7.58E-43)
            anie r0 = r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r0, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Fail to verify the app's signature package name: %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r13)
            goto L_0x011d
        L_0x011b:
            r0 = r1
            goto L_0x011e
        L_0x011d:
            r0 = r6
        L_0x011e:
            if (r0 == 0) goto L_0x0150
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 100
            r3.<init>(r1)
            aoe r14 = r8.c
            java.lang.String r1 = "oobe_slice"
            android.net.Uri r15 = a((java.lang.String) r1, (java.lang.String) r10, (java.lang.String) r0)
            mth r7 = new mth
            r1 = r7
            r2 = r16
            r4 = r13
            r5 = r20
            r6 = r19
            r9 = r7
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r1 = r12.a(r14, r15, r9)
            if (r1 == 0) goto L_0x0150
            aymw r1 = defpackage.aymw.a
            aymx r1 = r1.a()
            boolean r1 = r1.bj()
            if (r1 == 0) goto L_0x015d
        L_0x0150:
            r1 = r16
            r2 = r17
            r3 = r12
            r4 = r11
            r5 = r19
            r6 = r20
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks) r4, (java.lang.String) r5, (defpackage.avbh) r6)
        L_0x015d:
            byte[] r4 = r11.a()
            r1 = r16
            r2 = r17
            r3 = r12
            r5 = r19
            r6 = r20
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (byte[]) r4, (java.lang.String) r5, (defpackage.avbh) r6)
            boolean r1 = e(r18)
            if (r1 != 0) goto L_0x01b3
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x01ac
            java.lang.String r1 = defpackage.aymt.r()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0189
            boolean r1 = defpackage.jix.f(r17)
            if (r1 == 0) goto L_0x01ac
        L_0x0189:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 150(0x96, float:2.1E-43)
            r3.<init>(r1)
            aoe r9 = r8.c
            java.lang.String r1 = "settings_slice"
            android.net.Uri r0 = a((java.lang.String) r1, (java.lang.String) r10, (java.lang.String) r0)
            mti r14 = new mti
            r1 = r14
            r2 = r16
            r4 = r13
            r5 = r20
            r6 = r19
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r0 = r12.a(r9, r0, r14)
            if (r0 != 0) goto L_0x01b3
        L_0x01ac:
            r1 = r17
            r2 = r20
            r8.a((android.content.Context) r1, (defpackage.mtp) r12, (com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks) r11, (defpackage.avbh) r2)
        L_0x01b3:
            androidx.slice.Slice r0 = r12.a()
            return r0
        L_0x01b8:
            r0 = move-exception
            jjg r0 = defpackage.mte.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 486(0x1e6, float:6.81E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPairSlice: RemoteException when getting DeviceDetailsLinks."
            r0.a((java.lang.String) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.a(android.content.Context, android.net.Uri, java.lang.String, avbh):androidx.slice.Slice");
    }

    private static mtp b(Context context, Uri uri) {
        if (!jkr.b()) {
            return mtp.a(context, uri);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 16974371);
        TypedValue typedValue = new TypedValue();
        contextThemeWrapper.getTheme().resolveAttribute(16843817, typedValue, true);
        int color = contextThemeWrapper.getColor(typedValue.resourceId);
        mtp a2 = mtp.a(context, uri);
        a2.a(color);
        return a2;
    }

    public final void b(Uri uri) {
        jjg jjg = mte.a;
        uri.toString();
        a(uri, false);
    }

    public static void a(Context context, String str) {
        context.getContentResolver().notifyChange(aryo.a(str), (ContentObserver) null);
        if ("links".equals(str)) {
            context.getContentResolver().notifyChange(aryo.a, (ContentObserver) null);
        }
    }

    private final void a(Context context, mtp mtp, DeviceDetailsLinks deviceDetailsLinks, avbh avbh) {
        boolean z;
        String str;
        String str2;
        Context context2 = context;
        if (!aymw.a.a().y()) {
            ((anih) ((anih) mte.a.d()).a("mtk", "a", 681, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Companion app slice disabled.");
            return;
        }
        String c2 = deviceDetailsLinks.c();
        if (c2 == null || c2.isEmpty()) {
            ((anih) ((anih) mte.a.d()).a("mtk", "a", 687, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: No actionUrl for this device.");
            return;
        }
        String b2 = aryo.b(c2);
        if (b2 == null || b2.isEmpty()) {
            ((anih) ((anih) mte.a.d()).a("mtk", "a", 694, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: No companion app for device.");
            return;
        }
        String b3 = arwx.b(getContext(), b2);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(b2);
        PendingIntent a2 = a(context, b2, avbh, deviceDetailsLinks.d(), deviceDetailsLinks.a(), b3, launchIntentForPackage);
        if (launchIntentForPackage == null || TextUtils.isEmpty(b3)) {
            z = false;
        } else {
            z = true;
        }
        boolean e = deviceDetailsLinks.e();
        if (!z) {
            if (!e) {
                str2 = context2.getString(R.string.fast_pair_slice_install_companion_without_firmware_title);
            } else {
                str2 = context2.getString(R.string.common_firmware_update);
            }
            str = context2.getString(R.string.fast_pair_slice_install_companion_without_firmware_description);
        } else if (!e) {
            str2 = context2.getString(R.string.fast_pair_slice_open_companion_without_firmware_title, new Object[]{b3});
            str = context2.getString(R.string.fast_pair_slice_open_companion_without_firmware_description);
        } else {
            String string = context2.getString(R.string.common_firmware_update);
            str = context2.getString(R.string.fast_pair_slice_open_companion_with_firmware_description, new Object[]{b3});
            str2 = string;
        }
        mtj mtj = new mtj(str2, str);
        IconCompat a3 = IconCompat.a(a(context2, (int) R.drawable.quantum_ic_open_in_new_vd_theme_24));
        a3.a(-16777216);
        mtp.a(a2, a3, mtj.a, mtj.b, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (r0.isConnected() != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r18, defpackage.mtp r19, com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks r20, java.lang.String r21, defpackage.avbh r22) {
        /*
            r17 = this;
            r7 = r18
            r4 = r21
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.j()
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "mtk"
            if (r0 != 0) goto L_0x002c
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 837(0x345, float:1.173E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: Assistant slice disabled."
            r0.a((java.lang.String) r1)
            return
        L_0x002c:
            boolean r0 = r20.b()
            if (r0 == 0) goto L_0x030f
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.bi()
            if (r0 != 0) goto L_0x0093
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r0 != 0) goto L_0x005a
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 937(0x3a9, float:1.313E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r4 = "FastPairSlice: BluetoothAdapter not found."
            r0.a((java.lang.String) r4)
            goto L_0x007d
        L_0x005a:
            android.bluetooth.BluetoothDevice r0 = r0.getRemoteDevice(r4)
            if (r0 != 0) goto L_0x0076
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r5 = 943(0x3af, float:1.321E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r5, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = "FastPairSlice: BluetoothAdapter remote device %s not found."
            r0.a((java.lang.String) r5, (java.lang.Object) r4)
            goto L_0x007d
        L_0x0076:
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 848(0x350, float:1.188E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: Assistant settings not shown because not connected."
            r0.a((java.lang.String) r1)
            return
        L_0x0093:
            android.content.Context r0 = r17.getContext()
            java.lang.String r5 = defpackage.aymt.c()
            boolean r0 = defpackage.arwx.a((android.content.Context) r0, (java.lang.String) r5)
            if (r0 == 0) goto L_0x02f9
            android.content.Intent r6 = new android.content.Intent
            auci r0 = defpackage.bia.d
            r8 = 1
            r5 = 0
            if (r4 == 0) goto L_0x00c8
            bia r9 = defpackage.bia.c
            aucd r9 = r9.o()
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            r9.c()
            r9.c = r5
        L_0x00b9:
            aucj r10 = r9.b
            bia r10 = (defpackage.bia) r10
            r21.getClass()
            int r11 = r10.a
            r11 = r11 | r8
            r10.a = r11
            r10.b = r4
            goto L_0x00ce
        L_0x00c8:
            bia r9 = defpackage.bia.c
            aucd r9 = r9.o()
        L_0x00ce:
            aucj r9 = r9.i()
            bia r9 = (defpackage.bia) r9
            aelc r10 = defpackage.aelc.f
            aucd r10 = r10.o()
            aeky r11 = defpackage.aeky.c
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            r11.c()
            r11.c = r5
        L_0x00ea:
            aucj r12 = r11.b
            aeky r12 = (defpackage.aeky) r12
            java.lang.String r13 = "https://www.google.com"
            r13.getClass()
            int r14 = r12.a
            r14 = r14 | r8
            r12.a = r14
            r12.b = r13
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            r10.c()
            r10.c = r5
        L_0x0104:
            aucj r12 = r10.b
            aelc r12 = (defpackage.aelc) r12
            aucj r11 = r11.i()
            aeky r11 = (defpackage.aeky) r11
            r11.getClass()
            r12.e = r11
            int r11 = r12.a
            r11 = r11 | 8
            r12.a = r11
            aelb r11 = defpackage.aelb.a
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0124
            goto L_0x0129
        L_0x0124:
            r11.c()
            r11.c = r5
        L_0x0129:
            aucj r12 = r11.b
            aelb r12 = (defpackage.aelb) r12
            defpackage.aelb.a(r12)
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0135
            goto L_0x013a
        L_0x0135:
            r10.c()
            r10.c = r5
        L_0x013a:
            aucj r12 = r10.b
            aelc r12 = (defpackage.aelc) r12
            aucj r11 = r11.i()
            aelb r11 = (defpackage.aelb) r11
            r11.getClass()
            r12.b = r11
            int r11 = r12.a
            r11 = r11 | r8
            r12.a = r11
            aela r11 = defpackage.aela.a
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r11.c()
            r11.c = r5
        L_0x015e:
            aucj r12 = r11.b
            aela r12 = (defpackage.aela) r12
            defpackage.aela.a(r12)
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x016a
            goto L_0x016f
        L_0x016a:
            r10.c()
            r10.c = r5
        L_0x016f:
            aucj r12 = r10.b
            aelc r12 = (defpackage.aelc) r12
            aucj r11 = r11.i()
            aela r11 = (defpackage.aela) r11
            r11.getClass()
            r12.c = r11
            int r11 = r12.a
            r13 = 2
            r11 = r11 | r13
            r12.a = r11
            aekz r11 = defpackage.aekz.c
            aucd r11 = r11.o()
            aeld r12 = defpackage.aeld.d
            aucd r12 = r12.o()
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0195
            goto L_0x019a
        L_0x0195:
            r12.c()
            r12.c = r5
        L_0x019a:
            aucj r14 = r12.b
            aeld r14 = (defpackage.aeld) r14
            r15 = 9
            r14.b = r15
            int r15 = r14.a
            r15 = r15 | r8
            r14.a = r15
            bhz r14 = defpackage.bhz.a
            aucd r14 = r14.o()
            aucf r14 = (defpackage.aucf) r14
            auci r15 = defpackage.bib.a
            bic r16 = defpackage.bic.a
            aucd r16 = r16.o()
            r8 = r16
            aucf r8 = (defpackage.aucf) r8
            r8.a(r0, r9)
            aucj r0 = r8.i()
            bic r0 = (defpackage.bic) r0
            r14.a(r15, r0)
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x01cc
            goto L_0x01d1
        L_0x01cc:
            r12.c()
            r12.c = r5
        L_0x01d1:
            aucj r0 = r12.b
            aeld r0 = (defpackage.aeld) r0
            aucj r8 = r14.i()
            bhz r8 = (defpackage.bhz) r8
            r8.getClass()
            r0.c = r8
            int r8 = r0.a
            r8 = r8 | r13
            r0.a = r8
            boolean r0 = r11.c
            if (r0 != 0) goto L_0x01ea
            goto L_0x01ef
        L_0x01ea:
            r11.c()
            r11.c = r5
        L_0x01ef:
            aucj r0 = r11.b
            aekz r0 = (defpackage.aekz) r0
            aucj r8 = r12.i()
            aeld r8 = (defpackage.aeld) r8
            r8.getClass()
            r0.b = r8
            r0.a = r13
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0205
            goto L_0x020a
        L_0x0205:
            r10.c()
            r10.c = r5
        L_0x020a:
            aucj r0 = r10.b
            aelc r0 = (defpackage.aelc) r0
            aucj r8 = r11.i()
            aekz r8 = (defpackage.aekz) r8
            r8.getClass()
            r0.d = r8
            int r8 = r0.a
            r8 = r8 | 4
            r0.a = r8
            aucj r0 = r10.i()
            aelc r0 = (defpackage.aelc) r0
            aelf r8 = defpackage.aelf.c
            aucd r8 = r8.o()
            byte[] r0 = r0.k()
            auay r0 = defpackage.auay.a((byte[]) r0)
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x0238
            goto L_0x023d
        L_0x0238:
            r8.c()
            r8.c = r5
        L_0x023d:
            aucj r5 = r8.b
            aelf r5 = (defpackage.aelf) r5
            r0.getClass()
            int r9 = r5.a
            r9 = r9 | r13
            r5.a = r9
            r5.b = r0
            anml r0 = defpackage.anml.f
            anml r0 = r0.a()
            aucj r5 = r8.i()
            aelf r5 = (defpackage.aelf) r5
            byte[] r5 = r5.k()
            java.lang.String r0 = r0.a((byte[]) r5)
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r8 = "googleapp"
            android.net.Uri$Builder r5 = r5.scheme(r8)
            java.lang.String r8 = "deeplink"
            android.net.Uri$Builder r5 = r5.authority(r8)
            java.lang.String r8 = "/"
            android.net.Uri$Builder r5 = r5.path(r8)
            java.lang.String r8 = "data"
            android.net.Uri$Builder r0 = r5.appendQueryParameter(r8, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r5 = "android.intent.action.VIEW"
            r6.<init>(r5, r0)
            android.content.pm.PackageManager r0 = r18.getPackageManager()
            android.content.ComponentName r0 = r6.resolveActivity(r0)
            if (r0 != 0) goto L_0x02a5
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 863(0x35f, float:1.21E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: No resolveActivity for assistant deep link."
            r0.a((java.lang.String) r1)
            return
        L_0x02a5:
            boolean r0 = defpackage.aymz.b()
            if (r0 != 0) goto L_0x02af
            r0 = 2131952651(0x7f13040b, float:1.954175E38)
            goto L_0x02b2
        L_0x02af:
            r0 = 2131952652(0x7f13040c, float:1.9541753E38)
        L_0x02b2:
            java.lang.String r10 = r7.getString(r0)
            asom r1 = defpackage.asom.FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED
            java.lang.String r2 = defpackage.aymt.c()
            byte[] r5 = r20.a()
            r0 = r18
            r3 = r22
            r4 = r21
            android.content.Intent r0 = defpackage.arza.a(r0, r1, r2, r3, r4, r5, r6)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r2 = 1
            android.app.PendingIntent r8 = android.app.PendingIntent.getService(r7, r2, r0, r1)
            r0 = 2131231949(0x7f0804cd, float:1.8079993E38)
            android.graphics.Bitmap r0 = a((android.content.Context) r7, (int) r0)
            android.support.v4.graphics.drawable.IconCompat r9 = android.support.v4.graphics.drawable.IconCompat.a((android.graphics.Bitmap) r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.a((int) r0)
            boolean r0 = defpackage.aymz.b()
            if (r0 != 0) goto L_0x02eb
            r0 = 2131952185(0x7f130239, float:1.9540806E38)
            goto L_0x02ee
        L_0x02eb:
            r0 = 2131952650(0x7f13040a, float:1.9541749E38)
        L_0x02ee:
            java.lang.String r11 = r7.getString(r0)
            r12 = 1
            r7 = r19
            r7.a(r8, r9, r10, r11, r12)
            return
        L_0x02f9:
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 859(0x35b, float:1.204E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: No assistant app is installed."
            r0.a((java.lang.String) r1)
            return
        L_0x030f:
            jjg r0 = defpackage.mte.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r4 = 842(0x34a, float:1.18E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairSlice: This item doesn't support assistant."
            r0.a((java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.a(android.content.Context, mtp, com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks, java.lang.String, avbh):void");
    }

    private final void a(Context context, mtp mtp, byte[] bArr, String str, avbh avbh) {
        Intent intent;
        Intent intent2;
        Context context2 = context;
        byte[] bArr2 = bArr;
        if (aymw.a.a().at()) {
            Context context3 = getContext();
            boolean bu = aymw.a.a().bu();
            boolean aF = aymw.a.a().aF();
            if (bu) {
                intent = new Intent("com.google.android.gms.nearby.fastpair.FINDDEVICE").addCategory("android.intent.category.DEFAULT").setFlags(268435456).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", bArr2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", avbh.e);
            } else {
                String str2 = str;
                avbh avbh2 = avbh;
                if (!aF) {
                    intent2 = null;
                } else if (aymw.a.a().av() || arwx.a(context3, "com.google.android.apps.adm")) {
                    intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("https").authority("www.google.com").appendPath("android").appendPath("find").appendQueryParameter("device", anml.g.a(bArr2)).build());
                } else {
                    intent2 = aryl.a(context3, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", "com.google.android.apps.adm").build()));
                }
                intent = intent2;
            }
            if (intent == null) {
                ((anih) ((anih) mte.a.d()).a("mtk", "a", 801, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Can't create Find My Device intent.");
                return;
            }
            ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
            if (resolveActivity == null) {
                ((anih) ((anih) mte.a.d()).a("mtk", "a", 806, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Can't resolve Find My Device activity.");
                return;
            }
            mtp mtp2 = mtp;
            mtp2.a(PendingIntent.getService(context, 0, arza.a(context, asom.FAST_PAIR_DEVICE_FIND_DEVICE_CLICKED, resolveActivity.getPackageName(), avbh, str, bArr, intent), 134217728), IconCompat.a(a(context, (int) R.drawable.quantum_gm_ic_fmd_good_vd_theme_24)), context.getString(R.string.fast_pair_find_device_title), context.getString(R.string.fast_pair_slice_find_device_description), true);
            return;
        }
        ((anih) ((anih) mte.a.d()).a("mtk", "a", 788, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Find device slice disabled.");
    }

    private final void a(Uri uri, boolean z) {
        mts c2 = c();
        if (c2 == null) {
            ((anih) ((anih) mte.a.c()).a("mtk", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: onPinStatusChanged.getServiceBindHelper return null");
            return;
        }
        jjg jjg = mte.a;
        uri.toString();
        if (z) {
            boolean a2 = c2.a(uri.getLastPathSegment());
            mtq mtq = new mtq(c2, "AutoUnpinRunnable", uri);
            synchronized (c2) {
                c2.b.put(uri.getLastPathSegment(), mtq);
                c2.a.a(mtq, aymt.a.a().aV());
            }
            if (!a2) {
                ((anih) ((anih) mte.a.d()).a("mts", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSlicePinned, pin slice, uri = %s", (Object) uri.toString());
                c2.a();
                return;
            }
            ((anih) ((anih) mte.a.d()).a("mts", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSlicePinned, slice already pinned, uri = %s", (Object) uri.toString());
            return;
        }
        c2.b(uri);
    }

    private static boolean a(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            ((anih) ((anih) mte.a.d()).a("mtk", "a", 937, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: BluetoothAdapter not found.");
            return false;
        }
        BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
        if (remoteDevice != null) {
            return remoteDevice.isConnected();
        }
        ((anih) ((anih) mte.a.d()).a("mtk", "a", 943, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: BluetoothAdapter remote device %s not found.", (Object) str);
        return false;
    }

    public final PendingIntent a(int i, asom asom, String str, avbh avbh, String str2, byte[] bArr, PendingIntent pendingIntent) {
        return PendingIntent.getService(getContext(), i, arza.a(getContext(), asom, str, avbh, str2, bArr, pendingIntent), 134217728);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r1 = r0;
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07c0, code lost:
        if (defpackage.jix.a.booleanValue() != false) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07e9, code lost:
        if (r15.a(r10, r14, r9) == false) goto L_0x07eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        android.os.StrictMode.setThreadPolicy(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x002b, B:28:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03b4 A[SYNTHETIC, Splitter:B:185:0x03b4] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0403 A[Catch:{ RemoteException -> 0x08fd, all -> 0x0984 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x041f A[Catch:{ RemoteException -> 0x08fd, all -> 0x0984 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x043c A[Catch:{ RemoteException -> 0x08fd, all -> 0x0984 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0792 A[Catch:{ RemoteException -> 0x08fd, all -> 0x0984 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.slice.Slice a(android.net.Uri r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            jjg r1 = defpackage.mte.a
            android.os.StrictMode$ThreadPolicy r10 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r10)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskReads()
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitDiskWrites()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0986 }
            boolean r1 = defpackage.aymw.y()     // Catch:{ all -> 0x0986 }
            java.lang.String r11 = "mtk"
            java.lang.String r12 = "a"
            java.lang.String r13 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r2 = 0
            if (r1 != 0) goto L_0x004a
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r3 = 143(0x8f, float:2.0E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r3, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "FastPairSlice: Slices disabled."
            r1.a((java.lang.String) r3)     // Catch:{ all -> 0x0044 }
            android.os.StrictMode.setThreadPolicy(r10)
            return r2
        L_0x0044:
            r0 = move-exception
            r1 = r0
            r25 = r10
            goto L_0x098a
        L_0x004a:
            hya r1 = r8.d     // Catch:{ all -> 0x0986 }
            if (r1 == 0) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0986 }
            hya r1 = defpackage.hya.a((android.content.Context) r1)     // Catch:{ all -> 0x0986 }
            r8.d = r1     // Catch:{ all -> 0x0986 }
        L_0x0059:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0986 }
            hya r3 = r8.d     // Catch:{ all -> 0x0986 }
            r3.getClass()     // Catch:{ all -> 0x0986 }
            mtf r4 = new mtf     // Catch:{ all -> 0x0986 }
            r4.<init>(r3)     // Catch:{ all -> 0x0986 }
            java.lang.String r3 = "arwx"
            int r5 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0986 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 == r6) goto L_0x010a
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ all -> 0x0044 }
            int r6 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0044 }
            java.lang.String[] r5 = r5.getPackagesForUid(r6)     // Catch:{ all -> 0x0044 }
            if (r5 != 0) goto L_0x0081
            goto L_0x00ed
        L_0x0081:
            int r6 = r5.length     // Catch:{ all -> 0x0044 }
            if (r6 <= 0) goto L_0x00ed
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.getThreadPolicy()     // Catch:{ all -> 0x0044 }
            android.os.StrictMode$ThreadPolicy$Builder r15 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x0044 }
            r15.<init>(r7)     // Catch:{ all -> 0x0044 }
            android.os.StrictMode$ThreadPolicy$Builder r15 = r15.permitCustomSlowCalls()     // Catch:{ all -> 0x0044 }
            android.os.StrictMode$ThreadPolicy r15 = r15.build()     // Catch:{ all -> 0x0044 }
            android.os.StrictMode.setThreadPolicy(r15)     // Catch:{ all -> 0x0044 }
            r15 = 0
        L_0x0099:
            if (r15 >= r6) goto L_0x00cd
            r14 = r5[r15]     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ all -> 0x00c7 }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00c2
            java.lang.String r2 = defpackage.aymt.s()     // Catch:{ all -> 0x00c7 }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00b2
            goto L_0x00be
        L_0x00b2:
            boolean r2 = r4.a(r14)     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00be
            avbh r1 = defpackage.avbh.GOOGLE_APPS     // Catch:{ all -> 0x00c7 }
        L_0x00ba:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0044 }
            goto L_0x00c5
        L_0x00be:
            int r15 = r15 + 1
            r2 = 0
            goto L_0x0099
        L_0x00c2:
            avbh r1 = defpackage.avbh.GMS_SETTINGS     // Catch:{ all -> 0x00c7 }
            goto L_0x00ba
        L_0x00c5:
            r14 = r1
            goto L_0x010d
        L_0x00c7:
            r0 = move-exception
            r1 = r0
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0044 }
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x00cd:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0044 }
            aryq r1 = defpackage.aryq.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 104(0x68, float:1.46E-43)
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "CommonUtils: uid:%d is not whitelisted and google signed"
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0044 }
            r1.a((java.lang.String) r2, (int) r3)     // Catch:{ all -> 0x0044 }
            avbh r1 = defpackage.avbh.ENTRY_POINT_UNKNOWN     // Catch:{ all -> 0x0044 }
            r14 = r1
            goto L_0x010d
        L_0x00ed:
            aryq r1 = defpackage.aryq.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 81
            anie r1 = r1.a((java.lang.String) r3, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "CommonUtils: can't find package for uid:%d"
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0044 }
            r1.a((java.lang.String) r2, (int) r3)     // Catch:{ all -> 0x0044 }
            avbh r1 = defpackage.avbh.ENTRY_POINT_UNKNOWN     // Catch:{ all -> 0x0044 }
            r14 = r1
            goto L_0x010d
        L_0x010a:
            avbh r1 = defpackage.avbh.BLUETOOTH_SETTINGS     // Catch:{ all -> 0x0986 }
            r14 = r1
        L_0x010d:
            avbh r1 = defpackage.avbh.ENTRY_POINT_UNKNOWN     // Catch:{ all -> 0x0986 }
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x0986 }
            if (r1 == 0) goto L_0x0133
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 153(0x99, float:2.14E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "FastPairSlice: not allow access from uid:%d"
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0044 }
            r1.a((java.lang.String) r2, (int) r3)     // Catch:{ all -> 0x0044 }
        L_0x012e:
            android.os.StrictMode.setThreadPolicy(r10)
            r1 = 0
            return r1
        L_0x0133:
            r15 = 1
            r8.a((android.net.Uri) r9, (boolean) r15)     // Catch:{ all -> 0x0986 }
            java.lang.String r1 = r31.getLastPathSegment()     // Catch:{ all -> 0x0986 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0986 }
            r3 = 3
            r7 = 4
            r6 = 2
            r4 = -1
            switch(r2) {
                case -84929608: goto L_0x0170;
                case 102977465: goto L_0x0166;
                case 818461222: goto L_0x015c;
                case 1128144081: goto L_0x0152;
                case 1561212112: goto L_0x0148;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x0179
        L_0x0148:
            java.lang.String r2 = "device_status_list_item"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0147
            r4 = 1
            goto L_0x0179
        L_0x0152:
            java.lang.String r2 = "pair_header_suggestion"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0147
            r4 = 2
            goto L_0x0179
        L_0x015c:
            java.lang.String r2 = "method_bind_service_for_discovery_item"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0147
            r4 = 3
            goto L_0x0179
        L_0x0166:
            java.lang.String r2 = "links"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0147
            r4 = 0
            goto L_0x0179
        L_0x0170:
            java.lang.String r2 = "ota_contextual_cards"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0147
            r4 = 4
        L_0x0179:
            r5 = 134217728(0x8000000, float:3.85186E-34)
            if (r4 == 0) goto L_0x027f
            if (r4 == r15) goto L_0x01ab
            if (r4 == r6) goto L_0x01ab
            if (r4 == r3) goto L_0x0193
            if (r4 == r7) goto L_0x0186
            goto L_0x012e
        L_0x0186:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0044 }
            androidx.slice.Slice r2 = r8.a((android.content.Context) r1, (android.net.Uri) r9, (defpackage.avbh) r14)     // Catch:{ all -> 0x0044 }
            r7 = r9
            r25 = r10
            goto L_0x096b
        L_0x0193:
            java.lang.String r1 = "is_bind"
            java.lang.String r1 = r9.getQueryParameter(r1)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0044 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0044 }
            mts r2 = r30.c()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x012e
            r2.a((boolean) r1)     // Catch:{ all -> 0x0044 }
            goto L_0x012e
        L_0x01ab:
            r1 = 0
            android.content.Context r2 = r30.getContext()     // Catch:{ all -> 0x0044 }
            java.util.List r3 = r8.a     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "FastPairSlice: Nothing found from discoveryListItem"
            if (r3 == 0) goto L_0x01d3
            jjg r2 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0044 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0044 }
            r3 = 310(0x136, float:4.34E-43)
            anie r2 = r2.a((java.lang.String) r11, (java.lang.String) r12, (int) r3, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0044 }
            r2.a((java.lang.String) r4)     // Catch:{ all -> 0x0044 }
            r2 = r1
            r7 = r9
            r25 = r10
            goto L_0x096b
        L_0x01d3:
            java.util.List r3 = r8.a     // Catch:{ all -> 0x0044 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0044 }
            r6 = r1
        L_0x01da:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x021b
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0044 }
            com.google.location.nearby.common.fastpair.DiscoveryListItem r7 = (com.google.location.nearby.common.fastpair.DiscoveryListItem) r7     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x0215
            avbx r14 = defpackage.avbx.NEARBY_DEVICE     // Catch:{ all -> 0x0044 }
            avbx r15 = r7.l     // Catch:{ all -> 0x0044 }
            boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x0044 }
            if (r14 == 0) goto L_0x0212
            if (r6 == 0) goto L_0x020e
            boolean r14 = r7.a()     // Catch:{ all -> 0x0044 }
            if (r14 == 0) goto L_0x020b
            boolean r14 = r6.a()     // Catch:{ all -> 0x0044 }
            if (r14 == 0) goto L_0x020e
            double r14 = r7.n     // Catch:{ all -> 0x0044 }
            r17 = r2
            double r1 = r6.n     // Catch:{ all -> 0x0044 }
            int r18 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r18 >= 0) goto L_0x0217
            goto L_0x0210
        L_0x020b:
            r17 = r2
            goto L_0x0217
        L_0x020e:
            r17 = r2
        L_0x0210:
            r6 = r7
            goto L_0x0217
        L_0x0212:
            r17 = r2
            goto L_0x0217
        L_0x0215:
            r17 = r2
        L_0x0217:
            r2 = r17
            r1 = 0
            goto L_0x01da
        L_0x021b:
            r17 = r2
            if (r6 != 0) goto L_0x0238
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 324(0x144, float:4.54E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r1.a((java.lang.String) r4)     // Catch:{ all -> 0x0044 }
            r7 = r9
            r25 = r10
            r2 = 0
            goto L_0x096b
        L_0x0238:
            r1 = r17
            mtp r2 = defpackage.mtp.a(r1, r9)     // Catch:{ all -> 0x0044 }
            android.graphics.Bitmap r3 = r6.j     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x0256
            boolean r3 = defpackage.jkr.c()     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x024c
            r3 = 2131231120(0x7f080190, float:1.8078312E38)
            goto L_0x024f
        L_0x024c:
            r3 = 2131231973(0x7f0804e5, float:1.8080042E38)
        L_0x024f:
            android.support.v4.graphics.drawable.IconCompat r3 = android.support.v4.graphics.drawable.IconCompat.a((android.content.Context) r1, (int) r3)     // Catch:{ all -> 0x0044 }
            r18 = r3
            goto L_0x025c
        L_0x0256:
            android.support.v4.graphics.drawable.IconCompat r3 = android.support.v4.graphics.drawable.IconCompat.a((android.graphics.Bitmap) r3)     // Catch:{ all -> 0x0044 }
            r18 = r3
        L_0x025c:
            android.content.Intent r3 = r6.i     // Catch:{ all -> 0x0044 }
            r4 = 0
            android.app.PendingIntent r17 = android.app.PendingIntent.getService(r1, r4, r3, r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r6.b     // Catch:{ all -> 0x0044 }
            r4 = 2131952329(0x7f1302c9, float:1.9541098E38)
            java.lang.String r20 = r1.getString(r4)     // Catch:{ all -> 0x0044 }
            r21 = 0
            r16 = r2
            r19 = r3
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0044 }
            androidx.slice.Slice r2 = r2.a()     // Catch:{ all -> 0x0044 }
            r7 = r9
            r25 = r10
            goto L_0x096b
        L_0x027f:
            android.content.Context r4 = r30.getContext()     // Catch:{ all -> 0x0986 }
            java.lang.String r1 = "b"
            java.lang.String r2 = "address"
            java.lang.String r3 = r9.getQueryParameter(r2)     // Catch:{ all -> 0x0986 }
            java.lang.String r2 = "account_key"
            java.lang.String r2 = r9.getQueryParameter(r2)     // Catch:{ all -> 0x0986 }
            boolean r17 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0986 }
            if (r17 != 0) goto L_0x0919
            mts r1 = r30.c()     // Catch:{ all -> 0x0986 }
            if (r1 != 0) goto L_0x02b8
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 477(0x1dd, float:6.68E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "FastPairSlice: createDeviceDetailsLinksSlice can't get ServiceBindHelper."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0044 }
            r7 = r9
            r25 = r10
            r2 = 0
            goto L_0x0953
        L_0x02b8:
            com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks r24 = r1.b((java.lang.String) r3)     // Catch:{ RemoteException -> 0x08fd }
            if (r24 != 0) goto L_0x02d9
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            r2 = 490(0x1ea, float:6.87E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "FastPairSlice: No data found for deviceDetailsLinks."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0044 }
            r7 = r9
            r25 = r10
            r2 = 0
            goto L_0x0953
        L_0x02d9:
            mtp r2 = b(r4, r9)     // Catch:{ all -> 0x0986 }
            aoe r1 = r8.c     // Catch:{ all -> 0x0986 }
            if (r1 == 0) goto L_0x02e2
            goto L_0x02ec
        L_0x02e2:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0986 }
            aoe r1 = defpackage.aoe.a((android.content.Context) r1)     // Catch:{ all -> 0x0986 }
            r8.c = r1     // Catch:{ all -> 0x0986 }
        L_0x02ec:
            java.lang.String r1 = r24.f()     // Catch:{ all -> 0x0986 }
            java.lang.String r5 = r24.g()     // Catch:{ all -> 0x0986 }
            java.lang.String r18 = r24.c()     // Catch:{ all -> 0x0986 }
            java.lang.String r7 = defpackage.mtu.a(r18)     // Catch:{ all -> 0x0986 }
            boolean r18 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0986 }
            if (r18 != 0) goto L_0x0315
            java.lang.String r6 = defpackage.aymt.r()     // Catch:{ all -> 0x0044 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x030d
            goto L_0x0319
        L_0x030d:
            boolean r6 = defpackage.aymw.Z()     // Catch:{ all -> 0x0044 }
            if (r6 != 0) goto L_0x0319
            r1 = 0
            goto L_0x0319
        L_0x0315:
            java.lang.String r1 = defpackage.aymt.r()     // Catch:{ all -> 0x0986 }
        L_0x0319:
            java.lang.String r6 = defpackage.aymt.r()     // Catch:{ all -> 0x0986 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0986 }
            if (r6 == 0) goto L_0x0325
            goto L_0x03b1
        L_0x0325:
            boolean r6 = defpackage.aymw.Z()     // Catch:{ all -> 0x0986 }
            if (r6 == 0) goto L_0x03b1
            if (r5 != 0) goto L_0x0330
            r15 = 0
            goto L_0x03b2
        L_0x0330:
            if (r7 == 0) goto L_0x03af
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0394 }
            r15 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r15)     // Catch:{ NameNotFoundException -> 0x0394 }
            android.content.pm.Signature[] r6 = r6.signatures     // Catch:{ NameNotFoundException -> 0x0394 }
            int r6 = r6.length     // Catch:{ NameNotFoundException -> 0x0394 }
            r15 = 1
            if (r6 != r15) goto L_0x037e
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ NameNotFoundException -> 0x0394 }
            java.lang.String r5 = r5.toUpperCase(r6)     // Catch:{ NameNotFoundException -> 0x0394 }
            java.lang.String r6 = "SHA-256"
            java.lang.String r6 = defpackage.jhg.b(r4, r7, r6)     // Catch:{ NameNotFoundException -> 0x0394 }
            boolean r5 = r5.equals(r6)     // Catch:{ NameNotFoundException -> 0x0394 }
            if (r5 != 0) goto L_0x03b1
            java.lang.String r5 = "discovery_shared_pref"
            r15 = 4
            android.content.SharedPreferences r5 = r4.getSharedPreferences(r5, r15)     // Catch:{ NameNotFoundException -> 0x0394 }
            java.lang.String r6 = "nearby_debug_mode"
            boolean r15 = defpackage.aymq.c()     // Catch:{ NameNotFoundException -> 0x0394 }
            boolean r5 = r5.getBoolean(r6, r15)     // Catch:{ NameNotFoundException -> 0x0394 }
            if (r5 != 0) goto L_0x03b1
            jjg r5 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0394 }
            anie r5 = r5.d()     // Catch:{ NameNotFoundException -> 0x0394 }
            anih r5 = (defpackage.anih) r5     // Catch:{ NameNotFoundException -> 0x0394 }
            r6 = 534(0x216, float:7.48E-43)
            anie r5 = r5.a((java.lang.String) r11, (java.lang.String) r12, (int) r6, (java.lang.String) r13)     // Catch:{ NameNotFoundException -> 0x0394 }
            anih r5 = (defpackage.anih) r5     // Catch:{ NameNotFoundException -> 0x0394 }
            java.lang.String r6 = "Does not show slice signature, hash does not match what is registered in the console"
            r5.a((java.lang.String) r6)     // Catch:{ NameNotFoundException -> 0x0394 }
            r15 = 0
            goto L_0x03b2
        L_0x037e:
            jjg r5 = defpackage.mte.a     // Catch:{ NameNotFoundException -> 0x0394 }
            anie r5 = r5.d()     // Catch:{ NameNotFoundException -> 0x0394 }
            anih r5 = (defpackage.anih) r5     // Catch:{ NameNotFoundException -> 0x0394 }
            r6 = 525(0x20d, float:7.36E-43)
            anie r5 = r5.a((java.lang.String) r11, (java.lang.String) r12, (int) r6, (java.lang.String) r13)     // Catch:{ NameNotFoundException -> 0x0394 }
            anih r5 = (defpackage.anih) r5     // Catch:{ NameNotFoundException -> 0x0394 }
            java.lang.String r6 = "Does not show slice since companion app has more than one signature"
            r5.a((java.lang.String) r6)     // Catch:{ NameNotFoundException -> 0x0394 }
            goto L_0x03af
        L_0x0394:
            r0 = move-exception
            r5 = r0
            jjg r6 = defpackage.mte.a     // Catch:{ all -> 0x0044 }
            anie r6 = r6.c()     // Catch:{ all -> 0x0044 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0044 }
            r6.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0044 }
            r5 = 541(0x21d, float:7.58E-43)
            anie r5 = r6.a((java.lang.String) r11, (java.lang.String) r12, (int) r5, (java.lang.String) r13)     // Catch:{ all -> 0x0044 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = "Fail to verify the app's signature package name: %s"
            r5.a((java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0044 }
            goto L_0x03b1
        L_0x03af:
            r15 = 0
            goto L_0x03b2
        L_0x03b1:
            r15 = r1
        L_0x03b2:
            if (r15 == 0) goto L_0x0403
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x0986 }
            r1 = 100
            r5.<init>(r1)     // Catch:{ all -> 0x0986 }
            aoe r1 = r8.c     // Catch:{ all -> 0x0986 }
            java.lang.String r6 = "oobe_slice"
            android.net.Uri r6 = a((java.lang.String) r6, (java.lang.String) r3, (java.lang.String) r15)     // Catch:{ all -> 0x0986 }
            r25 = r10
            mth r10 = new mth     // Catch:{ all -> 0x0984 }
            r8 = r1
            r1 = r10
            r26 = r15
            r15 = r2
            r2 = r30
            r27 = r3
            r3 = r5
            r5 = r4
            r4 = r7
            r28 = r5
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r14
            r9 = r6
            r29 = r14
            r14 = 2
            r6 = r27
            r16 = r7
            r17 = 4
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0984 }
            boolean r1 = r15.a(r8, r9, r10)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x03ee
            goto L_0x0413
        L_0x03ee:
            aymw r1 = defpackage.aymw.a     // Catch:{ all -> 0x0984 }
            aymx r1 = r1.a()     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.bj()     // Catch:{ all -> 0x0984 }
            if (r1 == 0) goto L_0x03fb
            goto L_0x0413
        L_0x03fb:
            r7 = r27
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x0403:
            r27 = r3
            r28 = r4
            r16 = r7
            r25 = r10
            r29 = r14
            r26 = r15
            r14 = 2
            r17 = 4
            r15 = r2
        L_0x0413:
            aymw r1 = defpackage.aymw.a     // Catch:{ all -> 0x0984 }
            aymx r1 = r1.a()     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.j()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x043c
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 837(0x345, float:1.173E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: Assistant slice disabled."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r7 = r27
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x043c:
            boolean r1 = r24.b()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x045f
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 842(0x34a, float:1.18E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: This item doesn't support assistant."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r7 = r27
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x045f:
            aymw r1 = defpackage.aymw.a     // Catch:{ all -> 0x0984 }
            aymx r1 = r1.a()     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.bi()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x04c9
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x0489
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 937(0x3a9, float:1.313E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: BluetoothAdapter not found."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r7 = r27
            goto L_0x04ae
        L_0x0489:
            r7 = r27
            android.bluetooth.BluetoothDevice r1 = r1.getRemoteDevice(r7)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x04a7
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 943(0x3af, float:1.321E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: BluetoothAdapter remote device %s not found."
            r1.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x0984 }
            goto L_0x04ae
        L_0x04a7:
            boolean r1 = r1.isConnected()     // Catch:{ all -> 0x0984 }
            if (r1 == 0) goto L_0x04ae
            goto L_0x04cb
        L_0x04ae:
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 848(0x350, float:1.188E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: Assistant settings not shown because not connected."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x04c9:
            r7 = r27
        L_0x04cb:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = defpackage.aymt.c()     // Catch:{ all -> 0x0984 }
            boolean r1 = defpackage.arwx.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x04f4
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 859(0x35b, float:1.204E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: No assistant app is installed."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x04f4:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "android.intent.action.VIEW"
            auci r3 = defpackage.bia.d     // Catch:{ all -> 0x0984 }
            if (r7 == 0) goto L_0x051d
            bia r4 = defpackage.bia.c     // Catch:{ all -> 0x0984 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0984 }
            boolean r5 = r4.c     // Catch:{ all -> 0x0984 }
            if (r5 != 0) goto L_0x0507
            goto L_0x050d
        L_0x0507:
            r4.c()     // Catch:{ all -> 0x0984 }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0984 }
        L_0x050d:
            aucj r5 = r4.b     // Catch:{ all -> 0x0984 }
            bia r5 = (defpackage.bia) r5     // Catch:{ all -> 0x0984 }
            r7.getClass()     // Catch:{ all -> 0x0984 }
            int r6 = r5.a     // Catch:{ all -> 0x0984 }
            r8 = 1
            r6 = r6 | r8
            r5.a = r6     // Catch:{ all -> 0x0984 }
            r5.b = r7     // Catch:{ all -> 0x0984 }
            goto L_0x0523
        L_0x051d:
            bia r4 = defpackage.bia.c     // Catch:{ all -> 0x0984 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0984 }
        L_0x0523:
            aucj r4 = r4.i()     // Catch:{ all -> 0x0984 }
            bia r4 = (defpackage.bia) r4     // Catch:{ all -> 0x0984 }
            aelc r5 = defpackage.aelc.f     // Catch:{ all -> 0x0984 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0984 }
            aeky r6 = defpackage.aeky.c     // Catch:{ all -> 0x0984 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0984 }
            java.lang.String r8 = "https://www.google.com"
            boolean r9 = r6.c     // Catch:{ all -> 0x0984 }
            if (r9 != 0) goto L_0x053c
            goto L_0x0542
        L_0x053c:
            r6.c()     // Catch:{ all -> 0x0984 }
            r9 = 0
            r6.c = r9     // Catch:{ all -> 0x0984 }
        L_0x0542:
            aucj r9 = r6.b     // Catch:{ all -> 0x0984 }
            aeky r9 = (defpackage.aeky) r9     // Catch:{ all -> 0x0984 }
            r8.getClass()     // Catch:{ all -> 0x0984 }
            int r10 = r9.a     // Catch:{ all -> 0x0984 }
            r18 = 1
            r10 = r10 | 1
            r9.a = r10     // Catch:{ all -> 0x0984 }
            r9.b = r8     // Catch:{ all -> 0x0984 }
            boolean r8 = r5.c     // Catch:{ all -> 0x0984 }
            if (r8 != 0) goto L_0x0558
            goto L_0x055e
        L_0x0558:
            r5.c()     // Catch:{ all -> 0x0984 }
            r8 = 0
            r5.c = r8     // Catch:{ all -> 0x0984 }
        L_0x055e:
            aucj r8 = r5.b     // Catch:{ all -> 0x0984 }
            aelc r8 = (defpackage.aelc) r8     // Catch:{ all -> 0x0984 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0984 }
            aeky r6 = (defpackage.aeky) r6     // Catch:{ all -> 0x0984 }
            r6.getClass()     // Catch:{ all -> 0x0984 }
            r8.e = r6     // Catch:{ all -> 0x0984 }
            int r6 = r8.a     // Catch:{ all -> 0x0984 }
            r6 = r6 | 8
            r8.a = r6     // Catch:{ all -> 0x0984 }
            aelb r6 = defpackage.aelb.a     // Catch:{ all -> 0x0984 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0984 }
            boolean r8 = r6.c     // Catch:{ all -> 0x0984 }
            if (r8 != 0) goto L_0x057e
            goto L_0x0584
        L_0x057e:
            r6.c()     // Catch:{ all -> 0x0984 }
            r8 = 0
            r6.c = r8     // Catch:{ all -> 0x0984 }
        L_0x0584:
            aucj r8 = r6.b     // Catch:{ all -> 0x0984 }
            aelb r8 = (defpackage.aelb) r8     // Catch:{ all -> 0x0984 }
            defpackage.aelb.a(r8)     // Catch:{ all -> 0x0984 }
            boolean r8 = r5.c     // Catch:{ all -> 0x0984 }
            if (r8 != 0) goto L_0x0590
            goto L_0x0596
        L_0x0590:
            r5.c()     // Catch:{ all -> 0x0984 }
            r8 = 0
            r5.c = r8     // Catch:{ all -> 0x0984 }
        L_0x0596:
            aucj r8 = r5.b     // Catch:{ all -> 0x0984 }
            aelc r8 = (defpackage.aelc) r8     // Catch:{ all -> 0x0984 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0984 }
            aelb r6 = (defpackage.aelb) r6     // Catch:{ all -> 0x0984 }
            r6.getClass()     // Catch:{ all -> 0x0984 }
            r8.b = r6     // Catch:{ all -> 0x0984 }
            int r6 = r8.a     // Catch:{ all -> 0x0984 }
            r9 = 1
            r6 = r6 | r9
            r8.a = r6     // Catch:{ all -> 0x0984 }
            aela r6 = defpackage.aela.a     // Catch:{ all -> 0x0984 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0984 }
            boolean r8 = r6.c     // Catch:{ all -> 0x0984 }
            if (r8 != 0) goto L_0x05b6
            goto L_0x05bc
        L_0x05b6:
            r6.c()     // Catch:{ all -> 0x0984 }
            r8 = 0
            r6.c = r8     // Catch:{ all -> 0x0984 }
        L_0x05bc:
            aucj r8 = r6.b     // Catch:{ all -> 0x0984 }
            aela r8 = (defpackage.aela) r8     // Catch:{ all -> 0x0984 }
            defpackage.aela.a(r8)     // Catch:{ all -> 0x0984 }
            boolean r8 = r5.c     // Catch:{ all -> 0x0984 }
            if (r8 != 0) goto L_0x05c8
            goto L_0x05ce
        L_0x05c8:
            r5.c()     // Catch:{ all -> 0x0984 }
            r8 = 0
            r5.c = r8     // Catch:{ all -> 0x0984 }
        L_0x05ce:
            aucj r8 = r5.b     // Catch:{ all -> 0x0984 }
            aelc r8 = (defpackage.aelc) r8     // Catch:{ all -> 0x0984 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0984 }
            aela r6 = (defpackage.aela) r6     // Catch:{ all -> 0x0984 }
            r6.getClass()     // Catch:{ all -> 0x0984 }
            r8.c = r6     // Catch:{ all -> 0x0984 }
            int r6 = r8.a     // Catch:{ all -> 0x0984 }
            r6 = r6 | r14
            r8.a = r6     // Catch:{ all -> 0x0984 }
            aekz r6 = defpackage.aekz.c     // Catch:{ all -> 0x0984 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0984 }
            aeld r8 = defpackage.aeld.d     // Catch:{ all -> 0x0984 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x0984 }
            boolean r9 = r8.c     // Catch:{ all -> 0x0984 }
            if (r9 != 0) goto L_0x05f3
            goto L_0x05f9
        L_0x05f3:
            r8.c()     // Catch:{ all -> 0x0984 }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0984 }
        L_0x05f9:
            aucj r9 = r8.b     // Catch:{ all -> 0x0984 }
            aeld r9 = (defpackage.aeld) r9     // Catch:{ all -> 0x0984 }
            r10 = 9
            r9.b = r10     // Catch:{ all -> 0x0984 }
            int r10 = r9.a     // Catch:{ all -> 0x0984 }
            r18 = 1
            r10 = r10 | 1
            r9.a = r10     // Catch:{ all -> 0x0984 }
            bhz r9 = defpackage.bhz.a     // Catch:{ all -> 0x0984 }
            aucd r9 = r9.o()     // Catch:{ all -> 0x0984 }
            aucf r9 = (defpackage.aucf) r9     // Catch:{ all -> 0x0984 }
            auci r10 = defpackage.bib.a     // Catch:{ all -> 0x0984 }
            bic r18 = defpackage.bic.a     // Catch:{ all -> 0x0984 }
            aucd r18 = r18.o()     // Catch:{ all -> 0x0984 }
            r14 = r18
            aucf r14 = (defpackage.aucf) r14     // Catch:{ all -> 0x0984 }
            r14.a(r3, r4)     // Catch:{ all -> 0x0984 }
            aucj r3 = r14.i()     // Catch:{ all -> 0x0984 }
            bic r3 = (defpackage.bic) r3     // Catch:{ all -> 0x0984 }
            r9.a(r10, r3)     // Catch:{ all -> 0x0984 }
            boolean r3 = r8.c     // Catch:{ all -> 0x0984 }
            if (r3 != 0) goto L_0x062e
            goto L_0x0634
        L_0x062e:
            r8.c()     // Catch:{ all -> 0x0984 }
            r3 = 0
            r8.c = r3     // Catch:{ all -> 0x0984 }
        L_0x0634:
            aucj r3 = r8.b     // Catch:{ all -> 0x0984 }
            aeld r3 = (defpackage.aeld) r3     // Catch:{ all -> 0x0984 }
            aucj r4 = r9.i()     // Catch:{ all -> 0x0984 }
            bhz r4 = (defpackage.bhz) r4     // Catch:{ all -> 0x0984 }
            r4.getClass()     // Catch:{ all -> 0x0984 }
            r3.c = r4     // Catch:{ all -> 0x0984 }
            int r4 = r3.a     // Catch:{ all -> 0x0984 }
            r9 = 2
            r4 = r4 | r9
            r3.a = r4     // Catch:{ all -> 0x0984 }
            boolean r3 = r6.c     // Catch:{ all -> 0x0984 }
            if (r3 != 0) goto L_0x064e
            goto L_0x0654
        L_0x064e:
            r6.c()     // Catch:{ all -> 0x0984 }
            r3 = 0
            r6.c = r3     // Catch:{ all -> 0x0984 }
        L_0x0654:
            aucj r3 = r6.b     // Catch:{ all -> 0x0984 }
            aekz r3 = (defpackage.aekz) r3     // Catch:{ all -> 0x0984 }
            aucj r4 = r8.i()     // Catch:{ all -> 0x0984 }
            aeld r4 = (defpackage.aeld) r4     // Catch:{ all -> 0x0984 }
            r4.getClass()     // Catch:{ all -> 0x0984 }
            r3.b = r4     // Catch:{ all -> 0x0984 }
            r4 = 2
            r3.a = r4     // Catch:{ all -> 0x0984 }
            boolean r3 = r5.c     // Catch:{ all -> 0x0984 }
            if (r3 != 0) goto L_0x066b
            goto L_0x0671
        L_0x066b:
            r5.c()     // Catch:{ all -> 0x0984 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0984 }
        L_0x0671:
            aucj r3 = r5.b     // Catch:{ all -> 0x0984 }
            aelc r3 = (defpackage.aelc) r3     // Catch:{ all -> 0x0984 }
            aucj r4 = r6.i()     // Catch:{ all -> 0x0984 }
            aekz r4 = (defpackage.aekz) r4     // Catch:{ all -> 0x0984 }
            r4.getClass()     // Catch:{ all -> 0x0984 }
            r3.d = r4     // Catch:{ all -> 0x0984 }
            int r4 = r3.a     // Catch:{ all -> 0x0984 }
            r4 = r4 | 4
            r3.a = r4     // Catch:{ all -> 0x0984 }
            aucj r3 = r5.i()     // Catch:{ all -> 0x0984 }
            aelc r3 = (defpackage.aelc) r3     // Catch:{ all -> 0x0984 }
            aelf r4 = defpackage.aelf.c     // Catch:{ all -> 0x0984 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0984 }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x0984 }
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x0984 }
            boolean r5 = r4.c     // Catch:{ all -> 0x0984 }
            if (r5 != 0) goto L_0x069f
            goto L_0x06a5
        L_0x069f:
            r4.c()     // Catch:{ all -> 0x0984 }
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0984 }
        L_0x06a5:
            aucj r5 = r4.b     // Catch:{ all -> 0x0984 }
            aelf r5 = (defpackage.aelf) r5     // Catch:{ all -> 0x0984 }
            r3.getClass()     // Catch:{ all -> 0x0984 }
            int r6 = r5.a     // Catch:{ all -> 0x0984 }
            r8 = 2
            r6 = r6 | r8
            r5.a = r6     // Catch:{ all -> 0x0984 }
            r5.b = r3     // Catch:{ all -> 0x0984 }
            anml r3 = defpackage.anml.f     // Catch:{ all -> 0x0984 }
            anml r3 = r3.a()     // Catch:{ all -> 0x0984 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0984 }
            aelf r4 = (defpackage.aelf) r4     // Catch:{ all -> 0x0984 }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x0984 }
            java.lang.String r3 = r3.a((byte[]) r4)     // Catch:{ all -> 0x0984 }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ all -> 0x0984 }
            r4.<init>()     // Catch:{ all -> 0x0984 }
            java.lang.String r5 = "googleapp"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ all -> 0x0984 }
            java.lang.String r5 = "deeplink"
            android.net.Uri$Builder r4 = r4.authority(r5)     // Catch:{ all -> 0x0984 }
            java.lang.String r5 = "/"
            android.net.Uri$Builder r4 = r4.path(r5)     // Catch:{ all -> 0x0984 }
            java.lang.String r5 = "data"
            android.net.Uri$Builder r3 = r4.appendQueryParameter(r5, r3)     // Catch:{ all -> 0x0984 }
            android.net.Uri r3 = r3.build()     // Catch:{ all -> 0x0984 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0984 }
            android.content.pm.PackageManager r2 = r28.getPackageManager()     // Catch:{ all -> 0x0984 }
            android.content.ComponentName r2 = r1.resolveActivity(r2)     // Catch:{ all -> 0x0984 }
            if (r2 != 0) goto L_0x0710
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 863(0x35f, float:1.21E-42)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: No resolveActivity for assistant deep link."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r8 = r28
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x076c
        L_0x0710:
            boolean r2 = defpackage.aymz.b()     // Catch:{ all -> 0x0984 }
            if (r2 != 0) goto L_0x071a
            r2 = 2131952651(0x7f13040b, float:1.954175E38)
            goto L_0x071d
        L_0x071a:
            r2 = 2131952652(0x7f13040c, float:1.9541753E38)
        L_0x071d:
            r8 = r28
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0984 }
            asom r18 = defpackage.asom.FAST_PAIR_DEVICE_ASSISTANT_SETTINGS_CLICKED     // Catch:{ all -> 0x0984 }
            java.lang.String r19 = defpackage.aymt.c()     // Catch:{ all -> 0x0984 }
            byte[] r22 = r24.a()     // Catch:{ all -> 0x0984 }
            r17 = r8
            r20 = r29
            r21 = r7
            r23 = r1
            android.content.Intent r1 = defpackage.arza.a(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0984 }
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 1
            android.app.PendingIntent r18 = android.app.PendingIntent.getService(r8, r4, r1, r3)     // Catch:{ all -> 0x0984 }
            r1 = 2131231949(0x7f0804cd, float:1.8079993E38)
            android.graphics.Bitmap r1 = a((android.content.Context) r8, (int) r1)     // Catch:{ all -> 0x0984 }
            android.support.v4.graphics.drawable.IconCompat r1 = android.support.v4.graphics.drawable.IconCompat.a((android.graphics.Bitmap) r1)     // Catch:{ all -> 0x0984 }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.a((int) r9)     // Catch:{ all -> 0x0984 }
            boolean r3 = defpackage.aymz.b()     // Catch:{ all -> 0x0984 }
            if (r3 != 0) goto L_0x075a
            r3 = 2131952185(0x7f130239, float:1.9540806E38)
            goto L_0x075d
        L_0x075a:
            r3 = 2131952650(0x7f13040a, float:1.9541749E38)
        L_0x075d:
            java.lang.String r21 = r8.getString(r3)     // Catch:{ all -> 0x0984 }
            r22 = 1
            r17 = r15
            r19 = r1
            r20 = r2
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0984 }
        L_0x076c:
            byte[] r4 = r24.a()     // Catch:{ all -> 0x0984 }
            r1 = r30
            r2 = r8
            r3 = r15
            r5 = r7
            r6 = r29
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (byte[]) r4, (java.lang.String) r5, (defpackage.avbh) r6)     // Catch:{ all -> 0x0984 }
            aymt r1 = defpackage.aymt.a     // Catch:{ all -> 0x0984 }
            aymu r1 = r1.a()     // Catch:{ all -> 0x0984 }
            java.lang.String r1 = r1.as()     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "caller"
            r10 = r31
            java.lang.String r2 = r10.getQueryParameter(r2)     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x08f6
            boolean r1 = android.text.TextUtils.isEmpty(r26)     // Catch:{ all -> 0x0984 }
            if (r1 == 0) goto L_0x0799
            goto L_0x07eb
        L_0x0799:
            java.lang.String r1 = defpackage.aymt.r()     // Catch:{ all -> 0x0984 }
            r2 = r26
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x07a6
            goto L_0x07c2
        L_0x07a6:
            java.lang.Boolean r1 = defpackage.jix.a     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x07ba
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ all -> 0x0984 }
            java.lang.String r3 = "com.google.android.feature.PIXEL_EXPERIENCE"
            boolean r1 = r1.hasSystemFeature(r3)     // Catch:{ all -> 0x0984 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0984 }
            defpackage.jix.a = r1     // Catch:{ all -> 0x0984 }
        L_0x07ba:
            java.lang.Boolean r1 = defpackage.jix.a     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0984 }
            if (r1 == 0) goto L_0x07eb
        L_0x07c2:
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x0984 }
            r1 = 150(0x96, float:2.1E-43)
            r3.<init>(r1)     // Catch:{ all -> 0x0984 }
            r14 = r30
            aoe r6 = r14.c     // Catch:{ all -> 0x0984 }
            java.lang.String r1 = "settings_slice"
            android.net.Uri r5 = a((java.lang.String) r1, (java.lang.String) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            mti r4 = new mti     // Catch:{ all -> 0x0984 }
            r1 = r4
            r2 = r30
            r9 = r4
            r4 = r16
            r14 = r5
            r5 = r29
            r10 = r6
            r6 = r7
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0984 }
            boolean r1 = r15.a(r10, r14, r9)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x08f6
        L_0x07eb:
            aymw r1 = defpackage.aymw.a     // Catch:{ all -> 0x0984 }
            aymx r1 = r1.a()     // Catch:{ all -> 0x0984 }
            boolean r1 = r1.y()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x080e
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 681(0x2a9, float:9.54E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: Companion app slice disabled."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            goto L_0x08f6
        L_0x080e:
            java.lang.String r1 = r24.c()     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x0816
            goto L_0x08e1
        L_0x0816:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0984 }
            if (r2 != 0) goto L_0x08e1
            java.lang.String r1 = defpackage.aryo.b(r1)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x0824
            goto L_0x08cb
        L_0x0824:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0984 }
            if (r2 != 0) goto L_0x08cb
            android.content.Context r2 = r30.getContext()     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = defpackage.arwx.b(r2, r1)     // Catch:{ all -> 0x0984 }
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ all -> 0x0984 }
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r1)     // Catch:{ all -> 0x0984 }
            java.lang.String r20 = r24.d()     // Catch:{ all -> 0x0984 }
            byte[] r21 = r24.a()     // Catch:{ all -> 0x0984 }
            r17 = r8
            r18 = r1
            r19 = r29
            r22 = r2
            r23 = r3
            android.app.PendingIntent r18 = a((android.content.Context) r17, (java.lang.String) r18, (defpackage.avbh) r19, (java.lang.String) r20, (byte[]) r21, (java.lang.String) r22, (android.content.Intent) r23)     // Catch:{ all -> 0x0984 }
            if (r3 == 0) goto L_0x085a
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0984 }
            if (r1 != 0) goto L_0x085a
            r1 = 1
            goto L_0x085b
        L_0x085a:
            r1 = 0
        L_0x085b:
            boolean r3 = r24.e()     // Catch:{ all -> 0x0984 }
            r4 = 2131952177(0x7f130231, float:1.954079E38)
            if (r1 != 0) goto L_0x087b
            if (r3 != 0) goto L_0x086e
            r1 = 2131952688(0x7f130430, float:1.9541826E38)
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0984 }
            goto L_0x0873
        L_0x086e:
            java.lang.String r1 = r8.getString(r4)     // Catch:{ all -> 0x0984 }
        L_0x0873:
            r2 = 2131952687(0x7f13042f, float:1.9541824E38)
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0984 }
            goto L_0x08a4
        L_0x087b:
            if (r3 != 0) goto L_0x0892
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0984 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0984 }
            r2 = 2131952691(0x7f130433, float:1.9541832E38)
            java.lang.String r1 = r8.getString(r2, r1)     // Catch:{ all -> 0x0984 }
            r2 = 2131952690(0x7f130432, float:1.954183E38)
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0984 }
            goto L_0x08a4
        L_0x0892:
            java.lang.String r1 = r8.getString(r4)     // Catch:{ all -> 0x0984 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0984 }
            r4 = 0
            r3[r4] = r2     // Catch:{ all -> 0x0984 }
            r2 = 2131952689(0x7f130431, float:1.9541828E38)
            java.lang.String r2 = r8.getString(r2, r3)     // Catch:{ all -> 0x0984 }
        L_0x08a4:
            mtj r3 = new mtj     // Catch:{ all -> 0x0984 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0984 }
            r1 = 2131231990(0x7f0804f6, float:1.8080077E38)
            android.graphics.Bitmap r1 = a((android.content.Context) r8, (int) r1)     // Catch:{ all -> 0x0984 }
            android.support.v4.graphics.drawable.IconCompat r1 = android.support.v4.graphics.drawable.IconCompat.a((android.graphics.Bitmap) r1)     // Catch:{ all -> 0x0984 }
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.a((int) r2)     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = r3.a     // Catch:{ all -> 0x0984 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0984 }
            r22 = 1
            r17 = r15
            r19 = r1
            r20 = r2
            r21 = r3
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0984 }
            goto L_0x08f6
        L_0x08cb:
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 694(0x2b6, float:9.73E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: No companion app for device."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            goto L_0x08f6
        L_0x08e1:
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 687(0x2af, float:9.63E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: No actionUrl for this device."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
        L_0x08f6:
            androidx.slice.Slice r2 = r15.a()     // Catch:{ all -> 0x0984 }
            r7 = r31
            goto L_0x0953
        L_0x08fd:
            r0 = move-exception
            r25 = r10
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r2 = 486(0x1e6, float:6.81E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: RemoteException when getting DeviceDetailsLinks."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r7 = r31
            r2 = 0
            goto L_0x0953
        L_0x0919:
            r8 = r4
            r25 = r10
            r29 = r14
            if (r2 == 0) goto L_0x093b
            anml r1 = defpackage.anml.g     // Catch:{ all -> 0x0984 }
            byte[] r4 = r1.b((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0984 }
            r7 = r31
            mtp r9 = b(r8, r7)     // Catch:{ all -> 0x0984 }
            r5 = 0
            r1 = r30
            r2 = r8
            r3 = r9
            r6 = r29
            r1.a((android.content.Context) r2, (defpackage.mtp) r3, (byte[]) r4, (java.lang.String) r5, (defpackage.avbh) r6)     // Catch:{ all -> 0x0984 }
            androidx.slice.Slice r2 = r9.a()     // Catch:{ all -> 0x0984 }
            goto L_0x0953
        L_0x093b:
            r7 = r31
            jjg r2 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0984 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0984 }
            r3 = 466(0x1d2, float:6.53E-43)
            anie r1 = r2.a((java.lang.String) r11, (java.lang.String) r1, (int) r3, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r2 = "FastPairSlice: Queried device details links but did not include address."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0984 }
            r2 = 0
        L_0x0953:
            if (r2 != 0) goto L_0x0962
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0984 }
            mtp r1 = defpackage.mtp.a(r1, r7)     // Catch:{ all -> 0x0984 }
            androidx.slice.Slice r1 = r1.a()     // Catch:{ all -> 0x0984 }
            r2 = r1
        L_0x0962:
            android.content.Context r1 = r30.getContext()     // Catch:{ all -> 0x0984 }
            asom r3 = defpackage.asom.FAST_PAIR_CONNECTED_DEVICE_SLICE_QUERIED     // Catch:{ all -> 0x0984 }
            defpackage.mtd.a(r1, r3)     // Catch:{ all -> 0x0984 }
        L_0x096b:
            jjg r1 = defpackage.mte.a     // Catch:{ all -> 0x0984 }
            anie r1 = r1.d()     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            r3 = 190(0xbe, float:2.66E-43)
            anie r1 = r1.a((java.lang.String) r11, (java.lang.String) r12, (int) r3, (java.lang.String) r13)     // Catch:{ all -> 0x0984 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r3 = "FastPairSlice: Build slice uri %s completed with slice %s"
            r1.a((java.lang.String) r3, (java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x0984 }
            android.os.StrictMode.setThreadPolicy(r25)
            return r2
        L_0x0984:
            r0 = move-exception
            goto L_0x0989
        L_0x0986:
            r0 = move-exception
            r25 = r10
        L_0x0989:
            r1 = r0
        L_0x098a:
            android.os.StrictMode.setThreadPolicy(r25)
            goto L_0x098f
        L_0x098e:
            throw r1
        L_0x098f:
            goto L_0x098e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.a(android.net.Uri):androidx.slice.Slice");
    }
}
