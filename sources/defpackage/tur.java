package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.R;

/* renamed from: tur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tur implements Runnable {
    private final Context a;
    private final tzi b;
    private final String c;
    private final byte[] d;
    private final boolean e;
    private final boolean f;
    private final double g;
    private final arxt h;

    public tur(Context context, tzi tzi, String str, byte[] bArr, boolean z, boolean z2, double d2, arxt arxt) {
        this.a = context;
        this.b = tzi;
        this.c = str;
        this.d = bArr;
        this.e = z;
        this.f = z2;
        this.g = d2;
        this.h = arxt;
    }

    public final void run() {
        String str;
        Context context = this.a;
        tzi tzi = this.b;
        String str2 = this.c;
        byte[] bArr = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        double d2 = this.g;
        arxt arxt = this.h;
        jjg jjg = tsp.a;
        if (tvd.a(bArr) && aymw.F()) {
            tvd.a(context, tzi, bArr, z, d2, arxt, str2);
        }
        if (z2) {
            ((anih) tsp.a.d()).a("FastPair: Need update provider name.");
            tvk.a(context, str2, tzi);
        }
        if (aymw.h()) {
            boolean equals = tzi.g.equals(tzi.f);
            long a2 = ((jiq) thl.a(context, jiq.class)).a() - tzi.h;
            long J = aymt.a.a().J();
            if (!equals && a2 > J && tzi.j) {
                try {
                    ((arwg) thl.a(context, arwg.class)).a((arwm) new tva("FastPairFirmwareVersion", context, tzi));
                } catch (InterruptedException e2) {
                    ((anih) tsp.a.d()).a("FastPair: error happens when update fast pair firmware version.");
                }
                uaj a3 = tvd.a(context, tzi, arxt);
                String a4 = tuk.a(context, str2, new ttu(tzi.k, tzi.b, context));
                if (a4 == null || a3 == null) {
                    ((anih) tsp.a.d()).a("FastPair: device firmware number is not available");
                    ((arwg) thl.a(context, arwg.class)).c(new tui("FastPairCacheEnableFirmwareVersionCheck", context, str2));
                    return;
                }
                asqm a5 = tuk.a(context, a3.y);
                if (a5 != null) {
                    ((arwg) thl.a(context, arwg.class)).c(new tuj("FastPairCacheUpdateFirmwareVersionValue", context, tzi, a4, a5));
                    if (!tzi.f.equals(a4)) {
                        if (tvd.a(a3.f)) {
                            str = tvq.a(a3);
                        } else {
                            str = null;
                        }
                        ((anih) tsp.a.d()).a("FastPair: The latest firmware is %s device firmware version is %s", (Object) tzi.f, (Object) a4);
                        int i = a5.a;
                        char c2 = 2;
                        boolean z3 = false;
                        if (i != 0) {
                            c2 = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
                        }
                        if (c2 != 0 && c2 == 3) {
                            tvo tvo = new tvo(context, new ttg(context, a3), true);
                            ((anih) tsp.a.d()).a("FastPair: Showing critical firmware update available notification, companion app: %s.", (Object) str);
                            if (!TextUtils.isEmpty(str)) {
                                String a6 = ((tso) thl.a(tvo.d, tso.class)).a("fast_pair_firmware_update_without_companion_app", new Object[0]);
                                Intent a7 = tvo.a(str, (String) null);
                                String string = tvo.d.getString(R.string.common_firmware_update);
                                udg b2 = tvo.b();
                                b2.b(string);
                                b2.s = "status";
                                b2.e(string);
                                b2.b((CharSequence) a6);
                                b2.a(tvo.b(a7));
                                tvo.a(b2.b(), tvo.a);
                            }
                            z3 = true;
                        }
                        if (str != null && tvq.a(str, context)) {
                            Intent intent = new Intent("com.google.android.gms.nearby.fastpair.ACTION_FIRMWARE_UPDATE_BROADCAST");
                            intent.setPackage(str);
                            intent.putExtra("com.google.android.gms.nearby.fastpair.EXTRA_LOCAL_FIRMWARE_VERSION", a4);
                            intent.putExtra("com.google.android.gms.nearby.fastpair.EXTRA_UPDATE_NOTIFICATION_SHOWN", z3);
                            context.getApplicationContext().sendBroadcast(intent);
                            return;
                        }
                        return;
                    }
                    ((anih) tsp.a.d()).a("FastPair: firmware is latest version no need to update.");
                }
            }
        }
    }
}
