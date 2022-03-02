package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: mhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhf extends mhh {
    private final mfr b;
    private final Contact c;
    private final boolean d;
    private final String e;
    private final mfp f;

    public mhf(Context context, mfp mfp, mfr mfr, Contact contact, boolean z, String str) {
        super(context);
        this.b = mfr;
        this.c = contact;
        this.d = z;
        this.e = str;
        this.f = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        if (!this.d) {
            i = 4;
        } else {
            i = 3;
        }
        try {
            Contact contact = this.c;
            String str = this.e;
            aucd o = apjv.l.o();
            aucd o2 = apjx.d.o();
            String str2 = contact.a;
            if (str2 != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                apjx apjx = (apjx) o2.b;
                str2.getClass();
                apjx.a |= 2;
                apjx.c = str2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjv apjv = (apjv) o.b;
            apjx apjx2 = (apjx) o2.i();
            apjx2.getClass();
            apjv.c = apjx2;
            apjv.a |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            apjv apjv2 = (apjv) o.b;
            apjv2.i = i - 1;
            apjv2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            String str3 = contact.f;
            String valueOf = String.valueOf(o);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(str3).length());
            sb.append("Invitation proto: ");
            sb.append(valueOf);
            sb.append("inviteId: ");
            sb.append(str3);
            sb.toString();
            ith ith = mfv.a;
            aucd o3 = apkv.e.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            apkv apkv = (apkv) o3.b;
            apjv apjv3 = (apjv) o.i();
            apjv3.getClass();
            apkv.d = apjv3;
            apkv.a = 4 | apkv.a;
            apgv a = mgg.a(getContext(), this.b, this.f);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            apkv apkv2 = (apkv) o3.b;
            a.getClass();
            apkv2.b = a;
            int i2 = apkv2.a | 1;
            apkv2.a = i2;
            if (str3 != null) {
                str3.getClass();
                apkv2.a = i2 | 2;
                apkv2.c = str3;
            }
            try {
                mhp a2 = mgk.a();
                ClientContext a3 = mgk.a(str);
                apkv apkv3 = (apkv) o3.i();
                if (mhp.n == null) {
                    mhp.n = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/UpdateInvitation", baoq.a(apkv.e), baoq.a(apkw.b));
                }
                apkw apkw = (apkw) a2.a.a(mhp.n, a3, apkv3, (long) mhp.b, TimeUnit.MILLISECONDS);
                mfr mfr = this.b;
                apgw apgw = apkw.a;
                if (apgw == null) {
                    apgw = apgw.c;
                }
                mgg.a(mfr, apgw);
                return apkw;
            } catch (babk e2) {
                e = e2;
                throw new mgf(e.getMessage(), e);
            } catch (eif e3) {
                e = e3;
                throw new mgf(e.getMessage(), e);
            }
        } catch (mgf e4) {
            String valueOf2 = String.valueOf(e4.getMessage());
            if (valueOf2.length() == 0) {
                new String("Error updatingInvitationStatus: ");
            } else {
                "Error updatingInvitationStatus: ".concat(valueOf2);
            }
            ith ith2 = mfv.a;
            return null;
        }
    }
}
