package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: mai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mai {
    public final aucd a;

    public mai(String str) {
        String str2;
        String str3 = "";
        aucd o = lyd.p.o();
        this.a = o;
        aucd o2 = lyj.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        lyj lyj = (lyj) o2.b;
        str.getClass();
        lyj.a |= 1;
        lyj.b = str;
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyd lyd = (lyd) o.b;
        lyj lyj2 = (lyj) o2.i();
        lyj2.getClass();
        lyd.b = lyj2;
        lyd.a |= 1;
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        lyd.a((lyd) aucd.b);
        aucd aucd2 = this.a;
        try {
            str2 = System.getProperty("os.arch");
        } catch (Exception e) {
            str2 = str3;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        lyd lyd2 = (lyd) aucd2.b;
        str2.getClass();
        lyd2.a |= 2;
        lyd2.d = str2;
        aucd aucd3 = this.a;
        aucd3.a(a("BOARD", Build.BOARD));
        aucd3.a(a("BOOTLOADER", Build.BOOTLOADER));
        aucd3.a(a("BRAND", Build.BRAND));
        aucd3.a(a("CPU_ABI", Build.CPU_ABI));
        aucd3.a(a("CPU_ABI2", Build.CPU_ABI2));
        try {
            str3 = TextUtils.join(",", (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null));
        } catch (Exception e2) {
        }
        aucd3.a(a("SUPPORTED_ABIS", str3));
        aucd3.a(a("DEVICE", Build.DEVICE));
        aucd3.a(a("DISPLAY", Build.DISPLAY));
        aucd3.a(a("FINGERPRINT", Build.FINGERPRINT));
        aucd3.a(a("HARDWARE", Build.HARDWARE));
        aucd3.a(a("HOST", Build.HOST));
        aucd3.a(a("ID", Build.ID));
        aucd3.a(a("MANUFACTURER", Build.MANUFACTURER));
        aucd3.a(a("MODEL", Build.MODEL));
        aucd3.a(a("PRODUCT", Build.PRODUCT));
        aucd3.a(a("RADIO", Build.RADIO));
        aucd3.a(a("SERIAL", jhg.g()));
        aucd3.a(a("TAGS", Build.TAGS));
        aucd3.a(a("TIME", Long.toString(Build.TIME)));
        aucd3.a(a("TYPE", Build.TYPE));
        aucd3.a(a("USER", Build.USER));
        aucd3.a(a("VERSION.CODENAME", Build.VERSION.CODENAME));
        aucd3.a(a("VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL));
        aucd3.a(a("VERSION.RELEASE", Build.VERSION.RELEASE));
        aucd3.a(a("VERSION.SDK", Build.VERSION.SDK));
        aucd3.a(a("VERSION.SDK_INT", Integer.toString(Build.VERSION.SDK_INT)));
    }

    private static final lyf a(String str, String str2) {
        aucd o = lyf.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyf lyf = (lyf) o.b;
        str.getClass();
        int i = lyf.a | 1;
        lyf.a = i;
        lyf.b = str;
        str2.getClass();
        lyf.a = i | 2;
        lyf.c = str2;
        return (lyf) o.i();
    }

    public final lyd a() {
        return (lyd) this.a.i();
    }

    public final void a(mbi mbi) {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        lyd lyd = lyd.p;
        ((lyd) aucd.b).i = aucj.s();
        mbe mbe = mbi.c;
        ArrayList arrayList = new ArrayList();
        for (String str : mbe.b(mbe.a).list()) {
            if (mbe.a(str).b()) {
                arrayList.add(new mbh(str));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                this.a.c(auay.a(jhg.a(((mbh) arrayList.get(i)).a)));
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
