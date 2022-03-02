package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.SignatureException;
import java.util.ArrayList;

/* renamed from: gjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjz {
    public final gkm a;
    private final aurx b;

    public gjz(gkm gkm, aurx aurx) {
        amrl.a((Object) gkm);
        this.a = gkm;
        amrl.a((Object) aurx);
        this.b = aurx;
    }

    public final void a(byte[] bArr) {
        Account a2;
        try {
            try {
                gkt gkt = (gkt) aucj.a((aucj) gkt.h, this.b.b(bArr), aubs.c());
                gkm gkm = this.a;
                if ((gkt.a & 8) != 0) {
                    SourceChimeraActivity sourceChimeraActivity = gkm.b;
                    avow avow = gkt.e;
                    if (avow == null) {
                        avow = avow.d;
                    }
                    erv erv = new erv(gkm.b);
                    erk erk = new erk(sourceChimeraActivity);
                    aqdy aqdy = avow.b;
                    if (aqdy == null) {
                        aqdy = aqdy.b;
                    }
                    ArrayList arrayList = new ArrayList(aqdy.a.size());
                    for (int i = 0; i < aqdy.a.size(); i++) {
                        aqdi a3 = sourceChimeraActivity.a((aqdm) aqdy.a.get(i), erk, erv);
                        if (a3 == null) {
                            iwd iwd = SourceChimeraActivity.a;
                            String valueOf = String.valueOf(((aqdm) aqdy.a.get(i)).b);
                            iwd.e(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), new Object[0]);
                        } else {
                            arrayList.add(a3);
                        }
                    }
                    if (arrayList.size() == 0) {
                        SourceChimeraActivity.a.e("No assertion infos returned!", new Object[0]);
                        sourceChimeraActivity.a((int) R.string.common_something_went_wrong);
                        return;
                    }
                    aqdz aqdz = aqdz.a;
                    aqdr aqdr = (aqdr) aqds.j.o();
                    String c = awjm.c();
                    if (aqdr.c) {
                        aqdr.c();
                        aqdr.c = false;
                    }
                    aqds aqds = (aqds) aqdr.b;
                    c.getClass();
                    int i2 = aqds.a | 32;
                    aqds.a = i2;
                    aqds.g = c;
                    aqds.f = 3;
                    int i3 = i2 | 16;
                    aqds.a = i3;
                    aqds.c = 1;
                    int i4 = i3 | 1;
                    aqds.a = i4;
                    aqdz.getClass();
                    aqds.d = aqdz;
                    aqds.a = i4 | 2;
                    aqdr.a(arrayList);
                    aqds aqds2 = (aqds) aqdr.i();
                    aucd o = avoz.e.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avoz avoz = (avoz) o.b;
                    aqds2.getClass();
                    avoz.b = aqds2;
                    avoz.a |= 1;
                    String str = null;
                    if (!(Settings.Secure.getInt(sourceChimeraActivity.getContentResolver(), "backup_enabled", 0) == 0 || (a2 = new gsa(sourceChimeraActivity).a()) == null)) {
                        str = a2.name;
                    }
                    if (str != null) {
                        SourceChimeraActivity.a.c("Backup account found.", new Object[0]);
                        if (SourceChimeraActivity.a.a(3)) {
                            SourceChimeraActivity.a.b(str.length() == 0 ? new String("Backup enabled with account: ") : "Backup enabled with account: ".concat(str), new Object[0]);
                        }
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avoz avoz2 = (avoz) o.b;
                        str.getClass();
                        avoz2.a |= 2;
                        avoz2.c = str;
                    } else {
                        SourceChimeraActivity.a.c("Backup account not found.", new Object[0]);
                    }
                    String hexString = Long.toHexString(jhg.a((Context) sourceChimeraActivity));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avoz avoz3 = (avoz) o.b;
                    hexString.getClass();
                    avoz3.a |= 4;
                    avoz3.d = hexString;
                    aucd o2 = gkt.h.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    gkt.a((gkt) o2.b);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    gkt gkt2 = (gkt) o2.b;
                    avoz avoz4 = (avoz) o.i();
                    avoz4.getClass();
                    gkt2.f = avoz4;
                    gkt2.a |= 32;
                    try {
                        sourceChimeraActivity.s.a((gkt) o2.i());
                    } catch (IOException e) {
                        SourceChimeraActivity.a.a((Throwable) e);
                    }
                } else if (gkt.g.size() != 0) {
                    SourceChimeraActivity sourceChimeraActivity2 = gkm.b;
                    aucx aucx = gkt.g;
                    String str2 = gkm.a;
                    iwd iwd2 = SourceChimeraActivity.a;
                    sourceChimeraActivity2.runOnUiThread(new gkc(sourceChimeraActivity2, aucx, str2));
                    try {
                        sourceChimeraActivity2.s.a();
                    } catch (IOException e2) {
                        SourceChimeraActivity.a.a((Throwable) e2);
                    }
                    sourceChimeraActivity2.finish();
                }
            } catch (auda e3) {
                gkb.a.a((Throwable) e3);
            }
        } catch (SignatureException e4) {
            gkb.a.a((Throwable) e4);
        }
    }
}
