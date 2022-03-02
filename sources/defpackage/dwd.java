package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: dwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwd {
    private final dkh a;

    public dwd(Context context) {
        this.a = dkh.a(context);
    }

    public static final void a(dlc dlc, avga avga) {
        String str;
        int i;
        if (avga != null && (avga.a & 1) != 0) {
            avft avft = avga.b;
            if (avft == null) {
                avft = avft.c;
            }
            avfv avfv = avft.a;
            if (avfv == null) {
                avfv = avfv.c;
            }
            if (!avfv.b.isEmpty()) {
                avft avft2 = avga.b;
                if (avft2 == null) {
                    avft2 = avft.c;
                }
                avfv avfv2 = avft2.a;
                if (avfv2 == null) {
                    avfv2 = avfv.c;
                }
                a(dlc, avfv2.b);
                avft avft3 = avga.b;
                if (avft3 == null) {
                    avft3 = avft.c;
                }
                aucx aucx = avft3.b;
                for (int i2 = 0; i2 < aucx.size(); i2++) {
                    String str2 = ((avfu) aucx.get(i2)).b;
                    String str3 = ((avfu) aucx.get(i2)).c;
                    String str4 = ((avfu) aucx.get(i2)).d;
                    Long valueOf = (((avfu) aucx.get(i2)).a & 8) != 0 ? Long.valueOf(((avfu) aucx.get(i2)).e) : null;
                    aucx aucx2 = ((avfu) aucx.get(i2)).f;
                    dlc.q();
                    if (TextUtils.isEmpty("&tid") || !dlc.a.containsKey("&tid")) {
                        str = null;
                    } else {
                        str = (String) dlc.a.get("&tid");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        dkj dkj = new dkj((byte[]) null);
                        if (!TextUtils.isEmpty(str2)) {
                            dkj.c(str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            dkj.b(str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            dkj.d(str4);
                        }
                        if (valueOf != null) {
                            dkj.a(valueOf.longValue());
                        }
                        if (aucx2 != null) {
                            i = aucx2.size();
                        } else {
                            i = 0;
                        }
                        for (int i3 = 0; i3 < i; i3++) {
                            dkj.a(((avfs) aucx2.get(i3)).a, ((avfs) aucx2.get(i3)).b);
                        }
                        dlc.a(dkj.a());
                    }
                }
            }
        }
    }

    public static final void a(dlc dlc, String str) {
        if (!TextUtils.isEmpty(str)) {
            dlc.a("&tid", str);
        }
    }

    public final dlc a() {
        dlc a2 = this.a.a((String) null);
        a2.a("&sf", Double.toString(awhr.a.a().a()));
        return a2;
    }
}
