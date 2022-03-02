package defpackage;

import android.accounts.Account;
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: wgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wgu implements wbx, wdm, wdl {
    public int A;
    private final Map B = new ConcurrentHashMap();
    private final ScheduledExecutorService C;
    private final wbo D;
    private final WifiManager E;
    private volatile wgk F;
    private volatile ScheduledFuture G;
    public final Map a = new nz();
    public final Map b = new ConcurrentHashMap();
    public final Map c = new ConcurrentHashMap();
    public final ScheduledExecutorService d = tid.a();
    public final wgj e = new wgj(this.d, "mutual acceptance timeout");
    public final Context f;
    public wdq g;
    public vsh h;
    public vtx i;
    public wbw j;
    public int k = 2;
    public final ConcurrentMap l = new ConcurrentHashMap();
    public final wcf m;
    public final wcg n;
    public final vva o;
    final whf p;
    public final wcu q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public volatile int x;
    public volatile ScheduledFuture y;
    public BroadcastReceiver z;

    public wgu(Context context, wbo wbo, vva vva) {
        auay auay;
        this.x = 0;
        this.A = 0;
        this.f = context;
        this.D = wbo;
        this.o = vva;
        this.g = new wdq(context);
        this.p = new whf(context, wbo, vva);
        whf whf = this.p;
        wgz wgz = new wgz();
        String address = BluetoothAdapter.getDefaultAdapter().getAddress();
        byte[] bArr = null;
        if (!TextUtils.isEmpty(address)) {
            byte[] bArr2 = new byte[6];
            List c2 = amsk.a(':').c(address);
            if (c2.size() == 6) {
                for (int i2 = 0; i2 < 6; i2++) {
                    String valueOf = String.valueOf((String) c2.get(i2));
                    bArr2[i2] = Integer.decode(valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf)).byteValue();
                }
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            auay = auay.b;
        } else {
            auay = auay.a(bArr);
        }
        Context context2 = context;
        wbo wbo2 = wbo;
        wcf wcf = new wcf(context2, wbo2, wgz, whf, auay);
        this.m = wcf;
        whf whf2 = this.p;
        wgx wgx = new wgx(context, new wgy(context));
        this.n = new wcg(wgx, new wcp(context2, wbo2, wgx, wcf, whf2, new vvq(context), jiu.a, tid.c()), wbo);
        this.q = new wcu();
        if (ayni.k() && jix.b(context)) {
            this.p.a();
        }
        this.p.a(new wdr(wbo));
        this.C = tid.a();
        this.E = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private final int a(Intent intent) {
        try {
            this.f.startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wgu", "a", 3591, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to find any activity to start %s", (Object) intent);
            return 35509;
        }
    }

    public static File b(FileAttachment fileAttachment) {
        int i2;
        String str = fileAttachment.a;
        if (!ayni.a.a().aH() || ((i2 = fileAttachment.b) != 1 && i2 != 2)) {
            return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Nearby Sharing");
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }
        return new File(file, str);
    }

    private final void c(ShareTarget shareTarget, String str) {
        vnz vnz;
        int i2;
        tjc[] tjcArr;
        vtx vtx;
        String str2;
        int i3;
        ShareTarget shareTarget2 = shareTarget;
        String str3 = "wgu";
        ((anih) ((anih) vvj.a.d()).a(str3, "c", 1739, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Preparing to send introduction to %s", (Object) shareTarget2);
        wcx o2 = o(shareTarget);
        if (o2 == null) {
            ((anih) ((anih) vvj.a.d()).a(str3, "c", 1743, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No NearbyConnection tied to %s. Disconnecting.", (Object) shareTarget2);
            return;
        }
        vtx n2 = n(shareTarget);
        if (n2 == null) {
            o2.b();
            ((anih) ((anih) vvj.a.d()).a(str3, "c", 1750, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No TransferUpdateCallback tied to %s. Disconnecting.", (Object) shareTarget2);
            return;
        }
        tjc[] q2 = q(shareTarget);
        tjc[] p2 = p(shareTarget);
        tjc[] r2 = r(shareTarget);
        if (q2.length == 0 && p2.length == 0 && r2.length == 0) {
            n2.a(shareTarget2, new vtv(7).a());
            o2.b();
            ((anih) ((anih) vvj.a.d()).a(str3, "c", 1762, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No payloads tied to %s. Disconnecting.", (Object) shareTarget2);
            return;
        }
        aucd o3 = vnl.f.o();
        ((anih) ((anih) vvj.a.d()).a(str3, "c", 1769, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sending attachments to %s", (Object) shareTarget2.b);
        int i4 = 0;
        while (i4 < q2.length) {
            FileAttachment fileAttachment = (FileAttachment) shareTarget2.g.get(i4);
            ((anih) ((anih) vvj.a.d()).a(str3, "c", 1774, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Preparing file attachment %s", (Object) fileAttachment.a);
            if (q2[i4] != null) {
                aucd o4 = vnh.g.o();
                String str4 = fileAttachment.a;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                vnh vnh = (vnh) o4.b;
                str4.getClass();
                vtx = n2;
                int i5 = vnh.a | 1;
                vnh.a = i5;
                vnh.b = str4;
                tjcArr = q2;
                long j2 = q2[i4].a;
                int i6 = i5 | 4;
                vnh.a = i6;
                vnh.d = j2;
                int i7 = fileAttachment.b;
                if (i7 != 1) {
                    i3 = i7 != 2 ? i7 != 3 ? i7 != 4 ? 1 : 5 : 4 : 3;
                } else {
                    i3 = 2;
                }
                vnh.c = i3 - 1;
                int i8 = i6 | 2;
                vnh.a = i8;
                String str5 = fileAttachment.f;
                str5.getClass();
                int i9 = i8 | 16;
                vnh.a = i9;
                vnh.f = str5;
                str2 = str3;
                long j3 = fileAttachment.c;
                vnh.a = i9 | 8;
                vnh.e = j3;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                vnl vnl = (vnl) o3.b;
                vnh vnh2 = (vnh) o4.i();
                vnh2.getClass();
                if (!vnl.b.a()) {
                    vnl.b = aucj.a(vnl.b);
                }
                vnl.b.add(vnh2);
            } else {
                tjcArr = q2;
                vtx = n2;
                str2 = str3;
            }
            i4++;
            str3 = str2;
            n2 = vtx;
            q2 = tjcArr;
        }
        vtx vtx2 = n2;
        String str6 = str3;
        for (int i10 = 0; i10 < p2.length; i10++) {
            TextAttachment textAttachment = (TextAttachment) shareTarget2.f.get(i10);
            ((anih) ((anih) vvj.a.d()).a(str6, "c", 1791, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Preparing text attachment %s", (Object) textAttachment.a);
            aucd o5 = vnt.e.o();
            String str7 = textAttachment.a;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            vnt vnt = (vnt) o5.b;
            str7.getClass();
            int i11 = vnt.a | 1;
            vnt.a = i11;
            vnt.b = str7;
            int i12 = textAttachment.b;
            if (i12 != 0) {
                i2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? 1 : 5 : 4 : 3;
            } else {
                i2 = 1;
            }
            vnt.c = i2 - 1;
            int i13 = i11 | 2;
            vnt.a = i13;
            long j4 = p2[i10].a;
            vnt.a = i13 | 4;
            vnt.d = j4;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vnl vnl2 = (vnl) o3.b;
            vnt vnt2 = (vnt) o5.i();
            vnt2.getClass();
            if (!vnl2.c.a()) {
                vnl2.c = aucj.a(vnl2.c);
            }
            vnl2.c.add(vnt2);
        }
        for (int i14 = 0; i14 < r2.length; i14++) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) shareTarget2.h.get(i14);
            ((anih) ((anih) vvj.a.d()).a(str6, "c", 1803, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Preparing wifi credentials attachment for %s.", (Object) wifiCredentialsAttachment.a);
            aucd o6 = voa.e.o();
            String str8 = wifiCredentialsAttachment.a;
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            voa voa = (voa) o6.b;
            str8.getClass();
            int i15 = voa.a | 1;
            voa.a = i15;
            voa.b = str8;
            long j5 = r2[i14].a;
            voa.a = i15 | 4;
            voa.d = j5;
            int i16 = wifiCredentialsAttachment.b;
            if (i16 == 0) {
                vnz = vnz.UNKNOWN_SECURITY_TYPE;
            } else if (i16 == 1) {
                vnz = vnz.OPEN;
            } else if (i16 == 2) {
                vnz = vnz.WPA_PSK;
            } else if (i16 != 3) {
                vnz = vnz.UNKNOWN_SECURITY_TYPE;
            } else {
                vnz = vnz.WEP;
            }
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            voa voa2 = (voa) o6.b;
            voa2.c = vnz.e;
            voa2.a |= 2;
            voa voa3 = (voa) o6.i();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vnl vnl3 = (vnl) o3.b;
            voa3.getClass();
            if (!vnl3.e.a()) {
                vnl3.e = aucj.a(vnl3.e);
            }
            vnl3.e.add(voa3);
        }
        String string = shareTarget2.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        if (string != null) {
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vnl vnl4 = (vnl) o3.b;
            string.getClass();
            vnl4.a |= 1;
            vnl4.d = string;
        }
        try {
            vnl vnl5 = (vnl) o3.i();
            aucd o7 = vnk.d.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            vnk vnk = (vnk) o7.b;
            vnk.b = 1;
            vnk.a |= 1;
            aucd o8 = vnw.h.o();
            vnv vnv = vnv.INTRODUCTION;
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            vnw vnw = (vnw) o8.b;
            vnw.b = vnv.g;
            int i17 = vnw.a | 1;
            vnw.a = i17;
            vnl5.getClass();
            vnw.c = vnl5;
            vnw.a = i17 | 2;
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            vnk vnk2 = (vnk) o7.b;
            vnw vnw2 = (vnw) o8.i();
            vnw2.getClass();
            vnk2.c = vnw2;
            vnk2.a |= 2;
            o2.a(((vnk) o7.i()).k());
            try {
                vva vva = this.o;
                long j6 = this.t;
                int i18 = !shareTarget2.k ? 4 : 3;
                aucd d2 = vvb.d(13);
                aucd o9 = aslv.d.o();
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                aslv aslv = (aslv) o9.b;
                aslv.a |= 2;
                aslv.c = j6;
                aslz b2 = vvb.b(i18);
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                aslv aslv2 = (aslv) o9.b;
                b2.getClass();
                aslv2.b = b2;
                aslv2.a |= 1;
                aslv aslv3 = (aslv) o9.i();
                if (d2.c) {
                    d2.c();
                    d2.c = false;
                }
                asmc asmc = (asmc) d2.b;
                asmc asmc2 = asmc.B;
                aslv3.getClass();
                asmc.n = aslv3;
                asmc.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                vva.a(new vuu((asmc) d2.i()));
                ((anih) ((anih) vvj.a.d()).a(str6, "c", 1839, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote the introduction frame");
                this.e.a(shareTarget, o2, vtx2, ayni.D());
                vtv vtv = new vtv(2);
                vtv.a = str;
                vtx2.a(shareTarget2, vtv.a());
            } catch (IOException e2) {
                e = e2;
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a(str6, "c", 1831, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the introduction frame. Disconnecting.");
                vtx2.a(shareTarget2, new vtv(7).a());
                o2.b();
            }
        } catch (IOException e3) {
            e = e3;
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e);
            ((anih) anih2.a(str6, "c", 1831, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the introduction frame. Disconnecting.");
            vtx2.a(shareTarget2, new vtv(7).a());
            o2.b();
        }
    }

    private static List d(List list) {
        ArrayList arrayList = new ArrayList();
        aucx aucx = ayni.a.a().k().a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (!aucx.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            }
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "d", 2937, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider removed blacklisted packages: %s", (Object) aucx);
        return arrayList;
    }

    public static void l() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Nearby");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "l", 2378, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Not deleting the Nearby folder because there are still files remaining");
            } else {
                file.delete();
            }
        }
    }

    private final TransferMetadata u(ShareTarget shareTarget) {
        String str;
        if (shareTarget.i) {
            str = h(shareTarget).f;
        } else {
            str = l(shareTarget).f;
        }
        if (str == null) {
            return new vtv(3).a();
        }
        vtv vtv = new vtv(3);
        vtv.a = str;
        return vtv.a();
    }

    private final boolean v(ShareTarget shareTarget) {
        WifiManager wifiManager;
        if (ayni.d() || !jkr.h() || (wifiManager = this.E) == null || wifiManager.isWifiEnabled()) {
            return a(shareTarget.b(), ayni.a.a().bj());
        }
        return false;
    }

    private final boolean w(ShareTarget shareTarget) {
        ShareTarget shareTarget2 = shareTarget;
        boolean z2 = true;
        if (q(shareTarget).length > 0 || p(shareTarget).length > 0 || r(shareTarget).length > 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1979, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping payload creation for ShareTarget %s. Payloads already created.", (Object) shareTarget2);
            return true;
        }
        boolean z3 = false;
        try {
            List list = shareTarget2.g;
            int size = list.size();
            tjc[] tjcArr = new tjc[size];
            int i2 = 0;
            while (i2 < list.size()) {
                FileAttachment fileAttachment = (FileAttachment) list.get(i2);
                Uri uri = fileAttachment.d;
                if (uri != null) {
                    tjc a2 = tjc.a(tja.a(whw.a(this.f, uri)), tjc.a());
                    tjcArr[i2] = a2;
                    a((Attachment) fileAttachment, a2.a);
                }
                i2++;
                z3 = false;
            }
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2020, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created file payloads of length %d", size);
            l(shareTarget).i = tjcArr;
            List list2 = shareTarget2.f;
            int size2 = list2.size();
            tjc[] tjcArr2 = new tjc[size2];
            int i3 = 0;
            while (i3 < list2.size()) {
                TextAttachment textAttachment = (TextAttachment) list2.get(i3);
                tjc a3 = tjc.a(textAttachment.a.getBytes());
                tjcArr2[i3] = a3;
                a((Attachment) textAttachment, a3.a);
                i3++;
                z3 = false;
            }
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 2032, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created text payloads of length %d", size2);
            l(shareTarget).h = tjcArr2;
            List list3 = shareTarget2.h;
            int size3 = list3.size();
            tjc[] tjcArr3 = new tjc[size3];
            int i4 = 0;
            while (i4 < list3.size()) {
                WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list3.get(i4);
                aucd o2 = vnx.d.o();
                String str = wifiCredentialsAttachment.d;
                if (str != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = z3;
                    }
                    vnx vnx = (vnx) o2.b;
                    str.getClass();
                    vnx.a |= 1;
                    vnx.b = str;
                }
                boolean z4 = wifiCredentialsAttachment.e;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                vnx vnx2 = (vnx) o2.b;
                vnx2.a |= 2;
                vnx2.c = z4;
                tjc a4 = tjc.a(((vnx) o2.i()).k());
                tjcArr3[i4] = a4;
                a((Attachment) wifiCredentialsAttachment, a4.a);
                i4++;
                z3 = false;
            }
            ((anih) ((anih) vvj.a.d()).a("wgu", "c", 2055, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created wifi payloads of length %d", size3);
            l(shareTarget).j = tjcArr3;
            if (q(shareTarget).length <= 0 && p(shareTarget).length <= 0 && r(shareTarget).length <= 0) {
                z2 = false;
            }
            if (z2) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1995, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created %s payloads for ShareTarget %s.", (Object) shareTarget.b(), (Object) shareTarget2);
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1998, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create any payloads for ShareTarget %s.", (Object) shareTarget2);
            }
            return z2;
        } catch (IOException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wgu", "w", 2002, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create file payloads for the given attachments. Disconnecting.");
            return false;
        }
    }

    private final Intent x(ShareTarget shareTarget) {
        String str;
        vnx vnx;
        acwa acwa;
        Uri uri;
        ShareTarget shareTarget2 = shareTarget;
        PackageManager packageManager = this.f.getPackageManager();
        List b2 = shareTarget.b();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(32768);
        String string = shareTarget2.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        if (string != null) {
            try {
                this.f.getPackageManager().getPackageInfo(string, 0);
                intent.setPackage(string);
                ((anih) ((anih) vvj.a.d()).a("wgu", "x", 2785, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Required package is installed on receiver device.");
            } catch (PackageManager.NameNotFoundException e2) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "x", 2775, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Required package is missing on receiver device.");
                intent.setPackage("com.android.vending").setAction("android.intent.action.VIEW").setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s&launch=true", new Object[]{string})));
                return intent;
            }
        }
        if (b2.size() > 1) {
            int[] iArr = {1, 2};
            ArrayList arrayList = new ArrayList();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Attachment attachment = (Attachment) b2.get(i2);
                if (attachment.c()) {
                    FileAttachment fileAttachment = (FileAttachment) attachment;
                    int i3 = fileAttachment.b;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            break;
                        } else if (i3 == iArr[i4]) {
                            arrayList.add(fileAttachment);
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            if (arrayList.size() != b2.size()) {
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                return intent;
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            return intent;
        }
        Attachment attachment2 = (Attachment) b2.get(0);
        String str2 = null;
        if (attachment2.d()) {
            wgg wgg = (wgg) this.b.get(attachment2);
            if (wgg != null) {
                str2 = wgg.d;
            }
            if (TextUtils.isEmpty(str2)) {
                return intent;
            }
            int i5 = ((TextAttachment) shareTarget2.f.get(0)).b;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (str2.startsWith("https://") || str2.startsWith("http://")) {
                        str = str2;
                    } else {
                        String valueOf = String.valueOf(str2);
                        str = valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
                    }
                    intent.setAction("android.intent.action.VIEW").setData(Uri.parse(str));
                } else if (i5 == 2) {
                    Intent action = intent.setAction("android.intent.action.VIEW");
                    String valueOf2 = String.valueOf(Uri.encode(str2));
                    action.setData(Uri.parse(valueOf2.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf2)));
                } else if (i5 == 3) {
                    Intent action2 = intent.setAction("android.intent.action.DIAL");
                    String valueOf3 = String.valueOf(str2);
                    action2.setData(Uri.parse(valueOf3.length() == 0 ? new String("tel:") : "tel:".concat(valueOf3)));
                }
            } else if (amrk.a(string)) {
                intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f.getPackageName()).putExtra("android.intent.extra.TEXT", str2).setType("text/plain");
            } else {
                intent.setAction("android.intent.action.VIEW").putExtra("android.intent.extra.TEXT", str2).setType("text/plain");
            }
            if (intent.resolveActivity(packageManager) == null) {
                intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f.getPackageName()).setType("text/plain").putExtra("android.intent.extra.TEXT", str2);
                return intent;
            }
        } else if (attachment2.c()) {
            FileAttachment fileAttachment2 = (FileAttachment) attachment2;
            wgg wgg2 = (wgg) this.b.get(fileAttachment2);
            if (wgg2 != null) {
                uri = wgg2.a;
            } else {
                uri = null;
            }
            if (uri != null) {
                intent.addFlags(1);
                intent.setDataAndType(uri, fileAttachment2.f);
                intent.setAction("android.intent.action.VIEW");
                List<ResolveInfo> queryIntentActivities = this.f.getPackageManager().queryIntentActivities(intent, 65536);
                ArrayList arrayList2 = new ArrayList();
                aucx aucx = ayni.a.a().k().a;
                for (ResolveInfo next : queryIntentActivities) {
                    if (!aucx.contains(next.activityInfo.packageName)) {
                        arrayList2.add(next);
                    }
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "d", 2937, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider removed blacklisted packages: %s", (Object) aucx);
                if (arrayList2.isEmpty()) {
                    intent.setDataAndType((Uri) null, (String) null);
                    intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2899, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open file attachment with unknown destination.");
            }
        } else if (attachment2.e()) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) attachment2;
            String str3 = wifiCredentialsAttachment.a;
            a(1, (int) R.string.sharing_toast_wifi_connecting, str3);
            int i6 = wifiCredentialsAttachment.b;
            wgg wgg3 = (wgg) this.b.get(wifiCredentialsAttachment);
            if (wgg3 != null) {
                vnx = wgg3.b;
            } else {
                vnx = null;
            }
            if (vnx == null) {
                ((anih) ((anih) vvj.a.c()).a("wgu", "b", 2876, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
            } else {
                String str4 = vnx.b;
                boolean z2 = vnx.c;
                Context context = this.f;
                if (i6 == 1) {
                    str2 = "Open";
                } else if (i6 == 2) {
                    str2 = "PSK";
                } else if (i6 == 3) {
                    str2 = "WEP";
                }
                if (str2 == null) {
                    acwa = acws.a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", new Object[]{str3})));
                } else {
                    acqy acqy = new acqy(context.getApplicationContext());
                    acqp acqp = new acqp();
                    if (str4 != null) {
                        acqp.a.c = str4;
                    }
                    ConnectToWifiNetworkRequest connectToWifiNetworkRequest = acqp.a;
                    connectToWifiNetworkRequest.a = str3;
                    connectToWifiNetworkRequest.b = str2;
                    connectToWifiNetworkRequest.d = z2;
                    iva.a((Object) connectToWifiNetworkRequest);
                    acwa = acqy.b((ihb) new acqx(connectToWifiNetworkRequest));
                }
                acwa.a((acvv) new wej(this, str3));
                acwa.a((acvs) new wek(this, str3));
            }
            intent.setAction("android.settings.WIFI_SETTINGS");
            return intent;
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgu", "x", 2864, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open attachment of unknown type");
        }
        return intent;
    }

    private final byte[] y(ShareTarget shareTarget) {
        wcd wcd = l(shareTarget).b;
        if (wcd != null) {
            vhj vhj = wcd.b;
            if ((vhj.a & 8) != 0) {
                auay auay = vhj.e;
                if (auay.a() == 6) {
                    return auay.k();
                }
            }
        }
        return null;
    }

    private final void z(ShareTarget shareTarget) {
        this.b.keySet().removeAll(shareTarget.b());
    }

    public final int e(ShareTarget shareTarget) {
        ShareTarget shareTarget2 = shareTarget;
        this.e.a();
        wcx i2 = i(shareTarget);
        if (i2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "e", 788, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Accept invoked for unknown share target");
            return 35511;
        }
        vtx k2 = k(shareTarget);
        if (k2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "e", 794, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Accept invoked for share target without TransferUpdateCallback");
            i2.b();
            return 35511;
        }
        vva vva = this.o;
        long j2 = this.u;
        List b2 = shareTarget.b();
        aucd d2 = vvb.d(18);
        aucd o2 = aslm.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslm aslm = (aslm) o2.b;
        aslm.a |= 1;
        aslm.b = j2;
        asld a2 = vvb.a(b2);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslm aslm2 = (aslm) o2.b;
        a2.getClass();
        aslm2.c = a2;
        aslm2.a |= 2;
        aslm aslm3 = (aslm) o2.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslm3.getClass();
        asmc.s = aslm3;
        asmc.a |= 262144;
        vva.a(new vut((asmc) d2.i()));
        i2.a((wcw) new wfu(this, k2, shareTarget2));
        wgb wgb = new wgb(this, shareTarget, k2, i2, shareTarget);
        List b3 = shareTarget.b();
        int size = b3.size();
        for (int i3 = 0; i3 < size; i3++) {
            Attachment attachment = (Attachment) b3.get(i3);
            long b4 = b(attachment);
            if (b4 == -1) {
                ((anih) ((anih) vvj.a.c()).a("wgu", "e", 858, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve payload for: %s", (Object) attachment);
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgu", "e", 861, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Started listening for progress on payload %d", b4);
                this.g.a(b4, (wdn) wgb);
                ((anih) ((anih) vvj.a.d()).a("wgu", "e", 863, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Accepted ShareTarget %s's incoming files", (Object) shareTarget2);
            }
        }
        aucd o3 = vne.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        vne vne = (vne) o3.b;
        vne.b = 1;
        vne.a |= 1;
        try {
            a(i2, (vne) o3.i());
            this.v = SystemClock.uptimeMillis();
            ((anih) ((anih) vvj.a.d()).a("wgu", "e", 881, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote the response frame");
            k2.a(shareTarget2, u(shareTarget));
            b(i2);
            String j3 = j(shareTarget);
            if (j3 != null) {
                this.g.f(j3);
                return 0;
            }
            ((anih) ((anih) vvj.a.c()).a("wgu", "e", 889, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to initiate bandwidth upgrade. No endpointId found for ShareTarget %s", (Object) shareTarget2);
            return 35511;
        } catch (IOException e2) {
            k2.a(shareTarget2, new vtv(7).a());
            i2.b();
            return 35510;
        }
    }

    public List f() {
        aosh f2 = aosh.f();
        a((Runnable) new wef(this, f2));
        List list = (List) thr.c("getDiscoveredShareTargets", f2, ayni.h());
        return list == null ? amzy.h() : list;
    }

    public final int g(ShareTarget shareTarget) {
        ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1850, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Preparing to send payloads to %s", (Object) shareTarget);
        wcx o2 = o(shareTarget);
        if (o2 == null) {
            this.q.a(shareTarget);
            ((anih) ((anih) vvj.a.c()).a("wgu", "g", 1857, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send payload due to missing connection.");
            return 35511;
        }
        vtx n2 = n(shareTarget);
        if (n2 == null) {
            o2.b();
            this.q.a(shareTarget);
            ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1865, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send payload due to missing TransferUpdateCallback. Disconnecting.");
            return 35511;
        }
        n2.a(shareTarget, u(shareTarget));
        String m2 = m(shareTarget);
        if (m2 == null) {
            n2.a(shareTarget, new vtv(7).a());
            o2.b();
            this.q.a(shareTarget);
            ((anih) ((anih) vvj.a.c()).a("wgu", "g", 1877, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send payload due to missing endpointId.");
            return 35511;
        }
        b((Runnable) new wed(this, o2, n2, m2, shareTarget));
        return 0;
    }

    public final wgl h(ShareTarget shareTarget) {
        wgl wgl = (wgl) this.B.get(shareTarget);
        if (wgl != null) {
            return wgl;
        }
        wgl wgl2 = new wgl();
        this.B.put(shareTarget, wgl2);
        return wgl2;
    }

    public final wcx i(ShareTarget shareTarget) {
        return h(shareTarget).c;
    }

    public final boolean i() {
        return this.h != null;
    }

    public final String j(ShareTarget shareTarget) {
        return h(shareTarget).a;
    }

    /* access modifiers changed from: package-private */
    public final vtx k(ShareTarget shareTarget) {
        return h(shareTarget).d;
    }

    public final String m(ShareTarget shareTarget) {
        return l(shareTarget).a;
    }

    /* access modifiers changed from: package-private */
    public final vtx n(ShareTarget shareTarget) {
        return l(shareTarget).d;
    }

    public final wcx o(ShareTarget shareTarget) {
        return l(shareTarget).c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.x = 0;
        this.m.h();
        this.n.a();
        this.g.e();
        this.q.d();
        ((anih) ((anih) vvj.a.d()).a("wgu", "p", 1224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider has been reset");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        o();
        this.g.c();
        m();
        this.y = a((Runnable) new wfm(this), ayni.a.a().i());
        this.h = null;
        vva vva = this.o;
        long j2 = this.r;
        aucd d2 = vvb.d(7);
        aucd o2 = aslq.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslq aslq = (aslq) o2.b;
        aslq.a |= 1;
        aslq.b = j2;
        aslq aslq2 = (aslq) o2.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslq2.getClass();
        asmc.h = aslq2;
        asmc.a |= 128;
        vva.a(new vuu((asmc) d2.i()));
        ((anih) ((anih) vvj.a.d()).a("wgu", "q", 1200, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped discovery");
    }

    public final tjc[] r(ShareTarget shareTarget) {
        return l(shareTarget).j;
    }

    public final void s(ShareTarget shareTarget) {
        if (shareTarget.i) {
            this.B.remove(shareTarget);
            this.g.d();
        } else {
            String m2 = m(shareTarget);
            j();
            if (m2 != null) {
                b(shareTarget, m2);
            }
        }
        this.e.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Integer t(ShareTarget shareTarget) {
        wcx i2 = i(shareTarget);
        if (i2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "t", 2424, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Deny invoked for unknown share target");
            return 35511;
        }
        int i3 = 35510;
        if (ayni.a.a().aI()) {
            jjg jjg = vvj.a;
            i2.a((wcw) new wez(this, tfu.b(new wex(i2), ayni.w(), this.d), shareTarget));
            aucd o2 = vne.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vne vne = (vne) o2.b;
            vne.b = 2;
            vne.a |= 1;
            try {
                a(i2, (vne) o2.i());
                ((anih) ((anih) vvj.a.d()).a("wgu", "t", 2458, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote a rejection response frame");
                i3 = 0;
            } catch (IOException e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("wgu", "t", 2460, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the rejection response frame");
            }
        } else {
            i2.a((wcw) new wfa(this, shareTarget));
            aucd o3 = vne.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vne vne2 = (vne) o3.b;
            vne2.b = 2;
            vne2.a |= 1;
            try {
                a(i2, (vne) o3.i());
                ((anih) ((anih) vvj.a.d()).a("wgu", "t", 2477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote a rejection response frame");
                i3 = 0;
            } catch (IOException e3) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("wgu", "t", 2479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the rejection response frame");
            }
            i2.a((wcw) new wfc(this, tfu.b(new wfb(i2), ayni.w(), this.d), shareTarget));
        }
        vtx k2 = k(shareTarget);
        if (k2 != null) {
            k2.a(shareTarget, new vtv(8).a());
        }
        return Integer.valueOf(i3);
    }

    public final void j() {
        int i2;
        ArrayList arrayList = new ArrayList(this.c.values());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            tjc[] tjcArr = ((wgm) arrayList.get(i3)).i;
            int length = tjcArr.length;
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 >= length) {
                    break;
                }
                tjcArr[i4].b();
                i4++;
            }
            i3 = i2;
        }
        this.c.clear();
    }

    public final void k() {
        if (i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "k", 1206, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring start background caching timeout because we're still scanning");
        } else {
            this.q.c();
        }
    }

    public final void m() {
        ScheduledFuture scheduledFuture = this.G;
        if (scheduledFuture != null) {
            this.G = null;
            scheduledFuture.cancel(true);
        }
        wgk wgk = this.F;
        if (wgk != null) {
            this.F = null;
            wgk.run();
        }
    }

    public final void n() {
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.STATE_CHANGED");
        intent.setPackage(this.f.getPackageName());
        this.f.sendBroadcast(intent);
        this.f.startService(intent);
        ((anih) ((anih) vvj.a.d()).a("wgu", "n", 3601, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Broadcasting NearbySharing state change");
    }

    public final void o() {
        thp.a(this.f, this.z);
    }

    private final int a(String str, Callable callable) {
        aosh f2 = aosh.f();
        a((Runnable) new wes(f2, callable));
        return thr.a(str, (Future) f2, ayni.h());
    }

    public final tjc[] p(ShareTarget shareTarget) {
        return l(shareTarget).h;
    }

    public final void h() {
        a((Runnable) new wen(this));
        tid.a(this.C, "NearbySharingProviderExecutor");
    }

    private final Intent a(Intent intent, FileAttachment fileAttachment) {
        Uri uri;
        wgg wgg = (wgg) this.b.get(fileAttachment);
        if (wgg != null) {
            uri = wgg.a;
        } else {
            uri = null;
        }
        if (uri != null) {
            intent.addFlags(1);
            intent.setDataAndType(uri, fileAttachment.f);
            intent.setAction("android.intent.action.VIEW");
            List<ResolveInfo> queryIntentActivities = this.f.getPackageManager().queryIntentActivities(intent, 65536);
            ArrayList arrayList = new ArrayList();
            aucx aucx = ayni.a.a().k().a;
            for (ResolveInfo next : queryIntentActivities) {
                if (!aucx.contains(next.activityInfo.packageName)) {
                    arrayList.add(next);
                }
            }
            ((anih) ((anih) vvj.a.d()).a("wgu", "d", 2937, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider removed blacklisted packages: %s", (Object) aucx);
            if (arrayList.isEmpty()) {
                intent.setDataAndType((Uri) null, (String) null);
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
            }
            return intent;
        }
        ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2899, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open file attachment with unknown destination.");
        return intent;
    }

    private final void d(wcx wcx) {
        List e2 = this.m.e();
        if (!e2.isEmpty() && this.D.c() != null) {
            aucd o2 = vnb.b.o();
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                vhn vhn = (vhn) e2.get(i2);
                aucd o3 = vnq.i.o();
                auay auay = vhn.b;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                vnq vnq = (vnq) o3.b;
                auay.getClass();
                int i3 = 1 | vnq.a;
                vnq.a = i3;
                vnq.b = auay;
                auay auay2 = vhn.c;
                auay2.getClass();
                int i4 = i3 | 2;
                vnq.a = i4;
                vnq.c = auay2;
                auay auay3 = vhn.d;
                auay3.getClass();
                int i5 = i4 | 4;
                vnq.a = i5;
                vnq.d = auay3;
                long j2 = vhn.e;
                int i6 = i5 | 8;
                vnq.a = i6;
                vnq.e = j2;
                long j3 = vhn.f;
                int i7 = i6 | 16;
                vnq.a = i7;
                vnq.f = j3;
                auay auay4 = vhn.g;
                auay4.getClass();
                int i8 = i7 | 32;
                vnq.a = i8;
                vnq.g = auay4;
                auay auay5 = vhn.h;
                auay5.getClass();
                vnq.a = i8 | 64;
                vnq.h = auay5;
                o2.a((vnq) o3.i());
            }
            try {
                vnb vnb = (vnb) o2.i();
                aucd o4 = vnk.d.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                vnk vnk = (vnk) o4.b;
                vnk.b = 1;
                vnk.a |= 1;
                aucd o5 = vnw.h.o();
                vnv vnv = vnv.CERTIFICATE_INFO;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                vnw vnw = (vnw) o5.b;
                vnw.b = vnv.g;
                int i9 = vnw.a | 1;
                vnw.a = i9;
                vnb.getClass();
                vnw.g = vnb;
                vnw.a = i9 | 32;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                vnk vnk2 = (vnk) o4.b;
                vnw vnw2 = (vnw) o5.i();
                vnw2.getClass();
                vnk2.c = vnw2;
                vnk2.a |= 2;
                wcx.a(((vnk) o4.i()).k());
            } catch (IOException e3) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e3);
                ((anih) anih.a("wgu", "d", 3470, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write CertificateInfoFrame.");
            }
        }
    }

    public final wgn f(ShareTarget shareTarget) {
        byte b2;
        byte b3;
        boolean z2;
        wcd wcd;
        wcx wcx;
        String str;
        vnm vnm;
        wgn wgn;
        vnw vnw;
        byte[] bArr;
        wgn wgn2;
        byte b4;
        int i2;
        wgn wgn3;
        wgn wgn4;
        char c2;
        wgn wgn5;
        byte[] bArr2;
        ShareTarget shareTarget2 = shareTarget;
        if (!shareTarget2.i) {
            str = m(shareTarget);
            wcx = o(shareTarget);
            wcd = l(shareTarget).b;
            z2 = false;
            b3 = 1;
            b2 = 2;
        } else {
            str = j(shareTarget);
            wcx = i(shareTarget);
            wcd = h(shareTarget).b;
            z2 = this.j != wbw.HIGH_POWER;
            b3 = 2;
            b2 = 1;
        }
        if (str == null || wcx == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1262, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No endpoint id or connection tied to %s.", (Object) shareTarget2);
            return wgn.FAIL;
        }
        byte[] d2 = this.g.d(str);
        if (d2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1269, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read authenticationToken from connection: %s.", (Object) str);
            return wgn.FAIL;
        }
        byte[] a2 = this.m.a(a(b3, d2));
        if (a2 == null) {
            vnm = vnm.d;
        } else {
            if (wcd != null) {
                bArr2 = whu.a(d2, wcd.a.c.k(), 6);
            } else {
                bArr2 = whu.a(6);
            }
            if (bArr2 == null) {
                bArr2 = whu.a(6);
            }
            aucd o2 = vnm.d.o();
            auay a3 = auay.a(a2);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vnm vnm2 = (vnm) o2.b;
            a3.getClass();
            vnm2.a |= 1;
            vnm2.b = a3;
            auay a4 = auay.a(bArr2);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vnm vnm3 = (vnm) o2.b;
            a4.getClass();
            vnm3.a |= 2;
            vnm3.c = a4;
            vnm = (vnm) o2.i();
        }
        try {
            aucd o3 = vnk.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vnk vnk = (vnk) o3.b;
            vnk.b = 1;
            vnk.a |= 1;
            aucd o4 = vnw.h.o();
            vnv vnv = vnv.PAIRED_KEY_ENCRYPTION;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            vnw vnw2 = (vnw) o4.b;
            vnw2.b = vnv.g;
            int i3 = vnw2.a | 1;
            vnw2.a = i3;
            vnm.getClass();
            vnw2.e = vnm;
            vnw2.a = i3 | 8;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            vnk vnk2 = (vnk) o3.b;
            vnw vnw3 = (vnw) o4.i();
            vnw3.getClass();
            vnk2.c = vnw3;
            vnk2.a |= 2;
            wcx.a(((vnk) o3.i()).k());
            ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1279, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wrote paired key encryption when connecting to %s.", (Object) shareTarget2);
            vnw a5 = a(wcx, vnv.PAIRED_KEY_ENCRYPTION);
            if (a5 == null) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read remote paired key encryption when connection to %s.", (Object) shareTarget2);
                return wgn.FAIL;
            }
            vnm vnm4 = a5.e;
            if (vnm4 == null) {
                vnm4 = vnm.d;
            }
            vhk d3 = this.m.d();
            if (d3 == null) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4076, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote certificate. Failed to load a valid local certificate.");
                wgn = wgn.UNABLE;
            } else if (Arrays.equals(vnm4.c.k(), whu.a(d2, d3.d.k(), 6))) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4087, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully verified remote certificate.");
                wgn = wgn.SUCCESS;
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4091, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote certificate.");
                wgn = wgn.UNABLE;
            }
            if (wgn == wgn.SUCCESS) {
                List e2 = this.m.e();
                if (e2.isEmpty()) {
                    vnw = a5;
                    wgn2 = wgn;
                    b4 = b2;
                    bArr = d2;
                    i2 = 4;
                } else if (this.D.c() != null) {
                    aucd o5 = vnb.b.o();
                    int size = e2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        List list = e2;
                        vhn vhn = (vhn) e2.get(i4);
                        int i5 = size;
                        aucd o6 = vnq.i.o();
                        wgn wgn6 = wgn;
                        auay auay = vhn.b;
                        byte b5 = b2;
                        if (o6.c) {
                            o6.c();
                            o6.c = false;
                        }
                        vnq vnq = (vnq) o6.b;
                        auay.getClass();
                        byte[] bArr3 = d2;
                        int i6 = vnq.a | 1;
                        vnq.a = i6;
                        vnq.b = auay;
                        auay auay2 = vhn.c;
                        auay2.getClass();
                        int i7 = i6 | 2;
                        vnq.a = i7;
                        vnq.c = auay2;
                        auay auay3 = vhn.d;
                        auay3.getClass();
                        int i8 = i7 | 4;
                        vnq.a = i8;
                        vnq.d = auay3;
                        vnw vnw4 = a5;
                        long j2 = vhn.e;
                        int i9 = i8 | 8;
                        vnq.a = i9;
                        vnq.e = j2;
                        long j3 = vhn.f;
                        int i10 = i9 | 16;
                        vnq.a = i10;
                        vnq.f = j3;
                        auay auay4 = vhn.g;
                        auay4.getClass();
                        int i11 = i10 | 32;
                        vnq.a = i11;
                        vnq.g = auay4;
                        auay auay5 = vhn.h;
                        auay5.getClass();
                        vnq.a = i11 | 64;
                        vnq.h = auay5;
                        o5.a((vnq) o6.i());
                        i4++;
                        b2 = b5;
                        e2 = list;
                        size = i5;
                        wgn = wgn6;
                        d2 = bArr3;
                        a5 = vnw4;
                    }
                    vnw = a5;
                    wgn2 = wgn;
                    b4 = b2;
                    bArr = d2;
                    i2 = 4;
                    try {
                        vnb vnb = (vnb) o5.i();
                        aucd o7 = vnk.d.o();
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        vnk vnk3 = (vnk) o7.b;
                        vnk3.b = 1;
                        vnk3.a |= 1;
                        aucd o8 = vnw.h.o();
                        vnv vnv2 = vnv.CERTIFICATE_INFO;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        vnw vnw5 = (vnw) o8.b;
                        vnw5.b = vnv2.g;
                        int i12 = vnw5.a | 1;
                        vnw5.a = i12;
                        vnb.getClass();
                        vnw5.g = vnb;
                        vnw5.a = i12 | 32;
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        vnk vnk4 = (vnk) o7.b;
                        vnw vnw6 = (vnw) o8.i();
                        vnw6.getClass();
                        vnk4.c = vnw6;
                        vnk4.a |= 2;
                        wcx.a(((vnk) o7.i()).k());
                    } catch (IOException e3) {
                        anih anih = (anih) vvj.a.c();
                        anih.a((Throwable) e3);
                        ((anih) anih.a("wgu", "d", 3470, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write CertificateInfoFrame.");
                    }
                } else {
                    vnw = a5;
                    wgn2 = wgn;
                    b4 = b2;
                    bArr = d2;
                    i2 = 4;
                }
            } else {
                vnw = a5;
                wgn2 = wgn;
                b4 = b2;
                bArr = d2;
                i2 = 4;
                if (z2) {
                    ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1302, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Rejecting connection from unknown ShareTarget %s because we're only allowing connections with contacts.", (Object) shareTarget2);
                    return wgn.FAIL;
                }
            }
            vnm vnm5 = vnw.e;
            if (vnm5 == null) {
                vnm5 = vnm.d;
            }
            if (wcd == null) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4044, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote paired key encryption frame. Cannot locate remote certificate.");
                wgn3 = wgn.UNABLE;
            } else if (!this.m.a(wcd.a.d.k(), a(b4, bArr), vnm5.b.k())) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4054, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify remote paired key encryption frame.");
                wgn3 = wgn.FAIL;
            } else if (!shareTarget2.k) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4059, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote paired key encryption frame. Remote side is not a known share target.");
                wgn3 = wgn.UNABLE;
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4065, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully verified remote paired key encryption frame.");
                wgn3 = wgn.SUCCESS;
            }
            try {
                aucd o9 = vnp.c.o();
                vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
                int ordinal = wgn3.ordinal();
                if (ordinal == 0) {
                    i2 = 2;
                } else if (ordinal == 1) {
                    i2 = 3;
                } else if (ordinal != 2) {
                    i2 = 1;
                }
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                vnp vnp = (vnp) o9.b;
                vnp.b = i2 - 1;
                vnp.a |= 1;
                vnp vnp2 = (vnp) o9.i();
                aucd o10 = vnk.d.o();
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                vnk vnk5 = (vnk) o10.b;
                vnk5.b = 1;
                vnk5.a |= 1;
                aucd o11 = vnw.h.o();
                vnv vnv3 = vnv.PAIRED_KEY_RESULT;
                if (o11.c) {
                    o11.c();
                    o11.c = false;
                }
                vnw vnw7 = (vnw) o11.b;
                vnw7.b = vnv3.g;
                int i13 = vnw7.a | 1;
                vnw7.a = i13;
                vnp2.getClass();
                vnw7.f = vnp2;
                vnw7.a = i13 | 16;
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                vnk vnk6 = (vnk) o10.b;
                vnw vnw8 = (vnw) o11.i();
                vnw8.getClass();
                vnk6.c = vnw8;
                vnk6.a |= 2;
                wcx.a(((vnk) o10.i()).k());
                ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1322, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wrote paired key verification result %s when connecting to %s.", (Object) wgn3, (Object) shareTarget2);
                vnw a6 = a(wcx, vnv.PAIRED_KEY_RESULT);
                if (a6 == null) {
                    ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1333, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read paired key verification when connecting to %s.", (Object) shareTarget2);
                    return wgn.FAIL;
                }
                vnp vnp3 = a6.f;
                if (vnp3 == null) {
                    vnp3 = vnp.c;
                }
                int a7 = vno.a(vnp3.b);
                if (a7 == 0) {
                    a7 = 1;
                }
                wgn[] wgnArr = new wgn[3];
                int i14 = 0;
                wgnArr[0] = wgn3;
                wgnArr[1] = wgn2;
                int i15 = a7 - 1;
                if (i15 != 1) {
                    c2 = 2;
                    wgn4 = i15 != 2 ? wgn.UNABLE : wgn.FAIL;
                } else {
                    c2 = 2;
                    wgn4 = wgn.SUCCESS;
                }
                wgnArr[c2] = wgn4;
                int i16 = 0;
                while (true) {
                    if (i14 < 3) {
                        wgn wgn7 = wgnArr[i14];
                        if (wgn7 == wgn.FAIL) {
                            wgn5 = wgn.FAIL;
                            break;
                        }
                        if (wgn7 == wgn.SUCCESS) {
                            i16++;
                        }
                        i14++;
                    } else {
                        wgn5 = i16 == 3 ? wgn.SUCCESS : wgn.UNABLE;
                    }
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "f", 1343, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received local result %s, remote result %s, and remote certificate result %s. Combined, we settled on %s.", wgn3, a7 != 1 ? a7 != 2 ? a7 != 3 ? "UNABLE" : "FAIL" : "SUCCESS" : "UNKNOWN", wgn2, wgn5);
                return wgn5;
            } catch (IOException e4) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e4);
                ((anih) anih2.a("wgu", "f", 1326, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read paired key verification result when connecting to %s.", (Object) shareTarget2);
                return wgn.FAIL;
            }
        } catch (IOException e5) {
            anih anih3 = (anih) vvj.a.c();
            anih3.a((Throwable) e5);
            ((anih) anih3.a("wgu", "f", 1281, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write paired key encryption when connecting to %s.", (Object) shareTarget2);
            return wgn.FAIL;
        }
    }

    public final wgm l(ShareTarget shareTarget) {
        wgm wgm = (wgm) this.c.get(shareTarget);
        if (wgm != null) {
            return wgm;
        }
        wgm wgm2 = new wgm();
        this.c.put(shareTarget, wgm2);
        return wgm2;
    }

    private final vnw b(wcx wcx, vnv vnv) {
        vnw a2 = a(wcx);
        if (a2 == null) {
            return null;
        }
        vnv a3 = vnv.a(a2.b);
        if (a3 == null) {
            a3 = vnv.UNKNOWN_FRAME_TYPE;
        }
        if (!vnv.equals(a3)) {
            anih anih = (anih) ((anih) vvj.a.c()).a("wgu", "b", 4194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String name = vnv.name();
            vnv a4 = vnv.a(a2.b);
            if (a4 == null) {
                a4 = vnv.UNKNOWN_FRAME_TYPE;
            }
            anih.a("Failed to read %s frame, but got %s. Cached for later.", (Object) name, (Object) a4.name());
            ConcurrentMap concurrentMap = this.l;
            vnv a5 = vnv.a(a2.b);
            if (a5 == null) {
                a5 = vnv.UNKNOWN_FRAME_TYPE;
            }
            concurrentMap.put(a5, a2);
            return null;
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "b", 4201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read %s frame", (Object) vnv.name());
        return a2;
    }

    public void g() {
        a((Runnable) new wec(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        if (!i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1070, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        vsh vsh = this.h;
        this.a.remove(str);
        ShareTarget d2 = d(str);
        if (d2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1079, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", (Object) str);
            return;
        }
        vsh.b(d2);
        this.q.a(d2);
        ((anih) ((anih) vvj.a.d()).a("wgu", "g", 1086, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported onShareTargetLost for %s", (Object) d2);
    }

    public final tjc[] q(ShareTarget shareTarget) {
        return l(shareTarget).i;
    }

    private final Uri a(wcd wcd) {
        File file;
        if (wcd != null) {
            vhj vhj = wcd.b;
            if ((vhj.a & 4) != 0) {
                Context context = this.f;
                String str = vhj.d;
                if (TextUtils.isEmpty(str)) {
                    jjg jjg = vvj.a;
                    file = null;
                } else if (!wij.a(str)) {
                    jjg jjg2 = vvj.a;
                    file = null;
                } else {
                    File a2 = wij.a(context);
                    String a3 = whw.a(whw.c(context, Uri.parse(str)));
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(str.hashCode());
                    if (TextUtils.isEmpty(a3)) {
                        a3 = "jpg";
                    }
                    objArr[1] = a3;
                    file = new File(a2, String.format("%s.%s", objArr));
                    if (!file.exists()) {
                        if (!wij.a(str)) {
                            jjg jjg3 = vvj.a;
                        } else if (whw.c(whw.c(context, Uri.parse(str)))) {
                            int lastIndexOf = str.lastIndexOf(47);
                            if (lastIndexOf == -1) {
                                jjg jjg4 = vvj.a;
                            } else {
                                int a4 = wid.a(context, 64);
                                int i2 = lastIndexOf + 1;
                                String substring = str.substring(0, i2);
                                String format = String.format("s%s-c/", new Object[]{Integer.valueOf(a4)});
                                String substring2 = str.substring(i2);
                                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(format).length() + String.valueOf(substring2).length());
                                sb.append(substring);
                                sb.append(format);
                                sb.append(substring2);
                                str = sb.toString();
                                jjg jjg5 = vvj.a;
                            }
                        } else {
                            jjg jjg6 = vvj.a;
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        try {
                            new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str, new wii(file, countDownLatch), tid.c()).build().start();
                            try {
                                countDownLatch.await(ayni.a.a().M(), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                file = null;
                            }
                        } catch (IllegalStateException e3) {
                            anih anih = (anih) vvj.a.c();
                            anih.a((Throwable) e3);
                            ((anih) anih.a("wij", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to download Url %s. Cronet provider is unavailable on this device.", (Object) str);
                            file = null;
                        }
                    }
                }
                if (file == null) {
                    return null;
                }
                try {
                    return ki.a(this.f, "com.google.android.gms.fileprovider", file);
                } catch (IllegalArgumentException e4) {
                    anih anih2 = (anih) vvj.a.d();
                    anih2.a((Throwable) e4);
                    ((anih) anih2.a("wgu", "a", 2990, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get content Uri for %s", (Object) file);
                    return null;
                }
            }
        }
        return null;
    }

    private final void b(WifiCredentialsAttachment wifiCredentialsAttachment) {
        vnx vnx;
        acwa acwa;
        String str = wifiCredentialsAttachment.a;
        a(1, (int) R.string.sharing_toast_wifi_connecting, str);
        int i2 = wifiCredentialsAttachment.b;
        wgg wgg = (wgg) this.b.get(wifiCredentialsAttachment);
        String str2 = null;
        if (wgg != null) {
            vnx = wgg.b;
        } else {
            vnx = null;
        }
        if (vnx == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "b", 2876, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
            return;
        }
        String str3 = vnx.b;
        boolean z2 = vnx.c;
        Context context = this.f;
        if (i2 == 1) {
            str2 = "Open";
        } else if (i2 == 2) {
            str2 = "PSK";
        } else if (i2 == 3) {
            str2 = "WEP";
        }
        if (str2 == null) {
            acwa = acws.a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", new Object[]{str})));
        } else {
            acqy acqy = new acqy(context.getApplicationContext());
            acqp acqp = new acqp();
            if (str3 != null) {
                acqp.a.c = str3;
            }
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = acqp.a;
            connectToWifiNetworkRequest.a = str;
            connectToWifiNetworkRequest.b = str2;
            connectToWifiNetworkRequest.d = z2;
            iva.a((Object) connectToWifiNetworkRequest);
            acwa = acqy.b((ihb) new acqx(connectToWifiNetworkRequest));
        }
        acwa.a((acvv) new wej(this, str));
        acwa.a((acvs) new wek(this, str));
    }

    static final void b(Runnable runnable) {
        tid.b().execute(runnable);
    }

    private final tjc[] b(List list) {
        int size = list.size();
        tjc[] tjcArr = new tjc[size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            TextAttachment textAttachment = (TextAttachment) list.get(i2);
            tjc a2 = tjc.a(textAttachment.a.getBytes());
            tjcArr[i2] = a2;
            a((Attachment) textAttachment, a2.a);
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "b", 2032, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created text payloads of length %d", size);
        return tjcArr;
    }

    public final int b(Contact contact) {
        return a("unmarkContactAsSelected", (Callable) new wer(this, contact));
    }

    public int b(ShareTarget shareTarget) {
        return a("deny", (Callable) new weg(this, shareTarget));
    }

    /* access modifiers changed from: package-private */
    public final long b(Attachment attachment) {
        wgg wgg = (wgg) this.b.get(attachment);
        if (wgg != null) {
            return wgg.c;
        }
        return -1;
    }

    public void b() {
        a((Runnable) new wfv(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(ShareTarget shareTarget, String str) {
        l(shareTarget).a = str;
    }

    public int d(ShareTarget shareTarget) {
        String str;
        vtx vtx;
        wcx wcx;
        if (!shareTarget.i) {
            wcx = o(shareTarget);
            vtx = n(shareTarget);
            str = m(shareTarget);
            m();
        } else {
            wcx = i(shareTarget);
            vtx = k(shareTarget);
            str = j(shareTarget);
        }
        z(shareTarget);
        if (vtx != null) {
            vtx.a(shareTarget, new vtv(9).a());
        }
        List b2 = shareTarget.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            long b3 = b((Attachment) b2.get(i2));
            if (b3 != -1) {
                this.g.b(b3);
            }
        }
        if (wcx != null) {
            wcx.b();
            return 0;
        } else if (str == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "d", 2679, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No endpointId tied to %s. Failed to cancel payloads.", (Object) shareTarget);
            s(shareTarget);
            return 35511;
        } else {
            this.g.b(str);
            s(shareTarget);
            return 0;
        }
    }

    public final void e() {
        a((Runnable) new weo(this));
    }

    public final void b(String str) {
        if (!i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1038, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring expired endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        vsh vsh = this.h;
        ArrayList arrayList = new ArrayList(this.c.values());
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            wgm wgm = (wgm) arrayList.get(i2);
            i2++;
            if (str.equals(wgm.a)) {
                if (wgm.g) {
                    jjg jjg = vvj.a;
                    return;
                }
            }
        }
        ShareTarget d2 = d(str);
        if (d2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1055, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", (Object) str);
            return;
        }
        vsh.b(d2);
        ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1061, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported expired ShareTarget %s", (Object) d2);
    }

    public final byte[] e(String str) {
        byte[] bArr;
        wce c2 = this.m.c();
        if (str != null) {
            bArr = str.getBytes();
        } else {
            bArr = null;
        }
        byte[] a2 = wby.a(wby.a(c2.b, c2.a, bArr));
        ((anih) ((anih) vvj.a.d()).a("wgu", "e", 3900, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created endpointInfo: %s", (Object) whu.b(a2));
        return a2;
    }

    public static vnw a(wcx wcx) {
        byte[] bArr;
        String str;
        try {
            synchronized (wcx.b) {
                bArr = (byte[]) wcx.d.poll();
                while (bArr == null) {
                    if (!wcx.e) {
                        try {
                            wcx.b.wait();
                            bArr = (byte[]) wcx.d.poll();
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while reading", e2);
                        }
                    } else {
                        throw new IOException("Connection closed. Quit reading.");
                    }
                }
                ((anih) ((anih) vvj.a.d()).a("wcx", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Read NearbyConnection message %s from %s", (Object) Arrays.toString(bArr), (Object) wcx.c);
                if (Arrays.equals(wcx.a, bArr)) {
                    throw new IOException("Connection closed. Quit reading.");
                }
            }
            vnk vnk = (vnk) aucj.a((aucj) vnk.d, bArr);
            int a2 = vnj.a(vnk.b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 2) {
                anih anih = (anih) ((anih) vvj.a.c()).a("wgu", "a", 4217, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                int a3 = vnj.a(vnk.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 != 1) {
                    str = "V1";
                } else {
                    str = "UNKNOWN_VERSION";
                }
                anih.a("Failed to read V1 frame, but got %s", (Object) str);
                return null;
            }
            vnw vnw = vnk.c;
            if (vnw == null) {
                vnw = vnw.h;
            }
            vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
            vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
            wgn wgn = wgn.SUCCESS;
            vnv a4 = vnv.a(vnw.b);
            if (a4 == null) {
                a4 = vnv.UNKNOWN_FRAME_TYPE;
            }
            int ordinal = a4.ordinal();
            if (ordinal == 1 ? (vnw.a & 2) == 0 : ordinal == 2 ? (vnw.a & 4) == 0 : ordinal == 3 ? (vnw.a & 8) == 0 : ordinal == 4 ? (vnw.a & 16) == 0 : ordinal != 5 || (vnw.a & 32) == 0) {
                anih anih2 = (anih) ((anih) vvj.a.c()).a("wgu", "a", 4223, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                vnw vnw2 = vnk.c;
                if (vnw2 == null) {
                    vnw2 = vnw.h;
                }
                vnv a5 = vnv.a(vnw2.b);
                if (a5 == null) {
                    a5 = vnv.UNKNOWN_FRAME_TYPE;
                }
                anih2.a("Failed to read invalid %s frame", (Object) a5.name());
                return null;
            }
            vnw vnw3 = vnk.c;
            return vnw3 == null ? vnw.h : vnw3;
        } catch (IOException e3) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str, int i2) {
        if (!i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1096, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring distance changed for endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        ShareTarget c2 = c(str);
        if (c2 != null) {
            this.h.a(c2, i2);
        }
    }

    public final ShareTarget d(String str) {
        ArrayList arrayList = new ArrayList(this.c.entrySet());
        int size = arrayList.size();
        ShareTarget shareTarget = null;
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i2);
            if (str.equals(((wgm) entry.getValue()).a)) {
                this.c.remove(entry.getKey());
                if (shareTarget == null || shareTarget.a < ((ShareTarget) entry.getKey()).a) {
                    shareTarget = (ShareTarget) entry.getKey();
                }
            }
        }
        return shareTarget;
    }

    public final void b(String str, ShareTarget shareTarget, vtx vtx) {
        wgk wgk = new wgk(new wdw(this));
        if (this.g.a((wdl) new wgd(this, shareTarget, vtx, wgk)) != 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1449, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to outdated %s, because failed to start discovery.", (Object) shareTarget);
            vtx.a(shareTarget, new vtv(7).a());
            return;
        }
        this.F = wgk;
        this.G = a((Runnable) wgk, ayni.a.a().aN());
        b((Runnable) new wdx(this, wgk, str, shareTarget, vtx));
    }

    public final void d() {
        a((Runnable) new wdu(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(vsh vsh, wbt wbt) {
        int i2;
        g();
        this.q.b = new wfn(this);
        j();
        m();
        int a2 = this.g.a((wdl) this);
        int i3 = 3;
        if (a2 != 0) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "b", 952, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to discover over Nearby Connections: %s", (Object) tit.g(a2));
            i2 = 3;
        } else {
            this.a.clear();
            NearbySharingProvider$4 nearbySharingProvider$4 = new NearbySharingProvider$4(this, "nearby");
            this.z = nearbySharingProvider$4;
            thp.a(this.f, nearbySharingProvider$4, new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD"));
            this.h = vsh;
            this.k = wbt.a;
            ScheduledFuture scheduledFuture = this.y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.q.b();
            List a3 = this.q.a();
            int size = a3.size();
            for (int i4 = 0; i4 < size; i4++) {
                wct wct = (wct) a3.get(i4);
                a(wct.a, wct.b, false);
                jjg jjg = vvj.a;
                String str = wct.a;
            }
            this.w = SystemClock.uptimeMillis();
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 949, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully started discovery over Nearby Connections");
            i2 = 2;
        }
        this.o.a = vva.a();
        long a4 = (long) vva.a();
        this.r = a4;
        vva vva = this.o;
        int i5 = wbt.b.a;
        aucd d2 = vvb.d(6);
        aucd o2 = aslr.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslr aslr = (aslr) o2.b;
        int i6 = aslr.a | 1;
        aslr.a = i6;
        aslr.b = a4;
        aslr.c = i2 - 1;
        aslr.a = i6 | 2;
        if (ayni.a.a().c()) {
            if (i5 == 1) {
                i3 = 2;
            } else if (i5 == 2) {
                i3 = 4;
            } else if (i5 != 3) {
                i3 = 1;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aslr aslr2 = (aslr) o2.b;
            aslr2.d = i3 - 1;
            aslr2.a = 4 | aslr2.a;
        }
        aslr aslr3 = (aslr) o2.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslr3.getClass();
        asmc.g = aslr3;
        asmc.a |= 64;
        vva.a(new vuu((asmc) d2.i()));
    }

    private final vnw a(wcx wcx, vnv vnv) {
        return a(wcx, vnv, ayni.a.a().aD());
    }

    private final wgn a(vnm vnm, byte b2, byte[] bArr, wcd wcd, ShareTarget shareTarget) {
        if (wcd == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4044, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote paired key encryption frame. Cannot locate remote certificate.");
            return wgn.UNABLE;
        } else if (!this.m.a(wcd.a.d.k(), a(b2, bArr), vnm.b.k())) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4054, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify remote paired key encryption frame.");
            return wgn.FAIL;
        } else if (!shareTarget.k) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4059, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote paired key encryption frame. Remote side is not a known share target.");
            return wgn.UNABLE;
        } else {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4065, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully verified remote paired key encryption frame.");
            return wgn.SUCCESS;
        }
    }

    private final wgn a(vnm vnm, byte[] bArr) {
        vhk d2 = this.m.d();
        if (d2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4076, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote certificate. Failed to load a valid local certificate.");
            return wgn.UNABLE;
        } else if (Arrays.equals(vnm.c.k(), whu.a(bArr, d2.d.k(), 6))) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4087, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully verified remote certificate.");
            return wgn.SUCCESS;
        } else {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4091, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify remote certificate.");
            return wgn.UNABLE;
        }
    }

    static final /* synthetic */ void a(long j2, wcx wcx) {
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timing out reading from NearbyConnection after %d ms. Closing connection.", j2);
        wcx.b();
    }

    private final void a(ShareTarget shareTarget, int i2) {
        int i3;
        wcx i4 = i(shareTarget);
        if (i4 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2519, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail invoked for unknown share target");
            return;
        }
        jjg jjg = vvj.a;
        i4.a((wcw) new wei(this, tfu.b(new weh(i4), ayni.w(), this.d), shareTarget));
        if (i2 != 13) {
            i3 = i2 != 14 ? 1 : 5;
        } else {
            i3 = 4;
        }
        aucd o2 = vne.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        vne vne = (vne) o2.b;
        vne.b = i3 - 1;
        vne.a = 1 | vne.a;
        try {
            a(i4, (vne) o2.i());
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2560, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully wrote a %s response frame", (Object) vnd.a(i3));
        } catch (IOException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wgu", "a", 2562, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write the %s response frame", (Object) vnd.a(i3));
        }
        vtx k2 = k(shareTarget);
        if (k2 != null) {
            k2.a(shareTarget, new vtv(i2).a());
        }
    }

    public final void b(wcx wcx) {
        new jfx(9, new weu(this, wcx)).start();
    }

    private final tjc[] c(List list) {
        int size = list.size();
        tjc[] tjcArr = new tjc[size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list.get(i2);
            aucd o2 = vnx.d.o();
            String str = wifiCredentialsAttachment.d;
            if (str != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                vnx vnx = (vnx) o2.b;
                str.getClass();
                vnx.a |= 1;
                vnx.b = str;
            }
            boolean z2 = wifiCredentialsAttachment.e;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vnx vnx2 = (vnx) o2.b;
            vnx2.a |= 2;
            vnx2.c = z2;
            tjc a2 = tjc.a(((vnx) o2.i()).k());
            tjcArr[i2] = a2;
            a((Attachment) wifiCredentialsAttachment, a2.a);
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "c", 2055, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created wifi payloads of length %d", size);
        return tjcArr;
    }

    public static void a(Map map) {
        anhk i2 = amzy.a((Collection) map.keySet()).listIterator();
        while (i2.hasNext()) {
            Object next = i2.next();
            wgh wgh = (wgh) map.get(next);
            if (wgh != null && TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - wgh.e) > ayni.a.a().n()) {
                map.remove(next);
            }
        }
    }

    public static void a(wcx wcx, vne vne) {
        aucd o2 = vnk.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        vnk vnk = (vnk) o2.b;
        vnk.b = 1;
        vnk.a |= 1;
        aucd o3 = vnw.h.o();
        vnv vnv = vnv.RESPONSE;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        vnw vnw = (vnw) o3.b;
        vnw.b = vnv.g;
        int i2 = 1 | vnw.a;
        vnw.a = i2;
        vne.getClass();
        vnw.d = vne;
        vnw.a = i2 | 4;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        vnk vnk2 = (vnk) o2.b;
        vnw vnw2 = (vnw) o3.i();
        vnw2.getClass();
        vnk2.c = vnw2;
        vnk2.a |= 2;
        wcx.a(((vnk) o2.i()).k());
    }

    public int c(ShareTarget shareTarget) {
        String str;
        String stringExtra;
        String str2;
        vnx vnx;
        acwa acwa;
        Uri uri;
        String str3;
        int i2;
        ShareTarget shareTarget2 = shareTarget;
        PackageManager packageManager = this.f.getPackageManager();
        List b2 = shareTarget.b();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(32768);
        String string = shareTarget2.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
        String str4 = "android.intent.extra.TEXT";
        if (string != null) {
            try {
                this.f.getPackageManager().getPackageInfo(string, 0);
                intent.setPackage(string);
                ((anih) ((anih) vvj.a.d()).a("wgu", "x", 2785, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Required package is installed on receiver device.");
            } catch (PackageManager.NameNotFoundException e2) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "x", 2775, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Required package is missing on receiver device.");
                intent.setPackage("com.android.vending").setAction("android.intent.action.VIEW").setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s&launch=true", new Object[]{string})));
                str = str4;
            }
        }
        if (b2.size() > 1) {
            int[] iArr = {1, 2};
            ArrayList arrayList = new ArrayList();
            int size = b2.size();
            int i3 = 0;
            while (i3 < size) {
                Attachment attachment = (Attachment) b2.get(i3);
                if (attachment.c()) {
                    FileAttachment fileAttachment = (FileAttachment) attachment;
                    int i4 = fileAttachment.b;
                    i2 = size;
                    int i5 = 0;
                    while (true) {
                        str3 = str4;
                        if (i5 >= 2) {
                            break;
                        } else if (i4 == iArr[i5]) {
                            arrayList.add(fileAttachment);
                            break;
                        } else {
                            i5++;
                            str4 = str3;
                        }
                    }
                } else {
                    str3 = str4;
                    i2 = size;
                }
                i3++;
                size = i2;
                str4 = str3;
            }
            String str5 = str4;
            if (arrayList.size() != b2.size()) {
                intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                str = str5;
            } else {
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                str = str5;
            }
        } else {
            String str6 = str4;
            Attachment attachment2 = (Attachment) b2.get(0);
            String str7 = null;
            if (attachment2.d()) {
                wgg wgg = (wgg) this.b.get(attachment2);
                if (wgg != null) {
                    str7 = wgg.d;
                }
                if (!TextUtils.isEmpty(str7)) {
                    int i6 = ((TextAttachment) shareTarget2.f.get(0)).b;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            if (str7.startsWith("https://") || str7.startsWith("http://")) {
                                str2 = str7;
                            } else {
                                String valueOf = String.valueOf(str7);
                                str2 = valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
                            }
                            intent.setAction("android.intent.action.VIEW").setData(Uri.parse(str2));
                            str = str6;
                        } else if (i6 == 2) {
                            Intent action = intent.setAction("android.intent.action.VIEW");
                            String valueOf2 = String.valueOf(Uri.encode(str7));
                            action.setData(Uri.parse(valueOf2.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf2)));
                            str = str6;
                        } else if (i6 != 3) {
                            str = str6;
                        } else {
                            Intent action2 = intent.setAction("android.intent.action.DIAL");
                            String valueOf3 = String.valueOf(str7);
                            action2.setData(Uri.parse(valueOf3.length() == 0 ? new String("tel:") : "tel:".concat(valueOf3)));
                            str = str6;
                        }
                    } else if (amrk.a(string)) {
                        str = str6;
                        intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f.getPackageName()).putExtra(str, str7).setType("text/plain");
                    } else {
                        str = str6;
                        intent.setAction("android.intent.action.VIEW").putExtra(str, str7).setType("text/plain");
                    }
                    if (intent.resolveActivity(packageManager) == null) {
                        intent.setAction("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD").setPackage(this.f.getPackageName()).setType("text/plain").putExtra(str, str7);
                    }
                } else {
                    str = str6;
                }
            } else if (attachment2.c()) {
                FileAttachment fileAttachment2 = (FileAttachment) attachment2;
                wgg wgg2 = (wgg) this.b.get(fileAttachment2);
                if (wgg2 != null) {
                    uri = wgg2.a;
                } else {
                    uri = null;
                }
                if (uri != null) {
                    intent.addFlags(1);
                    intent.setDataAndType(uri, fileAttachment2.f);
                    intent.setAction("android.intent.action.VIEW");
                    List<ResolveInfo> queryIntentActivities = this.f.getPackageManager().queryIntentActivities(intent, 65536);
                    ArrayList arrayList2 = new ArrayList();
                    aucx aucx = ayni.a.a().k().a;
                    for (ResolveInfo next : queryIntentActivities) {
                        if (!aucx.contains(next.activityInfo.packageName)) {
                            arrayList2.add(next);
                        }
                    }
                    ((anih) ((anih) vvj.a.d()).a("wgu", "d", 2937, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider removed blacklisted packages: %s", (Object) aucx);
                    if (arrayList2.isEmpty()) {
                        intent.setDataAndType((Uri) null, (String) null);
                        intent.setAction("android.intent.action.VIEW_DOWNLOADS");
                        str = str6;
                    } else {
                        str = str6;
                    }
                } else {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2899, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open file attachment with unknown destination.");
                    str = str6;
                }
            } else if (attachment2.e()) {
                WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) attachment2;
                String str8 = wifiCredentialsAttachment.a;
                a(1, (int) R.string.sharing_toast_wifi_connecting, str8);
                int i7 = wifiCredentialsAttachment.b;
                wgg wgg3 = (wgg) this.b.get(wifiCredentialsAttachment);
                if (wgg3 != null) {
                    vnx = wgg3.b;
                } else {
                    vnx = null;
                }
                if (vnx == null) {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "b", 2876, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbySharingProvider#connectToWifi failed because wifiCredential is null in cached attachmentInfoMap.");
                } else {
                    String str9 = vnx.b;
                    boolean z2 = vnx.c;
                    Context context = this.f;
                    if (i7 == 1) {
                        str7 = "Open";
                    } else if (i7 == 2) {
                        str7 = "PSK";
                    } else if (i7 == 3) {
                        str7 = "WEP";
                    }
                    if (str7 == null) {
                        acwa = acws.a(new Exception(String.format(Locale.getDefault(), "NearbySharingProvider connectToWifi failed to connect to ssid %s because an unknown securityType was given.", new Object[]{str8})));
                    } else {
                        acqy acqy = new acqy(context.getApplicationContext());
                        acqp acqp = new acqp();
                        if (str9 != null) {
                            acqp.a.c = str9;
                        }
                        ConnectToWifiNetworkRequest connectToWifiNetworkRequest = acqp.a;
                        connectToWifiNetworkRequest.a = str8;
                        connectToWifiNetworkRequest.b = str7;
                        connectToWifiNetworkRequest.d = z2;
                        iva.a((Object) connectToWifiNetworkRequest);
                        acwa = acqy.b((ihb) new acqx(connectToWifiNetworkRequest));
                    }
                    acwa.a((acvv) new wej(this, str8));
                    acwa.a((acvs) new wek(this, str8));
                }
                intent.setAction("android.settings.WIFI_SETTINGS");
                str = str6;
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "x", 2864, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open attachment of unknown type");
                str = str6;
            }
        }
        if (!"com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD".equals(intent.getAction()) || (stringExtra = intent.getStringExtra(str)) == null) {
            int a2 = a(intent);
            ((anih) ((anih) vvj.a.d()).a("wgu", "c", 2703, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Launched an Activity for intent %s to open ShareTarget %s's attachment(s)", (Object) intent, (Object) shareTarget2);
            this.f.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            z(shareTarget);
            return a2;
        }
        new qvr(Looper.getMainLooper()).post(new wel(this, stringExtra));
        this.f.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        return 0;
    }

    private static boolean a(List list, long j2) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bigDecimal = bigDecimal.add(new BigDecimal(((Attachment) list.get(i2)).a()));
        }
        if (bigDecimal.compareTo(new BigDecimal(j2)) >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str) {
        ((ClipboardManager) this.f.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.f.getString(R.string.sharing_product_name), str));
        if (ayni.R()) {
            a(0, (int) R.string.sharing_toast_copied_to_clipboard, str);
        } else {
            Context context = this.f;
            Toast.makeText(context, context.getString(R.string.sharing_toast_copied_to_clipboard, new Object[]{str}), 0).show();
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "f", 2961, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Copied %s to clipboard", (Object) str);
    }

    private static byte[] a(byte b2, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        bArr2[0] = b2;
        System.arraycopy(bArr, 0, bArr2, 1, length);
        return bArr2;
    }

    private final tjc[] a(List list) {
        int size = list.size();
        tjc[] tjcArr = new tjc[size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            FileAttachment fileAttachment = (FileAttachment) list.get(i2);
            Uri uri = fileAttachment.d;
            if (uri != null) {
                tjc a2 = tjc.a(whw.a(this.f, uri));
                tjcArr[i2] = a2;
                a((Attachment) fileAttachment, a2.a);
            }
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2020, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created file payloads of length %d", size);
        return tjcArr;
    }

    public final int a(Contact contact) {
        return a("markContactAsSelected", (Callable) new weq(this, contact));
    }

    public int a(ShareTarget shareTarget) {
        return a("accept", (Callable) new wee(this, shareTarget));
    }

    public final Uri a(File file, FileAttachment fileAttachment) {
        Uri uri;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", fileAttachment.a);
        contentValues.put("mime_type", fileAttachment.f);
        if (ayni.A()) {
            Long valueOf = Long.valueOf(currentTimeMillis);
            contentValues.put("date_added", valueOf);
            contentValues.put("date_modified", valueOf);
        }
        contentValues.put("is_pending", 1);
        if (ayni.A()) {
            contentValues.put("date_expires", Long.valueOf((System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1)) / 1000));
        }
        Context context = this.f;
        int i2 = fileAttachment.b;
        if (i2 == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i2 == 2) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (i2 != 4) {
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uri2 = (Uri) tgw.a("insert", (Callable) new tgo(context, uri, contentValues));
        if (uri2 != null) {
            OutputStream outputStream = (OutputStream) tgw.a("openOutputStream", (Callable) new tgs(this.f, uri2));
            if (outputStream == null) {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2306, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open output stream for uri: %s", (Object) uri2);
                if (ayni.A()) {
                    tgw.b(this.f, uri2);
                }
                return null;
            }
            try {
                whw.a((InputStream) new FileInputStream(file), outputStream);
                if (!file.delete()) {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete file: %s", (Object) file.getAbsolutePath());
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", 0);
                if (ayni.A()) {
                    contentValues2.putNull("date_expires");
                }
                Integer num = (Integer) tgw.a("update", (Callable) new tgp(this.f, uri2, contentValues2));
                if (num == null || num.intValue() != 1) {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update uri %s in media store.", (Object) uri2);
                    if (ayni.A()) {
                        tgw.b(this.f, uri2);
                    }
                    return null;
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully created media store uri %s with access to the file.", (Object) uri2);
                return uri2;
            } catch (IOException e2) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2319, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write to uri in media store for file: %s.", (Object) fileAttachment.a);
                if (ayni.A()) {
                    tgw.b(this.f, uri2);
                }
                return null;
            }
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2299, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create uri in media store for file: %s.", (Object) fileAttachment.a);
            return null;
        }
    }

    public final Uri a(File file, File file2, FileAttachment fileAttachment) {
        try {
            whw.a(file, file2);
            Uri a2 = ki.a(this.f, "com.google.android.gms.fileprovider", file2);
            int i2 = fileAttachment.b;
            if (i2 != 1) {
                if (i2 != 2) {
                    ((DownloadManager) this.f.getSystemService("download")).addCompletedDownload(fileAttachment.a, this.f.getString(R.string.sharing_download_description), true, whw.d(this.f, a2), file2.getPath(), fileAttachment.c, false);
                    return a2;
                }
            }
            this.f.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
            return a2;
        } catch (IOException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wgu", "a", 2249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s", (Object) fileAttachment);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.nearby.sharing.ShareTarget a(defpackage.wby r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            wcf r0 = r1.m
            byte[] r4 = r2.c
            byte[] r5 = r2.b
            wcd r4 = r0.a((byte[]) r4, (byte[]) r5)
            boolean r0 = r18.a()
            java.lang.String r5 = "wgu"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "a"
            r8 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            if (r4 != 0) goto L_0x003c
            jjg r0 = defpackage.vvj.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r3 = 3921(0xf51, float:5.494E-42)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r7, (int) r3, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            byte[] r2 = r2.c
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.String r3 = "Failed to retrieve public certificate %s for a contacts only advertisement."
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            return r8
        L_0x003c:
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L_0x0193
            vhj r0 = r4.b
            int r11 = r0.a
            r11 = r11 & 4
            if (r11 == 0) goto L_0x0193
            android.content.Context r11 = r1.f
            java.lang.String r0 = r0.d
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0168
            boolean r12 = defpackage.wij.a((java.lang.String) r0)
            if (r12 != 0) goto L_0x005d
            jjg r0 = defpackage.vvj.a
            r12 = r8
            goto L_0x016b
        L_0x005d:
            java.io.File r12 = new java.io.File
            java.io.File r13 = defpackage.wij.a((android.content.Context) r11)
            android.net.Uri r14 = android.net.Uri.parse(r0)
            java.lang.String r14 = defpackage.whw.c(r11, r14)
            java.lang.String r14 = defpackage.whw.a((java.lang.String) r14)
            java.lang.Object[] r15 = new java.lang.Object[r9]
            int r16 = r0.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r8 = 0
            r15[r8] = r16
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            java.lang.String r14 = "jpg"
        L_0x0085:
            r15[r10] = r14
            java.lang.String r14 = "%s.%s"
            java.lang.String r14 = java.lang.String.format(r14, r15)
            r12.<init>(r13, r14)
            boolean r13 = r12.exists()
            if (r13 != 0) goto L_0x0167
            boolean r13 = defpackage.wij.a((java.lang.String) r0)
            if (r13 == 0) goto L_0x0106
            android.net.Uri r13 = android.net.Uri.parse(r0)
            java.lang.String r13 = defpackage.whw.c(r11, r13)
            boolean r13 = defpackage.whw.c(r13)
            if (r13 == 0) goto L_0x0103
            r13 = 47
            int r13 = r0.lastIndexOf(r13)
            r14 = -1
            if (r13 != r14) goto L_0x00b6
            jjg r8 = defpackage.vvj.a
            goto L_0x0108
        L_0x00b6:
            r14 = 64
            int r14 = defpackage.wid.a(r11, r14)
            int r13 = r13 + r10
            java.lang.String r15 = r0.substring(r8, r13)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r9[r8] = r14
            java.lang.String r8 = "s%s-c/"
            java.lang.String r8 = java.lang.String.format(r8, r9)
            java.lang.String r0 = r0.substring(r13)
            java.lang.String r9 = java.lang.String.valueOf(r15)
            int r9 = r9.length()
            java.lang.String r13 = java.lang.String.valueOf(r8)
            int r13 = r13.length()
            java.lang.String r14 = java.lang.String.valueOf(r0)
            int r14 = r14.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + r13
            int r9 = r9 + r14
            r10.<init>(r9)
            r10.append(r15)
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            jjg r8 = defpackage.vvj.a
            r8 = r0
            goto L_0x0109
        L_0x0103:
            jjg r8 = defpackage.vvj.a
            goto L_0x0108
        L_0x0106:
            jjg r8 = defpackage.vvj.a
        L_0x0108:
            r8 = r0
        L_0x0109:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r9 = 1
            r0.<init>(r9)
            com.google.android.gms.net.PlayServicesCronetProvider r9 = new com.google.android.gms.net.PlayServicesCronetProvider     // Catch:{ IllegalStateException -> 0x014a }
            r9.<init>(r11)     // Catch:{ IllegalStateException -> 0x014a }
            org.chromium.net.CronetEngine$Builder r9 = r9.createBuilder()     // Catch:{ IllegalStateException -> 0x014a }
            org.chromium.net.CronetEngine r9 = r9.build()     // Catch:{ IllegalStateException -> 0x014a }
            wii r10 = new wii     // Catch:{ IllegalStateException -> 0x014a }
            r10.<init>(r12, r0)     // Catch:{ IllegalStateException -> 0x014a }
            aoru r11 = defpackage.tid.c()     // Catch:{ IllegalStateException -> 0x014a }
            org.chromium.net.UrlRequest$Builder r9 = r9.newUrlRequestBuilder(r8, r10, r11)     // Catch:{ IllegalStateException -> 0x014a }
            org.chromium.net.UrlRequest r9 = r9.build()     // Catch:{ IllegalStateException -> 0x014a }
            r9.start()     // Catch:{ IllegalStateException -> 0x014a }
            ayni r8 = defpackage.ayni.a     // Catch:{ InterruptedException -> 0x0140 }
            aynj r8 = r8.a()     // Catch:{ InterruptedException -> 0x0140 }
            long r8 = r8.M()     // Catch:{ InterruptedException -> 0x0140 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0140 }
            r0.await(r8, r10)     // Catch:{ InterruptedException -> 0x0140 }
            goto L_0x016b
        L_0x0140:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r12 = 0
            goto L_0x016b
        L_0x014a:
            r0 = move-exception
            jjg r9 = defpackage.vvj.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.Throwable) r0)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r10 = "wij"
            anie r0 = r9.a((java.lang.String) r10, (java.lang.String) r7, (int) r0, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r9 = "Failed to download Url %s. Cronet provider is unavailable on this device."
            r0.a((java.lang.String) r9, (java.lang.Object) r8)
            r12 = 0
            goto L_0x016b
        L_0x0167:
            goto L_0x016b
        L_0x0168:
            jjg r0 = defpackage.vvj.a
            r12 = 0
        L_0x016b:
            if (r12 == 0) goto L_0x0191
            android.content.Context r0 = r1.f     // Catch:{ IllegalArgumentException -> 0x0176 }
            java.lang.String r8 = "com.google.android.gms.fileprovider"
            android.net.Uri r0 = defpackage.ki.a(r0, r8, r12)     // Catch:{ IllegalArgumentException -> 0x0176 }
            goto L_0x0194
        L_0x0176:
            r0 = move-exception
            jjg r8 = defpackage.vvj.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            r8.a((java.lang.Throwable) r0)
            r0 = 2990(0xbae, float:4.19E-42)
            anie r0 = r8.a((java.lang.String) r5, (java.lang.String) r7, (int) r0, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r8 = "Failed to get content Uri for %s"
            r0.a((java.lang.String) r8, (java.lang.Object) r12)
            r0 = 0
            goto L_0x0194
        L_0x0191:
            r0 = 0
            goto L_0x0194
        L_0x0193:
            r0 = 0
        L_0x0194:
            if (r4 == 0) goto L_0x01a1
            vhj r8 = r4.b
            int r9 = r8.a
            r10 = 2
            r9 = r9 & r10
            if (r9 == 0) goto L_0x01a1
            java.lang.String r8 = r8.c
            goto L_0x01a2
        L_0x01a1:
            r8 = 0
        L_0x01a2:
            byte[] r9 = r2.a
            boolean r10 = r18.a()
            if (r10 == 0) goto L_0x01b6
            boolean r10 = defpackage.whu.a((byte[]) r9)
            if (r10 != 0) goto L_0x01c3
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            goto L_0x01c4
        L_0x01b6:
            if (r4 == 0) goto L_0x01c3
            vhj r9 = r4.b
            int r10 = r9.a
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x01c3
            java.lang.String r10 = r9.b
            goto L_0x01c4
        L_0x01c3:
            r10 = 0
        L_0x01c4:
            if (r10 != 0) goto L_0x01e1
            jjg r0 = defpackage.vvj.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r3 = 3931(0xf5b, float:5.509E-42)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r7, (int) r3, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            byte[] r2 = defpackage.wby.a((defpackage.wby) r18)
            java.lang.String r3 = "Failed to retrieve device name for advertisement %s."
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            r2 = 0
            return r2
        L_0x01e1:
            vsf r2 = new vsf
            r2.<init>()
            r2.b = r10
            r2.j = r8
            r2.i = r3
            r2.c = r0
            if (r4 == 0) goto L_0x01f3
            r2.b()
        L_0x01f3:
            com.google.android.gms.nearby.sharing.ShareTarget r0 = r2.a()
            if (r3 != 0) goto L_0x0200
            wgm r2 = r1.l(r0)
            r2.b = r4
            goto L_0x0206
        L_0x0200:
            wgl r2 = r1.h(r0)
            r2.b = r4
        L_0x0206:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgu.a(wby, boolean):com.google.android.gms.nearby.sharing.ShareTarget");
    }

    public final ShareTarget c(String str) {
        ShareTarget shareTarget = null;
        for (Map.Entry entry : this.c.entrySet()) {
            if (str.equals(((wgm) entry.getValue()).a) && (shareTarget == null || shareTarget.a < ((ShareTarget) entry.getKey()).a)) {
                shareTarget = (ShareTarget) entry.getKey();
            }
        }
        return shareTarget;
    }

    public final List c() {
        List list = (List) thr.a("getContacts", acws.a((Executor) this.C, (Callable) new wep(this)), ayni.h());
        return list == null ? amzy.h() : list;
    }

    public final void c(String str, ShareTarget shareTarget, vtx vtx) {
        int i2;
        ShareTarget shareTarget2 = shareTarget;
        vtx vtx2 = vtx;
        wgm l2 = l(shareTarget2);
        String str2 = l2.a;
        if (str2 == null) {
            vtx2.a(shareTarget2, new vtv(7).a());
            this.q.a(shareTarget2);
            ((anih) ((anih) vvj.a.d()).a("wgu", "c", 1547, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve endpoint id for %s.", (Object) shareTarget2);
            return;
        }
        byte[] e2 = e(str);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.k == 1 || a(shareTarget.b(), Long.parseLong(ayni.a.a().az()))) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        vva vva = this.o;
        long j2 = this.t;
        aucd d2 = vvb.d(27);
        aucd o2 = aslw.c.o();
        String str3 = "wgu";
        String str4 = "c";
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslw aslw = (aslw) o2.b;
        aslw.a |= 1;
        aslw.b = j2;
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        aslw aslw2 = (aslw) o2.i();
        asmc asmc2 = asmc.B;
        aslw2.getClass();
        asmc.x = aslw2;
        asmc.a |= 268435456;
        vva.a(new vuu((asmc) d2.i()));
        if (ayni.a.a().m()) {
            acwa a2 = acws.a((Executor) tid.b(), (Callable) new wdy(this, e2, str2, y(shareTarget2), i2, v(shareTarget2), shareTarget));
            a2.a((acvv) new wdz(this, vtx, shareTarget, l2, uptimeMillis, str2));
            a2.a((acvs) new wea(this, vtx2, shareTarget2));
            return;
        }
        wcx a3 = this.g.a(e2, str2, y(shareTarget2), i2, v(shareTarget2));
        if (a3 == null) {
            vtx2.a(shareTarget2, new vtv(7).a());
            this.q.a(shareTarget2);
            ((anih) ((anih) vvj.a.d()).a(str3, str4, 1614, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to %s.", (Object) shareTarget2);
            return;
        }
        a(a3, vtx, shareTarget, l2, uptimeMillis, str2);
    }

    /* access modifiers changed from: package-private */
    public final ScheduledFuture a(Runnable runnable, long j2) {
        return this.C.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final vnw a(wcx wcx, vnv vnv, long j2) {
        vnw vnw;
        if (this.l.containsKey(vnv)) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 4146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read cached %s frame", (Object) vnv);
            return (vnw) this.l.remove(vnv);
        }
        jjg jjg = vvj.a;
        tfu b2 = tfu.b(new wet(j2, wcx), j2, this.d);
        do {
            vnw = null;
            if (!wcx.c()) {
                vnw a2 = a(wcx);
                if (a2 != null) {
                    vnv a3 = vnv.a(a2.b);
                    if (a3 == null) {
                        a3 = vnv.UNKNOWN_FRAME_TYPE;
                    }
                    if (!vnv.equals(a3)) {
                        anih anih = (anih) ((anih) vvj.a.c()).a("wgu", "b", 4194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                        String name = vnv.name();
                        vnv a4 = vnv.a(a2.b);
                        if (a4 == null) {
                            a4 = vnv.UNKNOWN_FRAME_TYPE;
                        }
                        anih.a("Failed to read %s frame, but got %s. Cached for later.", (Object) name, (Object) a4.name());
                        ConcurrentMap concurrentMap = this.l;
                        vnv a5 = vnv.a(a2.b);
                        if (a5 == null) {
                            a5 = vnv.UNKNOWN_FRAME_TYPE;
                        }
                        concurrentMap.put(a5, a2);
                        continue;
                    } else {
                        ((anih) ((anih) vvj.a.d()).a("wgu", "b", 4201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read %s frame", (Object) vnv.name());
                        vnw = a2;
                        continue;
                    }
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 4174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read %s frame", (Object) vnv.name());
                return null;
            }
        } while (vnw == null);
        b2.b();
        return vnw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(wcx wcx) {
        vnw vnw;
        while (!wcx.c()) {
            Iterator it = this.l.keySet().iterator();
            if (it.hasNext()) {
                vnw = (vnw) this.l.remove(it.next());
            } else {
                vnw = null;
            }
            if (vnw == null) {
                vnw = a(wcx);
            }
            if (vnw != null) {
                vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
                vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
                wgn wgn = wgn.SUCCESS;
                vnv a2 = vnv.a(vnw.b);
                if (a2 == null) {
                    a2 = vnv.UNKNOWN_FRAME_TYPE;
                }
                if (a2.ordinal() != 5) {
                    anih anih = (anih) ((anih) vvj.a.d()).a("wgu", "c", 4273, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    vnv a3 = vnv.a(vnw.b);
                    if (a3 == null) {
                        a3 = vnv.UNKNOWN_FRAME_TYPE;
                    }
                    anih.a("Discarding unknown frame of type %s", (Object) a3);
                } else {
                    a((Runnable) new wev(this, vnw));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final vtx a(ShareTarget shareTarget, vtx vtx) {
        vtx a2 = a(vtx);
        l(shareTarget).d = a2;
        return a2;
    }

    public final vtx a(vtx vtx) {
        this.x = 0;
        return new wge(this, vtx);
    }

    public void a() {
        a((Runnable) new wdt(this));
    }

    public void a(int i2) {
        this.A = i2;
        this.m.b(i2);
    }

    public final void a(int i2, int i3, String... strArr) {
        new qvr(Looper.getMainLooper()).post(new wem(this, i3, strArr, i2));
    }

    public final void a(Attachment attachment) {
        tja tja;
        File file;
        long b2 = b(attachment);
        if (b2 == -1) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2391, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve payload for: %s", (Object) attachment);
            return;
        }
        tjc a2 = this.g.a(b2);
        if (a2 != null && (tja = a2.d) != null && (file = tja.a) != null) {
            file.delete();
        }
    }

    public final void a(Attachment attachment, long j2) {
        wgg wgg = (wgg) this.b.get(attachment);
        if (wgg == null) {
            wgg = new wgg();
            this.b.put(attachment, wgg);
        }
        wgg.c = j2;
    }

    public final void a(ShareTarget shareTarget, String str) {
        String str2;
        int i2;
        String str3;
        int i3;
        int i4;
        ShareTarget shareTarget2 = shareTarget;
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 643, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receiving introduction from %s", (Object) shareTarget2);
        wcx i5 = i(shareTarget);
        if (i5 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 647, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No NearbyConnection tied to %s. Disconnect", (Object) shareTarget2);
            return;
        }
        vtx k2 = k(shareTarget);
        if (k2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 653, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("no TransferUpdateCallback tied to %s. Disconnect", (Object) shareTarget2);
            i5.b();
            return;
        }
        vnw a2 = a(i5, vnv.INTRODUCTION);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 660, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse the introduction frame. Disconnecting.");
            i5.b();
            return;
        }
        vva vva = this.o;
        long j2 = this.u;
        aucd d2 = vvb.d(14);
        aucd o2 = aslo.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslo aslo = (aslo) o2.b;
        aslo.a |= 1;
        aslo.b = j2;
        aslo aslo2 = (aslo) o2.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslo2.getClass();
        asmc.o = aslo2;
        asmc.a |= 16384;
        vva.a(new vut((asmc) d2.i()));
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 666, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read the introduction frame");
        vnl vnl = a2.c;
        if (vnl == null) {
            vnl = vnl.f;
        }
        int i6 = 0;
        while (true) {
            str2 = "UNKNOWN";
            if (i6 >= vnl.b.size()) {
                break;
            }
            vnh vnh = (vnh) vnl.b.get(i6);
            anih anih = (anih) ((anih) vvj.a.d()).a("wgu", "a", 673, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String str4 = vnh.b;
            int a3 = vng.a(vnh.c);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 != 1) {
                str2 = a3 != 2 ? a3 != 3 ? a3 != 4 ? "AUDIO" : "APP" : "VIDEO" : "IMAGE";
            }
            anih.a("Found file attachment %s of type %s with mimeType %s", (Object) str4, (Object) str2, (Object) vnh.f);
            vja vja = new vja(vnh.b);
            int a4 = vng.a(vnh.c);
            if (a4 == 0) {
                a4 = 1;
            }
            vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
            wgn wgn = wgn.SUCCESS;
            int i7 = a4 - 1;
            if (i7 != 1) {
                i4 = i7 != 2 ? i7 != 3 ? i7 != 4 ? 0 : 4 : 3 : 2;
            } else {
                i4 = 1;
            }
            vja.c = i4;
            vja.b = vnh.e;
            vja.d = vnh.f;
            FileAttachment a5 = vja.a();
            a((Attachment) a5, vnh.d);
            shareTarget2.a(a5);
            i6++;
        }
        for (int i8 = 0; i8 < vnl.c.size(); i8++) {
            vnt vnt = (vnt) vnl.c.get(i8);
            anih anih2 = (anih) ((anih) vvj.a.d()).a("wgu", "a", 689, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String str5 = vnt.b;
            int a6 = vns.a(vnt.c);
            if (a6 == 0) {
                a6 = 1;
            }
            if (a6 != 1) {
                str3 = a6 != 2 ? a6 != 3 ? a6 != 4 ? "PHONE_NUMBER" : "ADDRESS" : "URL" : "TEXT";
            } else {
                str3 = str2;
            }
            anih2.a("Found text attachment %s of type %s", (Object) str5, (Object) str3);
            vtt vtt = new vtt(vnt.b);
            int a7 = vns.a(vnt.c);
            if (a7 == 0) {
                a7 = 1;
            }
            vnz vnz2 = vnz.UNKNOWN_SECURITY_TYPE;
            wgn wgn2 = wgn.SUCCESS;
            int i9 = a7 - 1;
            if (i9 != 2) {
                i3 = i9 != 3 ? i9 != 4 ? 0 : 3 : 2;
            } else {
                i3 = 1;
            }
            vtt.a = i3;
            TextAttachment a8 = vtt.a();
            a((Attachment) a8, vnt.d);
            shareTarget2.a(a8);
        }
        if (ayni.R()) {
            for (int i10 = 0; i10 < vnl.e.size(); i10++) {
                voa voa = (voa) vnl.e.get(i10);
                anih anih3 = (anih) ((anih) vvj.a.d()).a("wgu", "a", 705, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                String str6 = voa.b;
                vnz a9 = vnz.a(voa.c);
                if (a9 == null) {
                    a9 = vnz.UNKNOWN_SECURITY_TYPE;
                }
                anih3.a("Found wifiCredentials attachment %s of security type %s", (Object) str6, (Object) a9);
                vty vty = new vty(voa.b);
                vnz a10 = vnz.a(voa.c);
                if (a10 == null) {
                    a10 = vnz.UNKNOWN_SECURITY_TYPE;
                }
                wgn wgn3 = wgn.SUCCESS;
                int ordinal = a10.ordinal();
                if (ordinal != 1) {
                    i2 = ordinal != 2 ? ordinal != 3 ? 0 : 3 : 2;
                } else {
                    i2 = 1;
                }
                vty.a = i2;
                WifiCredentialsAttachment a11 = vty.a();
                a((Attachment) a11, voa.d);
                shareTarget2.a(a11);
            }
        }
        if (shareTarget.b().isEmpty()) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 718, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No attachment is found for this share target. It can be result of unrecognizable attachment type.");
            if (!ayni.a.a().bo()) {
                i5.b();
                return;
            }
            a(shareTarget2, 14);
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 723, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("We don't support the attachments sent by the sender. We have informed %s", (Object) shareTarget2);
            return;
        }
        if ((vnl.a & 1) != 0) {
            shareTarget2.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", vnl.d);
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 738, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully received incoming connection from %s", (Object) shareTarget2);
        if (ayni.a.a().av()) {
            List b2 = shareTarget.b();
            BigDecimal a12 = whw.a();
            int size = b2.size();
            boolean z2 = false;
            for (int i11 = 0; i11 < size; i11++) {
                Attachment attachment = (Attachment) b2.get(i11);
                if (attachment.c()) {
                    a12 = a12.subtract(new BigDecimal(Long.toString(attachment.a())));
                    z2 = true;
                }
            }
            if (z2 && a12.signum() <= 0) {
                a(shareTarget2, 13);
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 743, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Not enough space on the receiver. We have informed %s", (Object) shareTarget2);
                return;
            }
        }
        this.e.a(shareTarget, i5, k2, ayni.D());
        vtv vtv = new vtv(2);
        vtv.a = str;
        k2.a(shareTarget2, vtv.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ShareTarget shareTarget, vtx vtx, String str) {
        String str2;
        List list;
        ShareTarget shareTarget2 = shareTarget;
        String str3 = str;
        this.t = (long) vva.a();
        this.l.clear();
        vtx a2 = a(shareTarget, vtx);
        a2.a(shareTarget2, new vtv(1).a());
        if (q(shareTarget).length > 0 || p(shareTarget).length > 0 || r(shareTarget).length > 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1979, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping payload creation for ShareTarget %s. Payloads already created.", (Object) shareTarget2);
        } else {
            try {
                List list2 = shareTarget2.g;
                int size = list2.size();
                tjc[] tjcArr = new tjc[size];
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    FileAttachment fileAttachment = (FileAttachment) list2.get(i2);
                    Uri uri = fileAttachment.d;
                    if (uri != null) {
                        tjc a3 = tjc.a(tja.a(whw.a(this.f, uri)), tjc.a());
                        tjcArr[i2] = a3;
                        a((Attachment) fileAttachment, a3.a);
                    }
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 2020, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created file payloads of length %d", size);
                l(shareTarget).i = tjcArr;
                List list3 = shareTarget2.f;
                String str4 = "b";
                int size2 = list3.size();
                tjc[] tjcArr2 = new tjc[size2];
                int i3 = 0;
                while (i3 < list3.size()) {
                    TextAttachment textAttachment = (TextAttachment) list3.get(i3);
                    tjc a4 = tjc.a(textAttachment.a.getBytes());
                    tjcArr2[i3] = a4;
                    a((Attachment) textAttachment, a4.a);
                    i3++;
                    str4 = str4;
                    size2 = size2;
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", str4, 2032, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created text payloads of length %d", size2);
                l(shareTarget).h = tjcArr2;
                List list4 = shareTarget2.h;
                String str5 = "c";
                int size3 = list4.size();
                tjc[] tjcArr3 = new tjc[size3];
                int i4 = 0;
                while (i4 < list4.size()) {
                    WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list4.get(i4);
                    aucd o2 = vnx.d.o();
                    String str6 = wifiCredentialsAttachment.d;
                    if (str6 != null) {
                        list = list4;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        vnx vnx = (vnx) o2.b;
                        str6.getClass();
                        str2 = str5;
                        vnx.a |= 1;
                        vnx.b = str6;
                    } else {
                        list = list4;
                        str2 = str5;
                    }
                    boolean z2 = wifiCredentialsAttachment.e;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vnx vnx2 = (vnx) o2.b;
                    vnx2.a |= 2;
                    vnx2.c = z2;
                    tjc a5 = tjc.a(((vnx) o2.i()).k());
                    tjcArr3[i4] = a5;
                    a((Attachment) wifiCredentialsAttachment, a5.a);
                    i4++;
                    list4 = list;
                    str5 = str2;
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", str5, 2055, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created wifi payloads of length %d", size3);
                l(shareTarget).j = tjcArr3;
                if (q(shareTarget).length <= 0) {
                    if (p(shareTarget).length <= 0 && r(shareTarget).length <= 0) {
                        ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1998, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create any payloads for ShareTarget %s.", (Object) shareTarget2);
                        vtx.a(shareTarget2, new vtv(11).a());
                        return;
                    }
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "w", 1995, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Created %s payloads for ShareTarget %s.", (Object) shareTarget.b(), (Object) shareTarget2);
            } catch (IOException e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("wgu", "w", 2002, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create file payloads for the given attachments. Disconnecting.");
            }
        }
        if (shareTarget2.k && this.q.b(shareTarget2)) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1425, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is outdated, attempting to rescan and send.", (Object) shareTarget2);
            b(str3, shareTarget2, a2);
        } else if (m(shareTarget) == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1428, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not discovered yet, attempting to rescan and send.", (Object) shareTarget2);
            b(str3, shareTarget2, a2);
        } else {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1432, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not outdated, attempting to send.", (Object) shareTarget2);
            c(str3, shareTarget2, a2);
        }
    }

    public final void a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider"}));
        for (Map.Entry entry : this.B.entrySet()) {
            printWriter.write(String.format("  ShareTarget: %s\n", new Object[]{entry.getKey()}));
            printWriter.write(String.format("  %s\n", new Object[]{entry.getValue()}));
        }
        for (Map.Entry entry2 : this.c.entrySet()) {
            printWriter.write(String.format("  ShareTarget: %s\n", new Object[]{entry2.getKey()}));
            printWriter.write(String.format("  %s\n", new Object[]{entry2.getValue()}));
        }
        for (Map.Entry entry3 : this.b.entrySet()) {
            printWriter.write(String.format("  Attachment: %s\n", new Object[]{entry3.getKey()}));
            printWriter.write(String.format("  %s\n", new Object[]{entry3.getValue()}));
        }
        this.m.a(printWriter);
        wcg wcg = this.n;
        if (vvb.a() == 2 || vvb.a() == 3) {
            printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.provider.connections.ContactBookManager"}));
            printWriter.write("  Contacts:\n");
            Account b2 = wcg.c.b();
            if (b2 == null) {
                printWriter.write("    No account is logged in.\n");
                return;
            }
            aucx aucx = wcg.a.b(b2).a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                vig vig = (vig) aucx.get(i2);
                String valueOf = String.valueOf(wcg.a(vig));
                String format = DateFormat.getDateTimeInstance().format(new Date(vig.j));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(format).length());
                sb.append("    ");
                sb.append(valueOf);
                sb.append(" lastCheckedReachability: ");
                sb.append(format);
                sb.append("\n");
                printWriter.write(sb.toString());
            }
        }
    }

    public final void a(Runnable runnable) {
        this.C.execute(runnable);
    }

    public final void a(String str) {
        a((Runnable) new wfy(this, str));
    }

    public final void a(String str, int i2) {
        a((Runnable) new wds(this, str, i2));
    }

    public void a(String str, ShareTarget shareTarget, vtx vtx) {
        a((Runnable) new wdv(this, shareTarget, vtx, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, Exception exc) {
        a(0, (int) R.string.sharing_toast_wifi_connection_failed, str);
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        ((anih) anih.a("wgu", "a", 2891, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiUtils#connectToWifi failed to connect to %s", (Object) str);
    }

    public void a(String str, vtx vtx, wbq wbq) {
        a((Runnable) new wey(this, wbq, str, vtx));
    }

    public final void a(String str, byte[] bArr) {
        a((Runnable) new wfx(this, str, bArr));
    }

    public final void a(String str, byte[] bArr, wcx wcx) {
        a((Runnable) new wfj(this, bArr, wcx, str));
    }

    public final void a(String str, byte[] bArr, boolean z2) {
        ShareTarget shareTarget;
        if (!i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 980, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring discovered endpoint %s because we're no longer scanning", (Object) whu.b(bArr));
            return;
        }
        vsh vsh = this.h;
        wby a2 = wby.a(bArr);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 989, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse discovered advertisement %s", (Object) whu.b(bArr));
            return;
        }
        ShareTarget c2 = c(str);
        if (c2 == null) {
            ShareTarget a3 = a(a2, false);
            if (a3 == null) {
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1002, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert advertisement %s to share target from discovered advertisement. Disconnecting.", (Object) whu.b(bArr));
                this.a.put(str, bArr);
                return;
            }
            if (a3.k) {
                Iterator it = this.c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        shareTarget = null;
                        break;
                    }
                    shareTarget = (ShareTarget) ((Map.Entry) it.next()).getKey();
                    if (wcu.a(shareTarget, a3)) {
                        break;
                    }
                }
                if (shareTarget != null) {
                    c2 = shareTarget;
                    b(c2, str);
                    vsh.a(c2);
                    ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1026, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported onShareTargetDiscovered for %s in %s millis.", (Object) c2, SystemClock.uptimeMillis() - this.w);
                }
            }
            c2 = a3;
            b(c2, str);
            vsh.a(c2);
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1026, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported onShareTargetDiscovered for %s in %s millis.", (Object) c2, SystemClock.uptimeMillis() - this.w);
        }
        if (z2 && c2.k) {
            this.q.a(c2, str, bArr);
        }
    }

    public void a(vsh vsh, wbt wbt) {
        a((Runnable) new wfw(this, vsh, wbt));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(vtx vtx, ShareTarget shareTarget, Exception exc) {
        vtx.a(shareTarget, new vtv(7).a());
        this.q.a(shareTarget);
        anih anih = (anih) vvj.a.d();
        anih.a((Throwable) exc);
        ((anih) anih.a("wgu", "a", 1599, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(wbq wbq, String str, vtx vtx) {
        int i2;
        String str2;
        wbw wbw = wbq.a;
        int i3 = wbq.b;
        this.s = (long) vva.a();
        this.g.d();
        int a2 = this.g.a(e(str), (wdm) this, wbq);
        int i4 = 3;
        if (a2 == 0) {
            this.i = vtx;
            this.j = wbw;
            anih anih = (anih) ((anih) vvj.a.d()).a("wgu", "a", 474, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            int i5 = this.A;
            String str3 = "UNKNOWN";
            if (i5 != 0) {
                str2 = i5 != 1 ? i5 != 2 ? str3 : "SELECTED_CONTACTS" : "ALL_CONTACTS";
            } else {
                str2 = "NO_ONE";
            }
            if (i3 == 1) {
                str3 = "OFFLINE";
            } else if (i3 == 2) {
                str3 = "ONLINE";
            } else if (i3 == 3) {
                str3 = "WIFI_ONLY";
            }
            anih.a("Successfully started advertising over Nearby Connections: %s, %s, %s", (Object) wbw, (Object) str2, (Object) str3);
            i2 = 2;
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise over Nearby Connections: %s", (Object) tit.g(a2));
            i2 = 3;
        }
        if (wbw.HIGH_POWER.equals(wbw) || wbw.MEDIUM_POWER.equals(wbw)) {
            g();
        }
        if (str == null) {
            int i6 = this.A;
            i4 = i6 != 1 ? i6 != 2 ? 1 : 4 : 2;
        }
        this.o.b = vva.a();
        vva vva = this.o;
        long j2 = this.s;
        aucd d2 = vvb.d(8);
        aucd o2 = aslc.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslc aslc = (aslc) o2.b;
        int i7 = 1 | aslc.a;
        aslc.a = i7;
        aslc.b = j2;
        aslc.c = i4 - 1;
        int i8 = i7 | 2;
        aslc.a = i8;
        aslc.d = i2 - 1;
        aslc.a = i8 | 4;
        aslc aslc2 = (aslc) o2.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslc2.getClass();
        asmc.i = aslc2;
        asmc.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        vva.a(new vut((asmc) d2.i()));
    }

    public final void a(wcx wcx, vtx vtx, ShareTarget shareTarget, wgm wgm, long j2, String str) {
        String str2;
        wgm.g = true;
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1638, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Connected to %s in %d millis.", (Object) shareTarget, SystemClock.uptimeMillis() - j2);
        l(shareTarget).c = wcx;
        wcx.a((wcw) new web(this, wgm, vtx, shareTarget));
        byte[] d2 = this.g.d(str);
        if (d2 != null) {
            str2 = whu.c(d2);
        } else {
            str2 = null;
        }
        vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
        vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
        wgn wgn = wgn.SUCCESS;
        int ordinal = f(shareTarget).ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1670, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake succeeded when sending to %s.", (Object) shareTarget);
            c(shareTarget, (String) null);
            g(shareTarget);
        } else if (ordinal == 1) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1662, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake failed when sending to %s. Disconnecting.", (Object) shareTarget);
            vtx.a(shareTarget, new vtv(7).a());
            wcx.b();
            this.q.a(shareTarget);
        } else if (ordinal == 2) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1676, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify paired key encryption with %s, verify tokens on devices.", (Object) shareTarget);
            if (this.g.e(str)) {
                c(shareTarget, (String) null);
                g(shareTarget);
                return;
            }
            l(shareTarget).f = str2;
            c(shareTarget, str2);
        }
    }

    public final void a(wcx wcx, vtx vtx, String str, ShareTarget shareTarget, vnw vnw) {
        vtx vtx2 = vtx;
        String str2 = str;
        ShareTarget shareTarget2 = shareTarget;
        vnw vnw2 = vnw;
        if (vnw2 != null) {
            this.e.a();
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1922, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read the response frame");
            vne vne = vnw2.d;
            if (vne == null) {
                vne = vne.c;
            }
            vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
            vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
            wgn wgn = wgn.SUCCESS;
            int b2 = vnd.b(vne.b);
            if (b2 == 0) {
                b2 = 1;
            }
            int i2 = b2 - 1;
            if (i2 == 1) {
                b(wcx);
                vva vva = this.o;
                long j2 = this.t;
                List b3 = shareTarget.b();
                aucd d2 = vvb.d(16);
                aucd o2 = aslt.d.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aslt aslt = (aslt) o2.b;
                aslt.a = 1 | aslt.a;
                aslt.b = j2;
                asld a2 = vvb.a(b3);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aslt aslt2 = (aslt) o2.b;
                a2.getClass();
                aslt2.c = a2;
                aslt2.a |= 2;
                aslt aslt3 = (aslt) o2.i();
                if (d2.c) {
                    d2.c();
                    d2.c = false;
                }
                asmc asmc = (asmc) d2.b;
                asmc asmc2 = asmc.B;
                aslt3.getClass();
                asmc.q = aslt3;
                asmc.a |= 65536;
                vva.a(new vuu((asmc) d2.i()));
                this.v = SystemClock.uptimeMillis();
                vtx2.a(shareTarget2, new vtv(5).a());
                wgt wgt = new wgt(this, shareTarget2, vtx2);
                for (tjc a3 : p(shareTarget2)) {
                    this.g.a(str2, a3, (wdn) wgt);
                }
                for (tjc a4 : q(shareTarget2)) {
                    this.g.a(str2, a4, (wdn) wgt);
                }
                for (tjc a5 : r(shareTarget2)) {
                    this.g.a(str2, a5, (wdn) wgt);
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1943, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was accepted. Payloads are now being sent.");
            } else if (i2 == 2) {
                vtx2.a(shareTarget2, new vtv(8).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1948, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected. The connection has been closed.");
            } else if (i2 == 3) {
                vtx2.a(shareTarget2, new vtv(13).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1954, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected because the remote device does not have enough space for our attachments. The connection has been closed.");
            } else if (i2 != 4) {
                vtx2.a(shareTarget2, new vtv(7).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1969, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection failed. The connection has been closed.");
            } else {
                vtx2.a(shareTarget2, new vtv(14).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1962, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected because the remote device does not support the attachments we were sending. The connection has been closed.");
            }
        } else {
            vtx2.a(shareTarget2, new vtv(7).a());
            wcx.b();
            ((anih) ((anih) vvj.a.b()).a("wgu", "a", 1914, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read a response from the remote device. Disconnecting.");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2, String str, ShareTarget shareTarget, vtx vtx) {
        if (!z2) {
            vtx.a(shareTarget, new vtv(7).a());
            this.q.a(shareTarget);
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1475, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to outdated %s, because failed to discover the share target.", (Object) shareTarget);
            return;
        }
        c(str, shareTarget, vtx);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(byte[] bArr, wcx wcx, String str) {
        String str2;
        this.u = (long) vva.a();
        this.l.clear();
        vtx vtx = this.i;
        if (vtx == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 532, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring incoming connection from endpoint %s because we're no longer advertising. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        wby a2 = wby.a(bArr);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 542, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse incoming connection from endpoint %s. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        ShareTarget a3 = a(a2, true);
        if (a3 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 553, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert advertisement %s to share target from incoming connection. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 561, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming connection from %s", (Object) a3);
        h(a3).c = wcx;
        vtx a4 = a(vtx);
        h(a3).d = a4;
        h(a3).a = str;
        wcx.a((wcw) new wfq(this, a3));
        byte[] d2 = this.g.d(str);
        if (d2 != null) {
            str2 = whu.c(d2);
        } else {
            str2 = null;
        }
        vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
        vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
        wgn wgn = wgn.SUCCESS;
        int ordinal = f(a3).ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 587, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake succeeded when receiving connection from %s.", (Object) a3);
            this.g.f(str);
            a(a3, (String) null);
            if (this.g.e(str)) {
                e(a3);
            }
        } else if (ordinal == 1) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 579, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake failed when receiving connection from %s. Disconnecting.", (Object) a3);
            wcx.b();
            return;
        } else if (ordinal == 2) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 603, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify paired key encryption when receiving connection from %s. Verify tokens on devices.", (Object) a3);
            if (this.g.e(str)) {
                this.g.f(str);
                a(a3, (String) null);
            } else {
                h(a3).f = str2;
                a(a3, str2);
            }
        }
        wcx.a((wcw) new wfr(this, a4, a3));
    }

    public final boolean a(FileAttachment fileAttachment) {
        Uri uri;
        long b2 = b((Attachment) fileAttachment);
        if (b2 == -1) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No payload ID found.", (Object) fileAttachment);
            return false;
        }
        tjc a2 = this.g.a(b2);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No payload found.", (Object) fileAttachment);
            return false;
        }
        tja tja = a2.d;
        if (tja == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2179, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No file found.", (Object) fileAttachment);
            return false;
        }
        File file = tja.a;
        if (file == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot move attachment %s due to failure to get the Java file.", (Object) fileAttachment);
            return false;
        }
        if (ayni.a.a().f()) {
            if (jkr.i()) {
                uri = a(file, fileAttachment);
            } else {
                uri = null;
            }
            if (uri == null) {
                uri = a(file, b(fileAttachment), fileAttachment);
            }
        } else if (jkr.i()) {
            uri = a(file, fileAttachment);
        } else {
            uri = a(file, b(fileAttachment), fileAttachment);
        }
        if (uri == null) {
            return false;
        }
        wgg wgg = (wgg) this.b.get(fileAttachment);
        if (wgg == null) {
            wgg = new wgg();
            this.b.put(fileAttachment, wgg);
        }
        wgg.a = uri;
        return true;
    }

    public final boolean a(TextAttachment textAttachment) {
        long b2 = b((Attachment) textAttachment);
        if (b2 == -1) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. No payload ID found.", (Object) textAttachment);
            return false;
        }
        tjc a2 = this.g.a(b2);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. No payload found.", (Object) textAttachment);
            return false;
        }
        byte[] bArr = a2.c;
        if (whu.a(bArr)) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. Incoming bytes is empty.", (Object) textAttachment);
            return false;
        }
        String str = new String(bArr);
        wgg wgg = (wgg) this.b.get(textAttachment);
        if (wgg == null) {
            wgg = new wgg();
            this.b.put(textAttachment, wgg);
        }
        wgg.d = str;
        return true;
    }

    public final boolean a(WifiCredentialsAttachment wifiCredentialsAttachment) {
        long b2 = b((Attachment) wifiCredentialsAttachment);
        if (b2 == -1) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential %s. No payload ID found.", (Object) wifiCredentialsAttachment);
            return false;
        }
        tjc a2 = this.g.a(b2);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s. No payload found.", (Object) wifiCredentialsAttachment);
            return false;
        }
        byte[] bArr = a2.c;
        if (!whu.a(bArr)) {
            try {
                vnx vnx = (vnx) aucj.a((aucj) vnx.d, bArr, aubs.c());
                wgg wgg = (wgg) this.b.get(wifiCredentialsAttachment);
                if (wgg == null) {
                    wgg = new wgg();
                    this.b.put(wifiCredentialsAttachment, wgg);
                }
                wgg.b = vnx;
                return true;
            } catch (auda e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("wgu", "a", 2127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s.", (Object) wifiCredentialsAttachment);
                return false;
            }
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s. No file found.", (Object) wifiCredentialsAttachment);
            return false;
        }
    }
}
