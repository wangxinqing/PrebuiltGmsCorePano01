package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: vdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdo {
    public final int a;
    public final uyg b;
    public final vdt c;
    public final uyq d;
    public final vdv e;
    public int f;
    private icm g;

    public vdo(int i, uyg uyg, vdt vdt, uyq uyq, vdv vdv, icm icm) {
        this.a = i;
        this.b = uyg;
        this.c = vdt;
        this.d = uyq;
        this.e = vdv;
        this.g = icm;
    }

    public static vdo a(uyq uyq, icm icm) {
        iva.a((Object) uyq);
        return new vdo(3, (uyg) null, (vdt) null, uyq, (vdv) null, icm);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.a;
        uyg uyg = this.b;
        String str4 = "";
        if (uyg != null) {
            String valueOf = String.valueOf(uyg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb.append(", publish=");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = str4;
        }
        vdt vdt = this.c;
        if (vdt != null) {
            String valueOf2 = String.valueOf(vdt);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb2.append(", unpublish=");
            sb2.append(valueOf2);
            str2 = sb2.toString();
        } else {
            str2 = str4;
        }
        uyq uyq = this.d;
        if (uyq != null) {
            String valueOf3 = String.valueOf(uyq);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
            sb3.append(", subscribe=");
            sb3.append(valueOf3);
            str3 = sb3.toString();
        } else {
            str3 = str4;
        }
        vdv vdv = this.e;
        if (vdv != null) {
            String valueOf4 = String.valueOf(vdv);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 14);
            sb4.append(", unsubscribe=");
            sb4.append(valueOf4);
            str4 = sb4.toString();
        }
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb5 = new StringBuilder(length + 40 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(valueOf5).length());
        sb5.append("Operation{opCode=");
        sb5.append(i);
        sb5.append(str);
        sb5.append(str2);
        sb5.append(str3);
        sb5.append(str4);
        sb5.append(", callback=");
        sb5.append(valueOf5);
        sb5.append('}');
        return sb5.toString();
    }

    public static vdo a(vdt vdt, icm icm) {
        iva.a((Object) vdt);
        return new vdo(2, (uyg) null, vdt, (uyq) null, (vdv) null, icm);
    }

    public final void b(int i) {
        Status status = new Status(i, (String) null);
        icm icm = this.g;
        if (icm == null) {
            jjg jjg = tgc.a;
            return;
        }
        icm.a(status);
        this.g = null;
        jjg jjg2 = tgc.a;
    }

    public static vdo a(vdv vdv, icm icm) {
        iva.a((Object) vdv);
        return new vdo(4, (uyg) null, (vdt) null, (uyq) null, vdv, icm);
    }

    public static boolean a(int i) {
        for (Integer intValue : vdn.a) {
            if (intValue.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i, int i2) {
        if (this.f != 5) {
            this.f = i;
            if (i != 0 && i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        i2 = 0;
                    } else {
                        ((anih) ((anih) tgc.a.b()).a("vdo", "a", 167, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown network status: %s", i);
                        return;
                    }
                }
                b(i2);
            }
        }
    }
}
