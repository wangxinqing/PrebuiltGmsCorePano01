package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: vts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vts extends iby {
    public static final /* synthetic */ int a = 0;
    private static final ibq b = new ibq("Nearby.SHARING_API", new vtn(), new ibg());

    public vts(Context context) {
        super(context, b, (ibm) null, ibx.a);
    }

    public static ifu b(acwd acwd) {
        return new vtl(acwd);
    }

    public static ifu c(acwd acwd) {
        return new vtm(acwd);
    }

    public final acwa a() {
        iha b2 = ihb.b();
        b2.a = new vtd();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final void d(ShareTarget shareTarget) {
        iha b2 = ihb.b();
        b2.a = new vst(shareTarget);
        b2.b = new Feature[]{tcm.a};
        b(b2.a());
    }

    public final acwa p() {
        iha b2 = ihb.b();
        b2.a = new vtf();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final acwa q() {
        iha b2 = ihb.b();
        b2.a = new vth();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final acwa r() {
        iha b2 = ihb.b();
        b2.a = new vtj();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final acwa s() {
        iha b2 = ihb.b();
        b2.a = new vsm();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final acwa t() {
        iha b2 = ihb.b();
        b2.a = new vtb();
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final acwa b(boolean z) {
        iha b2 = ihb.b();
        b2.a = new vte(z);
        b2.b = new Feature[]{tcm.a};
        return b(b2.a());
    }

    public final void c(ShareTarget shareTarget) {
        iha b2 = ihb.b();
        b2.a = new vsv(shareTarget);
        b2.b = new Feature[]{tcm.a};
        b(b2.a());
    }

    public final acwa a(int i, int i2, ContactFilter contactFilter) {
        iha b2 = ihb.b();
        b2.a = new vsw(i, i2, contactFilter);
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final void b(Account account) {
        iha b2 = ihb.b();
        b2.a = new vta(account);
        b2.b = new Feature[]{tcm.a};
        b(b2.a());
    }

    public final acwa a(ContactFilter contactFilter) {
        iha b2 = ihb.b();
        b2.a = new vsx(contactFilter);
        b2.b = new Feature[]{tcm.a};
        return a(b2.a());
    }

    public final void b(ShareTarget shareTarget) {
        iha b2 = ihb.b();
        b2.a = new vsu(shareTarget);
        b2.b = new Feature[]{tcm.a};
        b(b2.a());
    }

    public final acwa a(ShareTarget shareTarget) {
        iha b2 = ihb.b();
        b2.a = new vss(shareTarget);
        b2.b = new Feature[]{tcm.a};
        return b(b2.a());
    }

    public final void b(vtx vtx) {
        String valueOf = String.valueOf(vtx.class.getName());
        a(igf.a(vtx, valueOf.length() == 0 ? new String("SendSurface") : "SendSurface".concat(valueOf)));
    }

    public final acwa a(CharSequence charSequence) {
        iha b2 = ihb.b();
        b2.a = new vsl(charSequence);
        b2.b = new Feature[]{tcm.a};
        return b(b2.a());
    }

    public final void a(int i) {
        iha b2 = ihb.b();
        b2.a = new vti(i);
        b2.b = new Feature[]{tcm.a};
        b(b2.a());
    }

    public final void a(vtx vtx) {
        String valueOf = String.valueOf(vtx.class.getName());
        a(igf.a(vtx, valueOf.length() == 0 ? new String("ReceiveSurface") : "ReceiveSurface".concat(valueOf)));
    }

    public final void a(vtx vtx, int i) {
        String valueOf = String.valueOf(vtx.class.getName());
        ige a2 = a((Object) vtx, valueOf.length() == 0 ? new String("ReceiveSurface") : "ReceiveSurface".concat(valueOf));
        wbb wbb = new wbb(a2);
        vsp vsp = new vsp(wbb, i);
        vsq vsq = new vsq(wbb);
        ign a3 = igo.a();
        a3.a = vsp;
        a3.b = vsq;
        a3.c = a2;
        a3.d = new Feature[]{tcm.a};
        a(a3.a());
    }

    public final void a(vtx vtx, vsh vsh, int i) {
        vxi vxi = new vxi(a((Object) vsh, vsh.class.getName()));
        String valueOf = String.valueOf(vtx.class.getName());
        ige a2 = a((Object) vtx, valueOf.length() == 0 ? new String("SendSurface") : "SendSurface".concat(valueOf));
        wbb wbb = new wbb(a2);
        vsn vsn = new vsn(wbb, vxi, i);
        vso vso = new vso(wbb, vxi);
        ign a3 = igo.a();
        a3.a = vsn;
        a3.b = vso;
        a3.c = a2;
        a3.d = new Feature[]{tcm.a};
        a(a3.a());
    }
}
