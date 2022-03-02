package defpackage;

import android.accounts.Account;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;
import java.util.Map;

/* renamed from: adtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adtj implements acvp {
    final /* synthetic */ Account a;
    final /* synthetic */ Map b;
    final /* synthetic */ List c;
    final /* synthetic */ aupo d;
    final /* synthetic */ adsp e;
    final /* synthetic */ adtk f;
    final /* synthetic */ aucd g;

    public adtj(adtk adtk, Account account, aucd aucd, Map map, List list, aupo aupo, adsp adsp) {
        this.f = adtk;
        this.a = account;
        this.g = aucd;
        this.b = map;
        this.c = list;
        this.d = aupo;
        this.e = adsp;
    }

    public final void a(acwa acwa) {
        aucd aucd = this.g;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avvt avvt = (avvt) aucd.b;
        avvt avvt2 = avvt.l;
        int i = avvt.a & -65;
        avvt.a = i;
        avvt.h = 0;
        int i2 = i & -33;
        avvt.a = i2;
        avvt.g = 0;
        int i3 = i2 & -17;
        avvt.a = i3;
        avvt.f = 0;
        int i4 = i3 & -9;
        avvt.a = i4;
        avvt.e = 0;
        avvt.a = i4 & -257;
        avvt.j = 0;
        int b2 = this.f.b.b(this.a.name);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avvt avvt3 = (avvt) aucd.b;
        avvt3.j = b2 - 1;
        avvt3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (acwa.b()) {
            for (UdcCacheResponse.UdcSetting udcSetting : ((UdcCacheResponse) acwa.d()).a) {
                int i5 = udcSetting.b;
                int i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 2;
                }
                switch (udcSetting.a) {
                    case 7:
                        aucd aucd2 = this.g;
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        avvt avvt4 = (avvt) aucd2.b;
                        avvt4.g = i6 - 1;
                        avvt4.a |= 32;
                        break;
                    case 8:
                        aucd aucd3 = this.g;
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        avvt avvt5 = (avvt) aucd3.b;
                        avvt5.e = i6 - 1;
                        avvt5.a |= 8;
                        break;
                    case 9:
                        aucd aucd4 = this.g;
                        if (aucd4.c) {
                            aucd4.c();
                            aucd4.c = false;
                        }
                        avvt avvt6 = (avvt) aucd4.b;
                        avvt6.h = i6 - 1;
                        avvt6.a |= 64;
                        break;
                    case 10:
                        aucd aucd5 = this.g;
                        if (aucd5.c) {
                            aucd5.c();
                            aucd5.c = false;
                        }
                        avvt avvt7 = (avvt) aucd5.b;
                        avvt7.f = i6 - 1;
                        avvt7.a |= 16;
                        break;
                }
            }
        }
        this.b.put(this.a.name, (avvt) this.g.i());
        if (this.b.size() == this.c.size()) {
            adtk.a(this.b, this.d, this.e);
        }
    }
}
