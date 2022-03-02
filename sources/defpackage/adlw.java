package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.view.WindowManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adlw extends adlq {
    public static final iwd e = adnt.e("AbRebootAction");
    public static final adro f = new adro("file_path", "");
    public static final adro g = new adro("payload_metadata_file_path", "");
    private static final adro k = new adro("installation_success_message", "");
    private static final adro l = new adro("installation_failure_message", "");
    private static final adrk m = new adrk("boot_token", -1L);
    private static final adra n = new adra("reboot_prepared", false);
    public final Context h;
    public final PowerManager i;
    public final adla j = ((adla) adla.h.b());
    private final WindowManager o = ((WindowManager) this.h.getSystemService("window"));
    private final adrn p = ((adrn) adrn.a.b());
    private final adkt q = ((adkt) adkt.e.b());

    public adlw(Context context, adre adre) {
        super("ab-reboot", adre);
        this.h = context;
        this.i = (PowerManager) context.getSystemService("power");
    }

    private final void a(boolean z) {
        adqq adqq;
        amri amri = (amri) this.p.b(adls.h);
        if (amri.a()) {
            if (amrk.a((String) a(g))) {
                adqq = (adqq) amri.b();
            } else {
                adqq adqq2 = (adqq) amri.b();
                File file = new File((String) a(g));
                aucd aucd = (aucd) adqq2.c(5);
                aucd.a((aucj) adqq2);
                String valueOf = String.valueOf(file.getAbsolutePath());
                String str = valueOf.length() == 0 ? new String("file://") : "file://".concat(valueOf);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                adqq adqq3 = adqq.d;
                str.getClass();
                ((adqq) aucd.b).a = str;
                adqr adqr = adqq2.c;
                if (adqr == null) {
                    adqr = adqr.d;
                }
                aucd aucd2 = (aucd) adqr.c(5);
                aucd2.a((aucj) adqr);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                ((adqr) aucd2.b).b = 0;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                adqr adqr2 = (adqr) aucd2.i();
                adqr2.getClass();
                ((adqq) aucd.b).c = adqr2;
                adqq = (adqq) aucd.i();
            }
            adnn a = adnn.a();
            try {
                a.b();
                ArrayList arrayList = new ArrayList();
                anhk i2 = admx.a(this.h).listIterator();
                while (i2.hasNext()) {
                    oq oqVar = (oq) i2.next();
                    String str2 = (String) oqVar.a;
                    String str3 = (String) oqVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                    arrayList.add(sb.toString());
                }
                if (((Boolean) a.c.b(adls.m)).booleanValue() != z) {
                    if (z) {
                        amzt j2 = amzy.j();
                        j2.c("RUN_POST_INSTALL=0");
                        j2.b((Iterable) arrayList);
                        a.a(adqq, (List) j2.a());
                    } else {
                        a.e();
                    }
                }
            } catch (InterruptedException e2) {
                e.c("Error when calling SynchronizedUpdateEngine.setSwitchSlotOnReboot().", e2, new Object[0]);
            } catch (Throwable th) {
                a.c();
                throw th;
            }
            a.c();
        }
    }

    private final boolean e() {
        return ((Boolean) a(n)).booleanValue() && ((Long) a(m)).longValue() != this.q.d();
    }

    public final adll c() {
        adqw a = admx.a();
        if (ayox.b() && adkb.b(a) && !e()) {
            e.c("Bypassing the self-update check.", new Object[0]);
        } else if (adkb.b(a)) {
            if (!((String) a(k)).isEmpty()) {
                this.h.startActivity(adkk.a((String) a(k)));
            }
            this.j.a(5, -1.0d);
            return new adll("finished-execution", adre.a(new adrc[0]));
        }
        if (e() && !adkb.b(a)) {
            this.j.a(1298, -1.0d);
            if (!((String) a(l)).isEmpty()) {
                this.h.startActivity(adkk.a((String) a(l)));
            }
            return new adll("finished-execution", adre.a(new adrc[0]));
        } else if (!adkb.a(a) || !jkr.d()) {
            SystemUpdateStatus d = this.j.d();
            if (!amrk.a(d.a)) {
                if (!d.j) {
                    if (adki.a(this.h, d, true)) {
                        this.j.a(528, -1.0d);
                        a(true);
                        adrd b = a().b();
                        b.a(m, Long.valueOf(this.q.d()));
                        b.a(k, (String) adke.e.a());
                        b.a(l, (String) adke.f.a());
                        b.a(n, true);
                        return new adll("ab-reboot", b.a(), (byte[]) null);
                    } else if (adki.b(this.h, d, true)) {
                        this.j.a(272, -1.0d);
                        a(false);
                        adrd b2 = a().b();
                        b2.a(m, Long.valueOf(this.q.d()));
                        b2.a(n, false);
                        return new adll("ab-reboot", b2.a(), (byte[]) null);
                    }
                }
                StringBuilder sb = new StringBuilder("reboot-ab-update");
                if (ayox.a.a().k() && this.o.getDefaultDisplay().getState() != 2) {
                    sb.append(",quiescent");
                }
                int i2 = this.j.d().c;
                this.j.a(784, -1.0d);
                a(true);
                if (!adka.b(this.h) || !adjw.g(this.h) || !this.q.f()) {
                    adrd b3 = a().b();
                    b3.a(m, Long.valueOf(this.q.d()));
                    b3.a(k, (String) adke.e.a());
                    b3.a(l, (String) adke.f.a());
                    b3.a(n, true);
                    return new adll("ab-reboot", b3.a(), true, new adlu(this, sb));
                }
                adrd b4 = a().b();
                b4.a(m, Long.valueOf(this.q.d()));
                b4.a(k, (String) adke.e.a());
                b4.a(l, (String) adke.f.a());
                b4.a(n, true);
                return new adll("ab-reboot", b4.a(), true, new adlt(this, sb, i2));
            }
            this.j.a(0, -1.0d);
            return new adll("finished-execution", adre.a(new adrc[0]));
        } else {
            this.j.a(784, -1.0d);
            adrd b5 = a().b();
            b5.a(m, Long.valueOf(this.q.d()));
            b5.a(n, false);
            return new adll("ab-reboot", b5.a(), true, new adlv(this));
        }
    }
}
