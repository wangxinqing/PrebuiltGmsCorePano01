package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: noz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class noz implements amqy {
    private final npa a;
    private final long b;
    private final String c;
    private final bhs d;

    public noz(npa npa, long j, String str, bhs bhs) {
        this.a = npa;
        this.b = j;
        this.c = str;
        this.d = bhs;
    }

    public final Object a(Object obj) {
        String str;
        int a2;
        String str2 = "";
        npa npa = this.a;
        long j = this.b;
        String str3 = this.c;
        bhs bhs = this.d;
        String str4 = (String) obj;
        if (TextUtils.isEmpty(str4)) {
            npa.c.a(4004, System.currentTimeMillis() - j);
        }
        aucd o = lyd.p.o();
        if (!TextUtils.isEmpty(str3)) {
            o.c(auay.a(jhg.a(str3)));
        }
        if (!(bhs == bhs.UNSUPPORTED || (a2 = lyc.a(bhs.f)) == 0)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            lyd lyd = (lyd) o.b;
            lyd.o = a2;
            lyd.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        }
        byte[] decode = Base64.decode(str4, 8);
        aucd o2 = lyj.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        lyj lyj = (lyj) o2.b;
        "msa-l".getClass();
        lyj.a |= 1;
        lyj.b = "msa-l";
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyd lyd2 = (lyd) o.b;
        lyj lyj2 = (lyj) o2.i();
        lyj2.getClass();
        lyd2.b = lyj2;
        lyd2.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyd.a((lyd) o.b);
        try {
            str = System.getProperty("os.arch");
        } catch (IllegalStateException e) {
            str = str2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyd lyd3 = (lyd) o.b;
        str.getClass();
        lyd3.a |= 2;
        lyd3.d = str;
        auay a3 = auay.a(decode);
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyd lyd4 = (lyd) o.b;
        a3.getClass();
        lyd4.a |= 128;
        lyd4.j = a3;
        o.a(npa.a("BOARD", Build.BOARD));
        o.a(npa.a("BOOTLOADER", Build.BOOTLOADER));
        o.a(npa.a("BRAND", Build.BRAND));
        o.a(npa.a("CPU_ABI", Build.CPU_ABI));
        o.a(npa.a("CPU_ABI2", Build.CPU_ABI2));
        try {
            str2 = TextUtils.join(",", (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null));
        } catch (Exception e2) {
        }
        o.a(npa.a("SUPPORTED_ABIS", str2));
        o.a(npa.a("DEVICE", Build.DEVICE));
        o.a(npa.a("DISPLAY", Build.DISPLAY));
        o.a(npa.a("FINGERPRINT", Build.FINGERPRINT));
        o.a(npa.a("HARDWARE", Build.HARDWARE));
        o.a(npa.a("HOST", Build.HOST));
        o.a(npa.a("ID", Build.ID));
        o.a(npa.a("MANUFACTURER", Build.MANUFACTURER));
        o.a(npa.a("MODEL", Build.MODEL));
        o.a(npa.a("PRODUCT", Build.PRODUCT));
        o.a(npa.a("RADIO", Build.RADIO));
        o.a(npa.a("TAGS", Build.TAGS));
        o.a(npa.a("TIME", Long.toString(Build.TIME)));
        o.a(npa.a("TYPE", Build.TYPE));
        o.a(npa.a("USER", Build.USER));
        o.a(npa.a("VERSION.CODENAME", Build.VERSION.CODENAME));
        o.a(npa.a("VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL));
        o.a(npa.a("VERSION.RELEASE", Build.VERSION.RELEASE));
        o.a(npa.a("VERSION.SDK", Build.VERSION.SDK));
        o.a(npa.a("VERSION.SDK_INT", Integer.toString(Build.VERSION.SDK_INT)));
        aucd o3 = lyl.c.o();
        lyd lyd5 = (lyd) o.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        lyl lyl = (lyl) o3.b;
        lyd5.getClass();
        lyl.b = lyd5;
        lyl.a |= 1;
        return ((lyl) o3.i()).k();
    }
}
