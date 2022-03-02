package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: xsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xsx {
    public final egm a;
    public final Context b;

    public xsx(Context context) {
        egm a2 = egj.a(context.getApplicationContext());
        this.b = context;
        this.a = a2;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, boolean z, int i) {
        acwa acwa;
        aqnk aqnk = (aqnk) aqnl.g.o();
        aucd o = aqnu.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnu aqnu = (aqnu) o.b;
        aqnu.b = 214;
        aqnu.a |= 1;
        aucd o2 = aqno.d.o();
        aucd o3 = aqoa.c.o();
        int i2 = !z ? 3 : 2;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqoa aqoa = (aqoa) o3.b;
        aqoa.b = i2 - 1;
        aqoa.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqno aqno = (aqno) o2.b;
        aqoa aqoa2 = (aqoa) o3.i();
        aqoa2.getClass();
        aqno.b = aqoa2;
        aqno.a |= 1;
        if (z && i == 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqno aqno2 = (aqno) o2.b;
            aqno2.a |= 2;
            aqno2.c = true;
        }
        aucd o4 = aqnv.f.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnv aqnv = (aqnv) o4.b;
        aqno aqno3 = (aqno) o2.i();
        aqno3.getClass();
        aqnv.d = aqno3;
        aqnv.a |= 32;
        aqnv aqnv2 = (aqnv) o4.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnu aqnu2 = (aqnu) o.b;
        aqnv2.getClass();
        aqnu2.c = aqnv2;
        aqnu2.a |= 2;
        if (aqnk.c) {
            aqnk.c();
            aqnk.c = false;
        }
        aqnl aqnl = (aqnl) aqnk.b;
        aqnu aqnu3 = (aqnu) o.i();
        aqnu3.getClass();
        aqnl.e = aqnu3;
        aqnl.a |= 4;
        aucd o5 = aqob.d.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqob aqob = (aqob) o5.b;
        aqob.b = 426;
        aqob.a |= 1;
        aucd o6 = aqnn.l.o();
        aqni aqni = (aqni) aqnj.b.o();
        aqni.a((int) R.string.people_backup_sync_activity_title);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn = (aqnn) o6.b;
        aqnj aqnj = (aqnj) aqni.i();
        aqnj.getClass();
        aqnn.b = aqnj;
        aqnn.a |= 1;
        aqni aqni2 = (aqni) aqnj.b.o();
        aqni2.a((int) R.string.people_backup_sync_information_banner);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn2 = (aqnn) o6.b;
        aqnj aqnj2 = (aqnj) aqni2.i();
        aqnj2.getClass();
        aqnn2.c = aqnj2;
        aqnn2.a |= 2;
        aqni aqni3 = (aqni) aqnj.b.o();
        aqni3.a((int) R.string.people_backup_sync_toggle_text);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn3 = (aqnn) o6.b;
        aqnj aqnj3 = (aqnj) aqni3.i();
        aqnj3.getClass();
        aqnn3.d = aqnj3;
        aqnn3.a |= 4;
        aqni aqni4 = (aqni) aqnj.b.o();
        aqni4.a((int) R.string.people_backup_sync_exclude_sources_banner);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn4 = (aqnn) o6.b;
        aqnj aqnj4 = (aqnj) aqni4.i();
        aqnj4.getClass();
        aqnn4.e = aqnj4;
        aqnn4.a |= 8;
        aqni aqni5 = (aqni) aqnj.b.o();
        aqni5.a((int) R.plurals.people_backup_sync_contacts_not_backed_up);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn5 = (aqnn) o6.b;
        aqnj aqnj5 = (aqnj) aqni5.i();
        aqnj5.getClass();
        aqnn5.g = aqnj5;
        aqnn5.a |= 32;
        aqni aqni6 = (aqni) aqnj.b.o();
        aqni6.a((int) R.string.people_select_account_for_backup);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn6 = (aqnn) o6.b;
        aqnj aqnj6 = (aqnj) aqni6.i();
        aqnj6.getClass();
        aqnn6.h = aqnj6;
        aqnn6.a |= 64;
        aqni aqni7 = (aqni) aqnj.b.o();
        aqni7.a((int) R.string.people_backup_sync_will_sync_button);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn7 = (aqnn) o6.b;
        aqnj aqnj7 = (aqnj) aqni7.i();
        aqnj7.getClass();
        aqnn7.i = aqnj7;
        aqnn7.a |= 128;
        aqni aqni8 = (aqni) aqnj.b.o();
        aqni8.a((int) R.string.people_backup_sync_account);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqnn aqnn8 = (aqnn) o6.b;
        aqnj aqnj8 = (aqnj) aqni8.i();
        aqnj8.getClass();
        aqnn8.j = aqnj8;
        aqnn8.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (ayqs.a.a().f()) {
            String d = ayqr.d();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aqnn aqnn9 = (aqnn) o6.b;
            d.getClass();
            aqnn9.a |= 512;
            aqnn9.k = d;
        } else {
            String f = ayqr.a.a().f();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aqnn aqnn10 = (aqnn) o6.b;
            f.getClass();
            aqnn10.a |= 16;
            aqnn10.f = f;
        }
        aucd o7 = aqny.e.o();
        if (o7.c) {
            o7.c();
            o7.c = false;
        }
        aqny aqny = (aqny) o7.b;
        aqnn aqnn11 = (aqnn) o6.i();
        aqnn11.getClass();
        aqny.d = aqnn11;
        aqny.a |= 2048;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqob aqob2 = (aqob) o5.b;
        aqny aqny2 = (aqny) o7.i();
        aqny2.getClass();
        aqob2.c = aqny2;
        aqob2.a |= 8;
        if (aqnk.c) {
            aqnk.c();
            aqnk.c = false;
        }
        aqnl aqnl2 = (aqnl) aqnk.b;
        aqob aqob3 = (aqob) o5.i();
        aqob3.getClass();
        aqnl2.f = aqob3;
        aqnl2.a |= 8;
        Context context = this.b;
        if (str != null) {
            acwd acwd = new acwd();
            new xsu(context, str, acwd).start();
            acwa = acwd.a;
        } else {
            acwa = acws.a((Object) null);
        }
        acwa.b(new xsw(this, aqnk, str)).a((acvp) new xsv(str, aqnk));
    }
}
