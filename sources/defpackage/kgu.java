package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgu extends key {
    private final SetFileUploadPreferencesRequest f;

    public kgu(kec kec, SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, kwg kwg) {
        super("SetFileUploadPreferencesOperation", kec, kwg, 19);
        this.f = setFileUploadPreferencesRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    /* JADX INFO: finally extract failed */
    public final void b(Context context) {
        boolean z;
        njc.a((Object) this.f, "Invalid request: unable to update preferences.");
        njc.a((Object) this.f.a, "Invalid request: unable to update preferences.");
        lfq lfq = this.c;
        FileUploadPreferencesImpl fileUploadPreferencesImpl = this.f.a;
        lgc lgc = (lgc) lfq;
        lgc.k();
        if ((((ambk) lgc.e.b).a & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setPreferenceChange() twice");
        aucd o = amaz.e.o();
        int b = fileUploadPreferencesImpl.b();
        if (b == 256) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz = (amaz) o.b;
            amaz.c = 1;
            amaz.a |= 2;
        } else if (b != 257) {
            lgc.a.b("ImpressionLogEvent", "Unknown battery usage preference (%d) in %s", Integer.valueOf(fileUploadPreferencesImpl.b()), lgc.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz2 = (amaz) o.b;
            amaz2.c = 0;
            amaz2.a |= 2;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz3 = (amaz) o.b;
            amaz3.c = 2;
            amaz3.a |= 2;
        }
        int a = fileUploadPreferencesImpl.a();
        if (a == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz4 = (amaz) o.b;
            amaz4.b = 1;
            amaz4.a = 1 | amaz4.a;
        } else if (a != 2) {
            lgc.a.b("ImpressionLogEvent", "Unknown data connection preference (%d) in %s", Integer.valueOf(fileUploadPreferencesImpl.a()), lgc.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz5 = (amaz) o.b;
            amaz5.b = 0;
            amaz5.a = 1 | amaz5.a;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            amaz amaz6 = (amaz) o.b;
            amaz6.b = 2;
            amaz6.a = 1 | amaz6.a;
        }
        aucd aucd = lgc.e;
        boolean z2 = fileUploadPreferencesImpl.c;
        amaz amaz7 = (amaz) o.b;
        amaz7.a |= 4;
        amaz7.d = z2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amaz amaz8 = (amaz) o.i();
        ambk ambk2 = ambk.K;
        amaz8.getClass();
        ambk.m = amaz8;
        ambk.a |= 1024;
        kec kec = this.a;
        FileUploadPreferencesImpl fileUploadPreferencesImpl2 = this.f.a;
        int a2 = fileUploadPreferencesImpl2.a();
        boolean z3 = fileUploadPreferencesImpl2.c;
        int b2 = fileUploadPreferencesImpl2.b();
        kaa kaa = new kaa();
        kaa.b = a2;
        kaa.c = z3;
        kaa.d = b2;
        jzy a3 = kaa.a();
        kew kew = kec.c.C;
        khq khq = kec.d;
        kex kex = (kex) kew;
        kex.b.d();
        try {
            klf b3 = ((kex) kew).b.b(khq);
            iva.a((Object) b3, (Object) "Authorized app doesn't exist");
            int i = ((jzz) a3).a;
            int i2 = ((jzz) a3).c;
            if (i != 0) {
                b3.c = i;
            }
            if (i2 != 0) {
                b3.d = i2;
            }
            b3.e = ((jzz) a3).b;
            b3.t();
            ((kex) kew).b.f();
            kex.b.e();
            ArrayList arrayList = new ArrayList();
            synchronized (kex.c) {
                Set set = (Set) ((kex) kew).c.get(khq);
                if (set != null) {
                    arrayList.addAll(set);
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((lhd) arrayList.get(i3)).a(a3);
            }
            kec.g.b();
            this.b.b();
        } catch (Throwable th) {
            kex.b.e();
            throw th;
        }
    }
}
